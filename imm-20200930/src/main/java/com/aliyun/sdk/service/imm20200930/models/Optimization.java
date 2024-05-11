// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Optimization} extends {@link TeaModel}
 *
 * <p>Optimization</p>
 */
public class Optimization extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LearningRate")
    private Float learningRate;

    @com.aliyun.core.annotation.NameInMap("Optimizer")
    private String optimizer;

    private Optimization(Builder builder) {
        this.learningRate = builder.learningRate;
        this.optimizer = builder.optimizer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Optimization create() {
        return builder().build();
    }

    /**
     * @return learningRate
     */
    public Float getLearningRate() {
        return this.learningRate;
    }

    /**
     * @return optimizer
     */
    public String getOptimizer() {
        return this.optimizer;
    }

    public static final class Builder {
        private Float learningRate; 
        private String optimizer; 

        /**
         * LearningRate.
         */
        public Builder learningRate(Float learningRate) {
            this.learningRate = learningRate;
            return this;
        }

        /**
         * Optimizer.
         */
        public Builder optimizer(String optimizer) {
            this.optimizer = optimizer;
            return this;
        }

        public Optimization build() {
            return new Optimization(this);
        } 

    } 

}
