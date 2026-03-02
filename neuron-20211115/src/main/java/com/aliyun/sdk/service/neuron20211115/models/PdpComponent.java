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
 * {@link PdpComponent} extends {@link TeaModel}
 *
 * <p>PdpComponent</p>
 */
public class PdpComponent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("configuration")
    private java.util.List<ConfigModel> configuration;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("isCustom")
    private Boolean isCustom;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long resourceId;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("templateConfiguration")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ConfigModel> templateConfiguration;

    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    @com.aliyun.core.annotation.NameInMap("templateVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateVersion;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("useScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String useScope;

    @com.aliyun.core.annotation.NameInMap("useType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String useType;

    private PdpComponent(Builder builder) {
        this.companyId = builder.companyId;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.env = builder.env;
        this.id = builder.id;
        this.isCustom = builder.isCustom;
        this.name = builder.name;
        this.productId = builder.productId;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.scope = builder.scope;
        this.templateConfiguration = builder.templateConfiguration;
        this.templateId = builder.templateId;
        this.templateVersion = builder.templateVersion;
        this.type = builder.type;
        this.useScope = builder.useScope;
        this.useType = builder.useType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpComponent create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ConfigModel> getConfiguration() {
        return this.configuration;
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
     * @return resourceId
     */
    public Long getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return templateConfiguration
     */
    public java.util.List<ConfigModel> getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateVersion
     */
    public Long getTemplateVersion() {
        return this.templateVersion;
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
        private Long companyId; 
        private java.util.List<ConfigModel> configuration; 
        private String description; 
        private String env; 
        private Long id; 
        private Boolean isCustom; 
        private String name; 
        private Long productId; 
        private String requestId; 
        private Long resourceId; 
        private String resourceType; 
        private String scope; 
        private java.util.List<ConfigModel> templateConfiguration; 
        private Long templateId; 
        private Long templateVersion; 
        private String type; 
        private String useScope; 
        private String useType; 

        private Builder() {
        } 

        private Builder(PdpComponent model) {
            this.companyId = model.companyId;
            this.configuration = model.configuration;
            this.description = model.description;
            this.env = model.env;
            this.id = model.id;
            this.isCustom = model.isCustom;
            this.name = model.name;
            this.productId = model.productId;
            this.requestId = model.requestId;
            this.resourceId = model.resourceId;
            this.resourceType = model.resourceType;
            this.scope = model.scope;
            this.templateConfiguration = model.templateConfiguration;
            this.templateId = model.templateId;
            this.templateVersion = model.templateVersion;
            this.type = model.type;
            this.useScope = model.useScope;
            this.useType = model.useType;
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
        public Builder configuration(java.util.List<ConfigModel> configuration) {
            this.configuration = configuration;
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
         * isCustom.
         */
        public Builder isCustom(Boolean isCustom) {
            this.isCustom = isCustom;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>组件</p>
         */
        public Builder name(String name) {
            this.name = name;
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
         * <p>1</p>
         */
        public Builder resourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>State</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateConfiguration(java.util.List<ConfigModel> templateConfiguration) {
            this.templateConfiguration = templateConfiguration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateVersion(Long templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CACHE</p>
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

        public PdpComponent build() {
            return new PdpComponent(this);
        } 

    } 

}
