// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.EnumType;

@EnumType
public enum CommonAuditStatus {

    UNPUBLISH("Unpublish", "UNPUBLISH"),

    PUBLICH("Publich", "PUBLICH"),

    UNKNOWN_VALUE(null, "UNKNOWN_VALUE");

    private String value;
    private String  description;

    CommonAuditStatus(String value, String description) {
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
