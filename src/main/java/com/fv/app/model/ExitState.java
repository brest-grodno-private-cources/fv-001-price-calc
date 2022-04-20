package com.fv.app.model;

public class ExitState implements Status{
    @Override
    public Status handle() {
        System.out.println("BYE!");
        return null;
    }

    @Override
    public StatusType getType() {
        return StatusType.EXIT;
    }
}
