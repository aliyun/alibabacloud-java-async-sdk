// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotPackages")
    private SnapshotPackages snapshotPackages;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSnapshotPackageResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.snapshotPackages = builder.snapshotPackages;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotPackageResponseBody create() {
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
     * @return snapshotPackages
     */
    public SnapshotPackages getSnapshotPackages() {
        return this.snapshotPackages;
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
        private SnapshotPackages snapshotPackages; 
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
         * SnapshotPackages.
         */
        public Builder snapshotPackages(SnapshotPackages snapshotPackages) {
            this.snapshotPackages = snapshotPackages;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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

        @NameInMap("InitCapacity")
        private Long initCapacity;

        @NameInMap("StartTime")
        private String startTime;

        private SnapshotPackage(Builder builder) {
            this.displayName = builder.displayName;
            this.endTime = builder.endTime;
            this.initCapacity = builder.initCapacity;
            this.startTime = builder.startTime;
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
         * @return initCapacity
         */
        public Long getInitCapacity() {
            return this.initCapacity;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String displayName; 
            private String endTime; 
            private Long initCapacity; 
            private String startTime; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InitCapacity.
             */
            public Builder initCapacity(Long initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
