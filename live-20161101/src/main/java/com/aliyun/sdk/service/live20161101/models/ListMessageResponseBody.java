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
 * {@link ListMessageResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageResponseBody</p>
 */
public class ListMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListMessageResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-****-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListMessageResponseBody build() {
            return new ListMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMessageResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessageResponseBody</p>
     */
    public static class MessageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("SenderId")
        private String senderId;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(MessageList model) {
                this.data = model.data;
                this.groupId = model.groupId;
                this.messageId = model.messageId;
                this.senderId = model.senderId;
                this.type = model.type;
            } 

            /**
             * <p>The message body. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The ID of the message group.</p>
             * 
             * <strong>example:</strong>
             * <p>AE35-****-T95F</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>qt***</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The ID of the user who sent the message.</p>
             * 
             * <strong>example:</strong>
             * <p>yi***</p>
             */
            public Builder senderId(String senderId) {
                this.senderId = senderId;
                return this;
            }

            /**
             * <p>The type of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>10002</p>
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
    /**
     * 
     * {@link ListMessageResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessageResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("MessageList")
        private java.util.List<MessageList> messageList;

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
        public java.util.List<MessageList> getMessageList() {
            return this.messageList;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private java.util.List<MessageList> messageList; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.hasMore = model.hasMore;
                this.messageList = model.messageList;
            } 

            /**
             * <p>Indicates whether the current page is followed by another page. Valid values:</p>
             * <ul>
             * <li>true: The current page is followed by another page.</li>
             * <li>false: The current page is not followed by another page.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>Details about the messages.</p>
             */
            public Builder messageList(java.util.List<MessageList> messageList) {
                this.messageList = messageList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
