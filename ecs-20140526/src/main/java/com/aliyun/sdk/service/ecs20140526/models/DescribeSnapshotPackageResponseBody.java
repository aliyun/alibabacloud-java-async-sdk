// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotPackageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotPackageResponseBody</p>
 */
public class DescribeSnapshotPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotPackages")
    private SnapshotPackages snapshotPackages;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * Details about the OSS storage plans.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The total number of returned OSS storage plans.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the OSS storage plan expires. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder snapshotPackages(SnapshotPackages snapshotPackages) {
            this.snapshotPackages = snapshotPackages;
            return this;
        }

        /**
         * The name of the OSS storage plan.
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
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InitCapacity")
        private Long initCapacity;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
             * The time when the OSS storage plan was purchased. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The maximum storage capacity offered by the OSS storage plan.
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
             * DescribeSnapshotPackage
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
        @com.aliyun.core.annotation.NameInMap("SnapshotPackage")
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
