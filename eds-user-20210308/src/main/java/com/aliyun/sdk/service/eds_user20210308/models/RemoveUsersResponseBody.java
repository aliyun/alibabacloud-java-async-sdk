// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUsersResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveUsersResponseBody</p>
 */
public class RemoveUsersResponseBody extends TeaModel {
    @NameInMap("RemoveUsersResult")
    private RemoveUsersResult removeUsersResult;

    @NameInMap("RequestId")
    private String requestId;

    private RemoveUsersResponseBody(Builder builder) {
        this.removeUsersResult = builder.removeUsersResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return removeUsersResult
     */
    public RemoveUsersResult getRemoveUsersResult() {
        return this.removeUsersResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RemoveUsersResult removeUsersResult; 
        private String requestId; 

        /**
         * RemoveUsersResult.
         */
        public Builder removeUsersResult(RemoveUsersResult removeUsersResult) {
            this.removeUsersResult = removeUsersResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveUsersResponseBody build() {
            return new RemoveUsersResponseBody(this);
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
    public static class RemoveUsersResult extends TeaModel {
        @NameInMap("FailedUsers")
        private java.util.List < FailedUsers> failedUsers;

        @NameInMap("RemovedUsers")
        private java.util.List < String > removedUsers;

        private RemoveUsersResult(Builder builder) {
            this.failedUsers = builder.failedUsers;
            this.removedUsers = builder.removedUsers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveUsersResult create() {
            return builder().build();
        }

        /**
         * @return failedUsers
         */
        public java.util.List < FailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        /**
         * @return removedUsers
         */
        public java.util.List < String > getRemovedUsers() {
            return this.removedUsers;
        }

        public static final class Builder {
            private java.util.List < FailedUsers> failedUsers; 
            private java.util.List < String > removedUsers; 

            /**
             * FailedUsers.
             */
            public Builder failedUsers(java.util.List < FailedUsers> failedUsers) {
                this.failedUsers = failedUsers;
                return this;
            }

            /**
             * RemovedUsers.
             */
            public Builder removedUsers(java.util.List < String > removedUsers) {
                this.removedUsers = removedUsers;
                return this;
            }

            public RemoveUsersResult build() {
                return new RemoveUsersResult(this);
            } 

        } 

    }
}
