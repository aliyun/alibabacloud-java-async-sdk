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

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

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

    private ModelDTO(Builder builder) {
        this.apiKeyPreview = builder.apiKeyPreview;
        this.baseUrl = builder.baseUrl;
        this.deleteTag = builder.deleteTag;
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.isCustom = builder.isCustom;
        this.maxInputLength = builder.maxInputLength;
        this.maxOutputLength = builder.maxOutputLength;
        this.modelCode = builder.modelCode;
        this.modelType = builder.modelType;
        this.name = builder.name;
        this.symbol = builder.symbol;
        this.tagNames = builder.tagNames;
        this.tags = builder.tags;
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

    public static final class Builder {
        private String apiKeyPreview; 
        private String baseUrl; 
        private Integer deleteTag; 
        private String description; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private Boolean isCustom; 
        private String maxInputLength; 
        private String maxOutputLength; 
        private String modelCode; 
        private String modelType; 
        private String name; 
        private String symbol; 
        private String tagNames; 
        private String tags; 

        private Builder() {
        } 

        private Builder(ModelDTO model) {
            this.apiKeyPreview = model.apiKeyPreview;
            this.baseUrl = model.baseUrl;
            this.deleteTag = model.deleteTag;
            this.description = model.description;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.isCustom = model.isCustom;
            this.maxInputLength = model.maxInputLength;
            this.maxOutputLength = model.maxOutputLength;
            this.modelCode = model.modelCode;
            this.modelType = model.modelType;
            this.name = model.name;
            this.symbol = model.symbol;
            this.tagNames = model.tagNames;
            this.tags = model.tags;
        } 

        /**
         * apiKeyPreview.
         */
        public Builder apiKeyPreview(String apiKeyPreview) {
            this.apiKeyPreview = apiKeyPreview;
            return this;
        }

        /**
         * baseUrl.
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * deleteTag.
         */
        public Builder deleteTag(Integer deleteTag) {
            this.deleteTag = deleteTag;
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
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
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
         * maxInputLength.
         */
        public Builder maxInputLength(String maxInputLength) {
            this.maxInputLength = maxInputLength;
            return this;
        }

        /**
         * maxOutputLength.
         */
        public Builder maxOutputLength(String maxOutputLength) {
            this.maxOutputLength = maxOutputLength;
            return this;
        }

        /**
         * modelCode.
         */
        public Builder modelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }

        /**
         * modelType.
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
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
         * symbol.
         */
        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        /**
         * tagNames.
         */
        public Builder tagNames(String tagNames) {
            this.tagNames = tagNames;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        public ModelDTO build() {
            return new ModelDTO(this);
        } 

    } 

}
