// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DsgUserGroupQueryUserListResponseBody} extends {@link TeaModel}
 *
 * <p>DsgUserGroupQueryUserListResponseBody</p>
 */
public class DsgUserGroupQueryUserListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DsgUserGroupQueryUserListResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgUserGroupQueryUserListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The returned result.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DsgUserGroupQueryUserListResponseBody build() {
            return new DsgUserGroupQueryUserListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private Integer accountType;

        @com.aliyun.core.annotation.NameInMap("BaseId")
        private String baseId;

        @com.aliyun.core.annotation.NameInMap("ParentAccountId")
        private String parentAccountId;

        @com.aliyun.core.annotation.NameInMap("YunAccount")
        private String yunAccount;

        private Data(Builder builder) {
            this.accountName = builder.accountName;
            this.accountType = builder.accountType;
            this.baseId = builder.baseId;
            this.parentAccountId = builder.parentAccountId;
            this.yunAccount = builder.yunAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountType
         */
        public Integer getAccountType() {
            return this.accountType;
        }

        /**
         * @return baseId
         */
        public String getBaseId() {
            return this.baseId;
        }

        /**
         * @return parentAccountId
         */
        public String getParentAccountId() {
            return this.parentAccountId;
        }

        /**
         * @return yunAccount
         */
        public String getYunAccount() {
            return this.yunAccount;
        }

        public static final class Builder {
            private String accountName; 
            private Integer accountType; 
            private String baseId; 
            private String parentAccountId; 
            private String yunAccount; 

            /**
             * The name of the user.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The type of the user. Valid values:
             * <p>
             * 
             * *   1 to 5: Alibaba Cloud account
             * *   6: RAM role
             */
            public Builder accountType(Integer accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * The user ID or role ID.
             */
            public Builder baseId(String baseId) {
                this.baseId = baseId;
                return this;
            }

            /**
             * The parent user ID. This parameter is required if a RAM user is used.
             */
            public Builder parentAccountId(String parentAccountId) {
                this.parentAccountId = parentAccountId;
                return this;
            }

            /**
             * The name of the Alibaba Cloud account or RAM role. The return value of this parameter must be used if the user group is created by using an Alibaba Cloud account or a RAM role.
             */
            public Builder yunAccount(String yunAccount) {
                this.yunAccount = yunAccount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
