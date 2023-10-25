package com.geekster.Url.controller;


import com.geekster.Url.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitCounter {

    @Autowired
    public UrlHitService urlHitService;

    @GetMapping("count")
    public int getHitCount() {
        int count = urlHitService.getVisitorCount();
        return count;
    }

}
