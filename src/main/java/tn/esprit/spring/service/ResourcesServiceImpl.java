package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Resources;
import tn.esprit.spring.repository.ResourcesRepository;

@Service
public class ResourcesServiceImpl implements ResourcesService{
	
	@Autowired
	ResourcesRepository ResourcesRepository;
	private static final Logger l= LogManager.getLogger(ResourcesServiceImpl.class);
	@Override
	public List<Resources> retriveAllresources() {
		 List<Resources> resourcess =(List<Resources>) ResourcesRepository.findAll();
		  
		  for(Resources resources :resourcess)
		  {	l.info("Resources +++ :"+resources);	  }
		  return resourcess;
	}

	@Override
	public Resources addresources(Resources r) {
		return ResourcesRepository.save(r);
	}

	@Override
	public void deleteResources(Long cin) {
		ResourcesRepository.deleteById(cin); 
	}

	@Override
	public Resources updateResources(Resources r) {
		ResourcesRepository.save(r); 
		return r;
	}

	@Override
	public Optional<Resources> retrieveResources(Long cin) {
		return ResourcesRepository.findById(cin);

	}

}
