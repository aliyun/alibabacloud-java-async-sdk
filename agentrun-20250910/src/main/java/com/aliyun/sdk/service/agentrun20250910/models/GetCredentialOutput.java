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
 * {@link GetCredentialOutput} extends {@link TeaModel}
 *
 * <p>GetCredentialOutput</p>
 */
public class GetCredentialOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, String> config;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("secret")
    private String secret;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private GetCredentialOutput(Builder builder) {
        this.config = builder.config;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.secret = builder.secret;
        this.type = builder.type;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialOutput create() {
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
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
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
    public String getId() {
        return this.id;
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

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private java.util.Map<String, String> config; 
        private String createdAt; 
        private String description; 
        private String id; 
        private String name; 
        private String secret; 
        private String type; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(GetCredentialOutput model) {
            this.config = model.config;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.id = model.id;
            this.name = model.name;
            this.secret = model.secret;
            this.type = model.type;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * config.
         */
        public Builder config(java.util.Map<String, String> config) {
            this.config = config;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
        public Builder id(String id) {
            this.id = id;
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

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public GetCredentialOutput build() {
            return new GetCredentialOutput(this);
        } 

    } 

}
