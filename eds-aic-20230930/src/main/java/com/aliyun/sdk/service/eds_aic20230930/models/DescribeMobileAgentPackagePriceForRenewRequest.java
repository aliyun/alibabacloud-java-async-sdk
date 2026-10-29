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
 * {@link DescribeMobileAgentPackagePriceForRenewRequest} extends {@link RequestModel}
 *
 * <p>DescribeMobileAgentPackagePriceForRenewRequest</p>
 */
public class DescribeMobileAgentPackagePriceForRenewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileAgentPackageIds")
    private java.util.List<String> mobileAgentPackageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    private DescribeMobileAgentPackagePriceForRenewRequest(Builder builder) {
        super(builder);
        this.mobileAgentPackageIds = builder.mobileAgentPackageIds;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMobileAgentPackagePriceForRenewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mobileAgentPackageIds
     */
    public java.util.List<String> getMobileAgentPackageIds() {
        return this.mobileAgentPackageIds;
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

    public static final class Builder extends Request.Builder<DescribeMobileAgentPackagePriceForRenewRequest, Builder> {
        private java.util.List<String> mobileAgentPackageIds; 
        private String period; 
        private String periodUnit; 
        private String promotionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMobileAgentPackagePriceForRenewRequest request) {
            super(request);
            this.mobileAgentPackageIds = request.mobileAgentPackageIds;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
        } 

        /**
         * <p>The IDs of the MobileAgent resource plans.</p>
         */
        public Builder mobileAgentPackageIds(java.util.List<String> mobileAgentPackageIds) {
            this.putQueryParameter("MobileAgentPackageIds", mobileAgentPackageIds);
            this.mobileAgentPackageIds = mobileAgentPackageIds;
            return this;
        }

        /**
         * <p>The subscription period of the resource. The unit is specified by PeriodUnit. Valid values: 1 month, 2 months, 3 months, 6 months, and 1 year.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription period. Valid values:</p>
         * <ul>
         * <li><strong>Month</strong>: Month.</li>
         * <li><strong>Year</strong>: Year.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50003308011****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        @Override
        public DescribeMobileAgentPackagePriceForRenewRequest build() {
            return new DescribeMobileAgentPackagePriceForRenewRequest(this);
        } 

    } 

}
