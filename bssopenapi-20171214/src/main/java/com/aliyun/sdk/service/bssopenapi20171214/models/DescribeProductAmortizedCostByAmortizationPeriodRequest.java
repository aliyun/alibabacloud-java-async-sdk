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
 * {@link DescribeProductAmortizedCostByAmortizationPeriodRequest} extends {@link RequestModel}
 *
 * <p>DescribeProductAmortizedCostByAmortizationPeriodRequest</p>
 */
public class DescribeProductAmortizedCostByAmortizationPeriodRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ConsumePeriodFilter")
    private java.util.List<String> consumePeriodFilter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CostUnitCode")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String costUnitCode;

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

    private DescribeProductAmortizedCostByAmortizationPeriodRequest(Builder builder) {
        super(builder);
        this.billOwnerIdList = builder.billOwnerIdList;
        this.billUserIdList = builder.billUserIdList;
        this.billingCycle = builder.billingCycle;
        this.consumePeriodFilter = builder.consumePeriodFilter;
        this.costUnitCode = builder.costUnitCode;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.productDetail = builder.productDetail;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductAmortizedCostByAmortizationPeriodRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return consumePeriodFilter
     */
    public java.util.List<String> getConsumePeriodFilter() {
        return this.consumePeriodFilter;
    }

    /**
     * @return costUnitCode
     */
    public String getCostUnitCode() {
        return this.costUnitCode;
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

    public static final class Builder extends Request.Builder<DescribeProductAmortizedCostByAmortizationPeriodRequest, Builder> {
        private java.util.List<String> billOwnerIdList; 
        private java.util.List<String> billUserIdList; 
        private String billingCycle; 
        private java.util.List<String> consumePeriodFilter; 
        private String costUnitCode; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String productDetail; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProductAmortizedCostByAmortizationPeriodRequest request) {
            super(request);
            this.billOwnerIdList = request.billOwnerIdList;
            this.billUserIdList = request.billUserIdList;
            this.billingCycle = request.billingCycle;
            this.consumePeriodFilter = request.consumePeriodFilter;
            this.costUnitCode = request.costUnitCode;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.productDetail = request.productDetail;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * <p>The IDs of resource owners. The resource owner is the account that uses the resources.
         * You can specify a maximum of 10 IDs.</p>
         */
        public Builder billOwnerIdList(java.util.List<String> billOwnerIdList) {
            this.putBodyParameter("BillOwnerIdList", billOwnerIdList);
            this.billOwnerIdList = billOwnerIdList;
            return this;
        }

        /**
         * <p>The IDs of billable accounts. This parameter is used to filter bills by the RAM user who pays for the resources. If you specify this parameter, you can query the bills of the specified RAM user. If you leave this parameter empty, the bills of the current account and all its RAM users are queried.
         * You can specify a maximum of 10 IDs.</p>
         */
        public Builder billUserIdList(java.util.List<String> billUserIdList) {
            this.putBodyParameter("BillUserIdList", billUserIdList);
            this.billUserIdList = billUserIdList;
            return this;
        }

        /**
         * <p>The amortization month.
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
         * <p>The filter for billing cycle months.
         * You can specify a maximum of 10 elements.</p>
         */
        public Builder consumePeriodFilter(java.util.List<String> consumePeriodFilter) {
            this.putBodyParameter("ConsumePeriodFilter", consumePeriodFilter);
            this.consumePeriodFilter = consumePeriodFilter;
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
         * <p>The maximum number of entries to return. Default value: 20. Maximum value: 300.</p>
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
         * <p>The token that marks the position to start the query. If you leave this parameter empty, the query starts from the beginning. Set this parameter to the value of NextToken that is returned in the last response to query the next page of results.</p>
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
         * For more information about how to obtain this parameter, see QueryProductList and DescribeResourcePackageProduct.</p>
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
        public DescribeProductAmortizedCostByAmortizationPeriodRequest build() {
            return new DescribeProductAmortizedCostByAmortizationPeriodRequest(this);
        } 

    } 

}
