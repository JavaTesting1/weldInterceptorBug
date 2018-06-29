package de.stga.cditest.gui;

import de.stga.cditest.model.SuperParam;
import de.stga.cditest.service.AbstractService;

public abstract class AbstractIndexController<S extends SuperParam> {

    private String message;

    public void doSomething() {
        S entity = this.getEntity();
        // INTERCEPTION WORKING IN "weld 2" BUT NOT WORKING in "weld 3"
        try {
            this.getCurrentService().doSomething(entity);
            this.message = "AssertionError: Exception Expected. Bean has not been intercepted.";
        } catch (RuntimeException e) {
            // Expected Exception
            this.message = "Successfull. Bean has been intercepted.";
        }
    }

    public abstract AbstractService<S> getCurrentService();

    public abstract S getEntity();

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

}
