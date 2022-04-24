// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMonthlyInstanceConsumptionRequest} extends {@link RequestModel}
 *
 * <p>QueryMonthlyInstanceConsumptionRequest</p>
 */
public class QueryMonthlyInstanceConsumptionRequest extends Request {
    @Query
    @NameInMap("BillingCycle")
    @Validation(required = true)
    private String billingCycle;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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

    private QueryMonthlyInstanceConsumptionRequest(Builder builder) {
        super(builder);
        this.billingCycle = builder.billingCycle;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonthlyInstanceConsumptionRequest create() {
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

    public static final class Builder extends Request.Builder<QueryMonthlyInstanceConsumptionRequest, Builder> {
        private String billingCycle; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productCode; 
        private String productType; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(QueryMonthlyInstanceConsumptionRequest request) {
            super(request);
            this.billingCycle = request.billingCycle;
            this.ownerId = request.ownerId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
        public QueryMonthlyInstanceConsumptionRequest build() {
            return new QueryMonthlyInstanceConsumptionRequest(this);
        } 

    } 

}
