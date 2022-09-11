package com.ace.ai.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ace.ai.student.datamodel.CustomChapterFile;

@Repository
public interface CustomChapterFileRepository extends JpaRepository<CustomChapterFile,Integer> {
    List<CustomChapterFileRepository> findByCustomChapterId(int customChapterId); 
}
