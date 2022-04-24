// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInstanceGaapCostRequest} extends {@link RequestModel}
 *
 * <p>QueryInstanceGaapCostRequest</p>
 */
public class QueryInstanceGaapCostRequest extends Request {
    @Query
    @NameInMap("BillingCycle")
    @Validation(required = true)
    private String billingCycle;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("SubscriptionType")
    private String subscriptionType;

    private QueryInstanceGaapCostRequest(Builder builder) {
        super(builder);
        this.billingCycle = builder.billingCycle;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInstanceGaapCostRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billingCycle
     */
    public String getBillingCycle() {
        return this.billingCycle;
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

    public static final class Builder extends Request.Builder<QueryInstanceGaapCostRequest, Builder> {
        private String billingCycle; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productCode; 
        private String productType; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(QueryInstanceGaapCostRequest request) {
            super(request);
            this.billingCycle = request.billingCycle;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.subscriptionType = request.subscriptionType;
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public QueryInstanceGaapCostRequest build() {
            return new QueryInstanceGaapCostRequest(this);
        } 

    } 

}
