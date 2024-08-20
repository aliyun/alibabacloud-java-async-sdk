// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceBillRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceBillRequest</p>
 */
public class DescribeInstanceBillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillOwnerId")
    @com.aliyun.core.annotation.Validation()
    private Long billOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingCycle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingDate")
    private String billingDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Granularity")
    private String granularity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceID")
    private String instanceID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsBillingItem")
    private Boolean isBillingItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsHideZeroCharge")
    private Boolean isHideZeroCharge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipCode")
    private String pipCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
    private String subscriptionType;

    private DescribeInstanceBillRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.billingCycle = builder.billingCycle;
        this.billingDate = builder.billingDate;
        this.granularity = builder.granularity;
        this.instanceID = builder.instanceID;
        this.isBillingItem = builder.isBillingItem;
        this.isHideZeroCharge = builder.isHideZeroCharge;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerId = builder.ownerId;
        this.pipCode = builder.pipCode;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceBillRequest create() {
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
     * @return billingDate
     */
    public String getBillingDate() {
        return this.billingDate;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return instanceID
     */
    public String getInstanceID() {
        return this.instanceID;
    }

    /**
     * @return isBillingItem
     */
    public Boolean getIsBillingItem() {
        return this.isBillingItem;
    }

    /**
     * @return isHideZeroCharge
     */
    public Boolean getIsHideZeroCharge() {
        return this.isHideZeroCharge;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pipCode
     */
    public String getPipCode() {
        return this.pipCode;
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

    public static final class Builder extends Request.Builder<DescribeInstanceBillRequest, Builder> {
        private Long billOwnerId; 
        private String billingCycle; 
        private String billingDate; 
        private String granularity; 
        private String instanceID; 
        private Boolean isBillingItem; 
        private Boolean isHideZeroCharge; 
        private Integer maxResults; 
        private String nextToken; 
        private Long ownerId; 
        private String pipCode; 
        private String productCode; 
        private String productType; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceBillRequest request) {
            super(request);
            this.billOwnerId = request.billOwnerId;
            this.billingCycle = request.billingCycle;
            this.billingDate = request.billingDate;
            this.granularity = request.granularity;
            this.instanceID = request.instanceID;
            this.isBillingItem = request.isBillingItem;
            this.isHideZeroCharge = request.isHideZeroCharge;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerId = request.ownerId;
            this.pipCode = request.pipCode;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * The ID of the member. If you specify this parameter, the bills of the member are queried. If you do not specify this parameter, the bills of the current account are queried by default.
         */
        public Builder billOwnerId(Long billOwnerId) {
            this.putQueryParameter("BillOwnerId", billOwnerId);
            this.billOwnerId = billOwnerId;
            return this;
        }

        /**
         * The billing cycle. Specify the parameter in the YYYY-MM format.
         * <p>
         * Only the latest 18 month billing cycle is supported.
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * The billing date. This parameter is required only when the Granularity parameter is set to DAILY. Format: YYYY-MM-DD.
         */
        public Builder billingDate(String billingDate) {
            this.putQueryParameter("BillingDate", billingDate);
            this.billingDate = billingDate;
            return this;
        }

        /**
         * The granularity at which bills are queried. Valid values:
         * <p>
         * 
         * *   MONTHLY: queries bills on a monthly basis. The data that you query is the same as the data searched by instances on the Billing Details tab of the Bill Details page in the User Center console.
         * *   DAILY: queries bills on a daily basis. The data that you query is the same as the data searched by days on the Billing Details tab of the Bill Details page in the User Center console.
         * 
         * The BillingDate parameter is required if you set the Granularity parameter to DAILY.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceID(String instanceID) {
            this.putQueryParameter("InstanceID", instanceID);
            this.instanceID = instanceID;
            return this;
        }

        /**
         * Specifies whether to query data by billable items. Valid values:
         * <p>
         * 
         * *   false: The data that you query is the same as the data searched by instances on the Billing Details tab of the Bill Details page in the User Center console.
         * *   true: The data that you query is the same as the data searched by billable items on the Billing Details tab of the Bill Details page in the User Center console.
         * 
         * Default value: false.
         */
        public Builder isBillingItem(Boolean isBillingItem) {
            this.putQueryParameter("IsBillingItem", isBillingItem);
            this.isBillingItem = isBillingItem;
            return this;
        }

        /**
         * Specifies whether to filter bills if both the pretax gross amount and pretax amount are 0. Valid values:
         * <p>
         * 
         * *   false: does not filter bills.
         * *   true: filters bills.
         */
        public Builder isHideZeroCharge(Boolean isHideZeroCharge) {
            this.putQueryParameter("IsHideZeroCharge", isHideZeroCharge);
            this.isHideZeroCharge = isHideZeroCharge;
            return this;
        }

        /**
         * The maximum number of entries to return. Default value: 20. Maximum value: 300.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to indicate the position where the results for the current call start. The parameter must be left empty or set to the value of the NextToken parameter that is returned from the last call. Otherwise, an error is returned. If the parameter is left empty, data is queried from the first item.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The code of the service. The code is the same as that in Cost Center.
         */
        public Builder pipCode(String pipCode) {
            this.putQueryParameter("PipCode", pipCode);
            this.pipCode = pipCode;
            return this;
        }

        /**
         * The code of the service.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The type of the service.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * The billing method. Valid values:
         * <p>
         * 
         * *   Subscription: the subscription billing method.
         * *   PayAsYouGo: the pay-as-you-go billing method.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public DescribeInstanceBillRequest build() {
            return new DescribeInstanceBillRequest(this);
        } 

    } 

}
