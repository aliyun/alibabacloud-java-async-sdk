// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>HotelBillSettlementQueryResponseBody</p>
 */
public class HotelBillSettlementQueryResponseBody extends TeaModel {
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

        public HotelBillSettlementQueryResponseBody build() {
            return new HotelBillSettlementQueryResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @NameInMap("alipay_trade_no")
        private String alipayTradeNo;

        @NameInMap("apply_extend_field")
        private String applyExtendField;

        @NameInMap("apply_id")
        private String applyId;

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

        @NameInMap("capital_direction")
        private String capitalDirection;

        @NameInMap("cascade_department")
        private String cascadeDepartment;

        @NameInMap("check_in_date")
        private String checkInDate;

        @NameInMap("checkout_date")
        private String checkoutDate;

        @NameInMap("city")
        private String city;

        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("corp_refund_fee")
        private Double corpRefundFee;

        @NameInMap("corp_total_fee")
        private Double corpTotalFee;

        @NameInMap("cost_center")
        private String costCenter;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("department")
        private String department;

        @NameInMap("department_id")
        private String departmentId;

        @NameInMap("fee_type")
        private String feeType;

        @NameInMap("fees")
        private Double fees;

        @NameInMap("fu_point_fee")
        private Double fuPointFee;

        @NameInMap("hotel_name")
        private String hotelName;

        @NameInMap("index")
        private String index;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("is_negotiation")
        private String isNegotiation;

        @NameInMap("is_share_str")
        private String isShareStr;

        @NameInMap("nights")
        private Integer nights;

        @NameInMap("order_id")
        private String orderId;

        @NameInMap("order_price")
        private Double orderPrice;

        @NameInMap("order_type")
        private String orderType;

        @NameInMap("over_apply_id")
        private String overApplyId;

        @NameInMap("person_refund_fee")
        private Double personRefundFee;

        @NameInMap("person_settle_price")
        private Double personSettlePrice;

        @NameInMap("primary_id")
        private Long primaryId;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_name")
        private String projectName;

        @NameInMap("promotion_fee")
        private Double promotionFee;

        @NameInMap("remark")
        private String remark;

        @NameInMap("room_number")
        private Integer roomNumber;

        @NameInMap("room_price")
        private Double roomPrice;

        @NameInMap("room_type")
        private String roomType;

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

        @NameInMap("total_nights")
        private Integer totalNights;

        @NameInMap("traveler_id")
        private String travelerId;

        @NameInMap("traveler_job_no")
        private String travelerJobNo;

        @NameInMap("traveler_name")
        private String travelerName;

        @NameInMap("voucher_type")
        private Integer voucherType;

        private DataList(Builder builder) {
            this.alipayTradeNo = builder.alipayTradeNo;
            this.applyExtendField = builder.applyExtendField;
            this.applyId = builder.applyId;
            this.billRecordTime = builder.billRecordTime;
            this.bookTime = builder.bookTime;
            this.bookerId = builder.bookerId;
            this.bookerJobNo = builder.bookerJobNo;
            this.bookerName = builder.bookerName;
            this.capitalDirection = builder.capitalDirection;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.checkInDate = builder.checkInDate;
            this.checkoutDate = builder.checkoutDate;
            this.city = builder.city;
            this.cityCode = builder.cityCode;
            this.corpRefundFee = builder.corpRefundFee;
            this.corpTotalFee = builder.corpTotalFee;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.feeType = builder.feeType;
            this.fees = builder.fees;
            this.fuPointFee = builder.fuPointFee;
            this.hotelName = builder.hotelName;
            this.index = builder.index;
            this.invoiceTitle = builder.invoiceTitle;
            this.isNegotiation = builder.isNegotiation;
            this.isShareStr = builder.isShareStr;
            this.nights = builder.nights;
            this.orderId = builder.orderId;
            this.orderPrice = builder.orderPrice;
            this.orderType = builder.orderType;
            this.overApplyId = builder.overApplyId;
            this.personRefundFee = builder.personRefundFee;
            this.personSettlePrice = builder.personSettlePrice;
            this.primaryId = builder.primaryId;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.promotionFee = builder.promotionFee;
            this.remark = builder.remark;
            this.roomNumber = builder.roomNumber;
            this.roomPrice = builder.roomPrice;
            this.roomType = builder.roomType;
            this.serviceFee = builder.serviceFee;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.status = builder.status;
            this.taxRate = builder.taxRate;
            this.totalNights = builder.totalNights;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerName = builder.travelerName;
            this.voucherType = builder.voucherType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return alipayTradeNo
         */
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
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
            private String applyExtendField; 
            private String applyId; 
            private String billRecordTime; 
            private String bookTime; 
            private String bookerId; 
            private String bookerJobNo; 
            private String bookerName; 
            private String capitalDirection; 
            private String cascadeDepartment; 
            private String checkInDate; 
            private String checkoutDate; 
            private String city; 
            private String cityCode; 
            private Double corpRefundFee; 
            private Double corpTotalFee; 
            private String costCenter; 
            private String costCenterNumber; 
            private String department; 
            private String departmentId; 
            private String feeType; 
            private Double fees; 
            private Double fuPointFee; 
            private String hotelName; 
            private String index; 
            private String invoiceTitle; 
            private String isNegotiation; 
            private String isShareStr; 
            private Integer nights; 
            private String orderId; 
            private Double orderPrice; 
            private String orderType; 
            private String overApplyId; 
            private Double personRefundFee; 
            private Double personSettlePrice; 
            private Long primaryId; 
            private String projectCode; 
            private String projectName; 
            private Double promotionFee; 
            private String remark; 
            private Integer roomNumber; 
            private Double roomPrice; 
            private String roomType; 
            private Double serviceFee; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private Integer status; 
            private String taxRate; 
            private Integer totalNights; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerName; 
            private Integer voucherType; 

            /**
             * 交易流水号
             */
            public Builder alipayTradeNo(String alipayTradeNo) {
                this.alipayTradeNo = alipayTradeNo;
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
             * 审批单号
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * 入账时间
             */
            public Builder billRecordTime(String billRecordTime) {
                this.billRecordTime = billRecordTime;
                return this;
            }

            /**
             * 预定时间
             */
            public Builder bookTime(String bookTime) {
                this.bookTime = bookTime;
                return this;
            }

            /**
             * 预定人id
             */
            public Builder bookerId(String bookerId) {
                this.bookerId = bookerId;
                return this;
            }

            /**
             * 预订人工号
             */
            public Builder bookerJobNo(String bookerJobNo) {
                this.bookerJobNo = bookerJobNo;
                return this;
            }

            /**
             * 预定人姓名
             */
            public Builder bookerName(String bookerName) {
                this.bookerName = bookerName;
                return this;
            }

            /**
             * 资金方向
             */
            public Builder capitalDirection(String capitalDirection) {
                this.capitalDirection = capitalDirection;
                return this;
            }

            /**
             * 联级部门
             */
            public Builder cascadeDepartment(String cascadeDepartment) {
                this.cascadeDepartment = cascadeDepartment;
                return this;
            }

            /**
             * 入住时间
             */
            public Builder checkInDate(String checkInDate) {
                this.checkInDate = checkInDate;
                return this;
            }

            /**
             * 离店时间
             */
            public Builder checkoutDate(String checkoutDate) {
                this.checkoutDate = checkoutDate;
                return this;
            }

            /**
             * 入住城市
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * 城市编号	新字段，khipu已落库
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * 企业退款
             */
            public Builder corpRefundFee(Double corpRefundFee) {
                this.corpRefundFee = corpRefundFee;
                return this;
            }

            /**
             * 企业支付合计
             */
            public Builder corpTotalFee(Double corpTotalFee) {
                this.corpTotalFee = corpTotalFee;
                return this;
            }

            /**
             * 成本中心名称
             */
            public Builder costCenter(String costCenter) {
                this.costCenter = costCenter;
                return this;
            }

            /**
             * 成本中心编号
             */
            public Builder costCenterNumber(String costCenterNumber) {
                this.costCenterNumber = costCenterNumber;
                return this;
            }

            /**
             * 末级部门
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * 部门编号
             */
            public Builder departmentId(String departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * 费用类型
             */
            public Builder feeType(String feeType) {
                this.feeType = feeType;
                return this;
            }

            /**
             * 杂费
             */
            public Builder fees(Double fees) {
                this.fees = fees;
                return this;
            }

            /**
             * 福豆支付	新字段，khipu链路缺失，先不开放
             */
            public Builder fuPointFee(Double fuPointFee) {
                this.fuPointFee = fuPointFee;
                return this;
            }

            /**
             * 酒店名称
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * 序号
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * 发票抬头
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * 是否协议价	新字段，供应链接口无返回
             */
            public Builder isNegotiation(String isNegotiation) {
                this.isNegotiation = isNegotiation;
                return this;
            }

            /**
             * 是否合住
             */
            public Builder isShareStr(String isShareStr) {
                this.isShareStr = isShareStr;
                return this;
            }

            /**
             * 入住天数
             */
            public Builder nights(Integer nights) {
                this.nights = nights;
                return this;
            }

            /**
             * 订单id、福豆发放订单号
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * 订单金额
             */
            public Builder orderPrice(Double orderPrice) {
                this.orderPrice = orderPrice;
                return this;
            }

            /**
             * 订单类型
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * 超标审批单号
             */
            public Builder overApplyId(String overApplyId) {
                this.overApplyId = overApplyId;
                return this;
            }

            /**
             * 个人退款
             */
            public Builder personRefundFee(Double personRefundFee) {
                this.personRefundFee = personRefundFee;
                return this;
            }

            /**
             * 个人支付超标及杂费
             */
            public Builder personSettlePrice(Double personSettlePrice) {
                this.personSettlePrice = personSettlePrice;
                return this;
            }

            /**
             * 主键id
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * 项目编码
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * 项目名称
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * 优惠券
             */
            public Builder promotionFee(Double promotionFee) {
                this.promotionFee = promotionFee;
                return this;
            }

            /**
             * 备注
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * 房间数	新字段，khipu已落库
             */
            public Builder roomNumber(Integer roomNumber) {
                this.roomNumber = roomNumber;
                return this;
            }

            /**
             * 房价
             */
            public Builder roomPrice(Double roomPrice) {
                this.roomPrice = roomPrice;
                return this;
            }

            /**
             * 房型
             */
            public Builder roomType(String roomType) {
                this.roomType = roomType;
                return this;
            }

            /**
             * 服务费
             */
            public Builder serviceFee(Double serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * 结算金额
             */
            public Builder settlementFee(Double settlementFee) {
                this.settlementFee = settlementFee;
                return this;
            }

            /**
             * 结算金额--赠送部分
             */
            public Builder settlementGrantFee(Double settlementGrantFee) {
                this.settlementGrantFee = settlementGrantFee;
                return this;
            }

            /**
             * 结算时间
             */
            public Builder settlementTime(String settlementTime) {
                this.settlementTime = settlementTime;
                return this;
            }

            /**
             * 结算类型
             */
            public Builder settlementType(String settlementType) {
                this.settlementType = settlementType;
                return this;
            }

            /**
             * 入账状态
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
             * 总间夜数	新字段，供应链接口无返回
             */
            public Builder totalNights(Integer totalNights) {
                this.totalNights = totalNights;
                return this;
            }

            /**
             * 出行人userId
             */
            public Builder travelerId(String travelerId) {
                this.travelerId = travelerId;
                return this;
            }

            /**
             * 出行人工号
             */
            public Builder travelerJobNo(String travelerJobNo) {
                this.travelerJobNo = travelerJobNo;
                return this;
            }

            /**
             * 出行人名称
             */
            public Builder travelerName(String travelerName) {
                this.travelerName = travelerName;
                return this;
            }

            /**
             * 票据类型
             */
            public Builder voucherType(Integer voucherType) {
                this.voucherType = voucherType;
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
             * 类目
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * 企业id
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * 数据集合
             */
            public Builder dataList(java.util.List < DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * 记账日期止 yyyy-MM-dd
             */
            public Builder periodEnd(String periodEnd) {
                this.periodEnd = periodEnd;
                return this;
            }

            /**
             * 记账日期起 yyyy-MM-dd
             */
            public Builder periodStart(String periodStart) {
                this.periodStart = periodStart;
                return this;
            }

            /**
             * 总数量
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
