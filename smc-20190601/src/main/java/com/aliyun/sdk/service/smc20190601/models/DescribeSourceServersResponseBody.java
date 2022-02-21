// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSourceServersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSourceServersResponseBody</p>
 */
public class DescribeSourceServersResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceServers")
    private SourceServers sourceServers;

    @NameInMap("TotalCount")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SourceServers.
         */
        public Builder sourceServers(SourceServers sourceServers) {
            this.sourceServers = sourceServers;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("CanBlock")
        private Boolean canBlock;

        @NameInMap("Device")
        private String device;

        @NameInMap("Need")
        private Boolean need;

        @NameInMap("Path")
        private String path;

        @NameInMap("SizeBytes")
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
             * CanBlock.
             */
            public Builder canBlock(Boolean canBlock) {
                this.canBlock = canBlock;
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
             * Need.
             */
            public Builder need(Boolean need) {
                this.need = need;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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

        @NameInMap("Path")
        private String path;

        @NameInMap("Size")
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
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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
    public static class SystemDiskPart extends TeaModel {
        @NameInMap("CanBlock")
        private Boolean canBlock;

        @NameInMap("Device")
        private String device;

        @NameInMap("Need")
        private Boolean need;

        @NameInMap("Path")
        private String path;

        @NameInMap("SizeBytes")
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
             * CanBlock.
             */
            public Builder canBlock(Boolean canBlock) {
                this.canBlock = canBlock;
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
             * Need.
             */
            public Builder need(Boolean need) {
                this.need = need;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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
    public static class SourceServer extends TeaModel {
        @NameInMap("AgentVersion")
        private String agentVersion;

        @NameInMap("Architecture")
        private String architecture;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DataDisks")
        private DataDisks dataDisks;

        @NameInMap("Description")
        private String description;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("HeartbeatRate")
        private Integer heartbeatRate;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("KernelLevel")
        private Integer kernelLevel;

        @NameInMap("Name")
        private String name;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("ReplicationDriver")
        private String replicationDriver;

        @NameInMap("SourceId")
        private String sourceId;

        @NameInMap("State")
        private String state;

        @NameInMap("StatusInfo")
        private String statusInfo;

        @NameInMap("SystemDiskParts")
        private SystemDiskParts systemDiskParts;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("SystemInfo")
        private String systemInfo;

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
            this.sourceId = builder.sourceId;
            this.state = builder.state;
            this.statusInfo = builder.statusInfo;
            this.systemDiskParts = builder.systemDiskParts;
            this.systemDiskSize = builder.systemDiskSize;
            this.systemInfo = builder.systemInfo;
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
            private String sourceId; 
            private String state; 
            private String statusInfo; 
            private SystemDiskParts systemDiskParts; 
            private Integer systemDiskSize; 
            private String systemInfo; 

            /**
             * AgentVersion.
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * Architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * HeartbeatRate.
             */
            public Builder heartbeatRate(Integer heartbeatRate) {
                this.heartbeatRate = heartbeatRate;
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
             * KernelLevel.
             */
            public Builder kernelLevel(Integer kernelLevel) {
                this.kernelLevel = kernelLevel;
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
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * ReplicationDriver.
             */
            public Builder replicationDriver(String replicationDriver) {
                this.replicationDriver = replicationDriver;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
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
             * SystemInfo.
             */
            public Builder systemInfo(String systemInfo) {
                this.systemInfo = systemInfo;
                return this;
            }

            public SourceServer build() {
                return new SourceServer(this);
            } 

        } 

    }
    public static class SourceServers extends TeaModel {
        @NameInMap("SourceServer")
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
