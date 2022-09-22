// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReAddMigrationTaskInPlanRequest} extends {@link RequestModel}
 *
 * <p>ReAddMigrationTaskInPlanRequest</p>
 */
public class ReAddMigrationTaskInPlanRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MigrationPlanId")
    @Validation(required = true)
    private String migrationPlanId;

    @Query
    @NameInMap("MigrationTime")
    @Validation(required = true)
    private String migrationTime;

    @Query
    @NameInMap("NetworkMigrationType")
    @Validation(required = true)
    private String networkMigrationType;

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

    private ReAddMigrationTaskInPlanRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.migrationPlanId = builder.migrationPlanId;
        this.migrationTime = builder.migrationTime;
        this.networkMigrationType = builder.networkMigrationType;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReAddMigrationTaskInPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return migrationPlanId
     */
    public String getMigrationPlanId() {
        return this.migrationPlanId;
    }

    /**
     * @return migrationTime
     */
    public String getMigrationTime() {
        return this.migrationTime;
    }

    /**
     * @return networkMigrationType
     */
    public String getNetworkMigrationType() {
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

    public static final class Builder extends Request.Builder<ReAddMigrationTaskInPlanRequest, Builder> {
        private String instanceId; 
        private String migrationPlanId; 
        private String migrationTime; 
        private String networkMigrationType; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ReAddMigrationTaskInPlanRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.migrationPlanId = request.migrationPlanId;
            this.migrationTime = request.migrationTime;
            this.networkMigrationType = request.networkMigrationType;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * MigrationPlanId.
         */
        public Builder migrationPlanId(String migrationPlanId) {
            this.putQueryParameter("MigrationPlanId", migrationPlanId);
            this.migrationPlanId = migrationPlanId;
            return this;
        }

        /**
         * MigrationTime.
         */
        public Builder migrationTime(String migrationTime) {
            this.putQueryParameter("MigrationTime", migrationTime);
            this.migrationTime = migrationTime;
            return this;
        }

        /**
         * NetworkMigrationType.
         */
        public Builder networkMigrationType(String networkMigrationType) {
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

        @Override
        public ReAddMigrationTaskInPlanRequest build() {
            return new ReAddMigrationTaskInPlanRequest(this);
        } 

    } 

}
