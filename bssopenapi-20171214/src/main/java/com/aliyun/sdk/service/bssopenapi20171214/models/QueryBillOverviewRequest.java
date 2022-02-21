// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBillOverviewRequest} extends {@link RequestModel}
 *
 * <p>QueryBillOverviewRequest</p>
 */
public class QueryBillOverviewRequest extends Request {
    @Query
    @NameInMap("BillOwnerId")
    @Validation()
    private Long billOwnerId;

    @Query
    @NameInMap("BillingCycle")
    @Validation(required = true)
    private String billingCycle;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("SubscriptionType")
    private String subscriptionType;

    private QueryBillOverviewRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.billingCycle = builder.billingCycle;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBillOverviewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billOwnerId
     */
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    /**
     * @return billingCycle
     */
    public String getBillingCycle() {
        return this.billingCycle;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static final class Builder extends Request.Builder<QueryBillOverviewRequest, Builder> {
        private Long billOwnerId; 
        private String billingCycle; 
        private String productCode; 
        private String productType; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(QueryBillOverviewRequest response) {
            super(response);
            this.billOwnerId = response.billOwnerId;
            this.billingCycle = response.billingCycle;
            this.productCode = response.productCode;
            this.productType = response.productType;
            this.subscriptionType = response.subscriptionType;
        } 

        /**
         * BillOwnerId.
         */
        public Builder billOwnerId(Long billOwnerId) {
            this.putQueryParameter("BillOwnerId", billOwnerId);
            this.billOwnerId = billOwnerId;
            return this;
        }

        /**
         * BillingCycle.
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * SubscriptionType.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public QueryBillOverviewRequest build() {
            return new QueryBillOverviewRequest(this);
        } 

    } 

}
