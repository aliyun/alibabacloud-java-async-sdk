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
 * {@link ComponentTemplateCreateCmd} extends {@link TeaModel}
 *
 * <p>ComponentTemplateCreateCmd</p>
 */
public class ComponentTemplateCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("configuration")
    private java.util.List<ConfigModel> configuration;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("isCustom")
    private Boolean isCustom;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

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

    private ComponentTemplateCreateCmd(Builder builder) {
        this.companyId = builder.companyId;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.isCustom = builder.isCustom;
        this.name = builder.name;
        this.productId = builder.productId;
        this.type = builder.type;
        this.useScope = builder.useScope;
        this.useType = builder.useType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ComponentTemplateCreateCmd create() {
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
        private Boolean isCustom; 
        private String name; 
        private Long productId; 
        private String type; 
        private String useScope; 
        private String useType; 

        private Builder() {
        } 

        private Builder(ComponentTemplateCreateCmd model) {
            this.companyId = model.companyId;
            this.configuration = model.configuration;
            this.description = model.description;
            this.isCustom = model.isCustom;
            this.name = model.name;
            this.productId = model.productId;
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
         * <p>Redis</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>State.Redis</p>
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

        public ComponentTemplateCreateCmd build() {
            return new ComponentTemplateCreateCmd(this);
        } 

    } 

}
