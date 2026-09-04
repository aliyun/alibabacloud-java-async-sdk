// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLProgressConfig} extends {@link TeaModel}
 *
 * <p>RLProgressConfig</p>
 */
public class RLProgressConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NumMinibatches")
    private Integer numMinibatches;

    @com.aliyun.core.annotation.NameInMap("PpoMiniBatchSize")
    private Integer ppoMiniBatchSize;

    @com.aliyun.core.annotation.NameInMap("RolloutN")
    private Integer rolloutN;

    @com.aliyun.core.annotation.NameInMap("TotalSteps")
    private Integer totalSteps;

    @com.aliyun.core.annotation.NameInMap("TrainBatchSize")
    private Integer trainBatchSize;

    private RLProgressConfig(Builder builder) {
        this.numMinibatches = builder.numMinibatches;
        this.ppoMiniBatchSize = builder.ppoMiniBatchSize;
        this.rolloutN = builder.rolloutN;
        this.totalSteps = builder.totalSteps;
        this.trainBatchSize = builder.trainBatchSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return numMinibatches
     */
    public Integer getNumMinibatches() {
        return this.numMinibatches;
    }

    /**
     * @return ppoMiniBatchSize
     */
    public Integer getPpoMiniBatchSize() {
        return this.ppoMiniBatchSize;
    }

    /**
     * @return rolloutN
     */
    public Integer getRolloutN() {
        return this.rolloutN;
    }

    /**
     * @return totalSteps
     */
    public Integer getTotalSteps() {
        return this.totalSteps;
    }

    /**
     * @return trainBatchSize
     */
    public Integer getTrainBatchSize() {
        return this.trainBatchSize;
    }

    public static final class Builder {
        private Integer numMinibatches; 
        private Integer ppoMiniBatchSize; 
        private Integer rolloutN; 
        private Integer totalSteps; 
        private Integer trainBatchSize; 

        private Builder() {
        } 

        private Builder(RLProgressConfig model) {
            this.numMinibatches = model.numMinibatches;
            this.ppoMiniBatchSize = model.ppoMiniBatchSize;
            this.rolloutN = model.rolloutN;
            this.totalSteps = model.totalSteps;
            this.trainBatchSize = model.trainBatchSize;
        } 

        /**
         * <p>每个 step 的 mini-batch 数</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder numMinibatches(Integer numMinibatches) {
            this.numMinibatches = numMinibatches;
            return this;
        }

        /**
         * <p>PPO mini-batch 大小</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder ppoMiniBatchSize(Integer ppoMiniBatchSize) {
            this.ppoMiniBatchSize = ppoMiniBatchSize;
            return this;
        }

        /**
         * <p>每个 prompt 的 rollout 条数</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder rolloutN(Integer rolloutN) {
            this.rolloutN = rolloutN;
            return this;
        }

        /**
         * <p>总训练步数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalSteps(Integer totalSteps) {
            this.totalSteps = totalSteps;
            return this;
        }

        /**
         * <p>训练 batch 大小</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder trainBatchSize(Integer trainBatchSize) {
            this.trainBatchSize = trainBatchSize;
            return this;
        }

        public RLProgressConfig build() {
            return new RLProgressConfig(this);
        } 

    } 

}
