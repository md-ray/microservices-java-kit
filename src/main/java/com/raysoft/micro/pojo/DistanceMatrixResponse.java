package com.raysoft.micro.pojo;

/**
 * Created by saviourcat on 1/5/17.
 */
public class DistanceMatrixResponse {
    private int status;

    private long duration;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
