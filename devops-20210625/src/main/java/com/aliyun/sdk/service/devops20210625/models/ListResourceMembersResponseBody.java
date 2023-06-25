// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceMembersResponseBody</p>
 */
public class ListResourceMembersResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("resourceMembers")
    private java.util.List < ResourceMembers> resourceMembers;

    @NameInMap("success")
    private Boolean success;

    private ListResourceMembersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.resourceMembers = builder.resourceMembers;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceMembersResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceMembers
     */
    public java.util.List < ResourceMembers> getResourceMembers() {
        return this.resourceMembers;
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
        private String requestId; 
        private java.util.List < ResourceMembers> resourceMembers; 
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resourceMembers.
         */
        public Builder resourceMembers(java.util.List < ResourceMembers> resourceMembers) {
            this.resourceMembers = resourceMembers;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListResourceMembersResponseBody build() {
            return new ListResourceMembersResponseBody(this);
        } 

    } 

    public static class ResourceMembers extends TeaModel {
        @NameInMap("accountId")
        private String accountId;

        @NameInMap("roleName")
        private String roleName;

        @NameInMap("username")
        private String username;

        private ResourceMembers(Builder builder) {
            this.accountId = builder.accountId;
            this.roleName = builder.roleName;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceMembers create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String accountId; 
            private String roleName; 
            private String username; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * roleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public ResourceMembers build() {
                return new ResourceMembers(this);
            } 

        } 

    }
}
