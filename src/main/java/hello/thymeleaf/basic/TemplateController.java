package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {

    @GetMapping("/fragment")
    public String template() {
        return "template/fragment/fragmentMain";
    }

    @GetMapping("/layout") // <head> 정보만 바꾸는 것임
    public String layout() {
        return "template/layout/layoutMain";
    }

    @GetMapping("/layoutExtend") // extend는 <html>을 바꾸는 것이다.
    public String layoutExtend() {
        return "template/layoutExtend/layoutExtendMain";
    }


}
