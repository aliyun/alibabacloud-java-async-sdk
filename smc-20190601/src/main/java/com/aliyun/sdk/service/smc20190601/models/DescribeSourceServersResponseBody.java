// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSourceServersResponseBody</p>
 */
public class DescribeSourceServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceServers")
    private SourceServers sourceServers;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSourceServersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sourceServers = builder.sourceServers;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSourceServersResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceServers
     */
    public SourceServers getSourceServers() {
        return this.sourceServers;
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
        private String requestId; 
        private SourceServers sourceServers; 
        private Integer totalCount; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The information about migration sources.
         */
        public Builder sourceServers(SourceServers sourceServers) {
            this.sourceServers = sourceServers;
            return this;
        }

        /**
         * The total number of migration sources returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSourceServersResponseBody build() {
            return new DescribeSourceServersResponseBody(this);
        } 

    } 

    public static class Part extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanBlock")
        private Boolean canBlock;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("Need")
        private Boolean need;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        private Part(Builder builder) {
            this.canBlock = builder.canBlock;
            this.device = builder.device;
            this.need = builder.need;
            this.path = builder.path;
            this.sizeBytes = builder.sizeBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Part create() {
            return builder().build();
        }

        /**
         * @return canBlock
         */
        public Boolean getCanBlock() {
            return this.canBlock;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return need
         */
        public Boolean getNeed() {
            return this.need;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public static final class Builder {
            private Boolean canBlock; 
            private String device; 
            private Boolean need; 
            private String path; 
            private Long sizeBytes; 

            /**
             * Indicates whether block replication is enabled for the data disk partition.
             */
            public Builder canBlock(Boolean canBlock) {
                this.canBlock = canBlock;
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
             * Indicates whether the data disk partition must be selected.
             */
            public Builder need(Boolean need) {
                this.need = need;
                return this;
            }

            /**
             * The path of the data disk partition.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The size of the data disk partition. Unit: byte.
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

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private DataDisk(Builder builder) {
            this.index = builder.index;
            this.parts = builder.parts;
            this.path = builder.path;
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
         * @return path
         */
        public String getPath() {
            return this.path;
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
            private String path; 
            private Integer size; 

            /**
             * The index number of the data disk.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * The information about the data disk partition.
             */
            public Builder parts(Parts parts) {
                this.parts = parts;
                return this;
            }

            /**
             * The path of the data disk.
             */
            public Builder path(String path) {
                this.path = path;
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
    public static class SystemDiskPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanBlock")
        private Boolean canBlock;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("Need")
        private Boolean need;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("SizeBytes")
        private Long sizeBytes;

        private SystemDiskPart(Builder builder) {
            this.canBlock = builder.canBlock;
            this.device = builder.device;
            this.need = builder.need;
            this.path = builder.path;
            this.sizeBytes = builder.sizeBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDiskPart create() {
            return builder().build();
        }

        /**
         * @return canBlock
         */
        public Boolean getCanBlock() {
            return this.canBlock;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return need
         */
        public Boolean getNeed() {
            return this.need;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public static final class Builder {
            private Boolean canBlock; 
            private String device; 
            private Boolean need; 
            private String path; 
            private Long sizeBytes; 

            /**
             * Indicates whether block replication is enabled for the system disk partition.
             */
            public Builder canBlock(Boolean canBlock) {
                this.canBlock = canBlock;
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
             * Indicates whether the system disk partition must be selected.
             */
            public Builder need(Boolean need) {
                this.need = need;
                return this;
            }

            /**
             * The path of the system disk partition.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The size of the system disk partition. Unit: byte.
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
             * The key of tag N that is added to the SMC resource. Valid values of N: 1 to 20
             * <p>
             * 
             * You cannot specify empty strings as tag keys. It can be up to 64 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N that is added to the SMC resource. Valid values of N: 1 to 20
             * <p>
             * 
             * The tag key can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.
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
    public static class SourceServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private DataDisks dataDisks;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HeartbeatRate")
        private Integer heartbeatRate;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("KernelLevel")
        private Integer kernelLevel;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ReplicationDriver")
        private String replicationDriver;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StatusInfo")
        private String statusInfo;

        @com.aliyun.core.annotation.NameInMap("SystemDiskParts")
        private SystemDiskParts systemDiskParts;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("SystemInfo")
        private String systemInfo;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private SourceServer(Builder builder) {
            this.agentVersion = builder.agentVersion;
            this.architecture = builder.architecture;
            this.creationTime = builder.creationTime;
            this.dataDisks = builder.dataDisks;
            this.description = builder.description;
            this.errorCode = builder.errorCode;
            this.heartbeatRate = builder.heartbeatRate;
            this.jobId = builder.jobId;
            this.kernelLevel = builder.kernelLevel;
            this.name = builder.name;
            this.platform = builder.platform;
            this.replicationDriver = builder.replicationDriver;
            this.resourceGroupId = builder.resourceGroupId;
            this.sourceId = builder.sourceId;
            this.state = builder.state;
            this.statusInfo = builder.statusInfo;
            this.systemDiskParts = builder.systemDiskParts;
            this.systemDiskSize = builder.systemDiskSize;
            this.systemInfo = builder.systemInfo;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceServer create() {
            return builder().build();
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
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
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return heartbeatRate
         */
        public Integer getHeartbeatRate() {
            return this.heartbeatRate;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return kernelLevel
         */
        public Integer getKernelLevel() {
            return this.kernelLevel;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return replicationDriver
         */
        public String getReplicationDriver() {
            return this.replicationDriver;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
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
         * @return systemInfo
         */
        public String getSystemInfo() {
            return this.systemInfo;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String agentVersion; 
            private String architecture; 
            private String creationTime; 
            private DataDisks dataDisks; 
            private String description; 
            private String errorCode; 
            private Integer heartbeatRate; 
            private String jobId; 
            private Integer kernelLevel; 
            private String name; 
            private String platform; 
            private String replicationDriver; 
            private String resourceGroupId; 
            private String sourceId; 
            private String state; 
            private String statusInfo; 
            private SystemDiskParts systemDiskParts; 
            private Integer systemDiskSize; 
            private String systemInfo; 
            private Tags tags; 

            /**
             * The version number of the SMC client.
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * The system architecture of the migration source.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * The time when the migration source was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The data disk on the migration source.
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * The description of the migration source.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The error code of the migration source.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The interval at which heartbeats are sent from the SMC client. Unit: seconds.
             */
            public Builder heartbeatRate(Integer heartbeatRate) {
                this.heartbeatRate = heartbeatRate;
                return this;
            }

            /**
             * The ID of the last migration job.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The kernel level of the migration source.
             */
            public Builder kernelLevel(Integer kernelLevel) {
                this.kernelLevel = kernelLevel;
                return this;
            }

            /**
             * The name of the migration source.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The operating system of the migration source.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The replication driver used for migration. Default value: SMT.
             */
            public Builder replicationDriver(String replicationDriver) {
                this.replicationDriver = replicationDriver;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the migration source.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * The state of the migration source.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The status information of the migration source. This parameter is returned if the migration source is in the Unavailable state. The value of this parameter consists of key-value pairs in the JSON format. Sample keys:
             * <p>
             * 
             *     error_code: the error code.error_msg: the error message.
             */
            public Builder statusInfo(String statusInfo) {
                this.statusInfo = statusInfo;
                return this;
            }

            /**
             * The information about the system disk partition.
             */
            public Builder systemDiskParts(SystemDiskParts systemDiskParts) {
                this.systemDiskParts = systemDiskParts;
                return this;
            }

            /**
             * The system disk size of the migration source. Unit: GiB.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The system information of the migration source. The value of this parameter consists of key-value pairs in the JSON format. The key-value pairs are extensible and have fixed keys. The JSON string does not exceed 1 KB in size. Sample keys:
             * <p>
             * 
             *     agent_mode: The migration mode.
             *     agent_type: The migration type.
             *     client_type: The client type.
             *     hostname: The host name.
             *     ipv4: The IPv4 address.
             *     ipv6: The IPv6 address.
             *     .cores: The number of CPU cores.
             *     cpu_usage: The CPU utilization.
             *     memory: The memory size.
             *     memory_usage: The memory usage.
             */
            public Builder systemInfo(String systemInfo) {
                this.systemInfo = systemInfo;
                return this;
            }

            /**
             * The information about the tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public SourceServer build() {
                return new SourceServer(this);
            } 

        } 

    }
    public static class SourceServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceServer")
        private java.util.List < SourceServer> sourceServer;

        private SourceServers(Builder builder) {
            this.sourceServer = builder.sourceServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceServers create() {
            return builder().build();
        }

        /**
         * @return sourceServer
         */
        public java.util.List < SourceServer> getSourceServer() {
            return this.sourceServer;
        }

        public static final class Builder {
            private java.util.List < SourceServer> sourceServer; 

            /**
             * SourceServer.
             */
            public Builder sourceServer(java.util.List < SourceServer> sourceServer) {
                this.sourceServer = sourceServer;
                return this;
            }

            public SourceServers build() {
                return new SourceServers(this);
            } 

        } 

    }
}
