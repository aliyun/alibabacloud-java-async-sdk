// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMigratableInstancesRequest} extends {@link RequestModel}
 *
 * <p>AddMigratableInstancesRequest</p>
 */
public class AddMigratableInstancesRequest extends Request {
    @Query
    @NameInMap("BusinessMigrationType")
    private Integer businessMigrationType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("NetworkMigrationType")
    private Integer networkMigrationType;

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
    @NameInMap("VpcId")
    private String vpcId;

    private AddMigratableInstancesRequest(Builder builder) {
        super(builder);
        this.businessMigrationType = builder.businessMigrationType;
        this.instanceId = builder.instanceId;
        this.networkMigrationType = builder.networkMigrationType;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMigratableInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessMigrationType
     */
    public Integer getBusinessMigrationType() {
        return this.businessMigrationType;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkMigrationType
     */
    public Integer getNetworkMigrationType() {
        return this.networkMigrationType;
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<AddMigratableInstancesRequest, Builder> {
        private Integer businessMigrationType; 
        private java.util.List < String > instanceId; 
        private Integer networkMigrationType; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(AddMigratableInstancesRequest request) {
            super(request);
            this.businessMigrationType = request.businessMigrationType;
            this.instanceId = request.instanceId;
            this.networkMigrationType = request.networkMigrationType;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vpcId = request.vpcId;
        } 

        /**
         * BusinessMigrationType.
         */
        public Builder businessMigrationType(Integer businessMigrationType) {
            this.putQueryParameter("BusinessMigrationType", businessMigrationType);
            this.businessMigrationType = businessMigrationType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NetworkMigrationType.
         */
        public Builder networkMigrationType(Integer networkMigrationType) {
            this.putQueryParameter("NetworkMigrationType", networkMigrationType);
            this.networkMigrationType = networkMigrationType;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public AddMigratableInstancesRequest build() {
            return new AddMigratableInstancesRequest(this);
        } 

    } 

}
