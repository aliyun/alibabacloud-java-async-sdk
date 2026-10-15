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
 * {@link DescribeSplitItemBillRequest} extends {@link RequestModel}
 *
 * <p>DescribeSplitItemBillRequest</p>
 */
public class DescribeSplitItemBillRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SplitItemID")
    private String splitItemID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
    private String subscriptionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagFilter")
    private java.util.List<TagFilter> tagFilter;

    private DescribeSplitItemBillRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.billingCycle = builder.billingCycle;
        this.billingDate = builder.billingDate;
        this.granularity = builder.granularity;
        this.instanceID = builder.instanceID;
        this.isHideZeroCharge = builder.isHideZeroCharge;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerId = builder.ownerId;
        this.pipCode = builder.pipCode;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.splitItemID = builder.splitItemID;
        this.subscriptionType = builder.subscriptionType;
        this.tagFilter = builder.tagFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSplitItemBillRequest create() {
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
     * @return splitItemID
     */
    public String getSplitItemID() {
        return this.splitItemID;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * @return tagFilter
     */
    public java.util.List<TagFilter> getTagFilter() {
        return this.tagFilter;
    }

    public static final class Builder extends Request.Builder<DescribeSplitItemBillRequest, Builder> {
        private Long billOwnerId; 
        private String billingCycle; 
        private String billingDate; 
        private String granularity; 
        private String instanceID; 
        private Boolean isHideZeroCharge; 
        private Integer maxResults; 
        private String nextToken; 
        private Long ownerId; 
        private String pipCode; 
        private String productCode; 
        private String productType; 
        private String splitItemID; 
        private String subscriptionType; 
        private java.util.List<TagFilter> tagFilter; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSplitItemBillRequest request) {
            super(request);
            this.billOwnerId = request.billOwnerId;
            this.billingCycle = request.billingCycle;
            this.billingDate = request.billingDate;
            this.granularity = request.granularity;
            this.instanceID = request.instanceID;
            this.isHideZeroCharge = request.isHideZeroCharge;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerId = request.ownerId;
            this.pipCode = request.pipCode;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.splitItemID = request.splitItemID;
            this.subscriptionType = request.subscriptionType;
            this.tagFilter = request.tagFilter;
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
         * <p>The billing cycle. Format: YYYY-MM.</p>
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
         * <li>MONTHLY: monthly. This value corresponds to the monthly bills on the Split Bill page in the User Center.</li>
         * <li>DAILY: daily. This value corresponds to the daily bills on the Split Bill page in the User Center.</li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to DAILY, you must specify the BillingDate parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Monthly</p>
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
         * <p>i-kjhdskjgshfdlkjfdh</p>
         */
        public Builder instanceID(String instanceID) {
            this.putQueryParameter("InstanceID", instanceID);
            this.instanceID = instanceID;
            return this;
        }

        /**
         * <p>Specifies whether to filter out bills where both the original price (PretaxGrossAmount) and the payable amount (PretaxAmount) are 0. Valid values:</p>
         * <ul>
         * <li>false: does not filter out the bills.</li>
         * <li>true: filters out the bills.</li>
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
         * <p>The maximum number of entries to return in the current call. Default value: 20. Maximum value: 300.</p>
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
         * <p>The token that specifies the position from which the current call starts to read data. The value must be empty or the value of NextToken returned in the previous response. Otherwise, an error occurs. An empty value indicates that the read operation starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESEgoQCg4KCmd</p>
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
         * <p>The product code. This value is the same as the product code in the bills of the User Center.</p>
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
         * <p>The ID of the attached resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-kjhdskjgshfdlkjfdh</p>
         */
        public Builder splitItemID(String splitItemID) {
            this.putQueryParameter("SplitItemID", splitItemID);
            this.splitItemID = splitItemID;
            return this;
        }

        /**
         * <p>The subscription type. Valid values:</p>
         * <ul>
         * <li>Subscription: subscription.</li>
         * <li>PayAsYouGo: pay-as-you-go.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be used together with the ProductCode parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        /**
         * <p>The tag filter conditions. Multiple sets of TagValues query conditions are supported. The logical relationship between multiple sets of TagValues conditions is OR.</p>
         */
        public Builder tagFilter(java.util.List<TagFilter> tagFilter) {
            this.putQueryParameter("TagFilter", tagFilter);
            this.tagFilter = tagFilter;
            return this;
        }

        @Override
        public DescribeSplitItemBillRequest build() {
            return new DescribeSplitItemBillRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSplitItemBillRequest} extends {@link TeaModel}
     *
     * <p>DescribeSplitItemBillRequest</p>
     */
    public static class TagFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValues")
        private java.util.List<String> tagValues;

        private TagFilter(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagFilter create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValues
         */
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

        public static final class Builder {
            private String tagKey; 
            private java.util.List<String> tagValues; 

            private Builder() {
            } 

            private Builder(TagFilter model) {
                this.tagKey = model.tagKey;
                this.tagValues = model.tagValues;
            } 

            /**
             * <p>TagFilter.N is used to query bills that match the specified tags. It consists of a key-value pair. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
             * <ul>
             * <li>If you specify only TagFilter.N.TagKey, all bills associated with the tag key are returned.</li>
             * <li>If you specify multiple tag key-value pairs, bills that match any of the tag key-value pairs are returned.</li>
             * <li>If the tags on a resource change, you can only query the bills generated during the period when the tags were attached to the resource.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>TagValues.N is used to query bills that match the specified tag values. It consists of a list of strings. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
             * <ul>
             * <li>If you specify TagValues.N, you must also specify TagFilter.N.TagKey. Otherwise, the InvalidParameter.TagValues error is reported.</li>
             * <li>If you specify multiple tag values, bills that match any of the tag values are returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValues(java.util.List<String> tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public TagFilter build() {
                return new TagFilter(this);
            } 

        } 

    }
}
