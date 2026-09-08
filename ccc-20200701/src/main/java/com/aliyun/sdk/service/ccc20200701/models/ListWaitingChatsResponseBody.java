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
 * {@link ListWaitingChatsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWaitingChatsResponseBody</p>
 */
public class ListWaitingChatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListWaitingChatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWaitingChatsResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListWaitingChatsResponseBody model) {
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
         * <p>Returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
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
         * <p>03C67DAD-EB26-41D8-949D-9B0C470FB716</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListWaitingChatsResponseBody build() {
            return new ListWaitingChatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWaitingChatsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWaitingChatsResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("SenderId")
        private String senderId;

        @com.aliyun.core.annotation.NameInMap("SenderType")
        private String senderType;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.senderId = builder.senderId;
            this.senderType = builder.senderType;
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
         * @return senderId
         */
        public String getSenderId() {
            return this.senderId;
        }

        /**
         * @return senderType
         */
        public String getSenderType() {
            return this.senderType;
        }

        public static final class Builder {
            private String content; 
            private String senderId; 
            private String senderType; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.senderId = model.senderId;
                this.senderType = model.senderType;
            } 

            /**
             * <p>Message content.</p>
             * 
             * <strong>example:</strong>
             * <p>测试消息</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Message sender ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c361765f-******-4e07-b81c-4b5d9183fac6</p>
             */
            public Builder senderId(String senderId) {
                this.senderId = senderId;
                return this;
            }

            /**
             * <p>Sender type. Valid values:</p>
             * <ul>
             * <li><p><strong>CUSTOMER</strong>: visitor</p>
             * </li>
             * <li><p><strong>AGENT</strong>: agent</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;variables&quot;:{},&quot;text&quot;:&quot;<p>这种的名片选单面还是双面</p>&quot;}</p>
             */
            public Builder senderType(String senderType) {
                this.senderType = senderType;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWaitingChatsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWaitingChatsResponseBody</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private UserList(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String userId; 
            private String userName; 
            private String userType; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.avatarUrl = model.avatarUrl;
                this.userId = model.userId;
                this.userName = model.userName;
                this.userType = model.userType;
            } 

            /**
             * <p>Profile picture URL.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c361765f-******-4e07-b81c-4b5d9183fac6</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>User name.</p>
             * 
             * <strong>example:</strong>
             * <p>访客-1c***</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>User type.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMER</p>
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWaitingChatsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWaitingChatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessChannelId")
        private String accessChannelId;

        @com.aliyun.core.annotation.NameInMap("AccessChannelType")
        private String accessChannelType;

        @com.aliyun.core.annotation.NameInMap("BeingAssigned")
        private Boolean beingAssigned;

        @com.aliyun.core.annotation.NameInMap("ChatConversationId")
        private String chatConversationId;

        @com.aliyun.core.annotation.NameInMap("EnqueueTime")
        private Long enqueueTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List<Messages> messages;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("UserList")
        private java.util.List<UserList> userList;

        private Data(Builder builder) {
            this.accessChannelId = builder.accessChannelId;
            this.accessChannelType = builder.accessChannelType;
            this.beingAssigned = builder.beingAssigned;
            this.chatConversationId = builder.chatConversationId;
            this.enqueueTime = builder.enqueueTime;
            this.jobId = builder.jobId;
            this.messages = builder.messages;
            this.skillGroupId = builder.skillGroupId;
            this.userList = builder.userList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessChannelId
         */
        public String getAccessChannelId() {
            return this.accessChannelId;
        }

        /**
         * @return accessChannelType
         */
        public String getAccessChannelType() {
            return this.accessChannelType;
        }

        /**
         * @return beingAssigned
         */
        public Boolean getBeingAssigned() {
            return this.beingAssigned;
        }

        /**
         * @return chatConversationId
         */
        public String getChatConversationId() {
            return this.chatConversationId;
        }

        /**
         * @return enqueueTime
         */
        public Long getEnqueueTime() {
            return this.enqueueTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return userList
         */
        public java.util.List<UserList> getUserList() {
            return this.userList;
        }

        public static final class Builder {
            private String accessChannelId; 
            private String accessChannelType; 
            private Boolean beingAssigned; 
            private String chatConversationId; 
            private Long enqueueTime; 
            private String jobId; 
            private java.util.List<Messages> messages; 
            private String skillGroupId; 
            private java.util.List<UserList> userList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessChannelId = model.accessChannelId;
                this.accessChannelType = model.accessChannelType;
                this.beingAssigned = model.beingAssigned;
                this.chatConversationId = model.chatConversationId;
                this.enqueueTime = model.enqueueTime;
                this.jobId = model.jobId;
                this.messages = model.messages;
                this.skillGroupId = model.skillGroupId;
                this.userList = model.userList;
            } 

            /**
             * <p>Access channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>843073c2-*****-49fb-a616-738ddddfebdc</p>
             */
            public Builder accessChannelId(String accessChannelId) {
                this.accessChannelId = accessChannelId;
                return this;
            }

            /**
             * <p>Access channel type.</p>
             * 
             * <strong>example:</strong>
             * <p>Web</p>
             */
            public Builder accessChannelType(String accessChannelType) {
                this.accessChannelType = accessChannelType;
                return this;
            }

            /**
             * <p>Indicates whether the session has been assigned to an agent.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder beingAssigned(Boolean beingAssigned) {
                this.beingAssigned = beingAssigned;
                return this;
            }

            /**
             * <p>Chat session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>$23086709$EAUNIT</p>
             */
            public Builder chatConversationId(String chatConversationId) {
                this.chatConversationId = chatConversationId;
                return this;
            }

            /**
             * <p>Enqueue time, in Unix timestamp format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1718868572094</p>
             */
            public Builder enqueueTime(Long enqueueTime) {
                this.enqueueTime = enqueueTime;
                return this;
            }

            /**
             * <p>Job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>chat-434537064047960064</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Message list.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>The skill group information.</p>
             * 
             * <strong>example:</strong>
             * <p>skill@ccc-test</p>
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * <p>User list.</p>
             */
            public Builder userList(java.util.List<UserList> userList) {
                this.userList = userList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
