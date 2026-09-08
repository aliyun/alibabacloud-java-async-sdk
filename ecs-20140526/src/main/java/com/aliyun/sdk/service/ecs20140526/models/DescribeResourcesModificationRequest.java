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
 * {@link DescribeResourcesModificationRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourcesModificationRequest</p>
 */
public class DescribeResourcesModificationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Conditions")
    private java.util.List<String> conditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cores")
    private Integer cores;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationResource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Float memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrateAcrossZone")
    private Boolean migrateAcrossZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    private String operationType;

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
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeResourcesModificationRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.conditions = builder.conditions;
        this.cores = builder.cores;
        this.destinationResource = builder.destinationResource;
        this.instanceType = builder.instanceType;
        this.memory = builder.memory;
        this.migrateAcrossZone = builder.migrateAcrossZone;
        this.operationType = builder.operationType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcesModificationRequest create() {
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
     * @return conditions
     */
    public java.util.List<String> getConditions() {
        return this.conditions;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return destinationResource
     */
    public String getDestinationResource() {
        return this.destinationResource;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return migrateAcrossZone
     */
    public Boolean getMigrateAcrossZone() {
        return this.migrateAcrossZone;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeResourcesModificationRequest, Builder> {
        private String sourceRegionId; 
        private java.util.List<String> conditions; 
        private Integer cores; 
        private String destinationResource; 
        private String instanceType; 
        private Float memory; 
        private Boolean migrateAcrossZone; 
        private String operationType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourcesModificationRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.conditions = request.conditions;
            this.cores = request.cores;
            this.destinationResource = request.destinationResource;
            this.instanceType = request.instanceType;
            this.memory = request.memory;
            this.migrateAcrossZone = request.migrateAcrossZone;
            this.operationType = request.operationType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.zoneId = request.zoneId;
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
         * <p>The list of conditions.</p>
         */
        public Builder conditions(java.util.List<String> conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The number of vCPU kernel of the target instance type. For valid values, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</p>
         * <p>This parameter takes effect only when DestinationResource is set to InstanceType.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * <p>The type of resource that you want to change. Valid values: </p>
         * <ul>
         * <li><p>InstanceType: instance type.</p>
         * </li>
         * <li><p>SystemDisk: system disk type.</p>
         * <p>If you set this parameter to SystemDisk, you must also specify the InstanceType parameter to indicate the disk type required by the target instance type.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceType</p>
         */
        public Builder destinationResource(String destinationResource) {
            this.putQueryParameter("DestinationResource", destinationResource);
            this.destinationResource = destinationResource;
            return this;
        }

        /**
         * <p>The target instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>. You can also invoke <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the most recent instance type list.</p>
         * <p>If DestinationResource is set to SystemDisk, you must also specify the InstanceType parameter to indicate the disk type required by the target instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g7.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The memory size of the target instance type. Unit: GiB. For valid values, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</p>
         * <p>This parameter takes effect only when DestinationResource is set to InstanceType.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>Specifies whether cross-cluster upgrade or downgrade of instance types is supported. Valid values: </p>
         * <ul>
         * <li>true: Supported.</li>
         * <li>false: Not supported.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>If the MigrateAcrossZone parameter is set to true and you upgrade or downgrade the Elastic Compute Service instance based on the returned information, take note of the following items: </p>
         * <ul>
         * <li>VPC-type instances: For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is changed to an I/O optimized instance, the disk device names and software authorization codes of the server are changed. For Linux instances, basic disks (cloud) are identified as xvda or xvdb, and ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vda or vdb.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder migrateAcrossZone(Boolean migrateAcrossZone) {
            this.putQueryParameter("MigrateAcrossZone", migrateAcrossZone);
            this.migrateAcrossZone = migrateAcrossZone;
            return this;
        }

        /**
         * <p>The type of the Upgrade/Downgrade operation.</p>
         * <ul>
         * <li><p>Valid values for subscription resources: </p>
         * <ul>
         * <li>Upgrade: upgrades resources.</li>
         * <li>Downgrade: downgrades resources.</li>
         * <li>RenewDowngrade: downgrades resources upon renewal.</li>
         * <li>RenewModify: renewal with specification change for an expired instance.</li>
         * </ul>
         * </li>
         * <li><p>Valid value for pay-as-you-go resources: Upgrade.</p>
         * </li>
         * </ul>
         * <p>Default value: Upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
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
         * <p>The region ID of the instance whose specification or system disk type you want to change. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The instance ID of the instance whose instance type or system disk type you want to change.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
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
         * <p>The ID of the target zone.</p>
         * <p>Specify this parameter when you want to change the instance type across zones.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeResourcesModificationRequest build() {
            return new DescribeResourcesModificationRequest(this);
        } 

    } 

}
