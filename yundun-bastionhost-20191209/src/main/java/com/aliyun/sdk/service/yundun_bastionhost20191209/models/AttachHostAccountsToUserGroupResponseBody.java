// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachHostAccountsToUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>AttachHostAccountsToUserGroupResponseBody</p>
 */
public class AttachHostAccountsToUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
    private java.util.List < Results> results;

    private AttachHostAccountsToUserGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachHostAccountsToUserGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List < Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Results> results; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result of the call.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        public AttachHostAccountsToUserGroupResponseBody build() {
            return new AttachHostAccountsToUserGroupResponseBody(this);
        } 

    } 

    public static class HostAccounts extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("HostAccountId")
        private String hostAccountId;

        @NameInMap("Message")
        private String message;

        private HostAccounts(Builder builder) {
            this.code = builder.code;
            this.hostAccountId = builder.hostAccountId;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAccounts create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return hostAccountId
         */
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String hostAccountId; 
            private String message; 

            /**
             * The return code that indicates whether the user group was authorized to manage the specified host account. Valid values:
             * <p>
             * 
             * *   **OK**: The call was successful.
             * *   **UNEXPECTED**: An unknown error occurred.
             * *   **INVALID_ARGUMENT**: A request parameter is invalid.
             * *   **OBJECT_NOT_FOUND**: The specified object on which you want to perform the operation does not exist.
             * *   **OBJECT_AlREADY_EXISTS**: The specified object on which you want to perform the operation already exists.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The ID of the host account.
             */
            public Builder hostAccountId(String hostAccountId) {
                this.hostAccountId = hostAccountId;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public HostAccounts build() {
                return new HostAccounts(this);
            } 

        } 

    }
    public static class Results extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("HostAccounts")
        private java.util.List < HostAccounts> hostAccounts;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("Message")
        private String message;

        @NameInMap("UserGroupId")
        private String userGroupId;

        private Results(Builder builder) {
            this.code = builder.code;
            this.hostAccounts = builder.hostAccounts;
            this.hostId = builder.hostId;
            this.message = builder.message;
            this.userGroupId = builder.userGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return hostAccounts
         */
        public java.util.List < HostAccounts> getHostAccounts() {
            return this.hostAccounts;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public static final class Builder {
            private String code; 
            private java.util.List < HostAccounts> hostAccounts; 
            private String hostId; 
            private String message; 
            private String userGroupId; 

            /**
             * The return code that indicates whether the call was successful. Valid values:
             * <p>
             * 
             * *   **OK**: The call was successful.
             * *   **UNEXPECTED**: An unknown error occurred.
             * *   **INVALID_ARGUMENT**: A request parameter is invalid.
             * *   **OBJECT_NOT_FOUND**: The specified object on which you want to perform the operation does not exist.
             * *   **OBJECT_AlREADY_EXISTS**: The specified object on which you want to perform the operation already exists.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The result of authorizing the specified user group to manage the specified host accounts.
             */
            public Builder hostAccounts(java.util.List < HostAccounts> hostAccounts) {
                this.hostAccounts = hostAccounts;
                return this;
            }

            /**
             * The ID of the host.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the group.
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
