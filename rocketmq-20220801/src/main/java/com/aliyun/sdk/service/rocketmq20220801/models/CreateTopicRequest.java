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
         * <p>The ID of the instance to which the topic belongs.</p>
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
         * <p>The name of the topic. The name is used to identify the topic and is globally unique in the instance.</p>
         * <p>The following describes the naming conventions of a topic:</p>
         * <ul>
         * <li>The name can contain letters, digits, underscores (_), hyphens (-), and percent signs (%).</li>
         * <li>The name must be 1 to 60 characters in length.</li>
         * </ul>
         * <p>For information about the characters reserved for the system, see <a href="https://help.aliyun.com/document_detail/440347.html">Limits on parameters</a>.</p>
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
         * maxSendTps.
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
         * <li>DELAY: scheduled messages or delayed Message</li>
         * <li>NORMAL: normal messages</li>
         * </ul>
         * <blockquote>
         * <p>The type of messages in the topic must be the same as the type of messages that you want to send. For example, if you create a topic whose message type is ordered messages, the topic can be used to send and receive only ordered messages.</p>
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
