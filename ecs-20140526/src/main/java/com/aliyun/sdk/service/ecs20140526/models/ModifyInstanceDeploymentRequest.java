// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

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
    @NameInMap("DeploymentSetGroupNo")
    private Integer deploymentSetGroupNo;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

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
    @NameInMap("RemoveFromDeploymentSet")
    private Boolean removeFromDeploymentSet;

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
        this.sourceRegionId = builder.sourceRegionId;
        this.affinity = builder.affinity;
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.deploymentSetGroupNo = builder.deploymentSetGroupNo;
        this.deploymentSetId = builder.deploymentSetId;
        this.force = builder.force;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.migrationType = builder.migrationType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.removeFromDeploymentSet = builder.removeFromDeploymentSet;
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
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
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
     * @return deploymentSetGroupNo
     */
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
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
     * @return removeFromDeploymentSet
     */
    public Boolean getRemoveFromDeploymentSet() {
        return this.removeFromDeploymentSet;
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
        private String sourceRegionId; 
        private String affinity; 
        private String dedicatedHostClusterId; 
        private String dedicatedHostId; 
        private Integer deploymentSetGroupNo; 
        private String deploymentSetId; 
        private Boolean force; 
        private String instanceId; 
        private String instanceType; 
        private String migrationType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private Boolean removeFromDeploymentSet; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tenancy; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceDeploymentRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.affinity = request.affinity;
            this.dedicatedHostClusterId = request.dedicatedHostClusterId;
            this.dedicatedHostId = request.dedicatedHostId;
            this.deploymentSetGroupNo = request.deploymentSetGroupNo;
            this.deploymentSetId = request.deploymentSetId;
            this.force = request.force;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.migrationType = request.migrationType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.removeFromDeploymentSet = request.removeFromDeploymentSet;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tenancy = request.tenancy;
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
         * Specifies whether to associate the instance with a dedicated host. Valid values:
         * <p>
         * 
         * *   host: associates the instance with a dedicated host. When you start a stopped instance in economical mode, the instance remains on its original dedicated host.
         * *   default: does not associate the instance with a dedicated host. When you start a stopped instance in economical mode, the instance can be automatically deployed to another dedicated host in the automatic deployment resource pool if the resources of the original dedicated host are insufficient.
         * 
         * If you want to migrate the instance from a shared host to a dedicated host, use the default value. Default value: default.
         */
        public Builder affinity(String affinity) {
            this.putQueryParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * The ID of the dedicated host cluster.
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }

        /**
         * The ID of the destination dedicated host. You can call the [DescribeDedicatedHosts](~~134242~~) operation to query the most recent list of dedicated hosts.
         * <p>
         * 
         * When you migrate an instance from a shared host to a dedicated host or between dedicated hosts, take note of the following items:
         * 
         * *   To migrate the instance to a specific dedicated host, specify this parameter.
         * *   To migrate the instance to a dedicated host that the system automatically selects, leave this parameter empty and set `Tenancy` to host.
         * 
         * For information about the automatic deployment feature, see [Features of dedicated hosts](~~118938~~).
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * The number of the deployment set group in which to deploy the instance in the destination deployment set. This parameter takes effect only when the destination deployment set uses the high availability group strategy (AvailabilityGroup). Valid values: 1 to 7.
         * <p>
         * 
         * > If you call this operation to deploy an instance to a deployment set that uses the high availability group strategy (`AvailablilityGroup`) and leave this parameter empty, the system evenly distributes instances among the deployment set groups in the deployment set. If you specify the current deployment set of the instance as the destination deployment set in the request, the system evenly distributes instances again among the deployment set groups in the deployment set.
         */
        public Builder deploymentSetGroupNo(Integer deploymentSetGroupNo) {
            this.putQueryParameter("DeploymentSetGroupNo", deploymentSetGroupNo);
            this.deploymentSetGroupNo = deploymentSetGroupNo;
            return this;
        }

        /**
         * The ID of the destination deployment set.
         * <p>
         * 
         * This parameter is required when you add an instance to a deployment set or change the deployment set of an instance.
         * 
         * > You cannot change the deployment set when you modify dedicated host configurations, including the `Tenancy`, `Affinity`, and `DedicatedHostId` parameters.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * Specifies whether to forcefully change the host of the instance when the deployment set of the instance is changed. Valid values:
         * <p>
         * 
         * *   true: forcefully changes the host of the instance when the deployment set of the instance is changed. Hosts can be forcefully changed only for instances in the Running or Stopped state. The instances that are in the Stopped state do not include pay-as-you-go instances that are stopped in economical mode.
         * 
         *     **
         * 
         *     **Note**If the specified instance has local disks attached, the local disks are forcefully changed when the host of the instance is forcefully changed. This may cause data loss in the local disks. Proceed with caution.
         * 
         * *   false: does not forcefully change the host of the instance when the deployment set of the instance is changed. You can add the instance to a deployment set only when the instance remains on the current host. When the Force parameter is set to false, the deployment set may fail to be changed.
         * 
         * Default value: false.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The ID of the instance
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The instance type to which the instance is changed. You can call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent list of instance types.
         * <p>
         * 
         * You can change the instance type of an instance when you migrate the instance to a dedicated host. The new instance type must match the type of the specified dedicated host. For more information, see [Dedicated host types](~~68564~~).
         * 
         * *   If you specify this parameter, you must also specify the `DedicatedHostId` parameter.
         * *   You cannot change the instance type of an instance if you use the automatic deployment feature to migrate the instance.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Specifies whether to stop the instance before it is migrated to the destination dedicated host. Valid values:
         * <p>
         * 
         * *   reboot: stops the instance before it is migrated.
         * *   live: migrates the instance without stopping it. If you set the MigrationType parameter to live, you must specify the DedicatedHostId parameter. In this case, you cannot change the instance type of the instance when the instance is migrated.
         * 
         * Default value: reboot.
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
         * The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to remove the specified instance from the specified deployment set. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         * 
         * > If you set this parameter to true, you must specify the InstanceId and DeploymentSetId parameters and make sure that the specified instance belongs to the specified deployment set.
         */
        public Builder removeFromDeploymentSet(Boolean removeFromDeploymentSet) {
            this.putQueryParameter("RemoveFromDeploymentSet", removeFromDeploymentSet);
            this.removeFromDeploymentSet = removeFromDeploymentSet;
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
         * Specifies whether to deploy the instance on a dedicated host. Set the value to host.
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
