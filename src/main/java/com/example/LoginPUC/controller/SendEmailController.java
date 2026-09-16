package com.example.LoginPUC.controller;

import com.example.LoginPUC.service.SendEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/email")
public class SendEmailController {

    private final SendEmailService sendEmailService;

    public SendEmailController(SendEmailService sendEmailService) {
        this.sendEmailService = sendEmailService;
    }

    @PostMapping("/send")
    public String sendEmail(@RequestParam("email") String email) {

        System.out.println("=================================");
        System.out.println("ENTROU NO CONTROLLER");
        System.out.println("EMAIL: " + email);
        System.out.println("=================================");

        sendEmailService.sendEmail(
                email,
                "Recuperação de senha",
                "Teste de recuperação de senha."
        );

        return "redirect:/login";
    }
}
