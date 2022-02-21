// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDSVpcRequest} extends {@link RequestModel}
 *
 * <p>DescribeRDSVpcRequest</p>
 */
public class DescribeRDSVpcRequest extends Request {
    @Query
    @NameInMap("DbClusterId")
    private String dbClusterId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RdsId")
    @Validation(required = true)
    private String rdsId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeRDSVpcRequest(Builder builder) {
        super(builder);
        this.dbClusterId = builder.dbClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.rdsId = builder.rdsId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRDSVpcRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbClusterId
     */
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return rdsId
     */
    public String getRdsId() {
        return this.rdsId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DescribeRDSVpcRequest, Builder> {
        private String dbClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String rdsId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRDSVpcRequest response) {
            super(response);
            this.dbClusterId = response.dbClusterId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.rdsId = response.rdsId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * DbClusterId.
         */
        public Builder dbClusterId(String dbClusterId) {
            this.putQueryParameter("DbClusterId", dbClusterId);
            this.dbClusterId = dbClusterId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RdsId.
         */
        public Builder rdsId(String rdsId) {
            this.putQueryParameter("RdsId", rdsId);
            this.rdsId = rdsId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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

        @Override
        public DescribeRDSVpcRequest build() {
            return new DescribeRDSVpcRequest(this);
        } 

    } 

}
