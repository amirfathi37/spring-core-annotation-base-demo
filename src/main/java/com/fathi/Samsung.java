package com.fathi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    private String name;

    @Autowired
    private Processor cpu;

    public void config() {
        System.out.println("12MP camera , Octa Core , 6GB Ram" + " " + cpu.getClass().getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }
}
