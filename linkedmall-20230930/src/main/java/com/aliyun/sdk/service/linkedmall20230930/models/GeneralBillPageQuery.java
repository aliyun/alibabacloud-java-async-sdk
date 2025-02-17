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

        /**
         * asc.
         */
        public Builder asc(Boolean asc) {
            this.asc = asc;
            return this;
        }

        /**
         * billId.
         */
        public Builder billId(String billId) {
            this.billId = billId;
            return this;
        }

        /**
         * billPeriod.
         */
        public Builder billPeriod(String billPeriod) {
            this.billPeriod = billPeriod;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        /**
         * orderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * shopId.
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * start.
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
