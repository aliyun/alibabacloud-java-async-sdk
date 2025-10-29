// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateCredentialInput} extends {@link TeaModel}
 *
 * <p>CreateCredentialInput</p>
 */
public class CreateCredentialInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, String> config;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("secret")
    private String secret;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateCredentialInput(Builder builder) {
        this.config = builder.config;
        this.description = builder.description;
        this.name = builder.name;
        this.secret = builder.secret;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCredentialInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public java.util.Map<String, String> getConfig() {
        return this.config;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return secret
     */
    public String getSecret() {
        return this.secret;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.Map<String, String> config; 
        private String description; 
        private String name; 
        private String secret; 
        private String type; 

        private Builder() {
        } 

        private Builder(CreateCredentialInput model) {
            this.config = model.config;
            this.description = model.description;
            this.name = model.name;
            this.secret = model.secret;
            this.type = model.type;
        } 

        /**
         * <p>凭证的配置参数，以键值对形式存储</p>
         * 
         * <strong>example:</strong>
         * <p>api_endpoint=<a href="https://api.example.com,timeout=30">https://api.example.com,timeout=30</a></p>
         */
        public Builder config(java.util.Map<String, String> config) {
            this.config = config;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * secret.
         */
        public Builder secret(String secret) {
            this.secret = secret;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CreateCredentialInput build() {
            return new CreateCredentialInput(this);
        } 

    } 

}
