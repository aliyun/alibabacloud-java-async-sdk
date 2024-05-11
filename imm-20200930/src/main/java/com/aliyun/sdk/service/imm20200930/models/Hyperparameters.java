// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Long > inputSize;

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
    public java.util.List < Long > getInputSize() {
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
        private java.util.List < Long > inputSize; 
        private Long maxEpoch; 
        private Optimization optimization; 
        private Schedule schedule; 

        /**
         * BackupInterval.
         */
        public Builder backupInterval(Long backupInterval) {
            this.backupInterval = backupInterval;
            return this;
        }

        /**
         * BatchSize.
         */
        public Builder batchSize(Long batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        /**
         * DataLoaderWorkers.
         */
        public Builder dataLoaderWorkers(Long dataLoaderWorkers) {
            this.dataLoaderWorkers = dataLoaderWorkers;
            return this;
        }

        /**
         * Evaluator.
         */
        public Builder evaluator(CustomParams evaluator) {
            this.evaluator = evaluator;
            return this;
        }

        /**
         * InputSize.
         */
        public Builder inputSize(java.util.List < Long > inputSize) {
            this.inputSize = inputSize;
            return this;
        }

        /**
         * MaxEpoch.
         */
        public Builder maxEpoch(Long maxEpoch) {
            this.maxEpoch = maxEpoch;
            return this;
        }

        /**
         * Optimization.
         */
        public Builder optimization(Optimization optimization) {
            this.optimization = optimization;
            return this;
        }

        /**
         * Schedule.
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
