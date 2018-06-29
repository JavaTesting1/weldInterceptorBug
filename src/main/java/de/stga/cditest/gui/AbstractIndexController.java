package de.stga.cditest.gui;

import de.stga.cditest.model.SuperParam;
import de.stga.cditest.service.AbstractService;

public abstract class AbstractIndexController<S extends SuperParam> {

    public void doSomething() {
        S entity = this.getEntity();
        // INTERCEPTION WORKING IN "weld 2" BUT NOT WORKING in "weld 3"
        this.getCurrentService().doSomething(entity);
    }

    public abstract AbstractService<S> getCurrentService();

    public abstract S getEntity();

}
