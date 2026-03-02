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
 * {@link PreviewComponentCrdSchemaCmd} extends {@link TeaModel}
 *
 * <p>PreviewComponentCrdSchemaCmd</p>
 */
public class PreviewComponentCrdSchemaCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("configuration")
    private java.util.List<ConfigModel> configuration;

    @com.aliyun.core.annotation.NameInMap("credentials")
    private String credentials;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("isCustom")
    private Boolean isCustom;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("reesourceVersion")
    private String reesourceVersion;

    @com.aliyun.core.annotation.NameInMap("resourceId")
    private Long resourceId;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("templateId")
    private Long templateId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private PreviewComponentCrdSchemaCmd(Builder builder) {
        this.address = builder.address;
        this.configuration = builder.configuration;
        this.credentials = builder.credentials;
        this.id = builder.id;
        this.isCustom = builder.isCustom;
        this.name = builder.name;
        this.reesourceVersion = builder.reesourceVersion;
        this.resourceId = builder.resourceId;
        this.scope = builder.scope;
        this.templateId = builder.templateId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewComponentCrdSchemaCmd create() {
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
    public java.util.List<ConfigModel> getConfiguration() {
        return this.configuration;
    }

    /**
     * @return credentials
     */
    public String getCredentials() {
        return this.credentials;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return isCustom
     */
    public Boolean getIsCustom() {
        return this.isCustom;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return reesourceVersion
     */
    public String getReesourceVersion() {
        return this.reesourceVersion;
    }

    /**
     * @return resourceId
     */
    public Long getResourceId() {
        return this.resourceId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String address; 
        private java.util.List<ConfigModel> configuration; 
        private String credentials; 
        private Long id; 
        private Boolean isCustom; 
        private String name; 
        private String reesourceVersion; 
        private Long resourceId; 
        private String scope; 
        private Long templateId; 
        private String type; 

        private Builder() {
        } 

        private Builder(PreviewComponentCrdSchemaCmd model) {
            this.address = model.address;
            this.configuration = model.configuration;
            this.credentials = model.credentials;
            this.id = model.id;
            this.isCustom = model.isCustom;
            this.name = model.name;
            this.reesourceVersion = model.reesourceVersion;
            this.resourceId = model.resourceId;
            this.scope = model.scope;
            this.templateId = model.templateId;
            this.type = model.type;
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
        public Builder configuration(java.util.List<ConfigModel> configuration) {
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
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * isCustom.
         */
        public Builder isCustom(Boolean isCustom) {
            this.isCustom = isCustom;
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
         * reesourceVersion.
         */
        public Builder reesourceVersion(String reesourceVersion) {
            this.reesourceVersion = reesourceVersion;
            return this;
        }

        /**
         * resourceId.
         */
        public Builder resourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * templateId.
         */
        public Builder templateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PreviewComponentCrdSchemaCmd build() {
            return new PreviewComponentCrdSchemaCmd(this);
        } 

    } 

}
