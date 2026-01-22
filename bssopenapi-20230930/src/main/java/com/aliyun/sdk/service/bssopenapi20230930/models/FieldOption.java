// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FieldOption} extends {@link TeaModel}
 *
 * <p>FieldOption</p>
 */
public class FieldOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FunctionCode")
    private String functionCode;

    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private FieldOption(Builder builder) {
        this.functionCode = builder.functionCode;
        this.isDefault = builder.isDefault;
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FieldOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionCode
     */
    public String getFunctionCode() {
        return this.functionCode;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String functionCode; 
        private Boolean isDefault; 
        private String name; 
        private String value; 

        private Builder() {
        } 

        private Builder(FieldOption model) {
            this.functionCode = model.functionCode;
            this.isDefault = model.isDefault;
            this.name = model.name;
            this.value = model.value;
        } 

        /**
         * FunctionCode.
         */
        public Builder functionCode(String functionCode) {
            this.functionCode = functionCode;
            return this;
        }

        /**
         * IsDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public FieldOption build() {
            return new FieldOption(this);
        } 

    } 

}
