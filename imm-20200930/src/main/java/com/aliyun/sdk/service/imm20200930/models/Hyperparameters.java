// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Hyperparameters} extends {@link TeaModel}
 *
 * <p>Hyperparameters</p>
 */
public class Hyperparameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupInterval")
    private Long backupInterval;

    @com.aliyun.core.annotation.NameInMap("BatchSize")
    private Long batchSize;

    @com.aliyun.core.annotation.NameInMap("DataLoaderWorkers")
    private Long dataLoaderWorkers;

    @com.aliyun.core.annotation.NameInMap("Evaluator")
    @com.aliyun.core.annotation.Validation(required = true)
    private CustomParams evaluator;

    @com.aliyun.core.annotation.NameInMap("InputSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> inputSize;

    @com.aliyun.core.annotation.NameInMap("MaxEpoch")
    private Long maxEpoch;

    @com.aliyun.core.annotation.NameInMap("Optimization")
    private Optimization optimization;

    @com.aliyun.core.annotation.NameInMap("Schedule")
    private Schedule schedule;

    private Hyperparameters(Builder builder) {
        this.backupInterval = builder.backupInterval;
        this.batchSize = builder.batchSize;
        this.dataLoaderWorkers = builder.dataLoaderWorkers;
        this.evaluator = builder.evaluator;
        this.inputSize = builder.inputSize;
        this.maxEpoch = builder.maxEpoch;
        this.optimization = builder.optimization;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Hyperparameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupInterval
     */
    public Long getBackupInterval() {
        return this.backupInterval;
    }

    /**
     * @return batchSize
     */
    public Long getBatchSize() {
        return this.batchSize;
    }

    /**
     * @return dataLoaderWorkers
     */
    public Long getDataLoaderWorkers() {
        return this.dataLoaderWorkers;
    }

    /**
     * @return evaluator
     */
    public CustomParams getEvaluator() {
        return this.evaluator;
    }

    /**
     * @return inputSize
     */
    public java.util.List<Long> getInputSize() {
        return this.inputSize;
    }

    /**
     * @return maxEpoch
     */
    public Long getMaxEpoch() {
        return this.maxEpoch;
    }

    /**
     * @return optimization
     */
    public Optimization getOptimization() {
        return this.optimization;
    }

    /**
     * @return schedule
     */
    public Schedule getSchedule() {
        return this.schedule;
    }

    public static final class Builder {
        private Long backupInterval; 
        private Long batchSize; 
        private Long dataLoaderWorkers; 
        private CustomParams evaluator; 
        private java.util.List<Long> inputSize; 
        private Long maxEpoch; 
        private Optimization optimization; 
        private Schedule schedule; 

        private Builder() {
        } 

        private Builder(Hyperparameters model) {
            this.backupInterval = model.backupInterval;
            this.batchSize = model.batchSize;
            this.dataLoaderWorkers = model.dataLoaderWorkers;
            this.evaluator = model.evaluator;
            this.inputSize = model.inputSize;
            this.maxEpoch = model.maxEpoch;
            this.optimization = model.optimization;
            this.schedule = model.schedule;
        } 

        /**
         * <p>The frequency at which the model configuration is saved. If you set this parameter to 1, model configuration is saved every epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder backupInterval(Long backupInterval) {
            this.backupInterval = backupInterval;
            return this;
        }

        /**
         * <p>The batch size for model training.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder batchSize(Long batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        /**
         * <p>The number of threads used to read the training data.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder dataLoaderWorkers(Long dataLoaderWorkers) {
            this.dataLoaderWorkers = dataLoaderWorkers;
            return this;
        }

        /**
         * <p>The custom parameters for model training.</p>
         * <p>This parameter is required.</p>
         */
        public Builder evaluator(CustomParams evaluator) {
            this.evaluator = evaluator;
            return this;
        }

        /**
         * <p>The image size. The array contains the width and height of the image.</p>
         * <p>This parameter is required.</p>
         */
        public Builder inputSize(java.util.List<Long> inputSize) {
            this.inputSize = inputSize;
            return this;
        }

        /**
         * <p>The number of epochs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxEpoch(Long maxEpoch) {
            this.maxEpoch = maxEpoch;
            return this;
        }

        /**
         * <p>The optimization algorithm.</p>
         */
        public Builder optimization(Optimization optimization) {
            this.optimization = optimization;
            return this;
        }

        /**
         * <p>The learning rate scheduler.</p>
         */
        public Builder schedule(Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

        public Hyperparameters build() {
            return new Hyperparameters(this);
        } 

    } 

}
