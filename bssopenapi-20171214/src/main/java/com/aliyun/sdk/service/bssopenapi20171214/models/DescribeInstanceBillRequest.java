// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceBillRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceBillRequest</p>
 */
public class DescribeInstanceBillRequest extends Request {
    @Query
    @NameInMap("BillOwnerId")
    @Validation()
    private Long billOwnerId;

    @Query
    @NameInMap("BillingCycle")
    @Validation(required = true)
    private String billingCycle;

    @Query
    @NameInMap("BillingDate")
    private String billingDate;

    @Query
    @NameInMap("Granularity")
    private String granularity;

    @Query
    @NameInMap("InstanceID")
    private String instanceID;

    @Query
    @NameInMap("IsBillingItem")
    private Boolean isBillingItem;

    @Query
    @NameInMap("IsHideZeroCharge")
    private Boolean isHideZeroCharge;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("SubscriptionType")
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
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.subscriptionType = request.subscriptionType;
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
         * BillingDate.
         */
        public Builder billingDate(String billingDate) {
            this.putQueryParameter("BillingDate", billingDate);
            this.billingDate = billingDate;
            return this;
        }

        /**
         * Granularity.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * InstanceID.
         */
        public Builder instanceID(String instanceID) {
            this.putQueryParameter("InstanceID", instanceID);
            this.instanceID = instanceID;
            return this;
        }

        /**
         * IsBillingItem.
         */
        public Builder isBillingItem(Boolean isBillingItem) {
            this.putQueryParameter("IsBillingItem", isBillingItem);
            this.isBillingItem = isBillingItem;
            return this;
        }

        /**
         * IsHideZeroCharge.
         */
        public Builder isHideZeroCharge(Boolean isHideZeroCharge) {
            this.putQueryParameter("IsHideZeroCharge", isHideZeroCharge);
            this.isHideZeroCharge = isHideZeroCharge;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
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
        public DescribeInstanceBillRequest build() {
            return new DescribeInstanceBillRequest(this);
        } 

    } 

}
