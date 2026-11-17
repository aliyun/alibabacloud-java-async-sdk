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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RebateType")
    private Integer rebateType;

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
        this.rebateType = builder.rebateType;
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

    /**
     * @return rebateType
     */
    public Integer getRebateType() {
        return this.rebateType;
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
        private Integer rebateType; 

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
            this.rebateType = request.rebateType;
        } 

        /**
         * <p>The customer account.</p>
         * 
         * <strong>example:</strong>
         * <p>test_123</p>
         */
        public Builder customerAccount(String customerAccount) {
            this.putQueryParameter("CustomerAccount", customerAccount);
            this.customerAccount = customerAccount;
            return this;
        }

        /**
         * <p>The customer UID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder customerUid(Long customerUid) {
            this.putQueryParameter("CustomerUid", customerUid);
            this.customerUid = customerUid;
            return this;
        }

        /**
         * <p>The start timestamp for order creation. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1727789348000</p>
         */
        public Builder orderCreateAfter(Long orderCreateAfter) {
            this.putQueryParameter("OrderCreateAfter", orderCreateAfter);
            this.orderCreateAfter = orderCreateAfter;
            return this;
        }

        /**
         * <p>The end timestamp for order creation. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1741008566000</p>
         */
        public Builder orderCreateBefore(Long orderCreateBefore) {
            this.putQueryParameter("OrderCreateBefore", orderCreateBefore);
            this.orderCreateBefore = orderCreateBefore;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13595216</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The start timestamp for order payment. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1727789348000</p>
         */
        public Builder orderPayAfter(Long orderPayAfter) {
            this.putQueryParameter("OrderPayAfter", orderPayAfter);
            this.orderPayAfter = orderPayAfter;
            return this;
        }

        /**
         * <p>The end timestamp for order payment. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1741008566000</p>
         */
        public Builder orderPayBefore(Long orderPayBefore) {
            this.putQueryParameter("OrderPayBefore", orderPayBefore);
            this.orderPayBefore = orderPayBefore;
            return this;
        }

        /**
         * <p>The order status. Valid values:</p>
         * <ul>
         * <li>1: unpaid</li>
         * <li>2: canceled</li>
         * <li>3: paid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder orderStatus(Integer orderStatus) {
            this.putQueryParameter("OrderStatus", orderStatus);
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * <p>The list of order types.</p>
         */
        public Builder orderTypeList(java.util.List<String> orderTypeList) {
            String orderTypeListShrink = shrink(orderTypeList, "OrderTypeList", "json");
            this.putQueryParameter("OrderTypeList", orderTypeListShrink);
            this.orderTypeList = orderTypeList;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>The minimum actual payment amount.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder payAmountAfter(Double payAmountAfter) {
            this.putQueryParameter("PayAmountAfter", payAmountAfter);
            this.payAmountAfter = payAmountAfter;
            return this;
        }

        /**
         * <p>The maximum actual payment amount.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder payAmountBefore(Double payAmountBefore) {
            this.putQueryParameter("PayAmountBefore", payAmountBefore);
            this.payAmountBefore = payAmountBefore;
            return this;
        }

        /**
         * <p>The payment type. Valid values:</p>
         * <ul>
         * <li>1: non-delegated payment</li>
         * <li>2: delegated payment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder payType(Integer payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>Elastic computing</p>
         */
        public Builder productName(String productName) {
            this.putQueryParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * <p>The opportunity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>202502002231</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The employee who follows up with the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>1234532</p>
         */
        public Builder ramAccountForCustomerManager(String ramAccountForCustomerManager) {
            this.putQueryParameter("RamAccountForCustomerManager", ramAccountForCustomerManager);
            this.ramAccountForCustomerManager = ramAccountForCustomerManager;
            return this;
        }

        /**
         * RebateType.
         */
        public Builder rebateType(Integer rebateType) {
            this.putQueryParameter("RebateType", rebateType);
            this.rebateType = rebateType;
            return this;
        }

        @Override
        public GetCustomerOrderListRequest build() {
            return new GetCustomerOrderListRequest(this);
        } 

    } 

}
