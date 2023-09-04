// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAmortizedCostByConsumePeriodRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceAmortizedCostByConsumePeriodRequest</p>
 */
public class DescribeInstanceAmortizedCostByConsumePeriodRequest extends Request {
    @Body
    @NameInMap("AmortizationPeriodFilter")
    private java.util.List < String > amortizationPeriodFilter;

    @Body
    @NameInMap("BillOwnerIdList")
    private java.util.List < String > billOwnerIdList;

    @Body
    @NameInMap("BillUserIdList")
    private java.util.List < String > billUserIdList;

    @Body
    @NameInMap("BillingCycle")
    @Validation(required = true, maxLength = 256)
    private String billingCycle;

    @Body
    @NameInMap("CostUnitCode")
    @Validation(maxLength = 256)
    private String costUnitCode;

    @Body
    @NameInMap("InstanceIdList")
    private java.util.List < String > instanceIdList;

    @Body
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Body
    @NameInMap("NextToken")
    @Validation(maxLength = 2560)
    private String nextToken;

    @Body
    @NameInMap("ProductCode")
    @Validation(maxLength = 256)
    private String productCode;

    @Body
    @NameInMap("ProductDetail")
    @Validation(maxLength = 256)
    private String productDetail;

    @Body
    @NameInMap("SubscriptionType")
    @Validation(maxLength = 256)
    private String subscriptionType;

    private DescribeInstanceAmortizedCostByConsumePeriodRequest(Builder builder) {
        super(builder);
        this.amortizationPeriodFilter = builder.amortizationPeriodFilter;
        this.billOwnerIdList = builder.billOwnerIdList;
        this.billUserIdList = builder.billUserIdList;
        this.billingCycle = builder.billingCycle;
        this.costUnitCode = builder.costUnitCode;
        this.instanceIdList = builder.instanceIdList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.productDetail = builder.productDetail;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAmortizedCostByConsumePeriodRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amortizationPeriodFilter
     */
    public java.util.List < String > getAmortizationPeriodFilter() {
        return this.amortizationPeriodFilter;
    }

    /**
     * @return billOwnerIdList
     */
    public java.util.List < String > getBillOwnerIdList() {
        return this.billOwnerIdList;
    }

    /**
     * @return billUserIdList
     */
    public java.util.List < String > getBillUserIdList() {
        return this.billUserIdList;
    }

    /**
     * @return billingCycle
     */
    public String getBillingCycle() {
        return this.billingCycle;
    }

    /**
     * @return costUnitCode
     */
    public String getCostUnitCode() {
        return this.costUnitCode;
    }

    /**
     * @return instanceIdList
     */
    public java.util.List < String > getInstanceIdList() {
        return this.instanceIdList;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productDetail
     */
    public String getProductDetail() {
        return this.productDetail;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceAmortizedCostByConsumePeriodRequest, Builder> {
        private java.util.List < String > amortizationPeriodFilter; 
        private java.util.List < String > billOwnerIdList; 
        private java.util.List < String > billUserIdList; 
        private String billingCycle; 
        private String costUnitCode; 
        private java.util.List < String > instanceIdList; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String productDetail; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceAmortizedCostByConsumePeriodRequest request) {
            super(request);
            this.amortizationPeriodFilter = request.amortizationPeriodFilter;
            this.billOwnerIdList = request.billOwnerIdList;
            this.billUserIdList = request.billUserIdList;
            this.billingCycle = request.billingCycle;
            this.costUnitCode = request.costUnitCode;
            this.instanceIdList = request.instanceIdList;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.productDetail = request.productDetail;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * AmortizationPeriodFilter.
         */
        public Builder amortizationPeriodFilter(java.util.List < String > amortizationPeriodFilter) {
            this.putBodyParameter("AmortizationPeriodFilter", amortizationPeriodFilter);
            this.amortizationPeriodFilter = amortizationPeriodFilter;
            return this;
        }

        /**
         * BillOwnerIdList.
         */
        public Builder billOwnerIdList(java.util.List < String > billOwnerIdList) {
            this.putBodyParameter("BillOwnerIdList", billOwnerIdList);
            this.billOwnerIdList = billOwnerIdList;
            return this;
        }

        /**
         * BillUserIdList.
         */
        public Builder billUserIdList(java.util.List < String > billUserIdList) {
            this.putBodyParameter("BillUserIdList", billUserIdList);
            this.billUserIdList = billUserIdList;
            return this;
        }

        /**
         * BillingCycle.
         */
        public Builder billingCycle(String billingCycle) {
            this.putBodyParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * CostUnitCode.
         */
        public Builder costUnitCode(String costUnitCode) {
            this.putBodyParameter("CostUnitCode", costUnitCode);
            this.costUnitCode = costUnitCode;
            return this;
        }

        /**
         * InstanceIdList.
         */
        public Builder instanceIdList(java.util.List < String > instanceIdList) {
            this.putBodyParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductDetail.
         */
        public Builder productDetail(String productDetail) {
            this.putBodyParameter("ProductDetail", productDetail);
            this.productDetail = productDetail;
            return this;
        }

        /**
         * SubscriptionType.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putBodyParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public DescribeInstanceAmortizedCostByConsumePeriodRequest build() {
            return new DescribeInstanceAmortizedCostByConsumePeriodRequest(this);
        } 

    } 

}
