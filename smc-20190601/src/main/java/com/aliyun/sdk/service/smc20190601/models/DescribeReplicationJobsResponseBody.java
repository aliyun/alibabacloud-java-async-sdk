// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReplicationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReplicationJobsResponseBody</p>
 */
public class DescribeReplicationJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ReplicationJobs")
    private ReplicationJobs replicationJobs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The details of migration jobs.
         */
        public Builder replicationJobs(ReplicationJobs replicationJobs) {
            this.replicationJobs = replicationJobs;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of migration jobs returned.
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
             * Indicates whether block replication is enabled for the data disk partition.
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * The device ID of the data disk partition.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The size of the data disk partition. Unit: bytes.
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
        @com.aliyun.core.annotation.NameInMap("Part")
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
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Parts")
        private Parts parts;

        @com.aliyun.core.annotation.NameInMap("Size")
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
             * The index number of the data disk.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * The data disk partitions.
             */
            public Builder parts(Parts parts) {
                this.parts = parts;
                return this;
            }

            /**
             * The size of the data disk. Unit: GiB.
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
        @com.aliyun.core.annotation.NameInMap("DataDisk")
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
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * The time when the migration job ended. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             * <p>
             * 
             * >  The time displayed in the SMC console is in the format of UTC+8.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The ID of the destination image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The time when the migration job was started. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             * <p>
             * 
             * >  The time displayed in the SMC console is in the format of UTC+8.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The method used to run the migration job. Valid values:
             * <p>
             * 
             * *   Manual: The migration job was manually started.
             * *   Schedule: The migration job was started at a scheduled time or at a specific interval.
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
        @com.aliyun.core.annotation.NameInMap("ReplicationJobRun")
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
             * Indicates whether block replication is enabled for the system disk partition.
             */
            public Builder block(Boolean block) {
                this.block = block;
                return this;
            }

            /**
             * The device ID of the system disk partition.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The size of the system disk partition. Unit: bytes.
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
        @com.aliyun.core.annotation.NameInMap("SystemDiskPart")
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
             * The key of the tag N that is added to the SMC resource. Valid values of N: 1 to 20.
             * <p>
             * 
             * The tag key can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.[](http://https://。)
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N that is added to the SMC resource. Valid values of N: 1 to 20.
             * <p>
             * 
             * The tag value can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.[](http://https://。)
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ReplicationJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("ContainerNamespace")
        private String containerNamespace;

        @com.aliyun.core.annotation.NameInMap("ContainerRepository")
        private String containerRepository;

        @com.aliyun.core.annotation.NameInMap("ContainerTag")
        private String containerTag;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private DataDisks dataDisks;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Frequency")
        private Integer frequency;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceRamRole")
        private String instanceRamRole;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private Integer jobType;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("LicenseType")
        private String licenseType;

        @com.aliyun.core.annotation.NameInMap("MaxNumberOfImageToKeep")
        private Integer maxNumberOfImageToKeep;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetMode")
        private Integer netMode;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Float progress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReplicationJobRuns")
        private ReplicationJobRuns replicationJobRuns;

        @com.aliyun.core.annotation.NameInMap("ReplicationParameters")
        private String replicationParameters;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RunOnce")
        private Boolean runOnce;

        @com.aliyun.core.annotation.NameInMap("ScheduledStartTime")
        private String scheduledStartTime;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusInfo")
        private String statusInfo;

        @com.aliyun.core.annotation.NameInMap("SystemDiskParts")
        private SystemDiskParts systemDiskParts;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TransitionInstanceId")
        private String transitionInstanceId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ValidTime")
        private String validTime;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
            this.jobType = builder.jobType;
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
            this.resourceGroupId = builder.resourceGroupId;
            this.runOnce = builder.runOnce;
            this.scheduledStartTime = builder.scheduledStartTime;
            this.sourceId = builder.sourceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusInfo = builder.statusInfo;
            this.systemDiskParts = builder.systemDiskParts;
            this.systemDiskSize = builder.systemDiskSize;
            this.tags = builder.tags;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
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
            private Integer jobType; 
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
            private String resourceGroupId; 
            private Boolean runOnce; 
            private String scheduledStartTime; 
            private String sourceId; 
            private String startTime; 
            private String status; 
            private String statusInfo; 
            private SystemDiskParts systemDiskParts; 
            private Integer systemDiskSize; 
            private Tags tags; 
            private String targetType; 
            private String transitionInstanceId; 
            private String vSwitchId; 
            private String validTime; 
            private String vpcId; 

            /**
             * The business status of the migration job. Valid values:
             * <p>
             * 
             * *   Preparing: The migration is being prepared.
             * *   Syncing: Data is being synchronized.
             * *   Processing: The migration is in progress.
             * *   Cleaning: Intermediate resources are being released.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The namespace of the destination Docker container image.
             */
            public Builder containerNamespace(String containerNamespace) {
                this.containerNamespace = containerNamespace;
                return this;
            }

            /**
             * The repository that stores the destination Docker container image.
             */
            public Builder containerRepository(String containerRepository) {
                this.containerRepository = containerRepository;
                return this;
            }

            /**
             * The tag of the destination Docker container image.
             */
            public Builder containerTag(String containerTag) {
                this.containerTag = containerTag;
                return this;
            }

            /**
             * The time when the migration job was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The data disks on the destination ECS instance.
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * The description of the migration job.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the migration job was complete. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             * <p>
             * 
             * >  The time displayed in the SMC console is in the format of UTC+8.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The error code returned if an error occurred in the migration job.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The interval at which the incremental migration job runs. Unit: hour. Valid values: 1 to 168.
             */
            public Builder frequency(Integer frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * The ID of the destination image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The name of the destination image.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The ID of the destination ECS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the Resource Access Management (RAM) role that is assigned to the instance.
             */
            public Builder instanceRamRole(String instanceRamRole) {
                this.instanceRamRole = instanceRamRole;
                return this;
            }

            /**
             * The instance type of the intermediate instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The ID of the migration job.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
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
                this.jobType = jobType;
                return this;
            }

            /**
             * The ID of the launch template.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * The versions of the launch template.
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * The type of license for the migration job. Valid values:
             * <p>
             * 
             * *   An empty value indicates no license.
             * *   A value of BYOL indicates Bring Your Own License (BYOL).
             */
            public Builder licenseType(String licenseType) {
                this.licenseType = licenseType;
                return this;
            }

            /**
             * The maximum number of images retained for the incremental migration job. Valid values: 1 to 10.
             */
            public Builder maxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
                this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
                return this;
            }

            /**
             * The name of the migration job.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of network used for the migration.
             */
            public Builder netMode(Integer netMode) {
                this.netMode = netMode;
                return this;
            }

            /**
             * The progress of the migration job.
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud region to which the source server is migrated.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The execution records of the migration job.
             */
            public Builder replicationJobRuns(ReplicationJobRuns replicationJobRuns) {
                this.replicationJobRuns = replicationJobRuns;
                return this;
            }

            /**
             * The string of key-value pairs configured for the replication driver.
             */
            public Builder replicationParameters(String replicationParameters) {
                this.replicationParameters = replicationParameters;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether incremental migration is disabled for the source server. Valid values:
             * <p>
             * 
             * *   true: Incremental migration is disabled. A migration job runs only once after the job is created.
             * *   false: Incremental migration is enabled. For an incremental migration job, SMC synchronizes incremental data to Alibaba Cloud at the interval specified by the `Frequency` parameter.
             */
            public Builder runOnce(Boolean runOnce) {
                this.runOnce = runOnce;
                return this;
            }

            /**
             * The time when the migration job is scheduled to run. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. The time must meet the following requirements:
             * <p>
             * 
             * *   The value must be within 30 days after the current time.
             * *   If you do not specify this parameter, you must manually start the migration job after the migration job is created. You can call the [StartReplicationJob](~~121823~~) operation to start the migration job.
             */
            public Builder scheduledStartTime(String scheduledStartTime) {
                this.scheduledStartTime = scheduledStartTime;
                return this;
            }

            /**
             * The ID of the source server.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * The time when the migration job was started. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             * <p>
             * 
             * >  The time displayed in the SMC console is in the format of UTC+8.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the migration job. Valid values:
             * <p>
             * 
             * *   Ready: The migration job is not started.
             * *   Running: The migration job is running.
             * *   Stopped: The migration job is paused.
             * *   InError: An error occurs in the migration job.
             * *   Finished: The migration job is complete.
             * *   Waiting: The migration job is waiting to run.
             * *   Expired: The migration job has expired.
             * *   Deleting: The migration job is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The status information about the migration job.
             */
            public Builder statusInfo(String statusInfo) {
                this.statusInfo = statusInfo;
                return this;
            }

            /**
             * The system disk partitions.
             */
            public Builder systemDiskParts(SystemDiskParts systemDiskParts) {
                this.systemDiskParts = systemDiskParts;
                return this;
            }

            /**
             * The size of the system disk of the destination ECS instance.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The information about tags that are attached to the SMC resource.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of destination to which the source server is migrated. Valid values:
             * <p>
             * 
             * *   Image: After the migration job is complete, SMC generates an ECS image for the source server.
             * *   ContainerImage: After the migration job is complete, SMC generates a Docker container image for the source server.
             * *   TargetInstance: After the migration job is complete, SMC migrates the source server to the destination instance. If you set this parameter to TargetInstance, you must set the InstanceId parameter.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The ID of the intermediate instance.
             */
            public Builder transitionInstanceId(String transitionInstanceId) {
                this.transitionInstanceId = transitionInstanceId;
                return this;
            }

            /**
             * The ID of the vSwitch in the specified VPC.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The time when the migration job expired. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             * <p>
             * 
             * >  The time displayed in the SMC console is in the format of UTC+8.
             */
            public Builder validTime(String validTime) {
                this.validTime = validTime;
                return this;
            }

            /**
             * The ID of a virtual private cloud (VPC) for which you have configured an Express Connect circuit or a VPN gateway.
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
        @com.aliyun.core.annotation.NameInMap("ReplicationJob")
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
