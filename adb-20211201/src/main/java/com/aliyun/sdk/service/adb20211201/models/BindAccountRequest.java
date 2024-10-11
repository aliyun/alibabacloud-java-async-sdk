// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BindAccountRequest} extends {@link RequestModel}
 *
 * <p>BindAccountRequest</p>
 */
public class BindAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamUser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ramUser;

    private BindAccountRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.DBClusterId = builder.DBClusterId;
        this.ramUser = builder.ramUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAccountRequest create() {
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return ramUser
     */
    public String getRamUser() {
        return this.ramUser;
    }

    public static final class Builder extends Request.Builder<BindAccountRequest, Builder> {
        private String accountName; 
        private String DBClusterId; 
        private String ramUser; 

        private Builder() {
            super();
        } 

        private Builder(BindAccountRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.DBClusterId = request.DBClusterId;
            this.ramUser = request.ramUser;
        } 

        /**
         * <p>The standard account of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_accout</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-wz99d9nh532****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The ID of the RAM user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1444832459****</p>
         */
        public Builder ramUser(String ramUser) {
            this.putQueryParameter("RamUser", ramUser);
            this.ramUser = ramUser;
            return this;
        }

        @Override
        public BindAccountRequest build() {
            return new BindAccountRequest(this);
        } 

    } 

}
