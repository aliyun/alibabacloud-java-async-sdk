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
 * {@link DescribeDomainQpsWithCacheResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainQpsWithCacheResponseBody</p>
 */
public class DescribeDomainQpsWithCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Blocks")
    private java.util.List<String> blocks;

    @com.aliyun.core.annotation.NameInMap("CacheHits")
    private java.util.List<String> cacheHits;

    @com.aliyun.core.annotation.NameInMap("CcBlockQps")
    private java.util.List<String> ccBlockQps;

    @com.aliyun.core.annotation.NameInMap("CcJsQps")
    private java.util.List<String> ccJsQps;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("IpBlockQps")
    private java.util.List<String> ipBlockQps;

    @com.aliyun.core.annotation.NameInMap("PreciseBlocks")
    private java.util.List<String> preciseBlocks;

    @com.aliyun.core.annotation.NameInMap("PreciseJsQps")
    private java.util.List<String> preciseJsQps;

    @com.aliyun.core.annotation.NameInMap("RegionBlocks")
    private java.util.List<String> regionBlocks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("Totals")
    private java.util.List<String> totals;

    private DescribeDomainQpsWithCacheResponseBody(Builder builder) {
        this.blocks = builder.blocks;
        this.cacheHits = builder.cacheHits;
        this.ccBlockQps = builder.ccBlockQps;
        this.ccJsQps = builder.ccJsQps;
        this.interval = builder.interval;
        this.ipBlockQps = builder.ipBlockQps;
        this.preciseBlocks = builder.preciseBlocks;
        this.preciseJsQps = builder.preciseJsQps;
        this.regionBlocks = builder.regionBlocks;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.totals = builder.totals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainQpsWithCacheResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blocks
     */
    public java.util.List<String> getBlocks() {
        return this.blocks;
    }

    /**
     * @return cacheHits
     */
    public java.util.List<String> getCacheHits() {
        return this.cacheHits;
    }

    /**
     * @return ccBlockQps
     */
    public java.util.List<String> getCcBlockQps() {
        return this.ccBlockQps;
    }

    /**
     * @return ccJsQps
     */
    public java.util.List<String> getCcJsQps() {
        return this.ccJsQps;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return ipBlockQps
     */
    public java.util.List<String> getIpBlockQps() {
        return this.ipBlockQps;
    }

    /**
     * @return preciseBlocks
     */
    public java.util.List<String> getPreciseBlocks() {
        return this.preciseBlocks;
    }

    /**
     * @return preciseJsQps
     */
    public java.util.List<String> getPreciseJsQps() {
        return this.preciseJsQps;
    }

    /**
     * @return regionBlocks
     */
    public java.util.List<String> getRegionBlocks() {
        return this.regionBlocks;
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
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return totals
     */
    public java.util.List<String> getTotals() {
        return this.totals;
    }

    public static final class Builder {
        private java.util.List<String> blocks; 
        private java.util.List<String> cacheHits; 
        private java.util.List<String> ccBlockQps; 
        private java.util.List<String> ccJsQps; 
        private Integer interval; 
        private java.util.List<String> ipBlockQps; 
        private java.util.List<String> preciseBlocks; 
        private java.util.List<String> preciseJsQps; 
        private java.util.List<String> regionBlocks; 
        private String requestId; 
        private Long startTime; 
        private java.util.List<String> totals; 

        private Builder() {
        } 

        private Builder(DescribeDomainQpsWithCacheResponseBody model) {
            this.blocks = model.blocks;
            this.cacheHits = model.cacheHits;
            this.ccBlockQps = model.ccBlockQps;
            this.ccJsQps = model.ccJsQps;
            this.interval = model.interval;
            this.ipBlockQps = model.ipBlockQps;
            this.preciseBlocks = model.preciseBlocks;
            this.preciseJsQps = model.preciseJsQps;
            this.regionBlocks = model.regionBlocks;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.totals = model.totals;
        } 

        /**
         * Blocks.
         */
        public Builder blocks(java.util.List<String> blocks) {
            this.blocks = blocks;
            return this;
        }

        /**
         * CacheHits.
         */
        public Builder cacheHits(java.util.List<String> cacheHits) {
            this.cacheHits = cacheHits;
            return this;
        }

        /**
         * CcBlockQps.
         */
        public Builder ccBlockQps(java.util.List<String> ccBlockQps) {
            this.ccBlockQps = ccBlockQps;
            return this;
        }

        /**
         * CcJsQps.
         */
        public Builder ccJsQps(java.util.List<String> ccJsQps) {
            this.ccJsQps = ccJsQps;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * IpBlockQps.
         */
        public Builder ipBlockQps(java.util.List<String> ipBlockQps) {
            this.ipBlockQps = ipBlockQps;
            return this;
        }

        /**
         * PreciseBlocks.
         */
        public Builder preciseBlocks(java.util.List<String> preciseBlocks) {
            this.preciseBlocks = preciseBlocks;
            return this;
        }

        /**
         * PreciseJsQps.
         */
        public Builder preciseJsQps(java.util.List<String> preciseJsQps) {
            this.preciseJsQps = preciseJsQps;
            return this;
        }

        /**
         * RegionBlocks.
         */
        public Builder regionBlocks(java.util.List<String> regionBlocks) {
            this.regionBlocks = regionBlocks;
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
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Totals.
         */
        public Builder totals(java.util.List<String> totals) {
            this.totals = totals;
            return this;
        }

        public DescribeDomainQpsWithCacheResponseBody build() {
            return new DescribeDomainQpsWithCacheResponseBody(this);
        } 

    } 

}
