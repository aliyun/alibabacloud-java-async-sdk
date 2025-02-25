// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResourceDetail} extends {@link TeaModel}
 *
 * <p>ResourceDetail</p>
 */
public class ResourceDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("attributeValues")
    private java.util.Map < String, ? > attributeValues;

    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ResourceDetail(Builder builder) {
        this.address = builder.address;
        this.attributeValues = builder.attributeValues;
        this.mode = builder.mode;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceDetail create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return attributeValues
     */
    public java.util.Map < String, ? > getAttributeValues() {
        return this.attributeValues;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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

    public static final class Builder {
        private String address; 
        private java.util.Map < String, ? > attributeValues; 
        private String mode; 
        private String name; 
        private String type; 

        /**
         * address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * attributeValues.
         */
        public Builder attributeValues(java.util.Map < String, ? > attributeValues) {
            this.attributeValues = attributeValues;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ResourceDetail build() {
            return new ResourceDetail(this);
        } 

    } 

}
