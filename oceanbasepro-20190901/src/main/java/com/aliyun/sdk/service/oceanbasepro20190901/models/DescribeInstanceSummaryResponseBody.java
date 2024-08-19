// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSummaryResponseBody</p>
 */
public class DescribeInstanceSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceSummary")
    private InstanceSummary instanceSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceSummaryResponseBody(Builder builder) {
        this.instanceSummary = builder.instanceSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceSummary
     */
    public InstanceSummary getInstanceSummary() {
        return this.instanceSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceSummary instanceSummary; 
        private String requestId; 

        /**
         * InstanceSummary.
         */
        public Builder instanceSummary(InstanceSummary instanceSummary) {
            this.instanceSummary = instanceSummary;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceSummaryResponseBody build() {
            return new DescribeInstanceSummaryResponseBody(this);
        } 

    } 

    public static class RegionalInstanceSummaryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredInstancesCount")
        private String expiredInstancesCount;

        @com.aliyun.core.annotation.NameInMap("ImmediatelyExpiredInstancesCount")
        private String immediatelyExpiredInstancesCount;

        @com.aliyun.core.annotation.NameInMap("RecentCreatedInstancesCount")
        private String recentCreatedInstancesCount;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RunningInstancesCount")
        private String runningInstancesCount;

        @com.aliyun.core.annotation.NameInMap("TotalInstancesCount")
        private String totalInstancesCount;

        private RegionalInstanceSummaryList(Builder builder) {
            this.expiredInstancesCount = builder.expiredInstancesCount;
            this.immediatelyExpiredInstancesCount = builder.immediatelyExpiredInstancesCount;
            this.recentCreatedInstancesCount = builder.recentCreatedInstancesCount;
            this.region = builder.region;
            this.runningInstancesCount = builder.runningInstancesCount;
            this.totalInstancesCount = builder.totalInstancesCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionalInstanceSummaryList create() {
            return builder().build();
        }

        /**
         * @return expiredInstancesCount
         */
        public String getExpiredInstancesCount() {
            return this.expiredInstancesCount;
        }

        /**
         * @return immediatelyExpiredInstancesCount
         */
        public String getImmediatelyExpiredInstancesCount() {
            return this.immediatelyExpiredInstancesCount;
        }

        /**
         * @return recentCreatedInstancesCount
         */
        public String getRecentCreatedInstancesCount() {
            return this.recentCreatedInstancesCount;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return runningInstancesCount
         */
        public String getRunningInstancesCount() {
            return this.runningInstancesCount;
        }

        /**
         * @return totalInstancesCount
         */
        public String getTotalInstancesCount() {
            return this.totalInstancesCount;
        }

        public static final class Builder {
            private String expiredInstancesCount; 
            private String immediatelyExpiredInstancesCount; 
            private String recentCreatedInstancesCount; 
            private String region; 
            private String runningInstancesCount; 
            private String totalInstancesCount; 

            /**
             * ExpiredInstancesCount.
             */
            public Builder expiredInstancesCount(String expiredInstancesCount) {
                this.expiredInstancesCount = expiredInstancesCount;
                return this;
            }

            /**
             * ImmediatelyExpiredInstancesCount.
             */
            public Builder immediatelyExpiredInstancesCount(String immediatelyExpiredInstancesCount) {
                this.immediatelyExpiredInstancesCount = immediatelyExpiredInstancesCount;
                return this;
            }

            /**
             * RecentCreatedInstancesCount.
             */
            public Builder recentCreatedInstancesCount(String recentCreatedInstancesCount) {
                this.recentCreatedInstancesCount = recentCreatedInstancesCount;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RunningInstancesCount.
             */
            public Builder runningInstancesCount(String runningInstancesCount) {
                this.runningInstancesCount = runningInstancesCount;
                return this;
            }

            /**
             * TotalInstancesCount.
             */
            public Builder totalInstancesCount(String totalInstancesCount) {
                this.totalInstancesCount = totalInstancesCount;
                return this;
            }

            public RegionalInstanceSummaryList build() {
                return new RegionalInstanceSummaryList(this);
            } 

        } 

    }
    public static class InstanceSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmSummaryCount")
        private Long alarmSummaryCount;

        @com.aliyun.core.annotation.NameInMap("AnomalySQLCount")
        private Long anomalySQLCount;

        @com.aliyun.core.annotation.NameInMap("ClusterInstancesCount")
        private Long clusterInstancesCount;

        @com.aliyun.core.annotation.NameInMap("ExpiredInstancesCount")
        private Long expiredInstancesCount;

        @com.aliyun.core.annotation.NameInMap("ImmediatelyExpiredInstancesCount")
        private Long immediatelyExpiredInstancesCount;

        @com.aliyun.core.annotation.NameInMap("InsufficientDiskInstancesCount")
        private Long insufficientDiskInstancesCount;

        @com.aliyun.core.annotation.NameInMap("OverLoadInstancesCount")
        private Long overLoadInstancesCount;

        @com.aliyun.core.annotation.NameInMap("RegionalInstanceSummaryList")
        private java.util.List < RegionalInstanceSummaryList> regionalInstanceSummaryList;

        @com.aliyun.core.annotation.NameInMap("RunningInstancesCount")
        private Long runningInstancesCount;

        @com.aliyun.core.annotation.NameInMap("TenantInstancesCount")
        private Long tenantInstancesCount;

        @com.aliyun.core.annotation.NameInMap("TotalInstancesCount")
        private Long totalInstancesCount;

        @com.aliyun.core.annotation.NameInMap("TotalOmsInstancesCount")
        private Long totalOmsInstancesCount;

        private InstanceSummary(Builder builder) {
            this.alarmSummaryCount = builder.alarmSummaryCount;
            this.anomalySQLCount = builder.anomalySQLCount;
            this.clusterInstancesCount = builder.clusterInstancesCount;
            this.expiredInstancesCount = builder.expiredInstancesCount;
            this.immediatelyExpiredInstancesCount = builder.immediatelyExpiredInstancesCount;
            this.insufficientDiskInstancesCount = builder.insufficientDiskInstancesCount;
            this.overLoadInstancesCount = builder.overLoadInstancesCount;
            this.regionalInstanceSummaryList = builder.regionalInstanceSummaryList;
            this.runningInstancesCount = builder.runningInstancesCount;
            this.tenantInstancesCount = builder.tenantInstancesCount;
            this.totalInstancesCount = builder.totalInstancesCount;
            this.totalOmsInstancesCount = builder.totalOmsInstancesCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSummary create() {
            return builder().build();
        }

        /**
         * @return alarmSummaryCount
         */
        public Long getAlarmSummaryCount() {
            return this.alarmSummaryCount;
        }

        /**
         * @return anomalySQLCount
         */
        public Long getAnomalySQLCount() {
            return this.anomalySQLCount;
        }

        /**
         * @return clusterInstancesCount
         */
        public Long getClusterInstancesCount() {
            return this.clusterInstancesCount;
        }

        /**
         * @return expiredInstancesCount
         */
        public Long getExpiredInstancesCount() {
            return this.expiredInstancesCount;
        }

        /**
         * @return immediatelyExpiredInstancesCount
         */
        public Long getImmediatelyExpiredInstancesCount() {
            return this.immediatelyExpiredInstancesCount;
        }

        /**
         * @return insufficientDiskInstancesCount
         */
        public Long getInsufficientDiskInstancesCount() {
            return this.insufficientDiskInstancesCount;
        }

        /**
         * @return overLoadInstancesCount
         */
        public Long getOverLoadInstancesCount() {
            return this.overLoadInstancesCount;
        }

        /**
         * @return regionalInstanceSummaryList
         */
        public java.util.List < RegionalInstanceSummaryList> getRegionalInstanceSummaryList() {
            return this.regionalInstanceSummaryList;
        }

        /**
         * @return runningInstancesCount
         */
        public Long getRunningInstancesCount() {
            return this.runningInstancesCount;
        }

        /**
         * @return tenantInstancesCount
         */
        public Long getTenantInstancesCount() {
            return this.tenantInstancesCount;
        }

        /**
         * @return totalInstancesCount
         */
        public Long getTotalInstancesCount() {
            return this.totalInstancesCount;
        }

        /**
         * @return totalOmsInstancesCount
         */
        public Long getTotalOmsInstancesCount() {
            return this.totalOmsInstancesCount;
        }

        public static final class Builder {
            private Long alarmSummaryCount; 
            private Long anomalySQLCount; 
            private Long clusterInstancesCount; 
            private Long expiredInstancesCount; 
            private Long immediatelyExpiredInstancesCount; 
            private Long insufficientDiskInstancesCount; 
            private Long overLoadInstancesCount; 
            private java.util.List < RegionalInstanceSummaryList> regionalInstanceSummaryList; 
            private Long runningInstancesCount; 
            private Long tenantInstancesCount; 
            private Long totalInstancesCount; 
            private Long totalOmsInstancesCount; 

            /**
             * AlarmSummaryCount.
             */
            public Builder alarmSummaryCount(Long alarmSummaryCount) {
                this.alarmSummaryCount = alarmSummaryCount;
                return this;
            }

            /**
             * AnomalySQLCount.
             */
            public Builder anomalySQLCount(Long anomalySQLCount) {
                this.anomalySQLCount = anomalySQLCount;
                return this;
            }

            /**
             * ClusterInstancesCount.
             */
            public Builder clusterInstancesCount(Long clusterInstancesCount) {
                this.clusterInstancesCount = clusterInstancesCount;
                return this;
            }

            /**
             * ExpiredInstancesCount.
             */
            public Builder expiredInstancesCount(Long expiredInstancesCount) {
                this.expiredInstancesCount = expiredInstancesCount;
                return this;
            }

            /**
             * ImmediatelyExpiredInstancesCount.
             */
            public Builder immediatelyExpiredInstancesCount(Long immediatelyExpiredInstancesCount) {
                this.immediatelyExpiredInstancesCount = immediatelyExpiredInstancesCount;
                return this;
            }

            /**
             * InsufficientDiskInstancesCount.
             */
            public Builder insufficientDiskInstancesCount(Long insufficientDiskInstancesCount) {
                this.insufficientDiskInstancesCount = insufficientDiskInstancesCount;
                return this;
            }

            /**
             * OverLoadInstancesCount.
             */
            public Builder overLoadInstancesCount(Long overLoadInstancesCount) {
                this.overLoadInstancesCount = overLoadInstancesCount;
                return this;
            }

            /**
             * RegionalInstanceSummaryList.
             */
            public Builder regionalInstanceSummaryList(java.util.List < RegionalInstanceSummaryList> regionalInstanceSummaryList) {
                this.regionalInstanceSummaryList = regionalInstanceSummaryList;
                return this;
            }

            /**
             * RunningInstancesCount.
             */
            public Builder runningInstancesCount(Long runningInstancesCount) {
                this.runningInstancesCount = runningInstancesCount;
                return this;
            }

            /**
             * TenantInstancesCount.
             */
            public Builder tenantInstancesCount(Long tenantInstancesCount) {
                this.tenantInstancesCount = tenantInstancesCount;
                return this;
            }

            /**
             * TotalInstancesCount.
             */
            public Builder totalInstancesCount(Long totalInstancesCount) {
                this.totalInstancesCount = totalInstancesCount;
                return this;
            }

            /**
             * TotalOmsInstancesCount.
             */
            public Builder totalOmsInstancesCount(Long totalOmsInstancesCount) {
                this.totalOmsInstancesCount = totalOmsInstancesCount;
                return this;
            }

            public InstanceSummary build() {
                return new InstanceSummary(this);
            } 

        } 

    }
}
