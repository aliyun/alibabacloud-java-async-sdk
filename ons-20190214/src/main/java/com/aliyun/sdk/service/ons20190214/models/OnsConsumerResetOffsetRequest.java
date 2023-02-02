// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerResetOffsetRequest} extends {@link RequestModel}
 *
 * <p>OnsConsumerResetOffsetRequest</p>
 */
public class OnsConsumerResetOffsetRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ResetTimestamp")
    private Long resetTimestamp;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    private OnsConsumerResetOffsetRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.resetTimestamp = builder.resetTimestamp;
        this.topic = builder.topic;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsConsumerResetOffsetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resetTimestamp
     */
    public Long getResetTimestamp() {
        return this.resetTimestamp;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OnsConsumerResetOffsetRequest, Builder> {
        private String groupId; 
        private String instanceId; 
        private Long resetTimestamp; 
        private String topic; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(OnsConsumerResetOffsetRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.resetTimestamp = request.resetTimestamp;
            this.topic = request.topic;
            this.type = request.type;
        } 

        /**
         * The ID of the consumer group for which you want to reset the consumer offset.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the instance to which the consumer group belongs.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The timestamp to which you want to reset the consumer offset. This parameter takes effect only when the **Type** parameter is set to **1**. Unit: milliseconds.
         */
        public Builder resetTimestamp(Long resetTimestamp) {
            this.putQueryParameter("ResetTimestamp", resetTimestamp);
            this.resetTimestamp = resetTimestamp;
            return this;
        }

        /**
         * The name of the topic for which you want to reset the consumer offset.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * The method that you want to use to clear accumulated messages. Valid values:
         * <p>
         * 
         * *   **0:** All accumulated messages are cleared. Messages that are not consumed are ignored. Consumers in the specified consumer group consume only messages that are published to the topic after the current point in time.
         * 
         * If "reconsumeLater" is returned, the accumulated messages are not cleared because the system is retrying to send the messages to consumers.
         * 
         * *   **1:** The messages that were published to the topic before a specified point in time are cleared. You must specify a point in time. Consumers in the specified consumer group consume only the messages that are published to the topic after the specified point in time.
         * 
         * You can specify a point in time within the time range that is from the earliest point in time when a message was published to the topic to the most recent point in time when a message was published to the topic. Points in time that are not within the allowed time range are invalid.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OnsConsumerResetOffsetRequest build() {
            return new OnsConsumerResetOffsetRequest(this);
        } 

    } 

}
