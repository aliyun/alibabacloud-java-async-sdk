// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link SetQueueAttributesRequest} extends {@link RequestModel}
 *
 * <p>SetQueueAttributesRequest</p>
 */
public class SetQueueAttributesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelaySeconds")
    private Long delaySeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DlqPolicy")
    private DlqPolicy dlqPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableLogging")
    private Boolean enableLogging;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumMessageSize")
    private Long maximumMessageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageRetentionPeriod")
    private Long messageRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PollingWaitSeconds")
    private Long pollingWaitSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VisibilityTimeout")
    private Long visibilityTimeout;

    private SetQueueAttributesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.delaySeconds = builder.delaySeconds;
        this.dlqPolicy = builder.dlqPolicy;
        this.enableLogging = builder.enableLogging;
        this.maximumMessageSize = builder.maximumMessageSize;
        this.messageRetentionPeriod = builder.messageRetentionPeriod;
        this.pollingWaitSeconds = builder.pollingWaitSeconds;
        this.queueName = builder.queueName;
        this.visibilityTimeout = builder.visibilityTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetQueueAttributesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return delaySeconds
     */
    public Long getDelaySeconds() {
        return this.delaySeconds;
    }

    /**
     * @return dlqPolicy
     */
    public DlqPolicy getDlqPolicy() {
        return this.dlqPolicy;
    }

    /**
     * @return enableLogging
     */
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    /**
     * @return maximumMessageSize
     */
    public Long getMaximumMessageSize() {
        return this.maximumMessageSize;
    }

    /**
     * @return messageRetentionPeriod
     */
    public Long getMessageRetentionPeriod() {
        return this.messageRetentionPeriod;
    }

    /**
     * @return pollingWaitSeconds
     */
    public Long getPollingWaitSeconds() {
        return this.pollingWaitSeconds;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return visibilityTimeout
     */
    public Long getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    public static final class Builder extends Request.Builder<SetQueueAttributesRequest, Builder> {
        private String regionId; 
        private Long delaySeconds; 
        private DlqPolicy dlqPolicy; 
        private Boolean enableLogging; 
        private Long maximumMessageSize; 
        private Long messageRetentionPeriod; 
        private Long pollingWaitSeconds; 
        private String queueName; 
        private Long visibilityTimeout; 

        private Builder() {
            super();
        } 

        private Builder(SetQueueAttributesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.delaySeconds = request.delaySeconds;
            this.dlqPolicy = request.dlqPolicy;
            this.enableLogging = request.enableLogging;
            this.maximumMessageSize = request.maximumMessageSize;
            this.messageRetentionPeriod = request.messageRetentionPeriod;
            this.pollingWaitSeconds = request.pollingWaitSeconds;
            this.queueName = request.queueName;
            this.visibilityTimeout = request.visibilityTimeout;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The period after which all messages sent to the queue are consumed. Valid values: 0 to 604800. Unit: seconds. Default value: 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder delaySeconds(Long delaySeconds) {
            this.putQueryParameter("DelaySeconds", delaySeconds);
            this.delaySeconds = delaySeconds;
            return this;
        }

        /**
         * DlqPolicy.
         */
        public Builder dlqPolicy(DlqPolicy dlqPolicy) {
            String dlqPolicyShrink = shrink(dlqPolicy, "DlqPolicy", "json");
            this.putQueryParameter("DlqPolicy", dlqPolicyShrink);
            this.dlqPolicy = dlqPolicy;
            return this;
        }

        /**
         * <p>Specifies whether to enable the log management feature. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled. Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder enableLogging(Boolean enableLogging) {
            this.putQueryParameter("EnableLogging", enableLogging);
            this.enableLogging = enableLogging;
            return this;
        }

        /**
         * <p>The maximum length of the message that is sent to the queue. Valid values: 1024 to 65536. Unit: bytes. Default value: 65536.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder maximumMessageSize(Long maximumMessageSize) {
            this.putQueryParameter("MaximumMessageSize", maximumMessageSize);
            this.maximumMessageSize = maximumMessageSize;
            return this;
        }

        /**
         * <p>The maximum duration for which a message is retained in the queue. After the specified retention period ends, the message is deleted regardless of whether the message is received. Valid values: 60 to 604800. Unit: seconds. Default value: 345600.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder messageRetentionPeriod(Long messageRetentionPeriod) {
            this.putQueryParameter("MessageRetentionPeriod", messageRetentionPeriod);
            this.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }

        /**
         * <p>The maximum duration for which long polling requests are held after the ReceiveMessage operation is called. Valid values: 0 to 30. Unit: seconds. Default value: 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pollingWaitSeconds(Long pollingWaitSeconds) {
            this.putQueryParameter("PollingWaitSeconds", pollingWaitSeconds);
            this.pollingWaitSeconds = pollingWaitSeconds;
            return this;
        }

        /**
         * <p>The name of the queue.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testqueue</p>
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * <p>The duration for which a message stays in the Inactive state after the message is received from the queue. Valid values: 1 to 43200. Unit: seconds. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder visibilityTimeout(Long visibilityTimeout) {
            this.putQueryParameter("VisibilityTimeout", visibilityTimeout);
            this.visibilityTimeout = visibilityTimeout;
            return this;
        }

        @Override
        public SetQueueAttributesRequest build() {
            return new SetQueueAttributesRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetQueueAttributesRequest} extends {@link TeaModel}
     *
     * <p>SetQueueAttributesRequest</p>
     */
    public static class DlqPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeadLetterTargetQueue")
        private String deadLetterTargetQueue;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("MaxReceiveCount")
        private Integer maxReceiveCount;

        private DlqPolicy(Builder builder) {
            this.deadLetterTargetQueue = builder.deadLetterTargetQueue;
            this.enabled = builder.enabled;
            this.maxReceiveCount = builder.maxReceiveCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DlqPolicy create() {
            return builder().build();
        }

        /**
         * @return deadLetterTargetQueue
         */
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return maxReceiveCount
         */
        public Integer getMaxReceiveCount() {
            return this.maxReceiveCount;
        }

        public static final class Builder {
            private String deadLetterTargetQueue; 
            private Boolean enabled; 
            private Integer maxReceiveCount; 

            /**
             * DeadLetterTargetQueue.
             */
            public Builder deadLetterTargetQueue(String deadLetterTargetQueue) {
                this.deadLetterTargetQueue = deadLetterTargetQueue;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * MaxReceiveCount.
             */
            public Builder maxReceiveCount(Integer maxReceiveCount) {
                this.maxReceiveCount = maxReceiveCount;
                return this;
            }

            public DlqPolicy build() {
                return new DlqPolicy(this);
            } 

        } 

    }
}
