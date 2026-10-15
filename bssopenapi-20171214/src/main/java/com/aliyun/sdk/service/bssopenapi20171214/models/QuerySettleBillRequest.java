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
 * {@link QuerySettleBillRequest} extends {@link RequestModel}
 *
 * <p>QuerySettleBillRequest</p>
 */
public class QuerySettleBillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillOwnerId")
    @com.aliyun.core.annotation.Validation()
    private Long billOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingCycle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDisplayLocalCurrency")
    private Boolean isDisplayLocalCurrency;

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
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordID")
    private String recordID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
    private String subscriptionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private QuerySettleBillRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.billingCycle = builder.billingCycle;
        this.isDisplayLocalCurrency = builder.isDisplayLocalCurrency;
        this.isHideZeroCharge = builder.isHideZeroCharge;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerId = builder.ownerId;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.recordID = builder.recordID;
        this.subscriptionType = builder.subscriptionType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySettleBillRequest create() {
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
     * @return isDisplayLocalCurrency
     */
    public Boolean getIsDisplayLocalCurrency() {
        return this.isDisplayLocalCurrency;
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
     * @return recordID
     */
    public String getRecordID() {
        return this.recordID;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QuerySettleBillRequest, Builder> {
        private Long billOwnerId; 
        private String billingCycle; 
        private Boolean isDisplayLocalCurrency; 
        private Boolean isHideZeroCharge; 
        private Integer maxResults; 
        private String nextToken; 
        private Long ownerId; 
        private String productCode; 
        private String productType; 
        private String recordID; 
        private String subscriptionType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(QuerySettleBillRequest request) {
            super(request);
            this.billOwnerId = request.billOwnerId;
            this.billingCycle = request.billingCycle;
            this.isDisplayLocalCurrency = request.isDisplayLocalCurrency;
            this.isHideZeroCharge = request.isHideZeroCharge;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerId = request.ownerId;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.recordID = request.recordID;
            this.subscriptionType = request.subscriptionType;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the resource ownership account. The resource ownership account is the account that actually uses the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder billOwnerId(Long billOwnerId) {
            this.putQueryParameter("BillOwnerId", billOwnerId);
            this.billOwnerId = billOwnerId;
            return this;
        }

        /**
         * <p>The billing cycle, in the format of YYYY-MM.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07</p>
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * IsDisplayLocalCurrency.
         */
        public Builder isDisplayLocalCurrency(Boolean isDisplayLocalCurrency) {
            this.putQueryParameter("IsDisplayLocalCurrency", isDisplayLocalCurrency);
            this.isDisplayLocalCurrency = isDisplayLocalCurrency;
            return this;
        }

        /**
         * <p>Specifies whether to filter based on whether the original price (PretaxGrossAmount) is 0. Default value: false (compatible with existing logic). Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isHideZeroCharge(Boolean isHideZeroCharge) {
            this.putQueryParameter("IsHideZeroCharge", isHideZeroCharge);
            this.isHideZeroCharge = isHideZeroCharge;
            return this;
        }

        /**
         * <p>The maximum number of data records to read in this request. Default value: 20. Maximum value: 300.</p>
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
         * <p>The token that marks the position from which the next query starts. Leave this parameter empty to start from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESEgoQCg4KCmdtdF9jcmVhdGUEARgBIkgKCQBwhGmPcAEAAAo7AzYAAAAxTDgwMDcxMjg3ZDJhNmM3ZDguTDgwMDAwMDAwMDAwMzE1MTIuTDgwMDcyZDMyZTJkYzg3N2U</p>
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
         * <p>The order ID or bill ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12233</p>
         */
        public Builder recordID(String recordID) {
            this.putQueryParameter("RecordID", recordID);
            this.recordID = recordID;
            return this;
        }

        /**
         * <p>The subscription type. Valid values:</p>
         * <ul>
         * <li>Subscription: subscription</li>
         * <li>PayAsYouGo: pay-as-you-go<blockquote>
         * <p> This parameter must be used together with the ProductCode parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        /**
         * <p>The type. Valid values:</p>
         * <ul>
         * <li>SubscriptionOrder: prepaid order</li>
         * <li>PayAsYouGoBill: pay-as-you-go bill</li>
         * <li>Refund: refund bill</li>
         * <li>Adjustment: adjustment bill</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SubscriptionOrder</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QuerySettleBillRequest build() {
            return new QuerySettleBillRequest(this);
        } 

    } 

}
