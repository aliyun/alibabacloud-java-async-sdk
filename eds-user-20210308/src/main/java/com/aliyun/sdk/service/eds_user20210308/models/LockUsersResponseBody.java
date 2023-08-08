// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockUsersResponseBody} extends {@link TeaModel}
 *
 * <p>LockUsersResponseBody</p>
 */
public class LockUsersResponseBody extends TeaModel {
    @NameInMap("LockUsersResult")
    private LockUsersResult lockUsersResult;

    @NameInMap("RequestId")
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

        /**
         * LockUsersResult.
         */
        public Builder lockUsersResult(LockUsersResult lockUsersResult) {
            this.lockUsersResult = lockUsersResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LockUsersResponseBody build() {
            return new LockUsersResponseBody(this);
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
    public static class LockUsersResult extends TeaModel {
        @NameInMap("FailedUsers")
        private java.util.List < FailedUsers> failedUsers;

        @NameInMap("LockedUsers")
        private java.util.List < String > lockedUsers;

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
        public java.util.List < FailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        /**
         * @return lockedUsers
         */
        public java.util.List < String > getLockedUsers() {
            return this.lockedUsers;
        }

        public static final class Builder {
            private java.util.List < FailedUsers> failedUsers; 
            private java.util.List < String > lockedUsers; 

            /**
             * FailedUsers.
             */
            public Builder failedUsers(java.util.List < FailedUsers> failedUsers) {
                this.failedUsers = failedUsers;
                return this;
            }

            /**
             * LockedUsers.
             */
            public Builder lockedUsers(java.util.List < String > lockedUsers) {
                this.lockedUsers = lockedUsers;
                return this;
            }

            public LockUsersResult build() {
                return new LockUsersResult(this);
            } 

        } 

    }
}
