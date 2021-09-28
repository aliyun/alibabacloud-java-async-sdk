// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.EnumType;

@EnumType
public enum ObjectACL {

    PRIVATE("private", "PRIVATE"),

    PUBLIC_READ("public-read", "PUBLIC_READ"),

    PUBLIC_READ_WRITE("public-read-write", "PUBLIC_READ_WRITE"),

    DEFAULT("default", "DEFAULT"),

    UNKNOWN_VALUE(null, "UNKNOWN_VALUE");

    private String value;
    private String  description;

    ObjectACL(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }

}
