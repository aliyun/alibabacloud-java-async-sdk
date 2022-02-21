// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetUserPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>ResetUserPasswordResponseBody</p>
 */
public class ResetUserPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResetUsersResult")
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResetUsersResult.
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
    public static class ResetUsersResult extends TeaModel {
        @NameInMap("FailedUsers")
        private java.util.List < FailedUsers> failedUsers;

        @NameInMap("ResetUsers")
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
             * FailedUsers.
             */
            public Builder failedUsers(java.util.List < FailedUsers> failedUsers) {
                this.failedUsers = failedUsers;
                return this;
            }

            /**
             * ResetUsers.
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
