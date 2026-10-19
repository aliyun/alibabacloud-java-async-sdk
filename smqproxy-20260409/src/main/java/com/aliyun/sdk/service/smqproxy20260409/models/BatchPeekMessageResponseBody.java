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
 * {@link BatchPeekMessageResponseBody} extends {@link TeaModel}
 *
 * <p>BatchPeekMessageResponseBody</p>
 */
public class BatchPeekMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List<Messages> messages;

    private BatchPeekMessageResponseBody(Builder builder) {
        this.messages = builder.messages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchPeekMessageResponseBody create() {
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

        private Builder(BatchPeekMessageResponseBody model) {
            this.messages = model.messages;
        } 

        /**
         * <p>The message list.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.messages = messages;
            return this;
        }

        public BatchPeekMessageResponseBody build() {
            return new BatchPeekMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchPeekMessageResponseBody} extends {@link TeaModel}
     *
     * <p>BatchPeekMessageResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

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
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
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
            private Long priority; 
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
                this.priority = model.priority;
                this.userProperties = model.userProperties;
            } 

            /**
             * <p>The total number of times the message has been consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder dequeueCount(Long dequeueCount) {
                this.dequeueCount = dequeueCount;
                return this;
            }

            /**
             * <p>The time when the message was sent to the queue. The value is a UNIX timestamp that starts from 1970-01-01 00:00:00.000.</p>
             * 
             * <strong>example:</strong>
             * <p>1250700979248</p>
             */
            public Builder enqueueTime(Long enqueueTime) {
                this.enqueueTime = enqueueTime;
                return this;
            }

            /**
             * <p>The time when the message was first consumed. The value is a UNIX timestamp in milliseconds that starts from 1970-01-01 00:00:00.000. If DequeueCount is 0, this value is the same as EnqueueTime.</p>
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
             * <p>This is a test message</p>
             */
            public Builder messageBody(String messageBody) {
                this.messageBody = messageBody;
                return this;
            }

            /**
             * <p>The MD5 hash of the message body.</p>
             * 
             * <strong>example:</strong>
             * <p>F9360F391579E71CA77BC5D50242****</p>
             */
            public Builder messageBodyMD5(String messageBodyMD5) {
                this.messageBodyMD5 = messageBodyMD5;
                return this;
            }

            /**
             * <p>The message group ID (FIFO queues only).</p>
             * 
             * <strong>example:</strong>
             * <p>test-group</p>
             */
            public Builder messageGroupId(String messageGroupId) {
                this.messageGroupId = messageGroupId;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>C0A80255D7D1163042EA3F2814D055F1</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The priority. Valid values: 1 to 16. Default value: 8. A value of 1 indicates the highest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The user-defined properties (JSON-formatted string).</p>
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
