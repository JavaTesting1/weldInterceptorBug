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
    CurrentService currentService;

    @Override
    public AbstractService<CurrentParam> getCurrentService() {
        return this.currentService;
    }

    @Override
    public CurrentParam getEntity() {
        return new CurrentParam();
    }

}
