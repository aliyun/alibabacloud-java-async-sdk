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
 * {@link UnlockUsersResponseBody} extends {@link TeaModel}
 *
 * <p>UnlockUsersResponseBody</p>
 */
public class UnlockUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnlockUsersResult")
    private UnlockUsersResult unlockUsersResult;

    private UnlockUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.unlockUsersResult = builder.unlockUsersResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnlockUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unlockUsersResult
     */
    public UnlockUsersResult getUnlockUsersResult() {
        return this.unlockUsersResult;
    }

    public static final class Builder {
        private String requestId; 
        private UnlockUsersResult unlockUsersResult; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>023F4EC4-3602-4A3E-A514-4970847D59DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of unlocking the convenience user.</p>
         */
        public Builder unlockUsersResult(UnlockUsersResult unlockUsersResult) {
            this.unlockUsersResult = unlockUsersResult;
            return this;
        }

        public UnlockUsersResponseBody build() {
            return new UnlockUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UnlockUsersResponseBody} extends {@link TeaModel}
     *
     * <p>UnlockUsersResponseBody</p>
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

            /**
             * <p>The ID of the convenience user that failed to be unlocked.</p>
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
     * {@link UnlockUsersResponseBody} extends {@link TeaModel}
     *
     * <p>UnlockUsersResponseBody</p>
     */
    public static class UnlockUsersResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedUsers")
        private java.util.List<FailedUsers> failedUsers;

        @com.aliyun.core.annotation.NameInMap("UnlockedUsers")
        private java.util.List<String> unlockedUsers;

        private UnlockUsersResult(Builder builder) {
            this.failedUsers = builder.failedUsers;
            this.unlockedUsers = builder.unlockedUsers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnlockUsersResult create() {
            return builder().build();
        }

        /**
         * @return failedUsers
         */
        public java.util.List<FailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        /**
         * @return unlockedUsers
         */
        public java.util.List<String> getUnlockedUsers() {
            return this.unlockedUsers;
        }

        public static final class Builder {
            private java.util.List<FailedUsers> failedUsers; 
            private java.util.List<String> unlockedUsers; 

            /**
             * <p>The convenience users that failed to be unlocked.</p>
             */
            public Builder failedUsers(java.util.List<FailedUsers> failedUsers) {
                this.failedUsers = failedUsers;
                return this;
            }

            /**
             * <p>The convenience users that were unlocked.</p>
             */
            public Builder unlockedUsers(java.util.List<String> unlockedUsers) {
                this.unlockedUsers = unlockedUsers;
                return this;
            }

            public UnlockUsersResult build() {
                return new UnlockUsersResult(this);
            } 

        } 

    }
}
