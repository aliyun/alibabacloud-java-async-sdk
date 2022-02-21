// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnlockUsersResponseBody} extends {@link TeaModel}
 *
 * <p>UnlockUsersResponseBody</p>
 */
public class UnlockUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UnlockUsersResult")
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UnlockUsersResult.
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
        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
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
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
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
        @NameInMap("FailedUsers")
        private java.util.List < FailedUsers> failedUsers;

        @NameInMap("UnlockedUsers")
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
             * FailedUsers.
             */
            public Builder failedUsers(java.util.List < FailedUsers> failedUsers) {
                this.failedUsers = failedUsers;
                return this;
            }

            /**
             * UnlockedUsers.
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
