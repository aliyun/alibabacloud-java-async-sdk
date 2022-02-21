// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbInstanceDbsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDbInstanceDbsRequest</p>
 */
public class DescribeDbInstanceDbsRequest extends Request {
    @Query
    @NameInMap("AccountName")
    private String accountName;

    @Query
    @NameInMap("DbInstType")
    private String dbInstType;

    @Query
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("Password")
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

        private Builder(DescribeDbInstanceDbsRequest response) {
            super(response);
            this.accountName = response.accountName;
            this.dbInstType = response.dbInstType;
            this.dbInstanceId = response.dbInstanceId;
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
         * DbInstType.
         */
        public Builder dbInstType(String dbInstType) {
            this.putQueryParameter("DbInstType", dbInstType);
            this.dbInstType = dbInstType;
            return this;
        }

        /**
         * DbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
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
        public DescribeDbInstanceDbsRequest build() {
            return new DescribeDbInstanceDbsRequest(this);
        } 

    } 

}
