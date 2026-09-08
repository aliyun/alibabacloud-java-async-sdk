// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListGroupChatMessagesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code returned in the response. A value of 200 indicates a successful request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2263B273-AC1B-44EB-BA98-87F2322C6780</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGroupChatMessagesResponseBody build() {
            return new ListGroupChatMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGroupChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupChatMessagesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.jobId = model.jobId;
                this.recalled = model.recalled;
                this.senderAvatarUrl = model.senderAvatarUrl;
                this.senderId = model.senderId;
                this.senderName = model.senderName;
                this.senderType = model.senderType;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>Message content.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;variables&quot;:{},&quot;text&quot;:&quot;<p>好的，不客气</p>&quot;,&quot;contentType&quot;:&quot;Text&quot;,&quot;subContentType&quot;:&quot;richtext&quot;}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>chat-65382141036853491</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Indicates whether the message was revoked.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder recalled(Boolean recalled) {
                this.recalled = recalled;
                return this;
            }

            /**
             * <p>Sender profile picture URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxxx.com">http://xxxxx.com</a></p>
             */
            public Builder senderAvatarUrl(String senderAvatarUrl) {
                this.senderAvatarUrl = senderAvatarUrl;
                return this;
            }

            /**
             * <p>User ID of the message sender.</p>
             * 
             * <strong>example:</strong>
             * <p>64bb4ececc34fc5ec1ca1153</p>
             */
            public Builder senderId(String senderId) {
                this.senderId = senderId;
                return this;
            }

            /**
             * <p>Sender name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-agent@test-instanceId</p>
             */
            public Builder senderName(String senderName) {
                this.senderName = senderName;
                return this;
            }

            /**
             * <p>Sender type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p><strong>ADMIN</strong>: system</p>
             * </li>
             * <li><p><strong>CUSTOMER</strong>: visitor</p>
             * </li>
             * <li><p><strong>AGENT</strong>: agent</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMER</p>
             */
            public Builder senderType(String senderType) {
                this.senderType = senderType;
                return this;
            }

            /**
             * <p>Message timestamp, in Unix timestamp format, measured in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1696126980371</p>
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
    /**
     * 
     * {@link ListGroupChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupChatMessagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List<Messages> messages;

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
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public static final class Builder {
            private java.util.List<Messages> messages; 
            private String nextPageToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.messages = model.messages;
                this.nextPageToken = model.nextPageToken;
            } 

            /**
             * <p>Message list.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>Token for the next page.</p>
             * 
             * <strong>example:</strong>
             * <p>54d1a616d95a4a01ba58967a9115b649</p>
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
