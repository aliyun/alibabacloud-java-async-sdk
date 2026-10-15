// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link DescribeInstanceAmortizedCostByConsumePeriodRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceAmortizedCostByConsumePeriodRequest</p>
 */
public class DescribeInstanceAmortizedCostByConsumePeriodRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AmortizationPeriodFilter")
    private java.util.List<String> amortizationPeriodFilter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BillOwnerIdList")
    private java.util.List<String> billOwnerIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BillUserIdList")
    private java.util.List<String> billUserIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BillingCycle")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
    private String billingCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CostUnitCode")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String costUnitCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    private java.util.List<String> instanceIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 2560)
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductDetail")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String productDetail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
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
    public java.util.List<String> getAmortizationPeriodFilter() {
        return this.amortizationPeriodFilter;
    }

    /**
     * @return billOwnerIdList
     */
    public java.util.List<String> getBillOwnerIdList() {
        return this.billOwnerIdList;
    }

    /**
     * @return billUserIdList
     */
    public java.util.List<String> getBillUserIdList() {
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
    public java.util.List<String> getInstanceIdList() {
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
        private java.util.List<String> amortizationPeriodFilter; 
        private java.util.List<String> billOwnerIdList; 
        private java.util.List<String> billUserIdList; 
        private String billingCycle; 
        private String costUnitCode; 
        private java.util.List<String> instanceIdList; 
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
         * <p>The filter for the amortization month.
         * Maximum number of elements: 10.</p>
         */
        public Builder amortizationPeriodFilter(java.util.List<String> amortizationPeriodFilter) {
            this.putBodyParameter("AmortizationPeriodFilter", amortizationPeriodFilter);
            this.amortizationPeriodFilter = amortizationPeriodFilter;
            return this;
        }

        /**
         * <p>The filter for the ID of the resource owner.
         * The resource owner is the account that actually uses the resource.
         * Maximum number of elements: 10.</p>
         */
        public Builder billOwnerIdList(java.util.List<String> billOwnerIdList) {
            this.putBodyParameter("BillOwnerIdList", billOwnerIdList);
            this.billOwnerIdList = billOwnerIdList;
            return this;
        }

        /**
         * <p>The filter for the ID of the bill payer.
         * This is the ID of a RAM user. If you specify this parameter, you can view the bills of the RAM user. If you leave this parameter empty, the bills of the current account and all its RAM users are returned.
         * Maximum number of elements: 10.</p>
         */
        public Builder billUserIdList(java.util.List<String> billUserIdList) {
            this.putBodyParameter("BillUserIdList", billUserIdList);
            this.billUserIdList = billUserIdList;
            return this;
        }

        /**
         * <p>The billing cycle.
         * Format: YYYY-MM.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10</p>
         */
        public Builder billingCycle(String billingCycle) {
            this.putBodyParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * <p>The code of the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>123#</p>
         */
        public Builder costUnitCode(String costUnitCode) {
            this.putBodyParameter("CostUnitCode", costUnitCode);
            this.costUnitCode = costUnitCode;
            return this;
        }

        /**
         * <p>The filter for the instance ID.
         * You can query multiple instances. If you leave this parameter empty, all instances are queried.
         * Maximum number of elements: 10.</p>
         */
        public Builder instanceIdList(java.util.List<String> instanceIdList) {
            this.putBodyParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * <p>The maximum number of data records to return in this call. Default value: 20. Maximum value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results. You do not need to specify this parameter for the first request. You must set the value to the token that is returned in the previous call. If you leave this parameter empty, the query starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESEgoQCg4KCmdtdF9jcmVhdGUEARgBIkgKCQBwhGmPcAEAAAo7AzYAAAAxTDgwMDcxMjg3ZDJhNmM3ZDguTDgwMDAwMDAwMDAwMzE1MTIuTDgwMDcyZDMyZTJkYzg3N2U</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The product code.
         * To obtain the value of this parameter, call QueryProductList to query product information, or call DescribeResourcePackageProduct to query information about a specific resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The details of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder productDetail(String productDetail) {
            this.putBodyParameter("ProductDetail", productDetail);
            this.productDetail = productDetail;
            return this;
        }

        /**
         * <p>The subscription type. Valid values:</p>
         * <ul>
         * <li><p>Subscription: subscription.</p>
         * </li>
         * <li><p>PayAsYouGo: pay-as-you-go.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
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
