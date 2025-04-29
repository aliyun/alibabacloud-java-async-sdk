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
 * {@link HotelBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>HotelBillSettlementQueryResponseBody</p>
 */
public class HotelBillSettlementQueryResponseBody extends TeaModel {
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

    private HotelBillSettlementQueryResponseBody(Builder builder) {
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

    public static HotelBillSettlementQueryResponseBody create() {
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

        private Builder(HotelBillSettlementQueryResponseBody model) {
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
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public HotelBillSettlementQueryResponseBody build() {
            return new HotelBillSettlementQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotelBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelBillSettlementQueryResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agreement_promotion_fee")
        private Double agreementPromotionFee;

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

        @com.aliyun.core.annotation.NameInMap("average_nights")
        private String averageNights;

        @com.aliyun.core.annotation.NameInMap("bill_record_time")
        private String billRecordTime;

        @com.aliyun.core.annotation.NameInMap("billing_entity")
        private String billingEntity;

        @com.aliyun.core.annotation.NameInMap("book_channel")
        private String bookChannel;

        @com.aliyun.core.annotation.NameInMap("book_mode")
        private String bookMode;

        @com.aliyun.core.annotation.NameInMap("book_reason")
        private String bookReason;

        @com.aliyun.core.annotation.NameInMap("book_time")
        private String bookTime;

        @com.aliyun.core.annotation.NameInMap("booker_id")
        private String bookerId;

        @com.aliyun.core.annotation.NameInMap("booker_job_no")
        private String bookerJobNo;

        @com.aliyun.core.annotation.NameInMap("booker_name")
        private String bookerName;

        @com.aliyun.core.annotation.NameInMap("brand_group")
        private String brandGroup;

        @com.aliyun.core.annotation.NameInMap("brand_name")
        private String brandName;

        @com.aliyun.core.annotation.NameInMap("business_trip_result")
        private String businessTripResult;

        @com.aliyun.core.annotation.NameInMap("cancel_or_modify_reason")
        private String cancelOrModifyReason;

        @com.aliyun.core.annotation.NameInMap("cancel_or_modify_scene")
        private String cancelOrModifyScene;

        @com.aliyun.core.annotation.NameInMap("capital_direction")
        private String capitalDirection;

        @com.aliyun.core.annotation.NameInMap("cascade_department")
        private String cascadeDepartment;

        @com.aliyun.core.annotation.NameInMap("category_desc")
        private String categoryDesc;

        @com.aliyun.core.annotation.NameInMap("check_in_date")
        private String checkInDate;

        @com.aliyun.core.annotation.NameInMap("checkout_date")
        private String checkoutDate;

        @com.aliyun.core.annotation.NameInMap("city")
        private String city;

        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_county")
        private String cityCounty;

        @com.aliyun.core.annotation.NameInMap("city_county_code")
        private String cityCountyCode;

        @com.aliyun.core.annotation.NameInMap("corp_refund_fee")
        private Double corpRefundFee;

        @com.aliyun.core.annotation.NameInMap("corp_total_fee")
        private Double corpTotalFee;

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

        @com.aliyun.core.annotation.NameInMap("exceed_reason")
        private String exceedReason;

        @com.aliyun.core.annotation.NameInMap("fee_type")
        private String feeType;

        @com.aliyun.core.annotation.NameInMap("fee_type_desc")
        private String feeTypeDesc;

        @com.aliyun.core.annotation.NameInMap("fees")
        private Double fees;

        @com.aliyun.core.annotation.NameInMap("fines")
        private Double fines;

        @com.aliyun.core.annotation.NameInMap("fu_point_fee")
        private Double fuPointFee;

        @com.aliyun.core.annotation.NameInMap("hotel_name")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("ins_order_id")
        private String insOrderId;

        @com.aliyun.core.annotation.NameInMap("insurance_number")
        private String insuranceNumber;

        @com.aliyun.core.annotation.NameInMap("insurance_price")
        private Double insurancePrice;

        @com.aliyun.core.annotation.NameInMap("insurance_product_name")
        private String insuranceProductName;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("is_early_departure")
        private String isEarlyDeparture;

        @com.aliyun.core.annotation.NameInMap("is_negotiation")
        private String isNegotiation;

        @com.aliyun.core.annotation.NameInMap("is_share_str")
        private String isShareStr;

        @com.aliyun.core.annotation.NameInMap("nights")
        private Integer nights;

        @com.aliyun.core.annotation.NameInMap("no_advance_booking_reason")
        private String noAdvanceBookingReason;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("order_price")
        private Double orderPrice;

        @com.aliyun.core.annotation.NameInMap("order_type")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("original_reserve_rule")
        private String originalReserveRule;

        @com.aliyun.core.annotation.NameInMap("over_apply_id")
        private String overApplyId;

        @com.aliyun.core.annotation.NameInMap("payment_department_id")
        private String paymentDepartmentId;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

        @com.aliyun.core.annotation.NameInMap("person_refund_fee")
        private Double personRefundFee;

        @com.aliyun.core.annotation.NameInMap("person_settle_price")
        private Double personSettlePrice;

        @com.aliyun.core.annotation.NameInMap("primary_id")
        private Long primaryId;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_name")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("promotion_fee")
        private Double promotionFee;

        @com.aliyun.core.annotation.NameInMap("recover_money_receipt_amt")
        private Double recoverMoneyReceiptAmt;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("reserve_rule")
        private String reserveRule;

        @com.aliyun.core.annotation.NameInMap("room_no")
        private String roomNo;

        @com.aliyun.core.annotation.NameInMap("room_number")
        private Integer roomNumber;

        @com.aliyun.core.annotation.NameInMap("room_price")
        private Double roomPrice;

        @com.aliyun.core.annotation.NameInMap("room_type")
        private String roomType;

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

        @com.aliyun.core.annotation.NameInMap("star")
        private String star;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("status_desc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("tax_rate")
        private String taxRate;

        @com.aliyun.core.annotation.NameInMap("third_itinerary_id")
        private String thirdItineraryId;

        @com.aliyun.core.annotation.NameInMap("total_nights")
        private Integer totalNights;

        @com.aliyun.core.annotation.NameInMap("trade_action_desc")
        private String tradeActionDesc;

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

        @com.aliyun.core.annotation.NameInMap("unbooked_lowest_price_reason")
        private String unbookedLowestPriceReason;

        @com.aliyun.core.annotation.NameInMap("voucher_type")
        private Integer voucherType;

        @com.aliyun.core.annotation.NameInMap("voucher_type_desc")
        private String voucherTypeDesc;

        private DataList(Builder builder) {
            this.agreementPromotionFee = builder.agreementPromotionFee;
            this.alipayTradeNo = builder.alipayTradeNo;
            this.applyArrCityCode = builder.applyArrCityCode;
            this.applyArrCityName = builder.applyArrCityName;
            this.applyDepCityCode = builder.applyDepCityCode;
            this.applyDepCityName = builder.applyDepCityName;
            this.applyExtendField = builder.applyExtendField;
            this.applyId = builder.applyId;
            this.averageNights = builder.averageNights;
            this.billRecordTime = builder.billRecordTime;
            this.billingEntity = builder.billingEntity;
            this.bookChannel = builder.bookChannel;
            this.bookMode = builder.bookMode;
            this.bookReason = builder.bookReason;
            this.bookTime = builder.bookTime;
            this.bookerId = builder.bookerId;
            this.bookerJobNo = builder.bookerJobNo;
            this.bookerName = builder.bookerName;
            this.brandGroup = builder.brandGroup;
            this.brandName = builder.brandName;
            this.businessTripResult = builder.businessTripResult;
            this.cancelOrModifyReason = builder.cancelOrModifyReason;
            this.cancelOrModifyScene = builder.cancelOrModifyScene;
            this.capitalDirection = builder.capitalDirection;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.categoryDesc = builder.categoryDesc;
            this.checkInDate = builder.checkInDate;
            this.checkoutDate = builder.checkoutDate;
            this.city = builder.city;
            this.cityCode = builder.cityCode;
            this.cityCounty = builder.cityCounty;
            this.cityCountyCode = builder.cityCountyCode;
            this.corpRefundFee = builder.corpRefundFee;
            this.corpTotalFee = builder.corpTotalFee;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.deductibleTax = builder.deductibleTax;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.exceedReason = builder.exceedReason;
            this.feeType = builder.feeType;
            this.feeTypeDesc = builder.feeTypeDesc;
            this.fees = builder.fees;
            this.fines = builder.fines;
            this.fuPointFee = builder.fuPointFee;
            this.hotelName = builder.hotelName;
            this.index = builder.index;
            this.insOrderId = builder.insOrderId;
            this.insuranceNumber = builder.insuranceNumber;
            this.insurancePrice = builder.insurancePrice;
            this.insuranceProductName = builder.insuranceProductName;
            this.invoiceTitle = builder.invoiceTitle;
            this.isEarlyDeparture = builder.isEarlyDeparture;
            this.isNegotiation = builder.isNegotiation;
            this.isShareStr = builder.isShareStr;
            this.nights = builder.nights;
            this.noAdvanceBookingReason = builder.noAdvanceBookingReason;
            this.orderId = builder.orderId;
            this.orderPrice = builder.orderPrice;
            this.orderType = builder.orderType;
            this.originalReserveRule = builder.originalReserveRule;
            this.overApplyId = builder.overApplyId;
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.personRefundFee = builder.personRefundFee;
            this.personSettlePrice = builder.personSettlePrice;
            this.primaryId = builder.primaryId;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.promotionFee = builder.promotionFee;
            this.recoverMoneyReceiptAmt = builder.recoverMoneyReceiptAmt;
            this.remark = builder.remark;
            this.reserveRule = builder.reserveRule;
            this.roomNo = builder.roomNo;
            this.roomNumber = builder.roomNumber;
            this.roomPrice = builder.roomPrice;
            this.roomType = builder.roomType;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.serviceFee = builder.serviceFee;
            this.settleTypeDesc = builder.settleTypeDesc;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.star = builder.star;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.taxRate = builder.taxRate;
            this.thirdItineraryId = builder.thirdItineraryId;
            this.totalNights = builder.totalNights;
            this.tradeActionDesc = builder.tradeActionDesc;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerMemberType = builder.travelerMemberType;
            this.travelerMemberTypeName = builder.travelerMemberTypeName;
            this.travelerName = builder.travelerName;
            this.unbookedLowestPriceReason = builder.unbookedLowestPriceReason;
            this.voucherType = builder.voucherType;
            this.voucherTypeDesc = builder.voucherTypeDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return agreementPromotionFee
         */
        public Double getAgreementPromotionFee() {
            return this.agreementPromotionFee;
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
         * @return averageNights
         */
        public String getAverageNights() {
            return this.averageNights;
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
         * @return bookReason
         */
        public String getBookReason() {
            return this.bookReason;
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
         * @return brandGroup
         */
        public String getBrandGroup() {
            return this.brandGroup;
        }

        /**
         * @return brandName
         */
        public String getBrandName() {
            return this.brandName;
        }

        /**
         * @return businessTripResult
         */
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        /**
         * @return cancelOrModifyReason
         */
        public String getCancelOrModifyReason() {
            return this.cancelOrModifyReason;
        }

        /**
         * @return cancelOrModifyScene
         */
        public String getCancelOrModifyScene() {
            return this.cancelOrModifyScene;
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
         * @return checkInDate
         */
        public String getCheckInDate() {
            return this.checkInDate;
        }

        /**
         * @return checkoutDate
         */
        public String getCheckoutDate() {
            return this.checkoutDate;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityCounty
         */
        public String getCityCounty() {
            return this.cityCounty;
        }

        /**
         * @return cityCountyCode
         */
        public String getCityCountyCode() {
            return this.cityCountyCode;
        }

        /**
         * @return corpRefundFee
         */
        public Double getCorpRefundFee() {
            return this.corpRefundFee;
        }

        /**
         * @return corpTotalFee
         */
        public Double getCorpTotalFee() {
            return this.corpTotalFee;
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
         * @return exceedReason
         */
        public String getExceedReason() {
            return this.exceedReason;
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
         * @return fees
         */
        public Double getFees() {
            return this.fees;
        }

        /**
         * @return fines
         */
        public Double getFines() {
            return this.fines;
        }

        /**
         * @return fuPointFee
         */
        public Double getFuPointFee() {
            return this.fuPointFee;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return insOrderId
         */
        public String getInsOrderId() {
            return this.insOrderId;
        }

        /**
         * @return insuranceNumber
         */
        public String getInsuranceNumber() {
            return this.insuranceNumber;
        }

        /**
         * @return insurancePrice
         */
        public Double getInsurancePrice() {
            return this.insurancePrice;
        }

        /**
         * @return insuranceProductName
         */
        public String getInsuranceProductName() {
            return this.insuranceProductName;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return isEarlyDeparture
         */
        public String getIsEarlyDeparture() {
            return this.isEarlyDeparture;
        }

        /**
         * @return isNegotiation
         */
        public String getIsNegotiation() {
            return this.isNegotiation;
        }

        /**
         * @return isShareStr
         */
        public String getIsShareStr() {
            return this.isShareStr;
        }

        /**
         * @return nights
         */
        public Integer getNights() {
            return this.nights;
        }

        /**
         * @return noAdvanceBookingReason
         */
        public String getNoAdvanceBookingReason() {
            return this.noAdvanceBookingReason;
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
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return originalReserveRule
         */
        public String getOriginalReserveRule() {
            return this.originalReserveRule;
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
         * @return personRefundFee
         */
        public Double getPersonRefundFee() {
            return this.personRefundFee;
        }

        /**
         * @return personSettlePrice
         */
        public Double getPersonSettlePrice() {
            return this.personSettlePrice;
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
         * @return promotionFee
         */
        public Double getPromotionFee() {
            return this.promotionFee;
        }

        /**
         * @return recoverMoneyReceiptAmt
         */
        public Double getRecoverMoneyReceiptAmt() {
            return this.recoverMoneyReceiptAmt;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return reserveRule
         */
        public String getReserveRule() {
            return this.reserveRule;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return roomNumber
         */
        public Integer getRoomNumber() {
            return this.roomNumber;
        }

        /**
         * @return roomPrice
         */
        public Double getRoomPrice() {
            return this.roomPrice;
        }

        /**
         * @return roomType
         */
        public String getRoomType() {
            return this.roomType;
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
         * @return star
         */
        public String getStar() {
            return this.star;
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
         * @return taxRate
         */
        public String getTaxRate() {
            return this.taxRate;
        }

        /**
         * @return thirdItineraryId
         */
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        /**
         * @return totalNights
         */
        public Integer getTotalNights() {
            return this.totalNights;
        }

        /**
         * @return tradeActionDesc
         */
        public String getTradeActionDesc() {
            return this.tradeActionDesc;
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
         * @return unbookedLowestPriceReason
         */
        public String getUnbookedLowestPriceReason() {
            return this.unbookedLowestPriceReason;
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
            private Double agreementPromotionFee; 
            private String alipayTradeNo; 
            private String applyArrCityCode; 
            private String applyArrCityName; 
            private String applyDepCityCode; 
            private String applyDepCityName; 
            private String applyExtendField; 
            private String applyId; 
            private String averageNights; 
            private String billRecordTime; 
            private String billingEntity; 
            private String bookChannel; 
            private String bookMode; 
            private String bookReason; 
            private String bookTime; 
            private String bookerId; 
            private String bookerJobNo; 
            private String bookerName; 
            private String brandGroup; 
            private String brandName; 
            private String businessTripResult; 
            private String cancelOrModifyReason; 
            private String cancelOrModifyScene; 
            private String capitalDirection; 
            private String cascadeDepartment; 
            private String categoryDesc; 
            private String checkInDate; 
            private String checkoutDate; 
            private String city; 
            private String cityCode; 
            private String cityCounty; 
            private String cityCountyCode; 
            private Double corpRefundFee; 
            private Double corpTotalFee; 
            private String costCenter; 
            private String costCenterNumber; 
            private Double deductibleTax; 
            private String department; 
            private String departmentId; 
            private String exceedReason; 
            private String feeType; 
            private String feeTypeDesc; 
            private Double fees; 
            private Double fines; 
            private Double fuPointFee; 
            private String hotelName; 
            private String index; 
            private String insOrderId; 
            private String insuranceNumber; 
            private Double insurancePrice; 
            private String insuranceProductName; 
            private String invoiceTitle; 
            private String isEarlyDeparture; 
            private String isNegotiation; 
            private String isShareStr; 
            private Integer nights; 
            private String noAdvanceBookingReason; 
            private String orderId; 
            private Double orderPrice; 
            private String orderType; 
            private String originalReserveRule; 
            private String overApplyId; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private Double personRefundFee; 
            private Double personSettlePrice; 
            private Long primaryId; 
            private String projectCode; 
            private String projectName; 
            private Double promotionFee; 
            private Double recoverMoneyReceiptAmt; 
            private String remark; 
            private String reserveRule; 
            private String roomNo; 
            private Integer roomNumber; 
            private Double roomPrice; 
            private String roomType; 
            private String sceneId; 
            private String sceneName; 
            private Double serviceFee; 
            private String settleTypeDesc; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private String star; 
            private Integer status; 
            private String statusDesc; 
            private String taxRate; 
            private String thirdItineraryId; 
            private Integer totalNights; 
            private String tradeActionDesc; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerMemberType; 
            private String travelerMemberTypeName; 
            private String travelerName; 
            private String unbookedLowestPriceReason; 
            private Integer voucherType; 
            private String voucherTypeDesc; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.agreementPromotionFee = model.agreementPromotionFee;
                this.alipayTradeNo = model.alipayTradeNo;
                this.applyArrCityCode = model.applyArrCityCode;
                this.applyArrCityName = model.applyArrCityName;
                this.applyDepCityCode = model.applyDepCityCode;
                this.applyDepCityName = model.applyDepCityName;
                this.applyExtendField = model.applyExtendField;
                this.applyId = model.applyId;
                this.averageNights = model.averageNights;
                this.billRecordTime = model.billRecordTime;
                this.billingEntity = model.billingEntity;
                this.bookChannel = model.bookChannel;
                this.bookMode = model.bookMode;
                this.bookReason = model.bookReason;
                this.bookTime = model.bookTime;
                this.bookerId = model.bookerId;
                this.bookerJobNo = model.bookerJobNo;
                this.bookerName = model.bookerName;
                this.brandGroup = model.brandGroup;
                this.brandName = model.brandName;
                this.businessTripResult = model.businessTripResult;
                this.cancelOrModifyReason = model.cancelOrModifyReason;
                this.cancelOrModifyScene = model.cancelOrModifyScene;
                this.capitalDirection = model.capitalDirection;
                this.cascadeDepartment = model.cascadeDepartment;
                this.categoryDesc = model.categoryDesc;
                this.checkInDate = model.checkInDate;
                this.checkoutDate = model.checkoutDate;
                this.city = model.city;
                this.cityCode = model.cityCode;
                this.cityCounty = model.cityCounty;
                this.cityCountyCode = model.cityCountyCode;
                this.corpRefundFee = model.corpRefundFee;
                this.corpTotalFee = model.corpTotalFee;
                this.costCenter = model.costCenter;
                this.costCenterNumber = model.costCenterNumber;
                this.deductibleTax = model.deductibleTax;
                this.department = model.department;
                this.departmentId = model.departmentId;
                this.exceedReason = model.exceedReason;
                this.feeType = model.feeType;
                this.feeTypeDesc = model.feeTypeDesc;
                this.fees = model.fees;
                this.fines = model.fines;
                this.fuPointFee = model.fuPointFee;
                this.hotelName = model.hotelName;
                this.index = model.index;
                this.insOrderId = model.insOrderId;
                this.insuranceNumber = model.insuranceNumber;
                this.insurancePrice = model.insurancePrice;
                this.insuranceProductName = model.insuranceProductName;
                this.invoiceTitle = model.invoiceTitle;
                this.isEarlyDeparture = model.isEarlyDeparture;
                this.isNegotiation = model.isNegotiation;
                this.isShareStr = model.isShareStr;
                this.nights = model.nights;
                this.noAdvanceBookingReason = model.noAdvanceBookingReason;
                this.orderId = model.orderId;
                this.orderPrice = model.orderPrice;
                this.orderType = model.orderType;
                this.originalReserveRule = model.originalReserveRule;
                this.overApplyId = model.overApplyId;
                this.paymentDepartmentId = model.paymentDepartmentId;
                this.paymentDepartmentName = model.paymentDepartmentName;
                this.personRefundFee = model.personRefundFee;
                this.personSettlePrice = model.personSettlePrice;
                this.primaryId = model.primaryId;
                this.projectCode = model.projectCode;
                this.projectName = model.projectName;
                this.promotionFee = model.promotionFee;
                this.recoverMoneyReceiptAmt = model.recoverMoneyReceiptAmt;
                this.remark = model.remark;
                this.reserveRule = model.reserveRule;
                this.roomNo = model.roomNo;
                this.roomNumber = model.roomNumber;
                this.roomPrice = model.roomPrice;
                this.roomType = model.roomType;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.serviceFee = model.serviceFee;
                this.settleTypeDesc = model.settleTypeDesc;
                this.settlementFee = model.settlementFee;
                this.settlementGrantFee = model.settlementGrantFee;
                this.settlementTime = model.settlementTime;
                this.settlementType = model.settlementType;
                this.star = model.star;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.taxRate = model.taxRate;
                this.thirdItineraryId = model.thirdItineraryId;
                this.totalNights = model.totalNights;
                this.tradeActionDesc = model.tradeActionDesc;
                this.travelerId = model.travelerId;
                this.travelerJobNo = model.travelerJobNo;
                this.travelerMemberType = model.travelerMemberType;
                this.travelerMemberTypeName = model.travelerMemberTypeName;
                this.travelerName = model.travelerName;
                this.unbookedLowestPriceReason = model.unbookedLowestPriceReason;
                this.voucherType = model.voucherType;
                this.voucherTypeDesc = model.voucherTypeDesc;
            } 

            /**
             * agreement_promotion_fee.
             */
            public Builder agreementPromotionFee(Double agreementPromotionFee) {
                this.agreementPromotionFee = agreementPromotionFee;
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
             * <p>审批扩展自定义字段</p>
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
             * average_nights.
             */
            public Builder averageNights(String averageNights) {
                this.averageNights = averageNights;
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
             * book_reason.
             */
            public Builder bookReason(String bookReason) {
                this.bookReason = bookReason;
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
             * brand_group.
             */
            public Builder brandGroup(String brandGroup) {
                this.brandGroup = brandGroup;
                return this;
            }

            /**
             * brand_name.
             */
            public Builder brandName(String brandName) {
                this.brandName = brandName;
                return this;
            }

            /**
             * business_trip_result.
             */
            public Builder businessTripResult(String businessTripResult) {
                this.businessTripResult = businessTripResult;
                return this;
            }

            /**
             * cancel_or_modify_reason.
             */
            public Builder cancelOrModifyReason(String cancelOrModifyReason) {
                this.cancelOrModifyReason = cancelOrModifyReason;
                return this;
            }

            /**
             * cancel_or_modify_scene.
             */
            public Builder cancelOrModifyScene(String cancelOrModifyScene) {
                this.cancelOrModifyScene = cancelOrModifyScene;
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
             * check_in_date.
             */
            public Builder checkInDate(String checkInDate) {
                this.checkInDate = checkInDate;
                return this;
            }

            /**
             * checkout_date.
             */
            public Builder checkoutDate(String checkoutDate) {
                this.checkoutDate = checkoutDate;
                return this;
            }

            /**
             * city.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_county.
             */
            public Builder cityCounty(String cityCounty) {
                this.cityCounty = cityCounty;
                return this;
            }

            /**
             * city_county_code.
             */
            public Builder cityCountyCode(String cityCountyCode) {
                this.cityCountyCode = cityCountyCode;
                return this;
            }

            /**
             * corp_refund_fee.
             */
            public Builder corpRefundFee(Double corpRefundFee) {
                this.corpRefundFee = corpRefundFee;
                return this;
            }

            /**
             * corp_total_fee.
             */
            public Builder corpTotalFee(Double corpTotalFee) {
                this.corpTotalFee = corpTotalFee;
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
             * exceed_reason.
             */
            public Builder exceedReason(String exceedReason) {
                this.exceedReason = exceedReason;
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
             * fees.
             */
            public Builder fees(Double fees) {
                this.fees = fees;
                return this;
            }

            /**
             * fines.
             */
            public Builder fines(Double fines) {
                this.fines = fines;
                return this;
            }

            /**
             * fu_point_fee.
             */
            public Builder fuPointFee(Double fuPointFee) {
                this.fuPointFee = fuPointFee;
                return this;
            }

            /**
             * hotel_name.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
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
             * ins_order_id.
             */
            public Builder insOrderId(String insOrderId) {
                this.insOrderId = insOrderId;
                return this;
            }

            /**
             * insurance_number.
             */
            public Builder insuranceNumber(String insuranceNumber) {
                this.insuranceNumber = insuranceNumber;
                return this;
            }

            /**
             * insurance_price.
             */
            public Builder insurancePrice(Double insurancePrice) {
                this.insurancePrice = insurancePrice;
                return this;
            }

            /**
             * insurance_product_name.
             */
            public Builder insuranceProductName(String insuranceProductName) {
                this.insuranceProductName = insuranceProductName;
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
             * is_early_departure.
             */
            public Builder isEarlyDeparture(String isEarlyDeparture) {
                this.isEarlyDeparture = isEarlyDeparture;
                return this;
            }

            /**
             * is_negotiation.
             */
            public Builder isNegotiation(String isNegotiation) {
                this.isNegotiation = isNegotiation;
                return this;
            }

            /**
             * is_share_str.
             */
            public Builder isShareStr(String isShareStr) {
                this.isShareStr = isShareStr;
                return this;
            }

            /**
             * nights.
             */
            public Builder nights(Integer nights) {
                this.nights = nights;
                return this;
            }

            /**
             * no_advance_booking_reason.
             */
            public Builder noAdvanceBookingReason(String noAdvanceBookingReason) {
                this.noAdvanceBookingReason = noAdvanceBookingReason;
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
             * order_type.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * original_reserve_rule.
             */
            public Builder originalReserveRule(String originalReserveRule) {
                this.originalReserveRule = originalReserveRule;
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
             * person_refund_fee.
             */
            public Builder personRefundFee(Double personRefundFee) {
                this.personRefundFee = personRefundFee;
                return this;
            }

            /**
             * person_settle_price.
             */
            public Builder personSettlePrice(Double personSettlePrice) {
                this.personSettlePrice = personSettlePrice;
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
             * promotion_fee.
             */
            public Builder promotionFee(Double promotionFee) {
                this.promotionFee = promotionFee;
                return this;
            }

            /**
             * recover_money_receipt_amt.
             */
            public Builder recoverMoneyReceiptAmt(Double recoverMoneyReceiptAmt) {
                this.recoverMoneyReceiptAmt = recoverMoneyReceiptAmt;
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
             * reserve_rule.
             */
            public Builder reserveRule(String reserveRule) {
                this.reserveRule = reserveRule;
                return this;
            }

            /**
             * room_no.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * room_number.
             */
            public Builder roomNumber(Integer roomNumber) {
                this.roomNumber = roomNumber;
                return this;
            }

            /**
             * room_price.
             */
            public Builder roomPrice(Double roomPrice) {
                this.roomPrice = roomPrice;
                return this;
            }

            /**
             * room_type.
             */
            public Builder roomType(String roomType) {
                this.roomType = roomType;
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
             * star.
             */
            public Builder star(String star) {
                this.star = star;
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
             * <p>税率</p>
             * 
             * <strong>example:</strong>
             * <p>6%</p>
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
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
             * total_nights.
             */
            public Builder totalNights(Integer totalNights) {
                this.totalNights = totalNights;
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
             * unbooked_lowest_price_reason.
             */
            public Builder unbookedLowestPriceReason(String unbookedLowestPriceReason) {
                this.unbookedLowestPriceReason = unbookedLowestPriceReason;
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

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelBillSettlementQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("data_list")
        private java.util.List<DataList> dataList;

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
            this.dataList = builder.dataList;
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
         * @return dataList
         */
        public java.util.List<DataList> getDataList() {
            return this.dataList;
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
            private java.util.List<DataList> dataList; 
            private String periodEnd; 
            private String periodStart; 
            private String scrollId; 
            private Long totalNum; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.category = model.category;
                this.corpId = model.corpId;
                this.dataList = model.dataList;
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
             * data_list.
             */
            public Builder dataList(java.util.List<DataList> dataList) {
                this.dataList = dataList;
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
