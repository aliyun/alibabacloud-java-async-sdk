// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetUserPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>ResetUserPasswordResponseBody</p>
 */
public class ResetUserPasswordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResetUsersResult")
    private ResetUsersResult resetUsersResult;

    private ResetUserPasswordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resetUsersResult = builder.resetUsersResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetUserPasswordResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resetUsersResult
     */
    public ResetUsersResult getResetUsersResult() {
        return this.resetUsersResult;
    }

    public static final class Builder {
        private String requestId; 
        private ResetUsersResult resetUsersResult; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result of resetting the password of the convenience user.
         */
        public Builder resetUsersResult(ResetUsersResult resetUsersResult) {
            this.resetUsersResult = resetUsersResult;
            return this;
        }

        public ResetUserPasswordResponseBody build() {
            return new ResetUserPasswordResponseBody(this);
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
             * The ID of the convenience user whose password failed to be reset.
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
    public static class ResetUsersResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedUsers")
        private java.util.List < FailedUsers> failedUsers;

        @com.aliyun.core.annotation.NameInMap("ResetUsers")
        private java.util.List < String > resetUsers;

        private ResetUsersResult(Builder builder) {
            this.failedUsers = builder.failedUsers;
            this.resetUsers = builder.resetUsers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResetUsersResult create() {
            return builder().build();
        }

        /**
         * @return failedUsers
         */
        public java.util.List < FailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        /**
         * @return resetUsers
         */
        public java.util.List < String > getResetUsers() {
            return this.resetUsers;
        }

        public static final class Builder {
            private java.util.List < FailedUsers> failedUsers; 
            private java.util.List < String > resetUsers; 

            /**
             * The information about the convenience users whose passwords failed to be reset.
             */
            public Builder failedUsers(java.util.List < FailedUsers> failedUsers) {
                this.failedUsers = failedUsers;
                return this;
            }

            /**
             * The convenience users to which the system sent a password reset email.
             */
            public Builder resetUsers(java.util.List < String > resetUsers) {
                this.resetUsers = resetUsers;
                return this;
            }

            public ResetUsersResult build() {
                return new ResetUsersResult(this);
            } 

        } 

    }
}
