// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CooperatorHotelBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CooperatorHotelBillSettlementQueryResponseBody</p>
 */
public class CooperatorHotelBillSettlementQueryResponseBody extends TeaModel {
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

    private CooperatorHotelBillSettlementQueryResponseBody(Builder builder) {
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

    public static CooperatorHotelBillSettlementQueryResponseBody create() {
        return builder().build();
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
         * requestId
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
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CooperatorHotelBillSettlementQueryResponseBody build() {
            return new CooperatorHotelBillSettlementQueryResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
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
        private Double averageNights;

        @com.aliyun.core.annotation.NameInMap("bill_record_time")
        private String billRecordTime;

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

        @com.aliyun.core.annotation.NameInMap("capital_direction")
        private String capitalDirection;

        @com.aliyun.core.annotation.NameInMap("cascade_department")
        private String cascadeDepartment;

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
        private Integer cityCountyCode;

        @com.aliyun.core.annotation.NameInMap("cooperator_bill_code")
        private String cooperatorBillCode;

        @com.aliyun.core.annotation.NameInMap("cooperator_name")
        private String cooperatorName;

        @com.aliyun.core.annotation.NameInMap("cooperator_order_id")
        private String cooperatorOrderId;

        @com.aliyun.core.annotation.NameInMap("corp_refund_fee")
        private Double corpRefundFee;

        @com.aliyun.core.annotation.NameInMap("corp_total_fee")
        private Double corpTotalFee;

        @com.aliyun.core.annotation.NameInMap("cost_center")
        private String costCenter;

        @com.aliyun.core.annotation.NameInMap("cost_center_number")
        private String costCenterNumber;

        @com.aliyun.core.annotation.NameInMap("department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("department_id")
        private String departmentId;

        @com.aliyun.core.annotation.NameInMap("exceed_reason")
        private String exceedReason;

        @com.aliyun.core.annotation.NameInMap("fee_type")
        private String feeType;

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

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("order_price")
        private Double orderPrice;

        @com.aliyun.core.annotation.NameInMap("order_status_desc")
        private String orderStatusDesc;

        @com.aliyun.core.annotation.NameInMap("order_type")
        private String orderType;

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

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("reserve_rule")
        private Integer reserveRule;

        @com.aliyun.core.annotation.NameInMap("room_no")
        private String roomNo;

        @com.aliyun.core.annotation.NameInMap("room_number")
        private Integer roomNumber;

        @com.aliyun.core.annotation.NameInMap("room_price")
        private Double roomPrice;

        @com.aliyun.core.annotation.NameInMap("room_type")
        private String roomType;

        @com.aliyun.core.annotation.NameInMap("service_fee")
        private Double serviceFee;

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

        @com.aliyun.core.annotation.NameInMap("sub_order_id")
        private String subOrderId;

        @com.aliyun.core.annotation.NameInMap("tax_rate")
        private String taxRate;

        @com.aliyun.core.annotation.NameInMap("third_invoice_id")
        private String thirdInvoiceId;

        @com.aliyun.core.annotation.NameInMap("third_itinerary_id")
        private String thirdItineraryId;

        @com.aliyun.core.annotation.NameInMap("total_nights")
        private Integer totalNights;

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

        private Items(Builder builder) {
            this.alipayTradeNo = builder.alipayTradeNo;
            this.applyArrCityCode = builder.applyArrCityCode;
            this.applyArrCityName = builder.applyArrCityName;
            this.applyDepCityCode = builder.applyDepCityCode;
            this.applyDepCityName = builder.applyDepCityName;
            this.applyExtendField = builder.applyExtendField;
            this.applyId = builder.applyId;
            this.averageNights = builder.averageNights;
            this.billRecordTime = builder.billRecordTime;
            this.bookMode = builder.bookMode;
            this.bookReason = builder.bookReason;
            this.bookTime = builder.bookTime;
            this.bookerId = builder.bookerId;
            this.bookerJobNo = builder.bookerJobNo;
            this.bookerName = builder.bookerName;
            this.brandGroup = builder.brandGroup;
            this.brandName = builder.brandName;
            this.businessTripResult = builder.businessTripResult;
            this.capitalDirection = builder.capitalDirection;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.checkInDate = builder.checkInDate;
            this.checkoutDate = builder.checkoutDate;
            this.city = builder.city;
            this.cityCode = builder.cityCode;
            this.cityCounty = builder.cityCounty;
            this.cityCountyCode = builder.cityCountyCode;
            this.cooperatorBillCode = builder.cooperatorBillCode;
            this.cooperatorName = builder.cooperatorName;
            this.cooperatorOrderId = builder.cooperatorOrderId;
            this.corpRefundFee = builder.corpRefundFee;
            this.corpTotalFee = builder.corpTotalFee;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.exceedReason = builder.exceedReason;
            this.feeType = builder.feeType;
            this.fees = builder.fees;
            this.fines = builder.fines;
            this.fuPointFee = builder.fuPointFee;
            this.hotelName = builder.hotelName;
            this.index = builder.index;
            this.invoiceTitle = builder.invoiceTitle;
            this.isEarlyDeparture = builder.isEarlyDeparture;
            this.isNegotiation = builder.isNegotiation;
            this.isShareStr = builder.isShareStr;
            this.nights = builder.nights;
            this.orderId = builder.orderId;
            this.orderPrice = builder.orderPrice;
            this.orderStatusDesc = builder.orderStatusDesc;
            this.orderType = builder.orderType;
            this.overApplyId = builder.overApplyId;
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.personRefundFee = builder.personRefundFee;
            this.personSettlePrice = builder.personSettlePrice;
            this.primaryId = builder.primaryId;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.promotionFee = builder.promotionFee;
            this.remark = builder.remark;
            this.reserveRule = builder.reserveRule;
            this.roomNo = builder.roomNo;
            this.roomNumber = builder.roomNumber;
            this.roomPrice = builder.roomPrice;
            this.roomType = builder.roomType;
            this.serviceFee = builder.serviceFee;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.star = builder.star;
            this.status = builder.status;
            this.subOrderId = builder.subOrderId;
            this.taxRate = builder.taxRate;
            this.thirdInvoiceId = builder.thirdInvoiceId;
            this.thirdItineraryId = builder.thirdItineraryId;
            this.totalNights = builder.totalNights;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerMemberType = builder.travelerMemberType;
            this.travelerMemberTypeName = builder.travelerMemberTypeName;
            this.travelerName = builder.travelerName;
            this.voucherType = builder.voucherType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
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
        public Double getAverageNights() {
            return this.averageNights;
        }

        /**
         * @return billRecordTime
         */
        public String getBillRecordTime() {
            return this.billRecordTime;
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
        public Integer getCityCountyCode() {
            return this.cityCountyCode;
        }

        /**
         * @return cooperatorBillCode
         */
        public String getCooperatorBillCode() {
            return this.cooperatorBillCode;
        }

        /**
         * @return cooperatorName
         */
        public String getCooperatorName() {
            return this.cooperatorName;
        }

        /**
         * @return cooperatorOrderId
         */
        public String getCooperatorOrderId() {
            return this.cooperatorOrderId;
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
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
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
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return reserveRule
         */
        public Integer getReserveRule() {
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
         * @return serviceFee
         */
        public Double getServiceFee() {
            return this.serviceFee;
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
         * @return totalNights
         */
        public Integer getTotalNights() {
            return this.totalNights;
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

        public static final class Builder {
            private String alipayTradeNo; 
            private String applyArrCityCode; 
            private String applyArrCityName; 
            private String applyDepCityCode; 
            private String applyDepCityName; 
            private String applyExtendField; 
            private String applyId; 
            private Double averageNights; 
            private String billRecordTime; 
            private String bookMode; 
            private String bookReason; 
            private String bookTime; 
            private String bookerId; 
            private String bookerJobNo; 
            private String bookerName; 
            private String brandGroup; 
            private String brandName; 
            private String businessTripResult; 
            private String capitalDirection; 
            private String cascadeDepartment; 
            private String checkInDate; 
            private String checkoutDate; 
            private String city; 
            private String cityCode; 
            private String cityCounty; 
            private Integer cityCountyCode; 
            private String cooperatorBillCode; 
            private String cooperatorName; 
            private String cooperatorOrderId; 
            private Double corpRefundFee; 
            private Double corpTotalFee; 
            private String costCenter; 
            private String costCenterNumber; 
            private String department; 
            private String departmentId; 
            private String exceedReason; 
            private String feeType; 
            private Double fees; 
            private Double fines; 
            private Double fuPointFee; 
            private String hotelName; 
            private String index; 
            private String invoiceTitle; 
            private String isEarlyDeparture; 
            private String isNegotiation; 
            private String isShareStr; 
            private Integer nights; 
            private String orderId; 
            private Double orderPrice; 
            private String orderStatusDesc; 
            private String orderType; 
            private String overApplyId; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private Double personRefundFee; 
            private Double personSettlePrice; 
            private Long primaryId; 
            private String projectCode; 
            private String projectName; 
            private Double promotionFee; 
            private String remark; 
            private Integer reserveRule; 
            private String roomNo; 
            private Integer roomNumber; 
            private Double roomPrice; 
            private String roomType; 
            private Double serviceFee; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private String star; 
            private Integer status; 
            private String subOrderId; 
            private String taxRate; 
            private String thirdInvoiceId; 
            private String thirdItineraryId; 
            private Integer totalNights; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerMemberType; 
            private String travelerMemberTypeName; 
            private String travelerName; 
            private Integer voucherType; 

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
             * average_nights.
             */
            public Builder averageNights(Double averageNights) {
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
            public Builder cityCountyCode(Integer cityCountyCode) {
                this.cityCountyCode = cityCountyCode;
                return this;
            }

            /**
             * cooperator_bill_code.
             */
            public Builder cooperatorBillCode(String cooperatorBillCode) {
                this.cooperatorBillCode = cooperatorBillCode;
                return this;
            }

            /**
             * cooperator_name.
             */
            public Builder cooperatorName(String cooperatorName) {
                this.cooperatorName = cooperatorName;
                return this;
            }

            /**
             * cooperator_order_id.
             */
            public Builder cooperatorOrderId(String cooperatorOrderId) {
                this.cooperatorOrderId = cooperatorOrderId;
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
             * order_type.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
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
             * remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * reserve_rule.
             */
            public Builder reserveRule(Integer reserveRule) {
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
             * service_fee.
             */
            public Builder serviceFee(Double serviceFee) {
                this.serviceFee = serviceFee;
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
             * total_nights.
             */
            public Builder totalNights(Integer totalNights) {
                this.totalNights = totalNights;
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("period_end")
        private String periodEnd;

        @com.aliyun.core.annotation.NameInMap("period_start")
        private String periodStart;

        @com.aliyun.core.annotation.NameInMap("total_size")
        private Long totalSize;

        private Module(Builder builder) {
            this.category = builder.category;
            this.corpId = builder.corpId;
            this.items = builder.items;
            this.periodEnd = builder.periodEnd;
            this.periodStart = builder.periodStart;
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
        public java.util.List < Items> getItems() {
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
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer category; 
            private String corpId; 
            private java.util.List < Items> items; 
            private String periodEnd; 
            private String periodStart; 
            private Long totalSize; 

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
            public Builder items(java.util.List < Items> items) {
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
