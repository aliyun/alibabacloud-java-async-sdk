// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessagePushRequest} extends {@link RequestModel}
 *
 * <p>OnsMessagePushRequest</p>
 */
public class OnsMessagePushRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MsgId")
    @Validation(required = true)
    private String msgId;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private OnsMessagePushRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.msgId = builder.msgId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsMessagePushRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
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
     * @return msgId
     */
    public String getMsgId() {
        return this.msgId;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<OnsMessagePushRequest, Builder> {
        private String clientId; 
        private String groupId; 
        private String instanceId; 
        private String msgId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(OnsMessagePushRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.msgId = request.msgId;
            this.topic = request.topic;
        } 

        /**
         * The ID of the consumer. You can call the [OnsConsumerGetConnection](~~29598~~) operation to query the ID of each consumer in a consumer group.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * The ID of the consumer group. For information about what a consumer group is, see [Terms](~~29533~~).
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the Message Queue for Apache RocketMQ instance to which the specified consumer group belongs.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the message.
         */
        public Builder msgId(String msgId) {
            this.putQueryParameter("MsgId", msgId);
            this.msgId = msgId;
            return this;
        }

        /**
         * The topic to which the message is pushed.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public OnsMessagePushRequest build() {
            return new OnsMessagePushRequest(this);
        } 

    } 

}
