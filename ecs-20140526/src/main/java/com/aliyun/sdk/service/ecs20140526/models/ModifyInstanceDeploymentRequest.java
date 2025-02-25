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
         * <p>Specifies whether to associate the instance with a dedicated host. Valid values:</p>
         * <ul>
         * <li>host: associates the instance with a dedicated host. When you start a stopped instance in economical mode, the instance remains on its original dedicated host.</li>
         * <li>default: does not associate the instance with a dedicated host. When you start a stopped instance in economical mode, the instance can be automatically deployed to another dedicated host in the automatic deployment resource pool if the resources of the original dedicated host are insufficient.</li>
         * </ul>
         * <p>If you want to migrate the instance from a shared host to a dedicated host, use the default value. Default value: default.</p>
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
         * <p>The ID of the destination dedicated host. You can call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query the most recent list of dedicated hosts.</p>
         * <p>When you migrate an instance from a shared host to a dedicated host or between dedicated hosts, take note of the following items:</p>
         * <ul>
         * <li>To migrate the instance to a specific dedicated host, specify this parameter.</li>
         * <li>To migrate the instance to a system-selected dedicated host, leave this parameter empty and set <code>Tenancy</code> to host.</li>
         * </ul>
         * <p>For information about the automatic deployment feature, see <a href="https://help.aliyun.com/document_detail/118938.html">Functions and features</a>.</p>
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
         * <p>The number of the deployment set group in which to deploy the instance in the destination deployment set. This parameter is valid only when the destination deployment set uses the high availability group strategy (AvailabilityGroup). Valid values: 1 to 7.</p>
         * <blockquote>
         * <p>If you call this operation to deploy an instance to a deployment set that uses the high availability group strategy (<code>AvailablilityGroup</code>) and leave this parameter empty, the system evenly distributes instances among the deployment set groups in the deployment set. If you call this operation to change the deployment set of an instance and specify the current deployment set of the instance as the destination deployment set, the system evenly distributes instances again among the deployment set groups in the deployment set.</p>
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
         * <p>The ID of the destination deployment set.</p>
         * <p>This parameter is required when you add an instance to a deployment set or change the deployment set of an instance.</p>
         * <blockquote>
         * <p>You cannot change the deployment set when you modify dedicated host configurations, including the <code>Tenancy</code>, <code>Affinity</code>, and <code>DedicatedHostId</code> parameters.</p>
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
         * <p>Specifies whether to forcefully change the host of the instance when the deployment set of the instance is changed. Valid values:</p>
         * <ul>
         * <li><p>true: forcefully changes the host of the instance when the deployment set of the instance is changed. Hosts can be forcefully changed only for instances in the Running (Running) or Stopped (Stopped) state. The instances that are in the Stopped (Stopped) state do not include pay-as-you-go instances that are stopped in economical mode.</p>
         * <p>**</p>
         * <p><strong>Note</strong> If the specified instance has local disks attached, the local disks are forcefully changed when the host of the instance is forcefully changed. This may cause data loss in the local disks. Proceed with caution.</p>
         * </li>
         * <li><p>false: does not forcefully change the host of the instance when the deployment set of the instance is changed. You can add the instance to a deployment set only when the instance remains on the current host. When the Force parameter is set to false, the deployment set may fail to be changed.</p>
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
         * <p>The ID of the instance.</p>
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
         * <p>The instance type to which the instance is changed. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent list of instance types.</p>
         * <p>You can change the instance type of an instance when you migrate the instance to a dedicated host. The new instance type must match the type of the specified dedicated host. For more information, see <a href="https://help.aliyun.com/document_detail/68564.html">Dedicated host types</a>.</p>
         * <ul>
         * <li>If you specify this parameter, you must also specify <code>DedicatedHostId</code>.</li>
         * <li>You cannot change the instance type of an instance if you use the automatic deployment feature to migrate the instance.</li>
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
         * <p>Specifies whether to stop the instance before it is migrated to the destination dedicated host. Valid values:</p>
         * <ul>
         * <li>reboot: stops the instance before it is migrated.</li>
         * <li>live: migrates the instance without stopping it. If you set MigrationType to live, you must specify DedicatedHostId. In this case, you cannot change the instance type of the instance when the instance is migrated.</li>
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
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>Specifies whether to remove the specified instance from the specified deployment set. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>If you set this parameter to true, you must specify InstanceId and DeploymentSetId and make sure that the specified instance belongs to the specified deployment set.</p>
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
         * <p>Specifies whether to deploy the instance on a dedicated host. Set the value to host, which indicates that the instance is deployed on a dedicated host.</p>
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
