// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>FlightBillSettlementQueryResponseBody</p>
 */
public class FlightBillSettlementQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private FlightBillSettlementQueryResponseBody(Builder builder) {
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

    public static FlightBillSettlementQueryResponseBody create() {
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

        public FlightBillSettlementQueryResponseBody build() {
            return new FlightBillSettlementQueryResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @NameInMap("advance_day")
        private Integer advanceDay;

        @NameInMap("airline_corp_code")
        private String airlineCorpCode;

        @NameInMap("airline_corp_name")
        private String airlineCorpName;

        @NameInMap("alipay_trade_no")
        private String alipayTradeNo;

        @NameInMap("apply_arr_city_code")
        private String applyArrCityCode;

        @NameInMap("apply_arr_city_name")
        private String applyArrCityName;

        @NameInMap("apply_dep_city_code")
        private String applyDepCityCode;

        @NameInMap("apply_dep_city_name")
        private String applyDepCityName;

        @NameInMap("apply_extend_field")
        private String applyExtendField;

        @NameInMap("apply_id")
        private String applyId;

        @NameInMap("arr_airport_code")
        private String arrAirportCode;

        @NameInMap("arr_city")
        private String arrCity;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_date")
        private String arrDate;

        @NameInMap("arr_station")
        private String arrStation;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("bill_record_time")
        private String billRecordTime;

        @NameInMap("book_time")
        private String bookTime;

        @NameInMap("booker_id")
        private String bookerId;

        @NameInMap("booker_job_no")
        private String bookerJobNo;

        @NameInMap("booker_name")
        private String bookerName;

        @NameInMap("btrip_coupon_fee")
        private Double btripCouponFee;

        @NameInMap("build_fee")
        private Double buildFee;

        @NameInMap("business_trip_result")
        private String businessTripResult;

        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private String cabinClass;

        @NameInMap("capital_direction")
        private String capitalDirection;

        @NameInMap("cascade_department")
        private String cascadeDepartment;

        @NameInMap("change_fee")
        private Double changeFee;

        @NameInMap("change_result")
        private String changeResult;

        @NameInMap("corp_pay_order_fee")
        private Double corpPayOrderFee;

        @NameInMap("corp_settle_price")
        private Double corpSettlePrice;

        @NameInMap("cost_center")
        private String costCenter;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("coupon")
        private Double coupon;

        @NameInMap("dep_airport_code")
        private String depAirportCode;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("department")
        private String department;

        @NameInMap("department_id")
        private String departmentId;

        @NameInMap("dept_city")
        private String deptCity;

        @NameInMap("dept_date")
        private String deptDate;

        @NameInMap("dept_station")
        private String deptStation;

        @NameInMap("dept_time")
        private String deptTime;

        @NameInMap("discount")
        private String discount;

        @NameInMap("exceed_reason")
        private String exceedReason;

        @NameInMap("fee_type")
        private String feeType;

        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("index")
        private String index;

        @NameInMap("ins_order_id")
        private String insOrderId;

        @NameInMap("insurance_fee")
        private Double insuranceFee;

        @NameInMap("insurance_number")
        private String insuranceNumber;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("item_type")
        private String itemType;

        @NameInMap("itinerary_num")
        private String itineraryNum;

        @NameInMap("itinerary_price")
        private Double itineraryPrice;

        @NameInMap("mileage")
        private String mileage;

        @NameInMap("most_difference_dept_time")
        private String mostDifferenceDeptTime;

        @NameInMap("most_difference_discount")
        private String mostDifferenceDiscount;

        @NameInMap("most_difference_flight_no")
        private String mostDifferenceFlightNo;

        @NameInMap("most_difference_price")
        private Double mostDifferencePrice;

        @NameInMap("most_difference_reason")
        private String mostDifferenceReason;

        @NameInMap("most_price")
        private Double mostPrice;

        @NameInMap("negotiation_coupon_fee")
        private Double negotiationCouponFee;

        @NameInMap("oil_fee")
        private Double oilFee;

        @NameInMap("order_id")
        private String orderId;

        @NameInMap("over_apply_id")
        private String overApplyId;

        @NameInMap("person_settle_price")
        private Double personSettlePrice;

        @NameInMap("pre_book_tip")
        private String preBookTip;

        @NameInMap("primary_id")
        private Long primaryId;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_name")
        private String projectName;

        @NameInMap("refund_fee")
        private Double refundFee;

        @NameInMap("refund_result")
        private String refundResult;

        @NameInMap("refund_upgrade_cost")
        private Double refundUpgradeCost;

        @NameInMap("remark")
        private String remark;

        @NameInMap("repeat_refund")
        private String repeatRefund;

        @NameInMap("seal_price")
        private Double sealPrice;

        @NameInMap("service_fee")
        private Double serviceFee;

        @NameInMap("settlement_fee")
        private Double settlementFee;

        @NameInMap("settlement_grant_fee")
        private Double settlementGrantFee;

        @NameInMap("settlement_time")
        private String settlementTime;

        @NameInMap("settlement_type")
        private String settlementType;

        @NameInMap("status")
        private Integer status;

        @NameInMap("tax_rate")
        private String taxRate;

        @NameInMap("third_itinerary_id")
        private String thirdItineraryId;

        @NameInMap("ticket_id")
        private String ticketId;

        @NameInMap("trade")
        private String trade;

        @NameInMap("traveler_id")
        private String travelerId;

        @NameInMap("traveler_job_no")
        private String travelerJobNo;

        @NameInMap("traveler_member_type_name")
        private String travelerMemberTypeName;

        @NameInMap("traveler_name")
        private String travelerName;

        @NameInMap("upgrade_cost")
        private Double upgradeCost;

        @NameInMap("voucher_type")
        private Integer voucherType;

        @NameInMap("voyage_name")
        private String voyageName;

        private DataList(Builder builder) {
            this.advanceDay = builder.advanceDay;
            this.airlineCorpCode = builder.airlineCorpCode;
            this.airlineCorpName = builder.airlineCorpName;
            this.alipayTradeNo = builder.alipayTradeNo;
            this.applyArrCityCode = builder.applyArrCityCode;
            this.applyArrCityName = builder.applyArrCityName;
            this.applyDepCityCode = builder.applyDepCityCode;
            this.applyDepCityName = builder.applyDepCityName;
            this.applyExtendField = builder.applyExtendField;
            this.applyId = builder.applyId;
            this.arrAirportCode = builder.arrAirportCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrDate = builder.arrDate;
            this.arrStation = builder.arrStation;
            this.arrTime = builder.arrTime;
            this.billRecordTime = builder.billRecordTime;
            this.bookTime = builder.bookTime;
            this.bookerId = builder.bookerId;
            this.bookerJobNo = builder.bookerJobNo;
            this.bookerName = builder.bookerName;
            this.btripCouponFee = builder.btripCouponFee;
            this.buildFee = builder.buildFee;
            this.businessTripResult = builder.businessTripResult;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.capitalDirection = builder.capitalDirection;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.changeFee = builder.changeFee;
            this.changeResult = builder.changeResult;
            this.corpPayOrderFee = builder.corpPayOrderFee;
            this.corpSettlePrice = builder.corpSettlePrice;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.coupon = builder.coupon;
            this.depAirportCode = builder.depAirportCode;
            this.depCityCode = builder.depCityCode;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.deptCity = builder.deptCity;
            this.deptDate = builder.deptDate;
            this.deptStation = builder.deptStation;
            this.deptTime = builder.deptTime;
            this.discount = builder.discount;
            this.exceedReason = builder.exceedReason;
            this.feeType = builder.feeType;
            this.flightNo = builder.flightNo;
            this.index = builder.index;
            this.insOrderId = builder.insOrderId;
            this.insuranceFee = builder.insuranceFee;
            this.insuranceNumber = builder.insuranceNumber;
            this.invoiceTitle = builder.invoiceTitle;
            this.itemType = builder.itemType;
            this.itineraryNum = builder.itineraryNum;
            this.itineraryPrice = builder.itineraryPrice;
            this.mileage = builder.mileage;
            this.mostDifferenceDeptTime = builder.mostDifferenceDeptTime;
            this.mostDifferenceDiscount = builder.mostDifferenceDiscount;
            this.mostDifferenceFlightNo = builder.mostDifferenceFlightNo;
            this.mostDifferencePrice = builder.mostDifferencePrice;
            this.mostDifferenceReason = builder.mostDifferenceReason;
            this.mostPrice = builder.mostPrice;
            this.negotiationCouponFee = builder.negotiationCouponFee;
            this.oilFee = builder.oilFee;
            this.orderId = builder.orderId;
            this.overApplyId = builder.overApplyId;
            this.personSettlePrice = builder.personSettlePrice;
            this.preBookTip = builder.preBookTip;
            this.primaryId = builder.primaryId;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.refundFee = builder.refundFee;
            this.refundResult = builder.refundResult;
            this.refundUpgradeCost = builder.refundUpgradeCost;
            this.remark = builder.remark;
            this.repeatRefund = builder.repeatRefund;
            this.sealPrice = builder.sealPrice;
            this.serviceFee = builder.serviceFee;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.status = builder.status;
            this.taxRate = builder.taxRate;
            this.thirdItineraryId = builder.thirdItineraryId;
            this.ticketId = builder.ticketId;
            this.trade = builder.trade;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerMemberTypeName = builder.travelerMemberTypeName;
            this.travelerName = builder.travelerName;
            this.upgradeCost = builder.upgradeCost;
            this.voucherType = builder.voucherType;
            this.voyageName = builder.voyageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return advanceDay
         */
        public Integer getAdvanceDay() {
            return this.advanceDay;
        }

        /**
         * @return airlineCorpCode
         */
        public String getAirlineCorpCode() {
            return this.airlineCorpCode;
        }

        /**
         * @return airlineCorpName
         */
        public String getAirlineCorpName() {
            return this.airlineCorpName;
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
         * @return arrAirportCode
         */
        public String getArrAirportCode() {
            return this.arrAirportCode;
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
         * @return arrDate
         */
        public String getArrDate() {
            return this.arrDate;
        }

        /**
         * @return arrStation
         */
        public String getArrStation() {
            return this.arrStation;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return billRecordTime
         */
        public String getBillRecordTime() {
            return this.billRecordTime;
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
         * @return btripCouponFee
         */
        public Double getBtripCouponFee() {
            return this.btripCouponFee;
        }

        /**
         * @return buildFee
         */
        public Double getBuildFee() {
            return this.buildFee;
        }

        /**
         * @return businessTripResult
         */
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        /**
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
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
         * @return changeFee
         */
        public Double getChangeFee() {
            return this.changeFee;
        }

        /**
         * @return changeResult
         */
        public String getChangeResult() {
            return this.changeResult;
        }

        /**
         * @return corpPayOrderFee
         */
        public Double getCorpPayOrderFee() {
            return this.corpPayOrderFee;
        }

        /**
         * @return corpSettlePrice
         */
        public Double getCorpSettlePrice() {
            return this.corpSettlePrice;
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
         * @return coupon
         */
        public Double getCoupon() {
            return this.coupon;
        }

        /**
         * @return depAirportCode
         */
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
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
         * @return deptStation
         */
        public String getDeptStation() {
            return this.deptStation;
        }

        /**
         * @return deptTime
         */
        public String getDeptTime() {
            return this.deptTime;
        }

        /**
         * @return discount
         */
        public String getDiscount() {
            return this.discount;
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
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
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
         * @return insuranceFee
         */
        public Double getInsuranceFee() {
            return this.insuranceFee;
        }

        /**
         * @return insuranceNumber
         */
        public String getInsuranceNumber() {
            return this.insuranceNumber;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return itineraryNum
         */
        public String getItineraryNum() {
            return this.itineraryNum;
        }

        /**
         * @return itineraryPrice
         */
        public Double getItineraryPrice() {
            return this.itineraryPrice;
        }

        /**
         * @return mileage
         */
        public String getMileage() {
            return this.mileage;
        }

        /**
         * @return mostDifferenceDeptTime
         */
        public String getMostDifferenceDeptTime() {
            return this.mostDifferenceDeptTime;
        }

        /**
         * @return mostDifferenceDiscount
         */
        public String getMostDifferenceDiscount() {
            return this.mostDifferenceDiscount;
        }

        /**
         * @return mostDifferenceFlightNo
         */
        public String getMostDifferenceFlightNo() {
            return this.mostDifferenceFlightNo;
        }

        /**
         * @return mostDifferencePrice
         */
        public Double getMostDifferencePrice() {
            return this.mostDifferencePrice;
        }

        /**
         * @return mostDifferenceReason
         */
        public String getMostDifferenceReason() {
            return this.mostDifferenceReason;
        }

        /**
         * @return mostPrice
         */
        public Double getMostPrice() {
            return this.mostPrice;
        }

        /**
         * @return negotiationCouponFee
         */
        public Double getNegotiationCouponFee() {
            return this.negotiationCouponFee;
        }

        /**
         * @return oilFee
         */
        public Double getOilFee() {
            return this.oilFee;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return overApplyId
         */
        public String getOverApplyId() {
            return this.overApplyId;
        }

        /**
         * @return personSettlePrice
         */
        public Double getPersonSettlePrice() {
            return this.personSettlePrice;
        }

        /**
         * @return preBookTip
         */
        public String getPreBookTip() {
            return this.preBookTip;
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
         * @return refundFee
         */
        public Double getRefundFee() {
            return this.refundFee;
        }

        /**
         * @return refundResult
         */
        public String getRefundResult() {
            return this.refundResult;
        }

        /**
         * @return refundUpgradeCost
         */
        public Double getRefundUpgradeCost() {
            return this.refundUpgradeCost;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return repeatRefund
         */
        public String getRepeatRefund() {
            return this.repeatRefund;
        }

        /**
         * @return sealPrice
         */
        public Double getSealPrice() {
            return this.sealPrice;
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
         * @return status
         */
        public Integer getStatus() {
            return this.status;
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
         * @return ticketId
         */
        public String getTicketId() {
            return this.ticketId;
        }

        /**
         * @return trade
         */
        public String getTrade() {
            return this.trade;
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
         * @return upgradeCost
         */
        public Double getUpgradeCost() {
            return this.upgradeCost;
        }

        /**
         * @return voucherType
         */
        public Integer getVoucherType() {
            return this.voucherType;
        }

        /**
         * @return voyageName
         */
        public String getVoyageName() {
            return this.voyageName;
        }

        public static final class Builder {
            private Integer advanceDay; 
            private String airlineCorpCode; 
            private String airlineCorpName; 
            private String alipayTradeNo; 
            private String applyArrCityCode; 
            private String applyArrCityName; 
            private String applyDepCityCode; 
            private String applyDepCityName; 
            private String applyExtendField; 
            private String applyId; 
            private String arrAirportCode; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrDate; 
            private String arrStation; 
            private String arrTime; 
            private String billRecordTime; 
            private String bookTime; 
            private String bookerId; 
            private String bookerJobNo; 
            private String bookerName; 
            private Double btripCouponFee; 
            private Double buildFee; 
            private String businessTripResult; 
            private String cabin; 
            private String cabinClass; 
            private String capitalDirection; 
            private String cascadeDepartment; 
            private Double changeFee; 
            private String changeResult; 
            private Double corpPayOrderFee; 
            private Double corpSettlePrice; 
            private String costCenter; 
            private String costCenterNumber; 
            private Double coupon; 
            private String depAirportCode; 
            private String depCityCode; 
            private String department; 
            private String departmentId; 
            private String deptCity; 
            private String deptDate; 
            private String deptStation; 
            private String deptTime; 
            private String discount; 
            private String exceedReason; 
            private String feeType; 
            private String flightNo; 
            private String index; 
            private String insOrderId; 
            private Double insuranceFee; 
            private String insuranceNumber; 
            private String invoiceTitle; 
            private String itemType; 
            private String itineraryNum; 
            private Double itineraryPrice; 
            private String mileage; 
            private String mostDifferenceDeptTime; 
            private String mostDifferenceDiscount; 
            private String mostDifferenceFlightNo; 
            private Double mostDifferencePrice; 
            private String mostDifferenceReason; 
            private Double mostPrice; 
            private Double negotiationCouponFee; 
            private Double oilFee; 
            private String orderId; 
            private String overApplyId; 
            private Double personSettlePrice; 
            private String preBookTip; 
            private Long primaryId; 
            private String projectCode; 
            private String projectName; 
            private Double refundFee; 
            private String refundResult; 
            private Double refundUpgradeCost; 
            private String remark; 
            private String repeatRefund; 
            private Double sealPrice; 
            private Double serviceFee; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private Integer status; 
            private String taxRate; 
            private String thirdItineraryId; 
            private String ticketId; 
            private String trade; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerMemberTypeName; 
            private String travelerName; 
            private Double upgradeCost; 
            private Integer voucherType; 
            private String voyageName; 

            /**
             * advance_day.
             */
            public Builder advanceDay(Integer advanceDay) {
                this.advanceDay = advanceDay;
                return this;
            }

            /**
             * airline_corp_code.
             */
            public Builder airlineCorpCode(String airlineCorpCode) {
                this.airlineCorpCode = airlineCorpCode;
                return this;
            }

            /**
             * airline_corp_name.
             */
            public Builder airlineCorpName(String airlineCorpName) {
                this.airlineCorpName = airlineCorpName;
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
             * 审批扩展自定义字段
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
             * arr_airport_code.
             */
            public Builder arrAirportCode(String arrAirportCode) {
                this.arrAirportCode = arrAirportCode;
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
             * arr_date.
             */
            public Builder arrDate(String arrDate) {
                this.arrDate = arrDate;
                return this;
            }

            /**
             * arr_station.
             */
            public Builder arrStation(String arrStation) {
                this.arrStation = arrStation;
                return this;
            }

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
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
             * btrip_coupon_fee.
             */
            public Builder btripCouponFee(Double btripCouponFee) {
                this.btripCouponFee = btripCouponFee;
                return this;
            }

            /**
             * build_fee.
             */
            public Builder buildFee(Double buildFee) {
                this.buildFee = buildFee;
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
             * cabin.
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * cabin_class.
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
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
             * change_fee.
             */
            public Builder changeFee(Double changeFee) {
                this.changeFee = changeFee;
                return this;
            }

            /**
             * change_result.
             */
            public Builder changeResult(String changeResult) {
                this.changeResult = changeResult;
                return this;
            }

            /**
             * corp_pay_order_fee.
             */
            public Builder corpPayOrderFee(Double corpPayOrderFee) {
                this.corpPayOrderFee = corpPayOrderFee;
                return this;
            }

            /**
             * corp_settle_price.
             */
            public Builder corpSettlePrice(Double corpSettlePrice) {
                this.corpSettlePrice = corpSettlePrice;
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
             * coupon.
             */
            public Builder coupon(Double coupon) {
                this.coupon = coupon;
                return this;
            }

            /**
             * dep_airport_code.
             */
            public Builder depAirportCode(String depAirportCode) {
                this.depAirportCode = depAirportCode;
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
             * dept_station.
             */
            public Builder deptStation(String deptStation) {
                this.deptStation = deptStation;
                return this;
            }

            /**
             * dept_time.
             */
            public Builder deptTime(String deptTime) {
                this.deptTime = deptTime;
                return this;
            }

            /**
             * discount.
             */
            public Builder discount(String discount) {
                this.discount = discount;
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
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
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
             * insurance_fee.
             */
            public Builder insuranceFee(Double insuranceFee) {
                this.insuranceFee = insuranceFee;
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
             * invoice_title.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * item_type.
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * itinerary_num.
             */
            public Builder itineraryNum(String itineraryNum) {
                this.itineraryNum = itineraryNum;
                return this;
            }

            /**
             * itinerary_price.
             */
            public Builder itineraryPrice(Double itineraryPrice) {
                this.itineraryPrice = itineraryPrice;
                return this;
            }

            /**
             * mileage.
             */
            public Builder mileage(String mileage) {
                this.mileage = mileage;
                return this;
            }

            /**
             * most_difference_dept_time.
             */
            public Builder mostDifferenceDeptTime(String mostDifferenceDeptTime) {
                this.mostDifferenceDeptTime = mostDifferenceDeptTime;
                return this;
            }

            /**
             * most_difference_discount.
             */
            public Builder mostDifferenceDiscount(String mostDifferenceDiscount) {
                this.mostDifferenceDiscount = mostDifferenceDiscount;
                return this;
            }

            /**
             * most_difference_flight_no.
             */
            public Builder mostDifferenceFlightNo(String mostDifferenceFlightNo) {
                this.mostDifferenceFlightNo = mostDifferenceFlightNo;
                return this;
            }

            /**
             * most_difference_price.
             */
            public Builder mostDifferencePrice(Double mostDifferencePrice) {
                this.mostDifferencePrice = mostDifferencePrice;
                return this;
            }

            /**
             * most_difference_reason.
             */
            public Builder mostDifferenceReason(String mostDifferenceReason) {
                this.mostDifferenceReason = mostDifferenceReason;
                return this;
            }

            /**
             * most_price.
             */
            public Builder mostPrice(Double mostPrice) {
                this.mostPrice = mostPrice;
                return this;
            }

            /**
             * negotiation_coupon_fee.
             */
            public Builder negotiationCouponFee(Double negotiationCouponFee) {
                this.negotiationCouponFee = negotiationCouponFee;
                return this;
            }

            /**
             * oil_fee.
             */
            public Builder oilFee(Double oilFee) {
                this.oilFee = oilFee;
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
             * over_apply_id.
             */
            public Builder overApplyId(String overApplyId) {
                this.overApplyId = overApplyId;
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
             * pre_book_tip.
             */
            public Builder preBookTip(String preBookTip) {
                this.preBookTip = preBookTip;
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
             * refund_fee.
             */
            public Builder refundFee(Double refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * refund_result.
             */
            public Builder refundResult(String refundResult) {
                this.refundResult = refundResult;
                return this;
            }

            /**
             * refund_upgrade_cost.
             */
            public Builder refundUpgradeCost(Double refundUpgradeCost) {
                this.refundUpgradeCost = refundUpgradeCost;
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
             * repeat_refund.
             */
            public Builder repeatRefund(String repeatRefund) {
                this.repeatRefund = repeatRefund;
                return this;
            }

            /**
             * seal_price.
             */
            public Builder sealPrice(Double sealPrice) {
                this.sealPrice = sealPrice;
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
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 税率
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
             * ticket_id.
             */
            public Builder ticketId(String ticketId) {
                this.ticketId = ticketId;
                return this;
            }

            /**
             * trade.
             */
            public Builder trade(String trade) {
                this.trade = trade;
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
             * upgrade_cost.
             */
            public Builder upgradeCost(Double upgradeCost) {
                this.upgradeCost = upgradeCost;
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
             * voyage_name.
             */
            public Builder voyageName(String voyageName) {
                this.voyageName = voyageName;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("category")
        private Integer category;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("data_list")
        private java.util.List < DataList> dataList;

        @NameInMap("period_end")
        private String periodEnd;

        @NameInMap("period_start")
        private String periodStart;

        @NameInMap("total_num")
        private Long totalNum;

        private Module(Builder builder) {
            this.category = builder.category;
            this.corpId = builder.corpId;
            this.dataList = builder.dataList;
            this.periodEnd = builder.periodEnd;
            this.periodStart = builder.periodStart;
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
        public java.util.List < DataList> getDataList() {
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
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private Integer category; 
            private String corpId; 
            private java.util.List < DataList> dataList; 
            private String periodEnd; 
            private String periodStart; 
            private Long totalNum; 

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
            public Builder dataList(java.util.List < DataList> dataList) {
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
