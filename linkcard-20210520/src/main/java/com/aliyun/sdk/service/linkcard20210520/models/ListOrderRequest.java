// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrderRequest} extends {@link RequestModel}
 *
 * <p>ListOrderRequest</p>
 */
public class ListOrderRequest extends Request {
    @Query
    @NameInMap("CredentialNo")
    private String credentialNo;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("OrderId")
    private String orderId;

    @Query
    @NameInMap("OrderStatus")
    private String orderStatus;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    private ListOrderRequest(Builder builder) {
        super(builder);
        this.credentialNo = builder.credentialNo;
        this.endDate = builder.endDate;
        this.orderId = builder.orderId;
        this.orderStatus = builder.orderStatus;
        this.orderType = builder.orderType;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialNo
     */
    public String getCredentialNo() {
        return this.credentialNo;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderStatus
     */
    public String getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ListOrderRequest, Builder> {
        private String credentialNo; 
        private String endDate; 
        private String orderId; 
        private String orderStatus; 
        private String orderType; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ListOrderRequest request) {
            super(request);
            this.credentialNo = request.credentialNo;
            this.endDate = request.endDate;
            this.orderId = request.orderId;
            this.orderStatus = request.orderStatus;
            this.orderType = request.orderType;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
        } 

        /**
         * CredentialNo.
         */
        public Builder credentialNo(String credentialNo) {
            this.putQueryParameter("CredentialNo", credentialNo);
            this.credentialNo = credentialNo;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * OrderStatus.
         */
        public Builder orderStatus(String orderStatus) {
            this.putQueryParameter("OrderStatus", orderStatus);
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ListOrderRequest build() {
            return new ListOrderRequest(this);
        } 

    } 

}
