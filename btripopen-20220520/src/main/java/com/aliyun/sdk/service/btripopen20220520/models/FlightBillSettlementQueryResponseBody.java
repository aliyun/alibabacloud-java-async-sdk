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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("module")
    private Module module;

    @NameInMap("result_code")
    private Integer resultCode;

    @NameInMap("result_msg")
    private String resultMsg;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private FlightBillSettlementQueryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.module = builder.module;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return resultCode
     */
    public Integer getResultCode() {
        return this.resultCode;
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
        private String requestId; 
        private Module module; 
        private Integer resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * result_code.
         */
        public Builder resultCode(Integer resultCode) {
            this.resultCode = resultCode;
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

        @NameInMap("apply_id")
        private String applyId;

        @NameInMap("arr_airport_code")
        private String arrAirportCode;

        @NameInMap("arr_city")
        private String arrCity;

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

        @NameInMap("corp_pay_order_fee")
        private Double corpPayOrderFee;

        @NameInMap("cost_center")
        private String costCenter;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("coupon")
        private Double coupon;

        @NameInMap("dep_airport_code")
        private String depAirportCode;

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

        @NameInMap("fee_type")
        private String feeType;

        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("index")
        private String index;

        @NameInMap("insurance_fee")
        private Double insuranceFee;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("itinerary_num")
        private String itineraryNum;

        @NameInMap("itinerary_price")
        private Double itineraryPrice;

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

        @NameInMap("primary_id")
        private Long primaryId;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_name")
        private String projectName;

        @NameInMap("refund_fee")
        private Double refundFee;

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

        @NameInMap("ticket_id")
        private String ticketId;

        @NameInMap("traveler_id")
        private String travelerId;

        @NameInMap("traveler_job_no")
        private String travelerJobNo;

        @NameInMap("traveler_name")
        private String travelerName;

        @NameInMap("upgrade_cost")
        private Double upgradeCost;

        @NameInMap("voucher_type")
        private Integer voucherType;

        private DataList(Builder builder) {
            this.advanceDay = builder.advanceDay;
            this.airlineCorpCode = builder.airlineCorpCode;
            this.airlineCorpName = builder.airlineCorpName;
            this.alipayTradeNo = builder.alipayTradeNo;
            this.applyId = builder.applyId;
            this.arrAirportCode = builder.arrAirportCode;
            this.arrCity = builder.arrCity;
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
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.capitalDirection = builder.capitalDirection;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.changeFee = builder.changeFee;
            this.corpPayOrderFee = builder.corpPayOrderFee;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.coupon = builder.coupon;
            this.depAirportCode = builder.depAirportCode;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.deptCity = builder.deptCity;
            this.deptDate = builder.deptDate;
            this.deptStation = builder.deptStation;
            this.deptTime = builder.deptTime;
            this.discount = builder.discount;
            this.feeType = builder.feeType;
            this.flightNo = builder.flightNo;
            this.index = builder.index;
            this.insuranceFee = builder.insuranceFee;
            this.invoiceTitle = builder.invoiceTitle;
            this.itineraryNum = builder.itineraryNum;
            this.itineraryPrice = builder.itineraryPrice;
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
            this.primaryId = builder.primaryId;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.refundFee = builder.refundFee;
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
            this.ticketId = builder.ticketId;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerName = builder.travelerName;
            this.upgradeCost = builder.upgradeCost;
            this.voucherType = builder.voucherType;
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
         * @return insuranceFee
         */
        public Double getInsuranceFee() {
            return this.insuranceFee;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
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
         * @return ticketId
         */
        public String getTicketId() {
            return this.ticketId;
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

        public static final class Builder {
            private Integer advanceDay; 
            private String airlineCorpCode; 
            private String airlineCorpName; 
            private String alipayTradeNo; 
            private String applyId; 
            private String arrAirportCode; 
            private String arrCity; 
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
            private String cabin; 
            private String cabinClass; 
            private String capitalDirection; 
            private String cascadeDepartment; 
            private Double changeFee; 
            private Double corpPayOrderFee; 
            private String costCenter; 
            private String costCenterNumber; 
            private Double coupon; 
            private String depAirportCode; 
            private String department; 
            private String departmentId; 
            private String deptCity; 
            private String deptDate; 
            private String deptStation; 
            private String deptTime; 
            private String discount; 
            private String feeType; 
            private String flightNo; 
            private String index; 
            private Double insuranceFee; 
            private String invoiceTitle; 
            private String itineraryNum; 
            private Double itineraryPrice; 
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
            private Long primaryId; 
            private String projectCode; 
            private String projectName; 
            private Double refundFee; 
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
            private String ticketId; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerName; 
            private Double upgradeCost; 
            private Integer voucherType; 

            /**
             * 提前预定天数
             */
            public Builder advanceDay(Integer advanceDay) {
                this.advanceDay = advanceDay;
                return this;
            }

            /**
             * 航司二字码	新字段，khipu已落库
             */
            public Builder airlineCorpCode(String airlineCorpCode) {
                this.airlineCorpCode = airlineCorpCode;
                return this;
            }

            /**
             * 航司名称
             */
            public Builder airlineCorpName(String airlineCorpName) {
                this.airlineCorpName = airlineCorpName;
                return this;
            }

            /**
             * 交易流水号
             */
            public Builder alipayTradeNo(String alipayTradeNo) {
                this.alipayTradeNo = alipayTradeNo;
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
             * 到达机场三字码	新字段，供应链hsf接口有返回
             */
            public Builder arrAirportCode(String arrAirportCode) {
                this.arrAirportCode = arrAirportCode;
                return this;
            }

            /**
             * 到达城市
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
                return this;
            }

            /**
             * 到达日期
             */
            public Builder arrDate(String arrDate) {
                this.arrDate = arrDate;
                return this;
            }

            /**
             * 到达机场名称
             */
            public Builder arrStation(String arrStation) {
                this.arrStation = arrStation;
                return this;
            }

            /**
             * 到达时间
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
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
             * 商旅价优惠金额
             */
            public Builder btripCouponFee(Double btripCouponFee) {
                this.btripCouponFee = btripCouponFee;
                return this;
            }

            /**
             * 基建费
             */
            public Builder buildFee(Double buildFee) {
                this.buildFee = buildFee;
                return this;
            }

            /**
             * 舱位代码
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * 舱位等级
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
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
             * 改签费
             */
            public Builder changeFee(Double changeFee) {
                this.changeFee = changeFee;
                return this;
            }

            /**
             * 订单金额
             */
            public Builder corpPayOrderFee(Double corpPayOrderFee) {
                this.corpPayOrderFee = corpPayOrderFee;
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
             * 优惠券
             */
            public Builder coupon(Double coupon) {
                this.coupon = coupon;
                return this;
            }

            /**
             * 起飞机场三字码	新字段，供应链hsf接口有返回
             */
            public Builder depAirportCode(String depAirportCode) {
                this.depAirportCode = depAirportCode;
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
             * 起飞城市
             */
            public Builder deptCity(String deptCity) {
                this.deptCity = deptCity;
                return this;
            }

            /**
             * 起飞日期
             */
            public Builder deptDate(String deptDate) {
                this.deptDate = deptDate;
                return this;
            }

            /**
             * 起飞机场名称
             */
            public Builder deptStation(String deptStation) {
                this.deptStation = deptStation;
                return this;
            }

            /**
             * 起飞时间
             */
            public Builder deptTime(String deptTime) {
                this.deptTime = deptTime;
                return this;
            }

            /**
             * 折扣率
             */
            public Builder discount(String discount) {
                this.discount = discount;
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
             * 航班号
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
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
             * 保险费
             */
            public Builder insuranceFee(Double insuranceFee) {
                this.insuranceFee = insuranceFee;
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
             * 行程单号
             */
            public Builder itineraryNum(String itineraryNum) {
                this.itineraryNum = itineraryNum;
                return this;
            }

            /**
             * 行程单金额
             */
            public Builder itineraryPrice(Double itineraryPrice) {
                this.itineraryPrice = itineraryPrice;
                return this;
            }

            /**
             * 低价提醒（起飞时间）
             */
            public Builder mostDifferenceDeptTime(String mostDifferenceDeptTime) {
                this.mostDifferenceDeptTime = mostDifferenceDeptTime;
                return this;
            }

            /**
             * 低价提醒（折扣）
             */
            public Builder mostDifferenceDiscount(String mostDifferenceDiscount) {
                this.mostDifferenceDiscount = mostDifferenceDiscount;
                return this;
            }

            /**
             * 低价提醒(航班号)
             */
            public Builder mostDifferenceFlightNo(String mostDifferenceFlightNo) {
                this.mostDifferenceFlightNo = mostDifferenceFlightNo;
                return this;
            }

            /**
             * 低价提醒(与最低价差额)
             */
            public Builder mostDifferencePrice(Double mostDifferencePrice) {
                this.mostDifferencePrice = mostDifferencePrice;
                return this;
            }

            /**
             * 不选低价原因
             */
            public Builder mostDifferenceReason(String mostDifferenceReason) {
                this.mostDifferenceReason = mostDifferenceReason;
                return this;
            }

            /**
             * 低价航班价格	新字段，反算，暂不开放
             */
            public Builder mostPrice(Double mostPrice) {
                this.mostPrice = mostPrice;
                return this;
            }

            /**
             * 协议价优惠金额
             */
            public Builder negotiationCouponFee(Double negotiationCouponFee) {
                this.negotiationCouponFee = negotiationCouponFee;
                return this;
            }

            /**
             * 燃油费
             */
            public Builder oilFee(Double oilFee) {
                this.oilFee = oilFee;
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
             * 超标审批单号
             */
            public Builder overApplyId(String overApplyId) {
                this.overApplyId = overApplyId;
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
             * 退票手续费
             */
            public Builder refundFee(Double refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * 改签退票手续费
             */
            public Builder refundUpgradeCost(Double refundUpgradeCost) {
                this.refundUpgradeCost = refundUpgradeCost;
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
             * 是否重复退
             */
            public Builder repeatRefund(String repeatRefund) {
                this.repeatRefund = repeatRefund;
                return this;
            }

            /**
             * 销售价
             */
            public Builder sealPrice(Double sealPrice) {
                this.sealPrice = sealPrice;
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
             * 票号
             */
            public Builder ticketId(String ticketId) {
                this.ticketId = ticketId;
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
             * 改签差价
             */
            public Builder upgradeCost(Double upgradeCost) {
                this.upgradeCost = upgradeCost;
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
