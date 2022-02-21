// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllAccountsResponseBody</p>
 */
public class DescribeAllAccountsResponseBody extends TeaModel {
    @NameInMap("AccountList")
    private java.util.List < AccountList> accountList;

    @NameInMap("RequestId")
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
         * AccountList.
         */
        public Builder accountList(java.util.List < AccountList> accountList) {
            this.accountList = accountList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAllAccountsResponseBody build() {
            return new DescribeAllAccountsResponseBody(this);
        } 

    } 

    public static class AccountList extends TeaModel {
        @NameInMap("User")
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
             * User.
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
