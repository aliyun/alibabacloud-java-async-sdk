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
 * {@link ResourceCreateCmd} extends {@link TeaModel}
 *
 * <p>ResourceCreateCmd</p>
 */
public class ResourceCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    @com.aliyun.core.annotation.Validation(required = true)
    private String address;

    @com.aliyun.core.annotation.NameInMap("companyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("configuration")
    private String configuration;

    @com.aliyun.core.annotation.NameInMap("credentials")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentials;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("useScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String useScope;

    @com.aliyun.core.annotation.NameInMap("useType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String useType;

    private ResourceCreateCmd(Builder builder) {
        this.address = builder.address;
        this.companyId = builder.companyId;
        this.configuration = builder.configuration;
        this.credentials = builder.credentials;
        this.description = builder.description;
        this.env = builder.env;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.productId = builder.productId;
        this.type = builder.type;
        this.useScope = builder.useScope;
        this.useType = builder.useType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceCreateCmd create() {
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
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
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
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
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
        private Long companyId; 
        private String configuration; 
        private String credentials; 
        private String description; 
        private String env; 
        private String name; 
        private String namespace; 
        private Long productId; 
        private String type; 
        private String useScope; 
        private String useType; 

        private Builder() {
        } 

        private Builder(ResourceCreateCmd model) {
            this.address = model.address;
            this.companyId = model.companyId;
            this.configuration = model.configuration;
            this.credentials = model.credentials;
            this.description = model.description;
            this.env = model.env;
            this.name = model.name;
            this.namespace = model.namespace;
            this.productId = model.productId;
            this.type = model.type;
            this.useScope = model.useScope;
            this.useType = model.useType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http://</p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{ak:xxxx,sk:xxx}</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        public Builder name(String name) {
            this.name = name;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Inner</p>
         */
        public Builder useScope(String useScope) {
            this.useScope = useScope;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Share</p>
         */
        public Builder useType(String useType) {
            this.useType = useType;
            return this;
        }

        public ResourceCreateCmd build() {
            return new ResourceCreateCmd(this);
        } 

    } 

}
