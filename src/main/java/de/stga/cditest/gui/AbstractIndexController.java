package de.stga.cditest.gui;

import java.io.Serializable;

import de.stga.cditest.model.SuperParam;
import de.stga.cditest.service.AbstractService;

public abstract class AbstractIndexController<S extends SuperParam> implements Serializable {

    private static final long serialVersionUID = 1L;

    public void doSomething() {
        S entity = this.getEntity();
        // INTERCEPTION WORKING IN "weld 2" BUT NOT WORKING in "weld 3"
        this.getCurrentClass().doSomething(entity);
    }

    public abstract AbstractService<S> getCurrentClass();

    public abstract S getEntity();

}
