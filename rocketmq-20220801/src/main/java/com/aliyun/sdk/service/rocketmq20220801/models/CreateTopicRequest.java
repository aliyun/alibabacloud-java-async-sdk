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
    @com.aliyun.core.annotation.NameInMap("liteTopicExpiration")
    private Long liteTopicExpiration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxSendTps")
    private Long maxSendTps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private CreateTopicRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.topicName = builder.topicName;
        this.liteTopicExpiration = builder.liteTopicExpiration;
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
     * @return liteTopicExpiration
     */
    public Long getLiteTopicExpiration() {
        return this.liteTopicExpiration;
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
        private Long liteTopicExpiration; 
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
            this.liteTopicExpiration = request.liteTopicExpiration;
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
         * <p>The name of the topic to be created. The name is used to identify the topic and is globally unique.</p>
         * <p>Naming conventions:</p>
         * <ul>
         * <li>Character limit: letters a-z or A-Z, digits 0-9, underscores (_), and hyphens (-).</li>
         * <li>Length limit: 1 to 60 characters.</li>
         * </ul>
         * <p>For reserved character restrictions, see <a href="https://help.aliyun.com/document_detail/440347.html">Parameter limits</a>.</p>
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
         * <p>The expiration time of the lite topic, in minutes.
         * Valid values: 30 to 720.
         * Default value: -1, which indicates the topic never expires.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder liteTopicExpiration(Long liteTopicExpiration) {
            this.putBodyParameter("liteTopicExpiration", liteTopicExpiration);
            this.liteTopicExpiration = liteTopicExpiration;
            return this;
        }

        /**
         * <p>The maximum transactions per second (TPS) for sending messages.</p>
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
         * <p>The message type of the topic to be created.</p>
         * <blockquote>
         * <p>Notice: The type of the topic must be the same as the type of messages sent to the topic. For example, if you create a topic of the ordered message type, the topic can be used only to send and receive ordered messages, not other types of messages.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The remarks of the topic to be created.</p>
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
