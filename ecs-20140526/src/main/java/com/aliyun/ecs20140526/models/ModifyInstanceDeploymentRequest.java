// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @Query
    @NameInMap("Tenancy")
    private String tenancy;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("Affinity")
    private String affinity;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("MigrationType")
    private String migrationType;

    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("DeploymentSetGroupNo")
    private Integer deploymentSetGroupNo;

    private ModifyInstanceDeploymentRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.instanceId = builder.instanceId;
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.tenancy = builder.tenancy;
        this.regionId = builder.regionId;
        this.deploymentSetId = builder.deploymentSetId;
        this.affinity = builder.affinity;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.instanceType = builder.instanceType;
        this.migrationType = builder.migrationType;
        this.force = builder.force;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return affinity
     */
    public String getAffinity() {
        return this.affinity;
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
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
        private String instanceId; 
        private String dedicatedHostClusterId; 
        private String tenancy; 
        private String regionId; 
        private String deploymentSetId; 
        private String affinity; 
        private String dedicatedHostId; 
        private String instanceType; 
        private String migrationType; 
        private Boolean force; 
        private Integer deploymentSetGroupNo; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceDeploymentRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.instanceId = response.instanceId;
            this.dedicatedHostClusterId = response.dedicatedHostClusterId;
            this.tenancy = response.tenancy;
            this.regionId = response.regionId;
            this.deploymentSetId = response.deploymentSetId;
            this.affinity = response.affinity;
            this.dedicatedHostId = response.dedicatedHostId;
            this.instanceType = response.instanceType;
            this.migrationType = response.migrationType;
            this.force = response.force;
            this.deploymentSetGroupNo = response.deploymentSetGroupNo;
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * The instance-geo ID. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the deployment set.
         * <p>
         * 
         * Will ECS join instances a deployment set, or adjust ECS instance deployment set, the parameter is required.
         * 
         * > modify proprietary the host related parameters ("tenancy", "affinity" and "dedicatedhostid") when not simultaneously modify deployment set.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * Whether the instance with proprietary host associated. Valid values:
         * <p>
         * 
         * -host: Associated. Enabled save shutdown mode instance down again after startup, still deployed original proprietary on host.
         * 
         * -default: not associative. Enabled save shutdown mode instance down again after startup, ruo yuan proprietary host insufficient resources, can migrate to automatic deployment in the resource pool other proprietary on host.
         * 
         * Instance from sharing host migration to proprietary host when the default is default.
         */
        public Builder affinity(String affinity) {
            this.putQueryParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * The ID of the dedicated host. Call [DescribeDedicatedHosts](~~ 134242 ~~) view can use proprietary host.
         * <p>
         * 
         * Modify ECS instance host (soon ECS instance from sharing host migration to proprietary host, or in different proprietary host migrate ECS instance):
         * -If the instance migration to the specified proprietary on host, you must set the parameters.
         * -If the instance migration to the system for you automatically select proprietary on host, must set the parameter to empty, and the parameter "tenancy" set to host.
         * 
         * Automatic deployment feature details, please see [proprietary host function property](~~ 118938 ~~).
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * ECS instance to change the target instance of the specifications. Call [DescribeInstanceTypes](~~ 25620 ~~) interface can get the latest instance dimension list.
         * <p>
         * 
         * Modify ECS instance host when, can change at the same time ECS instance specifications. Target instance dimension must be specified proprietary the host dimension match, details please see [host dimension](~~ 68564 ~~).
         * -Change instance specifications, must specify proprietary Host ID, the set parameters "dedicatedhostid" value.
         * -Use automatic deployment features migration ECS instance, cannot change instance specifications.
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
         * Whether first stop instance to migrate to the target proprietary host. Valid values:
         * <p>
         * 
         * -reboot: First stop instance again migration.
         * 
         * -live: Don"t stop instance directly migration. At this point you must specify the parameter DedicatedHostId. The value does not support migration ECS instance while change instance specifications.
         * 
         * Default: reboot
         */
        public Builder migrationType(String migrationType) {
            this.putQueryParameter("MigrationType", migrationType);
            this.migrationType = migrationType;
            return this;
        }

        /**
         * Instance in adjusting deployment set whether to force replacement instance host. Valid values:
         * <p>
         * 
         * -true: allow. Allow restarts operation in (Running), Stopped, (Stopped) state ECS instance. The stopped State of the instance does not include enable save shutdown mode quantity pay ECS instance.
         * > If you specify ECS instance with local plate, the local plate would also allow force replacement, this might result in the replacement host when local disk data loss, use caution.
         * 
         * -false: not allowed. Add a deployment set only to the current host. This may cause replacement deployment set failed.
         * 
         * Default value: false
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * When ECS instance you want to add or change deployment set strategy for deployment set group High available policies (AvailabilityGroup) when, can pass the parameter specified instance deployment centralized grouping number. Value range: 1~7
         * <p>
         * 
         * > If you for ECS instance adjusting deployment set, and deployment set strategy for deployment set group High available policies ("availablilitygroup"), when not assign the parameters, the system automatically between groups balanced distribution ECS instance. If you for ECS instance specified remains current instance belongs deployment set, system will also re-between groups balanced distribution ECS instance.
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
