package com.example.rest.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.model.Animal;
import com.example.rest.model.RequestTrace;
import com.example.rest.repository.AnimalRepository;
import com.example.rest.repository.RequestTraceRepository;
import com.example.rest.util.AnimalNotFoundException;

@RestController
@CrossOrigin()
@RequestMapping("api/bird")
public class AnimalController {
	
    @Autowired
    private RequestTraceRepository requestTraceRepos;
    
    @Autowired
    private AnimalRepository animalRepos;
    
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public RequestTrace create(@Validated @RequestBody HttpServletRequest request) { 
		RequestTrace requestTrace = new RequestTrace();
		requestTrace.setUrl(request.getRequestURI());
		return requestTraceRepos.save(requestTrace);
	}
    
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@Validated @RequestBody Animal request) { 
		animalRepos.save(request);
	}
	
	@GetMapping("/{id}")
	public Animal read(@PathVariable Long id) {
		return animalRepos.findById(id)
                .orElseThrow(() -> new AnimalNotFoundException(id));
	}
	
	@PutMapping("/{id}")
	public Optional<Animal> update(@RequestBody Animal request, @PathVariable Long id) { 
		return animalRepos.findById(id)
                .map(x -> {
                    x.setName(request.getName());
                    return animalRepos.save(x);
                });
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) { 
		animalRepos.deleteById(id);
		
	}
	
}
