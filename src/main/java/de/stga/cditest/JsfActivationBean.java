package de.stga.cditest;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

@ApplicationScoped
@FacesConfig(version = Version.JSF_2_3)
public class JsfActivationBean {

    // This bean enables the full JSF 2.3 Mode
}
