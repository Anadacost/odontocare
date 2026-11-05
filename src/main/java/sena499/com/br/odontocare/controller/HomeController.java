package sena499.com.br.odontocare.controller;

import sena499.com.br.odontocare.dto.ClienteCadastroDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/servicos")
    public String servicos() {
        return "servicos";
    }

    @GetMapping("/cadastro")
    public String cadastro(Model model) {

        model.addAttribute("clienteCadastro", new ClienteCadastroDTO());

        return "cadastro";
    }
    @GetMapping("/recuperar-senha")
    public String recuperarSenha() {
        return "recuperar-senha";
    }
}
