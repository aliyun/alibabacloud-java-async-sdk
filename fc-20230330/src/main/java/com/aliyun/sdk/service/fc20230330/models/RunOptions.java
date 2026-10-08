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
         * <p>The batch window configurations.</p>
         */
        public Builder batchWindow(BatchWindow batchWindow) {
            this.batchWindow = batchWindow;
            return this;
        }

        /**
         * <p>Whether to enable dead-letter queues. If you configure this parameter, dead-letter queues are enabled. By default, dead-letter queues are not enabled and messages are discarded when the retry policy is exhausted. Queues of Simple Message Queue (formerly MNS), ApsaraMQ for RocketMQ, and ApsaraMQ for Kafka, and EventBridge event buses can be used as dead-letter queues.</p>
         */
        public Builder deadLetterQueue(DeadLetterQueue deadLetterQueue) {
            this.deadLetterQueue = deadLetterQueue;
            return this;
        }

        /**
         * <p>The fault tolerance policy. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong>: does not tolerate exceptions.</li>
         * <li><strong>ALL</strong>: tolerates all exceptions.</li>
         * </ul>
         * <blockquote>
         * <p> The default value is <strong>NONE</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder errorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }

        /**
         * <p>The underlying application mode when message data is pushed to Function Compute. Valid values:</p>
         * <ul>
         * <li><strong>event-streaming</strong>: the event streaming mode. In this mode, events are pushed in arrays. One or more message events are pushed to the function in batches based on your push configurations. This mode is suitable for end-to-end streaming data processing scenarios. The event streaming mode supports the following event sources: Simple Message Queue (formerly MNS), ApsaraMQ for RocketMQ, ApsaraMQ for RabbitMQ, ApsaraMQ for Kafka, ApsaraMQ for MQTT, and Data Transmission Service (DTS).</li>
         * <li><strong>event-driven</strong>: the event mode. In event mode, a single message is passed to the function as event parameters at a time. Events follow the CloudEvents specifications. The event mode supports the following event sources: Default, Simple Message Queue (formerly MNS), ApsaraMQ for RocketMQ, and ApsaraMQ for RabbitMQ. In this mode, batch configurations are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>event-streaming</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>The retry policy that you want to use if events fail to be pushed.</p>
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
