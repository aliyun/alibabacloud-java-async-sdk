// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetConsumeOffsetRequest} extends {@link RequestModel}
 *
 * <p>ResetConsumeOffsetRequest</p>
 */
public class ResetConsumeOffsetRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("consumerGroupId")
    @Validation(required = true)
    private String consumerGroupId;

    @Path
    @NameInMap("topicName")
    @Validation(required = true)
    private String topicName;

    @Body
    @NameInMap("resetTime")
    private String resetTime;

    @Body
    @NameInMap("resetType")
    private String resetType;

    private ResetConsumeOffsetRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.consumerGroupId = builder.consumerGroupId;
        this.topicName = builder.topicName;
        this.resetTime = builder.resetTime;
        this.resetType = builder.resetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetConsumeOffsetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * @return resetTime
     */
    public String getResetTime() {
        return this.resetTime;
    }

    /**
     * @return resetType
     */
    public String getResetType() {
        return this.resetType;
    }

    public static final class Builder extends Request.Builder<ResetConsumeOffsetRequest, Builder> {
        private String instanceId; 
        private String consumerGroupId; 
        private String topicName; 
        private String resetTime; 
        private String resetType; 

        private Builder() {
            super();
        } 

        private Builder(ResetConsumeOffsetRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.consumerGroupId = request.consumerGroupId;
            this.topicName = request.topicName;
            this.resetTime = request.resetTime;
            this.resetType = request.resetType;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The consumer group ID.
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putPathParameter("consumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * The topic name.
         */
        public Builder topicName(String topicName) {
            this.putPathParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        /**
         * The time when the consumer offset is reset.
         */
        public Builder resetTime(String resetTime) {
            this.putBodyParameter("resetTime", resetTime);
            this.resetTime = resetTime;
            return this;
        }

        /**
         * The method that is used to reset the consumer offset. Valid values: LATEST_OFFSET and SPECIFIED_TIME.
         */
        public Builder resetType(String resetType) {
            this.putBodyParameter("resetType", resetType);
            this.resetType = resetType;
            return this;
        }

        @Override
        public ResetConsumeOffsetRequest build() {
            return new ResetConsumeOffsetRequest(this);
        } 

    } 

}
