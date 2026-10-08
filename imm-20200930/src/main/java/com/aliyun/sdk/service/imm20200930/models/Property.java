// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Property} extends {@link TeaModel}
 *
 * <p>Property</p>
 */
public class Property extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ItemsType")
    private String itemsType;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("ValueType")
    private String valueType;

    private Property(Builder builder) {
        this.itemsType = builder.itemsType;
        this.name = builder.name;
        this.value = builder.value;
        this.valueType = builder.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Property create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return itemsType
     */
    public String getItemsType() {
        return this.itemsType;
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

    /**
     * @return valueType
     */
    public String getValueType() {
        return this.valueType;
    }

    public static final class Builder {
        private String itemsType; 
        private String name; 
        private String value; 
        private String valueType; 

        private Builder() {
        } 

        private Builder(Property model) {
            this.itemsType = model.itemsType;
            this.name = model.name;
            this.value = model.value;
            this.valueType = model.valueType;
        } 

        /**
         * <p>If you set the ValueType field to array, you must specify the type of the elements within the array. The enumerated values include float, integer, and string.</p>
         * 
         * <strong>example:</strong>
         * <p>float</p>
         */
        public Builder itemsType(String itemsType) {
            this.itemsType = itemsType;
            return this;
        }

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>channels</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>[40, 80, 160, 320]</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * <p>The type of the property. Supported enumerated values: float, integer, string, and array.</p>
         * 
         * <strong>example:</strong>
         * <p>array</p>
         */
        public Builder valueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public Property build() {
            return new Property(this);
        } 

    } 

}
