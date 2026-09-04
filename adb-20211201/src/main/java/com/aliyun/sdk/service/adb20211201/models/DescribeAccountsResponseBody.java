// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
    @com.aliyun.core.annotation.NameInMap("AccountList")
    private AccountList accountList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAccountsResponseBody(Builder builder) {
        this.accountList = builder.accountList;
        this.requestId = builder.requestId;
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
     * @return accountList
     */
    public AccountList getAccountList() {
        return this.accountList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccountList accountList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAccountsResponseBody model) {
            this.accountList = model.accountList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried database accounts.</p>
         */
        public Builder accountList(AccountList accountList) {
            this.accountList = accountList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9CCFAAB4-97B7-5800-B9F2-685EB596E3EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
    public static class PromqlInsertPrivileges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromqlInsertPrivileges")
        private java.util.List<String> promqlInsertPrivileges;

        private PromqlInsertPrivileges(Builder builder) {
            this.promqlInsertPrivileges = builder.promqlInsertPrivileges;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromqlInsertPrivileges create() {
            return builder().build();
        }

        /**
         * @return promqlInsertPrivileges
         */
        public java.util.List<String> getPromqlInsertPrivileges() {
            return this.promqlInsertPrivileges;
        }

        public static final class Builder {
            private java.util.List<String> promqlInsertPrivileges; 

            private Builder() {
            } 

            private Builder(PromqlInsertPrivileges model) {
                this.promqlInsertPrivileges = model.promqlInsertPrivileges;
            } 

            /**
             * PromqlInsertPrivileges.
             */
            public Builder promqlInsertPrivileges(java.util.List<String> promqlInsertPrivileges) {
                this.promqlInsertPrivileges = promqlInsertPrivileges;
                return this;
            }

            public PromqlInsertPrivileges build() {
                return new PromqlInsertPrivileges(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
    public static class PromqlSelectNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromqlSelectNodes")
        private java.util.List<String> promqlSelectNodes;

        private PromqlSelectNodes(Builder builder) {
            this.promqlSelectNodes = builder.promqlSelectNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromqlSelectNodes create() {
            return builder().build();
        }

        /**
         * @return promqlSelectNodes
         */
        public java.util.List<String> getPromqlSelectNodes() {
            return this.promqlSelectNodes;
        }

        public static final class Builder {
            private java.util.List<String> promqlSelectNodes; 

            private Builder() {
            } 

            private Builder(PromqlSelectNodes model) {
                this.promqlSelectNodes = model.promqlSelectNodes;
            } 

            /**
             * PromqlSelectNodes.
             */
            public Builder promqlSelectNodes(java.util.List<String> promqlSelectNodes) {
                this.promqlSelectNodes = promqlSelectNodes;
                return this;
            }

            public PromqlSelectNodes build() {
                return new PromqlSelectNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
    public static class PromqlSelectPrivileges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromqlSelectPrivileges")
        private java.util.List<String> promqlSelectPrivileges;

        private PromqlSelectPrivileges(Builder builder) {
            this.promqlSelectPrivileges = builder.promqlSelectPrivileges;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromqlSelectPrivileges create() {
            return builder().build();
        }

        /**
         * @return promqlSelectPrivileges
         */
        public java.util.List<String> getPromqlSelectPrivileges() {
            return this.promqlSelectPrivileges;
        }

        public static final class Builder {
            private java.util.List<String> promqlSelectPrivileges; 

            private Builder() {
            } 

            private Builder(PromqlSelectPrivileges model) {
                this.promqlSelectPrivileges = model.promqlSelectPrivileges;
            } 

            /**
             * PromqlSelectPrivileges.
             */
            public Builder promqlSelectPrivileges(java.util.List<String> promqlSelectPrivileges) {
                this.promqlSelectPrivileges = promqlSelectPrivileges;
                return this;
            }

            public PromqlSelectPrivileges build() {
                return new PromqlSelectPrivileges(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
    public static class RamUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RamUserList")
        private java.util.List<String> ramUserList;

        private RamUserList(Builder builder) {
            this.ramUserList = builder.ramUserList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RamUserList create() {
            return builder().build();
        }

        /**
         * @return ramUserList
         */
        public java.util.List<String> getRamUserList() {
            return this.ramUserList;
        }

        public static final class Builder {
            private java.util.List<String> ramUserList; 

            private Builder() {
            } 

            private Builder(RamUserList model) {
                this.ramUserList = model.ramUserList;
            } 

            /**
             * RamUserList.
             */
            public Builder ramUserList(java.util.List<String> ramUserList) {
                this.ramUserList = ramUserList;
                return this;
            }

            public RamUserList build() {
                return new RamUserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
    public static class DBAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountDescription")
        private String accountDescription;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("PromqlInsertPrivileges")
        private PromqlInsertPrivileges promqlInsertPrivileges;

        @com.aliyun.core.annotation.NameInMap("PromqlSelectNodes")
        private PromqlSelectNodes promqlSelectNodes;

        @com.aliyun.core.annotation.NameInMap("PromqlSelectPrivileges")
        private PromqlSelectPrivileges promqlSelectPrivileges;

        @com.aliyun.core.annotation.NameInMap("RamUserList")
        private RamUserList ramUserList;

        @com.aliyun.core.annotation.NameInMap("RamUsers")
        private String ramUsers;

        @com.aliyun.core.annotation.NameInMap("promqlSelectNodePercentage")
        private Double promqlSelectNodePercentage;

        private DBAccount(Builder builder) {
            this.accountDescription = builder.accountDescription;
            this.accountName = builder.accountName;
            this.accountStatus = builder.accountStatus;
            this.accountType = builder.accountType;
            this.engine = builder.engine;
            this.promqlInsertPrivileges = builder.promqlInsertPrivileges;
            this.promqlSelectNodes = builder.promqlSelectNodes;
            this.promqlSelectPrivileges = builder.promqlSelectPrivileges;
            this.ramUserList = builder.ramUserList;
            this.ramUsers = builder.ramUsers;
            this.promqlSelectNodePercentage = builder.promqlSelectNodePercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBAccount create() {
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
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return promqlInsertPrivileges
         */
        public PromqlInsertPrivileges getPromqlInsertPrivileges() {
            return this.promqlInsertPrivileges;
        }

        /**
         * @return promqlSelectNodes
         */
        public PromqlSelectNodes getPromqlSelectNodes() {
            return this.promqlSelectNodes;
        }

        /**
         * @return promqlSelectPrivileges
         */
        public PromqlSelectPrivileges getPromqlSelectPrivileges() {
            return this.promqlSelectPrivileges;
        }

        /**
         * @return ramUserList
         */
        public RamUserList getRamUserList() {
            return this.ramUserList;
        }

        /**
         * @return ramUsers
         */
        public String getRamUsers() {
            return this.ramUsers;
        }

        /**
         * @return promqlSelectNodePercentage
         */
        public Double getPromqlSelectNodePercentage() {
            return this.promqlSelectNodePercentage;
        }

        public static final class Builder {
            private String accountDescription; 
            private String accountName; 
            private String accountStatus; 
            private String accountType; 
            private String engine; 
            private PromqlInsertPrivileges promqlInsertPrivileges; 
            private PromqlSelectNodes promqlSelectNodes; 
            private PromqlSelectPrivileges promqlSelectPrivileges; 
            private RamUserList ramUserList; 
            private String ramUsers; 
            private Double promqlSelectNodePercentage; 

            private Builder() {
            } 

            private Builder(DBAccount model) {
                this.accountDescription = model.accountDescription;
                this.accountName = model.accountName;
                this.accountStatus = model.accountStatus;
                this.accountType = model.accountType;
                this.engine = model.engine;
                this.promqlInsertPrivileges = model.promqlInsertPrivileges;
                this.promqlSelectNodes = model.promqlSelectNodes;
                this.promqlSelectPrivileges = model.promqlSelectPrivileges;
                this.ramUserList = model.ramUserList;
                this.ramUsers = model.ramUsers;
                this.promqlSelectNodePercentage = model.promqlSelectNodePercentage;
            } 

            /**
             * <p>The description of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test_accout_des</p>
             */
            public Builder accountDescription(String accountDescription) {
                this.accountDescription = accountDescription;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test_accout</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The status of the database account. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * <p>The type of the database account. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: standard account.</li>
             * <li><strong>Super</strong>: privileged account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The database engine of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>AnalyticDB</strong>: the AnalyticDB for MySQL engine.</li>
             * <li><strong>Clickhouse</strong>: the wide table engine.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Clickhouse</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * PromqlInsertPrivileges.
             */
            public Builder promqlInsertPrivileges(PromqlInsertPrivileges promqlInsertPrivileges) {
                this.promqlInsertPrivileges = promqlInsertPrivileges;
                return this;
            }

            /**
             * PromqlSelectNodes.
             */
            public Builder promqlSelectNodes(PromqlSelectNodes promqlSelectNodes) {
                this.promqlSelectNodes = promqlSelectNodes;
                return this;
            }

            /**
             * PromqlSelectPrivileges.
             */
            public Builder promqlSelectPrivileges(PromqlSelectPrivileges promqlSelectPrivileges) {
                this.promqlSelectPrivileges = promqlSelectPrivileges;
                return this;
            }

            /**
             * RamUserList.
             */
            public Builder ramUserList(RamUserList ramUserList) {
                this.ramUserList = ramUserList;
                return this;
            }

            /**
             * <p>The ID of the Resource Access Management (RAM) user.</p>
             * 
             * <strong>example:</strong>
             * <p>1958134230****</p>
             */
            public Builder ramUsers(String ramUsers) {
                this.ramUsers = ramUsers;
                return this;
            }

            /**
             * promqlSelectNodePercentage.
             */
            public Builder promqlSelectNodePercentage(Double promqlSelectNodePercentage) {
                this.promqlSelectNodePercentage = promqlSelectNodePercentage;
                return this;
            }

            public DBAccount build() {
                return new DBAccount(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountsResponseBody</p>
     */
    public static class AccountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBAccount")
        private java.util.List<DBAccount> DBAccount;

        private AccountList(Builder builder) {
            this.DBAccount = builder.DBAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountList create() {
            return builder().build();
        }

        /**
         * @return DBAccount
         */
        public java.util.List<DBAccount> getDBAccount() {
            return this.DBAccount;
        }

        public static final class Builder {
            private java.util.List<DBAccount> DBAccount; 

            private Builder() {
            } 

            private Builder(AccountList model) {
                this.DBAccount = model.DBAccount;
            } 

            /**
             * DBAccount.
             */
            public Builder DBAccount(java.util.List<DBAccount> DBAccount) {
                this.DBAccount = DBAccount;
                return this;
            }

            public AccountList build() {
                return new AccountList(this);
            } 

        } 

    }
}
