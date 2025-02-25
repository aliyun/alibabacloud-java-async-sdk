// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImageSharePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageSharePermissionResponseBody</p>
 */
public class ListImageSharePermissionResponseBody extends TeaModel {
    @NameInMap("Accounts")
    private Accounts accounts;

    @NameInMap("RequestId")
    private String requestId;

    private ListImageSharePermissionResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageSharePermissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return accounts
     */
    public Accounts getAccounts() {
        return this.accounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Accounts accounts; 
        private String requestId; 

        /**
         * The list of Alibaba Cloud accounts.
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListImageSharePermissionResponseBody build() {
            return new ListImageSharePermissionResponseBody(this);
        } 

    } 

    public static class Account extends TeaModel {
        @NameInMap("AliyunId")
        private String aliyunId;

        private Account(Builder builder) {
            this.aliyunId = builder.aliyunId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Account create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        public static final class Builder {
            private String aliyunId; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            public Account build() {
                return new Account(this);
            } 

        } 

    }
    public static class Accounts extends TeaModel {
        @NameInMap("Account")
        private java.util.List < Account> account;

        private Accounts(Builder builder) {
            this.account = builder.account;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public java.util.List < Account> getAccount() {
            return this.account;
        }

        public static final class Builder {
            private java.util.List < Account> account; 

            /**
             * Account.
             */
            public Builder account(java.util.List < Account> account) {
                this.account = account;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
