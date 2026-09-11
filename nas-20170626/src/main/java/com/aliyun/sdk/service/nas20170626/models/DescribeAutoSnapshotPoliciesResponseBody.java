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
 * {@link DescribeAutoSnapshotPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoSnapshotPoliciesResponseBody</p>
 */
public class DescribeAutoSnapshotPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicies")
    private AutoSnapshotPolicies autoSnapshotPolicies;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAutoSnapshotPoliciesResponseBody(Builder builder) {
        this.autoSnapshotPolicies = builder.autoSnapshotPolicies;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoSnapshotPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSnapshotPolicies
     */
    public AutoSnapshotPolicies getAutoSnapshotPolicies() {
        return this.autoSnapshotPolicies;
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
        private AutoSnapshotPolicies autoSnapshotPolicies; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAutoSnapshotPoliciesResponseBody model) {
            this.autoSnapshotPolicies = model.autoSnapshotPolicies;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AutoSnapshotPolicies.
         */
        public Builder autoSnapshotPolicies(AutoSnapshotPolicies autoSnapshotPolicies) {
            this.autoSnapshotPolicies = autoSnapshotPolicies;
            return this;
        }

        /**
         * <p>The page number of the automatic snapshot policy list.</p>
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of automatic snapshot policies.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoSnapshotPoliciesResponseBody build() {
            return new DescribeAutoSnapshotPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoSnapshotPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPoliciesResponseBody</p>
     */
    public static class AutoSnapshotPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyName")
        private String autoSnapshotPolicyName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FileSystemNums")
        private Integer fileSystemNums;

        @com.aliyun.core.annotation.NameInMap("FileSystemType")
        private String fileSystemType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepeatWeekdays")
        private String repeatWeekdays;

        @com.aliyun.core.annotation.NameInMap("RetentionDays")
        private Integer retentionDays;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimePoints")
        private String timePoints;

        private AutoSnapshotPolicy(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.autoSnapshotPolicyName = builder.autoSnapshotPolicyName;
            this.createTime = builder.createTime;
            this.fileSystemNums = builder.fileSystemNums;
            this.fileSystemType = builder.fileSystemType;
            this.regionId = builder.regionId;
            this.repeatWeekdays = builder.repeatWeekdays;
            this.retentionDays = builder.retentionDays;
            this.status = builder.status;
            this.timePoints = builder.timePoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSnapshotPolicy create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return autoSnapshotPolicyName
         */
        public String getAutoSnapshotPolicyName() {
            return this.autoSnapshotPolicyName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return fileSystemNums
         */
        public Integer getFileSystemNums() {
            return this.fileSystemNums;
        }

        /**
         * @return fileSystemType
         */
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repeatWeekdays
         */
        public String getRepeatWeekdays() {
            return this.repeatWeekdays;
        }

        /**
         * @return retentionDays
         */
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timePoints
         */
        public String getTimePoints() {
            return this.timePoints;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private String autoSnapshotPolicyName; 
            private String createTime; 
            private Integer fileSystemNums; 
            private String fileSystemType; 
            private String regionId; 
            private String repeatWeekdays; 
            private Integer retentionDays; 
            private String status; 
            private String timePoints; 

            private Builder() {
            } 

            private Builder(AutoSnapshotPolicy model) {
                this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
                this.autoSnapshotPolicyName = model.autoSnapshotPolicyName;
                this.createTime = model.createTime;
                this.fileSystemNums = model.fileSystemNums;
                this.fileSystemType = model.fileSystemType;
                this.regionId = model.regionId;
                this.repeatWeekdays = model.repeatWeekdays;
                this.retentionDays = model.retentionDays;
                this.status = model.status;
                this.timePoints = model.timePoints;
            } 

            /**
             * AutoSnapshotPolicyId.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * AutoSnapshotPolicyName.
             */
            public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
                this.autoSnapshotPolicyName = autoSnapshotPolicyName;
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
             * FileSystemNums.
             */
            public Builder fileSystemNums(Integer fileSystemNums) {
                this.fileSystemNums = fileSystemNums;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RepeatWeekdays.
             */
            public Builder repeatWeekdays(String repeatWeekdays) {
                this.repeatWeekdays = repeatWeekdays;
                return this;
            }

            /**
             * RetentionDays.
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
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
             * TimePoints.
             */
            public Builder timePoints(String timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            public AutoSnapshotPolicy build() {
                return new AutoSnapshotPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoSnapshotPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPoliciesResponseBody</p>
     */
    public static class AutoSnapshotPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicy")
        private java.util.List<AutoSnapshotPolicy> autoSnapshotPolicy;

        private AutoSnapshotPolicies(Builder builder) {
            this.autoSnapshotPolicy = builder.autoSnapshotPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSnapshotPolicies create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicy
         */
        public java.util.List<AutoSnapshotPolicy> getAutoSnapshotPolicy() {
            return this.autoSnapshotPolicy;
        }

        public static final class Builder {
            private java.util.List<AutoSnapshotPolicy> autoSnapshotPolicy; 

            private Builder() {
            } 

            private Builder(AutoSnapshotPolicies model) {
                this.autoSnapshotPolicy = model.autoSnapshotPolicy;
            } 

            /**
             * AutoSnapshotPolicy.
             */
            public Builder autoSnapshotPolicy(java.util.List<AutoSnapshotPolicy> autoSnapshotPolicy) {
                this.autoSnapshotPolicy = autoSnapshotPolicy;
                return this;
            }

            public AutoSnapshotPolicies build() {
                return new AutoSnapshotPolicies(this);
            } 

        } 

    }
}
