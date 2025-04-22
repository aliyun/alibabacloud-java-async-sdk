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
 * {@link GetFileSystemResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileSystemResponseBody</p>
 */
public class GetFileSystemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileSystem")
    private FileSystem fileSystem;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileSystemResponseBody(Builder builder) {
        this.fileSystem = builder.fileSystem;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileSystemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystem
     */
    public FileSystem getFileSystem() {
        return this.fileSystem;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FileSystem fileSystem; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFileSystemResponseBody model) {
            this.fileSystem = model.fileSystem;
            this.requestId = model.requestId;
        } 

        /**
         * FileSystem.
         */
        public Builder fileSystem(FileSystem fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileSystemResponseBody build() {
            return new GetFileSystemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileSystemResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileSystemResponseBody</p>
     */
    public static class FileSystem extends TeaModel {
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

        private FileSystem(Builder builder) {
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

        public static FileSystem create() {
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

            private Builder(FileSystem model) {
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

            public FileSystem build() {
                return new FileSystem(this);
            } 

        } 

    }
}
