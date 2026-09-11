// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeFileSystemStatisticsResponseBody model) {
            this.fileSystemStatistics = model.fileSystemStatistics;
            this.fileSystems = model.fileSystems;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * FileSystemStatistics.
         */
        public Builder fileSystemStatistics(FileSystemStatistics fileSystemStatistics) {
            this.fileSystemStatistics = fileSystemStatistics;
            return this;
        }

        /**
         * FileSystems.
         */
        public Builder fileSystems(FileSystems fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9F088138-FD73-4B68-95CC-DFAD4D85****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of file system entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFileSystemStatisticsResponseBody build() {
            return new DescribeFileSystemStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFileSystemStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemStatisticsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(FileSystemStatistic model) {
                this.expiredCount = model.expiredCount;
                this.expiringCount = model.expiringCount;
                this.fileSystemType = model.fileSystemType;
                this.meteredSize = model.meteredSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * ExpiredCount.
             */
            public Builder expiredCount(Integer expiredCount) {
                this.expiredCount = expiredCount;
                return this;
            }

            /**
             * ExpiringCount.
             */
            public Builder expiringCount(Integer expiringCount) {
                this.expiringCount = expiringCount;
                return this;
            }

            /**
             * FileSystemType.
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * MeteredSize.
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * <p>The total number of file system entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeFileSystemStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemStatisticsResponseBody</p>
     */
    public static class FileSystemStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystemStatistic")
        private java.util.List<FileSystemStatistic> fileSystemStatistic;

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
        public java.util.List<FileSystemStatistic> getFileSystemStatistic() {
            return this.fileSystemStatistic;
        }

        public static final class Builder {
            private java.util.List<FileSystemStatistic> fileSystemStatistic; 

            private Builder() {
            } 

            private Builder(FileSystemStatistics model) {
                this.fileSystemStatistic = model.fileSystemStatistic;
            } 

            /**
             * FileSystemStatistic.
             */
            public Builder fileSystemStatistic(java.util.List<FileSystemStatistic> fileSystemStatistic) {
                this.fileSystemStatistic = fileSystemStatistic;
                return this;
            }

            public FileSystemStatistics build() {
                return new FileSystemStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileSystemStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemStatisticsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Package model) {
                this.expiredTime = model.expiredTime;
                this.packageId = model.packageId;
                this.size = model.size;
                this.startTime = model.startTime;
            } 

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * PackageId.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * StartTime.
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
    /**
     * 
     * {@link DescribeFileSystemStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemStatisticsResponseBody</p>
     */
    public static class Packages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Package")
        private java.util.List<Package> _package;

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
        public java.util.List<Package> get_package() {
            return this._package;
        }

        public static final class Builder {
            private java.util.List<Package> _package; 

            private Builder() {
            } 

            private Builder(Packages model) {
                this._package = model._package;
            } 

            /**
             * Package.
             */
            public Builder _package(java.util.List<Package> _package) {
                this._package = _package;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileSystemStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemStatisticsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(FileSystem model) {
                this.capacity = model.capacity;
                this.chargeType = model.chargeType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.expiredTime = model.expiredTime;
                this.fileSystemId = model.fileSystemId;
                this.fileSystemType = model.fileSystemType;
                this.meteredIASize = model.meteredIASize;
                this.meteredSize = model.meteredSize;
                this.packages = model.packages;
                this.protocolType = model.protocolType;
                this.regionId = model.regionId;
                this.status = model.status;
                this.storageType = model.storageType;
                this.zoneId = model.zoneId;
            } 

            /**
             * Capacity.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
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
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
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
             * FileSystemType.
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * MeteredIASize.
             */
            public Builder meteredIASize(Long meteredIASize) {
                this.meteredIASize = meteredIASize;
                return this;
            }

            /**
             * MeteredSize.
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * Packages.
             */
            public Builder packages(Packages packages) {
                this.packages = packages;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
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
    /**
     * 
     * {@link DescribeFileSystemStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemStatisticsResponseBody</p>
     */
    public static class FileSystems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystem")
        private java.util.List<FileSystem> fileSystem;

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
        public java.util.List<FileSystem> getFileSystem() {
            return this.fileSystem;
        }

        public static final class Builder {
            private java.util.List<FileSystem> fileSystem; 

            private Builder() {
            } 

            private Builder(FileSystems model) {
                this.fileSystem = model.fileSystem;
            } 

            /**
             * FileSystem.
             */
            public Builder fileSystem(java.util.List<FileSystem> fileSystem) {
                this.fileSystem = fileSystem;
                return this;
            }

            public FileSystems build() {
                return new FileSystems(this);
            } 

        } 

    }
}
