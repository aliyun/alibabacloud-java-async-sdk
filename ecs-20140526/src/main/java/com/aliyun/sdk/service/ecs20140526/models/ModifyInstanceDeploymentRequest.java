// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyInstanceDeploymentRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceDeploymentRequest</p>
 */
public class ModifyInstanceDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Affinity")
    private String affinity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetGroupNo")
    private Integer deploymentSetGroupNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrationType")
    private String migrationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveFromDeploymentSet")
    private Boolean removeFromDeploymentSet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tenancy")
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
         * <p>Specifies whether the instance is associated with the dedicated host. Valid values:</p>
         * <ul>
         * <li><p>host: The instance is associated with the dedicated host. When an instance that has economical mode enabled is restarted after being stopped, the instance is still deployed on the original dedicated host.</p>
         * </li>
         * <li><p>default: The instance is not associated with the dedicated host. When an instance that has economical mode enabled is restarted after being stopped, if the resources of the original dedicated host are insufficient, the instance can be migrated to another dedicated host in the automatic deployment resource pool.</p>
         * </li>
         * </ul>
         * <p>Default value when migrating an instance from a shared host to a dedicated host: default.</p>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        public Builder affinity(String affinity) {
            this.putQueryParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * <p>The ID of the dedicated host cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-bp67acfmxazb4ph****</p>
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }

        /**
         * <p>The ID of the dedicated host. You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query available dedicated hosts.</p>
         * <p>When you modify the host of an ECS instance (migrate the instance from a shared host to a dedicated host or between dedicated hosts):</p>
         * <ul>
         * <li>To migrate the instance to a specified dedicated host, you must specify this parameter.</li>
         * <li>To migrate the instance to a dedicated host that is automatically selected by the system, you must set this parameter to empty and set the <code>Tenancy</code> parameter to host.</li>
         * </ul>
         * <p>For more information about the automatic deployment feature, see <a href="https://help.aliyun.com/document_detail/118938.html">Features of dedicated hosts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp67acfmxazb4ph****</p>
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * <p>The group number of the instance in the deployment set when the deployment set uses the availability group strategy (AvailabilityGroup). Valid values: 1 to 7.</p>
         * <blockquote>
         * <p>If you change the deployment set of an ECS instance and the deployment set uses the availability group strategy (<code>AvailablilityGroup</code>), the system automatically distributes ECS instances evenly across groups when this parameter is not specified. If you specify the same deployment set that the instance currently belongs to, the system also redistributes ECS instances evenly across groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder deploymentSetGroupNo(Integer deploymentSetGroupNo) {
            this.putQueryParameter("DeploymentSetGroupNo", deploymentSetGroupNo);
            this.deploymentSetGroupNo = deploymentSetGroupNo;
            return this;
        }

        /**
         * <p>The ID of the deployment set.</p>
         * <p>This parameter is required when you add an ECS instance to a deployment set or change the deployment set of an ECS instance.</p>
         * <blockquote>
         * <p>When you modify dedicated host-related parameters (<code>Tenancy</code>, <code>Affinity</code>, and <code>DedicatedHostId</code>), you cannot modify the deployment set at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ds-bp67acfmxazb4ph****</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully change the host when the instance is added to a deployment set. Valid values:</p>
         * <ul>
         * <li><p>true: Allows the operation. Allows restarting ECS instances in the Running or Stopped state. Stopped instances do not include pay-as-you-go ECS instances that have economical mode enabled.</p>
         * <blockquote>
         * <p>If the specified ECS instance has local disks attached, the local disks are also forcefully replaced. This may cause data loss on the local disks during host replacement. Proceed with caution.</p>
         * </blockquote>
         * </li>
         * <li><p>false: Does not allow the operation. The instance is added to the deployment set only on the current host. This may cause the deployment set change to fail.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4ph***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The target instance type of the ECS instance. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the most recent instance type list.</p>
         * <p>When you modify the host of an ECS instance, you can also change ECS instance type. The target instance type must match the specifications of the specified dedicated host. For more information, see <a href="https://help.aliyun.com/document_detail/68564.html">Dedicated host types</a>.</p>
         * <ul>
         * <li>To change ECS instance type, you must specify the dedicated host ID by setting the <code>DedicatedHostId</code> parameter.</li>
         * <li>You cannot change ECS instance type when using the automatic deployment feature to migrate an ECS instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Specifies whether to stop ECS instance before migrating it to the destination dedicated host. Valid values:</p>
         * <ul>
         * <li><p>reboot: Stops ECS instance before migration.</p>
         * </li>
         * <li><p>live: Migrates ECS instance without stopping it. In this case, you must specify the DedicatedHostId parameter. This value does not support changing ECS instance type while migrating ECS instance.</p>
         * </li>
         * </ul>
         * <p>Default value: reboot.</p>
         * 
         * <strong>example:</strong>
         * <p>live</p>
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
         * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to remove the selected instance from the selected deployment set. Valid values:</p>
         * <ul>
         * <li><p>true: Yes.</p>
         * </li>
         * <li><p>false: No.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>When this parameter is set to true, you must specify the InstanceId and DeploymentSetId that have an ownership relationship.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>Specifies whether the instance is deployed on a dedicated host. Valid values: host. The instance is deployed only on a dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>host</p>
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
