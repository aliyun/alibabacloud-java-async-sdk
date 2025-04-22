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
         * FileSystems.
         */
        public Builder fileSystems(java.util.List<FileSystems> fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * FileSystemName.
             */
            public Builder fileSystemName(String fileSystemName) {
                this.fileSystemName = fileSystemName;
                return this;
            }

            /**
             * MeteringSpaceSize.
             */
            public Builder meteringSpaceSize(Float meteringSpaceSize) {
                this.meteringSpaceSize = meteringSpaceSize;
                return this;
            }

            /**
             * MountPointCount.
             */
            public Builder mountPointCount(Long mountPointCount) {
                this.mountPointCount = mountPointCount;
                return this;
            }

            /**
             * NumberOfDirectories.
             */
            public Builder numberOfDirectories(Long numberOfDirectories) {
                this.numberOfDirectories = numberOfDirectories;
                return this;
            }

            /**
             * NumberOfFiles.
             */
            public Builder numberOfFiles(Long numberOfFiles) {
                this.numberOfFiles = numberOfFiles;
                return this;
            }

            /**
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * ProvisionedThroughputInMiBps.
             */
            public Builder provisionedThroughputInMiBps(Long provisionedThroughputInMiBps) {
                this.provisionedThroughputInMiBps = provisionedThroughputInMiBps;
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
             * SpaceCapacity.
             */
            public Builder spaceCapacity(Long spaceCapacity) {
                this.spaceCapacity = spaceCapacity;
                return this;
            }

            /**
             * StoragePackageId.
             */
            public Builder storagePackageId(String storagePackageId) {
                this.storagePackageId = storagePackageId;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * ThroughputMode.
             */
            public Builder throughputMode(String throughputMode) {
                this.throughputMode = throughputMode;
                return this;
            }

            /**
             * UsedSpaceSize.
             */
            public Builder usedSpaceSize(Float usedSpaceSize) {
                this.usedSpaceSize = usedSpaceSize;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * ZoneId.
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
