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
 * {@link IeFlightBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>IeFlightBillSettlementQueryResponseBody</p>
 */
public class IeFlightBillSettlementQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("more_page")
    private Boolean morePage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private IeFlightBillSettlementQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.morePage = builder.morePage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IeFlightBillSettlementQueryResponseBody create() {
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
        private Boolean morePage; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(IeFlightBillSettlementQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.morePage = model.morePage;
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

        public IeFlightBillSettlementQueryResponseBody build() {
            return new IeFlightBillSettlementQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IeFlightBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IeFlightBillSettlementQueryResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adjust_time")
        private String adjustTime;

        @com.aliyun.core.annotation.NameInMap("advance_day")
        private Integer advanceDay;

        @com.aliyun.core.annotation.NameInMap("airline_corp_code")
        private String airlineCorpCode;

        @com.aliyun.core.annotation.NameInMap("airline_corp_name")
        private String airlineCorpName;

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

        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_country")
        private String arrCountry;

        @com.aliyun.core.annotation.NameInMap("arr_country_code")
        private String arrCountryCode;

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

        @com.aliyun.core.annotation.NameInMap("corp_pay_order_fee")
        private Double corpPayOrderFee;

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

        @com.aliyun.core.annotation.NameInMap("deductible_tax")
        private Double deductibleTax;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_country")
        private String depCountry;

        @com.aliyun.core.annotation.NameInMap("dep_country_code")
        private String depCountryCode;

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

        @com.aliyun.core.annotation.NameInMap("foreigners_tag")
        private String foreignersTag;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("ins_order_id")
        private String insOrderId;

        @com.aliyun.core.annotation.NameInMap("insurance_fee")
        private Double insuranceFee;

        @com.aliyun.core.annotation.NameInMap("insurance_number")
        private String insuranceNumber;

        @com.aliyun.core.annotation.NameInMap("insurance_product_name")
        private String insuranceProductName;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("mapping_company_code")
        private String mappingCompanyCode;

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

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("order_status_desc")
        private String orderStatusDesc;

        @com.aliyun.core.annotation.NameInMap("over_apply_id")
        private String overApplyId;

        @com.aliyun.core.annotation.NameInMap("payment_department_id")
        private String paymentDepartmentId;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

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

        @com.aliyun.core.annotation.NameInMap("refund_change_cost")
        private Double refundChangeCost;

        @com.aliyun.core.annotation.NameInMap("refund_fee")
        private Double refundFee;

        @com.aliyun.core.annotation.NameInMap("refund_result")
        private String refundResult;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("repeat_refund")
        private String repeatRefund;

        @com.aliyun.core.annotation.NameInMap("seal_price")
        private Double sealPrice;

        @com.aliyun.core.annotation.NameInMap("segment_type")
        private String segmentType;

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

        @com.aliyun.core.annotation.NameInMap("sio")
        private String sio;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("status_desc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("sub_order_id")
        private String subOrderId;

        @com.aliyun.core.annotation.NameInMap("tax_fee")
        private Double taxFee;

        @com.aliyun.core.annotation.NameInMap("tax_rate")
        private String taxRate;

        @com.aliyun.core.annotation.NameInMap("third_itinerary_id")
        private String thirdItineraryId;

        @com.aliyun.core.annotation.NameInMap("ticket_id")
        private String ticketId;

        @com.aliyun.core.annotation.NameInMap("trade")
        private String trade;

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

        @com.aliyun.core.annotation.NameInMap("trip_type")
        private Integer tripType;

        @com.aliyun.core.annotation.NameInMap("voucher_type")
        private Integer voucherType;

        @com.aliyun.core.annotation.NameInMap("voucher_type_desc")
        private String voucherTypeDesc;

        @com.aliyun.core.annotation.NameInMap("voyage_name")
        private String voyageName;

        private DataList(Builder builder) {
            this.adjustTime = builder.adjustTime;
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
            this.approverEmail = builder.approverEmail;
            this.approverId = builder.approverId;
            this.approverName = builder.approverName;
            this.arrAirportCode = builder.arrAirportCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrCountry = builder.arrCountry;
            this.arrCountryCode = builder.arrCountryCode;
            this.arrDate = builder.arrDate;
            this.arrStation = builder.arrStation;
            this.arrTime = builder.arrTime;
            this.baseLocation = builder.baseLocation;
            this.billRecordTime = builder.billRecordTime;
            this.bookMode = builder.bookMode;
            this.bookTime = builder.bookTime;
            this.bookerId = builder.bookerId;
            this.bookerJobNo = builder.bookerJobNo;
            this.bookerName = builder.bookerName;
            this.btripCouponFee = builder.btripCouponFee;
            this.businessTripResult = builder.businessTripResult;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.capitalDirection = builder.capitalDirection;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.categoryDesc = builder.categoryDesc;
            this.changeFee = builder.changeFee;
            this.changeResult = builder.changeResult;
            this.corpPayOrderFee = builder.corpPayOrderFee;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.costDepartment = builder.costDepartment;
            this.coupon = builder.coupon;
            this.customContent = builder.customContent;
            this.deductibleTax = builder.deductibleTax;
            this.depAirportCode = builder.depAirportCode;
            this.depCityCode = builder.depCityCode;
            this.depCountry = builder.depCountry;
            this.depCountryCode = builder.depCountryCode;
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
            this.foreignersTag = builder.foreignersTag;
            this.index = builder.index;
            this.insOrderId = builder.insOrderId;
            this.insuranceFee = builder.insuranceFee;
            this.insuranceNumber = builder.insuranceNumber;
            this.insuranceProductName = builder.insuranceProductName;
            this.invoiceTitle = builder.invoiceTitle;
            this.location = builder.location;
            this.mappingCompanyCode = builder.mappingCompanyCode;
            this.mostDifferenceDeptTime = builder.mostDifferenceDeptTime;
            this.mostDifferenceDiscount = builder.mostDifferenceDiscount;
            this.mostDifferenceFlightNo = builder.mostDifferenceFlightNo;
            this.mostDifferencePrice = builder.mostDifferencePrice;
            this.mostDifferenceReason = builder.mostDifferenceReason;
            this.mostPrice = builder.mostPrice;
            this.negotiationCouponFee = builder.negotiationCouponFee;
            this.orderId = builder.orderId;
            this.orderStatusDesc = builder.orderStatusDesc;
            this.overApplyId = builder.overApplyId;
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.position = builder.position;
            this.positionLevel = builder.positionLevel;
            this.primaryId = builder.primaryId;
            this.processorOaCode = builder.processorOaCode;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.refundChangeCost = builder.refundChangeCost;
            this.refundFee = builder.refundFee;
            this.refundResult = builder.refundResult;
            this.remark = builder.remark;
            this.repeatRefund = builder.repeatRefund;
            this.sealPrice = builder.sealPrice;
            this.segmentType = builder.segmentType;
            this.serviceFee = builder.serviceFee;
            this.settleTypeDesc = builder.settleTypeDesc;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.sio = builder.sio;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.subOrderId = builder.subOrderId;
            this.taxFee = builder.taxFee;
            this.taxRate = builder.taxRate;
            this.thirdItineraryId = builder.thirdItineraryId;
            this.ticketId = builder.ticketId;
            this.trade = builder.trade;
            this.tradeActionDesc = builder.tradeActionDesc;
            this.travelerEmail = builder.travelerEmail;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerMemberType = builder.travelerMemberType;
            this.travelerMemberTypeName = builder.travelerMemberTypeName;
            this.travelerName = builder.travelerName;
            this.tripType = builder.tripType;
            this.voucherType = builder.voucherType;
            this.voucherTypeDesc = builder.voucherTypeDesc;
            this.voyageName = builder.voyageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
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
         * @return arrCountry
         */
        public String getArrCountry() {
            return this.arrCountry;
        }

        /**
         * @return arrCountryCode
         */
        public String getArrCountryCode() {
            return this.arrCountryCode;
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
         * @return corpPayOrderFee
         */
        public Double getCorpPayOrderFee() {
            return this.corpPayOrderFee;
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
         * @return deductibleTax
         */
        public Double getDeductibleTax() {
            return this.deductibleTax;
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
         * @return depCountry
         */
        public String getDepCountry() {
            return this.depCountry;
        }

        /**
         * @return depCountryCode
         */
        public String getDepCountryCode() {
            return this.depCountryCode;
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
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return mappingCompanyCode
         */
        public String getMappingCompanyCode() {
            return this.mappingCompanyCode;
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
         * @return refundChangeCost
         */
        public Double getRefundChangeCost() {
            return this.refundChangeCost;
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
         * @return segmentType
         */
        public String getSegmentType() {
            return this.segmentType;
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
         * @return taxFee
         */
        public Double getTaxFee() {
            return this.taxFee;
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
         * @return tripType
         */
        public Integer getTripType() {
            return this.tripType;
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
            private String arrAirportCode; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrCountry; 
            private String arrCountryCode; 
            private String arrDate; 
            private String arrStation; 
            private String arrTime; 
            private String baseLocation; 
            private String billRecordTime; 
            private String bookMode; 
            private String bookTime; 
            private String bookerId; 
            private String bookerJobNo; 
            private String bookerName; 
            private Double btripCouponFee; 
            private String businessTripResult; 
            private String cabin; 
            private String cabinClass; 
            private String capitalDirection; 
            private String cascadeDepartment; 
            private String categoryDesc; 
            private Double changeFee; 
            private String changeResult; 
            private Double corpPayOrderFee; 
            private String costCenter; 
            private String costCenterNumber; 
            private String costDepartment; 
            private Double coupon; 
            private String customContent; 
            private Double deductibleTax; 
            private String depAirportCode; 
            private String depCityCode; 
            private String depCountry; 
            private String depCountryCode; 
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
            private String foreignersTag; 
            private String index; 
            private String insOrderId; 
            private Double insuranceFee; 
            private String insuranceNumber; 
            private String insuranceProductName; 
            private String invoiceTitle; 
            private String location; 
            private String mappingCompanyCode; 
            private String mostDifferenceDeptTime; 
            private String mostDifferenceDiscount; 
            private String mostDifferenceFlightNo; 
            private Double mostDifferencePrice; 
            private String mostDifferenceReason; 
            private Double mostPrice; 
            private Double negotiationCouponFee; 
            private String orderId; 
            private String orderStatusDesc; 
            private String overApplyId; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private String position; 
            private String positionLevel; 
            private Long primaryId; 
            private String processorOaCode; 
            private String projectCode; 
            private String projectName; 
            private Double refundChangeCost; 
            private Double refundFee; 
            private String refundResult; 
            private String remark; 
            private String repeatRefund; 
            private Double sealPrice; 
            private String segmentType; 
            private Double serviceFee; 
            private String settleTypeDesc; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private String sio; 
            private Integer status; 
            private String statusDesc; 
            private String subOrderId; 
            private Double taxFee; 
            private String taxRate; 
            private String thirdItineraryId; 
            private String ticketId; 
            private String trade; 
            private String tradeActionDesc; 
            private String travelerEmail; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerMemberType; 
            private String travelerMemberTypeName; 
            private String travelerName; 
            private Integer tripType; 
            private Integer voucherType; 
            private String voucherTypeDesc; 
            private String voyageName; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.adjustTime = model.adjustTime;
                this.advanceDay = model.advanceDay;
                this.airlineCorpCode = model.airlineCorpCode;
                this.airlineCorpName = model.airlineCorpName;
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
                this.arrAirportCode = model.arrAirportCode;
                this.arrCity = model.arrCity;
                this.arrCityCode = model.arrCityCode;
                this.arrCountry = model.arrCountry;
                this.arrCountryCode = model.arrCountryCode;
                this.arrDate = model.arrDate;
                this.arrStation = model.arrStation;
                this.arrTime = model.arrTime;
                this.baseLocation = model.baseLocation;
                this.billRecordTime = model.billRecordTime;
                this.bookMode = model.bookMode;
                this.bookTime = model.bookTime;
                this.bookerId = model.bookerId;
                this.bookerJobNo = model.bookerJobNo;
                this.bookerName = model.bookerName;
                this.btripCouponFee = model.btripCouponFee;
                this.businessTripResult = model.businessTripResult;
                this.cabin = model.cabin;
                this.cabinClass = model.cabinClass;
                this.capitalDirection = model.capitalDirection;
                this.cascadeDepartment = model.cascadeDepartment;
                this.categoryDesc = model.categoryDesc;
                this.changeFee = model.changeFee;
                this.changeResult = model.changeResult;
                this.corpPayOrderFee = model.corpPayOrderFee;
                this.costCenter = model.costCenter;
                this.costCenterNumber = model.costCenterNumber;
                this.costDepartment = model.costDepartment;
                this.coupon = model.coupon;
                this.customContent = model.customContent;
                this.deductibleTax = model.deductibleTax;
                this.depAirportCode = model.depAirportCode;
                this.depCityCode = model.depCityCode;
                this.depCountry = model.depCountry;
                this.depCountryCode = model.depCountryCode;
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
                this.foreignersTag = model.foreignersTag;
                this.index = model.index;
                this.insOrderId = model.insOrderId;
                this.insuranceFee = model.insuranceFee;
                this.insuranceNumber = model.insuranceNumber;
                this.insuranceProductName = model.insuranceProductName;
                this.invoiceTitle = model.invoiceTitle;
                this.location = model.location;
                this.mappingCompanyCode = model.mappingCompanyCode;
                this.mostDifferenceDeptTime = model.mostDifferenceDeptTime;
                this.mostDifferenceDiscount = model.mostDifferenceDiscount;
                this.mostDifferenceFlightNo = model.mostDifferenceFlightNo;
                this.mostDifferencePrice = model.mostDifferencePrice;
                this.mostDifferenceReason = model.mostDifferenceReason;
                this.mostPrice = model.mostPrice;
                this.negotiationCouponFee = model.negotiationCouponFee;
                this.orderId = model.orderId;
                this.orderStatusDesc = model.orderStatusDesc;
                this.overApplyId = model.overApplyId;
                this.paymentDepartmentId = model.paymentDepartmentId;
                this.paymentDepartmentName = model.paymentDepartmentName;
                this.position = model.position;
                this.positionLevel = model.positionLevel;
                this.primaryId = model.primaryId;
                this.processorOaCode = model.processorOaCode;
                this.projectCode = model.projectCode;
                this.projectName = model.projectName;
                this.refundChangeCost = model.refundChangeCost;
                this.refundFee = model.refundFee;
                this.refundResult = model.refundResult;
                this.remark = model.remark;
                this.repeatRefund = model.repeatRefund;
                this.sealPrice = model.sealPrice;
                this.segmentType = model.segmentType;
                this.serviceFee = model.serviceFee;
                this.settleTypeDesc = model.settleTypeDesc;
                this.settlementFee = model.settlementFee;
                this.settlementGrantFee = model.settlementGrantFee;
                this.settlementTime = model.settlementTime;
                this.settlementType = model.settlementType;
                this.sio = model.sio;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.subOrderId = model.subOrderId;
                this.taxFee = model.taxFee;
                this.taxRate = model.taxRate;
                this.thirdItineraryId = model.thirdItineraryId;
                this.ticketId = model.ticketId;
                this.trade = model.trade;
                this.tradeActionDesc = model.tradeActionDesc;
                this.travelerEmail = model.travelerEmail;
                this.travelerId = model.travelerId;
                this.travelerJobNo = model.travelerJobNo;
                this.travelerMemberType = model.travelerMemberType;
                this.travelerMemberTypeName = model.travelerMemberTypeName;
                this.travelerName = model.travelerName;
                this.tripType = model.tripType;
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
             * arr_country.
             */
            public Builder arrCountry(String arrCountry) {
                this.arrCountry = arrCountry;
                return this;
            }

            /**
             * arr_country_code.
             */
            public Builder arrCountryCode(String arrCountryCode) {
                this.arrCountryCode = arrCountryCode;
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
             * corp_pay_order_fee.
             */
            public Builder corpPayOrderFee(Double corpPayOrderFee) {
                this.corpPayOrderFee = corpPayOrderFee;
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
             * deductible_tax.
             */
            public Builder deductibleTax(Double deductibleTax) {
                this.deductibleTax = deductibleTax;
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
             * dep_country.
             */
            public Builder depCountry(String depCountry) {
                this.depCountry = depCountry;
                return this;
            }

            /**
             * dep_country_code.
             */
            public Builder depCountryCode(String depCountryCode) {
                this.depCountryCode = depCountryCode;
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
             * location.
             */
            public Builder location(String location) {
                this.location = location;
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
             * refund_change_cost.
             */
            public Builder refundChangeCost(Double refundChangeCost) {
                this.refundChangeCost = refundChangeCost;
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
             * segment_type.
             */
            public Builder segmentType(String segmentType) {
                this.segmentType = segmentType;
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
             * sio.
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
             * tax_fee.
             */
            public Builder taxFee(Double taxFee) {
                this.taxFee = taxFee;
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
             * trip_type.
             */
            public Builder tripType(Integer tripType) {
                this.tripType = tripType;
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

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IeFlightBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>IeFlightBillSettlementQueryResponseBody</p>
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
