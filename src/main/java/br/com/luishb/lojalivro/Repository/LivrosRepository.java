package br.com.luishb.lojalivro.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.luishb.lojalivro.Model.Livro;

public interface LivrosRepository extends CrudRepository<Livro,Integer>{
    
}
