// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReplicationJobRequest} extends {@link RequestModel}
 *
 * <p>CreateReplicationJobRequest</p>
 */
public class CreateReplicationJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("JobType")
    private Integer jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
    private String launchTemplateVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseType")
    private String licenseType;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationParameters")
    private String replicationParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunOnce")
    private Boolean runOnce;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledStartTime")
    private String scheduledStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskPart")
    private java.util.List < SystemDiskPart> systemDiskPart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

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

    private CreateReplicationJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
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
        this.jobType = builder.jobType;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.licenseType = builder.licenseType;
        this.maxNumberOfImageToKeep = builder.maxNumberOfImageToKeep;
        this.name = builder.name;
        this.netMode = builder.netMode;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.replicationParameters = builder.replicationParameters;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.runOnce = builder.runOnce;
        this.scheduledStartTime = builder.scheduledStartTime;
        this.sourceId = builder.sourceId;
        this.systemDiskPart = builder.systemDiskPart;
        this.systemDiskSize = builder.systemDiskSize;
        this.tag = builder.tag;
        this.targetType = builder.targetType;
        this.vSwitchId = builder.vSwitchId;
        this.validTime = builder.validTime;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReplicationJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return jobType
     */
    public Integer getJobType() {
        return this.jobType;
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
     * @return licenseType
     */
    public String getLicenseType() {
        return this.licenseType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicationParameters
     */
    public String getReplicationParameters() {
        return this.replicationParameters;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return runOnce
     */
    public Boolean getRunOnce() {
        return this.runOnce;
    }

    /**
     * @return scheduledStartTime
     */
    public String getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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

    public static final class Builder extends Request.Builder<CreateReplicationJobRequest, Builder> {
        private String clientToken; 
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
        private Integer jobType; 
        private String launchTemplateId; 
        private String launchTemplateVersion; 
        private String licenseType; 
        private Integer maxNumberOfImageToKeep; 
        private String name; 
        private Integer netMode; 
        private Long ownerId; 
        private String regionId; 
        private String replicationParameters; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Boolean runOnce; 
        private String scheduledStartTime; 
        private String sourceId; 
        private java.util.List < SystemDiskPart> systemDiskPart; 
        private Integer systemDiskSize; 
        private java.util.List < Tag> tag; 
        private String targetType; 
        private String vSwitchId; 
        private String validTime; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateReplicationJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
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
            this.jobType = request.jobType;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateVersion = request.launchTemplateVersion;
            this.licenseType = request.licenseType;
            this.maxNumberOfImageToKeep = request.maxNumberOfImageToKeep;
            this.name = request.name;
            this.netMode = request.netMode;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.replicationParameters = request.replicationParameters;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.runOnce = request.runOnce;
            this.scheduledStartTime = request.scheduledStartTime;
            this.sourceId = request.sourceId;
            this.systemDiskPart = request.systemDiskPart;
            this.systemDiskSize = request.systemDiskSize;
            this.tag = request.tag;
            this.targetType = request.targetType;
            this.vSwitchId = request.vSwitchId;
            this.validTime = request.validTime;
            this.vpcId = request.vpcId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
         * The data disks.
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
         * The description must be 2 to 128 characters in length, and can contain digits, colons (:), underscores (\_), and hyphens (-). The description must start with a letter, but cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The interval at which SMC synchronizes incremental data to Alibaba Cloud. Unit: hour. Valid values: 1 to 168.
         * <p>
         * 
         * This parameter is required if you set the `RunOnce` parameter to false.
         * 
         * By default, this parameter is empty.
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
         * *   The name must be 2 to 128 characters in length, and can contain digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter, but cannot start with `http://` or `https://`.
         * 
         * >  If you specify an image name that already exists in the destination region, the migration job ID is appended to the image name as a suffix. Example: ImageName_j-2zexxxxxxxxxxxxx.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The ID of the destination ECS instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the Resource Access Management (RAM) role that is assigned to the instance.
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
         * You can call the [DescribeInstanceTypes](~~25620~~) operation to obtain the ECS instance types.
         * 
         * *   If you specify this parameter, SMC creates an intermediate instance of the specified instance type. If the specified instance type is unavailable, you cannot create the migration job.
         * *   If you do not specify this parameter, SMC selects an available instance type in a specific order to create an intermediate instance. For more information, see [SMC FAQ](~~121707~~).
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The type of the migration job. Valid values:
         * <p>
         * 
         * *   0: server migration.
         * *   1: operating system migration.
         * *   2: cross-zone migration.
         * *   3: agentless migration for a VMware VM.
         */
        public Builder jobType(Integer jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * The ID of the launch template.
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
         * The license type. Valid values:
         * <p>
         * 
         * *   An empty value specifies no license.
         * *   A value of BYOL specifies Bring Your Own License (BYOL).
         * 
         * For more information, see [SMC FAQ](~~121707~~).
         */
        public Builder licenseType(String licenseType) {
            this.putQueryParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
            return this;
        }

        /**
         * The maximum number of images retained for the incremental migration job. Valid values: 1 to 10.
         * <p>
         * 
         * This parameter is required if you set the `RunOnce` parameter to false.
         * 
         * By default, this parameter is empty.
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
         * *   The name must be 2 to 128 characters in length, and can contain digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter, but cannot start with `http://` or `https://`.
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
         * The ID of the Alibaba Cloud region to which you want to migrate the source server.
         * <p>
         * 
         * For example, if you want to migrate the source server to the China (Hangzhou) region, set this parameter to `cn-hangzhou`. You can call the [DescribeRegions](~~25609~~) operation to query the latest regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * Specifies whether to disable incremental migration for the source server. Valid values:
         * <p>
         * 
         * *   true: creates a migration job that runs only once. This is the default value. Incremental data of the source server is not synchronized.
         * *   false: creates an incremental migration job. In this case, you must specify the `Frequency` parameter. SMC synchronizes incremental data of the source server to Alibaba Cloud at the specified frequency. You can use an incremental migration job to synchronize incremental data from the source server to Alibaba Cloud without the need to interrupt your business. A full data image is generated for the source server when the job is running.
         * 
         * >  You can specify this parameter only when you create a migration job. The parameter value cannot be changed after the migration job is created.
         */
        public Builder runOnce(Boolean runOnce) {
            this.putQueryParameter("RunOnce", runOnce);
            this.runOnce = runOnce;
            return this;
        }

        /**
         * The time when you want to run the migration job. The time must meet the following requirements:
         * <p>
         * 
         * *   The time must be specified in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. For example, 2018-01-01T12:00:00Z specifies 20:00:00 on January 1, 2018 (UTC+8).
         * *   The value must be within 30 days after the current time.
         * 
         * >  If you do not specify this parameter, you must manually start the migration job after the job is created. You can call the [StartReplicationJob](~~121823~~) operation to start the migration job.
         */
        public Builder scheduledStartTime(String scheduledStartTime) {
            this.putQueryParameter("ScheduledStartTime", scheduledStartTime);
            this.scheduledStartTime = scheduledStartTime;
            return this;
        }

        /**
         * The ID of the source server.
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * The information about system disk partitions.
         */
        public Builder systemDiskPart(java.util.List < SystemDiskPart> systemDiskPart) {
            this.putQueryParameter("SystemDiskPart", systemDiskPart);
            this.systemDiskPart = systemDiskPart;
            return this;
        }

        /**
         * The system disk size of the destination ECS instance. Unit: GiB. Valid values: 20 to 2048.
         * <p>
         * 
         * >  The value must be greater than the used space of the system disk on the source server. For example, if the total size of the source disk is 500 GiB and the used space is 100 GiB, the value of this parameter must be greater than 100 GiB.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The type of destination to which you want to migrate the source server. Valid values:
         * <p>
         * 
         * *   Image: After the migration job is complete, SMC generates an Elastic Compute Service (ECS) image for the source server.
         * *   ContainerImage: After the migration job is complete, SMC generates a Docker container image for the source server.
         * *   TargetInstance: After the migration job is completed, SMC migrates the source server to the destination instance. If you set this parameter to TargetInstance, you must set the `InstanceId` parameter.
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
         * *   The time must be specified in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. For example, 2018-01-01T12:00:00Z specifies 20:00:00 on January 1, 2018 (UTC+8).
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
        public CreateReplicationJobRequest build() {
            return new CreateReplicationJobRequest(this);
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
             * 
             * Default value: true
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * The device ID of partition N in the destination data disk. The partitions in the destination data disk are arranged in the same sequential order as those in the source data disk.
             * <p>
             * 
             * >  You must set both the DataDisk.N.Part.N.Device and `DataDisk.N.Part.N.SizeBytes` parameters or leave both parameters empty.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The size of partition N in the destination data disk. Unit: bytes. The default value is equal to the corresponding partition size of the source data disk.
             * <p>
             * 
             * > 
             * 
             * *   The total size of all partitions in a destination data disk cannot exceed the size of the destination data disk.
             * 
             * *   You must set both the `DataDisk.N.Part.N.Device` and DataDisk.N.Part.N.SizeBytes parameters or leave both parameters empty.
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
             * The index of data disk N on the destination ECS instance. Data disks on a destination ECS instance are arranged in a sequential order that starts from 1. Valid values: 1 to 16.
             * <p>
             * 
             * >  To create a destination data disk for a source server, make sure that the source server has data disks.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * The data disk partitions.
             */
            public Builder part(java.util.List < Part> part) {
                this.part = part;
                return this;
            }

            /**
             * The size of the data disk on the destination ECS instance. Unit: GiB. Valid values: 20 to 32768.
             * <p>
             * 
             * >  The size of a destination data disk must be larger than the size of data in the source data disk. For example, if the size of the source data disk is 500 GiB and the used space is 100 GiB, you must set this parameter to a value greater than 100.
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
             * 
             * Default value: true
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * The ID of partition N in the destination system disk. The partitions in the destination system disk are arranged in the same sequential order as those in the source system disk.
             * <p>
             * 
             * >  You must set both the SystemDiskPart.N.Device and `SystemDiskPart.N.SizeBytes` parameters or leave both parameters empty.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The size of the partition N in the destination system disk. Unit: bytes. The default value is equal to the partition size of the source system disk.
             * <p>
             * 
             * > 
             * 
             * *   The total size of all partitions in the destination system disk cannot exceed the size of the destination system disk.
             * 
             * *   You must set both the `SystemDiskPart.N.Device` and SystemDiskPart.N.SizeBytes parameters or leave both parameters empty.
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
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag for the migration job. Valid values of N: 1 to 20.
             * <p>
             * 
             * The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with `aliyun`, `acs:`, `http://`, or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag for the migration job. Valid values of N: 1 to 20.
             * <p>
             * 
             * The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with `aliyun`, `acs:`, `http://`, or `https://`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
