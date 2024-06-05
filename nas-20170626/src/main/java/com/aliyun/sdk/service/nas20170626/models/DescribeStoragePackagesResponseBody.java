// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStoragePackagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStoragePackagesResponseBody</p>
 */
public class DescribeStoragePackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Packages")
    private Packages packages;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeStoragePackagesResponseBody(Builder builder) {
        this.packages = builder.packages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStoragePackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return packages
     */
    public Packages getPackages() {
        return this.packages;
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
        private Packages packages; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of storage plans.
         */
        public Builder packages(Packages packages) {
            this.packages = packages;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of storage plans returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of storage plans.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeStoragePackagesResponseBody build() {
            return new DescribeStoragePackagesResponseBody(this);
        } 

    } 

    public static class Package extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private Package(Builder builder) {
            this.expiredTime = builder.expiredTime;
            this.fileSystemId = builder.fileSystemId;
            this.packageId = builder.packageId;
            this.size = builder.size;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.storageType = builder.storageType;
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
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
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

        public static final class Builder {
            private String expiredTime; 
            private String fileSystemId; 
            private String packageId; 
            private Long size; 
            private String startTime; 
            private String status; 
            private String storageType; 

            /**
             * The end time of the validity period for the storage plan.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The ID of the file system that is bound to the storage plan.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
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
             * <p>
             * 
             * Unit: bytes.
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

            /**
             * The status of the storage plan.
             * <p>
             * 
             * Valid values:
             * 
             * *   free: The storage plan is not bound to a file system. You can bind the storage plan to a file system of the same storage type.
             * *   bound: The storage plan is bound to a file system.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the storage plan.
             * <p>
             * 
             * Valid values:
             * 
             * *   Performance
             * *   Capacity
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
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
}
