// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrationPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateMigrationPlanRequest</p>
 */
public class CreateMigrationPlanRequest extends Request {
    @Query
    @NameInMap("CustomMigrationTimes")
    private java.util.List < CustomMigrationTimes> customMigrationTimes;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EnableAutoCreateVSwitch")
    private Boolean enableAutoCreateVSwitch;

    @Query
    @NameInMap("EnsureNetworkConnectivity")
    private Boolean ensureNetworkConnectivity;

    @Query
    @NameInMap("GlobalMigrationTime")
    private String globalMigrationTime;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RemainPrivateIp")
    private Boolean remainPrivateIp;

    @Query
    @NameInMap("RemainPublicMacAsPriority")
    private Boolean remainPublicMacAsPriority;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TargetSecurityGroupIds")
    private java.util.List < String > targetSecurityGroupIds;

    @Query
    @NameInMap("TargetVSwitchId")
    private String targetVSwitchId;

    @Query
    @NameInMap("TargetVpcId")
    private String targetVpcId;

    @Query
    @NameInMap("TargetZoneId")
    @Validation(required = true)
    private String targetZoneId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateMigrationPlanRequest(Builder builder) {
        super(builder);
        this.customMigrationTimes = builder.customMigrationTimes;
        this.dryRun = builder.dryRun;
        this.enableAutoCreateVSwitch = builder.enableAutoCreateVSwitch;
        this.ensureNetworkConnectivity = builder.ensureNetworkConnectivity;
        this.globalMigrationTime = builder.globalMigrationTime;
        this.instanceIds = builder.instanceIds;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.remainPrivateIp = builder.remainPrivateIp;
        this.remainPublicMacAsPriority = builder.remainPublicMacAsPriority;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetSecurityGroupIds = builder.targetSecurityGroupIds;
        this.targetVSwitchId = builder.targetVSwitchId;
        this.targetVpcId = builder.targetVpcId;
        this.targetZoneId = builder.targetZoneId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrationPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customMigrationTimes
     */
    public java.util.List < CustomMigrationTimes> getCustomMigrationTimes() {
        return this.customMigrationTimes;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableAutoCreateVSwitch
     */
    public Boolean getEnableAutoCreateVSwitch() {
        return this.enableAutoCreateVSwitch;
    }

    /**
     * @return ensureNetworkConnectivity
     */
    public Boolean getEnsureNetworkConnectivity() {
        return this.ensureNetworkConnectivity;
    }

    /**
     * @return globalMigrationTime
     */
    public String getGlobalMigrationTime() {
        return this.globalMigrationTime;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return remainPrivateIp
     */
    public Boolean getRemainPrivateIp() {
        return this.remainPrivateIp;
    }

    /**
     * @return remainPublicMacAsPriority
     */
    public Boolean getRemainPublicMacAsPriority() {
        return this.remainPublicMacAsPriority;
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
     * @return targetSecurityGroupIds
     */
    public java.util.List < String > getTargetSecurityGroupIds() {
        return this.targetSecurityGroupIds;
    }

    /**
     * @return targetVSwitchId
     */
    public String getTargetVSwitchId() {
        return this.targetVSwitchId;
    }

    /**
     * @return targetVpcId
     */
    public String getTargetVpcId() {
        return this.targetVpcId;
    }

    /**
     * @return targetZoneId
     */
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateMigrationPlanRequest, Builder> {
        private java.util.List < CustomMigrationTimes> customMigrationTimes; 
        private Boolean dryRun; 
        private Boolean enableAutoCreateVSwitch; 
        private Boolean ensureNetworkConnectivity; 
        private String globalMigrationTime; 
        private java.util.List < String > instanceIds; 
        private String name; 
        private Long ownerId; 
        private String regionId; 
        private Boolean remainPrivateIp; 
        private Boolean remainPublicMacAsPriority; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < String > targetSecurityGroupIds; 
        private String targetVSwitchId; 
        private String targetVpcId; 
        private String targetZoneId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateMigrationPlanRequest response) {
            super(response);
            this.customMigrationTimes = response.customMigrationTimes;
            this.dryRun = response.dryRun;
            this.enableAutoCreateVSwitch = response.enableAutoCreateVSwitch;
            this.ensureNetworkConnectivity = response.ensureNetworkConnectivity;
            this.globalMigrationTime = response.globalMigrationTime;
            this.instanceIds = response.instanceIds;
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.remainPrivateIp = response.remainPrivateIp;
            this.remainPublicMacAsPriority = response.remainPublicMacAsPriority;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.targetSecurityGroupIds = response.targetSecurityGroupIds;
            this.targetVSwitchId = response.targetVSwitchId;
            this.targetVpcId = response.targetVpcId;
            this.targetZoneId = response.targetZoneId;
            this.type = response.type;
        } 

        /**
         * CustomMigrationTimes.
         */
        public Builder customMigrationTimes(java.util.List < CustomMigrationTimes> customMigrationTimes) {
            this.putQueryParameter("CustomMigrationTimes", customMigrationTimes);
            this.customMigrationTimes = customMigrationTimes;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EnableAutoCreateVSwitch.
         */
        public Builder enableAutoCreateVSwitch(Boolean enableAutoCreateVSwitch) {
            this.putQueryParameter("EnableAutoCreateVSwitch", enableAutoCreateVSwitch);
            this.enableAutoCreateVSwitch = enableAutoCreateVSwitch;
            return this;
        }

        /**
         * EnsureNetworkConnectivity.
         */
        public Builder ensureNetworkConnectivity(Boolean ensureNetworkConnectivity) {
            this.putQueryParameter("EnsureNetworkConnectivity", ensureNetworkConnectivity);
            this.ensureNetworkConnectivity = ensureNetworkConnectivity;
            return this;
        }

        /**
         * GlobalMigrationTime.
         */
        public Builder globalMigrationTime(String globalMigrationTime) {
            this.putQueryParameter("GlobalMigrationTime", globalMigrationTime);
            this.globalMigrationTime = globalMigrationTime;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * RemainPrivateIp.
         */
        public Builder remainPrivateIp(Boolean remainPrivateIp) {
            this.putQueryParameter("RemainPrivateIp", remainPrivateIp);
            this.remainPrivateIp = remainPrivateIp;
            return this;
        }

        /**
         * RemainPublicMacAsPriority.
         */
        public Builder remainPublicMacAsPriority(Boolean remainPublicMacAsPriority) {
            this.putQueryParameter("RemainPublicMacAsPriority", remainPublicMacAsPriority);
            this.remainPublicMacAsPriority = remainPublicMacAsPriority;
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
         * TargetSecurityGroupIds.
         */
        public Builder targetSecurityGroupIds(java.util.List < String > targetSecurityGroupIds) {
            this.putQueryParameter("TargetSecurityGroupIds", targetSecurityGroupIds);
            this.targetSecurityGroupIds = targetSecurityGroupIds;
            return this;
        }

        /**
         * TargetVSwitchId.
         */
        public Builder targetVSwitchId(String targetVSwitchId) {
            this.putQueryParameter("TargetVSwitchId", targetVSwitchId);
            this.targetVSwitchId = targetVSwitchId;
            return this;
        }

        /**
         * TargetVpcId.
         */
        public Builder targetVpcId(String targetVpcId) {
            this.putQueryParameter("TargetVpcId", targetVpcId);
            this.targetVpcId = targetVpcId;
            return this;
        }

        /**
         * TargetZoneId.
         */
        public Builder targetZoneId(String targetZoneId) {
            this.putQueryParameter("TargetZoneId", targetZoneId);
            this.targetZoneId = targetZoneId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateMigrationPlanRequest build() {
            return new CreateMigrationPlanRequest(this);
        } 

    } 

    public static class CustomMigrationTimes extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MigrationTime")
        private String migrationTime;

        private CustomMigrationTimes(Builder builder) {
            this.instanceId = builder.instanceId;
            this.migrationTime = builder.migrationTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomMigrationTimes create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return migrationTime
         */
        public String getMigrationTime() {
            return this.migrationTime;
        }

        public static final class Builder {
            private String instanceId; 
            private String migrationTime; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MigrationTime.
             */
            public Builder migrationTime(String migrationTime) {
                this.migrationTime = migrationTime;
                return this;
            }

            public CustomMigrationTimes build() {
                return new CustomMigrationTimes(this);
            } 

        } 

    }
}
