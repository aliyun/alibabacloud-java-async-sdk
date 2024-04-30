// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportOnlineResizeDiskRequest} extends {@link RequestModel}
 *
 * <p>DescribeSupportOnlineResizeDiskRequest</p>
 */
public class DescribeSupportOnlineResizeDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    private DescribeSupportOnlineResizeDiskRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerAccount = builder.ownerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupportOnlineResizeDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public static final class Builder extends Request.Builder<DescribeSupportOnlineResizeDiskRequest, Builder> {
        private String DBInstanceId; 
        private String ownerAccount; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSupportOnlineResizeDiskRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerAccount = request.ownerAccount;
        } 

        /**
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        @Override
        public DescribeSupportOnlineResizeDiskRequest build() {
            return new DescribeSupportOnlineResizeDiskRequest(this);
        } 

    } 

}
