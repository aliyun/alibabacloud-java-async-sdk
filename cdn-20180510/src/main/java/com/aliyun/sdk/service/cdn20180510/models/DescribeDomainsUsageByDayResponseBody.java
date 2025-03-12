// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
         * <p>The time interval between the data entries returned. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-23T09:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C88EF8ED-72F0-45EA-9E86-95114E224FC5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-22T08:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The monitoring data collected at each time interval.</p>
         */
        public Builder usageByDays(UsageByDays usageByDays) {
            this.usageByDays = usageByDays;
            return this;
        }

        /**
         * <p>The summarized monitoring data.</p>
         */
        public Builder usageTotal(UsageTotal usageTotal) {
            this.usageTotal = usageTotal;
            return this;
        }

        public DescribeDomainsUsageByDayResponseBody build() {
            return new DescribeDomainsUsageByDayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainsUsageByDayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsUsageByDayResponseBody</p>
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

            /**
             * <p>The byte hit ratio. The byte hit ratio is measured in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>97.46250599529726</p>
             */
            public Builder bytesHitRate(String bytesHitRate) {
                this.bytesHitRate = bytesHitRate;
                return this;
            }

            /**
             * <p>The peak bandwidth value. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>306747.76</p>
             */
            public Builder maxBps(String maxBps) {
                this.maxBps = maxBps;
                return this;
            }

            /**
             * <p>The time when the bandwidth reached the peak value.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-23 10:55:00</p>
             */
            public Builder maxBpsTime(String maxBpsTime) {
                this.maxBpsTime = maxBpsTime;
                return this;
            }

            /**
             * <p>The peak bandwidth value during back-to-origin routing. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>72584.072</p>
             */
            public Builder maxSrcBps(String maxSrcBps) {
                this.maxSrcBps = maxSrcBps;
                return this;
            }

            /**
             * <p>The time when the bandwidth during back-to-origin routing reached the peak value.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-23 11:45:00</p>
             */
            public Builder maxSrcBpsTime(String maxSrcBpsTime) {
                this.maxSrcBpsTime = maxSrcBpsTime;
                return this;
            }

            /**
             * <p>The number of queries per second (QPS).</p>
             * 
             * <strong>example:</strong>
             * <p>7.466354166666667</p>
             */
            public Builder qps(String qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The cache hit ratio that is calculated based on requests. The cache hit ratio is measured in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>70.24770071912111</p>
             */
            public Builder requestHitRate(String requestHitRate) {
                this.requestHitRate = requestHitRate;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-22</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The total amount of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>645093</p>
             */
            public Builder totalAccess(String totalAccess) {
                this.totalAccess = totalAccess;
                return this;
            }

            /**
             * <p>The total amount of network traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>564300099309</p>
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
     * {@link DescribeDomainsUsageByDayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsUsageByDayResponseBody</p>
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
     * {@link DescribeDomainsUsageByDayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsUsageByDayResponseBody</p>
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

            /**
             * <p>The byte hit ratio. The byte hit ratio is measured in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>97.03110726801242</p>
             */
            public Builder bytesHitRate(String bytesHitRate) {
                this.bytesHitRate = bytesHitRate;
                return this;
            }

            /**
             * <p>The peak bandwidth value. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0747912780000001E8</p>
             */
            public Builder maxBps(String maxBps) {
                this.maxBps = maxBps;
                return this;
            }

            /**
             * <p>The time when the bandwidth reached the peak value.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-23 10:55:00</p>
             */
            public Builder maxBpsTime(String maxBpsTime) {
                this.maxBpsTime = maxBpsTime;
                return this;
            }

            /**
             * <p>The peak bandwidth value during back-to-origin routing. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>72584.072</p>
             */
            public Builder maxSrcBps(String maxSrcBps) {
                this.maxSrcBps = maxSrcBps;
                return this;
            }

            /**
             * <p>The time when the bandwidth during back-to-origin routing reached the peak value.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-23 11:45:00</p>
             */
            public Builder maxSrcBpsTime(String maxSrcBpsTime) {
                this.maxSrcBpsTime = maxSrcBpsTime;
                return this;
            }

            /**
             * <p>The cache hit ratio that is calculated based on requests. The cache hit ratio is measured in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>69.92610837438424</p>
             */
            public Builder requestHitRate(String requestHitRate) {
                this.requestHitRate = requestHitRate;
                return this;
            }

            /**
             * <p>The total amount of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>1319500</p>
             */
            public Builder totalAccess(String totalAccess) {
                this.totalAccess = totalAccess;
                return this;
            }

            /**
             * <p>The total amount of network traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1117711832100</p>
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
