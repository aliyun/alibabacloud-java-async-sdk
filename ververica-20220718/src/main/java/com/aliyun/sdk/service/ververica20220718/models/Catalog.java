// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link Catalog} extends {@link TeaModel}
 *
 * <p>Catalog</p>
 */
public class Catalog extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("extensionConf")
    private java.util.Map<String, String> extensionConf;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("properties")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> properties;

    private Catalog(Builder builder) {
        this.extensionConf = builder.extensionConf;
        this.name = builder.name;
        this.properties = builder.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Catalog create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extensionConf
     */
    public java.util.Map<String, String> getExtensionConf() {
        return this.extensionConf;
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
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public static final class Builder {
        private java.util.Map<String, String> extensionConf; 
        private String name; 
        private java.util.Map<String, ?> properties; 

        private Builder() {
        } 

        private Builder(Catalog model) {
            this.extensionConf = model.extensionConf;
            this.name = model.name;
            this.properties = model.properties;
        } 

        /**
         * extensionConf.
         */
        public Builder extensionConf(java.util.Map<String, String> extensionConf) {
            this.extensionConf = extensionConf;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder properties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }

        public Catalog build() {
            return new Catalog(this);
        } 

    } 

}
