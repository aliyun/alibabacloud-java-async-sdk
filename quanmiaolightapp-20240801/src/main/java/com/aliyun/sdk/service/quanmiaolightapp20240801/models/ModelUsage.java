// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link ModelUsage} extends {@link TeaModel}
 *
 * <p>ModelUsage</p>
 */
public class ModelUsage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("inputTokens")
    private Long inputTokens;

    @com.aliyun.core.annotation.NameInMap("outputTokens")
    private Long outputTokens;

    @com.aliyun.core.annotation.NameInMap("totalTokens")
    private Long totalTokens;

    private ModelUsage(Builder builder) {
        this.inputTokens = builder.inputTokens;
        this.outputTokens = builder.outputTokens;
        this.totalTokens = builder.totalTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelUsage create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return totalTokens
     */
    public Long getTotalTokens() {
        return this.totalTokens;
    }

    public static final class Builder {
        private Long inputTokens; 
        private Long outputTokens; 
        private Long totalTokens; 

        private Builder() {
        } 

        private Builder(ModelUsage model) {
            this.inputTokens = model.inputTokens;
            this.outputTokens = model.outputTokens;
            this.totalTokens = model.totalTokens;
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
         * totalTokens.
         */
        public Builder totalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        public ModelUsage build() {
            return new ModelUsage(this);
        } 

    } 

}
