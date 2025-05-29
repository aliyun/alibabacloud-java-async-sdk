// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link HalfLLMImageChatRequest} extends {@link RequestModel}
 *
 * <p>HalfLLMImageChatRequest</p>
 */
public class HalfLLMImageChatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableSearch")
    private Boolean enableSearch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inputText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputText;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private HalfLLMImageChatRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.enableSearch = builder.enableSearch;
        this.imageUrl = builder.imageUrl;
        this.inputText = builder.inputText;
        this.model = builder.model;
        this.productKey = builder.productKey;
        this.prompt = builder.prompt;
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HalfLLMImageChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return enableSearch
     */
    public Boolean getEnableSearch() {
        return this.enableSearch;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return inputText
     */
    public String getInputText() {
        return this.inputText;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<HalfLLMImageChatRequest, Builder> {
        private String deviceName; 
        private Boolean enableSearch; 
        private String imageUrl; 
        private String inputText; 
        private String model; 
        private String productKey; 
        private String prompt; 
        private String sessionId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(HalfLLMImageChatRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.enableSearch = request.enableSearch;
            this.imageUrl = request.imageUrl;
            this.inputText = request.inputText;
            this.model = request.model;
            this.productKey = request.productKey;
            this.prompt = request.prompt;
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5b504f84b69b9a73d3a21a2cff05e190</p>
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("deviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * enableSearch.
         */
        public Builder enableSearch(Boolean enableSearch) {
            this.putBodyParameter("enableSearch", enableSearch);
            this.enableSearch = enableSearch;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx/xx.jpg">https://xxx/xx.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("imageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputText(String inputText) {
            this.putBodyParameter("inputText", inputText);
            this.inputText = inputText;
            return this;
        }

        /**
         * model.
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2oImhCz4f8XCviiM</p>
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("productKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>520539530998273</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public HalfLLMImageChatRequest build() {
            return new HalfLLMImageChatRequest(this);
        } 

    } 

}
