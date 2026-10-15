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
         * <p>The ID of the resource ownership account. The resource ownership account is the account that actually uses the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>122</p>
         */
        public Builder billOwnerId(Long billOwnerId) {
            this.putQueryParameter("BillOwnerId", billOwnerId);
            this.billOwnerId = billOwnerId;
            return this;
        }

        /**
         * <p>The billing cycle in the YYYY-MM format. Only the last 18 billing cycles are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03</p>
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * <p>The billing date. This parameter is required only when Granularity is set to DAILY. Format: YYYY-MM-DD.</p>
         * <blockquote>
         * <p>The value of BillingDate must be in the same month as the value of BillingCycle. For example, if BillingCycle is set to 2020-03, BillingDate must be set to 2020-03-DD. If the months are inconsistent, the query results are returned based on the time specified by BillingCycle.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-03-02</p>
         */
        public Builder billingDate(String billingDate) {
            this.putQueryParameter("BillingDate", billingDate);
            this.billingDate = billingDate;
            return this;
        }

        /**
         * <p>The granularity at which bills are queried. Valid values:</p>
         * <ul>
         * <li>MONTHLY: monthly. The data is consistent with the monthly bills in Expenses and Costs &gt; Bills &gt; Bill Details &gt; Monthly Bills.</li>
         * <li>DAILY: daily. The data is consistent with the daily bills in Expenses and Costs &gt; Bills &gt; Bill Details &gt; Daily Bills.</li>
         * </ul>
         * <blockquote>
         * <p>If you select DAILY, you must specify BillingDate.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MONTHLY</p>
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder instanceID(String instanceID) {
            this.putQueryParameter("InstanceID", instanceID);
            this.instanceID = instanceID;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve data by billable item. Valid values:</p>
         * <ul>
         * <li>false (default): The data is consistent with the instance bills in Expenses and Costs &gt; Bills &gt; Bill Details &gt; Instance Bills.</li>
         * <li>true: The data is consistent with the billable item bills in Expenses and Costs &gt; Bills &gt; Bill Details &gt; Billable Item Bills.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isBillingItem(Boolean isBillingItem) {
            this.putQueryParameter("IsBillingItem", isBillingItem);
            this.isBillingItem = isBillingItem;
            return this;
        }

        /**
         * <p>Specifies whether to filter out records where both the original price (PretaxGrossAmount) and the payable amount (PretaxAmount) are 0. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isHideZeroCharge(Boolean isHideZeroCharge) {
            this.putQueryParameter("IsHideZeroCharge", isHideZeroCharge);
            this.isHideZeroCharge = isHideZeroCharge;
            return this;
        }

        /**
         * <p>The maximum number of data records to read in the current call. Default value: 20. Maximum value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The position from which the current call starts to read data. The value must be empty or set to the NextToken value returned in the previous response. Otherwise, an error occurs. An empty value indicates that the reading starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESEgoQCg4KCm</p>
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
         * <p>The product code, which is consistent with the product code in the bills of the User Center.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder pipCode(String pipCode) {
            this.putQueryParameter("PipCode", pipCode);
            this.pipCode = pipCode;
            return this;
        }

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The product type.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The subscription type. Valid values:</p>
         * <ul>
         * <li>Subscription: subscription.</li>
         * <li>PayAsYouGo: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
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
