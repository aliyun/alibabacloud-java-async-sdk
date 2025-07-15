// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ListLiveMessageGroupMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveMessageGroupMessagesResponseBody</p>
 */
public class ListLiveMessageGroupMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("Hasmore")
    private Boolean hasmore;

    @com.aliyun.core.annotation.NameInMap("MessageList")
    private java.util.List<MessageList> messageList;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private Long nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLiveMessageGroupMessagesResponseBody(Builder builder) {
        this.groupId = builder.groupId;
        this.hasmore = builder.hasmore;
        this.messageList = builder.messageList;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveMessageGroupMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return hasmore
     */
    public Boolean getHasmore() {
        return this.hasmore;
    }

    /**
     * @return messageList
     */
    public java.util.List<MessageList> getMessageList() {
        return this.messageList;
    }

    /**
     * @return nextPageToken
     */
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String groupId; 
        private Boolean hasmore; 
        private java.util.List<MessageList> messageList; 
        private Long nextPageToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListLiveMessageGroupMessagesResponseBody model) {
            this.groupId = model.groupId;
            this.hasmore = model.hasmore;
            this.messageList = model.messageList;
            this.nextPageToken = model.nextPageToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the group queried.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Indicates whether the current page is followed by another page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasmore(Boolean hasmore) {
            this.hasmore = hasmore;
            return this;
        }

        /**
         * <p>Details about the messages.</p>
         */
        public Builder messageList(java.util.List<MessageList> messageList) {
            this.messageList = messageList;
            return this;
        }

        /**
         * <p>The starting page number for the next query. A value of 0 indicates that no further pages can be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder nextPageToken(Long nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1668FDC3-63D7-102F-B5D4-3D2F91D1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLiveMessageGroupMessagesResponseBody build() {
            return new ListLiveMessageGroupMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLiveMessageGroupMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveMessageGroupMessagesResponseBody</p>
     */
    public static class Sender extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private String userInfo;

        private Sender(Builder builder) {
            this.userId = builder.userId;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sender create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userInfo
         */
        public String getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private String userId; 
            private String userInfo; 

            private Builder() {
            } 

            private Builder(Sender model) {
                this.userId = model.userId;
                this.userInfo = model.userInfo;
            } 

            /**
             * <p>The ID of the user who sent the message.</p>
             * 
             * <strong>example:</strong>
             * <p>uid2</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The additional information about the user who sent the message.</p>
             * 
             * <strong>example:</strong>
             * <p>testusermeta2</p>
             */
            public Builder userInfo(String userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public Sender build() {
                return new Sender(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLiveMessageGroupMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveMessageGroupMessagesResponseBody</p>
     */
    public static class MessageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("MsgTid")
        private String msgTid;

        @com.aliyun.core.annotation.NameInMap("MsgType")
        private Long msgType;

        @com.aliyun.core.annotation.NameInMap("Sender")
        private Sender sender;

        @com.aliyun.core.annotation.NameInMap("SeqNumber")
        private Long seqNumber;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TotalMessages")
        private Long totalMessages;

        private MessageList(Builder builder) {
            this.body = builder.body;
            this.msgTid = builder.msgTid;
            this.msgType = builder.msgType;
            this.sender = builder.sender;
            this.seqNumber = builder.seqNumber;
            this.timestamp = builder.timestamp;
            this.totalMessages = builder.totalMessages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageList create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return msgTid
         */
        public String getMsgTid() {
            return this.msgTid;
        }

        /**
         * @return msgType
         */
        public Long getMsgType() {
            return this.msgType;
        }

        /**
         * @return sender
         */
        public Sender getSender() {
            return this.sender;
        }

        /**
         * @return seqNumber
         */
        public Long getSeqNumber() {
            return this.seqNumber;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return totalMessages
         */
        public Long getTotalMessages() {
            return this.totalMessages;
        }

        public static final class Builder {
            private String body; 
            private String msgTid; 
            private Long msgType; 
            private Sender sender; 
            private Long seqNumber; 
            private Long timestamp; 
            private Long totalMessages; 

            private Builder() {
            } 

            private Builder(MessageList model) {
                this.body = model.body;
                this.msgTid = model.msgTid;
                this.msgType = model.msgType;
                this.sender = model.sender;
                this.seqNumber = model.seqNumber;
                this.timestamp = model.timestamp;
                this.totalMessages = model.totalMessages;
            } 

            /**
             * <p>The message body.</p>
             * 
             * <strong>example:</strong>
             * <p>step2 helo, cc group</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The ID of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>c-1-1-0</p>
             */
            public Builder msgTid(String msgTid) {
                this.msgTid = msgTid;
                return this;
            }

            /**
             * <p>The type of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder msgType(Long msgType) {
                this.msgType = msgType;
                return this;
            }

            /**
             * <p>The details about the user who sent the message.</p>
             */
            public Builder sender(Sender sender) {
                this.sender = sender;
                return this;
            }

            /**
             * <p>The sequence number of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder seqNumber(Long seqNumber) {
                this.seqNumber = seqNumber;
                return this;
            }

            /**
             * <p>The time when the message was sent. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1697081134</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The total number of messages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalMessages(Long totalMessages) {
                this.totalMessages = totalMessages;
                return this;
            }

            public MessageList build() {
                return new MessageList(this);
            } 

        } 

    }
}
