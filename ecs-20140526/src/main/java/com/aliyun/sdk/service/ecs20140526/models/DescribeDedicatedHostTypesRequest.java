// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDedicatedHostTypesRequest</p>
 */
public class DescribeDedicatedHostTypesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("DedicatedHostType")
    private String dedicatedHostType;

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
    @NameInMap("SupportedInstanceTypeFamily")
    private String supportedInstanceTypeFamily;

    private DescribeDedicatedHostTypesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.dedicatedHostType = builder.dedicatedHostType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.supportedInstanceTypeFamily = builder.supportedInstanceTypeFamily;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return dedicatedHostType
     */
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
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
     * @return supportedInstanceTypeFamily
     */
    public String getSupportedInstanceTypeFamily() {
        return this.supportedInstanceTypeFamily;
    }

    public static final class Builder extends Request.Builder<DescribeDedicatedHostTypesRequest, Builder> {
        private String sourceRegionId; 
        private String dedicatedHostType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String supportedInstanceTypeFamily; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDedicatedHostTypesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.dedicatedHostType = request.dedicatedHostType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.supportedInstanceTypeFamily = request.supportedInstanceTypeFamily;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The dedicated host type. For more information, see [Dedicated host types](~~68564~~).
         */
        public Builder dedicatedHostType(String dedicatedHostType) {
            this.putQueryParameter("DedicatedHostType", dedicatedHostType);
            this.dedicatedHostType = dedicatedHostType;
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
         * The region ID of the dedicated host. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
         * The ECS instance family supported by the dedicated host type.
         */
        public Builder supportedInstanceTypeFamily(String supportedInstanceTypeFamily) {
            this.putQueryParameter("SupportedInstanceTypeFamily", supportedInstanceTypeFamily);
            this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
            return this;
        }

        @Override
        public DescribeDedicatedHostTypesRequest build() {
            return new DescribeDedicatedHostTypesRequest(this);
        } 

    } 

}
