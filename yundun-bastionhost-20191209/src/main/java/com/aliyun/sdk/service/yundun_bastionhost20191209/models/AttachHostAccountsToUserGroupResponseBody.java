// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachHostAccountsToUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>AttachHostAccountsToUserGroupResponseBody</p>
 */
public class AttachHostAccountsToUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the call.</p>
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        public AttachHostAccountsToUserGroupResponseBody build() {
            return new AttachHostAccountsToUserGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AttachHostAccountsToUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>AttachHostAccountsToUserGroupResponseBody</p>
     */
    public static class HostAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("HostAccountId")
        private String hostAccountId;

        @com.aliyun.core.annotation.NameInMap("Message")
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
             * <p>The return code that indicates whether the user group was authorized to manage the specified host account. Valid values:</p>
             * <ul>
             * <li><strong>OK</strong>: The call was successful.</li>
             * <li><strong>UNEXPECTED</strong>: An unknown error occurred.</li>
             * <li><strong>INVALID_ARGUMENT</strong>: A request parameter is invalid.</li>
             * <li><strong>OBJECT_NOT_FOUND</strong>: The specified object on which you want to perform the operation does not exist.</li>
             * <li><strong>OBJECT_AlREADY_EXISTS</strong>: The specified object on which you want to perform the operation already exists.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the host account.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostAccountId(String hostAccountId) {
                this.hostAccountId = hostAccountId;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
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
    /**
     * 
     * {@link AttachHostAccountsToUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>AttachHostAccountsToUserGroupResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("HostAccounts")
        private java.util.List < HostAccounts> hostAccounts;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
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
             * <p>The return code that indicates whether the call was successful. Valid values:</p>
             * <ul>
             * <li><strong>OK</strong>: The call was successful.</li>
             * <li><strong>UNEXPECTED</strong>: An unknown error occurred.</li>
             * <li><strong>INVALID_ARGUMENT</strong>: A request parameter is invalid.</li>
             * <li><strong>OBJECT_NOT_FOUND</strong>: The specified object on which you want to perform the operation does not exist.</li>
             * <li><strong>OBJECT_AlREADY_EXISTS</strong>: The specified object on which you want to perform the operation already exists.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The result of authorizing the specified user group to manage the specified host accounts.</p>
             */
            public Builder hostAccounts(java.util.List < HostAccounts> hostAccounts) {
                this.hostAccounts = hostAccounts;
                return this;
            }

            /**
             * <p>The ID of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
