package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {
    private String name;

    public enum DuongXinyu{
        Duong("Duong"),Xinyu("Xinyu");

        private String name;

        private DuongXinyu(String name) {
            this.name=name;
        }
    }

    public DuongXinyuEvaluator(String name) {
        this.name=name;
    }

    public Boolean isDuong() {
        return (this.name.equalsIgnoreCase(DuongXinyu.Duong.name));
    }

    public Boolean isXinyu() {
        return (this.name.equalsIgnoreCase(DuongXinyu.Xinyu.name));

    }
}
