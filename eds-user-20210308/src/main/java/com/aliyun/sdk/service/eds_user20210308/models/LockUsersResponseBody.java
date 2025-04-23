// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link LockUsersResponseBody} extends {@link TeaModel}
 *
 * <p>LockUsersResponseBody</p>
 */
public class LockUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LockUsersResult")
    private LockUsersResult lockUsersResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private LockUsersResponseBody(Builder builder) {
        this.lockUsersResult = builder.lockUsersResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lockUsersResult
     */
    public LockUsersResult getLockUsersResult() {
        return this.lockUsersResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LockUsersResult lockUsersResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(LockUsersResponseBody model) {
            this.lockUsersResult = model.lockUsersResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The result of the locking the convenience user.</p>
         */
        public Builder lockUsersResult(LockUsersResult lockUsersResult) {
            this.lockUsersResult = lockUsersResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LockUsersResponseBody build() {
            return new LockUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link LockUsersResponseBody} extends {@link TeaModel}
     *
     * <p>LockUsersResponseBody</p>
     */
    public static class FailedUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        private FailedUsers(Builder builder) {
            this.endUserId = builder.endUserId;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedUsers create() {
            return builder().build();
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
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

        public static final class Builder {
            private String endUserId; 
            private String errorCode; 
            private String errorMessage; 

            private Builder() {
            } 

            private Builder(FailedUsers model) {
                this.endUserId = model.endUserId;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
            } 

            /**
             * <p>The ID of the convenience user that failed to be locked.</p>
             * 
             * <strong>example:</strong>
             * <p>test123</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidUsername</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>test123 is an invalid username.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public FailedUsers build() {
                return new FailedUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link LockUsersResponseBody} extends {@link TeaModel}
     *
     * <p>LockUsersResponseBody</p>
     */
    public static class LockUsersResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedUsers")
        private java.util.List<FailedUsers> failedUsers;

        @com.aliyun.core.annotation.NameInMap("LockedUsers")
        private java.util.List<String> lockedUsers;

        private LockUsersResult(Builder builder) {
            this.failedUsers = builder.failedUsers;
            this.lockedUsers = builder.lockedUsers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LockUsersResult create() {
            return builder().build();
        }

        /**
         * @return failedUsers
         */
        public java.util.List<FailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        /**
         * @return lockedUsers
         */
        public java.util.List<String> getLockedUsers() {
            return this.lockedUsers;
        }

        public static final class Builder {
            private java.util.List<FailedUsers> failedUsers; 
            private java.util.List<String> lockedUsers; 

            private Builder() {
            } 

            private Builder(LockUsersResult model) {
                this.failedUsers = model.failedUsers;
                this.lockedUsers = model.lockedUsers;
            } 

            /**
             * <p>The convenience users that failed to be locked.</p>
             */
            public Builder failedUsers(java.util.List<FailedUsers> failedUsers) {
                this.failedUsers = failedUsers;
                return this;
            }

            /**
             * <p>The convenience users that were locked.</p>
             */
            public Builder lockedUsers(java.util.List<String> lockedUsers) {
                this.lockedUsers = lockedUsers;
                return this;
            }

            public LockUsersResult build() {
                return new LockUsersResult(this);
            } 

        } 

    }
}
