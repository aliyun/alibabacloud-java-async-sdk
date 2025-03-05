// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link GetCustomerOrderListRequest} extends {@link RequestModel}
 *
 * <p>GetCustomerOrderListRequest</p>
 */
public class GetCustomerOrderListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerAccount")
    private String customerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerUid")
    private Long customerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderCreateAfter")
    private Long orderCreateAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderCreateBefore")
    private Long orderCreateBefore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderPayAfter")
    private Long orderPayAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderPayBefore")
    private Long orderPayBefore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderStatus")
    private Integer orderStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderTypeList")
    private java.util.List<String> orderTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 500, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayAmountAfter")
    private Double payAmountAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayAmountBefore")
    private Double payAmountBefore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private Integer payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamAccountForCustomerManager")
    private String ramAccountForCustomerManager;

    private GetCustomerOrderListRequest(Builder builder) {
        super(builder);
        this.customerAccount = builder.customerAccount;
        this.customerUid = builder.customerUid;
        this.orderCreateAfter = builder.orderCreateAfter;
        this.orderCreateBefore = builder.orderCreateBefore;
        this.orderId = builder.orderId;
        this.orderPayAfter = builder.orderPayAfter;
        this.orderPayBefore = builder.orderPayBefore;
        this.orderStatus = builder.orderStatus;
        this.orderTypeList = builder.orderTypeList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.payAmountAfter = builder.payAmountAfter;
        this.payAmountBefore = builder.payAmountBefore;
        this.payType = builder.payType;
        this.productCode = builder.productCode;
        this.productName = builder.productName;
        this.projectId = builder.projectId;
        this.ramAccountForCustomerManager = builder.ramAccountForCustomerManager;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerOrderListRequest create() {
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
     * @return customerUid
     */
    public Long getCustomerUid() {
        return this.customerUid;
    }

    /**
     * @return orderCreateAfter
     */
    public Long getOrderCreateAfter() {
        return this.orderCreateAfter;
    }

    /**
     * @return orderCreateBefore
     */
    public Long getOrderCreateBefore() {
        return this.orderCreateBefore;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderPayAfter
     */
    public Long getOrderPayAfter() {
        return this.orderPayAfter;
    }

    /**
     * @return orderPayBefore
     */
    public Long getOrderPayBefore() {
        return this.orderPayBefore;
    }

    /**
     * @return orderStatus
     */
    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * @return orderTypeList
     */
    public java.util.List<String> getOrderTypeList() {
        return this.orderTypeList;
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
     * @return payAmountAfter
     */
    public Double getPayAmountAfter() {
        return this.payAmountAfter;
    }

    /**
     * @return payAmountBefore
     */
    public Double getPayAmountBefore() {
        return this.payAmountBefore;
    }

    /**
     * @return payType
     */
    public Integer getPayType() {
        return this.payType;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return ramAccountForCustomerManager
     */
    public String getRamAccountForCustomerManager() {
        return this.ramAccountForCustomerManager;
    }

    public static final class Builder extends Request.Builder<GetCustomerOrderListRequest, Builder> {
        private String customerAccount; 
        private Long customerUid; 
        private Long orderCreateAfter; 
        private Long orderCreateBefore; 
        private Long orderId; 
        private Long orderPayAfter; 
        private Long orderPayBefore; 
        private Integer orderStatus; 
        private java.util.List<String> orderTypeList; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Double payAmountAfter; 
        private Double payAmountBefore; 
        private Integer payType; 
        private String productCode; 
        private String productName; 
        private Long projectId; 
        private String ramAccountForCustomerManager; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomerOrderListRequest request) {
            super(request);
            this.customerAccount = request.customerAccount;
            this.customerUid = request.customerUid;
            this.orderCreateAfter = request.orderCreateAfter;
            this.orderCreateBefore = request.orderCreateBefore;
            this.orderId = request.orderId;
            this.orderPayAfter = request.orderPayAfter;
            this.orderPayBefore = request.orderPayBefore;
            this.orderStatus = request.orderStatus;
            this.orderTypeList = request.orderTypeList;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.payAmountAfter = request.payAmountAfter;
            this.payAmountBefore = request.payAmountBefore;
            this.payType = request.payType;
            this.productCode = request.productCode;
            this.productName = request.productName;
            this.projectId = request.projectId;
            this.ramAccountForCustomerManager = request.ramAccountForCustomerManager;
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
         * CustomerUid.
         */
        public Builder customerUid(Long customerUid) {
            this.putQueryParameter("CustomerUid", customerUid);
            this.customerUid = customerUid;
            return this;
        }

        /**
         * OrderCreateAfter.
         */
        public Builder orderCreateAfter(Long orderCreateAfter) {
            this.putQueryParameter("OrderCreateAfter", orderCreateAfter);
            this.orderCreateAfter = orderCreateAfter;
            return this;
        }

        /**
         * OrderCreateBefore.
         */
        public Builder orderCreateBefore(Long orderCreateBefore) {
            this.putQueryParameter("OrderCreateBefore", orderCreateBefore);
            this.orderCreateBefore = orderCreateBefore;
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
         * OrderPayAfter.
         */
        public Builder orderPayAfter(Long orderPayAfter) {
            this.putQueryParameter("OrderPayAfter", orderPayAfter);
            this.orderPayAfter = orderPayAfter;
            return this;
        }

        /**
         * OrderPayBefore.
         */
        public Builder orderPayBefore(Long orderPayBefore) {
            this.putQueryParameter("OrderPayBefore", orderPayBefore);
            this.orderPayBefore = orderPayBefore;
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
         * OrderTypeList.
         */
        public Builder orderTypeList(java.util.List<String> orderTypeList) {
            String orderTypeListShrink = shrink(orderTypeList, "OrderTypeList", "json");
            this.putQueryParameter("OrderTypeList", orderTypeListShrink);
            this.orderTypeList = orderTypeList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PayAmountAfter.
         */
        public Builder payAmountAfter(Double payAmountAfter) {
            this.putQueryParameter("PayAmountAfter", payAmountAfter);
            this.payAmountAfter = payAmountAfter;
            return this;
        }

        /**
         * PayAmountBefore.
         */
        public Builder payAmountBefore(Double payAmountBefore) {
            this.putQueryParameter("PayAmountBefore", payAmountBefore);
            this.payAmountBefore = payAmountBefore;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(Integer payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
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
         * ProductName.
         */
        public Builder productName(String productName) {
            this.putQueryParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RamAccountForCustomerManager.
         */
        public Builder ramAccountForCustomerManager(String ramAccountForCustomerManager) {
            this.putQueryParameter("RamAccountForCustomerManager", ramAccountForCustomerManager);
            this.ramAccountForCustomerManager = ramAccountForCustomerManager;
            return this;
        }

        @Override
        public GetCustomerOrderListRequest build() {
            return new GetCustomerOrderListRequest(this);
        } 

    } 

}
