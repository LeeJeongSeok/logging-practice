package com.io.jeongseok.loggingpractice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/tc")
    public void tc() {
        log.info("tc");
    }

    @GetMapping("/tc2")
    public void tc2() {
        log.info("게시글 생성 요청이 완료되었습니다.");
    }

    @GetMapping("/tc3")
    public void tc3() {
        log.error("게시글을 업로드하는 도중 문제가 발생했습니다.");
    }
}
