package de.stga.cditest.gui;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.stga.cditest.model.CurrentParam;
import de.stga.cditest.service.AbstractService;
import de.stga.cditest.service.CurrentService;

@ViewScoped
@Named
public class IndexController extends AbstractIndexController<CurrentParam> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    CurrentService currentClass;

    @Override
    public AbstractService<CurrentParam> getCurrentClass() {
        return this.currentClass;
    }

    @Override
    public CurrentParam getEntity() {
        return new CurrentParam();
    }

}
