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
            this.metrics = model.metrics;
            this.modelCode = model.modelCode;
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.modelType = model.modelType;
            this.summaryTime = model.summaryTime;
        } 

        /**
         * apiKeyId.
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * apiKeyName.
         */
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * clientName.
         */
        public Builder clientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        /**
         * metrics.
         */
        public Builder metrics(java.util.List<MetricKVPairDTO> metrics) {
            this.metrics = metrics;
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
         * modelId.
         */
        public Builder modelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * modelName.
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
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
         * summaryTime.
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
