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

        private Builder(QueryAccountBillRequest request) {
            super(request);
            this.billOwnerId = request.billOwnerId;
            this.billingCycle = request.billingCycle;
            this.billingDate = request.billingDate;
            this.granularity = request.granularity;
            this.isGroupByProduct = request.isGroupByProduct;
            this.ownerID = request.ownerID;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
        } 

        /**
         * The ID of the member. If you specify a value for this parameter, you can query the bills of the specified member. If you leave this parameter empty, the bills of the current account are queried by default.
         */
        public Builder billOwnerId(Long billOwnerId) {
            this.putQueryParameter("BillOwnerId", billOwnerId);
            this.billOwnerId = billOwnerId;
            return this;
        }

        /**
         * The billing cycle. Format: YYYY-MM.
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * The billing date. This parameter is required only if the Granularity parameter is set to DAILY. Format: YYYY-MM-DD.
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
         * *   MONTHLY: queries bills by month. The data queried is consistent with the data that is displayed for the specified billing cycle on the Billing Details tab of the Bill Details page in User Center.
         * *   DAILY: queries bills by day. The data queried is consistent with the data that is displayed for the specified day on the Billing Details tab of the Bill Details page in User Center.
         * 
         * You must set the BillingDate parameter before you can set the Granularity parameter to DAILY.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * Specifies whether to summarize bills based on service codes. Valid values:
         * <p>
         * 
         * *   true: summarizes bills based on service codes.
         * *   false: does not summarize bills based on service codes.
         * 
         * Default value: false.
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
         * The number of the page to return. Default value: 1.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20. Maximum value: 300.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        @Override
        public QueryAccountBillRequest build() {
            return new QueryAccountBillRequest(this);
        } 

    } 

}
