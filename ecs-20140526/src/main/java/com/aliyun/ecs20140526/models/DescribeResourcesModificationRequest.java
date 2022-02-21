// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("DestinationResource")
    private String destinationResource;

    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("MigrateAcrossZone")
    private Boolean migrateAcrossZone;

    @Query
    @NameInMap("OperationType")
    private String operationType;

    private DescribeResourcesModificationRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceId = builder.resourceId;
        this.memory = builder.memory;
        this.regionId = builder.regionId;
        this.instanceType = builder.instanceType;
        this.destinationResource = builder.destinationResource;
        this.cores = builder.cores;
        this.migrateAcrossZone = builder.migrateAcrossZone;
        this.operationType = builder.operationType;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return destinationResource
     */
    public String getDestinationResource() {
        return this.destinationResource;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
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

    public static final class Builder extends Request.Builder<DescribeResourcesModificationRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String resourceId; 
        private Float memory; 
        private String regionId; 
        private String instanceType; 
        private String destinationResource; 
        private Integer cores; 
        private Boolean migrateAcrossZone; 
        private String operationType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourcesModificationRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.resourceId = response.resourceId;
            this.memory = response.memory;
            this.regionId = response.regionId;
            this.instanceType = response.instanceType;
            this.destinationResource = response.destinationResource;
            this.cores = response.cores;
            this.migrateAcrossZone = response.migrateAcrossZone;
            this.operationType = response.operationType;
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
         * The ID of the resource. For example, if the resource to be queried is an instance, it can be understood as InstanceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
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
         * The ID of the destination region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The instance type. More information, please see [instance dimension family](~~ 25378 ~~), you can also call [DescribeInstanceTypes](~~ 25620 ~~) interface get the latest spec sheet. When the parameter DestinationResource value for SystemDisk when, must also be specified InstanceType parameters.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Target resource type. Valid values:
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
         * The number of vCPU cores of the instance type. For more information, see [instance type family](~~ 25378 ~~). When DestinationResource = InstanceType parameter effective, Cores for valid parameter.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * Whether support cross-Cluster Upgrade instance specifications. Valid values:
         * <p>
         * 
         * -true: support
         * -false: not supported
         * 
         * Default value: false
         * 
         * When the parameter MigrateAcrossZone value is true, once you according to return information upgrade cloud server, please note the following considerations:
         * 
         * -Classic network type instance:
         * -For [has stop an instance of dimension](~~ 55263 ~~), non-I/O optimization instance variable with to I/O optimization instance instance private network IP ADDRESS, cloud device name and software authorization code will change. For Linux instances, ordinary cloud (cloud) are identified as xvda or xvdb etc., high efficiency cloud (cloud_efficiency) and SSD cloud (cloud_ssd) are identified as vda or vdb, etc.
         * -For [normal sold instance dimension family](~~ 25378 ~~), instance private network IP ADDRESS will change.
         * 
         * -Proprietary network VPC type instance: for [has stop an instance of dimension](~~ 55263 ~~), non-I/O optimization instance variable with to I/O optimization instance, cloud server cloud device name and software authorization code will change. Linux instances ordinary cloud (cloud) are identified as xvda or xvdb etc., high efficiency cloud (cloud_efficiency) and SSD cloud (cloud_ssd) are identified as vda or vdb, etc.
         */
        public Builder migrateAcrossZone(Boolean migrateAcrossZone) {
            this.putQueryParameter("MigrateAcrossZone", migrateAcrossZone);
            this.migrateAcrossZone = migrateAcrossZone;
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
         * -RenewDowngrade: renew drop
         * -RenewModify: expired instance renewals variable
         * 
         * -The value of the pay-as-you-go resource is Upgrade.
         * 
         * Default: Upgrade
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        @Override
        public DescribeResourcesModificationRequest build() {
            return new DescribeResourcesModificationRequest(this);
        } 

    } 

}
