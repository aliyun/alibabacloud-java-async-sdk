// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeMobileAgentPackagePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeMobileAgentPackagePriceRequest</p>
 */
public class DescribeMobileAgentPackagePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    private String amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditAmount")
    private Integer creditAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileAgentPackageSpec")
    private String mobileAgentPackageSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    private DescribeMobileAgentPackagePriceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.bizRegionId = builder.bizRegionId;
        this.creditAmount = builder.creditAmount;
        this.mobileAgentPackageSpec = builder.mobileAgentPackageSpec;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMobileAgentPackagePriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return creditAmount
     */
    public Integer getCreditAmount() {
        return this.creditAmount;
    }

    /**
     * @return mobileAgentPackageSpec
     */
    public String getMobileAgentPackageSpec() {
        return this.mobileAgentPackageSpec;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    public static final class Builder extends Request.Builder<DescribeMobileAgentPackagePriceRequest, Builder> {
        private String amount; 
        private String bizRegionId; 
        private Integer creditAmount; 
        private String mobileAgentPackageSpec; 
        private String period; 
        private String periodUnit; 
        private String promotionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMobileAgentPackagePriceRequest request) {
            super(request);
            this.amount = request.amount;
            this.bizRegionId = request.bizRegionId;
            this.creditAmount = request.creditAmount;
            this.mobileAgentPackageSpec = request.mobileAgentPackageSpec;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
        } 

        /**
         * Amount.
         */
        public Builder amount(String amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * CreditAmount.
         */
        public Builder creditAmount(Integer creditAmount) {
            this.putQueryParameter("CreditAmount", creditAmount);
            this.creditAmount = creditAmount;
            return this;
        }

        /**
         * MobileAgentPackageSpec.
         */
        public Builder mobileAgentPackageSpec(String mobileAgentPackageSpec) {
            this.putQueryParameter("MobileAgentPackageSpec", mobileAgentPackageSpec);
            this.mobileAgentPackageSpec = mobileAgentPackageSpec;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
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

        /**
         * PromotionId.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        @Override
        public DescribeMobileAgentPackagePriceRequest build() {
            return new DescribeMobileAgentPackagePriceRequest(this);
        } 

    } 

}
