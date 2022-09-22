// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcHavsInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcHavsInstancesRequest</p>
 */
public class DescribeVpcHavsInstancesRequest extends Request {
    @Query
    @NameInMap("MaxResultSize")
    private Integer maxResultSize;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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

    @Query
    @NameInMap("VpcIdList")
    @Validation(required = true)
    private java.util.List < String > vpcIdList;

    private DescribeVpcHavsInstancesRequest(Builder builder) {
        super(builder);
        this.maxResultSize = builder.maxResultSize;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vpcIdList = builder.vpcIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcHavsInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResultSize
     */
    public Integer getMaxResultSize() {
        return this.maxResultSize;
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

    /**
     * @return vpcIdList
     */
    public java.util.List < String > getVpcIdList() {
        return this.vpcIdList;
    }

    public static final class Builder extends Request.Builder<DescribeVpcHavsInstancesRequest, Builder> {
        private Integer maxResultSize; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < String > vpcIdList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcHavsInstancesRequest request) {
            super(request);
            this.maxResultSize = request.maxResultSize;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vpcIdList = request.vpcIdList;
        } 

        /**
         * MaxResultSize.
         */
        public Builder maxResultSize(Integer maxResultSize) {
            this.putQueryParameter("MaxResultSize", maxResultSize);
            this.maxResultSize = maxResultSize;
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

        /**
         * VpcIdList.
         */
        public Builder vpcIdList(java.util.List < String > vpcIdList) {
            this.putQueryParameter("VpcIdList", vpcIdList);
            this.vpcIdList = vpcIdList;
            return this;
        }

        @Override
        public DescribeVpcHavsInstancesRequest build() {
            return new DescribeVpcHavsInstancesRequest(this);
        } 

    } 

}
