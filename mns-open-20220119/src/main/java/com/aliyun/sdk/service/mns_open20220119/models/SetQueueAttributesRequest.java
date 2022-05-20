// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetQueueAttributesRequest} extends {@link RequestModel}
 *
 * <p>SetQueueAttributesRequest</p>
 */
public class SetQueueAttributesRequest extends Request {
    @Query
    @NameInMap("DelaySeconds")
    @Validation(required = true)
    private Long delaySeconds;

    @Query
    @NameInMap("EnableLogging")
    @Validation(required = true)
    private Boolean enableLogging;

    @Query
    @NameInMap("MaximumMessageSize")
    @Validation(required = true)
    private Long maximumMessageSize;

    @Query
    @NameInMap("MessageRetentionPeriod")
    @Validation(required = true)
    private Long messageRetentionPeriod;

    @Query
    @NameInMap("PollingWaitSeconds")
    @Validation(required = true)
    private Long pollingWaitSeconds;

    @Query
    @NameInMap("QueueName")
    @Validation(required = true)
    private String queueName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("VisibilityTimeout")
    @Validation(required = true)
    private Long visibilityTimeout;

    private SetQueueAttributesRequest(Builder builder) {
        super(builder);
        this.delaySeconds = builder.delaySeconds;
        this.enableLogging = builder.enableLogging;
        this.maximumMessageSize = builder.maximumMessageSize;
        this.messageRetentionPeriod = builder.messageRetentionPeriod;
        this.pollingWaitSeconds = builder.pollingWaitSeconds;
        this.queueName = builder.queueName;
        this.regionId = builder.regionId;
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
     * @return delaySeconds
     */
    public Long getDelaySeconds() {
        return this.delaySeconds;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return visibilityTimeout
     */
    public Long getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    public static final class Builder extends Request.Builder<SetQueueAttributesRequest, Builder> {
        private Long delaySeconds; 
        private Boolean enableLogging; 
        private Long maximumMessageSize; 
        private Long messageRetentionPeriod; 
        private Long pollingWaitSeconds; 
        private String queueName; 
        private String regionId; 
        private Long visibilityTimeout; 

        private Builder() {
            super();
        } 

        private Builder(SetQueueAttributesRequest request) {
            super(request);
            this.delaySeconds = request.delaySeconds;
            this.enableLogging = request.enableLogging;
            this.maximumMessageSize = request.maximumMessageSize;
            this.messageRetentionPeriod = request.messageRetentionPeriod;
            this.pollingWaitSeconds = request.pollingWaitSeconds;
            this.queueName = request.queueName;
            this.regionId = request.regionId;
            this.visibilityTimeout = request.visibilityTimeout;
        } 

        /**
         * DelaySeconds.
         */
        public Builder delaySeconds(Long delaySeconds) {
            this.putQueryParameter("DelaySeconds", delaySeconds);
            this.delaySeconds = delaySeconds;
            return this;
        }

        /**
         * EnableLogging.
         */
        public Builder enableLogging(Boolean enableLogging) {
            this.putQueryParameter("EnableLogging", enableLogging);
            this.enableLogging = enableLogging;
            return this;
        }

        /**
         * MaximumMessageSize.
         */
        public Builder maximumMessageSize(Long maximumMessageSize) {
            this.putQueryParameter("MaximumMessageSize", maximumMessageSize);
            this.maximumMessageSize = maximumMessageSize;
            return this;
        }

        /**
         * MessageRetentionPeriod.
         */
        public Builder messageRetentionPeriod(Long messageRetentionPeriod) {
            this.putQueryParameter("MessageRetentionPeriod", messageRetentionPeriod);
            this.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }

        /**
         * PollingWaitSeconds.
         */
        public Builder pollingWaitSeconds(Long pollingWaitSeconds) {
            this.putQueryParameter("PollingWaitSeconds", pollingWaitSeconds);
            this.pollingWaitSeconds = pollingWaitSeconds;
            return this;
        }

        /**
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
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
         * VisibilityTimeout.
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

}
