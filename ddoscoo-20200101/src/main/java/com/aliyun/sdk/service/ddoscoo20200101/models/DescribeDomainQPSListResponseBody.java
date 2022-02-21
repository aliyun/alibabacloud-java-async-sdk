// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainQPSListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainQPSListResponseBody</p>
 */
public class DescribeDomainQPSListResponseBody extends TeaModel {
    @NameInMap("DomainQPSList")
    private java.util.List < DomainQPSList> domainQPSList;

    @NameInMap("RequestId")
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
         * DomainQPSList.
         */
        public Builder domainQPSList(java.util.List < DomainQPSList> domainQPSList) {
            this.domainQPSList = domainQPSList;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AttackQps")
        private Long attackQps;

        @NameInMap("CacheHits")
        private Long cacheHits;

        @NameInMap("Index")
        private Long index;

        @NameInMap("MaxAttackQps")
        private Long maxAttackQps;

        @NameInMap("MaxNormalQps")
        private Long maxNormalQps;

        @NameInMap("MaxQps")
        private Long maxQps;

        @NameInMap("Time")
        private Long time;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("TotalQps")
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
             * AttackQps.
             */
            public Builder attackQps(Long attackQps) {
                this.attackQps = attackQps;
                return this;
            }

            /**
             * CacheHits.
             */
            public Builder cacheHits(Long cacheHits) {
                this.cacheHits = cacheHits;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * MaxAttackQps.
             */
            public Builder maxAttackQps(Long maxAttackQps) {
                this.maxAttackQps = maxAttackQps;
                return this;
            }

            /**
             * MaxNormalQps.
             */
            public Builder maxNormalQps(Long maxNormalQps) {
                this.maxNormalQps = maxNormalQps;
                return this;
            }

            /**
             * MaxQps.
             */
            public Builder maxQps(Long maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalQps.
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
