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
 * {@link BatchReceiveMessageResponseBody} extends {@link TeaModel}
 *
 * <p>BatchReceiveMessageResponseBody</p>
 */
public class BatchReceiveMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List<Messages> messages;

    private BatchReceiveMessageResponseBody(Builder builder) {
        this.messages = builder.messages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchReceiveMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    public static final class Builder {
        private java.util.List<Messages> messages; 

        private Builder() {
        } 

        private Builder(BatchReceiveMessageResponseBody model) {
            this.messages = model.messages;
        } 

        /**
         * <p>The array of messages.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.messages = messages;
            return this;
        }

        public BatchReceiveMessageResponseBody build() {
            return new BatchReceiveMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchReceiveMessageResponseBody} extends {@link TeaModel}
     *
     * <p>BatchReceiveMessageResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DequeueCount")
        private Long dequeueCount;

        @com.aliyun.core.annotation.NameInMap("EnqueueTime")
        private Long enqueueTime;

        @com.aliyun.core.annotation.NameInMap("FirstDequeueTime")
        private Long firstDequeueTime;

        @com.aliyun.core.annotation.NameInMap("MessageBody")
        private String messageBody;

        @com.aliyun.core.annotation.NameInMap("MessageBodyMD5")
        private String messageBodyMD5;

        @com.aliyun.core.annotation.NameInMap("MessageGroupId")
        private String messageGroupId;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("NextVisibleTime")
        private Long nextVisibleTime;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("ReceiptHandle")
        private String receiptHandle;

        @com.aliyun.core.annotation.NameInMap("UserProperties")
        private java.util.Map<String, MessagesUserPropertiesValue> userProperties;

        private Messages(Builder builder) {
            this.dequeueCount = builder.dequeueCount;
            this.enqueueTime = builder.enqueueTime;
            this.firstDequeueTime = builder.firstDequeueTime;
            this.messageBody = builder.messageBody;
            this.messageBodyMD5 = builder.messageBodyMD5;
            this.messageGroupId = builder.messageGroupId;
            this.messageId = builder.messageId;
            this.nextVisibleTime = builder.nextVisibleTime;
            this.priority = builder.priority;
            this.receiptHandle = builder.receiptHandle;
            this.userProperties = builder.userProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return dequeueCount
         */
        public Long getDequeueCount() {
            return this.dequeueCount;
        }

        /**
         * @return enqueueTime
         */
        public Long getEnqueueTime() {
            return this.enqueueTime;
        }

        /**
         * @return firstDequeueTime
         */
        public Long getFirstDequeueTime() {
            return this.firstDequeueTime;
        }

        /**
         * @return messageBody
         */
        public String getMessageBody() {
            return this.messageBody;
        }

        /**
         * @return messageBodyMD5
         */
        public String getMessageBodyMD5() {
            return this.messageBodyMD5;
        }

        /**
         * @return messageGroupId
         */
        public String getMessageGroupId() {
            return this.messageGroupId;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return nextVisibleTime
         */
        public Long getNextVisibleTime() {
            return this.nextVisibleTime;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return receiptHandle
         */
        public String getReceiptHandle() {
            return this.receiptHandle;
        }

        /**
         * @return userProperties
         */
        public java.util.Map<String, MessagesUserPropertiesValue> getUserProperties() {
            return this.userProperties;
        }

        public static final class Builder {
            private Long dequeueCount; 
            private Long enqueueTime; 
            private Long firstDequeueTime; 
            private String messageBody; 
            private String messageBodyMD5; 
            private String messageGroupId; 
            private String messageId; 
            private Long nextVisibleTime; 
            private Long priority; 
            private String receiptHandle; 
            private java.util.Map<String, MessagesUserPropertiesValue> userProperties; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.dequeueCount = model.dequeueCount;
                this.enqueueTime = model.enqueueTime;
                this.firstDequeueTime = model.firstDequeueTime;
                this.messageBody = model.messageBody;
                this.messageBodyMD5 = model.messageBodyMD5;
                this.messageGroupId = model.messageGroupId;
                this.messageId = model.messageId;
                this.nextVisibleTime = model.nextVisibleTime;
                this.priority = model.priority;
                this.receiptHandle = model.receiptHandle;
                this.userProperties = model.userProperties;
            } 

            /**
             * <p>The total number of times the message has been consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dequeueCount(Long dequeueCount) {
                this.dequeueCount = dequeueCount;
                return this;
            }

            /**
             * <p>The time when the message was sent to the queue, in milliseconds since 1970-01-01 00:00:00 000.</p>
             * 
             * <strong>example:</strong>
             * <p>1250700979348</p>
             */
            public Builder enqueueTime(Long enqueueTime) {
                this.enqueueTime = enqueueTime;
                return this;
            }

            /**
             * <p>The time when the message was first consumed, in milliseconds (timestamp). If <code>DequeueCount=0</code>, this value is the same as <code>EnqueueTime</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1250700979348</p>
             */
            public Builder firstDequeueTime(Long firstDequeueTime) {
                this.firstDequeueTime = firstDequeueTime;
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
             * <p>The MD5 hash of the message body.</p>
             * 
             * <strong>example:</strong>
             * <p>C5DD56A39F5F7BB8B3337C6D11B6D8BE</p>
             */
            public Builder messageBodyMD5(String messageBodyMD5) {
                this.messageBodyMD5 = messageBodyMD5;
                return this;
            }

            /**
             * <p>The message group ID. This parameter applies only to FIFO queues.</p>
             * 
             * <strong>example:</strong>
             * <p>test-group</p>
             */
            public Builder messageGroupId(String messageGroupId) {
                this.messageGroupId = messageGroupId;
                return this;
            }

            /**
             * <p>The message ID, which is unique within a queue.</p>
             * 
             * <strong>example:</strong>
             * <p>5F290C926D472878214D9529A8FA200000001</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The time when the message becomes available for consumption again, in milliseconds (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1250700979348</p>
             */
            public Builder nextVisibleTime(Long nextVisibleTime) {
                this.nextVisibleTime = nextVisibleTime;
                return this;
            }

            /**
             * <p>The priority of the message. 1 indicates the highest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The temporary handle generated for this message retrieval. This handle is used to delete or modify Inactive messages and is valid until NextVisibleTime.</p>
             * 
             * <strong>example:</strong>
             * <p>1-ODU4OTkzNDU5My0xNDMyNzI3ODI3LTItOA==</p>
             */
            public Builder receiptHandle(String receiptHandle) {
                this.receiptHandle = receiptHandle;
                return this;
            }

            /**
             * <p>The user-defined properties in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;properties1&quot;:&quot;value&quot;}</p>
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
