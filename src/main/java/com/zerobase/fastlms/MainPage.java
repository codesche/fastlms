package com.zerobase.fastlms;

// MainPage 클래스를 만드는 목적!!
// 매핑하기 위해서..
// 주소(논리적인주소-인터넷주소) 물리적인 파일(프로그래밍을 해야 하니까) 매핑

// http://www.naver.com/new/list.do
// 하나의 주소에 대해서
// 어디서 매핑?
// 후보군? 클래스, 속성, 메소드
// 메소드를 통해 주소를 매핑

// http://localhost:8080/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

    @RequestMapping("/")
    public String index() {
        return "Index Page";
    }

    @RequestMapping("/hello")
    public String Hello() {

        String msg = "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "<p>hello</p> <p>fastlms website!!!</p>" +
                "</body>" +
                "</html>";

        return msg;
    }
}
