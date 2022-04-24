// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMonthlyBillRequest} extends {@link RequestModel}
 *
 * <p>QueryMonthlyBillRequest</p>
 */
public class QueryMonthlyBillRequest extends Request {
    @Query
    @NameInMap("BillingCycle")
    @Validation(required = true)
    private String billingCycle;

    private QueryMonthlyBillRequest(Builder builder) {
        super(builder);
        this.billingCycle = builder.billingCycle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonthlyBillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billingCycle
     */
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public static final class Builder extends Request.Builder<QueryMonthlyBillRequest, Builder> {
        private String billingCycle; 

        private Builder() {
            super();
        } 

        private Builder(QueryMonthlyBillRequest request) {
            super(request);
            this.billingCycle = request.billingCycle;
        } 

        /**
         * BillingCycle.
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        @Override
        public QueryMonthlyBillRequest build() {
            return new QueryMonthlyBillRequest(this);
        } 

    } 

}
