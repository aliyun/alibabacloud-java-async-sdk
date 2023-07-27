// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindAccountRequest} extends {@link RequestModel}
 *
 * <p>UnbindAccountRequest</p>
 */
public class UnbindAccountRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    private UnbindAccountRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindAccountRequest create() {
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

    public static final class Builder extends Request.Builder<UnbindAccountRequest, Builder> {
        private String accountName; 
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindAccountRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * The name of the database account.
         * <p>
         * 
         * > You can call the [DescribeAccounts](~~~~) operation to view the information about a database account in a cluster, including the name of the database account.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public UnbindAccountRequest build() {
            return new UnbindAccountRequest(this);
        } 

    } 

}
