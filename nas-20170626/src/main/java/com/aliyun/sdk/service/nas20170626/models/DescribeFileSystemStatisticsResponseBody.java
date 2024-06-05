// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFileSystemStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileSystemStatisticsResponseBody</p>
 */
public class DescribeFileSystemStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileSystemStatistics")
    private FileSystemStatistics fileSystemStatistics;

    @com.aliyun.core.annotation.NameInMap("FileSystems")
    private FileSystems fileSystems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeFileSystemStatisticsResponseBody(Builder builder) {
        this.fileSystemStatistics = builder.fileSystemStatistics;
        this.fileSystems = builder.fileSystems;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileSystemStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileSystemStatistics
     */
    public FileSystemStatistics getFileSystemStatistics() {
        return this.fileSystemStatistics;
    }

    /**
     * @return fileSystems
     */
    public FileSystems getFileSystems() {
        return this.fileSystems;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private FileSystemStatistics fileSystemStatistics; 
        private FileSystems fileSystems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The statistics of file systems.
         */
        public Builder fileSystemStatistics(FileSystemStatistics fileSystemStatistics) {
            this.fileSystemStatistics = fileSystemStatistics;
            return this;
        }

        /**
         * The queried file systems.
         */
        public Builder fileSystems(FileSystems fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
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
         * The total number of file system entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFileSystemStatisticsResponseBody build() {
            return new DescribeFileSystemStatisticsResponseBody(this);
        } 

    } 

    public static class FileSystemStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredCount")
        private Integer expiredCount;

        @com.aliyun.core.annotation.NameInMap("ExpiringCount")
        private Integer expiringCount;

        @com.aliyun.core.annotation.NameInMap("FileSystemType")
        private String fileSystemType;

        @com.aliyun.core.annotation.NameInMap("MeteredSize")
        private Long meteredSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private FileSystemStatistic(Builder builder) {
            this.expiredCount = builder.expiredCount;
            this.expiringCount = builder.expiringCount;
            this.fileSystemType = builder.fileSystemType;
            this.meteredSize = builder.meteredSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystemStatistic create() {
            return builder().build();
        }

        /**
         * @return expiredCount
         */
        public Integer getExpiredCount() {
            return this.expiredCount;
        }

        /**
         * @return expiringCount
         */
        public Integer getExpiringCount() {
            return this.expiringCount;
        }

        /**
         * @return fileSystemType
         */
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        /**
         * @return meteredSize
         */
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer expiredCount; 
            private Integer expiringCount; 
            private String fileSystemType; 
            private Long meteredSize; 
            private Integer totalCount; 

            /**
             * The number of expired file systems.
             */
            public Builder expiredCount(Integer expiredCount) {
                this.expiredCount = expiredCount;
                return this;
            }

            /**
             * The number of expiring file systems.
             * <p>
             * 
             * File systems whose expiration time is less than or equal to seven days away from the current time are counted.
             */
            public Builder expiringCount(Integer expiringCount) {
                this.expiringCount = expiringCount;
                return this;
            }

            /**
             * The type of the file system.
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * The storage usage of the file system.
             * <p>
             * 
             * The value of this parameter is the maximum storage usage of the file system over the last hour.
             * 
             * Unit: bytes.
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * The number of file systems of the current type.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public FileSystemStatistic build() {
                return new FileSystemStatistic(this);
            } 

        } 

    }
    public static class FileSystemStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystemStatistic")
        private java.util.List < FileSystemStatistic> fileSystemStatistic;

        private FileSystemStatistics(Builder builder) {
            this.fileSystemStatistic = builder.fileSystemStatistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystemStatistics create() {
            return builder().build();
        }

        /**
         * @return fileSystemStatistic
         */
        public java.util.List < FileSystemStatistic> getFileSystemStatistic() {
            return this.fileSystemStatistic;
        }

        public static final class Builder {
            private java.util.List < FileSystemStatistic> fileSystemStatistic; 

            /**
             * FileSystemStatistic.
             */
            public Builder fileSystemStatistic(java.util.List < FileSystemStatistic> fileSystemStatistic) {
                this.fileSystemStatistic = fileSystemStatistic;
                return this;
            }

            public FileSystemStatistics build() {
                return new FileSystemStatistics(this);
            } 

        } 

    }
    public static class Package extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Package(Builder builder) {
            this.expiredTime = builder.expiredTime;
            this.packageId = builder.packageId;
            this.size = builder.size;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Package create() {
            return builder().build();
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String expiredTime; 
            private String packageId; 
            private Long size; 
            private String startTime; 

            /**
             * The end time of the validity period for the storage plan.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The ID of the storage plan.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * The capacity of the storage plan.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The start time of the validity period for the storage plan.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Package build() {
                return new Package(this);
            } 

        } 

    }
    public static class Packages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Package")
        private java.util.List < Package> _package;

        private Packages(Builder builder) {
            this._package = builder._package;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Packages create() {
            return builder().build();
        }

        /**
         * @return _package
         */
        public java.util.List < Package> get_package() {
            return this._package;
        }

        public static final class Builder {
            private java.util.List < Package> _package; 

            /**
             * Package.
             */
            public Builder _package(java.util.List < Package> _package) {
                this._package = _package;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
    public static class FileSystem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FileSystemType")
        private String fileSystemType;

        @com.aliyun.core.annotation.NameInMap("MeteredIASize")
        private Long meteredIASize;

        @com.aliyun.core.annotation.NameInMap("MeteredSize")
        private Long meteredSize;

        @com.aliyun.core.annotation.NameInMap("Packages")
        private Packages packages;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private FileSystem(Builder builder) {
            this.capacity = builder.capacity;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemType = builder.fileSystemType;
            this.meteredIASize = builder.meteredIASize;
            this.meteredSize = builder.meteredSize;
            this.packages = builder.packages;
            this.protocolType = builder.protocolType;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystem create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return fileSystemType
         */
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        /**
         * @return meteredIASize
         */
        public Long getMeteredIASize() {
            return this.meteredIASize;
        }

        /**
         * @return meteredSize
         */
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        /**
         * @return packages
         */
        public Packages getPackages() {
            return this.packages;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Long capacity; 
            private String chargeType; 
            private String createTime; 
            private String description; 
            private String expiredTime; 
            private String fileSystemId; 
            private String fileSystemType; 
            private Long meteredIASize; 
            private Long meteredSize; 
            private Packages packages; 
            private String protocolType; 
            private String regionId; 
            private String status; 
            private String storageType; 
            private String zoneId; 

            /**
             * The capacity of the file system.
             * <p>
             * 
             * Unit: GiB.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The billing method.
             * <p>
             * 
             * Valid values:
             * 
             * *   Subscription: The subscription billing method is used.
             * *   PayAsYouGo: The pay-as-you-go billing method is used.
             * *   Package: A storage plan is attached to the file system.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The time when the NAS file system was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the file system.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the file system expires.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The ID of the file system.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * The type of the file system.
             * <p>
             * 
             * Valid values:
             * 
             * *   standard: General-purpose NAS file system
             * *   extreme: Extreme NAS file system
             * *   cpfs: CPFS file system
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * The storage usage of the Infrequent Access (IA) storage medium.
             * <p>
             * 
             * Unit: bytes.
             */
            public Builder meteredIASize(Long meteredIASize) {
                this.meteredIASize = meteredIASize;
                return this;
            }

            /**
             * The storage usage of the file system.
             * <p>
             * 
             * The value of this parameter is the maximum storage usage of the file system over the last hour. Unit: bytes.
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * The information about storage plans.
             */
            public Builder packages(Packages packages) {
                this.packages = packages;
                return this;
            }

            /**
             * The protocol type of the file system.
             * <p>
             * 
             * Valid values:
             * 
             * *   NFS: Network File System (NFS)
             * *   SMB: Server Message Block (SMB)
             * *   cpfs: the protocol type supported by the CPFS file system
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the file system.
             * <p>
             * 
             * This parameter is returned for Extreme NAS file systems and Cloud Parallel File Storage (CPFS) file systems. Valid values:
             * 
             * *   Pending: The file system is being created or modified.
             * *   Running: The file system is available. Before you create a mount target for the file system, make sure that the file system is in the Running state.
             * *   Stopped: The file system is unavailable.
             * *   Extending: The file system is being scaled out.
             * *   Stopping: The file system is being disabled.
             * *   Deleting: The file system is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The storage type.
             * <p>
             * 
             * Valid values:
             * 
             * *   Valid values for General-purpose NAS file systems: Capacity and Performance.
             * *   Valid values for Extreme NAS file systems: standard and advance.
             * *   Valid values for CPFS file systems: advance\_100 (100 MB/s/TiB baseline) and advance\_200 (200 MB/s/TiB baseline).
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * The zone ID.
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
    public static class FileSystems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystem")
        private java.util.List < FileSystem> fileSystem;

        private FileSystems(Builder builder) {
            this.fileSystem = builder.fileSystem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystems create() {
            return builder().build();
        }

        /**
         * @return fileSystem
         */
        public java.util.List < FileSystem> getFileSystem() {
            return this.fileSystem;
        }

        public static final class Builder {
            private java.util.List < FileSystem> fileSystem; 

            /**
             * FileSystem.
             */
            public Builder fileSystem(java.util.List < FileSystem> fileSystem) {
                this.fileSystem = fileSystem;
                return this;
            }

            public FileSystems build() {
                return new FileSystems(this);
            } 

        } 

    }
}
