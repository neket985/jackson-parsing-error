package com.example.jacksonparsingerror

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class MainService {

    @PostConstruct
    fun init(){
        Main.parseSample()
    }
}