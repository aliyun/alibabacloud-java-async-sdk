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
 * {@link ListDatabaseAccountsForUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabaseAccountsForUserGroupResponseBody</p>
 */
public class ListDatabaseAccountsForUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseAccounts")
    private java.util.List<DatabaseAccounts> databaseAccounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDatabaseAccountsForUserGroupResponseBody(Builder builder) {
        this.databaseAccounts = builder.databaseAccounts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseAccountsForUserGroupResponseBody create() {
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

        private Builder(ListDatabaseAccountsForUserGroupResponseBody model) {
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
         * <p>The total number of database accounts returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDatabaseAccountsForUserGroupResponseBody build() {
            return new ListDatabaseAccountsForUserGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatabaseAccountsForUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabaseAccountsForUserGroupResponseBody</p>
     */
    public static class DatabaseAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseAccountId")
        private String databaseAccountId;

        @com.aliyun.core.annotation.NameInMap("DatabaseAccountName")
        private String databaseAccountName;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        @com.aliyun.core.annotation.NameInMap("IsAuthorized")
        private Boolean isAuthorized;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
        private String protocolName;

        private DatabaseAccounts(Builder builder) {
            this.databaseAccountId = builder.databaseAccountId;
            this.databaseAccountName = builder.databaseAccountName;
            this.databaseId = builder.databaseId;
            this.isAuthorized = builder.isAuthorized;
            this.protocolName = builder.protocolName;
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
         * @return isAuthorized
         */
        public Boolean getIsAuthorized() {
            return this.isAuthorized;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        public static final class Builder {
            private String databaseAccountId; 
            private String databaseAccountName; 
            private String databaseId; 
            private Boolean isAuthorized; 
            private String protocolName; 

            private Builder() {
            } 

            private Builder(DatabaseAccounts model) {
                this.databaseAccountId = model.databaseAccountId;
                this.databaseAccountName = model.databaseAccountName;
                this.databaseId = model.databaseId;
                this.isAuthorized = model.isAuthorized;
                this.protocolName = model.protocolName;
            } 

            /**
             * <p>The ID of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder databaseAccountId(String databaseAccountId) {
                this.databaseAccountId = databaseAccountId;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder databaseAccountName(String databaseAccountName) {
                this.databaseAccountName = databaseAccountName;
                return this;
            }

            /**
             * <p>The ID of the database to which the database account belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * <p>Indicates whether the user group is authorized to manage the database account. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAuthorized(Boolean isAuthorized) {
                this.isAuthorized = isAuthorized;
                return this;
            }

            /**
             * <p>The protocol used by the database account. Valid values:</p>
             * <ul>
             * <li><strong>MySQL</strong></li>
             * <li><strong>Oracle</strong></li>
             * <li><strong>PostgreSQL</strong></li>
             * <li><strong>SQLServer</strong></li>
             * </ul>
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
