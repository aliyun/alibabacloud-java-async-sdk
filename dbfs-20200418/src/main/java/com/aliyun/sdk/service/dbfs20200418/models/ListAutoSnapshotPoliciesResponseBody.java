// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAutoSnapshotPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAutoSnapshotPoliciesResponseBody</p>
 */
public class ListAutoSnapshotPoliciesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotPolicies")
    private java.util.List < SnapshotPolicies> snapshotPolicies;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAutoSnapshotPoliciesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.snapshotPolicies = builder.snapshotPolicies;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoSnapshotPoliciesResponseBody create() {
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
     * @return snapshotPolicies
     */
    public java.util.List < SnapshotPolicies> getSnapshotPolicies() {
        return this.snapshotPolicies;
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
        private java.util.List < SnapshotPolicies> snapshotPolicies; 
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
         * SnapshotPolicies.
         */
        public Builder snapshotPolicies(java.util.List < SnapshotPolicies> snapshotPolicies) {
            this.snapshotPolicies = snapshotPolicies;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAutoSnapshotPoliciesResponseBody build() {
            return new ListAutoSnapshotPoliciesResponseBody(this);
        } 

    } 

    public static class SnapshotPolicies extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("AppliedDbfsNumber")
        private Integer appliedDbfsNumber;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("LastModified")
        private String lastModified;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RepeatWeekdays")
        private java.util.List < String > repeatWeekdays;

        @NameInMap("RetentionDays")
        private Integer retentionDays;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusDetail")
        private String statusDetail;

        @NameInMap("TimePoints")
        private java.util.List < String > timePoints;

        private SnapshotPolicies(Builder builder) {
            this.accountId = builder.accountId;
            this.appliedDbfsNumber = builder.appliedDbfsNumber;
            this.createdTime = builder.createdTime;
            this.lastModified = builder.lastModified;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.regionId = builder.regionId;
            this.repeatWeekdays = builder.repeatWeekdays;
            this.retentionDays = builder.retentionDays;
            this.status = builder.status;
            this.statusDetail = builder.statusDetail;
            this.timePoints = builder.timePoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotPolicies create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return appliedDbfsNumber
         */
        public Integer getAppliedDbfsNumber() {
            return this.appliedDbfsNumber;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
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
        public java.util.List < String > getRepeatWeekdays() {
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
         * @return statusDetail
         */
        public String getStatusDetail() {
            return this.statusDetail;
        }

        /**
         * @return timePoints
         */
        public java.util.List < String > getTimePoints() {
            return this.timePoints;
        }

        public static final class Builder {
            private String accountId; 
            private Integer appliedDbfsNumber; 
            private String createdTime; 
            private String lastModified; 
            private String policyId; 
            private String policyName; 
            private String regionId; 
            private java.util.List < String > repeatWeekdays; 
            private Integer retentionDays; 
            private String status; 
            private String statusDetail; 
            private java.util.List < String > timePoints; 

            /**
             * 账户ID
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * 设置的dbfs数
             */
            public Builder appliedDbfsNumber(Integer appliedDbfsNumber) {
                this.appliedDbfsNumber = appliedDbfsNumber;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * 策略ID
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * 自动快照策略名称
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
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
            public Builder repeatWeekdays(java.util.List < String > repeatWeekdays) {
                this.repeatWeekdays = repeatWeekdays;
                return this;
            }

            /**
             * 快照保留天数（1-65535，NULL为永久保存）
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * 策略状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusDetail.
             */
            public Builder statusDetail(String statusDetail) {
                this.statusDetail = statusDetail;
                return this;
            }

            /**
             * TimePoints.
             */
            public Builder timePoints(java.util.List < String > timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            public SnapshotPolicies build() {
                return new SnapshotPolicies(this);
            } 

        } 

    }
}
