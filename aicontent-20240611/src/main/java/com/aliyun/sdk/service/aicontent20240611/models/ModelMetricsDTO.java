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
 * {@link ModelMetricsDTO} extends {@link TeaModel}
 *
 * <p>ModelMetricsDTO</p>
 */
public class ModelMetricsDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("avgResponseTime")
    private Double avgResponseTime;

    @com.aliyun.core.annotation.NameInMap("inputTokens")
    private Long inputTokens;

    @com.aliyun.core.annotation.NameInMap("outputTokens")
    private Long outputTokens;

    @com.aliyun.core.annotation.NameInMap("successRate")
    private Double successRate;

    @com.aliyun.core.annotation.NameInMap("totalCalls")
    private Long totalCalls;

    private ModelMetricsDTO(Builder builder) {
        this.avgResponseTime = builder.avgResponseTime;
        this.inputTokens = builder.inputTokens;
        this.outputTokens = builder.outputTokens;
        this.successRate = builder.successRate;
        this.totalCalls = builder.totalCalls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelMetricsDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avgResponseTime
     */
    public Double getAvgResponseTime() {
        return this.avgResponseTime;
    }

    /**
     * @return inputTokens
     */
    public Long getInputTokens() {
        return this.inputTokens;
    }

    /**
     * @return outputTokens
     */
    public Long getOutputTokens() {
        return this.outputTokens;
    }

    /**
     * @return successRate
     */
    public Double getSuccessRate() {
        return this.successRate;
    }

    /**
     * @return totalCalls
     */
    public Long getTotalCalls() {
        return this.totalCalls;
    }

    public static final class Builder {
        private Double avgResponseTime; 
        private Long inputTokens; 
        private Long outputTokens; 
        private Double successRate; 
        private Long totalCalls; 

        private Builder() {
        } 

        private Builder(ModelMetricsDTO model) {
            this.avgResponseTime = model.avgResponseTime;
            this.inputTokens = model.inputTokens;
            this.outputTokens = model.outputTokens;
            this.successRate = model.successRate;
            this.totalCalls = model.totalCalls;
        } 

        /**
         * avgResponseTime.
         */
        public Builder avgResponseTime(Double avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }

        /**
         * inputTokens.
         */
        public Builder inputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }

        /**
         * outputTokens.
         */
        public Builder outputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }

        /**
         * successRate.
         */
        public Builder successRate(Double successRate) {
            this.successRate = successRate;
            return this;
        }

        /**
         * totalCalls.
         */
        public Builder totalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }

        public ModelMetricsDTO build() {
            return new ModelMetricsDTO(this);
        } 

    } 

}
