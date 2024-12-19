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
         * <p>The conditions.</p>
         */
        public Builder conditions(java.util.List<String> conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The number of vCPUs of the instance type. For information about the valid values, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
         * <p>This parameter is valid only when the DestinationResource parameter is set to InstanceType.</p>
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
         * <p>The resource type that you want to change. Valid values:</p>
         * <ul>
         * <li><p>InstanceType</p>
         * </li>
         * <li><p>SystemDisk</p>
         * <p>If you set this parameter to SystemDisk, you must specify the InstanceType parameter. In this case, this operation queries the system disk categories supported by the specified instance type.</p>
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
         * <p>The instance type to which you want to change the instance type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>. You can also call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent instance type list.</p>
         * <p>If you set the DestinationResource parameter to SystemDisk, you must specify the InstanceType parameter. In this case, this operation queries the system disk categories supported by the specified instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The memory size of the instance type. Unit: GiB. For information about the valid values, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
         * <p>This parameter is valid only when the DestinationResource parameter is set to InstanceType.</p>
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
         * <p>Specifies whether cross-cluster instance type upgrades are supported. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>When MigrateAcrossZone is set to true and you upgrade the instance type of an instance based on the returned information, take note of the following items:</p>
         * <ul>
         * <li><p>Instance that resides in the classic network:</p>
         * <ul>
         * <li>For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the private IP address, disk device names, and software authorization codes of the instance change. For a Linux instance, basic disks (cloud) are identified as xvd* such as xvda and xvdb, and ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vd* such as vda and vdb.</li>
         * <li>For <a href="https://help.aliyun.com/document_detail/25378.html">instance families available for purchase</a>, when the instance type of an instance is changed, the private IP address of the instance changes.</li>
         * </ul>
         * </li>
         * <li><p>Instance that resides in a virtual private cloud (VPC): For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the disk device names and software authorization codes of the instance change. For a Linux instance, basic disks (cloud) are identified as xvd* such as xvda and xvdb, and ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vd* such as vda and vdb.</p>
         * </li>
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
         * <p>The operation of changing resource configurations.</p>
         * <ul>
         * <li><p>Valid values for subscription resources:</p>
         * <ul>
         * <li>Upgrade: upgrades resources.</li>
         * <li>Downgrade: downgrades resources.</li>
         * <li>RenewDowngrade: renews and downgrades resources.</li>
         * <li>RenewModify: renews an expired instance and changes its configurations.</li>
         * </ul>
         * </li>
         * <li><p>Set the value to Upgrade for pay-as-you-go resources.</p>
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
         * <p>The region ID of the instance for which you want to change the instance type or system disk category. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the instance for which you want to change the instance type or system disk category.</p>
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
         * <p>The ID of the destination zone to which you want to migrate the instance.</p>
         * <p>If you want to change the instance type across zones, you must specify this parameter.</p>
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
