package com.example.university.service.impl;

import com.example.university.repository.FacultyRepository;
import com.example.university.service.api.FaculryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.SecondaryTable;

@Slf4j
@Service
@AllArgsConstructor
public class FacultyServiceImpl implements FaculryService {
    private final FacultyRepository facultyRepository;
}
