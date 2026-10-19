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
 * {@link BatchSendMessageRequest} extends {@link RequestModel}
 *
 * <p>BatchSendMessageRequest</p>
 */
public class BatchSendMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("queueName")
    private String queueName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List<Messages> messages;

    private BatchSendMessageRequest(Builder builder) {
        super(builder);
        this.queueName = builder.queueName;
        this.messages = builder.messages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSendMessageRequest create() {
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
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    public static final class Builder extends Request.Builder<BatchSendMessageRequest, Builder> {
        private String queueName; 
        private java.util.List<Messages> messages; 

        private Builder() {
            super();
        } 

        private Builder(BatchSendMessageRequest request) {
            super(request);
            this.queueName = request.queueName;
            this.messages = request.messages;
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
         * <p>The message list.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("Messages", messages);
            this.messages = messages;
            return this;
        }

        @Override
        public BatchSendMessageRequest build() {
            return new BatchSendMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchSendMessageRequest} extends {@link TeaModel}
     *
     * <p>BatchSendMessageRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelaySeconds")
        private Integer delaySeconds;

        @com.aliyun.core.annotation.NameInMap("MessageBody")
        private String messageBody;

        @com.aliyun.core.annotation.NameInMap("MessageGroupId")
        private String messageGroupId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("UserProperties")
        private java.util.Map<String, MessagesUserPropertiesValue> userProperties;

        private Messages(Builder builder) {
            this.delaySeconds = builder.delaySeconds;
            this.messageBody = builder.messageBody;
            this.messageGroupId = builder.messageGroupId;
            this.priority = builder.priority;
            this.userProperties = builder.userProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
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
        public java.util.Map<String, MessagesUserPropertiesValue> getUserProperties() {
            return this.userProperties;
        }

        public static final class Builder {
            private Integer delaySeconds; 
            private String messageBody; 
            private String messageGroupId; 
            private Integer priority; 
            private java.util.Map<String, MessagesUserPropertiesValue> userProperties; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.delaySeconds = model.delaySeconds;
                this.messageBody = model.messageBody;
                this.messageGroupId = model.messageGroupId;
                this.priority = model.priority;
                this.userProperties = model.userProperties;
            } 

            /**
             * <p>The delay in seconds before the message becomes consumable.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder delaySeconds(Integer delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * <p>The message body.</p>
             * 
             * <strong>example:</strong>
             * <p>This is test message 1.</p>
             */
            public Builder messageBody(String messageBody) {
                this.messageBody = messageBody;
                return this;
            }

            /**
             * <p>The message group ID. Messages within the same group are delivered in order. This parameter is valid only for FIFO queues.</p>
             * 
             * <strong>example:</strong>
             * <p>group1</p>
             */
            public Builder messageGroupId(String messageGroupId) {
                this.messageGroupId = messageGroupId;
                return this;
            }

            /**
             * <p>The priority. A smaller value indicates a higher priority. The value 1 represents the highest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * UserProperties.
             */
            public Builder userProperties(java.util.Map<String, MessagesUserPropertiesValue> userProperties) {
                this.userProperties = userProperties;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
