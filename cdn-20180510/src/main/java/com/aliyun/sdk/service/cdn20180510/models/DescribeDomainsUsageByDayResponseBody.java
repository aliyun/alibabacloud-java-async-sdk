// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainsUsageByDayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainsUsageByDayResponseBody</p>
 */
public class DescribeDomainsUsageByDayResponseBody extends TeaModel {
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

    private DescribeDomainsUsageByDayResponseBody(Builder builder) {
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

    public static DescribeDomainsUsageByDayResponseBody create() {
        return builder().build();
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

        /**
         * The time interval between the data entries returned. Unit: seconds.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * The accelerated domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range during which data was queried.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
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
         * The start of the time range during which data was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The monitoring data collected at each time interval.
         */
        public Builder usageByDays(UsageByDays usageByDays) {
            this.usageByDays = usageByDays;
            return this;
        }

        /**
         * The summarized monitoring data.
         */
        public Builder usageTotal(UsageTotal usageTotal) {
            this.usageTotal = usageTotal;
            return this;
        }

        public DescribeDomainsUsageByDayResponseBody build() {
            return new DescribeDomainsUsageByDayResponseBody(this);
        } 

    } 

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

            /**
             * The byte hit ratio. The byte hit ratio is measured in percentage.
             */
            public Builder bytesHitRate(String bytesHitRate) {
                this.bytesHitRate = bytesHitRate;
                return this;
            }

            /**
             * The peak bandwidth value. Unit: bit/s.
             */
            public Builder maxBps(String maxBps) {
                this.maxBps = maxBps;
                return this;
            }

            /**
             * The time when the bandwidth reached the peak value.
             */
            public Builder maxBpsTime(String maxBpsTime) {
                this.maxBpsTime = maxBpsTime;
                return this;
            }

            /**
             * The peak bandwidth value during back-to-origin routing. Unit: bit/s.
             */
            public Builder maxSrcBps(String maxSrcBps) {
                this.maxSrcBps = maxSrcBps;
                return this;
            }

            /**
             * The time when the bandwidth during back-to-origin routing reached the peak value.
             */
            public Builder maxSrcBpsTime(String maxSrcBpsTime) {
                this.maxSrcBpsTime = maxSrcBpsTime;
                return this;
            }

            /**
             * The number of queries per second (QPS).
             */
            public Builder qps(String qps) {
                this.qps = qps;
                return this;
            }

            /**
             * The cache hit ratio that is calculated based on requests. The cache hit ratio is measured in percentage.
             */
            public Builder requestHitRate(String requestHitRate) {
                this.requestHitRate = requestHitRate;
                return this;
            }

            /**
             * The timestamp of the data returned.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The total amount of requests.
             */
            public Builder totalAccess(String totalAccess) {
                this.totalAccess = totalAccess;
                return this;
            }

            /**
             * The total amount of network traffic. Unit: bytes.
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
    public static class UsageByDays extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UsageByDay")
        private java.util.List < UsageByDay> usageByDay;

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
        public java.util.List < UsageByDay> getUsageByDay() {
            return this.usageByDay;
        }

        public static final class Builder {
            private java.util.List < UsageByDay> usageByDay; 

            /**
             * UsageByDay.
             */
            public Builder usageByDay(java.util.List < UsageByDay> usageByDay) {
                this.usageByDay = usageByDay;
                return this;
            }

            public UsageByDays build() {
                return new UsageByDays(this);
            } 

        } 

    }
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

            /**
             * The byte hit ratio. The byte hit ratio is measured in percentage.
             */
            public Builder bytesHitRate(String bytesHitRate) {
                this.bytesHitRate = bytesHitRate;
                return this;
            }

            /**
             * The peak bandwidth value. Unit: bit/s.
             */
            public Builder maxBps(String maxBps) {
                this.maxBps = maxBps;
                return this;
            }

            /**
             * The time when the bandwidth reached the peak value.
             */
            public Builder maxBpsTime(String maxBpsTime) {
                this.maxBpsTime = maxBpsTime;
                return this;
            }

            /**
             * The peak bandwidth value during back-to-origin routing. Unit: bit/s.
             */
            public Builder maxSrcBps(String maxSrcBps) {
                this.maxSrcBps = maxSrcBps;
                return this;
            }

            /**
             * The time when the bandwidth during back-to-origin routing reached the peak value.
             */
            public Builder maxSrcBpsTime(String maxSrcBpsTime) {
                this.maxSrcBpsTime = maxSrcBpsTime;
                return this;
            }

            /**
             * The cache hit ratio that is calculated based on requests. The cache hit ratio is measured in percentage.
             */
            public Builder requestHitRate(String requestHitRate) {
                this.requestHitRate = requestHitRate;
                return this;
            }

            /**
             * The total amount of requests.
             */
            public Builder totalAccess(String totalAccess) {
                this.totalAccess = totalAccess;
                return this;
            }

            /**
             * The total amount of network traffic. Unit: bytes.
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
