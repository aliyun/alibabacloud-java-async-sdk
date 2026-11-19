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
 * {@link DescribeInstanceAmortizedCostByAmortizationPeriodRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceAmortizedCostByAmortizationPeriodRequest</p>
 */
public class DescribeInstanceAmortizedCostByAmortizationPeriodRequest extends Request {
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

    public static final class Builder extends Request.Builder<DescribeInstanceAmortizedCostByAmortizationPeriodRequest, Builder> {
        private java.util.List<String> billOwnerIdList; 
        private java.util.List<String> billUserIdList; 
        private String billingCycle; 
        private java.util.List<String> consumePeriodFilter; 
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
         * <p>The resource ownership account filter. The ID of the resource ownership account. The resource ownership account is the account that actually uses the resources. Maximum number of elements: 10.</p>
         */
        public Builder billOwnerIdList(java.util.List<String> billOwnerIdList) {
            this.putBodyParameter("BillOwnerIdList", billOwnerIdList);
            this.billOwnerIdList = billOwnerIdList;
            return this;
        }

        /**
         * <p>The bill purchaser ID filter. The ID of the RAM user. Specify this parameter to view the bills of RAM users. If you do not specify this parameter, the bills of the current caller account and all its RAM users are viewed by default. Maximum number of elements: 10.</p>
         */
        public Builder billUserIdList(java.util.List<String> billUserIdList) {
            this.putBodyParameter("BillUserIdList", billUserIdList);
            this.billUserIdList = billUserIdList;
            return this;
        }

        /**
         * <p>The amortization month. Format: YYYY-MM.</p>
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
         * <p>The billing cycle filter. Maximum number of elements: 10.</p>
         */
        public Builder consumePeriodFilter(java.util.List<String> consumePeriodFilter) {
            this.putBodyParameter("ConsumePeriodFilter", consumePeriodFilter);
            this.consumePeriodFilter = consumePeriodFilter;
            return this;
        }

        /**
         * <p>The cost unit code.</p>
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
         * <p>The instance ID filter. You can query multiple instances. If you do not specify this parameter, all instances are queried by default. Maximum number of elements: 10.</p>
         */
        public Builder instanceIdList(java.util.List<String> instanceIdList) {
            this.putBodyParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * <p>The maximum number of data records to read in the current call. Default value: 20. Maximum value: 300.</p>
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
         * <p>The token that specifies the position from which the current call starts reading. The value must be empty or set to the NextToken value returned in the previous response. Otherwise, an error occurs. An empty value indicates that the reading starts from the beginning.</p>
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
         * <p>The product code. Reference sources for valid values: Call QueryProductList to query product information. Call DescribeResourcePackageProduct to query the information about a specific resource plan product.</p>
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
         * <p>The product detail.</p>
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
         * <li>Subscription: Upfront.</li>
         * <li>PayAsYouGo: Pay-as-you-go.</li>
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
        public DescribeInstanceAmortizedCostByAmortizationPeriodRequest build() {
            return new DescribeInstanceAmortizedCostByAmortizationPeriodRequest(this);
        } 

    } 

}
