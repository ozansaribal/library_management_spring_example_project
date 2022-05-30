package com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Service;

import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Publisher;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> findAllPublishers(){

        return publisherRepository.findAll();

    }

    public Publisher findPublisherById(Long id){

        return publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher not found!"));

    }

    public void createPublisher(Publisher publisher){

        publisherRepository.save(publisher);

    }

    public void updatePublisher(Publisher publisher){

        publisherRepository.save(publisher);

    }

    public void deletePublisher(Long id){

        if(!publisherRepository.existsById(id)){

            throw new RuntimeException("there is no publisher with this id");

        }

        publisherRepository.deleteById(id);

    }

}
