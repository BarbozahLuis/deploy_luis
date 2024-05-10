package br.com.luishb.lojalivro.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.com.luishb.lojalivro.Model.Livro;
import br.com.luishb.lojalivro.Repository.LivroRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RestController
public class LivrosController {
    
    @Autowired
    LivroRepository livrosRepository;

    @GetMapping("/livros")
    public List<Livro> list() {
        return (List<Livro>) this.livrosRepository.findAll();
    }

    @PostMapping("/livros")
    public Livro create(@RequestBody Livro livro){
        return this.livrosRepository.save(livro);
    }
    

}
