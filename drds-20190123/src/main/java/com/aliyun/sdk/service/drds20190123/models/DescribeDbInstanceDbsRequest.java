// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDbInstanceDbsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDbInstanceDbsRequest</p>
 */
public class DescribeDbInstanceDbsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstType")
    private String dbInstType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    private DescribeDbInstanceDbsRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.dbInstType = builder.dbInstType;
        this.dbInstanceId = builder.dbInstanceId;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbInstanceDbsRequest create() {
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
     * @return dbInstType
     */
    public String getDbInstType() {
        return this.dbInstType;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
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

    public static final class Builder extends Request.Builder<DescribeDbInstanceDbsRequest, Builder> {
        private String accountName; 
        private String dbInstType; 
        private String dbInstanceId; 
        private String drdsInstanceId; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDbInstanceDbsRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.dbInstType = request.dbInstType;
            this.dbInstanceId = request.dbInstanceId;
            this.drdsInstanceId = request.drdsInstanceId;
            this.password = request.password;
        } 

        /**
         * <p>The name of the privileged account of the PolarDB-X 1.0 instance. You do not need to specify this parameter if you have no privileged account.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The engine type of the storage-layer databases. Valid values: <strong>POLARDB</strong> and <strong>RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>POLARDB</p>
         */
        public Builder dbInstType(String dbInstType) {
            this.putQueryParameter("DbInstType", dbInstType);
            this.dbInstType = dbInstType;
            return this;
        }

        /**
         * <p>The ID of the instance in which the storage-layer databases are deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * <p>The ID of the PolarDB-X 1.0 instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds************</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The password of the privileged account. You do not need to specify this parameter if you have no privileged account.</p>
         * 
         * <strong>example:</strong>
         * <p>pwd_111111</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        @Override
        public DescribeDbInstanceDbsRequest build() {
            return new DescribeDbInstanceDbsRequest(this);
        } 

    } 

}
