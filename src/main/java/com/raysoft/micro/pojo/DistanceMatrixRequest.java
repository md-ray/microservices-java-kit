package com.raysoft.micro.pojo;

/**
 * Created by saviourcat on 1/5/17.
 */
public class DistanceMatrixRequest {
    private float fromLat;
    private float fromLon;
    private float toLat;
    private float toLon;
    private AuthenticationInfo auth;

    public AuthenticationInfo getAuth() {
        return auth;
    }

    public void setAuth(AuthenticationInfo auth) {
        this.auth = auth;
    }

    public float getToLon() {
        return toLon;
    }

    public void setToLon(float toLon) {
        this.toLon = toLon;
    }

    public float getFromLat() {
        return fromLat;
    }

    public void setFromLat(float fromLat) {
        this.fromLat = fromLat;
    }

    public float getFromLon() {
        return fromLon;
    }

    public void setFromLon(float fromLon) {
        this.fromLon = fromLon;
    }

    public float getToLat() {
        return toLat;
    }

    public void setToLat(float toLat) {
        this.toLat = toLat;
    }
}
