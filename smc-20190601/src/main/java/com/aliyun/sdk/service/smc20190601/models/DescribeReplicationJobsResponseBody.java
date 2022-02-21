// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReplicationJobsResponseBody</p>
 */
public class DescribeReplicationJobsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("ReplicationJobs")
    private ReplicationJobs replicationJobs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeReplicationJobsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.replicationJobs = builder.replicationJobs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReplicationJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return replicationJobs
     */
    public ReplicationJobs getReplicationJobs() {
        return this.replicationJobs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private ReplicationJobs replicationJobs; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ReplicationJobs.
         */
        public Builder replicationJobs(ReplicationJobs replicationJobs) {
            this.replicationJobs = replicationJobs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeReplicationJobsResponseBody build() {
            return new DescribeReplicationJobsResponseBody(this);
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
    public static class Parts extends TeaModel {
        @NameInMap("Part")
        private java.util.List < Part> part;

        private Parts(Builder builder) {
            this.part = builder.part;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parts create() {
            return builder().build();
        }

        /**
         * @return part
         */
        public java.util.List < Part> getPart() {
            return this.part;
        }

        public static final class Builder {
            private java.util.List < Part> part; 

            /**
             * Part.
             */
            public Builder part(java.util.List < Part> part) {
                this.part = part;
                return this;
            }

            public Parts build() {
                return new Parts(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
        @NameInMap("Index")
        private Integer index;

        @NameInMap("Parts")
        private Parts parts;

        @NameInMap("Size")
        private Integer size;

        private DataDisk(Builder builder) {
            this.index = builder.index;
            this.parts = builder.parts;
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
         * @return parts
         */
        public Parts getParts() {
            return this.parts;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer index; 
            private Parts parts; 
            private Integer size; 

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Parts.
             */
            public Builder parts(Parts parts) {
                this.parts = parts;
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
    public static class DataDisks extends TeaModel {
        @NameInMap("DataDisk")
        private java.util.List < DataDisk> dataDisk;

        private DataDisks(Builder builder) {
            this.dataDisk = builder.dataDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisks create() {
            return builder().build();
        }

        /**
         * @return dataDisk
         */
        public java.util.List < DataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public static final class Builder {
            private java.util.List < DataDisk> dataDisk; 

            /**
             * DataDisk.
             */
            public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    public static class ReplicationJobRun extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Type")
        private String type;

        private ReplicationJobRun(Builder builder) {
            this.endTime = builder.endTime;
            this.imageId = builder.imageId;
            this.startTime = builder.startTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicationJobRun create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String endTime; 
            private String imageId; 
            private String startTime; 
            private String type; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ReplicationJobRun build() {
                return new ReplicationJobRun(this);
            } 

        } 

    }
    public static class ReplicationJobRuns extends TeaModel {
        @NameInMap("ReplicationJobRun")
        private java.util.List < ReplicationJobRun> replicationJobRun;

        private ReplicationJobRuns(Builder builder) {
            this.replicationJobRun = builder.replicationJobRun;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicationJobRuns create() {
            return builder().build();
        }

        /**
         * @return replicationJobRun
         */
        public java.util.List < ReplicationJobRun> getReplicationJobRun() {
            return this.replicationJobRun;
        }

        public static final class Builder {
            private java.util.List < ReplicationJobRun> replicationJobRun; 

            /**
             * ReplicationJobRun.
             */
            public Builder replicationJobRun(java.util.List < ReplicationJobRun> replicationJobRun) {
                this.replicationJobRun = replicationJobRun;
                return this;
            }

            public ReplicationJobRuns build() {
                return new ReplicationJobRuns(this);
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
    public static class SystemDiskParts extends TeaModel {
        @NameInMap("SystemDiskPart")
        private java.util.List < SystemDiskPart> systemDiskPart;

        private SystemDiskParts(Builder builder) {
            this.systemDiskPart = builder.systemDiskPart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDiskParts create() {
            return builder().build();
        }

        /**
         * @return systemDiskPart
         */
        public java.util.List < SystemDiskPart> getSystemDiskPart() {
            return this.systemDiskPart;
        }

        public static final class Builder {
            private java.util.List < SystemDiskPart> systemDiskPart; 

            /**
             * SystemDiskPart.
             */
            public Builder systemDiskPart(java.util.List < SystemDiskPart> systemDiskPart) {
                this.systemDiskPart = systemDiskPart;
                return this;
            }

            public SystemDiskParts build() {
                return new SystemDiskParts(this);
            } 

        } 

    }
    public static class ReplicationJob extends TeaModel {
        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("ContainerNamespace")
        private String containerNamespace;

        @NameInMap("ContainerRepository")
        private String containerRepository;

        @NameInMap("ContainerTag")
        private String containerTag;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DataDisks")
        private DataDisks dataDisks;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("Frequency")
        private Integer frequency;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceRamRole")
        private String instanceRamRole;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @NameInMap("LicenseType")
        private String licenseType;

        @NameInMap("MaxNumberOfImageToKeep")
        private Integer maxNumberOfImageToKeep;

        @NameInMap("Name")
        private String name;

        @NameInMap("NetMode")
        private Integer netMode;

        @NameInMap("Progress")
        private Float progress;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ReplicationJobRuns")
        private ReplicationJobRuns replicationJobRuns;

        @NameInMap("ReplicationParameters")
        private String replicationParameters;

        @NameInMap("RunOnce")
        private Boolean runOnce;

        @NameInMap("ScheduledStartTime")
        private String scheduledStartTime;

        @NameInMap("SourceId")
        private String sourceId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusInfo")
        private String statusInfo;

        @NameInMap("SystemDiskParts")
        private SystemDiskParts systemDiskParts;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("TransitionInstanceId")
        private String transitionInstanceId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ValidTime")
        private String validTime;

        @NameInMap("VpcId")
        private String vpcId;

        private ReplicationJob(Builder builder) {
            this.businessStatus = builder.businessStatus;
            this.containerNamespace = builder.containerNamespace;
            this.containerRepository = builder.containerRepository;
            this.containerTag = builder.containerTag;
            this.creationTime = builder.creationTime;
            this.dataDisks = builder.dataDisks;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.errorCode = builder.errorCode;
            this.frequency = builder.frequency;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.instanceId = builder.instanceId;
            this.instanceRamRole = builder.instanceRamRole;
            this.instanceType = builder.instanceType;
            this.jobId = builder.jobId;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateVersion = builder.launchTemplateVersion;
            this.licenseType = builder.licenseType;
            this.maxNumberOfImageToKeep = builder.maxNumberOfImageToKeep;
            this.name = builder.name;
            this.netMode = builder.netMode;
            this.progress = builder.progress;
            this.regionId = builder.regionId;
            this.replicationJobRuns = builder.replicationJobRuns;
            this.replicationParameters = builder.replicationParameters;
            this.runOnce = builder.runOnce;
            this.scheduledStartTime = builder.scheduledStartTime;
            this.sourceId = builder.sourceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusInfo = builder.statusInfo;
            this.systemDiskParts = builder.systemDiskParts;
            this.systemDiskSize = builder.systemDiskSize;
            this.targetType = builder.targetType;
            this.transitionInstanceId = builder.transitionInstanceId;
            this.vSwitchId = builder.vSwitchId;
            this.validTime = builder.validTime;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicationJob create() {
            return builder().build();
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataDisks
         */
        public DataDisks getDataDisks() {
            return this.dataDisks;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return frequency
         */
        public Integer getFrequency() {
            return this.frequency;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
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
         * @return progress
         */
        public Float getProgress() {
            return this.progress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return replicationJobRuns
         */
        public ReplicationJobRuns getReplicationJobRuns() {
            return this.replicationJobRuns;
        }

        /**
         * @return replicationParameters
         */
        public String getReplicationParameters() {
            return this.replicationParameters;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusInfo
         */
        public String getStatusInfo() {
            return this.statusInfo;
        }

        /**
         * @return systemDiskParts
         */
        public SystemDiskParts getSystemDiskParts() {
            return this.systemDiskParts;
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
         * @return transitionInstanceId
         */
        public String getTransitionInstanceId() {
            return this.transitionInstanceId;
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

        public static final class Builder {
            private String businessStatus; 
            private String containerNamespace; 
            private String containerRepository; 
            private String containerTag; 
            private String creationTime; 
            private DataDisks dataDisks; 
            private String description; 
            private String endTime; 
            private String errorCode; 
            private Integer frequency; 
            private String imageId; 
            private String imageName; 
            private String instanceId; 
            private String instanceRamRole; 
            private String instanceType; 
            private String jobId; 
            private String launchTemplateId; 
            private String launchTemplateVersion; 
            private String licenseType; 
            private Integer maxNumberOfImageToKeep; 
            private String name; 
            private Integer netMode; 
            private Float progress; 
            private String regionId; 
            private ReplicationJobRuns replicationJobRuns; 
            private String replicationParameters; 
            private Boolean runOnce; 
            private String scheduledStartTime; 
            private String sourceId; 
            private String startTime; 
            private String status; 
            private String statusInfo; 
            private SystemDiskParts systemDiskParts; 
            private Integer systemDiskSize; 
            private String targetType; 
            private String transitionInstanceId; 
            private String vSwitchId; 
            private String validTime; 
            private String vpcId; 

            /**
             * BusinessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * ContainerNamespace.
             */
            public Builder containerNamespace(String containerNamespace) {
                this.containerNamespace = containerNamespace;
                return this;
            }

            /**
             * ContainerRepository.
             */
            public Builder containerRepository(String containerRepository) {
                this.containerRepository = containerRepository;
                return this;
            }

            /**
             * ContainerTag.
             */
            public Builder containerTag(String containerTag) {
                this.containerTag = containerTag;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DataDisks.
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * Frequency.
             */
            public Builder frequency(Integer frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceRamRole.
             */
            public Builder instanceRamRole(String instanceRamRole) {
                this.instanceRamRole = instanceRamRole;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * LaunchTemplateId.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * LaunchTemplateVersion.
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * LicenseType.
             */
            public Builder licenseType(String licenseType) {
                this.licenseType = licenseType;
                return this;
            }

            /**
             * MaxNumberOfImageToKeep.
             */
            public Builder maxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
                this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NetMode.
             */
            public Builder netMode(Integer netMode) {
                this.netMode = netMode;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ReplicationJobRuns.
             */
            public Builder replicationJobRuns(ReplicationJobRuns replicationJobRuns) {
                this.replicationJobRuns = replicationJobRuns;
                return this;
            }

            /**
             * ReplicationParameters.
             */
            public Builder replicationParameters(String replicationParameters) {
                this.replicationParameters = replicationParameters;
                return this;
            }

            /**
             * RunOnce.
             */
            public Builder runOnce(Boolean runOnce) {
                this.runOnce = runOnce;
                return this;
            }

            /**
             * ScheduledStartTime.
             */
            public Builder scheduledStartTime(String scheduledStartTime) {
                this.scheduledStartTime = scheduledStartTime;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusInfo.
             */
            public Builder statusInfo(String statusInfo) {
                this.statusInfo = statusInfo;
                return this;
            }

            /**
             * SystemDiskParts.
             */
            public Builder systemDiskParts(SystemDiskParts systemDiskParts) {
                this.systemDiskParts = systemDiskParts;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * TransitionInstanceId.
             */
            public Builder transitionInstanceId(String transitionInstanceId) {
                this.transitionInstanceId = transitionInstanceId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ValidTime.
             */
            public Builder validTime(String validTime) {
                this.validTime = validTime;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ReplicationJob build() {
                return new ReplicationJob(this);
            } 

        } 

    }
    public static class ReplicationJobs extends TeaModel {
        @NameInMap("ReplicationJob")
        private java.util.List < ReplicationJob> replicationJob;

        private ReplicationJobs(Builder builder) {
            this.replicationJob = builder.replicationJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicationJobs create() {
            return builder().build();
        }

        /**
         * @return replicationJob
         */
        public java.util.List < ReplicationJob> getReplicationJob() {
            return this.replicationJob;
        }

        public static final class Builder {
            private java.util.List < ReplicationJob> replicationJob; 

            /**
             * ReplicationJob.
             */
            public Builder replicationJob(java.util.List < ReplicationJob> replicationJob) {
                this.replicationJob = replicationJob;
                return this;
            }

            public ReplicationJobs build() {
                return new ReplicationJobs(this);
            } 

        } 

    }
}
