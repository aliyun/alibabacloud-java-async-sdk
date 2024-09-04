// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomerOrdersRequest} extends {@link RequestModel}
 *
 * <p>GetCustomerOrdersRequest</p>
 */
public class GetCustomerOrdersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerAccount")
    private String customerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerManager")
    private String customerManager;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerUid")
    private Long customerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderSource")
    private Integer orderSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderStatus")
    private Integer orderStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 500, minimum = 1)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timeType;

    private GetCustomerOrdersRequest(Builder builder) {
        super(builder);
        this.customerAccount = builder.customerAccount;
        this.customerManager = builder.customerManager;
        this.customerUid = builder.customerUid;
        this.endDate = builder.endDate;
        this.orderId = builder.orderId;
        this.orderSource = builder.orderSource;
        this.orderStatus = builder.orderStatus;
        this.orderType = builder.orderType;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.startDate = builder.startDate;
        this.timeType = builder.timeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerOrdersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerAccount
     */
    public String getCustomerAccount() {
        return this.customerAccount;
    }

    /**
     * @return customerManager
     */
    public String getCustomerManager() {
        return this.customerManager;
    }

    /**
     * @return customerUid
     */
    public Long getCustomerUid() {
        return this.customerUid;
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
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderSource
     */
    public Integer getOrderSource() {
        return this.orderSource;
    }

    /**
     * @return orderStatus
     */
    public Integer getOrderStatus() {
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
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return timeType
     */
    public Integer getTimeType() {
        return this.timeType;
    }

    public static final class Builder extends Request.Builder<GetCustomerOrdersRequest, Builder> {
        private String customerAccount; 
        private String customerManager; 
        private Long customerUid; 
        private String endDate; 
        private Long orderId; 
        private Integer orderSource; 
        private Integer orderStatus; 
        private String orderType; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String productType; 
        private String startDate; 
        private Integer timeType; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomerOrdersRequest request) {
            super(request);
            this.customerAccount = request.customerAccount;
            this.customerManager = request.customerManager;
            this.customerUid = request.customerUid;
            this.endDate = request.endDate;
            this.orderId = request.orderId;
            this.orderSource = request.orderSource;
            this.orderStatus = request.orderStatus;
            this.orderType = request.orderType;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.startDate = request.startDate;
            this.timeType = request.timeType;
        } 

        /**
         * CustomerAccount.
         */
        public Builder customerAccount(String customerAccount) {
            this.putQueryParameter("CustomerAccount", customerAccount);
            this.customerAccount = customerAccount;
            return this;
        }

        /**
         * CustomerManager.
         */
        public Builder customerManager(String customerManager) {
            this.putQueryParameter("CustomerManager", customerManager);
            this.customerManager = customerManager;
            return this;
        }

        /**
         * CustomerUid.
         */
        public Builder customerUid(Long customerUid) {
            this.putQueryParameter("CustomerUid", customerUid);
            this.customerUid = customerUid;
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
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * OrderSource.
         */
        public Builder orderSource(Integer orderSource) {
            this.putQueryParameter("OrderSource", orderSource);
            this.orderSource = orderSource;
            return this;
        }

        /**
         * OrderStatus.
         */
        public Builder orderStatus(Integer orderStatus) {
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
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
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

        /**
         * TimeType.
         */
        public Builder timeType(Integer timeType) {
            this.putQueryParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        @Override
        public GetCustomerOrdersRequest build() {
            return new GetCustomerOrdersRequest(this);
        } 

    } 

}
