// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReplicationJobAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyReplicationJobAttributeRequest</p>
 */
public class ModifyReplicationJobAttributeRequest extends Request {
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
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @Query
    @NameInMap("LaunchTemplateVersion")
    private String launchTemplateVersion;

    @Query
    @NameInMap("MaxNumberOfImageToKeep")
    private Integer maxNumberOfImageToKeep;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScheduledStartTime")
    private String scheduledStartTime;

    @Query
    @NameInMap("SystemDiskPart")
    private java.util.List < SystemDiskPart> systemDiskPart;

    @Query
    @NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    @Query
    @NameInMap("ValidTime")
    private String validTime;

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
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scheduledStartTime = builder.scheduledStartTime;
        this.systemDiskPart = builder.systemDiskPart;
        this.systemDiskSize = builder.systemDiskSize;
        this.targetType = builder.targetType;
        this.validTime = builder.validTime;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return validTime
     */
    public String getValidTime() {
        return this.validTime;
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
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String scheduledStartTime; 
        private java.util.List < SystemDiskPart> systemDiskPart; 
        private Integer systemDiskSize; 
        private String targetType; 
        private String validTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyReplicationJobAttributeRequest response) {
            super(response);
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
            this.jobId = response.jobId;
            this.launchTemplateId = response.launchTemplateId;
            this.launchTemplateVersion = response.launchTemplateVersion;
            this.maxNumberOfImageToKeep = response.maxNumberOfImageToKeep;
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scheduledStartTime = response.scheduledStartTime;
            this.systemDiskPart = response.systemDiskPart;
            this.systemDiskSize = response.systemDiskSize;
            this.targetType = response.targetType;
            this.validTime = response.validTime;
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * ScheduledStartTime.
         */
        public Builder scheduledStartTime(String scheduledStartTime) {
            this.putQueryParameter("ScheduledStartTime", scheduledStartTime);
            this.scheduledStartTime = scheduledStartTime;
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
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
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

        @Override
        public ModifyReplicationJobAttributeRequest build() {
            return new ModifyReplicationJobAttributeRequest(this);
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
}
