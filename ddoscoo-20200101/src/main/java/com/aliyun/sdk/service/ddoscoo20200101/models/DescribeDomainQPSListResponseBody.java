// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainQPSListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainQPSListResponseBody</p>
 */
public class DescribeDomainQPSListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainQPSList")
    private java.util.List < DomainQPSList> domainQPSList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainQPSListResponseBody(Builder builder) {
        this.domainQPSList = builder.domainQPSList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainQPSListResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainQPSList
     */
    public java.util.List < DomainQPSList> getDomainQPSList() {
        return this.domainQPSList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainQPSList> domainQPSList; 
        private String requestId; 

        /**
         * An array that consists of the statistics on the QPS of the website.
         */
        public Builder domainQPSList(java.util.List < DomainQPSList> domainQPSList) {
            this.domainQPSList = domainQPSList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainQPSListResponseBody build() {
            return new DescribeDomainQPSListResponseBody(this);
        } 

    } 

    public static class DomainQPSList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackQps")
        private Long attackQps;

        @com.aliyun.core.annotation.NameInMap("CacheHits")
        private Long cacheHits;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("MaxAttackQps")
        private Long maxAttackQps;

        @com.aliyun.core.annotation.NameInMap("MaxNormalQps")
        private Long maxNormalQps;

        @com.aliyun.core.annotation.NameInMap("MaxQps")
        private Long maxQps;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalQps")
        private Long totalQps;

        private DomainQPSList(Builder builder) {
            this.attackQps = builder.attackQps;
            this.cacheHits = builder.cacheHits;
            this.index = builder.index;
            this.maxAttackQps = builder.maxAttackQps;
            this.maxNormalQps = builder.maxNormalQps;
            this.maxQps = builder.maxQps;
            this.time = builder.time;
            this.totalCount = builder.totalCount;
            this.totalQps = builder.totalQps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainQPSList create() {
            return builder().build();
        }

        /**
         * @return attackQps
         */
        public Long getAttackQps() {
            return this.attackQps;
        }

        /**
         * @return cacheHits
         */
        public Long getCacheHits() {
            return this.cacheHits;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return maxAttackQps
         */
        public Long getMaxAttackQps() {
            return this.maxAttackQps;
        }

        /**
         * @return maxNormalQps
         */
        public Long getMaxNormalQps() {
            return this.maxNormalQps;
        }

        /**
         * @return maxQps
         */
        public Long getMaxQps() {
            return this.maxQps;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalQps
         */
        public Long getTotalQps() {
            return this.totalQps;
        }

        public static final class Builder {
            private Long attackQps; 
            private Long cacheHits; 
            private Long index; 
            private Long maxAttackQps; 
            private Long maxNormalQps; 
            private Long maxQps; 
            private Long time; 
            private Long totalCount; 
            private Long totalQps; 

            /**
             * The attack QPS.
             */
            public Builder attackQps(Long attackQps) {
                this.attackQps = attackQps;
                return this;
            }

            /**
             * The number of cache hits.
             */
            public Builder cacheHits(Long cacheHits) {
                this.cacheHits = cacheHits;
                return this;
            }

            /**
             * The index number of the returned data.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * The peak attack QPS.
             */
            public Builder maxAttackQps(Long maxAttackQps) {
                this.maxAttackQps = maxAttackQps;
                return this;
            }

            /**
             * The peak of normal QPS.
             */
            public Builder maxNormalQps(Long maxNormalQps) {
                this.maxNormalQps = maxNormalQps;
                return this;
            }

            /**
             * The peak of total QPS.
             */
            public Builder maxQps(Long maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * The time when the data was collected. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * The total number of requests.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The total QPS.
             */
            public Builder totalQps(Long totalQps) {
                this.totalQps = totalQps;
                return this;
            }

            public DomainQPSList build() {
                return new DomainQPSList(this);
            } 

        } 

    }
}
