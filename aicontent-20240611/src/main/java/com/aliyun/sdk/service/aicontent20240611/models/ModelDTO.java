// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelDTO} extends {@link TeaModel}
 *
 * <p>ModelDTO</p>
 */
public class ModelDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyPreview")
    private String apiKeyPreview;

    @com.aliyun.core.annotation.NameInMap("baseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.NameInMap("deleteTag")
    private Integer deleteTag;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("extensions")
    private String extensions;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("hasBillingRule")
    private Boolean hasBillingRule;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("inOut")
    private String inOut;

    @com.aliyun.core.annotation.NameInMap("isCustom")
    private Boolean isCustom;

    @com.aliyun.core.annotation.NameInMap("maxInputLength")
    private String maxInputLength;

    @com.aliyun.core.annotation.NameInMap("maxOutputLength")
    private String maxOutputLength;

    @com.aliyun.core.annotation.NameInMap("modelCode")
    private String modelCode;

    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("symbol")
    private String symbol;

    @com.aliyun.core.annotation.NameInMap("tagNames")
    private String tagNames;

    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    private ModelDTO(Builder builder) {
        this.apiKeyPreview = builder.apiKeyPreview;
        this.baseUrl = builder.baseUrl;
        this.deleteTag = builder.deleteTag;
        this.description = builder.description;
        this.extensions = builder.extensions;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.hasBillingRule = builder.hasBillingRule;
        this.id = builder.id;
        this.inOut = builder.inOut;
        this.isCustom = builder.isCustom;
        this.maxInputLength = builder.maxInputLength;
        this.maxOutputLength = builder.maxOutputLength;
        this.modelCode = builder.modelCode;
        this.modelType = builder.modelType;
        this.name = builder.name;
        this.symbol = builder.symbol;
        this.tagNames = builder.tagNames;
        this.tags = builder.tags;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyPreview
     */
    public String getApiKeyPreview() {
        return this.apiKeyPreview;
    }

    /**
     * @return baseUrl
     */
    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * @return deleteTag
     */
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extensions
     */
    public String getExtensions() {
        return this.extensions;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return hasBillingRule
     */
    public Boolean getHasBillingRule() {
        return this.hasBillingRule;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return inOut
     */
    public String getInOut() {
        return this.inOut;
    }

    /**
     * @return isCustom
     */
    public Boolean getIsCustom() {
        return this.isCustom;
    }

    /**
     * @return maxInputLength
     */
    public String getMaxInputLength() {
        return this.maxInputLength;
    }

    /**
     * @return maxOutputLength
     */
    public String getMaxOutputLength() {
        return this.maxOutputLength;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return symbol
     */
    public String getSymbol() {
        return this.symbol;
    }

    /**
     * @return tagNames
     */
    public String getTagNames() {
        return this.tagNames;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String apiKeyPreview; 
        private String baseUrl; 
        private Integer deleteTag; 
        private String description; 
        private String extensions; 
        private String gmtCreate; 
        private String gmtModified; 
        private Boolean hasBillingRule; 
        private Long id; 
        private String inOut; 
        private Boolean isCustom; 
        private String maxInputLength; 
        private String maxOutputLength; 
        private String modelCode; 
        private String modelType; 
        private String name; 
        private String symbol; 
        private String tagNames; 
        private String tags; 
        private Integer version; 

        private Builder() {
        } 

        private Builder(ModelDTO model) {
            this.apiKeyPreview = model.apiKeyPreview;
            this.baseUrl = model.baseUrl;
            this.deleteTag = model.deleteTag;
            this.description = model.description;
            this.extensions = model.extensions;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.hasBillingRule = model.hasBillingRule;
            this.id = model.id;
            this.inOut = model.inOut;
            this.isCustom = model.isCustom;
            this.maxInputLength = model.maxInputLength;
            this.maxOutputLength = model.maxOutputLength;
            this.modelCode = model.modelCode;
            this.modelType = model.modelType;
            this.name = model.name;
            this.symbol = model.symbol;
            this.tagNames = model.tagNames;
            this.tags = model.tags;
            this.version = model.version;
        } 

        /**
         * <p>A masked preview of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxx****xxx</p>
         */
        public Builder apiKeyPreview(String apiKeyPreview) {
            this.apiKeyPreview = apiKeyPreview;
            return this;
        }

        /**
         * <p>The base URL for API requests.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com">https://dashscope.aliyuncs.com</a></p>
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * <p>Indicates the model\&quot;s status. A value of 0 means enabled, and a non-zero value means disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder deleteTag(Integer deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }

        /**
         * <p>The model description.</p>
         * 
         * <strong>example:</strong>
         * <p>通义千问大模型</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * extensions.
         */
        public Builder extensions(String extensions) {
            this.extensions = extensions;
            return this;
        }

        /**
         * <p>The time when the model was created, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The time when the model was last updated, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * hasBillingRule.
         */
        public Builder hasBillingRule(Boolean hasBillingRule) {
            this.hasBillingRule = hasBillingRule;
            return this;
        }

        /**
         * <p>The unique ID of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * inOut.
         */
        public Builder inOut(String inOut) {
            this.inOut = inOut;
            return this;
        }

        /**
         * <p>Indicates whether the model is custom.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isCustom(Boolean isCustom) {
            this.isCustom = isCustom;
            return this;
        }

        /**
         * <p>The maximum input length.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        public Builder maxInputLength(String maxInputLength) {
            this.maxInputLength = maxInputLength;
            return this;
        }

        /**
         * <p>The maximum output length.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder maxOutputLength(String maxOutputLength) {
            this.maxOutputLength = maxOutputLength;
            return this;
        }

        /**
         * <p>The model code.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-turbo</p>
         */
        public Builder modelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }

        /**
         * <p>The model type.</p>
         * 
         * <strong>example:</strong>
         * <p>Chat</p>
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>通义千问</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The vendor symbol.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba</p>
         */
        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        /**
         * <p>The display names for the tags, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>对话,自然语言处理</p>
         */
        public Builder tagNames(String tagNames) {
            this.tagNames = tagNames;
            return this;
        }

        /**
         * <p>A comma-separated list of model tags.</p>
         * 
         * <strong>example:</strong>
         * <p>chat,NLP</p>
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        public ModelDTO build() {
            return new ModelDTO(this);
        } 

    } 

}
