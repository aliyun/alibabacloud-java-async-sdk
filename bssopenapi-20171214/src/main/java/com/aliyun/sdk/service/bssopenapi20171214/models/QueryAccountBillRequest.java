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
 * {@link QueryAccountBillRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountBillRequest</p>
 */
public class QueryAccountBillRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("IsGroupByProduct")
    private Boolean isGroupByProduct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerID")
    private Long ownerID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
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
         * <p>The ID of the account that owns and actually uses the resource.</p>
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
         * <p>The billing date. Format: YYYY-MM.</p>
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
         * <p>The billing date. This parameter is required only when you set Granularity to DAILY. Format: YYYY-MM-DD.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-01</p>
         */
        public Builder billingDate(String billingDate) {
            this.putQueryParameter("BillingDate", billingDate);
            this.billingDate = billingDate;
            return this;
        }

        /**
         * <p>The granularity for querying the bill. Valid values:</p>
         * <ul>
         * <li><p>MONTHLY: Queries bills on a monthly basis. Corresponds to the monthly bills in <strong>Expenses &amp; Costs&#xA;</strong>&gt; <strong>Bills&#xA;</strong>&gt; <strong>Bill Details&#xA;</strong>.</p>
         * </li>
         * <li><p>DAILY: Queries bills on a daily basis. Corresponds to the daily bills in <strong>Expenses &amp; Costs&#xA;</strong>&gt; <strong>Bills&#xA;</strong>&gt; <strong>Bill Details&#xA;</strong>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you set <code>Granularity</code> to <code>DAILY</code>, you must also specify the <code>BillingDate</code> parameter.</p>
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
         * <p>Specifies whether to aggregate the results by product code.</p>
         * <ul>
         * <li><p>true: Results are aggregated by product code.</p>
         * </li>
         * <li><p>false: Results are not aggregated by product code.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The page number. The default value is 1.</p>
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
         * <p>The number of entries per page. The default value is 20. The maximum value is 300.</p>
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

        @Override
        public QueryAccountBillRequest build() {
            return new QueryAccountBillRequest(this);
        } 

    } 

}
