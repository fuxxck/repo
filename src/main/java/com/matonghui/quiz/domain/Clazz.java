package com.matonghui.quiz.domain;

import java.io.Serializable;

public class Clazz implements Serializable {
    private static final long serialVersionUID = 908270322179140074L;
    private Integer id;
    private String title;

    public Clazz() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
