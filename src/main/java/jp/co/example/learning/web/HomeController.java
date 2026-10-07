package jp.co.example.learning.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/** 🏠 学習サイトの入口画面を担当します。 */
@Controller
public class HomeController {
    @GetMapping({"/", "/home"})
    public String home(Model model) {
        model.addAttribute("pageTitle", "Java 学習支援サイト");
        model.addAttribute("skeletonMessage", "学習コンテンツ機能はこれから実装します。");
        return "home";
    }
}
