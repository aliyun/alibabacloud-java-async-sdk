// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOrganizationMemberResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateOrganizationMemberResponseBody</p>
 */
public class UpdateOrganizationMemberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("member")
    private Member member;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdateOrganizationMemberResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.member = builder.member;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOrganizationMemberResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
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
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public UpdateOrganizationMemberResponseBody build() {
            return new UpdateOrganizationMemberResponseBody(this);
        } 

    } 

    public static class Member extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("organizationMemberName")
        private String organizationMemberName;

        private Member(Builder builder) {
            this.accountId = builder.accountId;
            this.organizationMemberName = builder.organizationMemberName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Member create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return organizationMemberName
         */
        public String getOrganizationMemberName() {
            return this.organizationMemberName;
        }

        public static final class Builder {
            private String accountId; 
            private String organizationMemberName; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * organizationMemberName.
             */
            public Builder organizationMemberName(String organizationMemberName) {
                this.organizationMemberName = organizationMemberName;
                return this;
            }

            public Member build() {
                return new Member(this);
            } 

        } 

    }
}
