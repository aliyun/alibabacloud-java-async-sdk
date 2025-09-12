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

        private Builder(CooperatorHotelBillSettlementQueryResponseBody model) {
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
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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
         * <p>21041ce316577904808056433edbb2</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CooperatorHotelBillSettlementQueryResponseBody build() {
            return new CooperatorHotelBillSettlementQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CooperatorHotelBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CooperatorHotelBillSettlementQueryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adjust_time")
        private String adjustTime;

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

        @com.aliyun.core.annotation.NameInMap("average_nights")
        private Double averageNights;

        @com.aliyun.core.annotation.NameInMap("base_location")
        private String baseLocation;

        @com.aliyun.core.annotation.NameInMap("bill_record_time")
        private String billRecordTime;

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

        @com.aliyun.core.annotation.NameInMap("cost_department")
        private String costDepartment;

        @com.aliyun.core.annotation.NameInMap("custom_content")
        private String customContent;

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

        @com.aliyun.core.annotation.NameInMap("foreigners_tag")
        private String foreignersTag;

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

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("mapping_company_code")
        private String mappingCompanyCode;

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

        @com.aliyun.core.annotation.NameInMap("star")
        private String star;

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

        @com.aliyun.core.annotation.NameInMap("total_nights")
        private Integer totalNights;

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

        @com.aliyun.core.annotation.NameInMap("voucher_type")
        private Integer voucherType;

        @com.aliyun.core.annotation.NameInMap("voucher_type_desc")
        private String voucherTypeDesc;

        private Items(Builder builder) {
            this.adjustTime = builder.adjustTime;
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
            this.averageNights = builder.averageNights;
            this.baseLocation = builder.baseLocation;
            this.billRecordTime = builder.billRecordTime;
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
            this.capitalDirection = builder.capitalDirection;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.categoryDesc = builder.categoryDesc;
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
            this.costDepartment = builder.costDepartment;
            this.customContent = builder.customContent;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.exceedReason = builder.exceedReason;
            this.feeType = builder.feeType;
            this.feeTypeDesc = builder.feeTypeDesc;
            this.fees = builder.fees;
            this.fines = builder.fines;
            this.foreignersTag = builder.foreignersTag;
            this.fuPointFee = builder.fuPointFee;
            this.hotelName = builder.hotelName;
            this.index = builder.index;
            this.invoiceTitle = builder.invoiceTitle;
            this.isEarlyDeparture = builder.isEarlyDeparture;
            this.isNegotiation = builder.isNegotiation;
            this.isShareStr = builder.isShareStr;
            this.location = builder.location;
            this.mappingCompanyCode = builder.mappingCompanyCode;
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
            this.position = builder.position;
            this.positionLevel = builder.positionLevel;
            this.primaryId = builder.primaryId;
            this.processorOaCode = builder.processorOaCode;
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
            this.settleTypeDesc = builder.settleTypeDesc;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.sio = builder.sio;
            this.star = builder.star;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.subOrderId = builder.subOrderId;
            this.taxRate = builder.taxRate;
            this.thirdInvoiceId = builder.thirdInvoiceId;
            this.thirdItineraryId = builder.thirdItineraryId;
            this.totalNights = builder.totalNights;
            this.tradeActionDesc = builder.tradeActionDesc;
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
         * @return adjustTime
         */
        public String getAdjustTime() {
            return this.adjustTime;
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
         * @return averageNights
         */
        public Double getAverageNights() {
            return this.averageNights;
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
         * @return costDepartment
         */
        public String getCostDepartment() {
            return this.costDepartment;
        }

        /**
         * @return customContent
         */
        public String getCustomContent() {
            return this.customContent;
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
         * @return foreignersTag
         */
        public String getForeignersTag() {
            return this.foreignersTag;
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
            private String adjustTime; 
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
            private Double averageNights; 
            private String baseLocation; 
            private String billRecordTime; 
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
            private String capitalDirection; 
            private String cascadeDepartment; 
            private String categoryDesc; 
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
            private String costDepartment; 
            private String customContent; 
            private String department; 
            private String departmentId; 
            private String exceedReason; 
            private String feeType; 
            private String feeTypeDesc; 
            private Double fees; 
            private Double fines; 
            private String foreignersTag; 
            private Double fuPointFee; 
            private String hotelName; 
            private String index; 
            private String invoiceTitle; 
            private String isEarlyDeparture; 
            private String isNegotiation; 
            private String isShareStr; 
            private String location; 
            private String mappingCompanyCode; 
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
            private String position; 
            private String positionLevel; 
            private Long primaryId; 
            private String processorOaCode; 
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
            private String settleTypeDesc; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private String sio; 
            private String star; 
            private Integer status; 
            private String statusDesc; 
            private String subOrderId; 
            private String taxRate; 
            private String thirdInvoiceId; 
            private String thirdItineraryId; 
            private Integer totalNights; 
            private String tradeActionDesc; 
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
                this.adjustTime = model.adjustTime;
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
                this.averageNights = model.averageNights;
                this.baseLocation = model.baseLocation;
                this.billRecordTime = model.billRecordTime;
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
                this.capitalDirection = model.capitalDirection;
                this.cascadeDepartment = model.cascadeDepartment;
                this.categoryDesc = model.categoryDesc;
                this.checkInDate = model.checkInDate;
                this.checkoutDate = model.checkoutDate;
                this.city = model.city;
                this.cityCode = model.cityCode;
                this.cityCounty = model.cityCounty;
                this.cityCountyCode = model.cityCountyCode;
                this.cooperatorBillCode = model.cooperatorBillCode;
                this.cooperatorName = model.cooperatorName;
                this.cooperatorOrderId = model.cooperatorOrderId;
                this.corpRefundFee = model.corpRefundFee;
                this.corpTotalFee = model.corpTotalFee;
                this.costCenter = model.costCenter;
                this.costCenterNumber = model.costCenterNumber;
                this.costDepartment = model.costDepartment;
                this.customContent = model.customContent;
                this.department = model.department;
                this.departmentId = model.departmentId;
                this.exceedReason = model.exceedReason;
                this.feeType = model.feeType;
                this.feeTypeDesc = model.feeTypeDesc;
                this.fees = model.fees;
                this.fines = model.fines;
                this.foreignersTag = model.foreignersTag;
                this.fuPointFee = model.fuPointFee;
                this.hotelName = model.hotelName;
                this.index = model.index;
                this.invoiceTitle = model.invoiceTitle;
                this.isEarlyDeparture = model.isEarlyDeparture;
                this.isNegotiation = model.isNegotiation;
                this.isShareStr = model.isShareStr;
                this.location = model.location;
                this.mappingCompanyCode = model.mappingCompanyCode;
                this.nights = model.nights;
                this.orderId = model.orderId;
                this.orderPrice = model.orderPrice;
                this.orderStatusDesc = model.orderStatusDesc;
                this.orderType = model.orderType;
                this.overApplyId = model.overApplyId;
                this.paymentDepartmentId = model.paymentDepartmentId;
                this.paymentDepartmentName = model.paymentDepartmentName;
                this.personRefundFee = model.personRefundFee;
                this.personSettlePrice = model.personSettlePrice;
                this.position = model.position;
                this.positionLevel = model.positionLevel;
                this.primaryId = model.primaryId;
                this.processorOaCode = model.processorOaCode;
                this.projectCode = model.projectCode;
                this.projectName = model.projectName;
                this.promotionFee = model.promotionFee;
                this.remark = model.remark;
                this.reserveRule = model.reserveRule;
                this.roomNo = model.roomNo;
                this.roomNumber = model.roomNumber;
                this.roomPrice = model.roomPrice;
                this.roomType = model.roomType;
                this.serviceFee = model.serviceFee;
                this.settleTypeDesc = model.settleTypeDesc;
                this.settlementFee = model.settlementFee;
                this.settlementGrantFee = model.settlementGrantFee;
                this.settlementTime = model.settlementTime;
                this.settlementType = model.settlementType;
                this.sio = model.sio;
                this.star = model.star;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.subOrderId = model.subOrderId;
                this.taxRate = model.taxRate;
                this.thirdInvoiceId = model.thirdInvoiceId;
                this.thirdItineraryId = model.thirdItineraryId;
                this.totalNights = model.totalNights;
                this.tradeActionDesc = model.tradeActionDesc;
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
             * adjust_time.
             */
            public Builder adjustTime(String adjustTime) {
                this.adjustTime = adjustTime;
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
             * average_nights.
             */
            public Builder averageNights(Double averageNights) {
                this.averageNights = averageNights;
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
             * cost_department.
             */
            public Builder costDepartment(String costDepartment) {
                this.costDepartment = costDepartment;
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
             * foreigners_tag.
             */
            public Builder foreignersTag(String foreignersTag) {
                this.foreignersTag = foreignersTag;
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
     * {@link CooperatorHotelBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CooperatorHotelBillSettlementQueryResponseBody</p>
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
