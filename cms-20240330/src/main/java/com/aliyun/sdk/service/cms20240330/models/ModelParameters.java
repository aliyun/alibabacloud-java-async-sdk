// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ModelParameters} extends {@link TeaModel}
 *
 * <p>ModelParameters</p>
 */
public class ModelParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("frequencyPenalty")
    private Float frequencyPenalty;

    @com.aliyun.core.annotation.NameInMap("maxTokens")
    private Long maxTokens;

    @com.aliyun.core.annotation.NameInMap("presencePenalty")
    private Float presencePenalty;

    @com.aliyun.core.annotation.NameInMap("stopSequences")
    private java.util.List<String> stopSequences;

    @com.aliyun.core.annotation.NameInMap("temperature")
    private Float temperature;

    @com.aliyun.core.annotation.NameInMap("topK")
    private Integer topK;

    @com.aliyun.core.annotation.NameInMap("topP")
    private Float topP;

    private ModelParameters(Builder builder) {
        this.frequencyPenalty = builder.frequencyPenalty;
        this.maxTokens = builder.maxTokens;
        this.presencePenalty = builder.presencePenalty;
        this.stopSequences = builder.stopSequences;
        this.temperature = builder.temperature;
        this.topK = builder.topK;
        this.topP = builder.topP;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return frequencyPenalty
     */
    public Float getFrequencyPenalty() {
        return this.frequencyPenalty;
    }

    /**
     * @return maxTokens
     */
    public Long getMaxTokens() {
        return this.maxTokens;
    }

    /**
     * @return presencePenalty
     */
    public Float getPresencePenalty() {
        return this.presencePenalty;
    }

    /**
     * @return stopSequences
     */
    public java.util.List<String> getStopSequences() {
        return this.stopSequences;
    }

    /**
     * @return temperature
     */
    public Float getTemperature() {
        return this.temperature;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return topP
     */
    public Float getTopP() {
        return this.topP;
    }

    public static final class Builder {
        private Float frequencyPenalty; 
        private Long maxTokens; 
        private Float presencePenalty; 
        private java.util.List<String> stopSequences; 
        private Float temperature; 
        private Integer topK; 
        private Float topP; 

        private Builder() {
        } 

        private Builder(ModelParameters model) {
            this.frequencyPenalty = model.frequencyPenalty;
            this.maxTokens = model.maxTokens;
            this.presencePenalty = model.presencePenalty;
            this.stopSequences = model.stopSequences;
            this.temperature = model.temperature;
            this.topK = model.topK;
            this.topP = model.topP;
        } 

        /**
         * frequencyPenalty.
         */
        public Builder frequencyPenalty(Float frequencyPenalty) {
            this.frequencyPenalty = frequencyPenalty;
            return this;
        }

        /**
         * maxTokens.
         */
        public Builder maxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }

        /**
         * presencePenalty.
         */
        public Builder presencePenalty(Float presencePenalty) {
            this.presencePenalty = presencePenalty;
            return this;
        }

        /**
         * stopSequences.
         */
        public Builder stopSequences(java.util.List<String> stopSequences) {
            this.stopSequences = stopSequences;
            return this;
        }

        /**
         * temperature.
         */
        public Builder temperature(Float temperature) {
            this.temperature = temperature;
            return this;
        }

        /**
         * topK.
         */
        public Builder topK(Integer topK) {
            this.topK = topK;
            return this;
        }

        /**
         * topP.
         */
        public Builder topP(Float topP) {
            this.topP = topP;
            return this;
        }

        public ModelParameters build() {
            return new ModelParameters(this);
        } 

    } 

}
