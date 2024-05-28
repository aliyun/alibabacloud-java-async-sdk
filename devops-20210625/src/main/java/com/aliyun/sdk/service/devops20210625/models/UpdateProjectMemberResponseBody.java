// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProjectMemberResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProjectMemberResponseBody</p>
 */
public class UpdateProjectMemberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("member")
    private Member member;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdateProjectMemberResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.member = builder.member;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectMemberResponseBody create() {
        return builder().build();
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
     * @return member
     */
    public Member getMember() {
        return this.member;
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
        private String errorCode; 
        private String errorMsg; 
        private Member member; 
        private String requestId; 
        private Boolean success; 

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
         * member.
         */
        public Builder member(Member member) {
            this.member = member;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateProjectMemberResponseBody build() {
            return new UpdateProjectMemberResponseBody(this);
        } 

    } 

    public static class Member extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("roleIdentifier")
        private String roleIdentifier;

        @com.aliyun.core.annotation.NameInMap("targetIdentifier")
        private String targetIdentifier;

        @com.aliyun.core.annotation.NameInMap("targetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("userIdentifier")
        private String userIdentifier;

        @com.aliyun.core.annotation.NameInMap("userType")
        private String userType;

        private Member(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.roleIdentifier = builder.roleIdentifier;
            this.targetIdentifier = builder.targetIdentifier;
            this.targetType = builder.targetType;
            this.userIdentifier = builder.userIdentifier;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Member create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return roleIdentifier
         */
        public String getRoleIdentifier() {
            return this.roleIdentifier;
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
         * @return userIdentifier
         */
        public String getUserIdentifier() {
            return this.userIdentifier;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private String id; 
            private String roleIdentifier; 
            private String targetIdentifier; 
            private String targetType; 
            private String userIdentifier; 
            private String userType; 

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * roleIdentifier.
             */
            public Builder roleIdentifier(String roleIdentifier) {
                this.roleIdentifier = roleIdentifier;
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
             * userIdentifier.
             */
            public Builder userIdentifier(String userIdentifier) {
                this.userIdentifier = userIdentifier;
                return this;
            }

            /**
             * userType.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public Member build() {
                return new Member(this);
            } 

        } 

    }
}
