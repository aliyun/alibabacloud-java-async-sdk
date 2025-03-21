// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

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
 * {@link OnsConsumerResetOffsetRequest} extends {@link RequestModel}
 *
 * <p>OnsConsumerResetOffsetRequest</p>
 */
public class OnsConsumerResetOffsetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetTimestamp")
    private Long resetTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the consumer group whose dead-letter message you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test_consumer_id</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the instance to which the consumer group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The timestamp to which you want to reset the consumer offset. This parameter takes effect only when the <strong>Type</strong> parameter is set to <strong>1</strong>. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1591153871000</p>
         */
        public Builder resetTimestamp(Long resetTimestamp) {
            this.putQueryParameter("ResetTimestamp", resetTimestamp);
            this.resetTimestamp = resetTimestamp;
            return this;
        }

        /**
         * <p>The name of the topic for which you want to reset the consumer offset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-mq-topic</p>
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * <p>The method that you want to use to clear accumulated messages. Valid values:</p>
         * <ul>
         * <li><strong>0:</strong> All accumulated messages are cleared. Messages that are not consumed are ignored. Consumers in the specified consumer group consume only messages that are published to the topic after the specified point in time.</li>
         * </ul>
         * <p>If &quot;reconsumeLater&quot; is returned, the accumulated messages are not cleared because the system is retrying to resend the messages to consumers.</p>
         * <ul>
         * <li><strong>1:</strong> The messages that were published to the topic before the specified point in time are cleared. You must specify a point in time. Consumers in the specified consumer group consume only the messages that are published to the topic after the specified point in time.</li>
         * </ul>
         * <p>You can specify a point in time from the earliest point in time when a message was published to the topic to the most recent point in time when a message was published to the topic. Points in time that are not within the allowed time range are invalid.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
