package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entity.Resources;

public interface ResourcesService {
	 public List<Resources> retriveAllresources();
	 public Resources addresources(Resources r);
	 public void deleteResources(Long cin);
	 public Resources updateResources(Resources r);
	 public Optional<Resources> retrieveResources(Long cin);
}
