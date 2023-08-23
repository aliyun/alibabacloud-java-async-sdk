// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTopDomainsByFlowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTopDomainsByFlowResponseBody</p>
 */
public class DescribeTopDomainsByFlowResponseBody extends TeaModel {
    @NameInMap("DomainCount")
    private Long domainCount;

    @NameInMap("DomainOnlineCount")
    private Long domainOnlineCount;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("TopDomains")
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
         * The total number of accelerated domain names that belong to the current Alibaba Cloud account.
         */
        public Builder domainCount(Long domainCount) {
            this.domainCount = domainCount;
            return this;
        }

        /**
         * The total number of accelerated domain names that are in the **Enabled** state within the current Alibaba Cloud account.
         */
        public Builder domainOnlineCount(Long domainOnlineCount) {
            this.domainOnlineCount = domainOnlineCount;
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
         * The top N domain names ranked by network traffic.
         */
        public Builder topDomains(TopDomains topDomains) {
            this.topDomains = topDomains;
            return this;
        }

        public DescribeTopDomainsByFlowResponseBody build() {
            return new DescribeTopDomainsByFlowResponseBody(this);
        } 

    } 

    public static class TopDomain extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("MaxBps")
        private Float maxBps;

        @NameInMap("MaxBpsTime")
        private String maxBpsTime;

        @NameInMap("Rank")
        private Long rank;

        @NameInMap("TotalAccess")
        private Long totalAccess;

        @NameInMap("TotalTraffic")
        private String totalTraffic;

        @NameInMap("TrafficPercent")
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
             * The accelerated domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The peak bandwidth value.
             */
            public Builder maxBps(Float maxBps) {
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
             * The ranking of the accelerated domain name.
             */
            public Builder rank(Long rank) {
                this.rank = rank;
                return this;
            }

            /**
             * The number of visits to the domain name.
             */
            public Builder totalAccess(Long totalAccess) {
                this.totalAccess = totalAccess;
                return this;
            }

            /**
             * The total volume of traffic.
             */
            public Builder totalTraffic(String totalTraffic) {
                this.totalTraffic = totalTraffic;
                return this;
            }

            /**
             * The proportion of network traffic consumed to access the domain name.
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
    public static class TopDomains extends TeaModel {
        @NameInMap("TopDomain")
        private java.util.List < TopDomain> topDomain;

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
        public java.util.List < TopDomain> getTopDomain() {
            return this.topDomain;
        }

        public static final class Builder {
            private java.util.List < TopDomain> topDomain; 

            /**
             * TopDomain.
             */
            public Builder topDomain(java.util.List < TopDomain> topDomain) {
                this.topDomain = topDomain;
                return this;
            }

            public TopDomains build() {
                return new TopDomains(this);
            } 

        } 

    }
}
