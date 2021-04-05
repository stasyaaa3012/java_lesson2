package com.company;

public enum Gender {

    MALE ("male"),
    FEMALE ("female");

    private String pol;

    Gender(String pol) {
        this.pol = pol;
    }

    public String getPol() {
        return pol;
    }

}
