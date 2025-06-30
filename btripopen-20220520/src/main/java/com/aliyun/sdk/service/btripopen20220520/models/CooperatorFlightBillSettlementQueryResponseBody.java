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
 * {@link CooperatorFlightBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CooperatorFlightBillSettlementQueryResponseBody</p>
 */
public class CooperatorFlightBillSettlementQueryResponseBody extends TeaModel {
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

    private CooperatorFlightBillSettlementQueryResponseBody(Builder builder) {
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

    public static CooperatorFlightBillSettlementQueryResponseBody create() {
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

        private Builder(CooperatorFlightBillSettlementQueryResponseBody model) {
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
         * <p>trace_id</p>
         * 
         * <strong>example:</strong>
         * <p>213e20c816937929648732715e16f1</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CooperatorFlightBillSettlementQueryResponseBody build() {
            return new CooperatorFlightBillSettlementQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CooperatorFlightBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CooperatorFlightBillSettlementQueryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adjust_time")
        private String adjustTime;

        @com.aliyun.core.annotation.NameInMap("advance_day")
        private Integer advanceDay;

        @com.aliyun.core.annotation.NameInMap("airline_corp_code")
        private String airlineCorpCode;

        @com.aliyun.core.annotation.NameInMap("airline_corp_name")
        private String airlineCorpName;

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

        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_date")
        private String arrDate;

        @com.aliyun.core.annotation.NameInMap("arr_station")
        private String arrStation;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("base_location")
        private String baseLocation;

        @com.aliyun.core.annotation.NameInMap("bill_record_time")
        private String billRecordTime;

        @com.aliyun.core.annotation.NameInMap("book_channel")
        private String bookChannel;

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

        @com.aliyun.core.annotation.NameInMap("btrip_coupon_fee")
        private Double btripCouponFee;

        @com.aliyun.core.annotation.NameInMap("build_fee")
        private Double buildFee;

        @com.aliyun.core.annotation.NameInMap("business_trip_result")
        private String businessTripResult;

        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("capital_direction")
        private String capitalDirection;

        @com.aliyun.core.annotation.NameInMap("cascade_department")
        private String cascadeDepartment;

        @com.aliyun.core.annotation.NameInMap("category_desc")
        private String categoryDesc;

        @com.aliyun.core.annotation.NameInMap("change_fee")
        private Double changeFee;

        @com.aliyun.core.annotation.NameInMap("change_result")
        private String changeResult;

        @com.aliyun.core.annotation.NameInMap("cooperator_bill_code")
        private String cooperatorBillCode;

        @com.aliyun.core.annotation.NameInMap("cooperator_name")
        private String cooperatorName;

        @com.aliyun.core.annotation.NameInMap("cooperator_order_id")
        private String cooperatorOrderId;

        @com.aliyun.core.annotation.NameInMap("corp_pay_order_fee")
        private Double corpPayOrderFee;

        @com.aliyun.core.annotation.NameInMap("corp_settle_price")
        private Double corpSettlePrice;

        @com.aliyun.core.annotation.NameInMap("cost_center")
        private String costCenter;

        @com.aliyun.core.annotation.NameInMap("cost_center_number")
        private String costCenterNumber;

        @com.aliyun.core.annotation.NameInMap("cost_department")
        private String costDepartment;

        @com.aliyun.core.annotation.NameInMap("coupon")
        private Double coupon;

        @com.aliyun.core.annotation.NameInMap("custom_content")
        private String customContent;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("department_id")
        private String departmentId;

        @com.aliyun.core.annotation.NameInMap("dept_city")
        private String deptCity;

        @com.aliyun.core.annotation.NameInMap("dept_date")
        private String deptDate;

        @com.aliyun.core.annotation.NameInMap("dept_station")
        private String deptStation;

        @com.aliyun.core.annotation.NameInMap("dept_time")
        private String deptTime;

        @com.aliyun.core.annotation.NameInMap("discount")
        private String discount;

        @com.aliyun.core.annotation.NameInMap("exceed_reason")
        private String exceedReason;

        @com.aliyun.core.annotation.NameInMap("fee_type")
        private String feeType;

        @com.aliyun.core.annotation.NameInMap("fee_type_desc")
        private String feeTypeDesc;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("flight_trip_type")
        private String flightTripType;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("ins_order_id")
        private String insOrderId;

        @com.aliyun.core.annotation.NameInMap("insurance_fee")
        private Double insuranceFee;

        @com.aliyun.core.annotation.NameInMap("insurance_number")
        private String insuranceNumber;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("item_type")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("itinerary_num")
        private String itineraryNum;

        @com.aliyun.core.annotation.NameInMap("itinerary_price")
        private Double itineraryPrice;

        @com.aliyun.core.annotation.NameInMap("mapping_company_code")
        private String mappingCompanyCode;

        @com.aliyun.core.annotation.NameInMap("mileage")
        private Integer mileage;

        @com.aliyun.core.annotation.NameInMap("most_difference_dept_time")
        private String mostDifferenceDeptTime;

        @com.aliyun.core.annotation.NameInMap("most_difference_discount")
        private String mostDifferenceDiscount;

        @com.aliyun.core.annotation.NameInMap("most_difference_flight_no")
        private String mostDifferenceFlightNo;

        @com.aliyun.core.annotation.NameInMap("most_difference_price")
        private Double mostDifferencePrice;

        @com.aliyun.core.annotation.NameInMap("most_difference_reason")
        private String mostDifferenceReason;

        @com.aliyun.core.annotation.NameInMap("most_price")
        private Double mostPrice;

        @com.aliyun.core.annotation.NameInMap("negotiation_coupon_fee")
        private Double negotiationCouponFee;

        @com.aliyun.core.annotation.NameInMap("oil_fee")
        private Double oilFee;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("order_status_desc")
        private String orderStatusDesc;

        @com.aliyun.core.annotation.NameInMap("order_ticket_no")
        private String orderTicketNo;

        @com.aliyun.core.annotation.NameInMap("over_apply_id")
        private String overApplyId;

        @com.aliyun.core.annotation.NameInMap("payment_department_id")
        private String paymentDepartmentId;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

        @com.aliyun.core.annotation.NameInMap("person_settle_price")
        private Double personSettlePrice;

        @com.aliyun.core.annotation.NameInMap("position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("position_level")
        private String positionLevel;

        @com.aliyun.core.annotation.NameInMap("pre_book_tip")
        private String preBookTip;

        @com.aliyun.core.annotation.NameInMap("primary_id")
        private Long primaryId;

        @com.aliyun.core.annotation.NameInMap("processor_oa_code")
        private String processorOaCode;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_name")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("refund_fee")
        private Double refundFee;

        @com.aliyun.core.annotation.NameInMap("refund_result")
        private String refundResult;

        @com.aliyun.core.annotation.NameInMap("refund_upgrade_cost")
        private Double refundUpgradeCost;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("repeat_refund")
        private String repeatRefund;

        @com.aliyun.core.annotation.NameInMap("seal_price")
        private Double sealPrice;

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

        @com.aliyun.core.annotation.NameInMap("ticket_id")
        private String ticketId;

        @com.aliyun.core.annotation.NameInMap("trade")
        private String trade;

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

        @com.aliyun.core.annotation.NameInMap("upgrade_cost")
        private Double upgradeCost;

        @com.aliyun.core.annotation.NameInMap("voucher_type")
        private Integer voucherType;

        @com.aliyun.core.annotation.NameInMap("voucher_type_desc")
        private String voucherTypeDesc;

        @com.aliyun.core.annotation.NameInMap("voyage_name")
        private String voyageName;

        private Items(Builder builder) {
            this.adjustTime = builder.adjustTime;
            this.advanceDay = builder.advanceDay;
            this.airlineCorpCode = builder.airlineCorpCode;
            this.airlineCorpName = builder.airlineCorpName;
            this.alipayId = builder.alipayId;
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
            this.baseLocation = builder.baseLocation;
            this.billRecordTime = builder.billRecordTime;
            this.bookChannel = builder.bookChannel;
            this.bookMode = builder.bookMode;
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
            this.categoryDesc = builder.categoryDesc;
            this.changeFee = builder.changeFee;
            this.changeResult = builder.changeResult;
            this.cooperatorBillCode = builder.cooperatorBillCode;
            this.cooperatorName = builder.cooperatorName;
            this.cooperatorOrderId = builder.cooperatorOrderId;
            this.corpPayOrderFee = builder.corpPayOrderFee;
            this.corpSettlePrice = builder.corpSettlePrice;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.costDepartment = builder.costDepartment;
            this.coupon = builder.coupon;
            this.customContent = builder.customContent;
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
            this.feeTypeDesc = builder.feeTypeDesc;
            this.flightNo = builder.flightNo;
            this.flightTripType = builder.flightTripType;
            this.index = builder.index;
            this.insOrderId = builder.insOrderId;
            this.insuranceFee = builder.insuranceFee;
            this.insuranceNumber = builder.insuranceNumber;
            this.invoiceTitle = builder.invoiceTitle;
            this.itemType = builder.itemType;
            this.itineraryNum = builder.itineraryNum;
            this.itineraryPrice = builder.itineraryPrice;
            this.mappingCompanyCode = builder.mappingCompanyCode;
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
            this.orderStatusDesc = builder.orderStatusDesc;
            this.orderTicketNo = builder.orderTicketNo;
            this.overApplyId = builder.overApplyId;
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.personSettlePrice = builder.personSettlePrice;
            this.position = builder.position;
            this.positionLevel = builder.positionLevel;
            this.preBookTip = builder.preBookTip;
            this.primaryId = builder.primaryId;
            this.processorOaCode = builder.processorOaCode;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.refundFee = builder.refundFee;
            this.refundResult = builder.refundResult;
            this.refundUpgradeCost = builder.refundUpgradeCost;
            this.remark = builder.remark;
            this.repeatRefund = builder.repeatRefund;
            this.sealPrice = builder.sealPrice;
            this.serviceFee = builder.serviceFee;
            this.settleTypeDesc = builder.settleTypeDesc;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.subOrderId = builder.subOrderId;
            this.taxRate = builder.taxRate;
            this.thirdInvoiceId = builder.thirdInvoiceId;
            this.thirdItineraryId = builder.thirdItineraryId;
            this.ticketId = builder.ticketId;
            this.trade = builder.trade;
            this.tradeActionDesc = builder.tradeActionDesc;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerMemberType = builder.travelerMemberType;
            this.travelerMemberTypeName = builder.travelerMemberTypeName;
            this.travelerName = builder.travelerName;
            this.upgradeCost = builder.upgradeCost;
            this.voucherType = builder.voucherType;
            this.voucherTypeDesc = builder.voucherTypeDesc;
            this.voyageName = builder.voyageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return adjustTime
         */
        public String getAdjustTime() {
            return this.adjustTime;
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
         * @return categoryDesc
         */
        public String getCategoryDesc() {
            return this.categoryDesc;
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
         * @return customContent
         */
        public String getCustomContent() {
            return this.customContent;
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
         * @return feeTypeDesc
         */
        public String getFeeTypeDesc() {
            return this.feeTypeDesc;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return flightTripType
         */
        public String getFlightTripType() {
            return this.flightTripType;
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
         * @return mappingCompanyCode
         */
        public String getMappingCompanyCode() {
            return this.mappingCompanyCode;
        }

        /**
         * @return mileage
         */
        public Integer getMileage() {
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
         * @return orderStatusDesc
         */
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        /**
         * @return orderTicketNo
         */
        public String getOrderTicketNo() {
            return this.orderTicketNo;
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
         * @return personSettlePrice
         */
        public Double getPersonSettlePrice() {
            return this.personSettlePrice;
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
         * @return voucherTypeDesc
         */
        public String getVoucherTypeDesc() {
            return this.voucherTypeDesc;
        }

        /**
         * @return voyageName
         */
        public String getVoyageName() {
            return this.voyageName;
        }

        public static final class Builder {
            private String adjustTime; 
            private Integer advanceDay; 
            private String airlineCorpCode; 
            private String airlineCorpName; 
            private String alipayId; 
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
            private String baseLocation; 
            private String billRecordTime; 
            private String bookChannel; 
            private String bookMode; 
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
            private String categoryDesc; 
            private Double changeFee; 
            private String changeResult; 
            private String cooperatorBillCode; 
            private String cooperatorName; 
            private String cooperatorOrderId; 
            private Double corpPayOrderFee; 
            private Double corpSettlePrice; 
            private String costCenter; 
            private String costCenterNumber; 
            private String costDepartment; 
            private Double coupon; 
            private String customContent; 
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
            private String feeTypeDesc; 
            private String flightNo; 
            private String flightTripType; 
            private String index; 
            private String insOrderId; 
            private Double insuranceFee; 
            private String insuranceNumber; 
            private String invoiceTitle; 
            private String itemType; 
            private String itineraryNum; 
            private Double itineraryPrice; 
            private String mappingCompanyCode; 
            private Integer mileage; 
            private String mostDifferenceDeptTime; 
            private String mostDifferenceDiscount; 
            private String mostDifferenceFlightNo; 
            private Double mostDifferencePrice; 
            private String mostDifferenceReason; 
            private Double mostPrice; 
            private Double negotiationCouponFee; 
            private Double oilFee; 
            private String orderId; 
            private String orderStatusDesc; 
            private String orderTicketNo; 
            private String overApplyId; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private Double personSettlePrice; 
            private String position; 
            private String positionLevel; 
            private String preBookTip; 
            private Long primaryId; 
            private String processorOaCode; 
            private String projectCode; 
            private String projectName; 
            private Double refundFee; 
            private String refundResult; 
            private Double refundUpgradeCost; 
            private String remark; 
            private String repeatRefund; 
            private Double sealPrice; 
            private Double serviceFee; 
            private String settleTypeDesc; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private Integer status; 
            private String statusDesc; 
            private String subOrderId; 
            private String taxRate; 
            private String thirdInvoiceId; 
            private String thirdItineraryId; 
            private String ticketId; 
            private String trade; 
            private String tradeActionDesc; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerMemberType; 
            private String travelerMemberTypeName; 
            private String travelerName; 
            private Double upgradeCost; 
            private Integer voucherType; 
            private String voucherTypeDesc; 
            private String voyageName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.adjustTime = model.adjustTime;
                this.advanceDay = model.advanceDay;
                this.airlineCorpCode = model.airlineCorpCode;
                this.airlineCorpName = model.airlineCorpName;
                this.alipayId = model.alipayId;
                this.alipayTradeNo = model.alipayTradeNo;
                this.applyArrCityCode = model.applyArrCityCode;
                this.applyArrCityName = model.applyArrCityName;
                this.applyDepCityCode = model.applyDepCityCode;
                this.applyDepCityName = model.applyDepCityName;
                this.applyExtendField = model.applyExtendField;
                this.applyId = model.applyId;
                this.arrAirportCode = model.arrAirportCode;
                this.arrCity = model.arrCity;
                this.arrCityCode = model.arrCityCode;
                this.arrDate = model.arrDate;
                this.arrStation = model.arrStation;
                this.arrTime = model.arrTime;
                this.baseLocation = model.baseLocation;
                this.billRecordTime = model.billRecordTime;
                this.bookChannel = model.bookChannel;
                this.bookMode = model.bookMode;
                this.bookTime = model.bookTime;
                this.bookerId = model.bookerId;
                this.bookerJobNo = model.bookerJobNo;
                this.bookerName = model.bookerName;
                this.btripCouponFee = model.btripCouponFee;
                this.buildFee = model.buildFee;
                this.businessTripResult = model.businessTripResult;
                this.cabin = model.cabin;
                this.cabinClass = model.cabinClass;
                this.capitalDirection = model.capitalDirection;
                this.cascadeDepartment = model.cascadeDepartment;
                this.categoryDesc = model.categoryDesc;
                this.changeFee = model.changeFee;
                this.changeResult = model.changeResult;
                this.cooperatorBillCode = model.cooperatorBillCode;
                this.cooperatorName = model.cooperatorName;
                this.cooperatorOrderId = model.cooperatorOrderId;
                this.corpPayOrderFee = model.corpPayOrderFee;
                this.corpSettlePrice = model.corpSettlePrice;
                this.costCenter = model.costCenter;
                this.costCenterNumber = model.costCenterNumber;
                this.costDepartment = model.costDepartment;
                this.coupon = model.coupon;
                this.customContent = model.customContent;
                this.depAirportCode = model.depAirportCode;
                this.depCityCode = model.depCityCode;
                this.department = model.department;
                this.departmentId = model.departmentId;
                this.deptCity = model.deptCity;
                this.deptDate = model.deptDate;
                this.deptStation = model.deptStation;
                this.deptTime = model.deptTime;
                this.discount = model.discount;
                this.exceedReason = model.exceedReason;
                this.feeType = model.feeType;
                this.feeTypeDesc = model.feeTypeDesc;
                this.flightNo = model.flightNo;
                this.flightTripType = model.flightTripType;
                this.index = model.index;
                this.insOrderId = model.insOrderId;
                this.insuranceFee = model.insuranceFee;
                this.insuranceNumber = model.insuranceNumber;
                this.invoiceTitle = model.invoiceTitle;
                this.itemType = model.itemType;
                this.itineraryNum = model.itineraryNum;
                this.itineraryPrice = model.itineraryPrice;
                this.mappingCompanyCode = model.mappingCompanyCode;
                this.mileage = model.mileage;
                this.mostDifferenceDeptTime = model.mostDifferenceDeptTime;
                this.mostDifferenceDiscount = model.mostDifferenceDiscount;
                this.mostDifferenceFlightNo = model.mostDifferenceFlightNo;
                this.mostDifferencePrice = model.mostDifferencePrice;
                this.mostDifferenceReason = model.mostDifferenceReason;
                this.mostPrice = model.mostPrice;
                this.negotiationCouponFee = model.negotiationCouponFee;
                this.oilFee = model.oilFee;
                this.orderId = model.orderId;
                this.orderStatusDesc = model.orderStatusDesc;
                this.orderTicketNo = model.orderTicketNo;
                this.overApplyId = model.overApplyId;
                this.paymentDepartmentId = model.paymentDepartmentId;
                this.paymentDepartmentName = model.paymentDepartmentName;
                this.personSettlePrice = model.personSettlePrice;
                this.position = model.position;
                this.positionLevel = model.positionLevel;
                this.preBookTip = model.preBookTip;
                this.primaryId = model.primaryId;
                this.processorOaCode = model.processorOaCode;
                this.projectCode = model.projectCode;
                this.projectName = model.projectName;
                this.refundFee = model.refundFee;
                this.refundResult = model.refundResult;
                this.refundUpgradeCost = model.refundUpgradeCost;
                this.remark = model.remark;
                this.repeatRefund = model.repeatRefund;
                this.sealPrice = model.sealPrice;
                this.serviceFee = model.serviceFee;
                this.settleTypeDesc = model.settleTypeDesc;
                this.settlementFee = model.settlementFee;
                this.settlementGrantFee = model.settlementGrantFee;
                this.settlementTime = model.settlementTime;
                this.settlementType = model.settlementType;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.subOrderId = model.subOrderId;
                this.taxRate = model.taxRate;
                this.thirdInvoiceId = model.thirdInvoiceId;
                this.thirdItineraryId = model.thirdItineraryId;
                this.ticketId = model.ticketId;
                this.trade = model.trade;
                this.tradeActionDesc = model.tradeActionDesc;
                this.travelerId = model.travelerId;
                this.travelerJobNo = model.travelerJobNo;
                this.travelerMemberType = model.travelerMemberType;
                this.travelerMemberTypeName = model.travelerMemberTypeName;
                this.travelerName = model.travelerName;
                this.upgradeCost = model.upgradeCost;
                this.voucherType = model.voucherType;
                this.voucherTypeDesc = model.voucherTypeDesc;
                this.voyageName = model.voyageName;
            } 

            /**
             * adjust_time.
             */
            public Builder adjustTime(String adjustTime) {
                this.adjustTime = adjustTime;
                return this;
            }

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
             * category_desc.
             */
            public Builder categoryDesc(String categoryDesc) {
                this.categoryDesc = categoryDesc;
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
             * custom_content.
             */
            public Builder customContent(String customContent) {
                this.customContent = customContent;
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
             * fee_type_desc.
             */
            public Builder feeTypeDesc(String feeTypeDesc) {
                this.feeTypeDesc = feeTypeDesc;
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
             * flight_trip_type.
             */
            public Builder flightTripType(String flightTripType) {
                this.flightTripType = flightTripType;
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
             * mapping_company_code.
             */
            public Builder mappingCompanyCode(String mappingCompanyCode) {
                this.mappingCompanyCode = mappingCompanyCode;
                return this;
            }

            /**
             * mileage.
             */
            public Builder mileage(Integer mileage) {
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
             * order_status_desc.
             */
            public Builder orderStatusDesc(String orderStatusDesc) {
                this.orderStatusDesc = orderStatusDesc;
                return this;
            }

            /**
             * order_ticket_no.
             */
            public Builder orderTicketNo(String orderTicketNo) {
                this.orderTicketNo = orderTicketNo;
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
             * person_settle_price.
             */
            public Builder personSettlePrice(Double personSettlePrice) {
                this.personSettlePrice = personSettlePrice;
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
             * voucher_type_desc.
             */
            public Builder voucherTypeDesc(String voucherTypeDesc) {
                this.voucherTypeDesc = voucherTypeDesc;
                return this;
            }

            /**
             * voyage_name.
             */
            public Builder voyageName(String voyageName) {
                this.voyageName = voyageName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link CooperatorFlightBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CooperatorFlightBillSettlementQueryResponseBody</p>
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
