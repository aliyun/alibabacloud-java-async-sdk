// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link ListFileSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileSystemsResponseBody</p>
 */
public class ListFileSystemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileSystems")
    private java.util.List<FileSystems> fileSystems;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListFileSystemsResponseBody(Builder builder) {
        this.fileSystems = builder.fileSystems;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileSystemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystems
     */
    public java.util.List<FileSystems> getFileSystems() {
        return this.fileSystems;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<FileSystems> fileSystems; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListFileSystemsResponseBody model) {
            this.fileSystems = model.fileSystems;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The collection of file system information.</p>
         */
        public Builder fileSystems(java.util.List<FileSystems> fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }

        /**
         * <p>tCSKxtX5z_fW0-Q0ug8Df1oSXGiamAjmrtaDFAj6sZW-YhN1lRC7TEIkcFfMuj-6uR9wSW4b_PS2ze70k269qy8bMVHDfRW0Tvhmyh-k47g</p>
         * 
         * <strong>example:</strong>
         * <p>tCSKxtX5z_fW0-Q0ug8Df1oSXGiamAjmrtaDFAj6sZW-YhN1lRC7TEIkcFfMuj-6uR9wSW4b_PS2ze70k269qy8bMVHDfRW0Tvhmyh-****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFileSystemsResponseBody build() {
            return new ListFileSystemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileSystemsResponseBody</p>
     */
    public static class FileSystems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FileSystemName")
        private String fileSystemName;

        @com.aliyun.core.annotation.NameInMap("MeteringMode")
        private String meteringMode;

        @com.aliyun.core.annotation.NameInMap("MeteringSpaceSize")
        private Float meteringSpaceSize;

        @com.aliyun.core.annotation.NameInMap("MountPointCount")
        private Long mountPointCount;

        @com.aliyun.core.annotation.NameInMap("NumberOfDirectories")
        private Long numberOfDirectories;

        @com.aliyun.core.annotation.NameInMap("NumberOfFiles")
        private Long numberOfFiles;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("ProvisionedThroughputInMiBps")
        private Long provisionedThroughputInMiBps;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SpaceCapacity")
        private Long spaceCapacity;

        @com.aliyun.core.annotation.NameInMap("StoragePackageId")
        private String storagePackageId;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("ThroughputMode")
        private String throughputMode;

        @com.aliyun.core.annotation.NameInMap("UsedSpaceSize")
        private Float usedSpaceSize;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private FileSystems(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemName = builder.fileSystemName;
            this.meteringMode = builder.meteringMode;
            this.meteringSpaceSize = builder.meteringSpaceSize;
            this.mountPointCount = builder.mountPointCount;
            this.numberOfDirectories = builder.numberOfDirectories;
            this.numberOfFiles = builder.numberOfFiles;
            this.protocolType = builder.protocolType;
            this.provisionedThroughputInMiBps = builder.provisionedThroughputInMiBps;
            this.regionId = builder.regionId;
            this.spaceCapacity = builder.spaceCapacity;
            this.storagePackageId = builder.storagePackageId;
            this.storageType = builder.storageType;
            this.throughputMode = builder.throughputMode;
            this.usedSpaceSize = builder.usedSpaceSize;
            this.version = builder.version;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystems create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return fileSystemName
         */
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        /**
         * @return meteringMode
         */
        public String getMeteringMode() {
            return this.meteringMode;
        }

        /**
         * @return meteringSpaceSize
         */
        public Float getMeteringSpaceSize() {
            return this.meteringSpaceSize;
        }

        /**
         * @return mountPointCount
         */
        public Long getMountPointCount() {
            return this.mountPointCount;
        }

        /**
         * @return numberOfDirectories
         */
        public Long getNumberOfDirectories() {
            return this.numberOfDirectories;
        }

        /**
         * @return numberOfFiles
         */
        public Long getNumberOfFiles() {
            return this.numberOfFiles;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return provisionedThroughputInMiBps
         */
        public Long getProvisionedThroughputInMiBps() {
            return this.provisionedThroughputInMiBps;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return spaceCapacity
         */
        public Long getSpaceCapacity() {
            return this.spaceCapacity;
        }

        /**
         * @return storagePackageId
         */
        public String getStoragePackageId() {
            return this.storagePackageId;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return throughputMode
         */
        public String getThroughputMode() {
            return this.throughputMode;
        }

        /**
         * @return usedSpaceSize
         */
        public Float getUsedSpaceSize() {
            return this.usedSpaceSize;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String fileSystemId; 
            private String fileSystemName; 
            private String meteringMode; 
            private Float meteringSpaceSize; 
            private Long mountPointCount; 
            private Long numberOfDirectories; 
            private Long numberOfFiles; 
            private String protocolType; 
            private Long provisionedThroughputInMiBps; 
            private String regionId; 
            private Long spaceCapacity; 
            private String storagePackageId; 
            private String storageType; 
            private String throughputMode; 
            private Float usedSpaceSize; 
            private String version; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(FileSystems model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.fileSystemId = model.fileSystemId;
                this.fileSystemName = model.fileSystemName;
                this.meteringMode = model.meteringMode;
                this.meteringSpaceSize = model.meteringSpaceSize;
                this.mountPointCount = model.mountPointCount;
                this.numberOfDirectories = model.numberOfDirectories;
                this.numberOfFiles = model.numberOfFiles;
                this.protocolType = model.protocolType;
                this.provisionedThroughputInMiBps = model.provisionedThroughputInMiBps;
                this.regionId = model.regionId;
                this.spaceCapacity = model.spaceCapacity;
                this.storagePackageId = model.storagePackageId;
                this.storageType = model.storageType;
                this.throughputMode = model.throughputMode;
                this.usedSpaceSize = model.usedSpaceSize;
                this.version = model.version;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The creation time of the file system. The time is displayed in UTC and follows the ISO 8601 standard. Example: 2022-04-18T06:03:15.836222Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-18T06:03:15.836222Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>This is the first Apsara File Storage for HDFS instance of my company</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>37af8f42-2abc-4e74-889d-664f5163****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The name of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>MyFirstHDFS</p>
             */
            public Builder fileSystemName(String fileSystemName) {
                this.fileSystemName = fileSystemName;
                return this;
            }

            /**
             * <p>The billing method of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>UsageBased,CapacityBased</p>
             */
            public Builder meteringMode(String meteringMode) {
                this.meteringMode = meteringMode;
                return this;
            }

            /**
             * <p>The billable capacity of the file system. Unit: bytes.
             * Billable capacity = MAX [(Number of files + Number of directories) × 5 MiB, Used capacity].
             * This is statistical data and is for reference only, and is not used for billing. Apsara File Storage for HDFS is billed based on the peak billable capacity of the previous hour. For more detailed metering data, see <a href="https://help.aliyun.com/document_detail/419001.html">View billing details</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>107374182400</p>
             */
            public Builder meteringSpaceSize(Float meteringSpaceSize) {
                this.meteringSpaceSize = meteringSpaceSize;
                return this;
            }

            /**
             * <p>The number of mount points.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder mountPointCount(Long mountPointCount) {
                this.mountPointCount = mountPointCount;
                return this;
            }

            /**
             * <p>The number of directories.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder numberOfDirectories(Long numberOfDirectories) {
                this.numberOfDirectories = numberOfDirectories;
                return this;
            }

            /**
             * <p>The number of files.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder numberOfFiles(Long numberOfFiles) {
                this.numberOfFiles = numberOfFiles;
                return this;
            }

            /**
             * <p>The protocol type. Only Hadoop Distributed File System (HDFS) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>HDFS</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The provisioned throughput. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder provisionedThroughputInMiBps(Long provisionedThroughputInMiBps) {
                this.provisionedThroughputInMiBps = provisionedThroughputInMiBps;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The capacity of the file system. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder spaceCapacity(Long spaceCapacity) {
                this.spaceCapacity = spaceCapacity;
                return this;
            }

            /**
             * <p>The ID of the storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder storagePackageId(String storagePackageId) {
                this.storagePackageId = storagePackageId;
                return this;
            }

            /**
             * <p>The storage medium type. Valid values:</p>
             * <ul>
             * <li>STANDARD: standard</li>
             * <li>PERFORMANCE: performance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The throughput mode. Valid values:</p>
             * <ul>
             * <li>Standard: standard throughput</li>
             * <li>Provisioned: provisioned throughput</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder throughputMode(String throughputMode) {
                this.throughputMode = throughputMode;
                return this;
            }

            /**
             * <p>The used space of the file system. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder usedSpaceSize(Float usedSpaceSize) {
                this.usedSpaceSize = usedSpaceSize;
                return this;
            }

            /**
             * <p>The version of Apsara File Storage for HDFS. This is not the Hadoop version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public FileSystems build() {
                return new FileSystems(this);
            } 

        } 

    }
}
