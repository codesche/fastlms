package com.zerobase.fastlms.main.controller;


import com.zerobase.fastlms.banner.dto.BannerDto;
import com.zerobase.fastlms.banner.service.impl.BannerService;
import com.zerobase.fastlms.components.MailComponents;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;

    private final BannerService bannerService;

    @RequestMapping("/")
    public String index(Model model) {

        List<BannerDto> list = bannerService.indexBannerList();
        model.addAttribute("list", list);

        return "index";
    }


    @RequestMapping("/error/denied")
    public String errorDenied() {

        return "error/denied";
    }

}
