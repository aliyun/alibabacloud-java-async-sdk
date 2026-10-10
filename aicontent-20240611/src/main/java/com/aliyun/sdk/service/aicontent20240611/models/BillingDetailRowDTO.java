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
 * {@link BillingDetailRowDTO} extends {@link TeaModel}
 *
 * <p>BillingDetailRowDTO</p>
 */
public class BillingDetailRowDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("amount")
    private Double amount;

    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    private Long apiKeyId;

    @com.aliyun.core.annotation.NameInMap("apiKeyName")
    private String apiKeyName;

    @com.aliyun.core.annotation.NameInMap("cacheCreationTokens")
    private Double cacheCreationTokens;

    @com.aliyun.core.annotation.NameInMap("cachedTokens")
    private Double cachedTokens;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("clientName")
    private String clientName;

    @com.aliyun.core.annotation.NameInMap("discount")
    private Double discount;

    @com.aliyun.core.annotation.NameInMap("inputTokens")
    private Double inputTokens;

    @com.aliyun.core.annotation.NameInMap("memberUserId")
    private Long memberUserId;

    @com.aliyun.core.annotation.NameInMap("memberUserName")
    private String memberUserName;

    @com.aliyun.core.annotation.NameInMap("metrics")
    private String metrics;

    @com.aliyun.core.annotation.NameInMap("modelCode")
    private String modelCode;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private Long modelId;

    @com.aliyun.core.annotation.NameInMap("modelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("modelSymbol")
    private String modelSymbol;

    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("modelVersion")
    private Integer modelVersion;

    @com.aliyun.core.annotation.NameInMap("outputTokens")
    private Double outputTokens;

    @com.aliyun.core.annotation.NameInMap("reasoningTokens")
    private Double reasoningTokens;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("requestTime")
    private Long requestTime;

    @com.aliyun.core.annotation.NameInMap("totalTokens")
    private Double totalTokens;

    @com.aliyun.core.annotation.NameInMap("usageDetail")
    private String usageDetail;

    private BillingDetailRowDTO(Builder builder) {
        this.amount = builder.amount;
        this.apiKeyId = builder.apiKeyId;
        this.apiKeyName = builder.apiKeyName;
        this.cacheCreationTokens = builder.cacheCreationTokens;
        this.cachedTokens = builder.cachedTokens;
        this.clientId = builder.clientId;
        this.clientName = builder.clientName;
        this.discount = builder.discount;
        this.inputTokens = builder.inputTokens;
        this.memberUserId = builder.memberUserId;
        this.memberUserName = builder.memberUserName;
        this.metrics = builder.metrics;
        this.modelCode = builder.modelCode;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelSymbol = builder.modelSymbol;
        this.modelType = builder.modelType;
        this.modelVersion = builder.modelVersion;
        this.outputTokens = builder.outputTokens;
        this.reasoningTokens = builder.reasoningTokens;
        this.requestId = builder.requestId;
        this.requestTime = builder.requestTime;
        this.totalTokens = builder.totalTokens;
        this.usageDetail = builder.usageDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillingDetailRowDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Double getAmount() {
        return this.amount;
    }

    /**
     * @return apiKeyId
     */
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    /**
     * @return apiKeyName
     */
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    /**
     * @return cacheCreationTokens
     */
    public Double getCacheCreationTokens() {
        return this.cacheCreationTokens;
    }

    /**
     * @return cachedTokens
     */
    public Double getCachedTokens() {
        return this.cachedTokens;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return clientName
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * @return discount
     */
    public Double getDiscount() {
        return this.discount;
    }

    /**
     * @return inputTokens
     */
    public Double getInputTokens() {
        return this.inputTokens;
    }

    /**
     * @return memberUserId
     */
    public Long getMemberUserId() {
        return this.memberUserId;
    }

    /**
     * @return memberUserName
     */
    public String getMemberUserName() {
        return this.memberUserName;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelSymbol
     */
    public String getModelSymbol() {
        return this.modelSymbol;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return modelVersion
     */
    public Integer getModelVersion() {
        return this.modelVersion;
    }

    /**
     * @return outputTokens
     */
    public Double getOutputTokens() {
        return this.outputTokens;
    }

    /**
     * @return reasoningTokens
     */
    public Double getReasoningTokens() {
        return this.reasoningTokens;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestTime
     */
    public Long getRequestTime() {
        return this.requestTime;
    }

    /**
     * @return totalTokens
     */
    public Double getTotalTokens() {
        return this.totalTokens;
    }

    /**
     * @return usageDetail
     */
    public String getUsageDetail() {
        return this.usageDetail;
    }

    public static final class Builder {
        private Double amount; 
        private Long apiKeyId; 
        private String apiKeyName; 
        private Double cacheCreationTokens; 
        private Double cachedTokens; 
        private Long clientId; 
        private String clientName; 
        private Double discount; 
        private Double inputTokens; 
        private Long memberUserId; 
        private String memberUserName; 
        private String metrics; 
        private String modelCode; 
        private Long modelId; 
        private String modelName; 
        private String modelSymbol; 
        private String modelType; 
        private Integer modelVersion; 
        private Double outputTokens; 
        private Double reasoningTokens; 
        private String requestId; 
        private Long requestTime; 
        private Double totalTokens; 
        private String usageDetail; 

        private Builder() {
        } 

        private Builder(BillingDetailRowDTO model) {
            this.amount = model.amount;
            this.apiKeyId = model.apiKeyId;
            this.apiKeyName = model.apiKeyName;
            this.cacheCreationTokens = model.cacheCreationTokens;
            this.cachedTokens = model.cachedTokens;
            this.clientId = model.clientId;
            this.clientName = model.clientName;
            this.discount = model.discount;
            this.inputTokens = model.inputTokens;
            this.memberUserId = model.memberUserId;
            this.memberUserName = model.memberUserName;
            this.metrics = model.metrics;
            this.modelCode = model.modelCode;
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.modelSymbol = model.modelSymbol;
            this.modelType = model.modelType;
            this.modelVersion = model.modelVersion;
            this.outputTokens = model.outputTokens;
            this.reasoningTokens = model.reasoningTokens;
            this.requestId = model.requestId;
            this.requestTime = model.requestTime;
            this.totalTokens = model.totalTokens;
            this.usageDetail = model.usageDetail;
        } 

        /**
         * <p>The actual payment amount (after discount), rounded to 8 decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00012800</p>
         */
        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>API Key ID</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * <p>The API key name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default Key</p>
         */
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }

        /**
         * <p>The number of cache creation tokens (explicit cache writes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cacheCreationTokens(Double cacheCreationTokens) {
            this.cacheCreationTokens = cacheCreationTokens;
            return this;
        }

        /**
         * <p>The number of tokens that hit the cache.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        public Builder cachedTokens(Double cachedTokens) {
            this.cachedTokens = cachedTokens;
            return this;
        }

        /**
         * <p>The department ID. A value of 0 indicates that no department is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The department name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Department</p>
         */
        public Builder clientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        /**
         * <p>The discount coefficient. A value of 1.0 indicates no discount.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder discount(Double discount) {
            this.discount = discount;
            return this;
        }

        /**
         * <p>The number of input tokens, including cached tokens and cache creation tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder inputTokens(Double inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }

        /**
         * <p>The member user ID for a member row. The value is 0 for a department row.</p>
         * 
         * <strong>example:</strong>
         * <p>30001</p>
         */
        public Builder memberUserId(Long memberUserId) {
            this.memberUserId = memberUserId;
            return this;
        }

        /**
         * <p>The member name for a member row. The value is empty for a department row.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        public Builder memberUserName(String memberUserName) {
            this.memberUserName = memberUserName;
            return this;
        }

        /**
         * <p>The JSON of other metering field mapping, such as video duration and image count. Fields with a value of 0 are not included in the output.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metrics(String metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The model identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        public Builder modelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder modelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen-Plus</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The model symbol (provider identifier).</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder modelSymbol(String modelSymbol) {
            this.modelSymbol = modelSymbol;
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
         * <p>The model version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder modelVersion(Integer modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }

        /**
         * <p>The number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder outputTokens(Double outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }

        /**
         * <p>The number of reasoning tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder reasoningTokens(Double reasoningTokens) {
            this.reasoningTokens = reasoningTokens;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>chatcmpl-abc123def456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request time as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000</p>
         */
        public Builder requestTime(Long requestTime) {
            this.requestTime = requestTime;
            return this;
        }

        /**
         * <p>The total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>1536</p>
         */
        public Builder totalTokens(Double totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        /**
         * <p>The raw JSON of the usage details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;input_tokens&quot;: 1024, &quot;output_tokens&quot;: 512}</p>
         */
        public Builder usageDetail(String usageDetail) {
            this.usageDetail = usageDetail;
            return this;
        }

        public BillingDetailRowDTO build() {
            return new BillingDetailRowDTO(this);
        } 

    } 

}
