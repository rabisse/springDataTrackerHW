package com.example.springDataStorage.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.File;

public interface FileRepository extends JpaRepository<File, Long> {
}
