// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetachHostGroupAccountsFromUserResponseBody} extends {@link TeaModel}
 *
 * <p>DetachHostGroupAccountsFromUserResponseBody</p>
 */
public class DetachHostGroupAccountsFromUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List < Results> results;

    private DetachHostGroupAccountsFromUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachHostGroupAccountsFromUserResponseBody create() {
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

        public DetachHostGroupAccountsFromUserResponseBody build() {
            return new DetachHostGroupAccountsFromUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetachHostGroupAccountsFromUserResponseBody} extends {@link TeaModel}
     *
     * <p>DetachHostGroupAccountsFromUserResponseBody</p>
     */
    public static class HostAccountNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("HostAccountName")
        private String hostAccountName;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private HostAccountNames(Builder builder) {
            this.code = builder.code;
            this.hostAccountName = builder.hostAccountName;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAccountNames create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return hostAccountName
         */
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String hostAccountName; 
            private String message; 

            /**
             * <p>The return code that indicates whether permissions on the specified host account were revoked from the user. Valid values:</p>
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
             * <p>The name of the host account.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
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

            public HostAccountNames build() {
                return new HostAccountNames(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetachHostGroupAccountsFromUserResponseBody} extends {@link TeaModel}
     *
     * <p>DetachHostGroupAccountsFromUserResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("HostAccountNames")
        private java.util.List < HostAccountNames> hostAccountNames;

        @com.aliyun.core.annotation.NameInMap("HostGroupId")
        private String hostGroupId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Results(Builder builder) {
            this.code = builder.code;
            this.hostAccountNames = builder.hostAccountNames;
            this.hostGroupId = builder.hostGroupId;
            this.message = builder.message;
            this.userId = builder.userId;
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
         * @return hostAccountNames
         */
        public java.util.List < HostAccountNames> getHostAccountNames() {
            return this.hostAccountNames;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String code; 
            private java.util.List < HostAccountNames> hostAccountNames; 
            private String hostGroupId; 
            private String message; 
            private String userId; 

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
             * <p>The result of revoking permissions on the specified host accounts from the user.</p>
             */
            public Builder hostAccountNames(java.util.List < HostAccountNames> hostAccountNames) {
                this.hostAccountNames = hostAccountNames;
                return this;
            }

            /**
             * <p>The ID of the host group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
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
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
