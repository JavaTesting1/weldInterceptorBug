package de.stga.cditest.service;

import java.io.Serializable;

import de.stga.cditest.annotations.PreAuthorize;
import de.stga.cditest.model.CurrentParam;

public class CurrentService extends AbstractService<CurrentParam> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    @PreAuthorize
    public CurrentParam doSomething(final CurrentParam param) {
        System.out.println("doSomething() CurrentService");
        return super.doSomething(param);
    }

}
