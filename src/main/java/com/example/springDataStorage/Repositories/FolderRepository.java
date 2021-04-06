package com.example.springDataStorage.Repositories;

import com.example.springDataStorage.Models.Folder;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
