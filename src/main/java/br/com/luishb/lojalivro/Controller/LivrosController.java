package br.com.luishb.lojalivro.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import br.com.luishb.lojalivro.Model.Livro;
import br.com.luishb.lojalivro.Repository.LivrosRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RestController
public class LivrosController {
    
    @Autowired
    LivrosRepository livrosRepository;

    @GetMapping("/livros-list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("/livros-list");
        mv.addObject("livros", livrosRepository.findAll());
        return mv ;
    }

    @PostMapping("/livros-add")
    public ModelAndView create(@RequestBody Livro livro) {
        ModelAndView mv = new ModelAndView("livros-add");
        livrosRepository.save(livro);
        mv.setViewName("redirect:/livros-list");
        return mv;
    }
    

}
