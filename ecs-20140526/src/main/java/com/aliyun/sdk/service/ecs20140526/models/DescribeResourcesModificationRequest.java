// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcesModificationRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourcesModificationRequest</p>
 */
public class DescribeResourcesModificationRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("DestinationResource")
    @Validation(required = true)
    private String destinationResource;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("MigrateAcrossZone")
    private Boolean migrateAcrossZone;

    @Query
    @NameInMap("OperationType")
    private String operationType;

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
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeResourcesModificationRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
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
         * The number of vCPU cores of the instance type. For more information, see [Instance families](~~25378~~). This parameter is valid only when DestinationResource is set to InstanceType.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * The type of the resource. Valid values:
         * <p>
         * 
         * *   InstanceType
         * *   SystemDisk
         */
        public Builder destinationResource(String destinationResource) {
            this.putQueryParameter("DestinationResource", destinationResource);
            this.destinationResource = destinationResource;
            return this;
        }

        /**
         * The instance type. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent instance type list. This parameter is required when the DestinationResource parameter is set to SystemDisk.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The memory size of the instance type. Unit: GiB. For more information, see [Instance families](~~25378~~). This parameter is valid only when DestinationResource is set to InstanceType.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * Specifies whether to support cross-cluster instance type upgrades. Valid values:
         * <p>
         * 
         * *   true: supports cross-cluster instance type upgrades.
         * *   false: does not support cross-cluster instance type upgrades.
         * 
         * Default value: false.
         * 
         * When the MigrateAcrossZone parameter is set to true and you upgrade the instance type of the Elastic Compute Service (ECS) instance based on returned information, take note of the following items:
         * 
         * *   Instances that reside in the classic network:
         * 
         *     *   For [retired instance types](~~55263~~), when a non-I/O-optimized instance is upgraded to an I/O-optimized instance, the private IP address, disk device names, and software authorization codes of the instance change. For Linux instances, basic disks (cloud) are identified by the prefix xvd. Ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified by the prefix vd.
         *     *   For [instance families available for purchase](~~25378~~), when the instance type of an instance is changed, the private IP address of the instance changes.
         * 
         * *   Instances that reside in virtual private clouds (VPCs): For [retired instance types](~~55263~~), when a non-I/O-optimized instance is upgraded to an I/O-optimized instance, the disk device names and software authorization codes of the instance change. For Linux instances, basic disks (cloud) are identified by the prefix xvd. Ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified by the prefix vd.
         */
        public Builder migrateAcrossZone(Boolean migrateAcrossZone) {
            this.putQueryParameter("MigrateAcrossZone", migrateAcrossZone);
            this.migrateAcrossZone = migrateAcrossZone;
            return this;
        }

        /**
         * The operation of changing resource configurations.
         * <p>
         * 
         * *   Valid values for subscription resources:
         * 
         *     *   Upgrade
         *     *   Downgrade
         *     *   RenewDowngrade
         *     *   RenewModify
         * 
         * *   Valid values for pay-as-you-go resources: Upgrade
         * 
         * Default value: Upgrade.
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
         * The ID of the region. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource. For example, when DestinationResource is set to InstanceType, this parameter can be interpreted as InstanceId.
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
         * The ID of the zone to query.
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
