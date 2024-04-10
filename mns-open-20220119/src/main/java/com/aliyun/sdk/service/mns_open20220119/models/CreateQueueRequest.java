// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQueueRequest} extends {@link RequestModel}
 *
 * <p>CreateQueueRequest</p>
 */
public class CreateQueueRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DelaySeconds")
    private Long delaySeconds;

    @Query
    @NameInMap("EnableLogging")
    private Boolean enableLogging;

    @Query
    @NameInMap("MaximumMessageSize")
    private Long maximumMessageSize;

    @Query
    @NameInMap("MessageRetentionPeriod")
    private Long messageRetentionPeriod;

    @Query
    @NameInMap("PollingWaitSeconds")
    private Long pollingWaitSeconds;

    @Query
    @NameInMap("QueueName")
    @Validation(required = true)
    private String queueName;

    @Query
    @NameInMap("VisibilityTimeout")
    private Long visibilityTimeout;

    private CreateQueueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.delaySeconds = builder.delaySeconds;
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

    public static CreateQueueRequest create() {
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

    public static final class Builder extends Request.Builder<CreateQueueRequest, Builder> {
        private String regionId; 
        private Long delaySeconds; 
        private Boolean enableLogging; 
        private Long maximumMessageSize; 
        private Long messageRetentionPeriod; 
        private Long pollingWaitSeconds; 
        private String queueName; 
        private Long visibilityTimeout; 

        private Builder() {
            super();
        } 

        private Builder(CreateQueueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.delaySeconds = request.delaySeconds;
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
         * VisibilityTimeout.
         */
        public Builder visibilityTimeout(Long visibilityTimeout) {
            this.putQueryParameter("VisibilityTimeout", visibilityTimeout);
            this.visibilityTimeout = visibilityTimeout;
            return this;
        }

        @Override
        public CreateQueueRequest build() {
            return new CreateQueueRequest(this);
        } 

    } 

}
