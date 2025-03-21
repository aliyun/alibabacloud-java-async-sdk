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
 * {@link OnsTopicCreateRequest} extends {@link RequestModel}
 *
 * <p>OnsTopicCreateRequest</p>
 */
public class OnsTopicCreateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer messageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the instance in which you want to create the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_188077086902****_BXSuW61e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of messages that you want to publish to the topic. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: normal messages</li>
         * <li><strong>1</strong>: partitionally ordered messages</li>
         * <li><strong>2</strong>: globally ordered messages</li>
         * <li><strong>4</strong>: transactional messages</li>
         * <li><strong>5</strong>: scheduled or delayed messages</li>
         * </ul>
         * <p>For more information about message types, see <a href="https://help.aliyun.com/document_detail/155952.html">Message types</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder messageType(Integer messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * <p>The description of the topic that you want to create.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The name of the topic that you want to create. The name must meet the following rules:</p>
         * <ul>
         * <li>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The topic name cannot start with CID or GID because CID and GID are reserved prefixes for group IDs.</li>
         * <li>If the ApsaraMQ for RocketMQ instance in which you want to create the topic uses a namespace, the topic name must be unique in the instance. The topic name cannot be the same as an existing topic name or a group ID in the instance. The topic name can be the same as a topic name or a group ID in another instance that uses a different namespace. For example, if Instance A and Instance B use different namespaces, a topic name in Instance A can be the same as a topic name or a group ID in Instance B.</li>
         * <li>If the instance in which you want to create the topic does not use a namespace, the topic name must be globally unique across instances and regions. The topic name cannot be the same as an existing topic name or group ID in all ApsaraMQ for RocketMQ instances that belong to your Alibaba Cloud account.</li>
         * </ul>
         * <blockquote>
         * <p>To check whether an instance uses a namespace, log on to the ApsaraMQ for RocketMQ console, go to the <strong>Instance Details</strong> page, and then view the value of the Namespace field in the <strong>Basic Information</strong> section.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
