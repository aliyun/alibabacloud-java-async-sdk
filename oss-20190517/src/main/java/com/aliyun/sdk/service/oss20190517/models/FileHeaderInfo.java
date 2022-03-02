// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.EnumType;

@EnumType
public enum FileHeaderInfo {

    USE("USE", "USE"),

    IGNORE("IGNORE", "IGNORE"),

    NONE("NONE", "NONE"),

    UNKNOWN_VALUE(null, "UNKNOWN_VALUE");

    private String value;
    private String  description;

    FileHeaderInfo(String value, String description) {
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
