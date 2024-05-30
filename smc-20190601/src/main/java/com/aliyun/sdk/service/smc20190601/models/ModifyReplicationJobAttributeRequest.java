// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReplicationJobAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyReplicationJobAttributeRequest</p>
 */
public class ModifyReplicationJobAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerNamespace")
    private String containerNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerRepository")
    private String containerRepository;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerTag")
    private String containerTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Frequency")
    private Integer frequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceRamRole")
    private String instanceRamRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
    private String launchTemplateVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxNumberOfImageToKeep")
    private Integer maxNumberOfImageToKeep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetMode")
    private Integer netMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationParameters")
    private String replicationParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledStartTime")
    private String scheduledStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskPart")
    private java.util.List < SystemDiskPart> systemDiskPart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidTime")
    private String validTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private ModifyReplicationJobAttributeRequest(Builder builder) {
        super(builder);
        this.containerNamespace = builder.containerNamespace;
        this.containerRepository = builder.containerRepository;
        this.containerTag = builder.containerTag;
        this.dataDisk = builder.dataDisk;
        this.description = builder.description;
        this.frequency = builder.frequency;
        this.imageName = builder.imageName;
        this.instanceId = builder.instanceId;
        this.instanceRamRole = builder.instanceRamRole;
        this.instanceType = builder.instanceType;
        this.jobId = builder.jobId;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.maxNumberOfImageToKeep = builder.maxNumberOfImageToKeep;
        this.name = builder.name;
        this.netMode = builder.netMode;
        this.ownerId = builder.ownerId;
        this.replicationParameters = builder.replicationParameters;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scheduledStartTime = builder.scheduledStartTime;
        this.systemDiskPart = builder.systemDiskPart;
        this.systemDiskSize = builder.systemDiskSize;
        this.targetType = builder.targetType;
        this.vSwitchId = builder.vSwitchId;
        this.validTime = builder.validTime;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReplicationJobAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerNamespace
     */
    public String getContainerNamespace() {
        return this.containerNamespace;
    }

    /**
     * @return containerRepository
     */
    public String getContainerRepository() {
        return this.containerRepository;
    }

    /**
     * @return containerTag
     */
    public String getContainerTag() {
        return this.containerTag;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return frequency
     */
    public Integer getFrequency() {
        return this.frequency;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceRamRole
     */
    public String getInstanceRamRole() {
        return this.instanceRamRole;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return launchTemplateVersion
     */
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return maxNumberOfImageToKeep
     */
    public Integer getMaxNumberOfImageToKeep() {
        return this.maxNumberOfImageToKeep;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return netMode
     */
    public Integer getNetMode() {
        return this.netMode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return replicationParameters
     */
    public String getReplicationParameters() {
        return this.replicationParameters;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scheduledStartTime
     */
    public String getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    /**
     * @return systemDiskPart
     */
    public java.util.List < SystemDiskPart> getSystemDiskPart() {
        return this.systemDiskPart;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return validTime
     */
    public String getValidTime() {
        return this.validTime;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ModifyReplicationJobAttributeRequest, Builder> {
        private String containerNamespace; 
        private String containerRepository; 
        private String containerTag; 
        private java.util.List < DataDisk> dataDisk; 
        private String description; 
        private Integer frequency; 
        private String imageName; 
        private String instanceId; 
        private String instanceRamRole; 
        private String instanceType; 
        private String jobId; 
        private String launchTemplateId; 
        private String launchTemplateVersion; 
        private Integer maxNumberOfImageToKeep; 
        private String name; 
        private Integer netMode; 
        private Long ownerId; 
        private String replicationParameters; 
        private String resourceOwnerAccount; 
        private String scheduledStartTime; 
        private java.util.List < SystemDiskPart> systemDiskPart; 
        private Integer systemDiskSize; 
        private String targetType; 
        private String vSwitchId; 
        private String validTime; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyReplicationJobAttributeRequest request) {
            super(request);
            this.containerNamespace = request.containerNamespace;
            this.containerRepository = request.containerRepository;
            this.containerTag = request.containerTag;
            this.dataDisk = request.dataDisk;
            this.description = request.description;
            this.frequency = request.frequency;
            this.imageName = request.imageName;
            this.instanceId = request.instanceId;
            this.instanceRamRole = request.instanceRamRole;
            this.instanceType = request.instanceType;
            this.jobId = request.jobId;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateVersion = request.launchTemplateVersion;
            this.maxNumberOfImageToKeep = request.maxNumberOfImageToKeep;
            this.name = request.name;
            this.netMode = request.netMode;
            this.ownerId = request.ownerId;
            this.replicationParameters = request.replicationParameters;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scheduledStartTime = request.scheduledStartTime;
            this.systemDiskPart = request.systemDiskPart;
            this.systemDiskSize = request.systemDiskSize;
            this.targetType = request.targetType;
            this.vSwitchId = request.vSwitchId;
            this.validTime = request.validTime;
            this.vpcId = request.vpcId;
        } 

        /**
         * The namespace of the destination Docker container image. For more information about Docker container images, see [Terms](~~60744~~).
         */
        public Builder containerNamespace(String containerNamespace) {
            this.putQueryParameter("ContainerNamespace", containerNamespace);
            this.containerNamespace = containerNamespace;
            return this;
        }

        /**
         * The repository that stores the destination Docker container image. For more information about Docker container images, see [Terms](~~60744~~).
         */
        public Builder containerRepository(String containerRepository) {
            this.putQueryParameter("ContainerRepository", containerRepository);
            this.containerRepository = containerRepository;
            return this;
        }

        /**
         * The tag of the destination Docker container image. For more information about Docker container images, see [Terms](~~60744~~).
         */
        public Builder containerTag(String containerTag) {
            this.putQueryParameter("ContainerTag", containerTag);
            this.containerTag = containerTag;
            return this;
        }

        /**
         * The information about the data disk.
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * The description of the migration job.
         * <p>
         * 
         * The description must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The interval at which an incremental migration job runs. Unit: hour. Valid values: 1 to 168.
         * <p>
         * 
         * This parameter is required if you set the `RunOnce` parameter to false.
         */
        public Builder frequency(Integer frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * The name of the destination image. The name must meet the following requirements:
         * <p>
         * 
         * *   The name must be unique within an Alibaba Cloud region.
         * *   The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
         * 
         * >  If an image whose name is the same as that of the destination image already exists in the current region when the migration job is in progress, the system adds the migration job ID to the end of the image name by default. Example: ImageName-JobId.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The destination instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the Resource Access Management (RAM) role that is attached to the intermediate instance.
         */
        public Builder instanceRamRole(String instanceRamRole) {
            this.putQueryParameter("InstanceRamRole", instanceRamRole);
            this.instanceRamRole = instanceRamRole;
            return this;
        }

        /**
         * The type of the intermediate instance.
         * <p>
         * 
         * You can call the [DescribeInstanceTypes](~~25620~~) operation to query the ECS instance types.
         * 
         * *   If you specify this parameter, SMC creates an intermediate instance of the specified instance type. If the specified instance type is unavailable, you cannot create the migration job.
         * *   If you do not specify this parameter, SMC selects an available instance type in a specific order to create an intermediate instance. For more information,
         * 
         * see the "How does SMC create an intermediate instance?" section of the "FAQ" topic.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The migration job ID.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The launch template ID.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * The version number of the launch template.
         */
        public Builder launchTemplateVersion(String launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * The maximum number of images that are retained for an incremental migration job. Valid values: 1 to 10.
         * <p>
         * 
         * This parameter is required if you set the `RunOnce` parameter to false.
         */
        public Builder maxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
            this.putQueryParameter("MaxNumberOfImageToKeep", maxNumberOfImageToKeep);
            this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
            return this;
        }

        /**
         * The name of the migration job. The name must meet the following requirements:
         * <p>
         * 
         * *   The name must be unique.
         * *   The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The network mode for data transmission. Valid values:
         * <p>
         * 
         * *   0: Data is transmitted over the Internet. Make sure that the source server can access the Internet.
         * *   2: Data is transmitted over a VPC. If you specify this value, you must specify the VSwitchId parameter. You do not need to specify the VpcId parameter because the value of the VpcId parameter can be retrieved based on the value of the VSwitchId parameter.
         * 
         * Default value: 0
         */
        public Builder netMode(Integer netMode) {
            this.putQueryParameter("NetMode", netMode);
            this.netMode = netMode;
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
         * The parameters of the replication driver. The parameters must be specified as key-value pairs in the JSON format. The keys are fixed for each type of replication driver. The JSON string can be up to 2,048 characters in length.
         * <p>
         * 
         * A replication driver is a tool that is used to migrate a source server to an intermediate instance. The parameters vary based on the replication driver type. If you use a Server Migration Tool (SMT) driver, you can specify the following parameters:
         * 
         * *   bandwidth_limit: the maximum bandwidth for data transmission.
         * *   compress_level: the compression ratio of data to be transmitted.
         * *   checksum: specifies whether to enable checksum verification.
         * 
         * For more information about replication drivers, see the response parameter `SourceServers.ReplicationDriver` of the [DescribeSourceServers](~~121818~~) operation.
         */
        public Builder replicationParameters(String replicationParameters) {
            this.putQueryParameter("ReplicationParameters", replicationParameters);
            this.replicationParameters = replicationParameters;
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
         * The time when the migration job is executed. SMC starts the migration job at the specified time.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC. For example, 2018-01-01T12:00:00Z indicates 20:00:00 on January 1, 2018 (UTC+8).
         * 
         * >  If ScheduledStartTime is left empty, SMC does not automatically start the migration job. In this case, you must call the [StartReplicationJob](~~121823~~) operation to start the migration job.
         */
        public Builder scheduledStartTime(String scheduledStartTime) {
            this.putQueryParameter("ScheduledStartTime", scheduledStartTime);
            this.scheduledStartTime = scheduledStartTime;
            return this;
        }

        /**
         * The partition information of the system disk.
         */
        public Builder systemDiskPart(java.util.List < SystemDiskPart> systemDiskPart) {
            this.putQueryParameter("SystemDiskPart", systemDiskPart);
            this.systemDiskPart = systemDiskPart;
            return this;
        }

        /**
         * The system disk size of the destination ECS instance. Unit: GiB. Valid values: 20 to 500.
         * <p>
         * 
         * >  The size of a destination data disk must be greater than the size of data in the source data disk. For example, if the source data disk has 500 GiB of storage space and 100 GiB of data, you must set this parameter to a value greater than 100.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * The type of destination to which the source server is migrated. You can modify the value only before the migration job starts. Valid values:
         * <p>
         * 
         * *   Image: After the migration job is complete, Server Migration Center (SMC) generates a destination Elastic Compute Service (ECS) image for the source server. You can use the image to create an ECS instance.
         * *   ContainerImage: After the migration job is complete, SMC generates a container image for the source server. You can use the container image in Container Registry.
         * *   TargetInstance: After the migration job is complete, SMC migrates the source server to the destination instance. If you set this parameter to TargetInstance, you must set the `InstanceId` parameter.
         * 
         * > 
         * 
         * *   The value of this parameter is not case-sensitive.
         * 
         * *   SMC does not allow you to migrate Windows servers or servers that run operating systems on the ARM architecture to Container Registry.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * The ID of the vSwitch in the specified VPC.
         * <p>
         * 
         * You must set this parameter if you use a VPC to migrate data.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The time when the migration job expires. You can schedule the migration job to expire 7 to 90 days after the job is created.
         * <p>
         * 
         * *   This parameter can be modified only if the migration job is in the Ready, Running, Stopped, InError, or Waiting state.
         * *   Specify the time in the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC. For example, 2018-01-01T12:00:00Z indicates 20:00:00 on January 1, 2018 (UTC+8).
         * *   If you do not specify this parameter, the migration job does not expire.
         * *   After a migration job expires, the job state changes to Expired. SMC retains the migration job for seven days after the job expires. After the job is retained for seven days, SMC deletes the migration job.
         * 
         * By default, a migration job is valid for 30 days after it is created.
         */
        public Builder validTime(String validTime) {
            this.putQueryParameter("ValidTime", validTime);
            this.validTime = validTime;
            return this;
        }

        /**
         * The ID of a VPC for which you have configured an Express Connect circuit or a VPN gateway.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ModifyReplicationJobAttributeRequest build() {
            return new ModifyReplicationJobAttributeRequest(this);
        } 

    } 

    public static class Part extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Block")
        private Boolean block;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        private Part(Builder builder) {
            this.block = builder.block;
            this.device = builder.device;
            this.sizeBytes = builder.sizeBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Part create() {
            return builder().build();
        }

        /**
         * @return block
         */
        public Boolean getBlock() {
            return this.block;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public static final class Builder {
            private Boolean block; 
            private String device; 
            private Long sizeBytes; 

            /**
             * Specifies whether to enable block replication for partition N in the destination data disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * The ID of partition N in the destination data disk.
             * <p>
             * 
             * >  The partitions in the destination data disk are arranged in the same sequential order as those in the source data disk.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The size of partition N in the destination data disk. Unit: bytes. The default value is equal to the corresponding size of the partition in the source data disk.
             * <p>
             * 
             * >  The total size of all partitions in the destination data disk cannot exceed the size of the destination data disk.
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            public Part build() {
                return new Part(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Part")
        private java.util.List < Part> part;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private DataDisk(Builder builder) {
            this.index = builder.index;
            this.part = builder.part;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return part
         */
        public java.util.List < Part> getPart() {
            return this.part;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer index; 
            private java.util.List < Part> part; 
            private Integer size; 

            /**
             * The index of data disk N on the destination ECS instance. Valid values of N: 1 to 16.
             * <p>
             * 
             * Data disks on a destination ECS instance are arranged in a sequential order that starts from 1.
             * 
             * >  You can create a destination data disk only for a source server that has data disks.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * The information about partitions.
             */
            public Builder part(java.util.List < Part> part) {
                this.part = part;
                return this;
            }

            /**
             * The size of the data disk on the destination ECS instance. Unit: GiB. Valid values: 20 to 32768.
             * <p>
             * 
             * >  The size of a destination data disk must be greater than the size of data in the source data disk. For example, if the source data disk has 500 GiB of storage space and 100 GiB of data, you must set this parameter to a value greater than 100.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class SystemDiskPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Block")
        private Boolean block;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        private SystemDiskPart(Builder builder) {
            this.block = builder.block;
            this.device = builder.device;
            this.sizeBytes = builder.sizeBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDiskPart create() {
            return builder().build();
        }

        /**
         * @return block
         */
        public Boolean getBlock() {
            return this.block;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public static final class Builder {
            private Boolean block; 
            private String device; 
            private Long sizeBytes; 

            /**
             * Specifies whether to enable block replication for partition N in the destination system disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * The ID of partition N in the destination system disk.
             * <p>
             * 
             * >  The partitions in the destination system disk are arranged in the same sequential order as those in the source system disk.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The size of partition N in the destination system disk. Unit: bytes. The default value is equal to the partition size of the source system disk.
             * <p>
             * 
             * >  The total size of all partitions in the destination system disk cannot exceed the size of the destination system disk.
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            public SystemDiskPart build() {
                return new SystemDiskPart(this);
            } 

        } 

    }
}
