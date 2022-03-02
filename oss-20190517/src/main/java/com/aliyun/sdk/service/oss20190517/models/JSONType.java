// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.EnumType;

@EnumType
public enum JSONType {

    DOCUMENT("DOCUMENT", "DOCUMENT"),

    LINES("LINES", "LINES"),

    UNKNOWN_VALUE(null, "UNKNOWN_VALUE");

    private String value;
    private String  description;

    JSONType(String value, String description) {
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
