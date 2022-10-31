// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageResponseBody</p>
 */
public class ListMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListMessageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListMessageResponseBody build() {
            return new ListMessageResponseBody(this);
        } 

    } 

    public static class MessageList extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("MessageId")
        private String messageId;

        @NameInMap("SenderId")
        private String senderId;

        @NameInMap("Type")
        private Integer type;

        private MessageList(Builder builder) {
            this.data = builder.data;
            this.groupId = builder.groupId;
            this.messageId = builder.messageId;
            this.senderId = builder.senderId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageList create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return senderId
         */
        public String getSenderId() {
            return this.senderId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String data; 
            private String groupId; 
            private String messageId; 
            private String senderId; 
            private Integer type; 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
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
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public MessageList build() {
                return new MessageList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("MessageList")
        private java.util.List < MessageList> messageList;

        private Result(Builder builder) {
            this.hasMore = builder.hasMore;
            this.messageList = builder.messageList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return messageList
         */
        public java.util.List < MessageList> getMessageList() {
            return this.messageList;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private java.util.List < MessageList> messageList; 

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * MessageList.
             */
            public Builder messageList(java.util.List < MessageList> messageList) {
                this.messageList = messageList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
