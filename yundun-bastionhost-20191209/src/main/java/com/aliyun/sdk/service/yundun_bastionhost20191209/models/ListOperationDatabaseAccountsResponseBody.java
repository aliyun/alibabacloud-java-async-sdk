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
 * {@link ListOperationDatabaseAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationDatabaseAccountsResponseBody</p>
 */
public class ListOperationDatabaseAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseAccounts")
    private java.util.List<DatabaseAccounts> databaseAccounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListOperationDatabaseAccountsResponseBody(Builder builder) {
        this.databaseAccounts = builder.databaseAccounts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationDatabaseAccountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseAccounts
     */
    public java.util.List<DatabaseAccounts> getDatabaseAccounts() {
        return this.databaseAccounts;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DatabaseAccounts> databaseAccounts; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListOperationDatabaseAccountsResponseBody model) {
            this.databaseAccounts = model.databaseAccounts;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The database accounts returned.</p>
         */
        public Builder databaseAccounts(java.util.List<DatabaseAccounts> databaseAccounts) {
            this.databaseAccounts = databaseAccounts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOperationDatabaseAccountsResponseBody build() {
            return new ListOperationDatabaseAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationDatabaseAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationDatabaseAccountsResponseBody</p>
     */
    public static class DatabaseAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DatabaseAccountId")
        private String databaseAccountId;

        @com.aliyun.core.annotation.NameInMap("DatabaseAccountName")
        private String databaseAccountName;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        @com.aliyun.core.annotation.NameInMap("HasPassword")
        private String hasPassword;

        @com.aliyun.core.annotation.NameInMap("LoginAttribute")
        private String loginAttribute;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
        private String protocolName;

        private DatabaseAccounts(Builder builder) {
            this.DBName = builder.DBName;
            this.databaseAccountId = builder.databaseAccountId;
            this.databaseAccountName = builder.databaseAccountName;
            this.databaseId = builder.databaseId;
            this.hasPassword = builder.hasPassword;
            this.loginAttribute = builder.loginAttribute;
            this.protocolName = builder.protocolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseAccounts create() {
            return builder().build();
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return databaseAccountId
         */
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        /**
         * @return databaseAccountName
         */
        public String getDatabaseAccountName() {
            return this.databaseAccountName;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        /**
         * @return hasPassword
         */
        public String getHasPassword() {
            return this.hasPassword;
        }

        /**
         * @return loginAttribute
         */
        public String getLoginAttribute() {
            return this.loginAttribute;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        public static final class Builder {
            private String DBName; 
            private String databaseAccountId; 
            private String databaseAccountName; 
            private String databaseId; 
            private String hasPassword; 
            private String loginAttribute; 
            private String protocolName; 

            private Builder() {
            } 

            private Builder(DatabaseAccounts model) {
                this.DBName = model.DBName;
                this.databaseAccountId = model.databaseAccountId;
                this.databaseAccountName = model.databaseAccountName;
                this.databaseId = model.databaseId;
                this.hasPassword = model.hasPassword;
                this.loginAttribute = model.loginAttribute;
                this.protocolName = model.protocolName;
            } 

            /**
             * <p>The name of the PostgreSQL or Oracle database.</p>
             * 
             * <strong>example:</strong>
             * <p>xe</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The database account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder databaseAccountId(String databaseAccountId) {
                this.databaseAccountId = databaseAccountId;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder databaseAccountName(String databaseAccountName) {
                this.databaseAccountName = databaseAccountName;
                return this;
            }

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * <p>Indicates whether a password is configured for the database host account.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasPassword(String hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * <p>The logon attribute. One of the following values is returned if the database engine is Oracle:</p>
             * <ul>
             * <li><strong>SERVICENAME</strong></li>
             * <li><strong>SID</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SID</p>
             */
            public Builder loginAttribute(String loginAttribute) {
                this.loginAttribute = loginAttribute;
                return this;
            }

            /**
             * <p>The protocol that is used by the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            public DatabaseAccounts build() {
                return new DatabaseAccounts(this);
            } 

        } 

    }
}
