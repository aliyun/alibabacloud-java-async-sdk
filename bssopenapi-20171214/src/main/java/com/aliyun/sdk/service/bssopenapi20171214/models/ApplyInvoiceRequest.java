// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyInvoiceRequest} extends {@link RequestModel}
 *
 * <p>ApplyInvoiceRequest</p>
 */
public class ApplyInvoiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long addressId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyUserNick")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applyUserNick;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long customerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceAmount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long invoiceAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoiceByAmount")
    private Boolean invoiceByAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvoicingType")
    private Integer invoicingType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessWay")
    private Integer processWay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectedIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Long > selectedIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserRemark")
    private String userRemark;

    private ApplyInvoiceRequest(Builder builder) {
        super(builder);
        this.addressId = builder.addressId;
        this.applyUserNick = builder.applyUserNick;
        this.customerId = builder.customerId;
        this.invoiceAmount = builder.invoiceAmount;
        this.invoiceByAmount = builder.invoiceByAmount;
        this.invoicingType = builder.invoicingType;
        this.ownerId = builder.ownerId;
        this.processWay = builder.processWay;
        this.selectedIds = builder.selectedIds;
        this.userRemark = builder.userRemark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyInvoiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressId
     */
    public Long getAddressId() {
        return this.addressId;
    }

    /**
     * @return applyUserNick
     */
    public String getApplyUserNick() {
        return this.applyUserNick;
    }

    /**
     * @return customerId
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * @return invoiceAmount
     */
    public Long getInvoiceAmount() {
        return this.invoiceAmount;
    }

    /**
     * @return invoiceByAmount
     */
    public Boolean getInvoiceByAmount() {
        return this.invoiceByAmount;
    }

    /**
     * @return invoicingType
     */
    public Integer getInvoicingType() {
        return this.invoicingType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return processWay
     */
    public Integer getProcessWay() {
        return this.processWay;
    }

    /**
     * @return selectedIds
     */
    public java.util.List < Long > getSelectedIds() {
        return this.selectedIds;
    }

    /**
     * @return userRemark
     */
    public String getUserRemark() {
        return this.userRemark;
    }

    public static final class Builder extends Request.Builder<ApplyInvoiceRequest, Builder> {
        private Long addressId; 
        private String applyUserNick; 
        private Long customerId; 
        private Long invoiceAmount; 
        private Boolean invoiceByAmount; 
        private Integer invoicingType; 
        private Long ownerId; 
        private Integer processWay; 
        private java.util.List < Long > selectedIds; 
        private String userRemark; 

        private Builder() {
            super();
        } 

        private Builder(ApplyInvoiceRequest request) {
            super(request);
            this.addressId = request.addressId;
            this.applyUserNick = request.applyUserNick;
            this.customerId = request.customerId;
            this.invoiceAmount = request.invoiceAmount;
            this.invoiceByAmount = request.invoiceByAmount;
            this.invoicingType = request.invoicingType;
            this.ownerId = request.ownerId;
            this.processWay = request.processWay;
            this.selectedIds = request.selectedIds;
            this.userRemark = request.userRemark;
        } 

        /**
         * <p>The ID of the address to which the invoice is delivered. This parameter is required if the invoice is a paper invoice. Set the ID to the value of the AddressId parameter returned by calling the QueryCustomerAddressList operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>237958367</p>
         */
        public Builder addressId(Long addressId) {
            this.putQueryParameter("AddressId", addressId);
            this.addressId = addressId;
            return this;
        }

        /**
         * <p>The nickname of the applicant. The system does not verify the nickname.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder applyUserNick(String applyUserNick) {
            this.putQueryParameter("ApplyUserNick", applyUserNick);
            this.applyUserNick = applyUserNick;
            return this;
        }

        /**
         * <p>The ID of the customer. Set the ID to the value of the CustomerId parameter returned by calling the QueryInvoicingCustomerList operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>124132423</p>
         */
        public Builder customerId(Long customerId) {
            this.putQueryParameter("CustomerId", customerId);
            this.customerId = customerId;
            return this;
        }

        /**
         * <p>The amount of the invoice. Unit: Cent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>124132</p>
         */
        public Builder invoiceAmount(Long invoiceAmount) {
            this.putQueryParameter("InvoiceAmount", invoiceAmount);
            this.invoiceAmount = invoiceAmount;
            return this;
        }

        /**
         * <p>Specifies whether to invoice by amount. A value of true indicates that the user applies for the invoice based on the InvoiceAmount parameter. A value of false indicates that the user applies for the invoice based on the total amount of the invoicing items.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder invoiceByAmount(Boolean invoiceByAmount) {
            this.putQueryParameter("InvoiceByAmount", invoiceByAmount);
            this.invoiceByAmount = invoiceByAmount;
            return this;
        }

        /**
         * <p>The type of the invoice. Valid values:</p>
         * <ul>
         * <li>0: paper invoice</li>
         * <li>1: electronic invoice</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder invoicingType(Integer invoicingType) {
            this.putQueryParameter("InvoicingType", invoicingType);
            this.invoicingType = invoicingType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The channel that is used to process the invoice. A value of 0 indicates that the invoice is processed by Alibaba Cloud. A value of 1 indicates that the invoice is processed by the tax platform. Set the value to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder processWay(Integer processWay) {
            this.putQueryParameter("ProcessWay", processWay);
            this.processWay = processWay;
            return this;
        }

        /**
         * <p>The IDs of the selected invoicing items. Set the IDs to the IDs returned by calling the QueryEvaluateList operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>384752367</p>
         */
        public Builder selectedIds(java.util.List < Long > selectedIds) {
            this.putQueryParameter("SelectedIds", selectedIds);
            this.selectedIds = selectedIds;
            return this;
        }

        /**
         * <p>The remarks made by the user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder userRemark(String userRemark) {
            this.putQueryParameter("UserRemark", userRemark);
            this.userRemark = userRemark;
            return this;
        }

        @Override
        public ApplyInvoiceRequest build() {
            return new ApplyInvoiceRequest(this);
        } 

    } 

}
