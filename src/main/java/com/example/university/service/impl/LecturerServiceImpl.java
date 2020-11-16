package com.example.university.service.impl;

import com.example.university.entity.Lecturer;
import com.example.university.repository.LecturerRepository;
import com.example.university.service.api.LecturerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class LecturerServiceImpl implements LecturerService {
    private final LecturerRepository lecturerRepository;
}
