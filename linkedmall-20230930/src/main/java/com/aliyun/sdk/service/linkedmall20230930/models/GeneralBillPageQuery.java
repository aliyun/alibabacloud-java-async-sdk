// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link GeneralBillPageQuery} extends {@link TeaModel}
 *
 * <p>GeneralBillPageQuery</p>
 */
public class GeneralBillPageQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("asc")
    private Boolean asc;

    @com.aliyun.core.annotation.NameInMap("billId")
    private String billId;

    @com.aliyun.core.annotation.NameInMap("billPeriod")
    private String billPeriod;

    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("shopId")
    private String shopId;

    @com.aliyun.core.annotation.NameInMap("start")
    private Integer start;

    private GeneralBillPageQuery(Builder builder) {
        this.asc = builder.asc;
        this.billId = builder.billId;
        this.billPeriod = builder.billPeriod;
        this.limit = builder.limit;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.shopId = builder.shopId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeneralBillPageQuery create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asc
     */
    public Boolean getAsc() {
        return this.asc;
    }

    /**
     * @return billId
     */
    public String getBillId() {
        return this.billId;
    }

    /**
     * @return billPeriod
     */
    public String getBillPeriod() {
        return this.billPeriod;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    /**
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    public static final class Builder {
        private Boolean asc; 
        private String billId; 
        private String billPeriod; 
        private Integer limit; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String shopId; 
        private Integer start; 

        private Builder() {
        } 

        private Builder(GeneralBillPageQuery model) {
            this.asc = model.asc;
            this.billId = model.billId;
            this.billPeriod = model.billPeriod;
            this.limit = model.limit;
            this.orderBy = model.orderBy;
            this.orderDirection = model.orderDirection;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.shopId = model.shopId;
            this.start = model.start;
        } 

        /**
         * <p>asc</p>
         */
        public Builder asc(Boolean asc) {
            this.asc = asc;
            return this;
        }

        /**
         * <p>billId</p>
         * 
         * <strong>example:</strong>
         * <p>bill_demo_001</p>
         */
        public Builder billId(String billId) {
            this.billId = billId;
            return this;
        }

        /**
         * <p>billPeriod</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08</p>
         */
        public Builder billPeriod(String billPeriod) {
            this.billPeriod = billPeriod;
            return this;
        }

        /**
         * <p>limit</p>
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * <p>orderBy</p>
         */
        public Builder orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>orderDirection</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>pageNumber</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>pageSize</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>shopId</p>
         * 
         * <strong>example:</strong>
         * <p>21000017</p>
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * <p>start</p>
         */
        public Builder start(Integer start) {
            this.start = start;
            return this;
        }

        public GeneralBillPageQuery build() {
            return new GeneralBillPageQuery(this);
        } 

    } 

}
