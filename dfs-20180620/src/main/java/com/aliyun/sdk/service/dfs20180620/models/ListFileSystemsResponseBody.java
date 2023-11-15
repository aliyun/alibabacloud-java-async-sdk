// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileSystemsResponseBody</p>
 */
public class ListFileSystemsResponseBody extends TeaModel {
    @NameInMap("FileSystems")
    private java.util.List < FileSystems> fileSystems;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListFileSystemsResponseBody(Builder builder) {
        this.fileSystems = builder.fileSystems;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileSystemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileSystems
     */
    public java.util.List < FileSystems> getFileSystems() {
        return this.fileSystems;
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
        private java.util.List < FileSystems> fileSystems; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * FileSystems.
         */
        public Builder fileSystems(java.util.List < FileSystems> fileSystems) {
            this.fileSystems = fileSystems;
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

    public static class FileSystems extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("FileSystemName")
        private String fileSystemName;

        @NameInMap("MeteringSpaceSize")
        private Float meteringSpaceSize;

        @NameInMap("MountPointCount")
        private Long mountPointCount;

        @NameInMap("NumberOfDirectories")
        private Long numberOfDirectories;

        @NameInMap("NumberOfFiles")
        private Long numberOfFiles;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("ProvisionedThroughputInMiBps")
        private Long provisionedThroughputInMiBps;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SpaceCapacity")
        private Long spaceCapacity;

        @NameInMap("StoragePackageId")
        private String storagePackageId;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("ThroughputMode")
        private String throughputMode;

        @NameInMap("UsedSpaceSize")
        private Float usedSpaceSize;

        @NameInMap("Version")
        private String version;

        @NameInMap("ZoneId")
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
