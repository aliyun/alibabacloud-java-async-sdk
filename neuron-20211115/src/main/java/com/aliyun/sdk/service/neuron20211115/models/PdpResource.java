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
 * {@link PdpResource} extends {@link TeaModel}
 *
 * <p>PdpResource</p>
 */
public class PdpResource extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("useScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String useScope;

    @com.aliyun.core.annotation.NameInMap("useType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String useType;

    private PdpResource(Builder builder) {
        this.address = builder.address;
        this.companyId = builder.companyId;
        this.configuration = builder.configuration;
        this.credentials = builder.credentials;
        this.description = builder.description;
        this.env = builder.env;
        this.id = builder.id;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.productId = builder.productId;
        this.requestId = builder.requestId;
        this.type = builder.type;
        this.useScope = builder.useScope;
        this.useType = builder.useType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpResource create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Long id; 
        private String name; 
        private String namespace; 
        private Long productId; 
        private String requestId; 
        private String type; 
        private String useScope; 
        private String useType; 

        private Builder() {
        } 

        private Builder(PdpResource model) {
            this.address = model.address;
            this.companyId = model.companyId;
            this.configuration = model.configuration;
            this.credentials = model.credentials;
            this.description = model.description;
            this.env = model.env;
            this.id = model.id;
            this.name = model.name;
            this.namespace = model.namespace;
            this.productId = model.productId;
            this.requestId = model.requestId;
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
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public PdpResource build() {
            return new PdpResource(this);
        } 

    } 

}
