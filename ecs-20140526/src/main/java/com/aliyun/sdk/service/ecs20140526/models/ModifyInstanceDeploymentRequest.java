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
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("Affinity")
    private String affinity;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @Query
    @NameInMap("Tenancy")
    private String tenancy;

    @Query
    @NameInMap("MigrationType")
    private String migrationType;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("DeploymentSetGroupNo")
    private Integer deploymentSetGroupNo;

    private ModifyInstanceDeploymentRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.force = builder.force;
        this.affinity = builder.affinity;
        this.instanceType = builder.instanceType;
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.tenancy = builder.tenancy;
        this.migrationType = builder.migrationType;
        this.deploymentSetId = builder.deploymentSetId;
        this.deploymentSetGroupNo = builder.deploymentSetGroupNo;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return affinity
     */
    public String getAffinity() {
        return this.affinity;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return dedicatedHostClusterId
     */
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    /**
     * @return tenancy
     */
    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * @return migrationType
     */
    public String getMigrationType() {
        return this.migrationType;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return deploymentSetGroupNo
     */
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceDeploymentRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String instanceId; 
        private String dedicatedHostId; 
        private Boolean force; 
        private String affinity; 
        private String instanceType; 
        private String dedicatedHostClusterId; 
        private String tenancy; 
        private String migrationType; 
        private String deploymentSetId; 
        private Integer deploymentSetGroupNo; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceDeploymentRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.dedicatedHostId = request.dedicatedHostId;
            this.force = request.force;
            this.affinity = request.affinity;
            this.instanceType = request.instanceType;
            this.dedicatedHostClusterId = request.dedicatedHostClusterId;
            this.tenancy = request.tenancy;
            this.migrationType = request.migrationType;
            this.deploymentSetId = request.deploymentSetId;
            this.deploymentSetGroupNo = request.deploymentSetGroupNo;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The region ID of the instance. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the dedicated host. Call [DescribeDedicatedHosts](~~ 134242 ~~) to view available dedicated hosts.
         * <p>
         * 
         * When you modify the ECS instance host (that is, migrate the ECS instance from a shared host to a dedicated host, or migrate the ECS instance between different dedicated hosts):
         * -This parameter must be set if the instance is migrated to the specified DDH.
         * -If you want to migrate an instance to a dedicated host that is automatically selected by the system, you must set this parameter to null and set the parameter "tenance" to host.
         * 
         * For more information, see [features of dedicated hosts](~~ 118938 ~~).
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * Specifies whether to forcibly change the host of an instance when adjusting the deployment set. Valid values:
         * <p>
         * 
         * -true: Yes. You can restart an ECS instance in the Running (Running) or Stopped (Stopped) state. Instances in the stopped state do not include pay-as-you-go instances that have the shutdown mode enabled.
         * > If the specified ECS instance is equipped with a local disk, the local disk is also allowed to be forcibly replaced, which may cause data loss on the local disk when the host is replaced. Proceed with caution.
         * 
         * -false: this parameter is not allowed. Add a deployment set only to the current host. This may cause the replacement of the deployment set to fail.
         * 
         * Default value: false
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * Indicates whether the instance is associated with a dedicated host. Valid values:
         * <p>
         * 
         * -host: associate. When an instance that has the shutdown saving mode enabled is stopped and started again, it is still deployed on the original dedicated host.
         * 
         * -default: Not Associated. When an instance that has the shutdown saving mode enabled is stopped and started again, if the original DDH resources are insufficient, it can be migrated to another DDH in the automatic deployment resource pool.
         * 
         * When an instance is migrated from a shared host to a dedicated host, the default value is default.
         */
        public Builder affinity(String affinity) {
            this.putQueryParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * The type of the target ECS instance to be changed. You can call the [DescribeInstanceTypes](~~ 25620 ~~) operation to obtain the latest instance types.
         * <p>
         * 
         * When you modify the host of an ECS instance, you can change the instance type at the same time. The specification of the target instance must match the specification of the specified DDH. For more information, see [DDH specification](~~ 68564 ~~).
         * -When you change the instance type, you must specify the DDH ID, that is, the value of the parameter "DedicatedHostId.
         * -When you use the automatic deployment feature to migrate an ECS instance, you cannot change the instance type.
         * 
         * 
         * 
         * 
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The ID of the DDH cluster.
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }

        /**
         * Indicates whether the instance is deployed on a dedicated host. Set the value to host. Only instances can be deployed on dedicated hosts.
         */
        public Builder tenancy(String tenancy) {
            this.putQueryParameter("Tenancy", tenancy);
            this.tenancy = tenancy;
            return this;
        }

        /**
         * Specifies whether to stop the instance before migrating it to the destination ddh. Valid values:
         * <p>
         * 
         * -reboot: stop the instance before migrating.
         * 
         * -live: directly migrates instances without stopping them. You must specify the parameter DedicatedHostId. You cannot change the instance type when you migrate an ECS instance.
         * 
         * Default value: reboot
         */
        public Builder migrationType(String migrationType) {
            this.putQueryParameter("MigrationType", migrationType);
            this.migrationType = migrationType;
            return this;
        }

        /**
         * The ID of the deployment set.
         * <p>
         * 
         * This parameter is required when you add an ECS instance to a deployment set or adjust the deployment set of the ECS instance.
         * 
         * > when you modify the parameters of a dedicated host ("tenance", "Affinity", and "DedicatedHostId"), you cannot modify the deployment set at the same time.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * When the deployment set policy to be added or adjusted to an ECS instance is a deployment set group high availability policy (AvailabilityGroup), you can use this parameter to specify the group number of the instance in the deployment set. Valid values: 1 to 7.
         * <p>
         * 
         * > If you adjust the deployment set for an ECS instance and the deployment set policy is the deployment set group high availability policy ("AvailablilityGroup"), if this parameter is not specified, the system automatically allocates ECS instances evenly among groups. If you specify the deployment set to which the current instance belongs, the system allocates ECS instances evenly among groups.
         */
        public Builder deploymentSetGroupNo(Integer deploymentSetGroupNo) {
            this.putQueryParameter("DeploymentSetGroupNo", deploymentSetGroupNo);
            this.deploymentSetGroupNo = deploymentSetGroupNo;
            return this;
        }

        @Override
        public ModifyInstanceDeploymentRequest build() {
            return new ModifyInstanceDeploymentRequest(this);
        } 

    } 

}
