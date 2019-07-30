package br.edu.ifal.formulariojs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controlador{
    
    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("form.html");
    }

    @RequestMapping("/form")
    public ModelAndView cadastro(String nome, String email, String cpf, String campoSexo, String modulo, String areas, String senha, String repetirSenha , String concluir){
        ModelAndView resposta = new ModelAndView("form.html");
        resposta.addObject( "nome", nome);
        resposta.addObject( "email", email);
        resposta.addObject( "cpf", cpf);
        resposta.addObject( "sexo", campoSexo);
        resposta.addObject( "modulo", modulo);
        resposta.addObject( "areas", areas);
        resposta.addObject("concluir", concluir="Cadastro Concluído");
            System.out.println("CHEGOU AQUI!!!");

        return resposta;
    }
}