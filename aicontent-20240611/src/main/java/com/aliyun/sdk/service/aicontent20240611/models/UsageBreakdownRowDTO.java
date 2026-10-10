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
 * {@link UsageBreakdownRowDTO} extends {@link TeaModel}
 *
 * <p>UsageBreakdownRowDTO</p>
 */
public class UsageBreakdownRowDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    private Long apiKeyId;

    @com.aliyun.core.annotation.NameInMap("apiKeyName")
    private String apiKeyName;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("clientName")
    private String clientName;

    @com.aliyun.core.annotation.NameInMap("memberUserId")
    private Long memberUserId;

    @com.aliyun.core.annotation.NameInMap("memberUserName")
    private String memberUserName;

    @com.aliyun.core.annotation.NameInMap("metrics")
    private java.util.List<MetricKVPairDTO> metrics;

    @com.aliyun.core.annotation.NameInMap("modelCode")
    private String modelCode;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private Long modelId;

    @com.aliyun.core.annotation.NameInMap("modelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("summaryTime")
    private Long summaryTime;

    private UsageBreakdownRowDTO(Builder builder) {
        this.apiKeyId = builder.apiKeyId;
        this.apiKeyName = builder.apiKeyName;
        this.clientId = builder.clientId;
        this.clientName = builder.clientName;
        this.memberUserId = builder.memberUserId;
        this.memberUserName = builder.memberUserName;
        this.metrics = builder.metrics;
        this.modelCode = builder.modelCode;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.summaryTime = builder.summaryTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UsageBreakdownRowDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<MetricKVPairDTO> getMetrics() {
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
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return summaryTime
     */
    public Long getSummaryTime() {
        return this.summaryTime;
    }

    public static final class Builder {
        private Long apiKeyId; 
        private String apiKeyName; 
        private Long clientId; 
        private String clientName; 
        private Long memberUserId; 
        private String memberUserName; 
        private java.util.List<MetricKVPairDTO> metrics; 
        private String modelCode; 
        private Long modelId; 
        private String modelName; 
        private String modelType; 
        private Long summaryTime; 

        private Builder() {
        } 

        private Builder(UsageBreakdownRowDTO model) {
            this.apiKeyId = model.apiKeyId;
            this.apiKeyName = model.apiKeyName;
            this.clientId = model.clientId;
            this.clientName = model.clientName;
            this.memberUserId = model.memberUserId;
            this.memberUserName = model.memberUserName;
            this.metrics = model.metrics;
            this.modelCode = model.modelCode;
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.modelType = model.modelType;
            this.summaryTime = model.summaryTime;
        } 

        /**
         * <p>The API key ID. A value of 0 indicates that historical data is not broken down by API key.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * <p>The API key name, corresponding to api_key_id.</p>
         * 
         * <strong>example:</strong>
         * <p>Default key</p>
         */
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }

        /**
         * <p>The department ID. A value of 0 indicates no affiliated department.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The member ID for a member row. The value is 0 for a department row.</p>
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
         * <p>John Smith</p>
         */
        public Builder memberUserName(String memberUserName) {
            this.memberUserName = memberUserName;
            return this;
        }

        /**
         * <p>The usage metric array. Only entries with non-zero values are included.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;: &quot;total_calls&quot;, &quot;value&quot;: 100}]</p>
         */
        public Builder metrics(java.util.List<MetricKVPairDTO> metrics) {
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
         * <p>The statistical dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>llm</p>
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>The statistical time point, in UNIX timestamp (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000</p>
         */
        public Builder summaryTime(Long summaryTime) {
            this.summaryTime = summaryTime;
            return this;
        }

        public UsageBreakdownRowDTO build() {
            return new UsageBreakdownRowDTO(this);
        } 

    } 

}
