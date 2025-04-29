// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link FuPointBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>FuPointBillSettlementQueryResponseBody</p>
 */
public class FuPointBillSettlementQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("more_page")
    private Boolean morePage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result_msg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private FuPointBillSettlementQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.module = builder.module;
        this.morePage = builder.morePage;
        this.requestId = builder.requestId;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FuPointBillSettlementQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return morePage
     */
    public Boolean getMorePage() {
        return this.morePage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Integer code; 
        private Module module; 
        private Boolean morePage; 
        private String requestId; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(FuPointBillSettlementQueryResponseBody model) {
            this.code = model.code;
            this.module = model.module;
            this.morePage = model.morePage;
            this.requestId = model.requestId;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>module。</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * more_page.
         */
        public Builder morePage(Boolean morePage) {
            this.morePage = morePage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result_msg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>trace_id</p>
         * 
         * <strong>example:</strong>
         * <p>213e382517240341253056547e41fc</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public FuPointBillSettlementQueryResponseBody build() {
            return new FuPointBillSettlementQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FuPointBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FuPointBillSettlementQueryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alipay_id")
        private String alipayId;

        @com.aliyun.core.annotation.NameInMap("alipay_trade_no")
        private String alipayTradeNo;

        @com.aliyun.core.annotation.NameInMap("apply_arr_city_code")
        private String applyArrCityCode;

        @com.aliyun.core.annotation.NameInMap("apply_arr_city_name")
        private String applyArrCityName;

        @com.aliyun.core.annotation.NameInMap("apply_dep_city_code")
        private String applyDepCityCode;

        @com.aliyun.core.annotation.NameInMap("apply_dep_city_name")
        private String applyDepCityName;

        @com.aliyun.core.annotation.NameInMap("apply_extend_field")
        private String applyExtendField;

        @com.aliyun.core.annotation.NameInMap("apply_id")
        private String applyId;

        @com.aliyun.core.annotation.NameInMap("approver_email")
        private String approverEmail;

        @com.aliyun.core.annotation.NameInMap("approver_id")
        private String approverId;

        @com.aliyun.core.annotation.NameInMap("approver_name")
        private String approverName;

        @com.aliyun.core.annotation.NameInMap("award_num")
        private Double awardNum;

        @com.aliyun.core.annotation.NameInMap("basis_amount")
        private String basisAmount;

        @com.aliyun.core.annotation.NameInMap("bill_record_time")
        private String billRecordTime;

        @com.aliyun.core.annotation.NameInMap("billing_entity")
        private String billingEntity;

        @com.aliyun.core.annotation.NameInMap("book_mode")
        private String bookMode;

        @com.aliyun.core.annotation.NameInMap("book_time")
        private String bookTime;

        @com.aliyun.core.annotation.NameInMap("booker_id")
        private String bookerId;

        @com.aliyun.core.annotation.NameInMap("booker_job_no")
        private String bookerJobNo;

        @com.aliyun.core.annotation.NameInMap("booker_name")
        private String bookerName;

        @com.aliyun.core.annotation.NameInMap("capital_direction")
        private String capitalDirection;

        @com.aliyun.core.annotation.NameInMap("cascade_department")
        private String cascadeDepartment;

        @com.aliyun.core.annotation.NameInMap("category_desc")
        private String categoryDesc;

        @com.aliyun.core.annotation.NameInMap("category_order_settle_price")
        private String categoryOrderSettlePrice;

        @com.aliyun.core.annotation.NameInMap("cost_center")
        private String costCenter;

        @com.aliyun.core.annotation.NameInMap("cost_center_number")
        private String costCenterNumber;

        @com.aliyun.core.annotation.NameInMap("deductible_tax")
        private Double deductibleTax;

        @com.aliyun.core.annotation.NameInMap("department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("department_id")
        private String departmentId;

        @com.aliyun.core.annotation.NameInMap("fee_type")
        private String feeType;

        @com.aliyun.core.annotation.NameInMap("fee_type_desc")
        private String feeTypeDesc;

        @com.aliyun.core.annotation.NameInMap("foreigners_tag")
        private String foreignersTag;

        @com.aliyun.core.annotation.NameInMap("grant_num")
        private Double grantNum;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("make_invoice")
        private String makeInvoice;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("order_status_desc")
        private String orderStatusDesc;

        @com.aliyun.core.annotation.NameInMap("origin_category")
        private String originCategory;

        @com.aliyun.core.annotation.NameInMap("origin_order_id")
        private String originOrderId;

        @com.aliyun.core.annotation.NameInMap("over_apply_id")
        private String overApplyId;

        @com.aliyun.core.annotation.NameInMap("payment_department_id")
        private String paymentDepartmentId;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

        @com.aliyun.core.annotation.NameInMap("primary_id")
        private Long primaryId;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_name")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("purchase_order_id")
        private String purchaseOrderId;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("save_amount")
        private Double saveAmount;

        @com.aliyun.core.annotation.NameInMap("scene_id")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("scene_name")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("settle_type_desc")
        private String settleTypeDesc;

        @com.aliyun.core.annotation.NameInMap("settlement_fee")
        private Double settlementFee;

        @com.aliyun.core.annotation.NameInMap("settlement_grant_fee")
        private Double settlementGrantFee;

        @com.aliyun.core.annotation.NameInMap("settlement_time")
        private String settlementTime;

        @com.aliyun.core.annotation.NameInMap("settlement_type")
        private String settlementType;

        @com.aliyun.core.annotation.NameInMap("show_sub_order_id")
        private String showSubOrderId;

        @com.aliyun.core.annotation.NameInMap("sio")
        private String sio;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("status_desc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("sub_order_id")
        private String subOrderId;

        @com.aliyun.core.annotation.NameInMap("tax_rate")
        private String taxRate;

        @com.aliyun.core.annotation.NameInMap("third_invoice_id")
        private String thirdInvoiceId;

        @com.aliyun.core.annotation.NameInMap("third_itinerary_id")
        private String thirdItineraryId;

        @com.aliyun.core.annotation.NameInMap("trade_action_desc")
        private String tradeActionDesc;

        @com.aliyun.core.annotation.NameInMap("trade_reason")
        private String tradeReason;

        @com.aliyun.core.annotation.NameInMap("traveler_email")
        private String travelerEmail;

        @com.aliyun.core.annotation.NameInMap("traveler_id")
        private String travelerId;

        @com.aliyun.core.annotation.NameInMap("traveler_job_no")
        private String travelerJobNo;

        @com.aliyun.core.annotation.NameInMap("traveler_member_type")
        private String travelerMemberType;

        @com.aliyun.core.annotation.NameInMap("traveler_member_type_name")
        private String travelerMemberTypeName;

        @com.aliyun.core.annotation.NameInMap("traveler_name")
        private String travelerName;

        @com.aliyun.core.annotation.NameInMap("voucher_type")
        private Integer voucherType;

        @com.aliyun.core.annotation.NameInMap("voucher_type_desc")
        private String voucherTypeDesc;

        private Items(Builder builder) {
            this.alipayId = builder.alipayId;
            this.alipayTradeNo = builder.alipayTradeNo;
            this.applyArrCityCode = builder.applyArrCityCode;
            this.applyArrCityName = builder.applyArrCityName;
            this.applyDepCityCode = builder.applyDepCityCode;
            this.applyDepCityName = builder.applyDepCityName;
            this.applyExtendField = builder.applyExtendField;
            this.applyId = builder.applyId;
            this.approverEmail = builder.approverEmail;
            this.approverId = builder.approverId;
            this.approverName = builder.approverName;
            this.awardNum = builder.awardNum;
            this.basisAmount = builder.basisAmount;
            this.billRecordTime = builder.billRecordTime;
            this.billingEntity = builder.billingEntity;
            this.bookMode = builder.bookMode;
            this.bookTime = builder.bookTime;
            this.bookerId = builder.bookerId;
            this.bookerJobNo = builder.bookerJobNo;
            this.bookerName = builder.bookerName;
            this.capitalDirection = builder.capitalDirection;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.categoryDesc = builder.categoryDesc;
            this.categoryOrderSettlePrice = builder.categoryOrderSettlePrice;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.deductibleTax = builder.deductibleTax;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.feeType = builder.feeType;
            this.feeTypeDesc = builder.feeTypeDesc;
            this.foreignersTag = builder.foreignersTag;
            this.grantNum = builder.grantNum;
            this.index = builder.index;
            this.invoiceTitle = builder.invoiceTitle;
            this.location = builder.location;
            this.makeInvoice = builder.makeInvoice;
            this.orderId = builder.orderId;
            this.orderStatusDesc = builder.orderStatusDesc;
            this.originCategory = builder.originCategory;
            this.originOrderId = builder.originOrderId;
            this.overApplyId = builder.overApplyId;
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.primaryId = builder.primaryId;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.purchaseOrderId = builder.purchaseOrderId;
            this.remark = builder.remark;
            this.saveAmount = builder.saveAmount;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.settleTypeDesc = builder.settleTypeDesc;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.showSubOrderId = builder.showSubOrderId;
            this.sio = builder.sio;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.subOrderId = builder.subOrderId;
            this.taxRate = builder.taxRate;
            this.thirdInvoiceId = builder.thirdInvoiceId;
            this.thirdItineraryId = builder.thirdItineraryId;
            this.tradeActionDesc = builder.tradeActionDesc;
            this.tradeReason = builder.tradeReason;
            this.travelerEmail = builder.travelerEmail;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerMemberType = builder.travelerMemberType;
            this.travelerMemberTypeName = builder.travelerMemberTypeName;
            this.travelerName = builder.travelerName;
            this.voucherType = builder.voucherType;
            this.voucherTypeDesc = builder.voucherTypeDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return alipayId
         */
        public String getAlipayId() {
            return this.alipayId;
        }

        /**
         * @return alipayTradeNo
         */
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        /**
         * @return applyArrCityCode
         */
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        /**
         * @return applyArrCityName
         */
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        /**
         * @return applyDepCityCode
         */
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        /**
         * @return applyDepCityName
         */
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        /**
         * @return applyExtendField
         */
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
        }

        /**
         * @return approverEmail
         */
        public String getApproverEmail() {
            return this.approverEmail;
        }

        /**
         * @return approverId
         */
        public String getApproverId() {
            return this.approverId;
        }

        /**
         * @return approverName
         */
        public String getApproverName() {
            return this.approverName;
        }

        /**
         * @return awardNum
         */
        public Double getAwardNum() {
            return this.awardNum;
        }

        /**
         * @return basisAmount
         */
        public String getBasisAmount() {
            return this.basisAmount;
        }

        /**
         * @return billRecordTime
         */
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        /**
         * @return billingEntity
         */
        public String getBillingEntity() {
            return this.billingEntity;
        }

        /**
         * @return bookMode
         */
        public String getBookMode() {
            return this.bookMode;
        }

        /**
         * @return bookTime
         */
        public String getBookTime() {
            return this.bookTime;
        }

        /**
         * @return bookerId
         */
        public String getBookerId() {
            return this.bookerId;
        }

        /**
         * @return bookerJobNo
         */
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        /**
         * @return bookerName
         */
        public String getBookerName() {
            return this.bookerName;
        }

        /**
         * @return capitalDirection
         */
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        /**
         * @return cascadeDepartment
         */
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        /**
         * @return categoryDesc
         */
        public String getCategoryDesc() {
            return this.categoryDesc;
        }

        /**
         * @return categoryOrderSettlePrice
         */
        public String getCategoryOrderSettlePrice() {
            return this.categoryOrderSettlePrice;
        }

        /**
         * @return costCenter
         */
        public String getCostCenter() {
            return this.costCenter;
        }

        /**
         * @return costCenterNumber
         */
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        /**
         * @return deductibleTax
         */
        public Double getDeductibleTax() {
            return this.deductibleTax;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return departmentId
         */
        public String getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return feeType
         */
        public String getFeeType() {
            return this.feeType;
        }

        /**
         * @return feeTypeDesc
         */
        public String getFeeTypeDesc() {
            return this.feeTypeDesc;
        }

        /**
         * @return foreignersTag
         */
        public String getForeignersTag() {
            return this.foreignersTag;
        }

        /**
         * @return grantNum
         */
        public Double getGrantNum() {
            return this.grantNum;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return makeInvoice
         */
        public String getMakeInvoice() {
            return this.makeInvoice;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderStatusDesc
         */
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        /**
         * @return originCategory
         */
        public String getOriginCategory() {
            return this.originCategory;
        }

        /**
         * @return originOrderId
         */
        public String getOriginOrderId() {
            return this.originOrderId;
        }

        /**
         * @return overApplyId
         */
        public String getOverApplyId() {
            return this.overApplyId;
        }

        /**
         * @return paymentDepartmentId
         */
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        /**
         * @return paymentDepartmentName
         */
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        /**
         * @return primaryId
         */
        public Long getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return purchaseOrderId
         */
        public String getPurchaseOrderId() {
            return this.purchaseOrderId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return saveAmount
         */
        public Double getSaveAmount() {
            return this.saveAmount;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return settleTypeDesc
         */
        public String getSettleTypeDesc() {
            return this.settleTypeDesc;
        }

        /**
         * @return settlementFee
         */
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        /**
         * @return settlementGrantFee
         */
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        /**
         * @return settlementTime
         */
        public String getSettlementTime() {
            return this.settlementTime;
        }

        /**
         * @return settlementType
         */
        public String getSettlementType() {
            return this.settlementType;
        }

        /**
         * @return showSubOrderId
         */
        public String getShowSubOrderId() {
            return this.showSubOrderId;
        }

        /**
         * @return sio
         */
        public String getSio() {
            return this.sio;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return subOrderId
         */
        public String getSubOrderId() {
            return this.subOrderId;
        }

        /**
         * @return taxRate
         */
        public String getTaxRate() {
            return this.taxRate;
        }

        /**
         * @return thirdInvoiceId
         */
        public String getThirdInvoiceId() {
            return this.thirdInvoiceId;
        }

        /**
         * @return thirdItineraryId
         */
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        /**
         * @return tradeActionDesc
         */
        public String getTradeActionDesc() {
            return this.tradeActionDesc;
        }

        /**
         * @return tradeReason
         */
        public String getTradeReason() {
            return this.tradeReason;
        }

        /**
         * @return travelerEmail
         */
        public String getTravelerEmail() {
            return this.travelerEmail;
        }

        /**
         * @return travelerId
         */
        public String getTravelerId() {
            return this.travelerId;
        }

        /**
         * @return travelerJobNo
         */
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        /**
         * @return travelerMemberType
         */
        public String getTravelerMemberType() {
            return this.travelerMemberType;
        }

        /**
         * @return travelerMemberTypeName
         */
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        /**
         * @return travelerName
         */
        public String getTravelerName() {
            return this.travelerName;
        }

        /**
         * @return voucherType
         */
        public Integer getVoucherType() {
            return this.voucherType;
        }

        /**
         * @return voucherTypeDesc
         */
        public String getVoucherTypeDesc() {
            return this.voucherTypeDesc;
        }

        public static final class Builder {
            private String alipayId; 
            private String alipayTradeNo; 
            private String applyArrCityCode; 
            private String applyArrCityName; 
            private String applyDepCityCode; 
            private String applyDepCityName; 
            private String applyExtendField; 
            private String applyId; 
            private String approverEmail; 
            private String approverId; 
            private String approverName; 
            private Double awardNum; 
            private String basisAmount; 
            private String billRecordTime; 
            private String billingEntity; 
            private String bookMode; 
            private String bookTime; 
            private String bookerId; 
            private String bookerJobNo; 
            private String bookerName; 
            private String capitalDirection; 
            private String cascadeDepartment; 
            private String categoryDesc; 
            private String categoryOrderSettlePrice; 
            private String costCenter; 
            private String costCenterNumber; 
            private Double deductibleTax; 
            private String department; 
            private String departmentId; 
            private String feeType; 
            private String feeTypeDesc; 
            private String foreignersTag; 
            private Double grantNum; 
            private String index; 
            private String invoiceTitle; 
            private String location; 
            private String makeInvoice; 
            private String orderId; 
            private String orderStatusDesc; 
            private String originCategory; 
            private String originOrderId; 
            private String overApplyId; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private Long primaryId; 
            private String projectCode; 
            private String projectName; 
            private String purchaseOrderId; 
            private String remark; 
            private Double saveAmount; 
            private String sceneId; 
            private String sceneName; 
            private String settleTypeDesc; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private String showSubOrderId; 
            private String sio; 
            private Integer status; 
            private String statusDesc; 
            private String subOrderId; 
            private String taxRate; 
            private String thirdInvoiceId; 
            private String thirdItineraryId; 
            private String tradeActionDesc; 
            private String tradeReason; 
            private String travelerEmail; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerMemberType; 
            private String travelerMemberTypeName; 
            private String travelerName; 
            private Integer voucherType; 
            private String voucherTypeDesc; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.alipayId = model.alipayId;
                this.alipayTradeNo = model.alipayTradeNo;
                this.applyArrCityCode = model.applyArrCityCode;
                this.applyArrCityName = model.applyArrCityName;
                this.applyDepCityCode = model.applyDepCityCode;
                this.applyDepCityName = model.applyDepCityName;
                this.applyExtendField = model.applyExtendField;
                this.applyId = model.applyId;
                this.approverEmail = model.approverEmail;
                this.approverId = model.approverId;
                this.approverName = model.approverName;
                this.awardNum = model.awardNum;
                this.basisAmount = model.basisAmount;
                this.billRecordTime = model.billRecordTime;
                this.billingEntity = model.billingEntity;
                this.bookMode = model.bookMode;
                this.bookTime = model.bookTime;
                this.bookerId = model.bookerId;
                this.bookerJobNo = model.bookerJobNo;
                this.bookerName = model.bookerName;
                this.capitalDirection = model.capitalDirection;
                this.cascadeDepartment = model.cascadeDepartment;
                this.categoryDesc = model.categoryDesc;
                this.categoryOrderSettlePrice = model.categoryOrderSettlePrice;
                this.costCenter = model.costCenter;
                this.costCenterNumber = model.costCenterNumber;
                this.deductibleTax = model.deductibleTax;
                this.department = model.department;
                this.departmentId = model.departmentId;
                this.feeType = model.feeType;
                this.feeTypeDesc = model.feeTypeDesc;
                this.foreignersTag = model.foreignersTag;
                this.grantNum = model.grantNum;
                this.index = model.index;
                this.invoiceTitle = model.invoiceTitle;
                this.location = model.location;
                this.makeInvoice = model.makeInvoice;
                this.orderId = model.orderId;
                this.orderStatusDesc = model.orderStatusDesc;
                this.originCategory = model.originCategory;
                this.originOrderId = model.originOrderId;
                this.overApplyId = model.overApplyId;
                this.paymentDepartmentId = model.paymentDepartmentId;
                this.paymentDepartmentName = model.paymentDepartmentName;
                this.primaryId = model.primaryId;
                this.projectCode = model.projectCode;
                this.projectName = model.projectName;
                this.purchaseOrderId = model.purchaseOrderId;
                this.remark = model.remark;
                this.saveAmount = model.saveAmount;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.settleTypeDesc = model.settleTypeDesc;
                this.settlementFee = model.settlementFee;
                this.settlementGrantFee = model.settlementGrantFee;
                this.settlementTime = model.settlementTime;
                this.settlementType = model.settlementType;
                this.showSubOrderId = model.showSubOrderId;
                this.sio = model.sio;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.subOrderId = model.subOrderId;
                this.taxRate = model.taxRate;
                this.thirdInvoiceId = model.thirdInvoiceId;
                this.thirdItineraryId = model.thirdItineraryId;
                this.tradeActionDesc = model.tradeActionDesc;
                this.tradeReason = model.tradeReason;
                this.travelerEmail = model.travelerEmail;
                this.travelerId = model.travelerId;
                this.travelerJobNo = model.travelerJobNo;
                this.travelerMemberType = model.travelerMemberType;
                this.travelerMemberTypeName = model.travelerMemberTypeName;
                this.travelerName = model.travelerName;
                this.voucherType = model.voucherType;
                this.voucherTypeDesc = model.voucherTypeDesc;
            } 

            /**
             * alipay_id.
             */
            public Builder alipayId(String alipayId) {
                this.alipayId = alipayId;
                return this;
            }

            /**
             * alipay_trade_no.
             */
            public Builder alipayTradeNo(String alipayTradeNo) {
                this.alipayTradeNo = alipayTradeNo;
                return this;
            }

            /**
             * apply_arr_city_code.
             */
            public Builder applyArrCityCode(String applyArrCityCode) {
                this.applyArrCityCode = applyArrCityCode;
                return this;
            }

            /**
             * apply_arr_city_name.
             */
            public Builder applyArrCityName(String applyArrCityName) {
                this.applyArrCityName = applyArrCityName;
                return this;
            }

            /**
             * apply_dep_city_code.
             */
            public Builder applyDepCityCode(String applyDepCityCode) {
                this.applyDepCityCode = applyDepCityCode;
                return this;
            }

            /**
             * apply_dep_city_name.
             */
            public Builder applyDepCityName(String applyDepCityName) {
                this.applyDepCityName = applyDepCityName;
                return this;
            }

            /**
             * apply_extend_field.
             */
            public Builder applyExtendField(String applyExtendField) {
                this.applyExtendField = applyExtendField;
                return this;
            }

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * approver_email.
             */
            public Builder approverEmail(String approverEmail) {
                this.approverEmail = approverEmail;
                return this;
            }

            /**
             * approver_id.
             */
            public Builder approverId(String approverId) {
                this.approverId = approverId;
                return this;
            }

            /**
             * approver_name.
             */
            public Builder approverName(String approverName) {
                this.approverName = approverName;
                return this;
            }

            /**
             * award_num.
             */
            public Builder awardNum(Double awardNum) {
                this.awardNum = awardNum;
                return this;
            }

            /**
             * basis_amount.
             */
            public Builder basisAmount(String basisAmount) {
                this.basisAmount = basisAmount;
                return this;
            }

            /**
             * bill_record_time.
             */
            public Builder billRecordTime(String billRecordTime) {
                this.billRecordTime = billRecordTime;
                return this;
            }

            /**
             * billing_entity.
             */
            public Builder billingEntity(String billingEntity) {
                this.billingEntity = billingEntity;
                return this;
            }

            /**
             * book_mode.
             */
            public Builder bookMode(String bookMode) {
                this.bookMode = bookMode;
                return this;
            }

            /**
             * book_time.
             */
            public Builder bookTime(String bookTime) {
                this.bookTime = bookTime;
                return this;
            }

            /**
             * booker_id.
             */
            public Builder bookerId(String bookerId) {
                this.bookerId = bookerId;
                return this;
            }

            /**
             * booker_job_no.
             */
            public Builder bookerJobNo(String bookerJobNo) {
                this.bookerJobNo = bookerJobNo;
                return this;
            }

            /**
             * booker_name.
             */
            public Builder bookerName(String bookerName) {
                this.bookerName = bookerName;
                return this;
            }

            /**
             * capital_direction.
             */
            public Builder capitalDirection(String capitalDirection) {
                this.capitalDirection = capitalDirection;
                return this;
            }

            /**
             * cascade_department.
             */
            public Builder cascadeDepartment(String cascadeDepartment) {
                this.cascadeDepartment = cascadeDepartment;
                return this;
            }

            /**
             * category_desc.
             */
            public Builder categoryDesc(String categoryDesc) {
                this.categoryDesc = categoryDesc;
                return this;
            }

            /**
             * category_order_settle_price.
             */
            public Builder categoryOrderSettlePrice(String categoryOrderSettlePrice) {
                this.categoryOrderSettlePrice = categoryOrderSettlePrice;
                return this;
            }

            /**
             * cost_center.
             */
            public Builder costCenter(String costCenter) {
                this.costCenter = costCenter;
                return this;
            }

            /**
             * cost_center_number.
             */
            public Builder costCenterNumber(String costCenterNumber) {
                this.costCenterNumber = costCenterNumber;
                return this;
            }

            /**
             * deductible_tax.
             */
            public Builder deductibleTax(Double deductibleTax) {
                this.deductibleTax = deductibleTax;
                return this;
            }

            /**
             * department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * department_id.
             */
            public Builder departmentId(String departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * fee_type.
             */
            public Builder feeType(String feeType) {
                this.feeType = feeType;
                return this;
            }

            /**
             * fee_type_desc.
             */
            public Builder feeTypeDesc(String feeTypeDesc) {
                this.feeTypeDesc = feeTypeDesc;
                return this;
            }

            /**
             * foreigners_tag.
             */
            public Builder foreignersTag(String foreignersTag) {
                this.foreignersTag = foreignersTag;
                return this;
            }

            /**
             * grant_num.
             */
            public Builder grantNum(Double grantNum) {
                this.grantNum = grantNum;
                return this;
            }

            /**
             * index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * invoice_title.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * <p>Location</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * make_invoice.
             */
            public Builder makeInvoice(String makeInvoice) {
                this.makeInvoice = makeInvoice;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * order_status_desc.
             */
            public Builder orderStatusDesc(String orderStatusDesc) {
                this.orderStatusDesc = orderStatusDesc;
                return this;
            }

            /**
             * origin_category.
             */
            public Builder originCategory(String originCategory) {
                this.originCategory = originCategory;
                return this;
            }

            /**
             * origin_order_id.
             */
            public Builder originOrderId(String originOrderId) {
                this.originOrderId = originOrderId;
                return this;
            }

            /**
             * over_apply_id.
             */
            public Builder overApplyId(String overApplyId) {
                this.overApplyId = overApplyId;
                return this;
            }

            /**
             * payment_department_id.
             */
            public Builder paymentDepartmentId(String paymentDepartmentId) {
                this.paymentDepartmentId = paymentDepartmentId;
                return this;
            }

            /**
             * payment_department_name.
             */
            public Builder paymentDepartmentName(String paymentDepartmentName) {
                this.paymentDepartmentName = paymentDepartmentName;
                return this;
            }

            /**
             * primary_id.
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * project_code.
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * project_name.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * purchase_order_id.
             */
            public Builder purchaseOrderId(String purchaseOrderId) {
                this.purchaseOrderId = purchaseOrderId;
                return this;
            }

            /**
             * remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * save_amount.
             */
            public Builder saveAmount(Double saveAmount) {
                this.saveAmount = saveAmount;
                return this;
            }

            /**
             * scene_id.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * scene_name.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * settle_type_desc.
             */
            public Builder settleTypeDesc(String settleTypeDesc) {
                this.settleTypeDesc = settleTypeDesc;
                return this;
            }

            /**
             * settlement_fee.
             */
            public Builder settlementFee(Double settlementFee) {
                this.settlementFee = settlementFee;
                return this;
            }

            /**
             * settlement_grant_fee.
             */
            public Builder settlementGrantFee(Double settlementGrantFee) {
                this.settlementGrantFee = settlementGrantFee;
                return this;
            }

            /**
             * settlement_time.
             */
            public Builder settlementTime(String settlementTime) {
                this.settlementTime = settlementTime;
                return this;
            }

            /**
             * settlement_type.
             */
            public Builder settlementType(String settlementType) {
                this.settlementType = settlementType;
                return this;
            }

            /**
             * show_sub_order_id.
             */
            public Builder showSubOrderId(String showSubOrderId) {
                this.showSubOrderId = showSubOrderId;
                return this;
            }

            /**
             * <p>SIO</p>
             * 
             * <strong>example:</strong>
             * <p>SIO</p>
             */
            public Builder sio(String sio) {
                this.sio = sio;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * status_desc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * sub_order_id.
             */
            public Builder subOrderId(String subOrderId) {
                this.subOrderId = subOrderId;
                return this;
            }

            /**
             * tax_rate.
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * third_invoice_id.
             */
            public Builder thirdInvoiceId(String thirdInvoiceId) {
                this.thirdInvoiceId = thirdInvoiceId;
                return this;
            }

            /**
             * third_itinerary_id.
             */
            public Builder thirdItineraryId(String thirdItineraryId) {
                this.thirdItineraryId = thirdItineraryId;
                return this;
            }

            /**
             * trade_action_desc.
             */
            public Builder tradeActionDesc(String tradeActionDesc) {
                this.tradeActionDesc = tradeActionDesc;
                return this;
            }

            /**
             * trade_reason.
             */
            public Builder tradeReason(String tradeReason) {
                this.tradeReason = tradeReason;
                return this;
            }

            /**
             * traveler_email.
             */
            public Builder travelerEmail(String travelerEmail) {
                this.travelerEmail = travelerEmail;
                return this;
            }

            /**
             * traveler_id.
             */
            public Builder travelerId(String travelerId) {
                this.travelerId = travelerId;
                return this;
            }

            /**
             * traveler_job_no.
             */
            public Builder travelerJobNo(String travelerJobNo) {
                this.travelerJobNo = travelerJobNo;
                return this;
            }

            /**
             * traveler_member_type.
             */
            public Builder travelerMemberType(String travelerMemberType) {
                this.travelerMemberType = travelerMemberType;
                return this;
            }

            /**
             * traveler_member_type_name.
             */
            public Builder travelerMemberTypeName(String travelerMemberTypeName) {
                this.travelerMemberTypeName = travelerMemberTypeName;
                return this;
            }

            /**
             * traveler_name.
             */
            public Builder travelerName(String travelerName) {
                this.travelerName = travelerName;
                return this;
            }

            /**
             * voucher_type.
             */
            public Builder voucherType(Integer voucherType) {
                this.voucherType = voucherType;
                return this;
            }

            /**
             * voucher_type_desc.
             */
            public Builder voucherTypeDesc(String voucherTypeDesc) {
                this.voucherTypeDesc = voucherTypeDesc;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link FuPointBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FuPointBillSettlementQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("period_end")
        private String periodEnd;

        @com.aliyun.core.annotation.NameInMap("period_start")
        private String periodStart;

        @com.aliyun.core.annotation.NameInMap("scroll_id")
        private String scrollId;

        @com.aliyun.core.annotation.NameInMap("total_size")
        private Long totalSize;

        private Module(Builder builder) {
            this.category = builder.category;
            this.corpId = builder.corpId;
            this.items = builder.items;
            this.periodEnd = builder.periodEnd;
            this.periodStart = builder.periodStart;
            this.scrollId = builder.scrollId;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return periodEnd
         */
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        /**
         * @return periodStart
         */
        public String getPeriodStart() {
            return this.periodStart;
        }

        /**
         * @return scrollId
         */
        public String getScrollId() {
            return this.scrollId;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer category; 
            private String corpId; 
            private java.util.List<Items> items; 
            private String periodEnd; 
            private String periodStart; 
            private String scrollId; 
            private Long totalSize; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.category = model.category;
                this.corpId = model.corpId;
                this.items = model.items;
                this.periodEnd = model.periodEnd;
                this.periodStart = model.periodStart;
                this.scrollId = model.scrollId;
                this.totalSize = model.totalSize;
            } 

            /**
             * category.
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * period_end.
             */
            public Builder periodEnd(String periodEnd) {
                this.periodEnd = periodEnd;
                return this;
            }

            /**
             * period_start.
             */
            public Builder periodStart(String periodStart) {
                this.periodStart = periodStart;
                return this;
            }

            /**
             * scroll_id.
             */
            public Builder scrollId(String scrollId) {
                this.scrollId = scrollId;
                return this;
            }

            /**
             * total_size.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
