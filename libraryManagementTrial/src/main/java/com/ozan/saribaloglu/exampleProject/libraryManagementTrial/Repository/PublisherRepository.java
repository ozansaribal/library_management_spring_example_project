package com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Repository;

import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
