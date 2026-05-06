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
 * {@link DescribeRatePlanPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeRatePlanPriceRequest</p>
 */
public class DescribeRatePlanPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(maximum = 99, minimum = 1)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanName")
    private String planName;

    private DescribeRatePlanPriceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.period = builder.period;
        this.planName = builder.planName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRatePlanPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    public static final class Builder extends Request.Builder<DescribeRatePlanPriceRequest, Builder> {
        private Integer amount; 
        private Integer period; 
        private String planName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRatePlanPriceRequest request) {
            super(request);
            this.amount = request.amount;
            this.period = request.period;
            this.planName = request.planName;
        } 

        /**
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
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
         * PlanName.
         */
        public Builder planName(String planName) {
            this.putQueryParameter("PlanName", planName);
            this.planName = planName;
            return this;
        }

        @Override
        public DescribeRatePlanPriceRequest build() {
            return new DescribeRatePlanPriceRequest(this);
        } 

    } 

}
