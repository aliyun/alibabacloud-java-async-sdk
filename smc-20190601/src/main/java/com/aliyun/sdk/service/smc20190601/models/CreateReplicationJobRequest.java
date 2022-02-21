// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReplicationJobRequest} extends {@link RequestModel}
 *
 * <p>CreateReplicationJobRequest</p>
 */
public class CreateReplicationJobRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ContainerNamespace")
    private String containerNamespace;

    @Query
    @NameInMap("ContainerRepository")
    private String containerRepository;

    @Query
    @NameInMap("ContainerTag")
    private String containerTag;

    @Query
    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Frequency")
    private Integer frequency;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InstanceRamRole")
    private String instanceRamRole;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @Query
    @NameInMap("LaunchTemplateVersion")
    private String launchTemplateVersion;

    @Query
    @NameInMap("LicenseType")
    private String licenseType;

    @Query
    @NameInMap("MaxNumberOfImageToKeep")
    private Integer maxNumberOfImageToKeep;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NetMode")
    private Integer netMode;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicationParameters")
    private String replicationParameters;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("RunOnce")
    private Boolean runOnce;

    @Query
    @NameInMap("ScheduledStartTime")
    private String scheduledStartTime;

    @Query
    @NameInMap("SourceId")
    @Validation(required = true)
    private String sourceId;

    @Query
    @NameInMap("SystemDiskPart")
    private java.util.List < SystemDiskPart> systemDiskPart;

    @Query
    @NameInMap("SystemDiskSize")
    @Validation(required = true)
    private Integer systemDiskSize;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ValidTime")
    private String validTime;

    @Query
    @NameInMap("VpcId")
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
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.licenseType = builder.licenseType;
        this.maxNumberOfImageToKeep = builder.maxNumberOfImageToKeep;
        this.name = builder.name;
        this.netMode = builder.netMode;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.replicationParameters = builder.replicationParameters;
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
        private String launchTemplateId; 
        private String launchTemplateVersion; 
        private String licenseType; 
        private Integer maxNumberOfImageToKeep; 
        private String name; 
        private Integer netMode; 
        private Long ownerId; 
        private String regionId; 
        private String replicationParameters; 
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

        private Builder(CreateReplicationJobRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.containerNamespace = response.containerNamespace;
            this.containerRepository = response.containerRepository;
            this.containerTag = response.containerTag;
            this.dataDisk = response.dataDisk;
            this.description = response.description;
            this.frequency = response.frequency;
            this.imageName = response.imageName;
            this.instanceId = response.instanceId;
            this.instanceRamRole = response.instanceRamRole;
            this.instanceType = response.instanceType;
            this.launchTemplateId = response.launchTemplateId;
            this.launchTemplateVersion = response.launchTemplateVersion;
            this.licenseType = response.licenseType;
            this.maxNumberOfImageToKeep = response.maxNumberOfImageToKeep;
            this.name = response.name;
            this.netMode = response.netMode;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.replicationParameters = response.replicationParameters;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.runOnce = response.runOnce;
            this.scheduledStartTime = response.scheduledStartTime;
            this.sourceId = response.sourceId;
            this.systemDiskPart = response.systemDiskPart;
            this.systemDiskSize = response.systemDiskSize;
            this.tag = response.tag;
            this.targetType = response.targetType;
            this.vSwitchId = response.vSwitchId;
            this.validTime = response.validTime;
            this.vpcId = response.vpcId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ContainerNamespace.
         */
        public Builder containerNamespace(String containerNamespace) {
            this.putQueryParameter("ContainerNamespace", containerNamespace);
            this.containerNamespace = containerNamespace;
            return this;
        }

        /**
         * ContainerRepository.
         */
        public Builder containerRepository(String containerRepository) {
            this.putQueryParameter("ContainerRepository", containerRepository);
            this.containerRepository = containerRepository;
            return this;
        }

        /**
         * ContainerTag.
         */
        public Builder containerTag(String containerTag) {
            this.putQueryParameter("ContainerTag", containerTag);
            this.containerTag = containerTag;
            return this;
        }

        /**
         * DataDisk.
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Frequency.
         */
        public Builder frequency(Integer frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceRamRole.
         */
        public Builder instanceRamRole(String instanceRamRole) {
            this.putQueryParameter("InstanceRamRole", instanceRamRole);
            this.instanceRamRole = instanceRamRole;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * LaunchTemplateId.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * LaunchTemplateVersion.
         */
        public Builder launchTemplateVersion(String launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * LicenseType.
         */
        public Builder licenseType(String licenseType) {
            this.putQueryParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
            return this;
        }

        /**
         * MaxNumberOfImageToKeep.
         */
        public Builder maxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
            this.putQueryParameter("MaxNumberOfImageToKeep", maxNumberOfImageToKeep);
            this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NetMode.
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReplicationParameters.
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
         * RunOnce.
         */
        public Builder runOnce(Boolean runOnce) {
            this.putQueryParameter("RunOnce", runOnce);
            this.runOnce = runOnce;
            return this;
        }

        /**
         * ScheduledStartTime.
         */
        public Builder scheduledStartTime(String scheduledStartTime) {
            this.putQueryParameter("ScheduledStartTime", scheduledStartTime);
            this.scheduledStartTime = scheduledStartTime;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SystemDiskPart.
         */
        public Builder systemDiskPart(java.util.List < SystemDiskPart> systemDiskPart) {
            this.putQueryParameter("SystemDiskPart", systemDiskPart);
            this.systemDiskPart = systemDiskPart;
            return this;
        }

        /**
         * SystemDiskSize.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * ValidTime.
         */
        public Builder validTime(String validTime) {
            this.putQueryParameter("ValidTime", validTime);
            this.validTime = validTime;
            return this;
        }

        /**
         * VpcId.
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
        @NameInMap("Block")
        private Boolean block;

        @NameInMap("Device")
        private String device;

        @NameInMap("SizeBytes")
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
             * Block.
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * SizeBytes.
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
        @NameInMap("Index")
        private Integer index;

        @NameInMap("Part")
        private java.util.List < Part> part;

        @NameInMap("Size")
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
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Part.
             */
            public Builder part(java.util.List < Part> part) {
                this.part = part;
                return this;
            }

            /**
             * Size.
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
        @NameInMap("Block")
        private Boolean block;

        @NameInMap("Device")
        private String device;

        @NameInMap("SizeBytes")
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
             * Block.
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * SizeBytes.
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
