// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkitemCommentResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWorkitemCommentResponseBody</p>
 */
public class UpdateWorkitemCommentResponseBody extends TeaModel {
    @NameInMap("comment")
    private Comment comment;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private String success;

    private UpdateWorkitemCommentResponseBody(Builder builder) {
        this.comment = builder.comment;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkitemCommentResponseBody create() {
        return builder().build();
    }

    /**
     * @return comment
     */
    public Comment getComment() {
        return this.comment;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Comment comment; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private String success; 

        /**
         * comment.
         */
        public Builder comment(Comment comment) {
            this.comment = comment;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public UpdateWorkitemCommentResponseBody build() {
            return new UpdateWorkitemCommentResponseBody(this);
        } 

    } 

    public static class User extends TeaModel {
        @NameInMap("account")
        private String account;

        @NameInMap("avatar")
        private String avatar;

        @NameInMap("displayName")
        private String displayName;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("nickName")
        private String nickName;

        @NameInMap("realName")
        private String realName;

        private User(Builder builder) {
            this.account = builder.account;
            this.avatar = builder.avatar;
            this.displayName = builder.displayName;
            this.identifier = builder.identifier;
            this.nickName = builder.nickName;
            this.realName = builder.realName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return realName
         */
        public String getRealName() {
            return this.realName;
        }

        public static final class Builder {
            private String account; 
            private String avatar; 
            private String displayName; 
            private String identifier; 
            private String nickName; 
            private String realName; 

            /**
             * account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * nickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * realName.
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    public static class Comment extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("formatType")
        private String formatType;

        @NameInMap("id")
        private String id;

        @NameInMap("isTop")
        private Boolean isTop;

        @NameInMap("modifiedTime")
        private Long modifiedTime;

        @NameInMap("parentId")
        private Long parentId;

        @NameInMap("targetIdentifier")
        private String targetIdentifier;

        @NameInMap("targetType")
        private String targetType;

        @NameInMap("topTime")
        private Long topTime;

        @NameInMap("user")
        private User user;

        private Comment(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.formatType = builder.formatType;
            this.id = builder.id;
            this.isTop = builder.isTop;
            this.modifiedTime = builder.modifiedTime;
            this.parentId = builder.parentId;
            this.targetIdentifier = builder.targetIdentifier;
            this.targetType = builder.targetType;
            this.topTime = builder.topTime;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Comment create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return formatType
         */
        public String getFormatType() {
            return this.formatType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isTop
         */
        public Boolean getIsTop() {
            return this.isTop;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return targetIdentifier
         */
        public String getTargetIdentifier() {
            return this.targetIdentifier;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return topTime
         */
        public Long getTopTime() {
            return this.topTime;
        }

        /**
         * @return user
         */
        public User getUser() {
            return this.user;
        }

        public static final class Builder {
            private String content; 
            private Long createTime; 
            private String formatType; 
            private String id; 
            private Boolean isTop; 
            private Long modifiedTime; 
            private Long parentId; 
            private String targetIdentifier; 
            private String targetType; 
            private Long topTime; 
            private User user; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * formatType.
             */
            public Builder formatType(String formatType) {
                this.formatType = formatType;
                return this;
            }

            /**
             * 评论唯一id
             * <p>
             * 
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * isTop.
             */
            public Builder isTop(Boolean isTop) {
                this.isTop = isTop;
                return this;
            }

            /**
             * modifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * parentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * targetIdentifier.
             */
            public Builder targetIdentifier(String targetIdentifier) {
                this.targetIdentifier = targetIdentifier;
                return this;
            }

            /**
             * targetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * topTime.
             */
            public Builder topTime(Long topTime) {
                this.topTime = topTime;
                return this;
            }

            /**
             * user.
             */
            public Builder user(User user) {
                this.user = user;
                return this;
            }

            public Comment build() {
                return new Comment(this);
            } 

        } 

    }
}
