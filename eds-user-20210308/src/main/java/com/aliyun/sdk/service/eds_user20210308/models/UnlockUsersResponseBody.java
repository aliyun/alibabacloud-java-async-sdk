// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result of unlocking the convenience user.
         */
        public Builder unlockUsersResult(UnlockUsersResult unlockUsersResult) {
            this.unlockUsersResult = unlockUsersResult;
            return this;
        }

        public UnlockUsersResponseBody build() {
            return new UnlockUsersResponseBody(this);
        } 

    } 

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
             * The ID of the convenience user that failed to be unlocked.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The error code.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message.
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
    public static class UnlockUsersResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedUsers")
        private java.util.List < FailedUsers> failedUsers;

        @com.aliyun.core.annotation.NameInMap("UnlockedUsers")
        private java.util.List < String > unlockedUsers;

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
        public java.util.List < FailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        /**
         * @return unlockedUsers
         */
        public java.util.List < String > getUnlockedUsers() {
            return this.unlockedUsers;
        }

        public static final class Builder {
            private java.util.List < FailedUsers> failedUsers; 
            private java.util.List < String > unlockedUsers; 

            /**
             * The convenience users that failed to be unlocked.
             */
            public Builder failedUsers(java.util.List < FailedUsers> failedUsers) {
                this.failedUsers = failedUsers;
                return this;
            }

            /**
             * The convenience users that were unlocked.
             */
            public Builder unlockedUsers(java.util.List < String > unlockedUsers) {
                this.unlockedUsers = unlockedUsers;
                return this;
            }

            public UnlockUsersResult build() {
                return new UnlockUsersResult(this);
            } 

        } 

    }
}
