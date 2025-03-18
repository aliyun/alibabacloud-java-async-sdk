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
 * {@link GetDatabaseAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatabaseAccountResponseBody</p>
 */
public class GetDatabaseAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseAccount")
    private DatabaseAccount databaseAccount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDatabaseAccountResponseBody(Builder builder) {
        this.databaseAccount = builder.databaseAccount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseAccount
     */
    public DatabaseAccount getDatabaseAccount() {
        return this.databaseAccount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DatabaseAccount databaseAccount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDatabaseAccountResponseBody model) {
            this.databaseAccount = model.databaseAccount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned information about the database account.</p>
         */
        public Builder databaseAccount(DatabaseAccount databaseAccount) {
            this.databaseAccount = databaseAccount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FA06D274-8D0A-59FB-8B7E-584C0EEBBFFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDatabaseAccountResponseBody build() {
            return new GetDatabaseAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDatabaseAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatabaseAccountResponseBody</p>
     */
    public static class DatabaseAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseAccountId")
        private String databaseAccountId;

        @com.aliyun.core.annotation.NameInMap("DatabaseAccountName")
        private String databaseAccountName;

        @com.aliyun.core.annotation.NameInMap("DatabaseSchema")
        private String databaseSchema;

        @com.aliyun.core.annotation.NameInMap("HasPassword")
        private Boolean hasPassword;

        @com.aliyun.core.annotation.NameInMap("LoginAttribute")
        private String loginAttribute;

        private DatabaseAccount(Builder builder) {
            this.databaseAccountId = builder.databaseAccountId;
            this.databaseAccountName = builder.databaseAccountName;
            this.databaseSchema = builder.databaseSchema;
            this.hasPassword = builder.hasPassword;
            this.loginAttribute = builder.loginAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseAccount create() {
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
         * @return databaseSchema
         */
        public String getDatabaseSchema() {
            return this.databaseSchema;
        }

        /**
         * @return hasPassword
         */
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        /**
         * @return loginAttribute
         */
        public String getLoginAttribute() {
            return this.loginAttribute;
        }

        public static final class Builder {
            private String databaseAccountId; 
            private String databaseAccountName; 
            private String databaseSchema; 
            private Boolean hasPassword; 
            private String loginAttribute; 

            private Builder() {
            } 

            private Builder(DatabaseAccount model) {
                this.databaseAccountId = model.databaseAccountId;
                this.databaseAccountName = model.databaseAccountName;
                this.databaseSchema = model.databaseSchema;
                this.hasPassword = model.hasPassword;
                this.loginAttribute = model.loginAttribute;
            } 

            /**
             * <p>The database account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder databaseAccountId(String databaseAccountId) {
                this.databaseAccountId = databaseAccountId;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>uac</p>
             */
            public Builder databaseAccountName(String databaseAccountName) {
                this.databaseAccountName = databaseAccountName;
                return this;
            }

            /**
             * <p>The database name. A value is returned for this parameter if the database engine is PostgreSQL or Oracle.</p>
             * 
             * <strong>example:</strong>
             * <p>orcl</p>
             */
            public Builder databaseSchema(String databaseSchema) {
                this.databaseSchema = databaseSchema;
                return this;
            }

            /**
             * <p>Indicates whether the database account has a password.
             * Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasPassword(Boolean hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * <p>The logon attribute. A value is returned for this parameter if the database engine is Oracle. Valid values:</p>
             * <ul>
             * <li>SERVICENAME</li>
             * <li>SID</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SID</p>
             */
            public Builder loginAttribute(String loginAttribute) {
                this.loginAttribute = loginAttribute;
                return this;
            }

            public DatabaseAccount build() {
                return new DatabaseAccount(this);
            } 

        } 

    }
}
