// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceForRenewDesktopOversoldGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceForRenewDesktopOversoldGroupRequest</p>
 */
public class DescribePriceForRenewDesktopOversoldGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldGroupId")
    private String oversoldGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    private DescribePriceForRenewDesktopOversoldGroupRequest(Builder builder) {
        super(builder);
        this.oversoldGroupId = builder.oversoldGroupId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceForRenewDesktopOversoldGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return oversoldGroupId
     */
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public static final class Builder extends Request.Builder<DescribePriceForRenewDesktopOversoldGroupRequest, Builder> {
        private String oversoldGroupId; 
        private Integer period; 
        private String periodUnit; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceForRenewDesktopOversoldGroupRequest request) {
            super(request);
            this.oversoldGroupId = request.oversoldGroupId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
        } 

        /**
         * OversoldGroupId.
         */
        public Builder oversoldGroupId(String oversoldGroupId) {
            this.putQueryParameter("OversoldGroupId", oversoldGroupId);
            this.oversoldGroupId = oversoldGroupId;
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
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        @Override
        public DescribePriceForRenewDesktopOversoldGroupRequest build() {
            return new DescribePriceForRenewDesktopOversoldGroupRequest(this);
        } 

    } 

}
