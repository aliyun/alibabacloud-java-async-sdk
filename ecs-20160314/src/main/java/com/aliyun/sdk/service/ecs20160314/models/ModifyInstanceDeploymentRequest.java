// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceDeploymentRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceDeploymentRequest</p>
 */
public class ModifyInstanceDeploymentRequest extends Request {
    @Query
    @NameInMap("Affinity")
    private String affinity;

    @Query
    @NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MigrationType")
    private String migrationType;

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
    @NameInMap("Tenancy")
    private String tenancy;

    private ModifyInstanceDeploymentRequest(Builder builder) {
        super(builder);
        this.affinity = builder.affinity;
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.instanceId = builder.instanceId;
        this.migrationType = builder.migrationType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tenancy = builder.tenancy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceDeploymentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return affinity
     */
    public String getAffinity() {
        return this.affinity;
    }

    /**
     * @return dedicatedHostClusterId
     */
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return migrationType
     */
    public String getMigrationType() {
        return this.migrationType;
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
     * @return tenancy
     */
    public String getTenancy() {
        return this.tenancy;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceDeploymentRequest, Builder> {
        private String affinity; 
        private String dedicatedHostClusterId; 
        private String dedicatedHostId; 
        private String instanceId; 
        private String migrationType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tenancy; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceDeploymentRequest request) {
            super(request);
            this.affinity = request.affinity;
            this.dedicatedHostClusterId = request.dedicatedHostClusterId;
            this.dedicatedHostId = request.dedicatedHostId;
            this.instanceId = request.instanceId;
            this.migrationType = request.migrationType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tenancy = request.tenancy;
        } 

        /**
         * Affinity.
         */
        public Builder affinity(String affinity) {
            this.putQueryParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * DedicatedHostClusterId.
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }

        /**
         * DedicatedHostId.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MigrationType.
         */
        public Builder migrationType(String migrationType) {
            this.putQueryParameter("MigrationType", migrationType);
            this.migrationType = migrationType;
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
         * Tenancy.
         */
        public Builder tenancy(String tenancy) {
            this.putQueryParameter("Tenancy", tenancy);
            this.tenancy = tenancy;
            return this;
        }

        @Override
        public ModifyInstanceDeploymentRequest build() {
            return new ModifyInstanceDeploymentRequest(this);
        } 

    } 

}
