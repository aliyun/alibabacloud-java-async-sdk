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
 * {@link ModelUpdateCmd} extends {@link TeaModel}
 *
 * <p>ModelUpdateCmd</p>
 */
public class ModelUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("baseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("maxInputLength")
    private String maxInputLength;

    @com.aliyun.core.annotation.NameInMap("maxOutputLength")
    private String maxOutputLength;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("symbol")
    private String symbol;

    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    private ModelUpdateCmd(Builder builder) {
        this.apiKey = builder.apiKey;
        this.baseUrl = builder.baseUrl;
        this.description = builder.description;
        this.maxInputLength = builder.maxInputLength;
        this.maxOutputLength = builder.maxOutputLength;
        this.modelId = builder.modelId;
        this.modelType = builder.modelType;
        this.name = builder.name;
        this.status = builder.status;
        this.symbol = builder.symbol;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return baseUrl
     */
    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return symbol
     */
    public String getSymbol() {
        return this.symbol;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String apiKey; 
        private String baseUrl; 
        private String description; 
        private String maxInputLength; 
        private String maxOutputLength; 
        private String modelId; 
        private String modelType; 
        private String name; 
        private Integer status; 
        private String symbol; 
        private String tags; 

        private Builder() {
        } 

        private Builder(ModelUpdateCmd model) {
            this.apiKey = model.apiKey;
            this.baseUrl = model.baseUrl;
            this.description = model.description;
            this.maxInputLength = model.maxInputLength;
            this.maxOutputLength = model.maxOutputLength;
            this.modelId = model.modelId;
            this.modelType = model.modelType;
            this.name = model.name;
            this.status = model.status;
            this.symbol = model.symbol;
            this.tags = model.tags;
        } 

        /**
         * apiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
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
         * description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
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
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
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
         * tags.
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        public ModelUpdateCmd build() {
            return new ModelUpdateCmd(this);
        } 

    } 

}
