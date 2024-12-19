// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
         * <p>Details about the OSS storage plans.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The total number of returned OSS storage plans.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the OSS storage plan expires. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        public Builder snapshotPackages(SnapshotPackages snapshotPackages) {
            this.snapshotPackages = snapshotPackages;
            return this;
        }

        /**
         * <p>The name of the OSS storage plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSnapshotPackageResponseBody build() {
            return new DescribeSnapshotPackageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnapshotPackageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotPackageResponseBody</p>
     */
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
             * <p>The time when the OSS storage plan was purchased. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>testDisplayName</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The maximum storage capacity offered by the OSS storage plan.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-30T06:32:31Z</p>
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
             * <p>DescribeSnapshotPackage</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-30T06:32:31Z</p>
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
    /**
     * 
     * {@link DescribeSnapshotPackageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotPackageResponseBody</p>
     */
    public static class SnapshotPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnapshotPackage")
        private java.util.List<SnapshotPackage> snapshotPackage;

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
        public java.util.List<SnapshotPackage> getSnapshotPackage() {
            return this.snapshotPackage;
        }

        public static final class Builder {
            private java.util.List<SnapshotPackage> snapshotPackage; 

            /**
             * SnapshotPackage.
             */
            public Builder snapshotPackage(java.util.List<SnapshotPackage> snapshotPackage) {
                this.snapshotPackage = snapshotPackage;
                return this;
            }

            public SnapshotPackages build() {
                return new SnapshotPackages(this);
            } 

        } 

    }
}
