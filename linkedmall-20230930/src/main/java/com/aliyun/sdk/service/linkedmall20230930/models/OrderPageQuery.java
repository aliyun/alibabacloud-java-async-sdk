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
 * {@link OrderPageQuery} extends {@link TeaModel}
 *
 * <p>OrderPageQuery</p>
 */
public class OrderPageQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("orderIdList")
    private java.util.List<String> orderIdList;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("purchaseOrderId")
    private String purchaseOrderId;

    private OrderPageQuery(Builder builder) {
        this.orderIdList = builder.orderIdList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.purchaseOrderId = builder.purchaseOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderPageQuery create() {
        return builder().build();
    }

    /**
     * @return orderIdList
     */
    public java.util.List<String> getOrderIdList() {
        return this.orderIdList;
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
     * @return purchaseOrderId
     */
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public static final class Builder {
        private java.util.List<String> orderIdList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String purchaseOrderId; 

        /**
         * orderIdList.
         */
        public Builder orderIdList(java.util.List<String> orderIdList) {
            this.orderIdList = orderIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * purchaseOrderId.
         */
        public Builder purchaseOrderId(String purchaseOrderId) {
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }

        public OrderPageQuery build() {
            return new OrderPageQuery(this);
        } 

    } 

}
