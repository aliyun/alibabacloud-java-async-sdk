// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

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
    @Query
    @NameInMap("DedicatedHostType")
    private String dedicatedHostType;

    @Query
    @NameInMap("Generation")
    private String generation;

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
    @NameInMap("SupportInstanceTypeFamily")
    private String supportInstanceTypeFamily;

    private DescribeDedicatedHostTypesRequest(Builder builder) {
        super(builder);
        this.dedicatedHostType = builder.dedicatedHostType;
        this.generation = builder.generation;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.supportInstanceTypeFamily = builder.supportInstanceTypeFamily;
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
     * @return dedicatedHostType
     */
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    /**
     * @return generation
     */
    public String getGeneration() {
        return this.generation;
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
     * @return supportInstanceTypeFamily
     */
    public String getSupportInstanceTypeFamily() {
        return this.supportInstanceTypeFamily;
    }

    public static final class Builder extends Request.Builder<DescribeDedicatedHostTypesRequest, Builder> {
        private String dedicatedHostType; 
        private String generation; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String supportInstanceTypeFamily; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDedicatedHostTypesRequest response) {
            super(response);
            this.dedicatedHostType = response.dedicatedHostType;
            this.generation = response.generation;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.supportInstanceTypeFamily = response.supportInstanceTypeFamily;
        } 

        /**
         * DedicatedHostType.
         */
        public Builder dedicatedHostType(String dedicatedHostType) {
            this.putQueryParameter("DedicatedHostType", dedicatedHostType);
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }

        /**
         * Generation.
         */
        public Builder generation(String generation) {
            this.putQueryParameter("Generation", generation);
            this.generation = generation;
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
         * SupportInstanceTypeFamily.
         */
        public Builder supportInstanceTypeFamily(String supportInstanceTypeFamily) {
            this.putQueryParameter("SupportInstanceTypeFamily", supportInstanceTypeFamily);
            this.supportInstanceTypeFamily = supportInstanceTypeFamily;
            return this;
        }

        @Override
        public DescribeDedicatedHostTypesRequest build() {
            return new DescribeDedicatedHostTypesRequest(this);
        } 

    } 

}
