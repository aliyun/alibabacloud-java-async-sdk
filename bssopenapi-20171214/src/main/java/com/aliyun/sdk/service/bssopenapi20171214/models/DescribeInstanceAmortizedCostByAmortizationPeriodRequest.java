// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAmortizedCostByAmortizationPeriodRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceAmortizedCostByAmortizationPeriodRequest</p>
 */
public class DescribeInstanceAmortizedCostByAmortizationPeriodRequest extends Request {
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
    @NameInMap("ConsumePeriodFilter")
    private java.util.List < String > consumePeriodFilter;

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

    private DescribeInstanceAmortizedCostByAmortizationPeriodRequest(Builder builder) {
        super(builder);
        this.billOwnerIdList = builder.billOwnerIdList;
        this.billUserIdList = builder.billUserIdList;
        this.billingCycle = builder.billingCycle;
        this.consumePeriodFilter = builder.consumePeriodFilter;
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

    public static DescribeInstanceAmortizedCostByAmortizationPeriodRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return consumePeriodFilter
     */
    public java.util.List < String > getConsumePeriodFilter() {
        return this.consumePeriodFilter;
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

    public static final class Builder extends Request.Builder<DescribeInstanceAmortizedCostByAmortizationPeriodRequest, Builder> {
        private java.util.List < String > billOwnerIdList; 
        private java.util.List < String > billUserIdList; 
        private String billingCycle; 
        private java.util.List < String > consumePeriodFilter; 
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

        private Builder(DescribeInstanceAmortizedCostByAmortizationPeriodRequest request) {
            super(request);
            this.billOwnerIdList = request.billOwnerIdList;
            this.billUserIdList = request.billUserIdList;
            this.billingCycle = request.billingCycle;
            this.consumePeriodFilter = request.consumePeriodFilter;
            this.costUnitCode = request.costUnitCode;
            this.instanceIdList = request.instanceIdList;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.productDetail = request.productDetail;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * The ID of the member to which the bill belongs. The member ID is used to filter bills. If you specify a value for this parameter, you can query the bills of the specified member. If you leave this parameter empty, the bills of the current account and all members of the current account are queried. You can specify a maximum of 10 IDs.
         */
        public Builder billOwnerIdList(java.util.List < String > billOwnerIdList) {
            this.putBodyParameter("BillOwnerIdList", billOwnerIdList);
            this.billOwnerIdList = billOwnerIdList;
            return this;
        }

        /**
         * The ID of the member that needs to settle the bill. The member ID is used to filter bills. If you specify a value for this parameter, you can query the bills of the specified member account. If you leave this parameter empty, the bills of the current account and all members of the current account are queried by default. You can specify a maximum of 10 IDs.
         */
        public Builder billUserIdList(java.util.List < String > billUserIdList) {
            this.putBodyParameter("BillUserIdList", billUserIdList);
            this.billUserIdList = billUserIdList;
            return this;
        }

        /**
         * The allocation month. Format: YYYY-MM.
         */
        public Builder billingCycle(String billingCycle) {
            this.putBodyParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * The billing cycle that is used to filter bills. You can specify a maximum of 10 billing cycles.
         */
        public Builder consumePeriodFilter(java.util.List < String > consumePeriodFilter) {
            this.putBodyParameter("ConsumePeriodFilter", consumePeriodFilter);
            this.consumePeriodFilter = consumePeriodFilter;
            return this;
        }

        /**
         * The code of the cost center.
         */
        public Builder costUnitCode(String costUnitCode) {
            this.putBodyParameter("CostUnitCode", costUnitCode);
            this.costUnitCode = costUnitCode;
            return this;
        }

        /**
         * The instance ID that is used to filter bills. You can specify multiple instance IDs to query bills of multiple instances. If you leave this parameter empty, the bills of all instances are queried by default. You can specify a maximum of 10 instance IDs.
         */
        public Builder instanceIdList(java.util.List < String > instanceIdList) {
            this.putBodyParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * The maximum number of entries to return. Default value: 20. Maximum value: 300.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The position from which the query starts. The parameter must be left empty or set to the value of the NextToken parameter returned from the last call. Otherwise, an error is returned. If this parameter is left empty, data is queried from the beginning.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The code of the service. You can obtain the value of this parameter by calling the QueryProductList operation or the DescribeResourcePackageProduct operation.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The specific service resource.
         */
        public Builder productDetail(String productDetail) {
            this.putBodyParameter("ProductDetail", productDetail);
            this.productDetail = productDetail;
            return this;
        }

        /**
         * The billing method. Valid values:
         * <p>
         * 
         * *   Subscription: the subscription billing method
         * *   PayAsYouGo: the pay-as-you-go billing method
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putBodyParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public DescribeInstanceAmortizedCostByAmortizationPeriodRequest build() {
            return new DescribeInstanceAmortizedCostByAmortizationPeriodRequest(this);
        } 

    } 

}
