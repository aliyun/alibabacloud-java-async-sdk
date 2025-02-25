// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReadOnlyAccountPasswordRequest} extends {@link RequestModel}
 *
 * <p>ModifyReadOnlyAccountPasswordRequest</p>
 */
public class ModifyReadOnlyAccountPasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPasswd")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newPasswd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originPassword;

    private ModifyReadOnlyAccountPasswordRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.newPasswd = builder.newPasswd;
        this.originPassword = builder.originPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReadOnlyAccountPasswordRequest create() {
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
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return newPasswd
     */
    public String getNewPasswd() {
        return this.newPasswd;
    }

    /**
     * @return originPassword
     */
    public String getOriginPassword() {
        return this.originPassword;
    }

    public static final class Builder extends Request.Builder<ModifyReadOnlyAccountPasswordRequest, Builder> {
        private String accountName; 
        private String dbName; 
        private String drdsInstanceId; 
        private String newPasswd; 
        private String originPassword; 

        private Builder() {
            super();
        } 

        private Builder(ModifyReadOnlyAccountPasswordRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.newPasswd = request.newPasswd;
            this.originPassword = request.originPassword;
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
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
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
         * NewPasswd.
         */
        public Builder newPasswd(String newPasswd) {
            this.putQueryParameter("NewPasswd", newPasswd);
            this.newPasswd = newPasswd;
            return this;
        }

        /**
         * OriginPassword.
         */
        public Builder originPassword(String originPassword) {
            this.putQueryParameter("OriginPassword", originPassword);
            this.originPassword = originPassword;
            return this;
        }

        @Override
        public ModifyReadOnlyAccountPasswordRequest build() {
            return new ModifyReadOnlyAccountPasswordRequest(this);
        } 

    } 

}
