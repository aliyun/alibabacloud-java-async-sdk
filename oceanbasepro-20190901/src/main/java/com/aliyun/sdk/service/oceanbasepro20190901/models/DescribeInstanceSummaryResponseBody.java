// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceSummaryResponseBody model) {
            this.instanceSummary = model.instanceSummary;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The overview information about OceanBase instances.</p>
         */
        public Builder instanceSummary(InstanceSummary instanceSummary) {
            this.instanceSummary = instanceSummary;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceSummaryResponseBody build() {
            return new DescribeInstanceSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSummaryResponseBody</p>
     */
    public static class RegionalInstanceSummaryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredInstancesCount")
        private Long expiredInstancesCount;

        @com.aliyun.core.annotation.NameInMap("ImmediatelyExpiredInstancesCount")
        private Long immediatelyExpiredInstancesCount;

        @com.aliyun.core.annotation.NameInMap("RecentCreatedInstancesCount")
        private Long recentCreatedInstancesCount;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RunningInstancesCount")
        private Long runningInstancesCount;

        @com.aliyun.core.annotation.NameInMap("TotalInstancesCount")
        private Long totalInstancesCount;

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
         * @return recentCreatedInstancesCount
         */
        public Long getRecentCreatedInstancesCount() {
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
        public Long getRunningInstancesCount() {
            return this.runningInstancesCount;
        }

        /**
         * @return totalInstancesCount
         */
        public Long getTotalInstancesCount() {
            return this.totalInstancesCount;
        }

        public static final class Builder {
            private Long expiredInstancesCount; 
            private Long immediatelyExpiredInstancesCount; 
            private Long recentCreatedInstancesCount; 
            private String region; 
            private Long runningInstancesCount; 
            private Long totalInstancesCount; 

            private Builder() {
            } 

            private Builder(RegionalInstanceSummaryList model) {
                this.expiredInstancesCount = model.expiredInstancesCount;
                this.immediatelyExpiredInstancesCount = model.immediatelyExpiredInstancesCount;
                this.recentCreatedInstancesCount = model.recentCreatedInstancesCount;
                this.region = model.region;
                this.runningInstancesCount = model.runningInstancesCount;
                this.totalInstancesCount = model.totalInstancesCount;
            } 

            /**
             * <p>The number of expired instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder expiredInstancesCount(Long expiredInstancesCount) {
                this.expiredInstancesCount = expiredInstancesCount;
                return this;
            }

            /**
             * <p>The number of instances about to expire.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder immediatelyExpiredInstancesCount(Long immediatelyExpiredInstancesCount) {
                this.immediatelyExpiredInstancesCount = immediatelyExpiredInstancesCount;
                return this;
            }

            /**
             * <p>The number of recently created instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recentCreatedInstancesCount(Long recentCreatedInstancesCount) {
                this.recentCreatedInstancesCount = recentCreatedInstancesCount;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The total number of running instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningInstancesCount(Long runningInstancesCount) {
                this.runningInstancesCount = runningInstancesCount;
                return this;
            }

            /**
             * <p>The total number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalInstancesCount(Long totalInstancesCount) {
                this.totalInstancesCount = totalInstancesCount;
                return this;
            }

            public RegionalInstanceSummaryList build() {
                return new RegionalInstanceSummaryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSummaryResponseBody</p>
     */
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
        private java.util.List<RegionalInstanceSummaryList> regionalInstanceSummaryList;

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
        public java.util.List<RegionalInstanceSummaryList> getRegionalInstanceSummaryList() {
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
            private java.util.List<RegionalInstanceSummaryList> regionalInstanceSummaryList; 
            private Long runningInstancesCount; 
            private Long tenantInstancesCount; 
            private Long totalInstancesCount; 
            private Long totalOmsInstancesCount; 

            private Builder() {
            } 

            private Builder(InstanceSummary model) {
                this.alarmSummaryCount = model.alarmSummaryCount;
                this.anomalySQLCount = model.anomalySQLCount;
                this.clusterInstancesCount = model.clusterInstancesCount;
                this.expiredInstancesCount = model.expiredInstancesCount;
                this.immediatelyExpiredInstancesCount = model.immediatelyExpiredInstancesCount;
                this.insufficientDiskInstancesCount = model.insufficientDiskInstancesCount;
                this.overLoadInstancesCount = model.overLoadInstancesCount;
                this.regionalInstanceSummaryList = model.regionalInstanceSummaryList;
                this.runningInstancesCount = model.runningInstancesCount;
                this.tenantInstancesCount = model.tenantInstancesCount;
                this.totalInstancesCount = model.totalInstancesCount;
                this.totalOmsInstancesCount = model.totalOmsInstancesCount;
            } 

            /**
             * <p>The total number of alerts during the query period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alarmSummaryCount(Long alarmSummaryCount) {
                this.alarmSummaryCount = alarmSummaryCount;
                return this;
            }

            /**
             * <p>The total number of abnormal SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder anomalySQLCount(Long anomalySQLCount) {
                this.anomalySQLCount = anomalySQLCount;
                return this;
            }

            /**
             * <p>The number of cluster instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder clusterInstancesCount(Long clusterInstancesCount) {
                this.clusterInstancesCount = clusterInstancesCount;
                return this;
            }

            /**
             * <p>The number of expired instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder expiredInstancesCount(Long expiredInstancesCount) {
                this.expiredInstancesCount = expiredInstancesCount;
                return this;
            }

            /**
             * <p>The total number of expired instances to be released.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder immediatelyExpiredInstancesCount(Long immediatelyExpiredInstancesCount) {
                this.immediatelyExpiredInstancesCount = immediatelyExpiredInstancesCount;
                return this;
            }

            /**
             * <p>The total number of clusters with capacity risks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder insufficientDiskInstancesCount(Long insufficientDiskInstancesCount) {
                this.insufficientDiskInstancesCount = insufficientDiskInstancesCount;
                return this;
            }

            /**
             * <p>The number of overloaded instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder overLoadInstancesCount(Long overLoadInstancesCount) {
                this.overLoadInstancesCount = overLoadInstancesCount;
                return this;
            }

            /**
             * <p>A list of regional instances.</p>
             */
            public Builder regionalInstanceSummaryList(java.util.List<RegionalInstanceSummaryList> regionalInstanceSummaryList) {
                this.regionalInstanceSummaryList = regionalInstanceSummaryList;
                return this;
            }

            /**
             * <p>The number of running instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningInstancesCount(Long runningInstancesCount) {
                this.runningInstancesCount = runningInstancesCount;
                return this;
            }

            /**
             * <p>The number of tenant instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tenantInstancesCount(Long tenantInstancesCount) {
                this.tenantInstancesCount = tenantInstancesCount;
                return this;
            }

            /**
             * <p>The total number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalInstancesCount(Long totalInstancesCount) {
                this.totalInstancesCount = totalInstancesCount;
                return this;
            }

            /**
             * <p>The number of data transmission instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
