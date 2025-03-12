// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeDomainQpsListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainQpsListResponseBody</p>
 */
public class DescribeDomainQpsListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainQpsListResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainQpsListResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private String requestId; 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainQpsListResponseBody build() {
            return new DescribeDomainQpsListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainQpsListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainQpsListResponseBody</p>
     */
    public static class DataList extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalQps")
        private Long totalQps;

        private DataList(Builder builder) {
            this.attackQps = builder.attackQps;
            this.cacheHits = builder.cacheHits;
            this.index = builder.index;
            this.maxAttackQps = builder.maxAttackQps;
            this.maxNormalQps = builder.maxNormalQps;
            this.maxQps = builder.maxQps;
            this.totalCount = builder.totalCount;
            this.totalQps = builder.totalQps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
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

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
