package br.com.devsuperior.umlspring.resources;

import br.com.devsuperior.umlspring.dto.CategoriaDTO;
import br.com.devsuperior.umlspring.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<Page<CategoriaDTO>> findAll(@PageableDefault(size=12, sort="{name}")Pageable pageable){
         Page<CategoriaDTO> cat = categoriaService.findAll(pageable);
        return ResponseEntity.ok().body(cat);
    }
}
