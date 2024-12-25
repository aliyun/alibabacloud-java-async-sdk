// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeVsTopDomainsByFlowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsTopDomainsByFlowResponseBody</p>
 */
public class DescribeVsTopDomainsByFlowResponseBody extends TeaModel {
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

    private DescribeVsTopDomainsByFlowResponseBody(Builder builder) {
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

    public static DescribeVsTopDomainsByFlowResponseBody create() {
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
         * DomainCount.
         */
        public Builder domainCount(Long domainCount) {
            this.domainCount = domainCount;
            return this;
        }

        /**
         * DomainOnlineCount.
         */
        public Builder domainOnlineCount(Long domainOnlineCount) {
            this.domainOnlineCount = domainOnlineCount;
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
         * TopDomains.
         */
        public Builder topDomains(TopDomains topDomains) {
            this.topDomains = topDomains;
            return this;
        }

        public DescribeVsTopDomainsByFlowResponseBody build() {
            return new DescribeVsTopDomainsByFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVsTopDomainsByFlowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsTopDomainsByFlowResponseBody</p>
     */
    public static class TopDomain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("MaxBps")
        private Long maxBps;

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
        public Long getMaxBps() {
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
            private Long maxBps; 
            private String maxBpsTime; 
            private Long rank; 
            private Long totalAccess; 
            private String totalTraffic; 
            private String trafficPercent; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * MaxBps.
             */
            public Builder maxBps(Long maxBps) {
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
             * Rank.
             */
            public Builder rank(Long rank) {
                this.rank = rank;
                return this;
            }

            /**
             * TotalAccess.
             */
            public Builder totalAccess(Long totalAccess) {
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

            /**
             * TrafficPercent.
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
     * {@link DescribeVsTopDomainsByFlowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsTopDomainsByFlowResponseBody</p>
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
