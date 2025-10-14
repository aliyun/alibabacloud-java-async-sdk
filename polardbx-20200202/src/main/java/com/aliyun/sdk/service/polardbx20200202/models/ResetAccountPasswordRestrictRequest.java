// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link ResetAccountPasswordRestrictRequest} extends {@link RequestModel}
 *
 * <p>ResetAccountPasswordRestrictRequest</p>
 */
public class ResetAccountPasswordRestrictRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityAccountName")
    private String securityAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityAccountPassword")
    private String securityAccountPassword;

    private ResetAccountPasswordRestrictRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
        this.securityAccountName = builder.securityAccountName;
        this.securityAccountPassword = builder.securityAccountPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAccountPasswordRestrictRequest create() {
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
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityAccountName
     */
    public String getSecurityAccountName() {
        return this.securityAccountName;
    }

    /**
     * @return securityAccountPassword
     */
    public String getSecurityAccountPassword() {
        return this.securityAccountPassword;
    }

    public static final class Builder extends Request.Builder<ResetAccountPasswordRestrictRequest, Builder> {
        private String accountName; 
        private String accountPassword; 
        private String DBInstanceName; 
        private String regionId; 
        private String securityAccountName; 
        private String securityAccountPassword; 

        private Builder() {
            super();
        } 

        private Builder(ResetAccountPasswordRestrictRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
            this.securityAccountName = request.securityAccountName;
            this.securityAccountPassword = request.securityAccountPassword;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testaccount</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-********</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SecurityAccountName.
         */
        public Builder securityAccountName(String securityAccountName) {
            this.putQueryParameter("SecurityAccountName", securityAccountName);
            this.securityAccountName = securityAccountName;
            return this;
        }

        /**
         * SecurityAccountPassword.
         */
        public Builder securityAccountPassword(String securityAccountPassword) {
            this.putQueryParameter("SecurityAccountPassword", securityAccountPassword);
            this.securityAccountPassword = securityAccountPassword;
            return this;
        }

        @Override
        public ResetAccountPasswordRestrictRequest build() {
            return new ResetAccountPasswordRestrictRequest(this);
        } 

    } 

}
