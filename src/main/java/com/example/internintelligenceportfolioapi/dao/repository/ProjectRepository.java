package com.example.internintelligenceportfolioapi.dao.repository;

import com.example.internintelligenceportfolioapi.dao.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {
}
