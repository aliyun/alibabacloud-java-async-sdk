// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWaitingChatsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWaitingChatsResponseBody</p>
 */
public class ListWaitingChatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

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

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
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
        public Builder data(java.util.List < Data> data) {
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

        public ListWaitingChatsResponseBody build() {
            return new ListWaitingChatsResponseBody(this);
        } 

    } 

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

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
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
             * SenderType.
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

            /**
             * AvatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * UserType.
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
        private java.util.List < Messages> messages;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("UserList")
        private java.util.List < UserList> userList;

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
        public java.util.List < Messages> getMessages() {
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
        public java.util.List < UserList> getUserList() {
            return this.userList;
        }

        public static final class Builder {
            private String accessChannelId; 
            private String accessChannelType; 
            private Boolean beingAssigned; 
            private String chatConversationId; 
            private Long enqueueTime; 
            private String jobId; 
            private java.util.List < Messages> messages; 
            private String skillGroupId; 
            private java.util.List < UserList> userList; 

            /**
             * AccessChannelId.
             */
            public Builder accessChannelId(String accessChannelId) {
                this.accessChannelId = accessChannelId;
                return this;
            }

            /**
             * AccessChannelType.
             */
            public Builder accessChannelType(String accessChannelType) {
                this.accessChannelType = accessChannelType;
                return this;
            }

            /**
             * BeingAssigned.
             */
            public Builder beingAssigned(Boolean beingAssigned) {
                this.beingAssigned = beingAssigned;
                return this;
            }

            /**
             * ChatConversationId.
             */
            public Builder chatConversationId(String chatConversationId) {
                this.chatConversationId = chatConversationId;
                return this;
            }

            /**
             * EnqueueTime.
             */
            public Builder enqueueTime(Long enqueueTime) {
                this.enqueueTime = enqueueTime;
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
             * Messages.
             */
            public Builder messages(java.util.List < Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * SkillGroupId.
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * UserList.
             */
            public Builder userList(java.util.List < UserList> userList) {
                this.userList = userList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
