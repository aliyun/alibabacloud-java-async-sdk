// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUsersResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUsersResponseBody</p>
 */
public class CreateUsersResponseBody extends TeaModel {
    @NameInMap("CreateResult")
    private CreateResult createResult;

    @NameInMap("RequestId")
    private String requestId;

    private CreateUsersResponseBody(Builder builder) {
        this.createResult = builder.createResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return createResult
     */
    public CreateResult getCreateResult() {
        return this.createResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CreateResult createResult; 
        private String requestId; 

        /**
         * CreateResult.
         */
        public Builder createResult(CreateResult createResult) {
            this.createResult = createResult;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateUsersResponseBody build() {
            return new CreateUsersResponseBody(this);
        } 

    } 

    public static class CreatedUsers extends TeaModel {
        @NameInMap("Email")
        private String email;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("Phone")
        private String phone;

        private CreatedUsers(Builder builder) {
            this.email = builder.email;
            this.endUserId = builder.endUserId;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreatedUsers create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String email; 
            private String endUserId; 
            private String phone; 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public CreatedUsers build() {
                return new CreatedUsers(this);
            } 

        } 

    }
    public static class FailedUsers extends TeaModel {
        @NameInMap("Email")
        private String email;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Phone")
        private String phone;

        private FailedUsers(Builder builder) {
            this.email = builder.email;
            this.endUserId = builder.endUserId;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedUsers create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
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

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String email; 
            private String endUserId; 
            private String errorCode; 
            private String errorMessage; 
            private String phone; 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

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

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public FailedUsers build() {
                return new FailedUsers(this);
            } 

        } 

    }
    public static class CreateResult extends TeaModel {
        @NameInMap("CreatedUsers")
        private java.util.List < CreatedUsers> createdUsers;

        @NameInMap("FailedUsers")
        private java.util.List < FailedUsers> failedUsers;

        private CreateResult(Builder builder) {
            this.createdUsers = builder.createdUsers;
            this.failedUsers = builder.failedUsers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateResult create() {
            return builder().build();
        }

        /**
         * @return createdUsers
         */
        public java.util.List < CreatedUsers> getCreatedUsers() {
            return this.createdUsers;
        }

        /**
         * @return failedUsers
         */
        public java.util.List < FailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

        public static final class Builder {
            private java.util.List < CreatedUsers> createdUsers; 
            private java.util.List < FailedUsers> failedUsers; 

            /**
             * CreatedUsers.
             */
            public Builder createdUsers(java.util.List < CreatedUsers> createdUsers) {
                this.createdUsers = createdUsers;
                return this;
            }

            /**
             * FailedUsers.
             */
            public Builder failedUsers(java.util.List < FailedUsers> failedUsers) {
                this.failedUsers = failedUsers;
                return this;
            }

            public CreateResult build() {
                return new CreateResult(this);
            } 

        } 

    }
}
