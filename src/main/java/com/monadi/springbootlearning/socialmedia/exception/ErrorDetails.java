package com.monadi.springbootlearning.socialmedia.exception;

import java.time.LocalDate;

public class ErrorDetails {
    private LocalDate date;
    private String message;
    private String desc;

    public ErrorDetails(LocalDate date, String message, String desc) {
        this.date = date;
        this.message = message;
        this.desc = desc;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
