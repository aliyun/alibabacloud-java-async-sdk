// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUsersResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUsersResponseBody</p>
 */
public class CreateUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateResult")
    private CreateResult createResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The result of user creation.</p>
         */
        public Builder createResult(CreateResult createResult) {
            this.createResult = createResult;
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

        public CreateUsersResponseBody build() {
            return new CreateUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateUsersResponseBody} extends {@link TeaModel}
     *
     * <p>CreateUsersResponseBody</p>
     */
    public static class CreatedUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("RealNickName")
        private String realNickName;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private CreatedUsers(Builder builder) {
            this.email = builder.email;
            this.endUserId = builder.endUserId;
            this.phone = builder.phone;
            this.realNickName = builder.realNickName;
            this.remark = builder.remark;
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

        /**
         * @return realNickName
         */
        public String getRealNickName() {
            return this.realNickName;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String email; 
            private String endUserId; 
            private String phone; 
            private String realNickName; 
            private String remark; 

            /**
             * <p>The email address of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The name of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The mobile number of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The display name of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>Bean</p>
             */
            public Builder realNickName(String realNickName) {
                this.realNickName = realNickName;
                return this;
            }

            /**
             * <p>The remarks of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>remark1</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public CreatedUsers build() {
                return new CreatedUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateUsersResponseBody} extends {@link TeaModel}
     *
     * <p>CreateUsersResponseBody</p>
     */
    public static class FailedUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Phone")
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
             * <p>The email address of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username2@example.com">username2@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The name of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>test2</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The error code returned if the request failed.</p>
             * 
             * <strong>example:</strong>
             * <p>ExistedEndUserId</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>The username test is used by another user.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The mobile number of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>1390000****</p>
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
    /**
     * 
     * {@link CreateUsersResponseBody} extends {@link TeaModel}
     *
     * <p>CreateUsersResponseBody</p>
     */
    public static class CreateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedUsers")
        private java.util.List < CreatedUsers> createdUsers;

        @com.aliyun.core.annotation.NameInMap("FailedUsers")
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
             * <p>Details of the created convenience users.</p>
             */
            public Builder createdUsers(java.util.List < CreatedUsers> createdUsers) {
                this.createdUsers = createdUsers;
                return this;
            }

            /**
             * <p>Details of the convenience users that failed to be created.</p>
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
