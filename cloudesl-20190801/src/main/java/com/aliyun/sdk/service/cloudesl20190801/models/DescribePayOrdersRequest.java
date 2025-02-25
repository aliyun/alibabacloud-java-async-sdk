// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePayOrdersRequest} extends {@link RequestModel}
 *
 * <p>DescribePayOrdersRequest</p>
 */
public class DescribePayOrdersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromDate")
    private String fromDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToDate")
    private String toDate;

    private DescribePayOrdersRequest(Builder builder) {
        super(builder);
        this.fromDate = builder.fromDate;
        this.orderId = builder.orderId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.toDate = builder.toDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePayOrdersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromDate
     */
    public String getFromDate() {
        return this.fromDate;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
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
     * @return toDate
     */
    public String getToDate() {
        return this.toDate;
    }

    public static final class Builder extends Request.Builder<DescribePayOrdersRequest, Builder> {
        private String fromDate; 
        private String orderId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String toDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribePayOrdersRequest request) {
            super(request);
            this.fromDate = request.fromDate;
            this.orderId = request.orderId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.toDate = request.toDate;
        } 

        /**
         * FromDate.
         */
        public Builder fromDate(String fromDate) {
            this.putBodyParameter("FromDate", fromDate);
            this.fromDate = fromDate;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ToDate.
         */
        public Builder toDate(String toDate) {
            this.putBodyParameter("ToDate", toDate);
            this.toDate = toDate;
            return this;
        }

        @Override
        public DescribePayOrdersRequest build() {
            return new DescribePayOrdersRequest(this);
        } 

    } 

}
