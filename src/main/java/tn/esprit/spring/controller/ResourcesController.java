package tn.esprit.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Resources;
import tn.esprit.spring.service.ResourcesService;

@RestController

public class ResourcesController {
	@Autowired
	ResourcesService ResourcesService;
	@GetMapping("/retrieve-all-resources")
	@ResponseBody
	public List<Resources> retriveAllresources() {
	List<Resources> list = ResourcesService.retriveAllresources();
	return list;
	}
	@PostMapping("/add-resources")
	@ResponseBody
	public Resources addResources(@RequestBody Resources r) {

	Resources resources = ResourcesService.addresources(r);

	return resources;
	}

	@DeleteMapping("/delete-resources/{cin}")
	@ResponseBody
	public void deleteResources(@PathVariable("cin") Long cin) {
	ResourcesService.deleteResources(cin);
	}
	
	@PutMapping("/modify-Resources")
	@ResponseBody
	public Resources updateResource(@RequestBody Resources resources) {
	return ResourcesService.updateResources(resources);
	}
	
	@GetMapping("/retrieve-Resources/{cin}")
	@ResponseBody
	public Optional<Resources> getResources(@PathVariable("cin") Long cin) {
	 return ResourcesService.retrieveResources(cin);
	}
	
}
