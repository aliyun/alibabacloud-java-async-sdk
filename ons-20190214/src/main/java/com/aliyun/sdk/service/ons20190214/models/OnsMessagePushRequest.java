// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsMessagePushRequest} extends {@link RequestModel}
 *
 * <p>OnsMessagePushRequest</p>
 */
public class OnsMessagePushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String msgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the consumer client. You can call the <a href="https://help.aliyun.com/document_detail/29598.html">OnsConsumerGetConnection</a> operation to query client IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30.5.121.**@24813#-1999745829#-1737591554#453111174894656</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The ID of the consumer group. For information about what a consumer group is, see <a href="https://help.aliyun.com/document_detail/29533.html">Terms</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test_group_id</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for RocketMQ instance to which the specified consumer group belongs.</p>
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
         * <p>The ID of the message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0BC1669963053CF68F733BB70396****</p>
         */
        public Builder msgId(String msgId) {
            this.putQueryParameter("MsgId", msgId);
            this.msgId = msgId;
            return this;
        }

        /**
         * <p>The topic to which the message is pushed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-mq_topic</p>
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
