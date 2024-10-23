// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAllAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllAccountsResponseBody</p>
 */
public class DescribeAllAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountList")
    private java.util.List < AccountList> accountList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAllAccountsResponseBody(Builder builder) {
        this.accountList = builder.accountList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountList
     */
    public java.util.List < AccountList> getAccountList() {
        return this.accountList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AccountList> accountList; 
        private String requestId; 

        /**
         * <p>The queried database accounts.</p>
         */
        public Builder accountList(java.util.List < AccountList> accountList) {
            this.accountList = accountList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAllAccountsResponseBody build() {
            return new DescribeAllAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAllAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllAccountsResponseBody</p>
     */
    public static class AccountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private AccountList(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountList create() {
            return builder().build();
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String user; 

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>rdsdt_dts_adb</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public AccountList build() {
                return new AccountList(this);
            } 

        } 

    }
}
