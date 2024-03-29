package com.springbootwithmvc.repository;

import com.springbootwithmvc.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
