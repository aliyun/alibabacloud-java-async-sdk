// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link Column} extends {@link TeaModel}
 *
 * <p>Column</p>
 */
public class Column extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsNull")
    private Boolean isNull;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private Column(Builder builder) {
        this.isNull = builder.isNull;
        this.name = builder.name;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Column create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isNull
     */
    public Boolean getIsNull() {
        return this.isNull;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private Boolean isNull; 
        private String name; 
        private String type; 
        private String value; 

        private Builder() {
        } 

        private Builder(Column model) {
            this.isNull = model.isNull;
            this.name = model.name;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * IsNull.
         */
        public Builder isNull(Boolean isNull) {
            this.isNull = isNull;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Column build() {
            return new Column(this);
        } 

    } 

}
