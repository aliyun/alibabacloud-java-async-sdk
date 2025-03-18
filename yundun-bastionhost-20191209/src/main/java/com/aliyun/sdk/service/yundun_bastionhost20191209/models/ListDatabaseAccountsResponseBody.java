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
 * {@link ListDatabaseAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabaseAccountsResponseBody</p>
 */
public class ListDatabaseAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseAccounts")
    private java.util.List<DatabaseAccounts> databaseAccounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDatabaseAccountsResponseBody(Builder builder) {
        this.databaseAccounts = builder.databaseAccounts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseAccountsResponseBody create() {
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

        private Builder(ListDatabaseAccountsResponseBody model) {
            this.databaseAccounts = model.databaseAccounts;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The returned database accounts.</p>
         */
        public Builder databaseAccounts(java.util.List<DatabaseAccounts> databaseAccounts) {
            this.databaseAccounts = databaseAccounts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4F6C075F-FC86-476E-943B-097BD4E12948</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of database accounts returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDatabaseAccountsResponseBody build() {
            return new ListDatabaseAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatabaseAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabaseAccountsResponseBody</p>
     */
    public static class DatabaseAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseAccountId")
        private String databaseAccountId;

        @com.aliyun.core.annotation.NameInMap("DatabaseAccountName")
        private String databaseAccountName;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        @com.aliyun.core.annotation.NameInMap("DatabaseSchema")
        private String databaseSchema;

        @com.aliyun.core.annotation.NameInMap("HasPassword")
        private String hasPassword;

        private DatabaseAccounts(Builder builder) {
            this.databaseAccountId = builder.databaseAccountId;
            this.databaseAccountName = builder.databaseAccountName;
            this.databaseId = builder.databaseId;
            this.databaseSchema = builder.databaseSchema;
            this.hasPassword = builder.hasPassword;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseAccounts create() {
            return builder().build();
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
         * @return databaseSchema
         */
        public String getDatabaseSchema() {
            return this.databaseSchema;
        }

        /**
         * @return hasPassword
         */
        public String getHasPassword() {
            return this.hasPassword;
        }

        public static final class Builder {
            private String databaseAccountId; 
            private String databaseAccountName; 
            private String databaseId; 
            private String databaseSchema; 
            private String hasPassword; 

            private Builder() {
            } 

            private Builder(DatabaseAccounts model) {
                this.databaseAccountId = model.databaseAccountId;
                this.databaseAccountName = model.databaseAccountName;
                this.databaseId = model.databaseId;
                this.databaseSchema = model.databaseSchema;
                this.hasPassword = model.hasPassword;
            } 

            /**
             * <p>The database account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>59</p>
             */
            public Builder databaseAccountId(String databaseAccountId) {
                this.databaseAccountId = databaseAccountId;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder databaseAccountName(String databaseAccountName) {
                this.databaseAccountName = databaseAccountName;
                return this;
            }

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * <p>The name of the database. A value is returned for this parameter if the engine of the database with the specified database ID is PostgreSQL or Oracle.</p>
             * 
             * <strong>example:</strong>
             * <p>orcl</p>
             */
            public Builder databaseSchema(String databaseSchema) {
                this.databaseSchema = databaseSchema;
                return this;
            }

            /**
             * <p>Indicates whether the database account has a password. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasPassword(String hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            public DatabaseAccounts build() {
                return new DatabaseAccounts(this);
            } 

        } 

    }
}
