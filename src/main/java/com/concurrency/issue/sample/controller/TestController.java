package com.concurrency.issue.sample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", methods = RequestMethod.POST)
public class TestController {

    @PostMapping("/test")
    public void createTest(@RequestBody TestDto request){
        processTest(request);
    }

    @Async
    public void processTest(TestDto request){
        long start = System.currentTimeMillis();
        System.out.println("시작 시간 ===>" + start);

        System.out.println("들어온 값 ===> " + request.name());

        Thread currentThread = Thread.currentThread();
        String threadName = currentThread.getName();
        long threadId = currentThread.getId();
        System.out.println("현재 쓰레드 ==========> " + threadId + " : " + threadName);

        long end = System.currentTimeMillis();
        System.out.println("종료 시간 ===>" + end);
    }
}
