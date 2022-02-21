// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceAccountRequest</p>
 */
public class CreateInstanceAccountRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("DbPrivilege")
    @Validation(required = true)
    private java.util.List < DbPrivilege> dbPrivilege;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    private CreateInstanceAccountRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.dbPrivilege = builder.dbPrivilege;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return dbPrivilege
     */
    public java.util.List < DbPrivilege> getDbPrivilege() {
        return this.dbPrivilege;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    public static final class Builder extends Request.Builder<CreateInstanceAccountRequest, Builder> {
        private String accountName; 
        private java.util.List < DbPrivilege> dbPrivilege; 
        private String drdsInstanceId; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceAccountRequest response) {
            super(response);
            this.accountName = response.accountName;
            this.dbPrivilege = response.dbPrivilege;
            this.drdsInstanceId = response.drdsInstanceId;
            this.password = response.password;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * DbPrivilege.
         */
        public Builder dbPrivilege(java.util.List < DbPrivilege> dbPrivilege) {
            this.putQueryParameter("DbPrivilege", dbPrivilege);
            this.dbPrivilege = dbPrivilege;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        @Override
        public CreateInstanceAccountRequest build() {
            return new CreateInstanceAccountRequest(this);
        } 

    } 

    public static class DbPrivilege extends TeaModel {
        @NameInMap("DbName")
        private String dbName;

        @NameInMap("Privilege")
        private String privilege;

        private DbPrivilege(Builder builder) {
            this.dbName = builder.dbName;
            this.privilege = builder.privilege;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbPrivilege create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return privilege
         */
        public String getPrivilege() {
            return this.privilege;
        }

        public static final class Builder {
            private String dbName; 
            private String privilege; 

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Privilege.
             */
            public Builder privilege(String privilege) {
                this.privilege = privilege;
                return this;
            }

            public DbPrivilege build() {
                return new DbPrivilege(this);
            } 

        } 

    }
}
