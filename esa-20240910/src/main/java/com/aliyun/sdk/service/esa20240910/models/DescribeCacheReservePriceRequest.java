// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeCacheReservePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeCacheReservePriceRequest</p>
 */
public class DescribeCacheReservePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrRegion")
    private String crRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaGb")
    private Long quotaGb;

    private DescribeCacheReservePriceRequest(Builder builder) {
        super(builder);
        this.crRegion = builder.crRegion;
        this.period = builder.period;
        this.quotaGb = builder.quotaGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCacheReservePriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crRegion
     */
    public String getCrRegion() {
        return this.crRegion;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return quotaGb
     */
    public Long getQuotaGb() {
        return this.quotaGb;
    }

    public static final class Builder extends Request.Builder<DescribeCacheReservePriceRequest, Builder> {
        private String crRegion; 
        private Integer period; 
        private Long quotaGb; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCacheReservePriceRequest request) {
            super(request);
            this.crRegion = request.crRegion;
            this.period = request.period;
            this.quotaGb = request.quotaGb;
        } 

        /**
         * CrRegion.
         */
        public Builder crRegion(String crRegion) {
            this.putQueryParameter("CrRegion", crRegion);
            this.crRegion = crRegion;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * QuotaGb.
         */
        public Builder quotaGb(Long quotaGb) {
            this.putQueryParameter("QuotaGb", quotaGb);
            this.quotaGb = quotaGb;
            return this;
        }

        @Override
        public DescribeCacheReservePriceRequest build() {
            return new DescribeCacheReservePriceRequest(this);
        } 

    } 

}
