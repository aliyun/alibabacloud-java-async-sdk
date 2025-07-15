// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveTopDomainsByFlowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveTopDomainsByFlowResponseBody</p>
 */
public class DescribeLiveTopDomainsByFlowResponseBody extends TeaModel {
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

    private DescribeLiveTopDomainsByFlowResponseBody(Builder builder) {
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

    public static DescribeLiveTopDomainsByFlowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveTopDomainsByFlowResponseBody model) {
            this.domainCount = model.domainCount;
            this.domainOnlineCount = model.domainOnlineCount;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.topDomains = model.topDomains;
        } 

        /**
         * <p>The total number of domain names in your account.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder domainCount(Long domainCount) {
            this.domainCount = domainCount;
            return this;
        }

        /**
         * <p>The total number of domain names that are in the Enabled state in your account.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder domainOnlineCount(Long domainOnlineCount) {
            this.domainOnlineCount = domainOnlineCount;
            return this;
        }

        /**
         * <p>The end of the time range for which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-20T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>33834C3E-388E-5FFE-A8AE-63575035C064</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range for which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-17T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The top domain names ranked by traffic.</p>
         */
        public Builder topDomains(TopDomains topDomains) {
            this.topDomains = topDomains;
            return this;
        }

        public DescribeLiveTopDomainsByFlowResponseBody build() {
            return new DescribeLiveTopDomainsByFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveTopDomainsByFlowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveTopDomainsByFlowResponseBody</p>
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

            private Builder() {
            } 

            private Builder(TopDomain model) {
                this.domainName = model.domainName;
                this.maxBps = model.maxBps;
                this.maxBpsTime = model.maxBpsTime;
                this.rank = model.rank;
                this.totalAccess = model.totalAccess;
                this.totalTraffic = model.totalTraffic;
                this.trafficPercent = model.trafficPercent;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The peak bandwidth of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>22139626</p>
             */
            public Builder maxBps(Long maxBps) {
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
             * <p>The ranking of the domain name.</p>
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
             * <p>The total traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>2043859876683.9001</p>
             */
            public Builder totalTraffic(String totalTraffic) {
                this.totalTraffic = totalTraffic;
                return this;
            }

            /**
             * <p>The traffic share of the domain name relative to the total traffic.</p>
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
     * {@link DescribeLiveTopDomainsByFlowResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveTopDomainsByFlowResponseBody</p>
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

            private Builder() {
            } 

            private Builder(TopDomains model) {
                this.topDomain = model.topDomain;
            } 

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
