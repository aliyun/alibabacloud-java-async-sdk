// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link CreateTopicRequest} extends {@link RequestModel}
 *
 * <p>CreateTopicRequest</p>
 */
public class CreateTopicRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("topicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxSendTps")
    private Long maxSendTps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messageType")
    private String messageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private CreateTopicRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.topicName = builder.topicName;
        this.maxSendTps = builder.maxSendTps;
        this.messageType = builder.messageType;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTopicRequest create() {
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
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * @return maxSendTps
     */
    public Long getMaxSendTps() {
        return this.maxSendTps;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<CreateTopicRequest, Builder> {
        private String instanceId; 
        private String topicName; 
        private Long maxSendTps; 
        private String messageType; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(CreateTopicRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.topicName = request.topicName;
            this.maxSendTps = request.maxSendTps;
            this.messageType = request.messageType;
            this.remark = request.remark;
        } 

        /**
         * <p>The ID of the instance to which the topic to be created belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the topic to be created, used for identifying the topic, and it must be globally unique.</p>
         * <p>Value specifications are as follows:</p>
         * <ul>
         * <li>Character restrictions: Supports letters a~z or A~Z, numbers 0~9, and underscores (_), hyphens (-).</li>
         * <li>Length restrictions: 1 to 60 characters.</li>
         * </ul>
         * <p>For reserved character restrictions, please refer to <a href="https://help.aliyun.com/document_detail/440347.html">Parameter Restrictions</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_test</p>
         */
        public Builder topicName(String topicName) {
            this.putPathParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        /**
         * <p>The maximum TPS for message sending.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        public Builder maxSendTps(Long maxSendTps) {
            this.putBodyParameter("maxSendTps", maxSendTps);
            this.maxSendTps = maxSendTps;
            return this;
        }

        /**
         * <p>The type of messages in the topic that you want to create.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>TRANSACTION: transactional messages</li>
         * <li>FIFO: ordered messages</li>
         * <li>DELAY: scheduled or delayed messages</li>
         * <li>NORMAL: normal messages</li>
         * </ul>
         * <blockquote>
         * <p> The type of messages in the topic must be the same as the type of messages that you want to send. For example, if you create a topic whose message type is ordered messages, you can use the topic to send and receive only ordered messages.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder messageType(String messageType) {
            this.putBodyParameter("messageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * <p>The description of the topic that you want to create.</p>
         * 
         * <strong>example:</strong>
         * <p>This is the remark for test.</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public CreateTopicRequest build() {
            return new CreateTopicRequest(this);
        } 

    } 

}
