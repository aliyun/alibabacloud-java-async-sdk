// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupChatMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupChatMessagesResponseBody</p>
 */
public class ListGroupChatMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListGroupChatMessagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupChatMessagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
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

        public ListGroupChatMessagesResponseBody build() {
            return new ListGroupChatMessagesResponseBody(this);
        } 

    } 

    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Recalled")
        private Boolean recalled;

        @com.aliyun.core.annotation.NameInMap("SenderAvatarUrl")
        private String senderAvatarUrl;

        @com.aliyun.core.annotation.NameInMap("SenderId")
        private String senderId;

        @com.aliyun.core.annotation.NameInMap("SenderName")
        private String senderName;

        @com.aliyun.core.annotation.NameInMap("SenderType")
        private String senderType;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.jobId = builder.jobId;
            this.recalled = builder.recalled;
            this.senderAvatarUrl = builder.senderAvatarUrl;
            this.senderId = builder.senderId;
            this.senderName = builder.senderName;
            this.senderType = builder.senderType;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return recalled
         */
        public Boolean getRecalled() {
            return this.recalled;
        }

        /**
         * @return senderAvatarUrl
         */
        public String getSenderAvatarUrl() {
            return this.senderAvatarUrl;
        }

        /**
         * @return senderId
         */
        public String getSenderId() {
            return this.senderId;
        }

        /**
         * @return senderName
         */
        public String getSenderName() {
            return this.senderName;
        }

        /**
         * @return senderType
         */
        public String getSenderType() {
            return this.senderType;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String content; 
            private String jobId; 
            private Boolean recalled; 
            private String senderAvatarUrl; 
            private String senderId; 
            private String senderName; 
            private String senderType; 
            private Long timestamp; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Recalled.
             */
            public Builder recalled(Boolean recalled) {
                this.recalled = recalled;
                return this;
            }

            /**
             * SenderAvatarUrl.
             */
            public Builder senderAvatarUrl(String senderAvatarUrl) {
                this.senderAvatarUrl = senderAvatarUrl;
                return this;
            }

            /**
             * SenderId.
             */
            public Builder senderId(String senderId) {
                this.senderId = senderId;
                return this;
            }

            /**
             * SenderName.
             */
            public Builder senderName(String senderName) {
                this.senderName = senderName;
                return this;
            }

            /**
             * SenderType.
             */
            public Builder senderType(String senderType) {
                this.senderType = senderType;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List < Messages> messages;

        @com.aliyun.core.annotation.NameInMap("NextPageToken")
        private String nextPageToken;

        private Data(Builder builder) {
            this.messages = builder.messages;
            this.nextPageToken = builder.nextPageToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return messages
         */
        public java.util.List < Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public static final class Builder {
            private java.util.List < Messages> messages; 
            private String nextPageToken; 

            /**
             * Messages.
             */
            public Builder messages(java.util.List < Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * NextPageToken.
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
