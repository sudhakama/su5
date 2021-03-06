package nine.dom;

import org.nakedobjects.applib.AbstractDomainObject;


public class DomainObject extends AbstractDomainObject {

    public String title() {
        return getName();
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String lastName) {
        this.name = lastName;
    }

}

// Copyright (c) Naked Objects Group Ltd.
