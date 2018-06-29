package de.stga.cditest.service;

import java.io.Serializable;

import de.stga.cditest.model.SuperParam;

public abstract class AbstractService<S extends SuperParam> implements Serializable {

    private static final long serialVersionUID = 1L;

    public S doSomething(final S param) {
        System.out.println("doSomething() AbstractService");
        return param;
    }
}
