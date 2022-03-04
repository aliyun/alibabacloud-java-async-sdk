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
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("DestinationResource")
    @Validation(required = true)
    private String destinationResource;

    @Query
    @NameInMap("OperationType")
    private String operationType;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("MigrateAcrossZone")
    private Boolean migrateAcrossZone;

    private DescribeResourcesModificationRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.destinationResource = builder.destinationResource;
        this.operationType = builder.operationType;
        this.memory = builder.memory;
        this.cores = builder.cores;
        this.instanceType = builder.instanceType;
        this.resourceId = builder.resourceId;
        this.migrateAcrossZone = builder.migrateAcrossZone;
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
     * @return destinationResource
     */
    public String getDestinationResource() {
        return this.destinationResource;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return migrateAcrossZone
     */
    public Boolean getMigrateAcrossZone() {
        return this.migrateAcrossZone;
    }

    public static final class Builder extends Request.Builder<DescribeResourcesModificationRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String destinationResource; 
        private String operationType; 
        private Float memory; 
        private Integer cores; 
        private String instanceType; 
        private String resourceId; 
        private Boolean migrateAcrossZone; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourcesModificationRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.destinationResource = request.destinationResource;
            this.operationType = request.operationType;
            this.memory = request.memory;
            this.cores = request.cores;
            this.instanceType = request.instanceType;
            this.resourceId = request.resourceId;
            this.migrateAcrossZone = request.migrateAcrossZone;
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
         * The ID of the destination region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the target resource. Valid values:
         * <p>
         * 
         * -InstanceType: instance type
         * -SystemDisk: system disk type
         */
        public Builder destinationResource(String destinationResource) {
            this.putQueryParameter("DestinationResource", destinationResource);
            this.destinationResource = destinationResource;
            return this;
        }

        /**
         * Change the operation type of the resource configuration.
         * <p>
         * 
         * -Valid values of subscription resources:
         * 
         * -Upgrade: Upgrade resources
         * -Downgrade: Downgrade resources
         * -RenewDowngrade: renewal and downgrade
         * -RenewModify: renewal and configuration change for expired instances
         * 
         * -The value of the pay-as-you-go resource is Upgrade.
         * 
         * Default value: Upgrade
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * The memory size of the instance type. Unit: GiB. For more information, see [instance type family](~~ 25378 ~~). Memory is a valid parameter only when DestinationResource is set to InstanceType.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * The number of vCPU cores of the instance type. For more information, see [instance type family](~~ 25378 ~~). If DestinationResource = InstanceType parameter is valid, Cores is the valid parameter.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * The instance type. For more information, see [instance type family](~~ 25378 ~~), or call [DescribeInstanceTypes](~~ 25620 ~~) to obtain the latest specification. If the parameter DestinationResource is set to SystemDisk, you must specify the InstanceType parameter at the same time.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The ID of the resource. For example, if the resource to be queried is an instance, it can be understood as InstanceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Indicates whether the instance type can be upgraded across clusters. Valid values:
         * <p>
         * 
         * -true: supported
         * -false: not supported
         * 
         * Default value: false
         * 
         * If the MigrateAcrossZone parameter is set to true, note the following when you upgrade the ecs instance based on the returned information:
         * 
         * -Classic network type instance:
         * -For [phased-out instance types](~~ 55263 ~~), when a non-I/O optimized instance is changed to an I/O optimized instance, the private ip address, cloud disk device name, and software authorization code of the instance change. For Linux instances, basic cloud disks are identified as xvda or xvdb, and ultra cloud disks (cloud_efficiency) and SSD cloud disks (cloud_ssd) are identified as vda or vdb.
         * -For [normal instance type families](~~ 25378 ~~), the private ip address of the instance changes.
         * 
         * -VPC instances: for [phased-out instance types](~~ 55263 ~~), when a non-I/O optimized instance is changed to an I/O optimized instance, the device name and software authorization code of the cloud disk change. For Linux instances, basic cloud disks are identified as xvda or xvdb, and ultra cloud disks (cloud_efficiency) and SSD cloud disks (cloud_ssd) are identified as vda or vdb.
         */
        public Builder migrateAcrossZone(Boolean migrateAcrossZone) {
            this.putQueryParameter("MigrateAcrossZone", migrateAcrossZone);
            this.migrateAcrossZone = migrateAcrossZone;
            return this;
        }

        @Override
        public DescribeResourcesModificationRequest build() {
            return new DescribeResourcesModificationRequest(this);
        } 

    } 

}
