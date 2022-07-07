package com.image.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.image.demo.Entity.images;

public interface ImageRepository extends JpaRepository<images, Long>
{

   Optional<images> findByName(String name);

}


