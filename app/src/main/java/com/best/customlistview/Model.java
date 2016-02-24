package com.best.customlistview;

/**
 * Created by ilandbt on 24/02/2016.
 */
public class Model {

    public enum Status {
        A, B
    }

    private String title;
    private Status status;

    public Model(String title){
        this.title = title;
        this.status = Status.A;
    }


    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void toggleStatus() {
        if (status == Status.A) {
            status = Status.B;
        } else {
            status = Status.A;
        }
    }
}
