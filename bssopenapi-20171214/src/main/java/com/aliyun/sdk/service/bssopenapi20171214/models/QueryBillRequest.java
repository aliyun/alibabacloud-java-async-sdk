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
 * {@link QueryBillRequest} extends {@link RequestModel}
 *
 * <p>QueryBillRequest</p>
 */
public class QueryBillRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
    private String subscriptionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private QueryBillRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.billingCycle = builder.billingCycle;
        this.isDisplayLocalCurrency = builder.isDisplayLocalCurrency;
        this.isHideZeroCharge = builder.isHideZeroCharge;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.subscriptionType = builder.subscriptionType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBillRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QueryBillRequest, Builder> {
        private Long billOwnerId; 
        private String billingCycle; 
        private Boolean isDisplayLocalCurrency; 
        private Boolean isHideZeroCharge; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productCode; 
        private String productType; 
        private String subscriptionType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(QueryBillRequest request) {
            super(request);
            this.billOwnerId = request.billOwnerId;
            this.billingCycle = request.billingCycle;
            this.isDisplayLocalCurrency = request.isDisplayLocalCurrency;
            this.isHideZeroCharge = request.isHideZeroCharge;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.subscriptionType = request.subscriptionType;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the member.</p>
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
         * <p>The billing cycle, in the YYYY-MM format.</p>
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
         * <p>Specifies whether to display local currency information in bills. The parameter will be discontinued.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isDisplayLocalCurrency(Boolean isDisplayLocalCurrency) {
            this.putQueryParameter("IsDisplayLocalCurrency", isDisplayLocalCurrency);
            this.isDisplayLocalCurrency = isDisplayLocalCurrency;
            return this;
        }

        /**
         * <p>Specifies whether to filter out a bill whose pretax gross amount is 0. By default, a bill whose pretax gross amount is 0 is not filtered out. Valid values:</p>
         * <ul>
         * <li>true: filters out a bill whose pretax gross amount is 0.</li>
         * <li>false: does not filter out a bill whose pretax gross amount is 0.</li>
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20. Maximum value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The code of the service.</p>
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
         * <p>The type of the service.</p>
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
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>Subscription</li>
         * <li>PayAsYouGo</li>
         * </ul>
         * <p>This parameter must be used together with the ProductCode parameter.</p>
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
         * <p>The type of the bill. Valid values:</p>
         * <ul>
         * <li>SubscriptionOrder</li>
         * <li>PayAsYouGoBill</li>
         * <li>Refund</li>
         * <li>Adjustment</li>
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
        public QueryBillRequest build() {
            return new QueryBillRequest(this);
        } 

    } 

}
