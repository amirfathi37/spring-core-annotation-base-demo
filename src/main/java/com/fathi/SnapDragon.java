package com.fathi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SnapDragon implements Processor {
    public void process() {
        System.out.println("I am snapDragon.");
    }
}
