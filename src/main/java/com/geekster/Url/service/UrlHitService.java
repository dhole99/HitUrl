package com.geekster.Url.service;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {private int visitorCount = 0;

    public int getVisitorCount() {
        return visitorCount;
    }

    public void incrementVisitorCount() {
        visitorCount++;
    }

}
