// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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

        /**
         * ItemsType.
         */
        public Builder itemsType(String itemsType) {
            this.itemsType = itemsType;
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

        /**
         * ValueType.
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
