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
 * {@link IeCarBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>IeCarBillSettlementQueryResponseBody</p>
 */
public class IeCarBillSettlementQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private IeCarBillSettlementQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IeCarBillSettlementQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(IeCarBillSettlementQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>3b5287ed17606676287351344d0095</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public IeCarBillSettlementQueryResponseBody build() {
            return new IeCarBillSettlementQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IeCarBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IeCarBillSettlementQueryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("account_month")
        private String accountMonth;

        @com.aliyun.core.annotation.NameInMap("adjust_time")
        private String adjustTime;

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

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_country")
        private String arrCountry;

        @com.aliyun.core.annotation.NameInMap("arr_date")
        private String arrDate;

        @com.aliyun.core.annotation.NameInMap("arr_date_local")
        private String arrDateLocal;

        @com.aliyun.core.annotation.NameInMap("arr_location")
        private String arrLocation;

        @com.aliyun.core.annotation.NameInMap("base_location")
        private String baseLocation;

        @com.aliyun.core.annotation.NameInMap("bill_record_time")
        private String billRecordTime;

        @com.aliyun.core.annotation.NameInMap("bill_record_time_str")
        private String billRecordTimeStr;

        @com.aliyun.core.annotation.NameInMap("billing_entity")
        private String billingEntity;

        @com.aliyun.core.annotation.NameInMap("book_channel")
        private String bookChannel;

        @com.aliyun.core.annotation.NameInMap("book_mode")
        private String bookMode;

        @com.aliyun.core.annotation.NameInMap("book_model")
        private String bookModel;

        @com.aliyun.core.annotation.NameInMap("book_time")
        private String bookTime;

        @com.aliyun.core.annotation.NameInMap("book_time_local")
        private String bookTimeLocal;

        @com.aliyun.core.annotation.NameInMap("booker_id")
        private String bookerId;

        @com.aliyun.core.annotation.NameInMap("booker_job_no")
        private String bookerJobNo;

        @com.aliyun.core.annotation.NameInMap("booker_name")
        private String bookerName;

        @com.aliyun.core.annotation.NameInMap("booker_use_id")
        private String bookerUseId;

        @com.aliyun.core.annotation.NameInMap("business_category")
        private String businessCategory;

        @com.aliyun.core.annotation.NameInMap("capital_direction")
        private String capitalDirection;

        @com.aliyun.core.annotation.NameInMap("car_level")
        private String carLevel;

        @com.aliyun.core.annotation.NameInMap("cascade_department")
        private String cascadeDepartment;

        @com.aliyun.core.annotation.NameInMap("category_desc")
        private String categoryDesc;

        @com.aliyun.core.annotation.NameInMap("cost_center")
        private String costCenter;

        @com.aliyun.core.annotation.NameInMap("cost_center_number")
        private String costCenterNumber;

        @com.aliyun.core.annotation.NameInMap("cost_department")
        private String costDepartment;

        @com.aliyun.core.annotation.NameInMap("coupon")
        private Double coupon;

        @com.aliyun.core.annotation.NameInMap("coupon_price")
        private Double couponPrice;

        @com.aliyun.core.annotation.NameInMap("custom_content")
        private String customContent;

        @com.aliyun.core.annotation.NameInMap("deductible_tax")
        private Double deductibleTax;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_country")
        private String depCountry;

        @com.aliyun.core.annotation.NameInMap("dep_date_local")
        private String depDateLocal;

        @com.aliyun.core.annotation.NameInMap("department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("department_id")
        private String departmentId;

        @com.aliyun.core.annotation.NameInMap("dept_city")
        private String deptCity;

        @com.aliyun.core.annotation.NameInMap("dept_date")
        private String deptDate;

        @com.aliyun.core.annotation.NameInMap("dept_location")
        private String deptLocation;

        @com.aliyun.core.annotation.NameInMap("driver_add_detail")
        private String driverAddDetail;

        @com.aliyun.core.annotation.NameInMap("driver_add_fee")
        private Double driverAddFee;

        @com.aliyun.core.annotation.NameInMap("estimate_drive_distance")
        private String estimateDriveDistance;

        @com.aliyun.core.annotation.NameInMap("estimate_price")
        private Double estimatePrice;

        @com.aliyun.core.annotation.NameInMap("fee_type")
        private String feeType;

        @com.aliyun.core.annotation.NameInMap("fee_type_desc")
        private String feeTypeDesc;

        @com.aliyun.core.annotation.NameInMap("financial_subject")
        private String financialSubject;

        @com.aliyun.core.annotation.NameInMap("foreigners_tag")
        private String foreignersTag;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("last_department")
        private String lastDepartment;

        @com.aliyun.core.annotation.NameInMap("level_name")
        private String levelName;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("main_apply_id")
        private String mainApplyId;

        @com.aliyun.core.annotation.NameInMap("mapping_company_code")
        private String mappingCompanyCode;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("order_price")
        private Double orderPrice;

        @com.aliyun.core.annotation.NameInMap("order_status_desc")
        private String orderStatusDesc;

        @com.aliyun.core.annotation.NameInMap("origin_apply_id")
        private String originApplyId;

        @com.aliyun.core.annotation.NameInMap("over_apply_id")
        private String overApplyId;

        @com.aliyun.core.annotation.NameInMap("payment_department_id")
        private String paymentDepartmentId;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

        @com.aliyun.core.annotation.NameInMap("person_settle_fee")
        private Double personSettleFee;

        @com.aliyun.core.annotation.NameInMap("position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("position_level")
        private String positionLevel;

        @com.aliyun.core.annotation.NameInMap("primary_id")
        private Long primaryId;

        @com.aliyun.core.annotation.NameInMap("processor_oa_code")
        private String processorOaCode;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_name")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("protocol_discount_fee")
        private Double protocolDiscountFee;

        @com.aliyun.core.annotation.NameInMap("provider_name")
        private String providerName;

        @com.aliyun.core.annotation.NameInMap("purchase_order_id")
        private String purchaseOrderId;

        @com.aliyun.core.annotation.NameInMap("real_drive_distance")
        private String realDriveDistance;

        @com.aliyun.core.annotation.NameInMap("real_from_addr")
        private String realFromAddr;

        @com.aliyun.core.annotation.NameInMap("real_to_addr")
        private String realToAddr;

        @com.aliyun.core.annotation.NameInMap("record_status")
        private String recordStatus;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("scene_id")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("scene_name")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("service_fee")
        private Double serviceFee;

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

        @com.aliyun.core.annotation.NameInMap("special_order")
        private String specialOrder;

        @com.aliyun.core.annotation.NameInMap("special_reason")
        private String specialReason;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("status_desc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("sub_order_id")
        private String subOrderId;

        @com.aliyun.core.annotation.NameInMap("supplement_apply_id")
        private String supplementApplyId;

        @com.aliyun.core.annotation.NameInMap("tax_rate")
        private String taxRate;

        @com.aliyun.core.annotation.NameInMap("third_invoice_id")
        private String thirdInvoiceId;

        @com.aliyun.core.annotation.NameInMap("third_itinerary_id")
        private String thirdItineraryId;

        @com.aliyun.core.annotation.NameInMap("third_part_business_id")
        private String thirdPartBusinessId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @com.aliyun.core.annotation.NameInMap("time_type")
        private String timeType;

        @com.aliyun.core.annotation.NameInMap("trade_action_desc")
        private String tradeActionDesc;

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

        @com.aliyun.core.annotation.NameInMap("traveler_use_id")
        private String travelerUseId;

        @com.aliyun.core.annotation.NameInMap("user_confirm_desc")
        private String userConfirmDesc;

        @com.aliyun.core.annotation.NameInMap("vehicle_scene_id")
        private String vehicleSceneId;

        @com.aliyun.core.annotation.NameInMap("vehicle_scene_name")
        private String vehicleSceneName;

        @com.aliyun.core.annotation.NameInMap("voucher_type")
        private Integer voucherType;

        @com.aliyun.core.annotation.NameInMap("voucher_type_desc")
        private String voucherTypeDesc;

        private Items(Builder builder) {
            this.accountMonth = builder.accountMonth;
            this.adjustTime = builder.adjustTime;
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
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrCountry = builder.arrCountry;
            this.arrDate = builder.arrDate;
            this.arrDateLocal = builder.arrDateLocal;
            this.arrLocation = builder.arrLocation;
            this.baseLocation = builder.baseLocation;
            this.billRecordTime = builder.billRecordTime;
            this.billRecordTimeStr = builder.billRecordTimeStr;
            this.billingEntity = builder.billingEntity;
            this.bookChannel = builder.bookChannel;
            this.bookMode = builder.bookMode;
            this.bookModel = builder.bookModel;
            this.bookTime = builder.bookTime;
            this.bookTimeLocal = builder.bookTimeLocal;
            this.bookerId = builder.bookerId;
            this.bookerJobNo = builder.bookerJobNo;
            this.bookerName = builder.bookerName;
            this.bookerUseId = builder.bookerUseId;
            this.businessCategory = builder.businessCategory;
            this.capitalDirection = builder.capitalDirection;
            this.carLevel = builder.carLevel;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.categoryDesc = builder.categoryDesc;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.costDepartment = builder.costDepartment;
            this.coupon = builder.coupon;
            this.couponPrice = builder.couponPrice;
            this.customContent = builder.customContent;
            this.deductibleTax = builder.deductibleTax;
            this.depCityCode = builder.depCityCode;
            this.depCountry = builder.depCountry;
            this.depDateLocal = builder.depDateLocal;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.deptCity = builder.deptCity;
            this.deptDate = builder.deptDate;
            this.deptLocation = builder.deptLocation;
            this.driverAddDetail = builder.driverAddDetail;
            this.driverAddFee = builder.driverAddFee;
            this.estimateDriveDistance = builder.estimateDriveDistance;
            this.estimatePrice = builder.estimatePrice;
            this.feeType = builder.feeType;
            this.feeTypeDesc = builder.feeTypeDesc;
            this.financialSubject = builder.financialSubject;
            this.foreignersTag = builder.foreignersTag;
            this.index = builder.index;
            this.invoiceTitle = builder.invoiceTitle;
            this.lastDepartment = builder.lastDepartment;
            this.levelName = builder.levelName;
            this.location = builder.location;
            this.mainApplyId = builder.mainApplyId;
            this.mappingCompanyCode = builder.mappingCompanyCode;
            this.memo = builder.memo;
            this.orderId = builder.orderId;
            this.orderPrice = builder.orderPrice;
            this.orderStatusDesc = builder.orderStatusDesc;
            this.originApplyId = builder.originApplyId;
            this.overApplyId = builder.overApplyId;
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.personSettleFee = builder.personSettleFee;
            this.position = builder.position;
            this.positionLevel = builder.positionLevel;
            this.primaryId = builder.primaryId;
            this.processorOaCode = builder.processorOaCode;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.protocolDiscountFee = builder.protocolDiscountFee;
            this.providerName = builder.providerName;
            this.purchaseOrderId = builder.purchaseOrderId;
            this.realDriveDistance = builder.realDriveDistance;
            this.realFromAddr = builder.realFromAddr;
            this.realToAddr = builder.realToAddr;
            this.recordStatus = builder.recordStatus;
            this.remark = builder.remark;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.serviceFee = builder.serviceFee;
            this.settleTypeDesc = builder.settleTypeDesc;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.showSubOrderId = builder.showSubOrderId;
            this.sio = builder.sio;
            this.specialOrder = builder.specialOrder;
            this.specialReason = builder.specialReason;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.subOrderId = builder.subOrderId;
            this.supplementApplyId = builder.supplementApplyId;
            this.taxRate = builder.taxRate;
            this.thirdInvoiceId = builder.thirdInvoiceId;
            this.thirdItineraryId = builder.thirdItineraryId;
            this.thirdPartBusinessId = builder.thirdPartBusinessId;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.timeType = builder.timeType;
            this.tradeActionDesc = builder.tradeActionDesc;
            this.travelerEmail = builder.travelerEmail;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerMemberType = builder.travelerMemberType;
            this.travelerMemberTypeName = builder.travelerMemberTypeName;
            this.travelerName = builder.travelerName;
            this.travelerUseId = builder.travelerUseId;
            this.userConfirmDesc = builder.userConfirmDesc;
            this.vehicleSceneId = builder.vehicleSceneId;
            this.vehicleSceneName = builder.vehicleSceneName;
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
         * @return accountMonth
         */
        public String getAccountMonth() {
            return this.accountMonth;
        }

        /**
         * @return adjustTime
         */
        public String getAdjustTime() {
            return this.adjustTime;
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
         * @return arrCity
         */
        public String getArrCity() {
            return this.arrCity;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrCountry
         */
        public String getArrCountry() {
            return this.arrCountry;
        }

        /**
         * @return arrDate
         */
        public String getArrDate() {
            return this.arrDate;
        }

        /**
         * @return arrDateLocal
         */
        public String getArrDateLocal() {
            return this.arrDateLocal;
        }

        /**
         * @return arrLocation
         */
        public String getArrLocation() {
            return this.arrLocation;
        }

        /**
         * @return baseLocation
         */
        public String getBaseLocation() {
            return this.baseLocation;
        }

        /**
         * @return billRecordTime
         */
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        /**
         * @return billRecordTimeStr
         */
        public String getBillRecordTimeStr() {
            return this.billRecordTimeStr;
        }

        /**
         * @return billingEntity
         */
        public String getBillingEntity() {
            return this.billingEntity;
        }

        /**
         * @return bookChannel
         */
        public String getBookChannel() {
            return this.bookChannel;
        }

        /**
         * @return bookMode
         */
        public String getBookMode() {
            return this.bookMode;
        }

        /**
         * @return bookModel
         */
        public String getBookModel() {
            return this.bookModel;
        }

        /**
         * @return bookTime
         */
        public String getBookTime() {
            return this.bookTime;
        }

        /**
         * @return bookTimeLocal
         */
        public String getBookTimeLocal() {
            return this.bookTimeLocal;
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
         * @return bookerUseId
         */
        public String getBookerUseId() {
            return this.bookerUseId;
        }

        /**
         * @return businessCategory
         */
        public String getBusinessCategory() {
            return this.businessCategory;
        }

        /**
         * @return capitalDirection
         */
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        /**
         * @return carLevel
         */
        public String getCarLevel() {
            return this.carLevel;
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
         * @return costDepartment
         */
        public String getCostDepartment() {
            return this.costDepartment;
        }

        /**
         * @return coupon
         */
        public Double getCoupon() {
            return this.coupon;
        }

        /**
         * @return couponPrice
         */
        public Double getCouponPrice() {
            return this.couponPrice;
        }

        /**
         * @return customContent
         */
        public String getCustomContent() {
            return this.customContent;
        }

        /**
         * @return deductibleTax
         */
        public Double getDeductibleTax() {
            return this.deductibleTax;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depCountry
         */
        public String getDepCountry() {
            return this.depCountry;
        }

        /**
         * @return depDateLocal
         */
        public String getDepDateLocal() {
            return this.depDateLocal;
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
         * @return deptCity
         */
        public String getDeptCity() {
            return this.deptCity;
        }

        /**
         * @return deptDate
         */
        public String getDeptDate() {
            return this.deptDate;
        }

        /**
         * @return deptLocation
         */
        public String getDeptLocation() {
            return this.deptLocation;
        }

        /**
         * @return driverAddDetail
         */
        public String getDriverAddDetail() {
            return this.driverAddDetail;
        }

        /**
         * @return driverAddFee
         */
        public Double getDriverAddFee() {
            return this.driverAddFee;
        }

        /**
         * @return estimateDriveDistance
         */
        public String getEstimateDriveDistance() {
            return this.estimateDriveDistance;
        }

        /**
         * @return estimatePrice
         */
        public Double getEstimatePrice() {
            return this.estimatePrice;
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
         * @return financialSubject
         */
        public String getFinancialSubject() {
            return this.financialSubject;
        }

        /**
         * @return foreignersTag
         */
        public String getForeignersTag() {
            return this.foreignersTag;
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
         * @return lastDepartment
         */
        public String getLastDepartment() {
            return this.lastDepartment;
        }

        /**
         * @return levelName
         */
        public String getLevelName() {
            return this.levelName;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return mainApplyId
         */
        public String getMainApplyId() {
            return this.mainApplyId;
        }

        /**
         * @return mappingCompanyCode
         */
        public String getMappingCompanyCode() {
            return this.mappingCompanyCode;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderPrice
         */
        public Double getOrderPrice() {
            return this.orderPrice;
        }

        /**
         * @return orderStatusDesc
         */
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        /**
         * @return originApplyId
         */
        public String getOriginApplyId() {
            return this.originApplyId;
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
         * @return personSettleFee
         */
        public Double getPersonSettleFee() {
            return this.personSettleFee;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return positionLevel
         */
        public String getPositionLevel() {
            return this.positionLevel;
        }

        /**
         * @return primaryId
         */
        public Long getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return processorOaCode
         */
        public String getProcessorOaCode() {
            return this.processorOaCode;
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
         * @return protocolDiscountFee
         */
        public Double getProtocolDiscountFee() {
            return this.protocolDiscountFee;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        /**
         * @return purchaseOrderId
         */
        public String getPurchaseOrderId() {
            return this.purchaseOrderId;
        }

        /**
         * @return realDriveDistance
         */
        public String getRealDriveDistance() {
            return this.realDriveDistance;
        }

        /**
         * @return realFromAddr
         */
        public String getRealFromAddr() {
            return this.realFromAddr;
        }

        /**
         * @return realToAddr
         */
        public String getRealToAddr() {
            return this.realToAddr;
        }

        /**
         * @return recordStatus
         */
        public String getRecordStatus() {
            return this.recordStatus;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
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
         * @return serviceFee
         */
        public Double getServiceFee() {
            return this.serviceFee;
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
         * @return specialOrder
         */
        public String getSpecialOrder() {
            return this.specialOrder;
        }

        /**
         * @return specialReason
         */
        public String getSpecialReason() {
            return this.specialReason;
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
         * @return supplementApplyId
         */
        public String getSupplementApplyId() {
            return this.supplementApplyId;
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
         * @return thirdPartBusinessId
         */
        public String getThirdPartBusinessId() {
            return this.thirdPartBusinessId;
        }

        /**
         * @return thirdpartApplyId
         */
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return tradeActionDesc
         */
        public String getTradeActionDesc() {
            return this.tradeActionDesc;
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
         * @return travelerUseId
         */
        public String getTravelerUseId() {
            return this.travelerUseId;
        }

        /**
         * @return userConfirmDesc
         */
        public String getUserConfirmDesc() {
            return this.userConfirmDesc;
        }

        /**
         * @return vehicleSceneId
         */
        public String getVehicleSceneId() {
            return this.vehicleSceneId;
        }

        /**
         * @return vehicleSceneName
         */
        public String getVehicleSceneName() {
            return this.vehicleSceneName;
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
            private String accountMonth; 
            private String adjustTime; 
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
            private String arrCity; 
            private String arrCityCode; 
            private String arrCountry; 
            private String arrDate; 
            private String arrDateLocal; 
            private String arrLocation; 
            private String baseLocation; 
            private String billRecordTime; 
            private String billRecordTimeStr; 
            private String billingEntity; 
            private String bookChannel; 
            private String bookMode; 
            private String bookModel; 
            private String bookTime; 
            private String bookTimeLocal; 
            private String bookerId; 
            private String bookerJobNo; 
            private String bookerName; 
            private String bookerUseId; 
            private String businessCategory; 
            private String capitalDirection; 
            private String carLevel; 
            private String cascadeDepartment; 
            private String categoryDesc; 
            private String costCenter; 
            private String costCenterNumber; 
            private String costDepartment; 
            private Double coupon; 
            private Double couponPrice; 
            private String customContent; 
            private Double deductibleTax; 
            private String depCityCode; 
            private String depCountry; 
            private String depDateLocal; 
            private String department; 
            private String departmentId; 
            private String deptCity; 
            private String deptDate; 
            private String deptLocation; 
            private String driverAddDetail; 
            private Double driverAddFee; 
            private String estimateDriveDistance; 
            private Double estimatePrice; 
            private String feeType; 
            private String feeTypeDesc; 
            private String financialSubject; 
            private String foreignersTag; 
            private String index; 
            private String invoiceTitle; 
            private String lastDepartment; 
            private String levelName; 
            private String location; 
            private String mainApplyId; 
            private String mappingCompanyCode; 
            private String memo; 
            private String orderId; 
            private Double orderPrice; 
            private String orderStatusDesc; 
            private String originApplyId; 
            private String overApplyId; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private Double personSettleFee; 
            private String position; 
            private String positionLevel; 
            private Long primaryId; 
            private String processorOaCode; 
            private String projectCode; 
            private String projectName; 
            private Double protocolDiscountFee; 
            private String providerName; 
            private String purchaseOrderId; 
            private String realDriveDistance; 
            private String realFromAddr; 
            private String realToAddr; 
            private String recordStatus; 
            private String remark; 
            private String sceneId; 
            private String sceneName; 
            private Double serviceFee; 
            private String settleTypeDesc; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private String showSubOrderId; 
            private String sio; 
            private String specialOrder; 
            private String specialReason; 
            private Integer status; 
            private String statusDesc; 
            private String subOrderId; 
            private String supplementApplyId; 
            private String taxRate; 
            private String thirdInvoiceId; 
            private String thirdItineraryId; 
            private String thirdPartBusinessId; 
            private String thirdpartApplyId; 
            private String timeType; 
            private String tradeActionDesc; 
            private String travelerEmail; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerMemberType; 
            private String travelerMemberTypeName; 
            private String travelerName; 
            private String travelerUseId; 
            private String userConfirmDesc; 
            private String vehicleSceneId; 
            private String vehicleSceneName; 
            private Integer voucherType; 
            private String voucherTypeDesc; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.accountMonth = model.accountMonth;
                this.adjustTime = model.adjustTime;
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
                this.arrCity = model.arrCity;
                this.arrCityCode = model.arrCityCode;
                this.arrCountry = model.arrCountry;
                this.arrDate = model.arrDate;
                this.arrDateLocal = model.arrDateLocal;
                this.arrLocation = model.arrLocation;
                this.baseLocation = model.baseLocation;
                this.billRecordTime = model.billRecordTime;
                this.billRecordTimeStr = model.billRecordTimeStr;
                this.billingEntity = model.billingEntity;
                this.bookChannel = model.bookChannel;
                this.bookMode = model.bookMode;
                this.bookModel = model.bookModel;
                this.bookTime = model.bookTime;
                this.bookTimeLocal = model.bookTimeLocal;
                this.bookerId = model.bookerId;
                this.bookerJobNo = model.bookerJobNo;
                this.bookerName = model.bookerName;
                this.bookerUseId = model.bookerUseId;
                this.businessCategory = model.businessCategory;
                this.capitalDirection = model.capitalDirection;
                this.carLevel = model.carLevel;
                this.cascadeDepartment = model.cascadeDepartment;
                this.categoryDesc = model.categoryDesc;
                this.costCenter = model.costCenter;
                this.costCenterNumber = model.costCenterNumber;
                this.costDepartment = model.costDepartment;
                this.coupon = model.coupon;
                this.couponPrice = model.couponPrice;
                this.customContent = model.customContent;
                this.deductibleTax = model.deductibleTax;
                this.depCityCode = model.depCityCode;
                this.depCountry = model.depCountry;
                this.depDateLocal = model.depDateLocal;
                this.department = model.department;
                this.departmentId = model.departmentId;
                this.deptCity = model.deptCity;
                this.deptDate = model.deptDate;
                this.deptLocation = model.deptLocation;
                this.driverAddDetail = model.driverAddDetail;
                this.driverAddFee = model.driverAddFee;
                this.estimateDriveDistance = model.estimateDriveDistance;
                this.estimatePrice = model.estimatePrice;
                this.feeType = model.feeType;
                this.feeTypeDesc = model.feeTypeDesc;
                this.financialSubject = model.financialSubject;
                this.foreignersTag = model.foreignersTag;
                this.index = model.index;
                this.invoiceTitle = model.invoiceTitle;
                this.lastDepartment = model.lastDepartment;
                this.levelName = model.levelName;
                this.location = model.location;
                this.mainApplyId = model.mainApplyId;
                this.mappingCompanyCode = model.mappingCompanyCode;
                this.memo = model.memo;
                this.orderId = model.orderId;
                this.orderPrice = model.orderPrice;
                this.orderStatusDesc = model.orderStatusDesc;
                this.originApplyId = model.originApplyId;
                this.overApplyId = model.overApplyId;
                this.paymentDepartmentId = model.paymentDepartmentId;
                this.paymentDepartmentName = model.paymentDepartmentName;
                this.personSettleFee = model.personSettleFee;
                this.position = model.position;
                this.positionLevel = model.positionLevel;
                this.primaryId = model.primaryId;
                this.processorOaCode = model.processorOaCode;
                this.projectCode = model.projectCode;
                this.projectName = model.projectName;
                this.protocolDiscountFee = model.protocolDiscountFee;
                this.providerName = model.providerName;
                this.purchaseOrderId = model.purchaseOrderId;
                this.realDriveDistance = model.realDriveDistance;
                this.realFromAddr = model.realFromAddr;
                this.realToAddr = model.realToAddr;
                this.recordStatus = model.recordStatus;
                this.remark = model.remark;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.serviceFee = model.serviceFee;
                this.settleTypeDesc = model.settleTypeDesc;
                this.settlementFee = model.settlementFee;
                this.settlementGrantFee = model.settlementGrantFee;
                this.settlementTime = model.settlementTime;
                this.settlementType = model.settlementType;
                this.showSubOrderId = model.showSubOrderId;
                this.sio = model.sio;
                this.specialOrder = model.specialOrder;
                this.specialReason = model.specialReason;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.subOrderId = model.subOrderId;
                this.supplementApplyId = model.supplementApplyId;
                this.taxRate = model.taxRate;
                this.thirdInvoiceId = model.thirdInvoiceId;
                this.thirdItineraryId = model.thirdItineraryId;
                this.thirdPartBusinessId = model.thirdPartBusinessId;
                this.thirdpartApplyId = model.thirdpartApplyId;
                this.timeType = model.timeType;
                this.tradeActionDesc = model.tradeActionDesc;
                this.travelerEmail = model.travelerEmail;
                this.travelerId = model.travelerId;
                this.travelerJobNo = model.travelerJobNo;
                this.travelerMemberType = model.travelerMemberType;
                this.travelerMemberTypeName = model.travelerMemberTypeName;
                this.travelerName = model.travelerName;
                this.travelerUseId = model.travelerUseId;
                this.userConfirmDesc = model.userConfirmDesc;
                this.vehicleSceneId = model.vehicleSceneId;
                this.vehicleSceneName = model.vehicleSceneName;
                this.voucherType = model.voucherType;
                this.voucherTypeDesc = model.voucherTypeDesc;
            } 

            /**
             * account_month.
             */
            public Builder accountMonth(String accountMonth) {
                this.accountMonth = accountMonth;
                return this;
            }

            /**
             * adjust_time.
             */
            public Builder adjustTime(String adjustTime) {
                this.adjustTime = adjustTime;
                return this;
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
             * arr_city.
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
                return this;
            }

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * arr_country.
             */
            public Builder arrCountry(String arrCountry) {
                this.arrCountry = arrCountry;
                return this;
            }

            /**
             * arr_date.
             */
            public Builder arrDate(String arrDate) {
                this.arrDate = arrDate;
                return this;
            }

            /**
             * arr_date_local.
             */
            public Builder arrDateLocal(String arrDateLocal) {
                this.arrDateLocal = arrDateLocal;
                return this;
            }

            /**
             * arr_location.
             */
            public Builder arrLocation(String arrLocation) {
                this.arrLocation = arrLocation;
                return this;
            }

            /**
             * base_location.
             */
            public Builder baseLocation(String baseLocation) {
                this.baseLocation = baseLocation;
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
             * bill_record_time_str.
             */
            public Builder billRecordTimeStr(String billRecordTimeStr) {
                this.billRecordTimeStr = billRecordTimeStr;
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
             * book_channel.
             */
            public Builder bookChannel(String bookChannel) {
                this.bookChannel = bookChannel;
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
             * book_model.
             */
            public Builder bookModel(String bookModel) {
                this.bookModel = bookModel;
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
             * book_time_local.
             */
            public Builder bookTimeLocal(String bookTimeLocal) {
                this.bookTimeLocal = bookTimeLocal;
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
             * booker_use_id.
             */
            public Builder bookerUseId(String bookerUseId) {
                this.bookerUseId = bookerUseId;
                return this;
            }

            /**
             * business_category.
             */
            public Builder businessCategory(String businessCategory) {
                this.businessCategory = businessCategory;
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
             * car_level.
             */
            public Builder carLevel(String carLevel) {
                this.carLevel = carLevel;
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
             * cost_department.
             */
            public Builder costDepartment(String costDepartment) {
                this.costDepartment = costDepartment;
                return this;
            }

            /**
             * coupon.
             */
            public Builder coupon(Double coupon) {
                this.coupon = coupon;
                return this;
            }

            /**
             * coupon_price.
             */
            public Builder couponPrice(Double couponPrice) {
                this.couponPrice = couponPrice;
                return this;
            }

            /**
             * custom_content.
             */
            public Builder customContent(String customContent) {
                this.customContent = customContent;
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
             * dep_city_code.
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * dep_country.
             */
            public Builder depCountry(String depCountry) {
                this.depCountry = depCountry;
                return this;
            }

            /**
             * dep_date_local.
             */
            public Builder depDateLocal(String depDateLocal) {
                this.depDateLocal = depDateLocal;
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
             * dept_city.
             */
            public Builder deptCity(String deptCity) {
                this.deptCity = deptCity;
                return this;
            }

            /**
             * dept_date.
             */
            public Builder deptDate(String deptDate) {
                this.deptDate = deptDate;
                return this;
            }

            /**
             * dept_location.
             */
            public Builder deptLocation(String deptLocation) {
                this.deptLocation = deptLocation;
                return this;
            }

            /**
             * driver_add_detail.
             */
            public Builder driverAddDetail(String driverAddDetail) {
                this.driverAddDetail = driverAddDetail;
                return this;
            }

            /**
             * driver_add_fee.
             */
            public Builder driverAddFee(Double driverAddFee) {
                this.driverAddFee = driverAddFee;
                return this;
            }

            /**
             * estimate_drive_distance.
             */
            public Builder estimateDriveDistance(String estimateDriveDistance) {
                this.estimateDriveDistance = estimateDriveDistance;
                return this;
            }

            /**
             * estimate_price.
             */
            public Builder estimatePrice(Double estimatePrice) {
                this.estimatePrice = estimatePrice;
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
             * financial_subject.
             */
            public Builder financialSubject(String financialSubject) {
                this.financialSubject = financialSubject;
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
             * last_department.
             */
            public Builder lastDepartment(String lastDepartment) {
                this.lastDepartment = lastDepartment;
                return this;
            }

            /**
             * level_name.
             */
            public Builder levelName(String levelName) {
                this.levelName = levelName;
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
             * main_apply_id.
             */
            public Builder mainApplyId(String mainApplyId) {
                this.mainApplyId = mainApplyId;
                return this;
            }

            /**
             * mapping_company_code.
             */
            public Builder mappingCompanyCode(String mappingCompanyCode) {
                this.mappingCompanyCode = mappingCompanyCode;
                return this;
            }

            /**
             * memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
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
             * order_price.
             */
            public Builder orderPrice(Double orderPrice) {
                this.orderPrice = orderPrice;
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
             * origin_apply_id.
             */
            public Builder originApplyId(String originApplyId) {
                this.originApplyId = originApplyId;
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
             * person_settle_fee.
             */
            public Builder personSettleFee(Double personSettleFee) {
                this.personSettleFee = personSettleFee;
                return this;
            }

            /**
             * position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * position_level.
             */
            public Builder positionLevel(String positionLevel) {
                this.positionLevel = positionLevel;
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
             * processor_oa_code.
             */
            public Builder processorOaCode(String processorOaCode) {
                this.processorOaCode = processorOaCode;
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
             * protocol_discount_fee.
             */
            public Builder protocolDiscountFee(Double protocolDiscountFee) {
                this.protocolDiscountFee = protocolDiscountFee;
                return this;
            }

            /**
             * provider_name.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
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
             * real_drive_distance.
             */
            public Builder realDriveDistance(String realDriveDistance) {
                this.realDriveDistance = realDriveDistance;
                return this;
            }

            /**
             * real_from_addr.
             */
            public Builder realFromAddr(String realFromAddr) {
                this.realFromAddr = realFromAddr;
                return this;
            }

            /**
             * real_to_addr.
             */
            public Builder realToAddr(String realToAddr) {
                this.realToAddr = realToAddr;
                return this;
            }

            /**
             * record_status.
             */
            public Builder recordStatus(String recordStatus) {
                this.recordStatus = recordStatus;
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
             * service_fee.
             */
            public Builder serviceFee(Double serviceFee) {
                this.serviceFee = serviceFee;
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
             * special_order.
             */
            public Builder specialOrder(String specialOrder) {
                this.specialOrder = specialOrder;
                return this;
            }

            /**
             * special_reason.
             */
            public Builder specialReason(String specialReason) {
                this.specialReason = specialReason;
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
             * supplement_apply_id.
             */
            public Builder supplementApplyId(String supplementApplyId) {
                this.supplementApplyId = supplementApplyId;
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
             * third_part_business_id.
             */
            public Builder thirdPartBusinessId(String thirdPartBusinessId) {
                this.thirdPartBusinessId = thirdPartBusinessId;
                return this;
            }

            /**
             * thirdpart_apply_id.
             */
            public Builder thirdpartApplyId(String thirdpartApplyId) {
                this.thirdpartApplyId = thirdpartApplyId;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
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
             * traveler_use_id.
             */
            public Builder travelerUseId(String travelerUseId) {
                this.travelerUseId = travelerUseId;
                return this;
            }

            /**
             * user_confirm_desc.
             */
            public Builder userConfirmDesc(String userConfirmDesc) {
                this.userConfirmDesc = userConfirmDesc;
                return this;
            }

            /**
             * vehicle_scene_id.
             */
            public Builder vehicleSceneId(String vehicleSceneId) {
                this.vehicleSceneId = vehicleSceneId;
                return this;
            }

            /**
             * vehicle_scene_name.
             */
            public Builder vehicleSceneName(String vehicleSceneName) {
                this.vehicleSceneName = vehicleSceneName;
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
     * {@link IeCarBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IeCarBillSettlementQueryResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("total_num")
        private Long totalNum;

        private Module(Builder builder) {
            this.category = builder.category;
            this.corpId = builder.corpId;
            this.items = builder.items;
            this.periodEnd = builder.periodEnd;
            this.periodStart = builder.periodStart;
            this.scrollId = builder.scrollId;
            this.totalNum = builder.totalNum;
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
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private Integer category; 
            private String corpId; 
            private java.util.List<Items> items; 
            private String periodEnd; 
            private String periodStart; 
            private String scrollId; 
            private Long totalNum; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.category = model.category;
                this.corpId = model.corpId;
                this.items = model.items;
                this.periodEnd = model.periodEnd;
                this.periodStart = model.periodStart;
                this.scrollId = model.scrollId;
                this.totalNum = model.totalNum;
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
             * total_num.
             */
            public Builder totalNum(Long totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
