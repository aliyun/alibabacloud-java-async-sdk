// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMemberAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMemberAccountsResponseBody</p>
 */
public class DescribeMemberAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountInfos")
    private java.util.List < AccountInfos> accountInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMemberAccountsResponseBody(Builder builder) {
        this.accountInfos = builder.accountInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMemberAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountInfos
     */
    public java.util.List < AccountInfos> getAccountInfos() {
        return this.accountInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AccountInfos> accountInfos; 
        private String requestId; 

        /**
         * The information about the member.
         */
        public Builder accountInfos(java.util.List < AccountInfos> accountInfos) {
            this.accountInfos = accountInfos;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMemberAccountsResponseBody build() {
            return new DescribeMemberAccountsResponseBody(this);
        } 

    } 

    public static class AccountInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        private AccountInfos(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.accountStatus = builder.accountStatus;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountInfos create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountStatus
         */
        public String getAccountStatus() {
            return this.accountStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public static final class Builder {
            private String accountId; 
            private String accountName; 
            private String accountStatus; 
            private String description; 
            private Long gmtCreate; 

            /**
             * The ID of the member.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The name of the member.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The status of the member.
             * <p>
             * 
             * *   **enabled**: managed.
             * *   **disabled**: not managed.
             * *   **disabling**: being deleted.
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * The description of the member.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the member was added.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            public AccountInfos build() {
                return new AccountInfos(this);
            } 

        } 

    }
}
