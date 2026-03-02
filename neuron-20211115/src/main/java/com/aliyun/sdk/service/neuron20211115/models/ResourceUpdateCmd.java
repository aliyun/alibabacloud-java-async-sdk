// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ResourceUpdateCmd} extends {@link TeaModel}
 *
 * <p>ResourceUpdateCmd</p>
 */
public class ResourceUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("configuration")
    private String configuration;

    @com.aliyun.core.annotation.NameInMap("credentials")
    private String credentials;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("useScope")
    private String useScope;

    @com.aliyun.core.annotation.NameInMap("useType")
    private String useType;

    private ResourceUpdateCmd(Builder builder) {
        this.address = builder.address;
        this.configuration = builder.configuration;
        this.credentials = builder.credentials;
        this.description = builder.description;
        this.id = builder.id;
        this.namespace = builder.namespace;
        this.useScope = builder.useScope;
        this.useType = builder.useType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return credentials
     */
    public String getCredentials() {
        return this.credentials;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return useScope
     */
    public String getUseScope() {
        return this.useScope;
    }

    /**
     * @return useType
     */
    public String getUseType() {
        return this.useType;
    }

    public static final class Builder {
        private String address; 
        private String configuration; 
        private String credentials; 
        private String description; 
        private Long id; 
        private String namespace; 
        private String useScope; 
        private String useType; 

        private Builder() {
        } 

        private Builder(ResourceUpdateCmd model) {
            this.address = model.address;
            this.configuration = model.configuration;
            this.credentials = model.credentials;
            this.description = model.description;
            this.id = model.id;
            this.namespace = model.namespace;
            this.useScope = model.useScope;
            this.useType = model.useType;
        } 

        /**
         * address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * configuration.
         */
        public Builder configuration(String configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * credentials.
         */
        public Builder credentials(String credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * useScope.
         */
        public Builder useScope(String useScope) {
            this.useScope = useScope;
            return this;
        }

        /**
         * useType.
         */
        public Builder useType(String useType) {
            this.useType = useType;
            return this;
        }

        public ResourceUpdateCmd build() {
            return new ResourceUpdateCmd(this);
        } 

    } 

}
