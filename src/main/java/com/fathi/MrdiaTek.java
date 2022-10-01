package com.fathi;

import org.springframework.stereotype.Component;

@Component
public class MrdiaTek implements Processor {
    public void process() {
        System.out.println("I am mediaTek.");
    }
}
