package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkBookController {


    @GetMapping("/")
    public String getForm(Model model) {
        return "sign-up";
    }

    @GetMapping("/result")
    public String getResult() {
        return "result";
    }
}