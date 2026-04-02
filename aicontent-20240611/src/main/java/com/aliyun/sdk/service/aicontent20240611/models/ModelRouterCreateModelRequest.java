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
 * {@link ModelRouterCreateModelRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateModelRequest</p>
 */
public class ModelRouterCreateModelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("baseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extensions")
    private String extensions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inOut")
    private String inOut;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxInputLength")
    private String maxInputLength;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxOutputLength")
    private String maxOutputLength;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("symbol")
    private String symbol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    private ModelRouterCreateModelRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.baseUrl = builder.baseUrl;
        this.description = builder.description;
        this.extensions = builder.extensions;
        this.inOut = builder.inOut;
        this.maxInputLength = builder.maxInputLength;
        this.maxOutputLength = builder.maxOutputLength;
        this.modelId = builder.modelId;
        this.modelType = builder.modelType;
        this.name = builder.name;
        this.symbol = builder.symbol;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCreateModelRequest create() {
        return builder().build();
    }

@Override
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
     * @return extensions
     */
    public String getExtensions() {
        return this.extensions;
    }

    /**
     * @return inOut
     */
    public String getInOut() {
        return this.inOut;
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

    public static final class Builder extends Request.Builder<ModelRouterCreateModelRequest, Builder> {
        private String apiKey; 
        private String baseUrl; 
        private String description; 
        private String extensions; 
        private String inOut; 
        private String maxInputLength; 
        private String maxOutputLength; 
        private String modelId; 
        private String modelType; 
        private String name; 
        private String symbol; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateModelRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.baseUrl = request.baseUrl;
            this.description = request.description;
            this.extensions = request.extensions;
            this.inOut = request.inOut;
            this.maxInputLength = request.maxInputLength;
            this.maxOutputLength = request.maxOutputLength;
            this.modelId = request.modelId;
            this.modelType = request.modelType;
            this.name = request.name;
            this.symbol = request.symbol;
            this.tags = request.tags;
        } 

        /**
         * <p>API Key</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxxx</p>
         */
        public Builder apiKey(String apiKey) {
            this.putBodyParameter("apiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>Base URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com">https://dashscope.aliyuncs.com</a></p>
         */
        public Builder baseUrl(String baseUrl) {
            this.putBodyParameter("baseUrl", baseUrl);
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * extensions.
         */
        public Builder extensions(String extensions) {
            this.putBodyParameter("extensions", extensions);
            this.extensions = extensions;
            return this;
        }

        /**
         * inOut.
         */
        public Builder inOut(String inOut) {
            this.putBodyParameter("inOut", inOut);
            this.inOut = inOut;
            return this;
        }

        /**
         * maxInputLength.
         */
        public Builder maxInputLength(String maxInputLength) {
            this.putBodyParameter("maxInputLength", maxInputLength);
            this.maxInputLength = maxInputLength;
            return this;
        }

        /**
         * maxOutputLength.
         */
        public Builder maxOutputLength(String maxOutputLength) {
            this.putBodyParameter("maxOutputLength", maxOutputLength);
            this.maxOutputLength = maxOutputLength;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * modelType.
         */
        public Builder modelType(String modelType) {
            this.putBodyParameter("modelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * symbol.
         */
        public Builder symbol(String symbol) {
            this.putBodyParameter("symbol", symbol);
            this.symbol = symbol;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(String tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ModelRouterCreateModelRequest build() {
            return new ModelRouterCreateModelRequest(this);
        } 

    } 

}
