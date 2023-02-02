// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicCreateRequest} extends {@link RequestModel}
 *
 * <p>OnsTopicCreateRequest</p>
 */
public class OnsTopicCreateRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MessageType")
    @Validation(required = true)
    private Integer messageType;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private OnsTopicCreateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.messageType = builder.messageType;
        this.remark = builder.remark;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTopicCreateRequest create() {
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
     * @return messageType
     */
    public Integer getMessageType() {
        return this.messageType;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<OnsTopicCreateRequest, Builder> {
        private String instanceId; 
        private Integer messageType; 
        private String remark; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(OnsTopicCreateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.messageType = request.messageType;
            this.remark = request.remark;
            this.topic = request.topic;
        } 

        /**
         * The ID of the instance in which you want to create the topic.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the message. Valid values:
         * <p>
         * 
         * *   **0**: normal messages
         * *   **1**: partitionally ordered messages
         * *   **2**: globally ordered messages
         * *   **4**: transactional messages
         * *   **5**: scheduled or delayed messages
         * 
         * For more information about message types, see [Message types](~~155952~~).
         */
        public Builder messageType(Integer messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * The description of the topic that you want to create.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The name of the topic that you want to create. The name must meet the following rules:
         * <p>
         * 
         * *   The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).
         * *   The topic name cannot start with CID or GID because CID and GID are reserved prefixes for group IDs.
         * *   If the Message Queue for Apache RocketMQ instance in which you want to create the topic uses a namespace, the topic name must be unique in the instance. The topic name cannot be the same as an existing topic name or a group ID in the instance. The topic name can be the same as a topic name or a group ID in another instance that uses a different namespace. For example, if Instance A and Instance B use different namespaces, a topic name in Instance A can be the same as a topic name or a group ID in Instance B.
         * *   If the instance in which you want to create the topic does not use a namespace, the topic name must be globally unique across instances and regions. The topic name cannot be the same as an existing topic name or group ID in Message Queue for Apache RocketMQ instances that belong to your Alibaba Cloud account.
         * 
         * >  To check whether an instance uses a namespace, log on to the Message Queue for Apache RocketMQ console, go to the **Instance Details** page, and then view the value of the Namespace field in the **Basic Information** section.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public OnsTopicCreateRequest build() {
            return new OnsTopicCreateRequest(this);
        } 

    } 

}
