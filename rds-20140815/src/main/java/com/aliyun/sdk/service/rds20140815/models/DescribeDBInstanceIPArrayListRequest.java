// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeDBInstanceIPArrayListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceIPArrayListRequest</p>
 */
public class DescribeDBInstanceIPArrayListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhitelistNetworkType")
    private String whitelistNetworkType;

    private DescribeDBInstanceIPArrayListRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.whitelistNetworkType = builder.whitelistNetworkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceIPArrayListRequest create() {
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

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return whitelistNetworkType
     */
    public String getWhitelistNetworkType() {
        return this.whitelistNetworkType;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstanceIPArrayListRequest, Builder> {
        private String DBInstanceId; 
        private String ownerAccount; 
        private Long resourceOwnerId; 
        private String whitelistNetworkType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceIPArrayListRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.whitelistNetworkType = request.whitelistNetworkType;
        } 

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
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

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The network type of the IP address whitelist. Valid values:</p>
         * <ul>
         * <li><strong>Classic</strong>: classic network in enhanced whitelist mode</li>
         * <li><strong>VPC</strong>: virtual private cloud (VPC) in enhanced whitelist mode</li>
         * <li><strong>MIX</strong>: standard whitelist mode</li>
         * </ul>
         * <p>By default, this operation returns IP address whitelists of all network types.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder whitelistNetworkType(String whitelistNetworkType) {
            this.putQueryParameter("WhitelistNetworkType", whitelistNetworkType);
            this.whitelistNetworkType = whitelistNetworkType;
            return this;
        }

        @Override
        public DescribeDBInstanceIPArrayListRequest build() {
            return new DescribeDBInstanceIPArrayListRequest(this);
        } 

    } 

}
