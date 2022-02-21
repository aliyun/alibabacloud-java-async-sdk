// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMessageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMessageInfoResponseBody</p>
 */
public class QueryMessageInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Message")
    private Message message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryMessageInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessageInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return message
     */
    public Message getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private Message message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(Message message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMessageInfoResponseBody build() {
            return new QueryMessageInfoResponseBody(this);
        } 

    } 

    public static class UserProperties extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private UserProperties(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProperties create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UserProperties build() {
                return new UserProperties(this);
            } 

        } 

    }
    public static class Message extends TeaModel {
        @NameInMap("GenerateTime")
        private Long generateTime;

        @NameInMap("MessageContent")
        private String messageContent;

        @NameInMap("TopicFullName")
        private String topicFullName;

        @NameInMap("UniMsgId")
        private String uniMsgId;

        @NameInMap("UserProperties")
        private java.util.List < UserProperties> userProperties;

        private Message(Builder builder) {
            this.generateTime = builder.generateTime;
            this.messageContent = builder.messageContent;
            this.topicFullName = builder.topicFullName;
            this.uniMsgId = builder.uniMsgId;
            this.userProperties = builder.userProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return generateTime
         */
        public Long getGenerateTime() {
            return this.generateTime;
        }

        /**
         * @return messageContent
         */
        public String getMessageContent() {
            return this.messageContent;
        }

        /**
         * @return topicFullName
         */
        public String getTopicFullName() {
            return this.topicFullName;
        }

        /**
         * @return uniMsgId
         */
        public String getUniMsgId() {
            return this.uniMsgId;
        }

        /**
         * @return userProperties
         */
        public java.util.List < UserProperties> getUserProperties() {
            return this.userProperties;
        }

        public static final class Builder {
            private Long generateTime; 
            private String messageContent; 
            private String topicFullName; 
            private String uniMsgId; 
            private java.util.List < UserProperties> userProperties; 

            /**
             * GenerateTime.
             */
            public Builder generateTime(Long generateTime) {
                this.generateTime = generateTime;
                return this;
            }

            /**
             * MessageContent.
             */
            public Builder messageContent(String messageContent) {
                this.messageContent = messageContent;
                return this;
            }

            /**
             * TopicFullName.
             */
            public Builder topicFullName(String topicFullName) {
                this.topicFullName = topicFullName;
                return this;
            }

            /**
             * UniMsgId.
             */
            public Builder uniMsgId(String uniMsgId) {
                this.uniMsgId = uniMsgId;
                return this;
            }

            /**
             * UserProperties.
             */
            public Builder userProperties(java.util.List < UserProperties> userProperties) {
                this.userProperties = userProperties;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
}
