// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInstanceRdAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceRdAccountsResponseBody</p>
 */
public class DescribeInstanceRdAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private java.util.List<Accounts> accounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceRdAccountsResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRdAccountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accounts
     */
    public java.util.List<Accounts> getAccounts() {
        return this.accounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Accounts> accounts; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceRdAccountsResponseBody model) {
            this.accounts = model.accounts;
            this.requestId = model.requestId;
        } 

        /**
         * Accounts.
         */
        public Builder accounts(java.util.List<Accounts> accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceRdAccountsResponseBody build() {
            return new DescribeInstanceRdAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceRdAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRdAccountsResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        private Accounts(Builder builder) {
            this.accountId = builder.accountId;
            this.displayName = builder.displayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        public static final class Builder {
            private String accountId; 
            private String displayName; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.accountId = model.accountId;
                this.displayName = model.displayName;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
