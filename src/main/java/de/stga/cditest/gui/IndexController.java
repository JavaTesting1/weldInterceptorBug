package de.stga.cditest.gui;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.stga.cditest.model.CurrentParam;
import de.stga.cditest.service.AbstractService;
import de.stga.cditest.service.CurrentService;

@RequestScoped
@Named
public class IndexController extends AbstractIndexController<CurrentParam> {

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
