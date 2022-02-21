// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountBillRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountBillRequest</p>
 */
public class QueryAccountBillRequest extends Request {
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
    @NameInMap("IsGroupByProduct")
    private Boolean isGroupByProduct;

    @Query
    @NameInMap("OwnerID")
    private Long ownerID;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    private QueryAccountBillRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.billingCycle = builder.billingCycle;
        this.billingDate = builder.billingDate;
        this.granularity = builder.granularity;
        this.isGroupByProduct = builder.isGroupByProduct;
        this.ownerID = builder.ownerID;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountBillRequest create() {
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
     * @return isGroupByProduct
     */
    public Boolean getIsGroupByProduct() {
        return this.isGroupByProduct;
    }

    /**
     * @return ownerID
     */
    public Long getOwnerID() {
        return this.ownerID;
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

    public static final class Builder extends Request.Builder<QueryAccountBillRequest, Builder> {
        private Long billOwnerId; 
        private String billingCycle; 
        private String billingDate; 
        private String granularity; 
        private Boolean isGroupByProduct; 
        private Long ownerID; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccountBillRequest response) {
            super(response);
            this.billOwnerId = response.billOwnerId;
            this.billingCycle = response.billingCycle;
            this.billingDate = response.billingDate;
            this.granularity = response.granularity;
            this.isGroupByProduct = response.isGroupByProduct;
            this.ownerID = response.ownerID;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.productCode = response.productCode;
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
         * IsGroupByProduct.
         */
        public Builder isGroupByProduct(Boolean isGroupByProduct) {
            this.putQueryParameter("IsGroupByProduct", isGroupByProduct);
            this.isGroupByProduct = isGroupByProduct;
            return this;
        }

        /**
         * OwnerID.
         */
        public Builder ownerID(Long ownerID) {
            this.putQueryParameter("OwnerID", ownerID);
            this.ownerID = ownerID;
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

        @Override
        public QueryAccountBillRequest build() {
            return new QueryAccountBillRequest(this);
        } 

    } 

}
