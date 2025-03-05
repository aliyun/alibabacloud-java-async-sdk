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
 * {@link GetSubPartnerOrderListRequest} extends {@link RequestModel}
 *
 * <p>GetSubPartnerOrderListRequest</p>
 */
public class GetSubPartnerOrderListRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
    private Long orderStatus;

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
    private Long payAmountAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayAmountBefore")
    private Long payAmountBefore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(maximum = 2, minimum = 1)
    private Long payType;

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
    @com.aliyun.core.annotation.NameInMap("SubPartnerName")
    private String subPartnerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubPartnerUid")
    private Long subPartnerUid;

    private GetSubPartnerOrderListRequest(Builder builder) {
        super(builder);
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
        this.subPartnerName = builder.subPartnerName;
        this.subPartnerUid = builder.subPartnerUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubPartnerOrderListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getOrderStatus() {
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
    public Long getPayAmountAfter() {
        return this.payAmountAfter;
    }

    /**
     * @return payAmountBefore
     */
    public Long getPayAmountBefore() {
        return this.payAmountBefore;
    }

    /**
     * @return payType
     */
    public Long getPayType() {
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
     * @return subPartnerName
     */
    public String getSubPartnerName() {
        return this.subPartnerName;
    }

    /**
     * @return subPartnerUid
     */
    public Long getSubPartnerUid() {
        return this.subPartnerUid;
    }

    public static final class Builder extends Request.Builder<GetSubPartnerOrderListRequest, Builder> {
        private Long orderCreateAfter; 
        private Long orderCreateBefore; 
        private Long orderId; 
        private Long orderPayAfter; 
        private Long orderPayBefore; 
        private Long orderStatus; 
        private java.util.List<String> orderTypeList; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Long payAmountAfter; 
        private Long payAmountBefore; 
        private Long payType; 
        private String productCode; 
        private String productName; 
        private Long projectId; 
        private String subPartnerName; 
        private Long subPartnerUid; 

        private Builder() {
            super();
        } 

        private Builder(GetSubPartnerOrderListRequest request) {
            super(request);
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
            this.subPartnerName = request.subPartnerName;
            this.subPartnerUid = request.subPartnerUid;
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
        public Builder orderStatus(Long orderStatus) {
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
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PayAmountAfter.
         */
        public Builder payAmountAfter(Long payAmountAfter) {
            this.putQueryParameter("PayAmountAfter", payAmountAfter);
            this.payAmountAfter = payAmountAfter;
            return this;
        }

        /**
         * PayAmountBefore.
         */
        public Builder payAmountBefore(Long payAmountBefore) {
            this.putQueryParameter("PayAmountBefore", payAmountBefore);
            this.payAmountBefore = payAmountBefore;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(Long payType) {
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
         * SubPartnerName.
         */
        public Builder subPartnerName(String subPartnerName) {
            this.putQueryParameter("SubPartnerName", subPartnerName);
            this.subPartnerName = subPartnerName;
            return this;
        }

        /**
         * SubPartnerUid.
         */
        public Builder subPartnerUid(Long subPartnerUid) {
            this.putQueryParameter("SubPartnerUid", subPartnerUid);
            this.subPartnerUid = subPartnerUid;
            return this;
        }

        @Override
        public GetSubPartnerOrderListRequest build() {
            return new GetSubPartnerOrderListRequest(this);
        } 

    } 

}
