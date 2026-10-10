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
 * {@link ModelRouterBatchCreateModelRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterBatchCreateModelRequest</p>
 */
public class ModelRouterBatchCreateModelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("baseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("models")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<BatchCreateModelItemDTO> models;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("symbol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String symbol;

    private ModelRouterBatchCreateModelRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.baseUrl = builder.baseUrl;
        this.models = builder.models;
        this.symbol = builder.symbol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterBatchCreateModelRequest create() {
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
     * @return models
     */
    public java.util.List<BatchCreateModelItemDTO> getModels() {
        return this.models;
    }

    /**
     * @return symbol
     */
    public String getSymbol() {
        return this.symbol;
    }

    public static final class Builder extends Request.Builder<ModelRouterBatchCreateModelRequest, Builder> {
        private String apiKey; 
        private String baseUrl; 
        private java.util.List<BatchCreateModelItemDTO> models; 
        private String symbol; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterBatchCreateModelRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.baseUrl = request.baseUrl;
            this.models = request.models;
            this.symbol = request.symbol;
        } 

        /**
         * <p>The API key. This parameter is required. The key is shared by the same provider and reused by all models.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxxxxxxxxxxxxxxx</p>
         */
        public Builder apiKey(String apiKey) {
            this.putBodyParameter("apiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The base URL. This parameter is optional. Specify this parameter when you use a custom gateway address. If you do not specify this parameter, the default address of the provider is used.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        public Builder baseUrl(String baseUrl) {
            this.putBodyParameter("baseUrl", baseUrl);
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * <p>The list of models to create in batches. This parameter is required. At least one item must be specified.</p>
         * <p>This parameter is required.</p>
         */
        public Builder models(java.util.List<BatchCreateModelItemDTO> models) {
            this.putBodyParameter("models", models);
            this.models = models;
            return this;
        }

        /**
         * <p>The provider symbol. This parameter is required. All models items share the same provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder symbol(String symbol) {
            this.putBodyParameter("symbol", symbol);
            this.symbol = symbol;
            return this;
        }

        @Override
        public ModelRouterBatchCreateModelRequest build() {
            return new ModelRouterBatchCreateModelRequest(this);
        } 

    } 

}
