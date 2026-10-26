// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachHostAccountsToUserResponseBody} extends {@link TeaModel}
 *
 * <p>AttachHostAccountsToUserResponseBody</p>
 */
public class AttachHostAccountsToUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private AttachHostAccountsToUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachHostAccountsToUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(AttachHostAccountsToUserResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

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
         * <p>The results of the API call.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public AttachHostAccountsToUserResponseBody build() {
            return new AttachHostAccountsToUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AttachHostAccountsToUserResponseBody} extends {@link TeaModel}
     *
     * <p>AttachHostAccountsToUserResponseBody</p>
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

            private Builder() {
            } 

            private Builder(HostAccounts model) {
                this.code = model.code;
                this.hostAccountId = model.hostAccountId;
                this.message = model.message;
            } 

            /**
             * <p>The result returned for the operation of authorizing host accounts for the user. Valid values:</p>
             * <ul>
             * <li><strong>OK</strong>: The operation is successful.</li>
             * <li><strong>UNEXPECTED</strong>: An unknown error occurred.</li>
             * <li><strong>INVALID_ARGUMENT</strong>: A request parameter is invalid.</li>
             * <li><strong>OBJECT_NOT_FOUND</strong>: The object on which the operation is performed does not exist.</li>
             * <li><strong>OBJECT_AlREADY_EXISTS</strong>: The object on which the operation is performed already exists.</li>
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
             * <p><strong>[Deprecated]</strong> This parameter is deprecated. You can ignore it.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
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
     * {@link AttachHostAccountsToUserResponseBody} extends {@link TeaModel}
     *
     * <p>AttachHostAccountsToUserResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("HostAccounts")
        private java.util.List<HostAccounts> hostAccounts;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Results(Builder builder) {
            this.code = builder.code;
            this.hostAccounts = builder.hostAccounts;
            this.hostId = builder.hostId;
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
         * @return hostAccounts
         */
        public java.util.List<HostAccounts> getHostAccounts() {
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String code; 
            private java.util.List<HostAccounts> hostAccounts; 
            private String hostId; 
            private String message; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.code = model.code;
                this.hostAccounts = model.hostAccounts;
                this.hostId = model.hostId;
                this.message = model.message;
                this.userId = model.userId;
            } 

            /**
             * <p>The result of the API call. Valid values:</p>
             * <ul>
             * <li><p><strong>OK</strong>: The operation is successful.</p>
             * </li>
             * <li><p><strong>UNEXPECTED</strong>: An unknown error occurred.</p>
             * </li>
             * <li><p><strong>INVALID_ARGUMENT</strong>: A request parameter is invalid.</p>
             * <blockquote>
             * <p>Check the request parameters, ensure that they are correct, and then call the operation again.</p>
             * </blockquote>
             * </li>
             * <li><p><strong>OBJECT_NOT_FOUND</strong>: The object on which the operation is performed does not exist.</p>
             * <blockquote>
             * <p>Check whether the ID of the Bastionhost instance exists, whether the host exists, and whether the host ID is correct, and then call the operation again.</p>
             * </blockquote>
             * </li>
             * <li><p><strong>OBJECT_AlREADY_EXISTS</strong>: The object on which the operation is performed already exists.</p>
             * </li>
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
             * <p>The results returned for the operation of authorizing host accounts for the user.</p>
             */
            public Builder hostAccounts(java.util.List<HostAccounts> hostAccounts) {
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
             * <p><strong>[Deprecated]</strong> This parameter is deprecated. You can ignore it.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
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
