// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Catalog} extends {@link TeaModel}
 *
 * <p>Catalog</p>
 */
public class Catalog extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.Map < String, ? > properties;

    private Catalog(Builder builder) {
        this.name = builder.name;
        this.properties = builder.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Catalog create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return properties
     */
    public java.util.Map < String, ? > getProperties() {
        return this.properties;
    }

    public static final class Builder {
        private String name; 
        private java.util.Map < String, ? > properties; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * properties.
         */
        public Builder properties(java.util.Map < String, ? > properties) {
            this.properties = properties;
            return this;
        }

        public Catalog build() {
            return new Catalog(this);
        } 

    } 

}
