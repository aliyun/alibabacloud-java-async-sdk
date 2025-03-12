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
 * {@link DescribeTopDomainsByFlowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTopDomainsByFlowResponseBody</p>
 */
public class DescribeTopDomainsByFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainCount")
    private Long domainCount;

    @com.aliyun.core.annotation.NameInMap("DomainOnlineCount")
    private Long domainOnlineCount;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("TopDomains")
    private TopDomains topDomains;

    private DescribeTopDomainsByFlowResponseBody(Builder builder) {
        this.domainCount = builder.domainCount;
        this.domainOnlineCount = builder.domainOnlineCount;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.topDomains = builder.topDomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTopDomainsByFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainCount
     */
    public Long getDomainCount() {
        return this.domainCount;
    }

    /**
     * @return domainOnlineCount
     */
    public Long getDomainOnlineCount() {
        return this.domainOnlineCount;
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
     * @return topDomains
     */
    public TopDomains getTopDomains() {
        return this.topDomains;
    }

    public static final class Builder {
        private Long domainCount; 
        private Long domainOnlineCount; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private TopDomains topDomains; 

        /**
         * <p>The total number of accelerated domain names that belong to the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        public Builder domainCount(Long domainCount) {
            this.domainCount = domainCount;
            return this;
        }

        /**
         * <p>The total number of accelerated domain names that are in the <strong>Enabled</strong> state within the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        public Builder domainOnlineCount(Long domainOnlineCount) {
            this.domainOnlineCount = domainOnlineCount;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-23T08:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4E09C5D7-E1CF-4CAA-A45E-8727F4C8FD70</p>
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
         * <p>The top N domain names ranked by network traffic.</p>
         */
        public Builder topDomains(TopDomains topDomains) {
            this.topDomains = topDomains;
            return this;
        }

        public DescribeTopDomainsByFlowResponseBody build() {
            return new DescribeTopDomainsByFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTopDomainsByFlowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTopDomainsByFlowResponseBody</p>
     */
    public static class TopDomain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("MaxBps")
        private Float maxBps;

        @com.aliyun.core.annotation.NameInMap("MaxBpsTime")
        private String maxBpsTime;

        @com.aliyun.core.annotation.NameInMap("Rank")
        private Long rank;

        @com.aliyun.core.annotation.NameInMap("TotalAccess")
        private Long totalAccess;

        @com.aliyun.core.annotation.NameInMap("TotalTraffic")
        private String totalTraffic;

        @com.aliyun.core.annotation.NameInMap("TrafficPercent")
        private String trafficPercent;

        private TopDomain(Builder builder) {
            this.domainName = builder.domainName;
            this.maxBps = builder.maxBps;
            this.maxBpsTime = builder.maxBpsTime;
            this.rank = builder.rank;
            this.totalAccess = builder.totalAccess;
            this.totalTraffic = builder.totalTraffic;
            this.trafficPercent = builder.trafficPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopDomain create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return maxBps
         */
        public Float getMaxBps() {
            return this.maxBps;
        }

        /**
         * @return maxBpsTime
         */
        public String getMaxBpsTime() {
            return this.maxBpsTime;
        }

        /**
         * @return rank
         */
        public Long getRank() {
            return this.rank;
        }

        /**
         * @return totalAccess
         */
        public Long getTotalAccess() {
            return this.totalAccess;
        }

        /**
         * @return totalTraffic
         */
        public String getTotalTraffic() {
            return this.totalTraffic;
        }

        /**
         * @return trafficPercent
         */
        public String getTrafficPercent() {
            return this.trafficPercent;
        }

        public static final class Builder {
            private String domainName; 
            private Float maxBps; 
            private String maxBpsTime; 
            private Long rank; 
            private Long totalAccess; 
            private String totalTraffic; 
            private String trafficPercent; 

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
             * <p>The peak bandwidth value.</p>
             * 
             * <strong>example:</strong>
             * <p>22139626</p>
             */
            public Builder maxBps(Float maxBps) {
                this.maxBps = maxBps;
                return this;
            }

            /**
             * <p>The time when the bandwidth reached the peak value.</p>
             * 
             * <strong>example:</strong>
             * <p>1457111400</p>
             */
            public Builder maxBpsTime(String maxBpsTime) {
                this.maxBpsTime = maxBpsTime;
                return this;
            }

            /**
             * <p>The ranking of the accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rank(Long rank) {
                this.rank = rank;
                return this;
            }

            /**
             * <p>The number of visits to the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>107784230</p>
             */
            public Builder totalAccess(Long totalAccess) {
                this.totalAccess = totalAccess;
                return this;
            }

            /**
             * <p>The total volume of traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>2043859876683.9001</p>
             */
            public Builder totalTraffic(String totalTraffic) {
                this.totalTraffic = totalTraffic;
                return this;
            }

            /**
             * <p>The proportion of network traffic consumed to access the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>30.64191989360235</p>
             */
            public Builder trafficPercent(String trafficPercent) {
                this.trafficPercent = trafficPercent;
                return this;
            }

            public TopDomain build() {
                return new TopDomain(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTopDomainsByFlowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTopDomainsByFlowResponseBody</p>
     */
    public static class TopDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TopDomain")
        private java.util.List<TopDomain> topDomain;

        private TopDomains(Builder builder) {
            this.topDomain = builder.topDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopDomains create() {
            return builder().build();
        }

        /**
         * @return topDomain
         */
        public java.util.List<TopDomain> getTopDomain() {
            return this.topDomain;
        }

        public static final class Builder {
            private java.util.List<TopDomain> topDomain; 

            /**
             * TopDomain.
             */
            public Builder topDomain(java.util.List<TopDomain> topDomain) {
                this.topDomain = topDomain;
                return this;
            }

            public TopDomains build() {
                return new TopDomains(this);
            } 

        } 

    }
}
