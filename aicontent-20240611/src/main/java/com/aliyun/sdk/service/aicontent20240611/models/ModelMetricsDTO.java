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
         * <p>The average response time (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>200.5</p>
         */
        public Builder avgResponseTime(Double avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }

        /**
         * <p>The total number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>500000</p>
         */
        public Builder inputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }

        /**
         * <p>The total number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>300000</p>
         */
        public Builder outputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }

        /**
         * <p>The success rate (%).</p>
         * 
         * <strong>example:</strong>
         * <p>99.5</p>
         */
        public Builder successRate(Double successRate) {
            this.successRate = successRate;
            return this;
        }

        /**
         * <p>The total number of calls.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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
