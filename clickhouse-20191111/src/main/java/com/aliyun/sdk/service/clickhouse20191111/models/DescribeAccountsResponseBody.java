// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountsResponseBody</p>
 */
public class DescribeAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private Accounts accounts;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAccountsResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accounts
     */
    public Accounts getAccounts() {
        return this.accounts;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Accounts accounts; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAccountsResponseBody model) {
            this.accounts = model.accounts;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The database accounts.</p>
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccountsResponseBody build() {
            return new DescribeAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
    public static class Account extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountDescription")
        private String accountDescription;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        private Account(Builder builder) {
            this.accountDescription = builder.accountDescription;
            this.accountName = builder.accountName;
            this.accountStatus = builder.accountStatus;
            this.accountType = builder.accountType;
            this.configType = builder.configType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Account create() {
            return builder().build();
        }

        /**
         * @return accountDescription
         */
        public String getAccountDescription() {
            return this.accountDescription;
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
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        public static final class Builder {
            private String accountDescription; 
            private String accountName; 
            private String accountStatus; 
            private String accountType; 
            private String configType; 

            private Builder() {
            } 

            private Builder(Account model) {
                this.accountDescription = model.accountDescription;
                this.accountName = model.accountName;
                this.accountStatus = model.accountStatus;
                this.accountType = model.accountType;
                this.configType = model.configType;
            } 

            /**
             * <p>The description of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder accountDescription(String accountDescription) {
                this.accountDescription = accountDescription;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The state of the database account. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>AuthorityModifying</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * <blockquote>
             * <p> Only XML-configured database accounts can be in the <strong>AuthorityModifying</strong> state.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * <p>The type of the database account. Valid values:</p>
             * <ul>
             * <li><strong>Super</strong>: privileged account</li>
             * <li><strong>Normal</strong>: standard account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Super</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The configuration mode of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            public Account build() {
                return new Account(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private java.util.List<Account> account;

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
        public java.util.List<Account> getAccount() {
            return this.account;
        }

        public static final class Builder {
            private java.util.List<Account> account; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.account = model.account;
            } 

            /**
             * Account.
             */
            public Builder account(java.util.List<Account> account) {
                this.account = account;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
