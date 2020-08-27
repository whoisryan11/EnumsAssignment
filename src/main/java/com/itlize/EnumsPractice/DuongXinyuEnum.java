package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
    Duong("Duong"), Xinyu("Xinyu");

    private String name;

    private DuongXinyuEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDuong(){
        return this.name.equals("Duong");
    }

    public boolean isXinyu() {
        return this.name.equals("Xinyu");
    }

    public String getCatchPhrase(){
        return "Hey, my name is " + getName() + "!";
    }
}
