package com.aem62app.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.spi.injectorspecific.InjectAnnotation;

import javax.inject.Inject;

@Model(adaptables = Resource.class)
public class Test {

    @Inject @Default(values = "Default Text Value")
    private String text;

    public String getText() {
        return text;
    }
}
