// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsAccountsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRdsAccountsRequest</p>
 */
public class DescribeRdsAccountsRequest extends Request {
    @Query
    @NameInMap("AccountName")
    private String accountName;

    @Query
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    private DescribeRdsAccountsRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.dbInstanceId = builder.dbInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsAccountsRequest create() {
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
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeRdsAccountsRequest, Builder> {
        private String accountName; 
        private String dbInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRdsAccountsRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.dbInstanceId = request.dbInstanceId;
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
         * DbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        @Override
        public DescribeRdsAccountsRequest build() {
            return new DescribeRdsAccountsRequest(this);
        } 

    } 

}
