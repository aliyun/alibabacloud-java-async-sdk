// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDatabaseAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatabaseAccountResponseBody</p>
 */
public class GetDatabaseAccountResponseBody extends TeaModel {
    @NameInMap("DatabaseAccount")
    private DatabaseAccount databaseAccount;

    @NameInMap("RequestId")
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

        /**
         * DatabaseAccount.
         */
        public Builder databaseAccount(DatabaseAccount databaseAccount) {
            this.databaseAccount = databaseAccount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDatabaseAccountResponseBody build() {
            return new GetDatabaseAccountResponseBody(this);
        } 

    } 

    public static class DatabaseAccount extends TeaModel {
        @NameInMap("DatabaseAccountId")
        private String databaseAccountId;

        @NameInMap("DatabaseAccountName")
        private String databaseAccountName;

        @NameInMap("DatabaseSchema")
        private String databaseSchema;

        @NameInMap("HasPassword")
        private Boolean hasPassword;

        @NameInMap("LoginAttribute")
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

            /**
             * DatabaseAccountId.
             */
            public Builder databaseAccountId(String databaseAccountId) {
                this.databaseAccountId = databaseAccountId;
                return this;
            }

            /**
             * DatabaseAccountName.
             */
            public Builder databaseAccountName(String databaseAccountName) {
                this.databaseAccountName = databaseAccountName;
                return this;
            }

            /**
             * DatabaseSchema.
             */
            public Builder databaseSchema(String databaseSchema) {
                this.databaseSchema = databaseSchema;
                return this;
            }

            /**
             * HasPassword.
             */
            public Builder hasPassword(Boolean hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * LoginAttribute.
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
