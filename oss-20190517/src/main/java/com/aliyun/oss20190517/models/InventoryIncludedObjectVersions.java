// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.EnumType;

@EnumType
public enum InventoryIncludedObjectVersions {

    ALL("All", "ALL"),

    CURRENT("Current", "CURRENT"),

    UNKNOWN_VALUE(null, "UNKNOWN_VALUE");

    private String value;
    private String  description;

    InventoryIncludedObjectVersions(String value, String description) {
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
