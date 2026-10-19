// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smqproxy20260409.models;

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
 * {@link SendMessageRequest} extends {@link RequestModel}
 *
 * <p>SendMessageRequest</p>
 */
public class SendMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("queueName")
    private String queueName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DelaySeconds")
    private Integer delaySeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageBody")
    private String messageBody;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageGroupId")
    private String messageGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserProperties")
    private java.util.Map<String, UserPropertiesValue> userProperties;

    private SendMessageRequest(Builder builder) {
        super(builder);
        this.queueName = builder.queueName;
        this.delaySeconds = builder.delaySeconds;
        this.messageBody = builder.messageBody;
        this.messageGroupId = builder.messageGroupId;
        this.priority = builder.priority;
        this.userProperties = builder.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return delaySeconds
     */
    public Integer getDelaySeconds() {
        return this.delaySeconds;
    }

    /**
     * @return messageBody
     */
    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * @return messageGroupId
     */
    public String getMessageGroupId() {
        return this.messageGroupId;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return userProperties
     */
    public java.util.Map<String, UserPropertiesValue> getUserProperties() {
        return this.userProperties;
    }

    public static final class Builder extends Request.Builder<SendMessageRequest, Builder> {
        private String queueName; 
        private Integer delaySeconds; 
        private String messageBody; 
        private String messageGroupId; 
        private Integer priority; 
        private java.util.Map<String, UserPropertiesValue> userProperties; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageRequest request) {
            super(request);
            this.queueName = request.queueName;
            this.delaySeconds = request.delaySeconds;
            this.messageBody = request.messageBody;
            this.messageGroupId = request.messageGroupId;
            this.priority = request.priority;
            this.userProperties = request.userProperties;
        } 

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyQueue</p>
         */
        public Builder queueName(String queueName) {
            this.putPathParameter("queueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * <p>The delay period after which the message can be consumed. Unit: seconds. Maximum value: 7 days.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder delaySeconds(Integer delaySeconds) {
            this.putBodyParameter("DelaySeconds", delaySeconds);
            this.delaySeconds = delaySeconds;
            return this;
        }

        /**
         * <p>The message body. We recommend that you Base64-encode the message body in advance to avoid issues with special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Hello MNS&quot;</p>
         */
        public Builder messageBody(String messageBody) {
            this.putBodyParameter("MessageBody", messageBody);
            this.messageBody = messageBody;
            return this;
        }

        /**
         * <p>The message group ID. Messages within the same group are delivered in order. This parameter is valid only for FIFO queues.</p>
         * 
         * <strong>example:</strong>
         * <p>group-123</p>
         */
        public Builder messageGroupId(String messageGroupId) {
            this.putBodyParameter("MessageGroupId", messageGroupId);
            this.messageGroupId = messageGroupId;
            return this;
        }

        /**
         * <p>The message priority. A smaller value indicates a higher priority. The value 1 indicates the highest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The user-defined properties.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;, &quot;key2&quot;:&quot;value2&quot;}</p>
         */
        public Builder userProperties(java.util.Map<String, UserPropertiesValue> userProperties) {
            this.putBodyParameter("UserProperties", userProperties);
            this.userProperties = userProperties;
            return this;
        }

        @Override
        public SendMessageRequest build() {
            return new SendMessageRequest(this);
        } 

    } 

}
