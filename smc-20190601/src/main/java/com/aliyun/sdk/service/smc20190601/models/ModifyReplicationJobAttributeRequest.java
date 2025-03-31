// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

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
    private java.util.List<DataDisk> dataDisk;

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
    private java.util.List<SystemDiskPart> systemDiskPart;

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
    public java.util.List<DataDisk> getDataDisk() {
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
    public java.util.List<SystemDiskPart> getSystemDiskPart() {
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
        private java.util.List<DataDisk> dataDisk; 
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
        private java.util.List<SystemDiskPart> systemDiskPart; 
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
         * <p>The namespace of the destination Docker container image. For more information about Docker container images, see <a href="https://help.aliyun.com/document_detail/60744.html">Terms</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>testNamespace</p>
         */
        public Builder containerNamespace(String containerNamespace) {
            this.putQueryParameter("ContainerNamespace", containerNamespace);
            this.containerNamespace = containerNamespace;
            return this;
        }

        /**
         * <p>The repository that stores the destination Docker container image. For more information about Docker container images, see <a href="https://help.aliyun.com/document_detail/60744.html">Terms</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>testRepository</p>
         */
        public Builder containerRepository(String containerRepository) {
            this.putQueryParameter("ContainerRepository", containerRepository);
            this.containerRepository = containerRepository;
            return this;
        }

        /**
         * <p>The tag of the destination Docker container image. For more information about Docker container images, see <a href="https://help.aliyun.com/document_detail/60744.html">Terms</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS:v1</p>
         */
        public Builder containerTag(String containerTag) {
            this.putQueryParameter("ContainerTag", containerTag);
            this.containerTag = containerTag;
            return this;
        }

        /**
         * <p>The information about the data disk.</p>
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * <p>The description of the migration job.</p>
         * <p>The description must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This_is_my_migration_task</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The interval at which an incremental migration job runs. Unit: hour. Valid values: 1 to 168.</p>
         * <p>This parameter is required if you set the <code>RunOnce</code> parameter to false.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder frequency(Integer frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>The name of the destination image. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be unique within an Alibaba Cloud region.</li>
         * <li>The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * <blockquote>
         * <p> If an image whose name is the same as that of the destination image already exists in the current region when the migration job is in progress, the system adds the migration job ID to the end of the image name by default. Example: ImageName-JobId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testAliCloudImageName</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The destination instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1f1dvfto1sigz5****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the Resource Access Management (RAM) role that is attached to the intermediate instance.</p>
         * 
         * <strong>example:</strong>
         * <p>SMCAdmin</p>
         */
        public Builder instanceRamRole(String instanceRamRole) {
            this.putQueryParameter("InstanceRamRole", instanceRamRole);
            this.instanceRamRole = instanceRamRole;
            return this;
        }

        /**
         * <p>The type of the intermediate instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the ECS instance types.</p>
         * <ul>
         * <li>If you specify this parameter, SMC creates an intermediate instance of the specified instance type. If the specified instance type is unavailable, you cannot create the migration job.</li>
         * <li>If you do not specify this parameter, SMC selects an available instance type in a specific order to create an intermediate instance. For more information,</li>
         * </ul>
         * <p>see the &quot;How does SMC create an intermediate instance?&quot; section of the &quot;FAQ&quot; topic.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The migration job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>j-bp19vlwm0tyigbmj****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The launch template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-bp16jovvln1cgaaq****</p>
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * <p>The version number of the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>Latest</p>
         */
        public Builder launchTemplateVersion(String launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * <p>The maximum number of images that are retained for an incremental migration job. Valid values: 1 to 10.</p>
         * <p>This parameter is required if you set the <code>RunOnce</code> parameter to false.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder maxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
            this.putQueryParameter("MaxNumberOfImageToKeep", maxNumberOfImageToKeep);
            this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
            return this;
        }

        /**
         * <p>The name of the migration job. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be unique.</li>
         * <li>The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testMigrationTaskName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The network mode for data transmission. Valid values:</p>
         * <ul>
         * <li>0: Data is transmitted over the Internet. Make sure that the source server can access the Internet.</li>
         * <li>2: Data is transmitted over a virtual private cloud (VPC). If you set this parameter to 2, you must specify the VSwitchId parameter. You can leave the VpcId parameter empty, the VPC ID can be queried by calling an operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The parameters of the replication driver. The parameters are fixed key-value pairs of the JSON format. The value can be up to 2,048 characters in length.</p>
         * <p>A replication driver is a tool that is used to replicate the data of a source server to an intermediate instance. The parameters vary based on the replication driver type. If you use a Server Migration Tool (SMT) driver, you can set the following parameters:</p>
         * <ul>
         * <li>bandwidth_limit: the maximum bandwidth for data transmission.</li>
         * <li>compress_level: the compression ratio of data to be transmitted.</li>
         * <li>checksum: specifies whether to enable checksum verification</li>
         * </ul>
         * <p>For more information about the replication driver, see the response parameter <code>SourceServers.ReplicationDriver</code> of the <a href="https://help.aliyun.com/document_detail/2402126.html">DescribeSourceServers</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bandwidth_limit&quot;:0,&quot;compress_level&quot;:1,&quot;checksum&quot;:true}</p>
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
         * <p>The time when the migration job is executed. SMC starts the migration job at the specified time.</p>
         * <p>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC. For example, 2018-01-01T12:00:00Z indicates 20:00:00 on January 1, 2018 (UTC+8).</p>
         * <blockquote>
         * <p> If ScheduledStartTime is left empty, SMC does not automatically start the migration job. In this case, you must call the <a href="https://help.aliyun.com/document_detail/121823.html">StartReplicationJob</a> operation to start the migration job.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-06-04T13:35:00Z</p>
         */
        public Builder scheduledStartTime(String scheduledStartTime) {
            this.putQueryParameter("ScheduledStartTime", scheduledStartTime);
            this.scheduledStartTime = scheduledStartTime;
            return this;
        }

        /**
         * <p>The partition information of the system disk.</p>
         */
        public Builder systemDiskPart(java.util.List<SystemDiskPart> systemDiskPart) {
            this.putQueryParameter("SystemDiskPart", systemDiskPart);
            this.systemDiskPart = systemDiskPart;
            return this;
        }

        /**
         * <p>The system disk size of the destination ECS instance. Unit: GiB. Valid values: 20 to 500.</p>
         * <blockquote>
         * <p> The size of a destination data disk must be greater than the size of data in the source data disk. For example, if the source data disk has 500 GiB of storage space and 100 GiB of data, you must set this parameter to a value greater than 100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * <p>The type of destination to which the source server is migrated. You can modify the value only before the migration job starts. Valid values:</p>
         * <ul>
         * <li>Image: After the migration job is complete, Server Migration Center (SMC) generates a destination Elastic Compute Service (ECS) image for the source server. You can use the image to create an ECS instance.</li>
         * <li>ContainerImage: After the migration job is complete, SMC generates a container image for the source server. You can use the container image in Container Registry.</li>
         * <li>TargetInstance: After the migration job is complete, SMC migrates the source server to the destination instance. If you set this parameter to TargetInstance, you must set the <code>InstanceId</code> parameter.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The value of this parameter is not case-sensitive.</p>
         * </li>
         * <li><p>SMC does not allow you to migrate Windows servers or servers that run operating systems on the ARM architecture to Container Registry.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1ddbrxdlrcbim46****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The time when the migration job expires. You can schedule the migration job to expire 7 to 90 days after the job is created.</p>
         * <ul>
         * <li>This parameter can be modified only if the migration job is in the Ready, Running, Stopped, InError, or Waiting state.</li>
         * <li>Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC. For example, 2018-01-01T12:00:00Z indicates 20:00:00 on January 1, 2018 (UTC+8).</li>
         * <li>If you do not specify this parameter, the migration job does not expire.</li>
         * <li>After a migration job expires, the job state changes to Expired. SMC retains the migration job for seven days after the job expires. After the job is retained for seven days, SMC deletes the migration job.</li>
         * </ul>
         * <p>By default, a migration job is valid for 30 days after it is created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-04T13:35:00Z</p>
         */
        public Builder validTime(String validTime) {
            this.putQueryParameter("ValidTime", validTime);
            this.validTime = validTime;
            return this;
        }

        /**
         * <p>The ID of the VPC for which an Express Connect circuit or VPN gateway is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1vwnn14rqpyiczj****</p>
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

    /**
     * 
     * {@link ModifyReplicationJobAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyReplicationJobAttributeRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Part model) {
                this.block = model.block;
                this.device = model.device;
                this.sizeBytes = model.sizeBytes;
            } 

            /**
             * <p>Specifies whether to enable block replication for partition N in the destination data disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * <p>The ID of partition N in the destination data disk.</p>
             * <blockquote>
             * <p> The partitions in the destination data disk are arranged in the same sequential order as those in the source data disk.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0_1</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The size of partition N in the destination data disk. Unit: bytes. The default value is equal to the corresponding size of the partition in the source data disk.</p>
             * <blockquote>
             * <p> The total size of all partitions in the destination data disk cannot exceed the size of the destination data disk.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>254803968</p>
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
    /**
     * 
     * {@link ModifyReplicationJobAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyReplicationJobAttributeRequest</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Part")
        private java.util.List<Part> part;

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
        public java.util.List<Part> getPart() {
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
            private java.util.List<Part> part; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.index = model.index;
                this.part = model.part;
                this.size = model.size;
            } 

            /**
             * <p>The index of data disk N on the destination ECS instance. Valid values of N: 1 to 16.</p>
             * <p>Data disks on a destination ECS instance are arranged in a sequential order that starts from 1.</p>
             * <blockquote>
             * <p> You can create a destination data disk only for a source server that has data disks.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The information about partitions.</p>
             */
            public Builder part(java.util.List<Part> part) {
                this.part = part;
                return this;
            }

            /**
             * <p>The size of the data disk on the destination ECS instance. Unit: GiB. Valid values: 20 to 32768.</p>
             * <blockquote>
             * <p> The size of a destination data disk must be greater than the size of data in the source data disk. For example, if the source data disk has 500 GiB of storage space and 100 GiB of data, you must set this parameter to a value greater than 100.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link ModifyReplicationJobAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyReplicationJobAttributeRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(SystemDiskPart model) {
                this.block = model.block;
                this.device = model.device;
                this.sizeBytes = model.sizeBytes;
            } 

            /**
             * <p>Specifies whether to enable block replication for partition N in the destination system disk. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * <p>The ID of partition N in the destination system disk.</p>
             * <blockquote>
             * <p> The partitions in the destination system disk are arranged in the same sequential order as those in the source system disk.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0_1</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The size of partition N in the destination system disk. Unit: bytes. The default value is equal to the partition size of the source system disk.</p>
             * <blockquote>
             * <p> The total size of all partitions in the destination system disk cannot exceed the size of the destination system disk.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>254803968</p>
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
