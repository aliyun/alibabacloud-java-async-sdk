// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodDomainsUsageByDayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainsUsageByDayResponseBody</p>
 */
public class DescribeVodDomainsUsageByDayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("UsageByDays")
    private UsageByDays usageByDays;

    @com.aliyun.core.annotation.NameInMap("UsageTotal")
    private UsageTotal usageTotal;

    private DescribeVodDomainsUsageByDayResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.usageByDays = builder.usageByDays;
        this.usageTotal = builder.usageTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainsUsageByDayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return usageByDays
     */
    public UsageByDays getUsageByDays() {
        return this.usageByDays;
    }

    /**
     * @return usageTotal
     */
    public UsageTotal getUsageTotal() {
        return this.usageTotal;
    }

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private UsageByDays usageByDays; 
        private UsageTotal usageTotal; 

        private Builder() {
        } 

        private Builder(DescribeVodDomainsUsageByDayResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.usageByDays = model.usageByDays;
            this.usageTotal = model.usageTotal;
        } 

        /**
         * DataInterval.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * UsageByDays.
         */
        public Builder usageByDays(UsageByDays usageByDays) {
            this.usageByDays = usageByDays;
            return this;
        }

        /**
         * UsageTotal.
         */
        public Builder usageTotal(UsageTotal usageTotal) {
            this.usageTotal = usageTotal;
            return this;
        }

        public DescribeVodDomainsUsageByDayResponseBody build() {
            return new DescribeVodDomainsUsageByDayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainsUsageByDayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainsUsageByDayResponseBody</p>
     */
    public static class UsageByDay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BytesHitRate")
        private String bytesHitRate;

        @com.aliyun.core.annotation.NameInMap("MaxBps")
        private String maxBps;

        @com.aliyun.core.annotation.NameInMap("MaxBpsTime")
        private String maxBpsTime;

        @com.aliyun.core.annotation.NameInMap("MaxSrcBps")
        private String maxSrcBps;

        @com.aliyun.core.annotation.NameInMap("MaxSrcBpsTime")
        private String maxSrcBpsTime;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private String qps;

        @com.aliyun.core.annotation.NameInMap("RequestHitRate")
        private String requestHitRate;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("TotalAccess")
        private String totalAccess;

        @com.aliyun.core.annotation.NameInMap("TotalTraffic")
        private String totalTraffic;

        private UsageByDay(Builder builder) {
            this.bytesHitRate = builder.bytesHitRate;
            this.maxBps = builder.maxBps;
            this.maxBpsTime = builder.maxBpsTime;
            this.maxSrcBps = builder.maxSrcBps;
            this.maxSrcBpsTime = builder.maxSrcBpsTime;
            this.qps = builder.qps;
            this.requestHitRate = builder.requestHitRate;
            this.timeStamp = builder.timeStamp;
            this.totalAccess = builder.totalAccess;
            this.totalTraffic = builder.totalTraffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageByDay create() {
            return builder().build();
        }

        /**
         * @return bytesHitRate
         */
        public String getBytesHitRate() {
            return this.bytesHitRate;
        }

        /**
         * @return maxBps
         */
        public String getMaxBps() {
            return this.maxBps;
        }

        /**
         * @return maxBpsTime
         */
        public String getMaxBpsTime() {
            return this.maxBpsTime;
        }

        /**
         * @return maxSrcBps
         */
        public String getMaxSrcBps() {
            return this.maxSrcBps;
        }

        /**
         * @return maxSrcBpsTime
         */
        public String getMaxSrcBpsTime() {
            return this.maxSrcBpsTime;
        }

        /**
         * @return qps
         */
        public String getQps() {
            return this.qps;
        }

        /**
         * @return requestHitRate
         */
        public String getRequestHitRate() {
            return this.requestHitRate;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return totalAccess
         */
        public String getTotalAccess() {
            return this.totalAccess;
        }

        /**
         * @return totalTraffic
         */
        public String getTotalTraffic() {
            return this.totalTraffic;
        }

        public static final class Builder {
            private String bytesHitRate; 
            private String maxBps; 
            private String maxBpsTime; 
            private String maxSrcBps; 
            private String maxSrcBpsTime; 
            private String qps; 
            private String requestHitRate; 
            private String timeStamp; 
            private String totalAccess; 
            private String totalTraffic; 

            private Builder() {
            } 

            private Builder(UsageByDay model) {
                this.bytesHitRate = model.bytesHitRate;
                this.maxBps = model.maxBps;
                this.maxBpsTime = model.maxBpsTime;
                this.maxSrcBps = model.maxSrcBps;
                this.maxSrcBpsTime = model.maxSrcBpsTime;
                this.qps = model.qps;
                this.requestHitRate = model.requestHitRate;
                this.timeStamp = model.timeStamp;
                this.totalAccess = model.totalAccess;
                this.totalTraffic = model.totalTraffic;
            } 

            /**
             * BytesHitRate.
             */
            public Builder bytesHitRate(String bytesHitRate) {
                this.bytesHitRate = bytesHitRate;
                return this;
            }

            /**
             * MaxBps.
             */
            public Builder maxBps(String maxBps) {
                this.maxBps = maxBps;
                return this;
            }

            /**
             * MaxBpsTime.
             */
            public Builder maxBpsTime(String maxBpsTime) {
                this.maxBpsTime = maxBpsTime;
                return this;
            }

            /**
             * MaxSrcBps.
             */
            public Builder maxSrcBps(String maxSrcBps) {
                this.maxSrcBps = maxSrcBps;
                return this;
            }

            /**
             * MaxSrcBpsTime.
             */
            public Builder maxSrcBpsTime(String maxSrcBpsTime) {
                this.maxSrcBpsTime = maxSrcBpsTime;
                return this;
            }

            /**
             * Qps.
             */
            public Builder qps(String qps) {
                this.qps = qps;
                return this;
            }

            /**
             * RequestHitRate.
             */
            public Builder requestHitRate(String requestHitRate) {
                this.requestHitRate = requestHitRate;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * TotalAccess.
             */
            public Builder totalAccess(String totalAccess) {
                this.totalAccess = totalAccess;
                return this;
            }

            /**
             * TotalTraffic.
             */
            public Builder totalTraffic(String totalTraffic) {
                this.totalTraffic = totalTraffic;
                return this;
            }

            public UsageByDay build() {
                return new UsageByDay(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainsUsageByDayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainsUsageByDayResponseBody</p>
     */
    public static class UsageByDays extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UsageByDay")
        private java.util.List<UsageByDay> usageByDay;

        private UsageByDays(Builder builder) {
            this.usageByDay = builder.usageByDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageByDays create() {
            return builder().build();
        }

        /**
         * @return usageByDay
         */
        public java.util.List<UsageByDay> getUsageByDay() {
            return this.usageByDay;
        }

        public static final class Builder {
            private java.util.List<UsageByDay> usageByDay; 

            private Builder() {
            } 

            private Builder(UsageByDays model) {
                this.usageByDay = model.usageByDay;
            } 

            /**
             * UsageByDay.
             */
            public Builder usageByDay(java.util.List<UsageByDay> usageByDay) {
                this.usageByDay = usageByDay;
                return this;
            }

            public UsageByDays build() {
                return new UsageByDays(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainsUsageByDayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainsUsageByDayResponseBody</p>
     */
    public static class UsageTotal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BytesHitRate")
        private String bytesHitRate;

        @com.aliyun.core.annotation.NameInMap("MaxBps")
        private String maxBps;

        @com.aliyun.core.annotation.NameInMap("MaxBpsTime")
        private String maxBpsTime;

        @com.aliyun.core.annotation.NameInMap("MaxSrcBps")
        private String maxSrcBps;

        @com.aliyun.core.annotation.NameInMap("MaxSrcBpsTime")
        private String maxSrcBpsTime;

        @com.aliyun.core.annotation.NameInMap("RequestHitRate")
        private String requestHitRate;

        @com.aliyun.core.annotation.NameInMap("TotalAccess")
        private String totalAccess;

        @com.aliyun.core.annotation.NameInMap("TotalTraffic")
        private String totalTraffic;

        private UsageTotal(Builder builder) {
            this.bytesHitRate = builder.bytesHitRate;
            this.maxBps = builder.maxBps;
            this.maxBpsTime = builder.maxBpsTime;
            this.maxSrcBps = builder.maxSrcBps;
            this.maxSrcBpsTime = builder.maxSrcBpsTime;
            this.requestHitRate = builder.requestHitRate;
            this.totalAccess = builder.totalAccess;
            this.totalTraffic = builder.totalTraffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageTotal create() {
            return builder().build();
        }

        /**
         * @return bytesHitRate
         */
        public String getBytesHitRate() {
            return this.bytesHitRate;
        }

        /**
         * @return maxBps
         */
        public String getMaxBps() {
            return this.maxBps;
        }

        /**
         * @return maxBpsTime
         */
        public String getMaxBpsTime() {
            return this.maxBpsTime;
        }

        /**
         * @return maxSrcBps
         */
        public String getMaxSrcBps() {
            return this.maxSrcBps;
        }

        /**
         * @return maxSrcBpsTime
         */
        public String getMaxSrcBpsTime() {
            return this.maxSrcBpsTime;
        }

        /**
         * @return requestHitRate
         */
        public String getRequestHitRate() {
            return this.requestHitRate;
        }

        /**
         * @return totalAccess
         */
        public String getTotalAccess() {
            return this.totalAccess;
        }

        /**
         * @return totalTraffic
         */
        public String getTotalTraffic() {
            return this.totalTraffic;
        }

        public static final class Builder {
            private String bytesHitRate; 
            private String maxBps; 
            private String maxBpsTime; 
            private String maxSrcBps; 
            private String maxSrcBpsTime; 
            private String requestHitRate; 
            private String totalAccess; 
            private String totalTraffic; 

            private Builder() {
            } 

            private Builder(UsageTotal model) {
                this.bytesHitRate = model.bytesHitRate;
                this.maxBps = model.maxBps;
                this.maxBpsTime = model.maxBpsTime;
                this.maxSrcBps = model.maxSrcBps;
                this.maxSrcBpsTime = model.maxSrcBpsTime;
                this.requestHitRate = model.requestHitRate;
                this.totalAccess = model.totalAccess;
                this.totalTraffic = model.totalTraffic;
            } 

            /**
             * BytesHitRate.
             */
            public Builder bytesHitRate(String bytesHitRate) {
                this.bytesHitRate = bytesHitRate;
                return this;
            }

            /**
             * MaxBps.
             */
            public Builder maxBps(String maxBps) {
                this.maxBps = maxBps;
                return this;
            }

            /**
             * MaxBpsTime.
             */
            public Builder maxBpsTime(String maxBpsTime) {
                this.maxBpsTime = maxBpsTime;
                return this;
            }

            /**
             * MaxSrcBps.
             */
            public Builder maxSrcBps(String maxSrcBps) {
                this.maxSrcBps = maxSrcBps;
                return this;
            }

            /**
             * MaxSrcBpsTime.
             */
            public Builder maxSrcBpsTime(String maxSrcBpsTime) {
                this.maxSrcBpsTime = maxSrcBpsTime;
                return this;
            }

            /**
             * RequestHitRate.
             */
            public Builder requestHitRate(String requestHitRate) {
                this.requestHitRate = requestHitRate;
                return this;
            }

            /**
             * TotalAccess.
             */
            public Builder totalAccess(String totalAccess) {
                this.totalAccess = totalAccess;
                return this;
            }

            /**
             * TotalTraffic.
             */
            public Builder totalTraffic(String totalTraffic) {
                this.totalTraffic = totalTraffic;
                return this;
            }

            public UsageTotal build() {
                return new UsageTotal(this);
            } 

        } 

    }
}
