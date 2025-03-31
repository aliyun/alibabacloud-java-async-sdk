// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link RunOptions} extends {@link TeaModel}
 *
 * <p>RunOptions</p>
 */
public class RunOptions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("batchWindow")
    private BatchWindow batchWindow;

    @com.aliyun.core.annotation.NameInMap("deadLetterQueue")
    private DeadLetterQueue deadLetterQueue;

    @com.aliyun.core.annotation.NameInMap("errorsTolerance")
    private String errorsTolerance;

    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("retryStrategy")
    private RetryStrategy retryStrategy;

    private RunOptions(Builder builder) {
        this.batchWindow = builder.batchWindow;
        this.deadLetterQueue = builder.deadLetterQueue;
        this.errorsTolerance = builder.errorsTolerance;
        this.mode = builder.mode;
        this.retryStrategy = builder.retryStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunOptions create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchWindow
     */
    public BatchWindow getBatchWindow() {
        return this.batchWindow;
    }

    /**
     * @return deadLetterQueue
     */
    public DeadLetterQueue getDeadLetterQueue() {
        return this.deadLetterQueue;
    }

    /**
     * @return errorsTolerance
     */
    public String getErrorsTolerance() {
        return this.errorsTolerance;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return retryStrategy
     */
    public RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    public static final class Builder {
        private BatchWindow batchWindow; 
        private DeadLetterQueue deadLetterQueue; 
        private String errorsTolerance; 
        private String mode; 
        private RetryStrategy retryStrategy; 

        private Builder() {
        } 

        private Builder(RunOptions model) {
            this.batchWindow = model.batchWindow;
            this.deadLetterQueue = model.deadLetterQueue;
            this.errorsTolerance = model.errorsTolerance;
            this.mode = model.mode;
            this.retryStrategy = model.retryStrategy;
        } 

        /**
         * batchWindow.
         */
        public Builder batchWindow(BatchWindow batchWindow) {
            this.batchWindow = batchWindow;
            return this;
        }

        /**
         * deadLetterQueue.
         */
        public Builder deadLetterQueue(DeadLetterQueue deadLetterQueue) {
            this.deadLetterQueue = deadLetterQueue;
            return this;
        }

        /**
         * errorsTolerance.
         */
        public Builder errorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * retryStrategy.
         */
        public Builder retryStrategy(RetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }

        public RunOptions build() {
            return new RunOptions(this);
        } 

    } 

}
