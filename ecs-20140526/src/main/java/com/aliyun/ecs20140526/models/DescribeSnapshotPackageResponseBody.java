// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotPackageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotPackageResponseBody</p>
 */
public class DescribeSnapshotPackageResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("SnapshotPackages")
    private SnapshotPackages snapshotPackages;

    private DescribeSnapshotPackageResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.snapshotPackages = builder.snapshotPackages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotPackageResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return snapshotPackages
     */
    public SnapshotPackages getSnapshotPackages() {
        return this.snapshotPackages;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private SnapshotPackages snapshotPackages; 

        /**
         * The number of entries to return on each page.
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
         * The page number of the OSS package list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of returned OSS storage packages.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A collection of storage package information.
         */
        public Builder snapshotPackages(SnapshotPackages snapshotPackages) {
            this.snapshotPackages = snapshotPackages;
            return this;
        }

        public DescribeSnapshotPackageResponseBody build() {
            return new DescribeSnapshotPackageResponseBody(this);
        } 

    } 

    public static class SnapshotPackage extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("InitCapacity")
        private Long initCapacity;

        private SnapshotPackage(Builder builder) {
            this.displayName = builder.displayName;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.initCapacity = builder.initCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotPackage create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return initCapacity
         */
        public Long getInitCapacity() {
            return this.initCapacity;
        }

        public static final class Builder {
            private String displayName; 
            private String endTime; 
            private String startTime; 
            private Long initCapacity; 

            /**
             * The name of the storage package.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The expiration time of the storage package. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The time when the storage package was purchased. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The maximum capacity of the storage package.
             */
            public Builder initCapacity(Long initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            public SnapshotPackage build() {
                return new SnapshotPackage(this);
            } 

        } 

    }
    public static class SnapshotPackages extends TeaModel {
        @NameInMap("SnapshotPackage")
        private java.util.List < SnapshotPackage> snapshotPackage;

        private SnapshotPackages(Builder builder) {
            this.snapshotPackage = builder.snapshotPackage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotPackages create() {
            return builder().build();
        }

        /**
         * @return snapshotPackage
         */
        public java.util.List < SnapshotPackage> getSnapshotPackage() {
            return this.snapshotPackage;
        }

        public static final class Builder {
            private java.util.List < SnapshotPackage> snapshotPackage; 

            /**
             * SnapshotPackage.
             */
            public Builder snapshotPackage(java.util.List < SnapshotPackage> snapshotPackage) {
                this.snapshotPackage = snapshotPackage;
                return this;
            }

            public SnapshotPackages build() {
                return new SnapshotPackages(this);
            } 

        } 

    }
}
