// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CarBillSettlementQueryResponseBody</p>
 */
public class CarBillSettlementQueryResponseBody extends TeaModel {
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

    private CarBillSettlementQueryResponseBody(Builder builder) {
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

    public static CarBillSettlementQueryResponseBody create() {
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

        public CarBillSettlementQueryResponseBody build() {
            return new CarBillSettlementQueryResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
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

        @NameInMap("arr_city")
        private String arrCity;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_date")
        private String arrDate;

        @NameInMap("arr_location")
        private String arrLocation;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("bill_record_time")
        private String billRecordTime;

        @NameInMap("book_model")
        private String bookModel;

        @NameInMap("book_time")
        private String bookTime;

        @NameInMap("booker_id")
        private String bookerId;

        @NameInMap("booker_job_no")
        private String bookerJobNo;

        @NameInMap("booker_name")
        private String bookerName;

        @NameInMap("business_category")
        private String businessCategory;

        @NameInMap("capital_direction")
        private String capitalDirection;

        @NameInMap("car_level")
        private String carLevel;

        @NameInMap("cascade_department")
        private String cascadeDepartment;

        @NameInMap("cost_center")
        private String costCenter;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("coupon")
        private Double coupon;

        @NameInMap("coupon_price")
        private Double couponPrice;

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

        @NameInMap("dept_location")
        private String deptLocation;

        @NameInMap("dept_time")
        private String deptTime;

        @NameInMap("estimate_drive_distance")
        private String estimateDriveDistance;

        @NameInMap("estimate_price")
        private Double estimatePrice;

        @NameInMap("fee_type")
        private String feeType;

        @NameInMap("index")
        private String index;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("memo")
        private String memo;

        @NameInMap("order_id")
        private String orderId;

        @NameInMap("order_price")
        private Double orderPrice;

        @NameInMap("over_apply_id")
        private String overApplyId;

        @NameInMap("person_settle_fee")
        private Double personSettleFee;

        @NameInMap("primary_id")
        private Long primaryId;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_name")
        private String projectName;

        @NameInMap("provider_name")
        private String providerName;

        @NameInMap("real_drive_distance")
        private String realDriveDistance;

        @NameInMap("real_from_addr")
        private String realFromAddr;

        @NameInMap("real_to_addr")
        private String realToAddr;

        @NameInMap("remark")
        private String remark;

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

        @NameInMap("special_order")
        private String specialOrder;

        @NameInMap("special_reason")
        private String specialReason;

        @NameInMap("status")
        private Integer status;

        @NameInMap("sub_order_id")
        private String subOrderId;

        @NameInMap("tax_rate")
        private String taxRate;

        @NameInMap("third_itinerary_id")
        private String thirdItineraryId;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("traveler_id")
        private String travelerId;

        @NameInMap("traveler_job_no")
        private String travelerJobNo;

        @NameInMap("traveler_name")
        private String travelerName;

        @NameInMap("user_confirm_desc")
        private String userConfirmDesc;

        @NameInMap("voucher_type")
        private Integer voucherType;

        private DataList(Builder builder) {
            this.alipayTradeNo = builder.alipayTradeNo;
            this.applyArrCityCode = builder.applyArrCityCode;
            this.applyArrCityName = builder.applyArrCityName;
            this.applyDepCityCode = builder.applyDepCityCode;
            this.applyDepCityName = builder.applyDepCityName;
            this.applyExtendField = builder.applyExtendField;
            this.applyId = builder.applyId;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrDate = builder.arrDate;
            this.arrLocation = builder.arrLocation;
            this.arrTime = builder.arrTime;
            this.billRecordTime = builder.billRecordTime;
            this.bookModel = builder.bookModel;
            this.bookTime = builder.bookTime;
            this.bookerId = builder.bookerId;
            this.bookerJobNo = builder.bookerJobNo;
            this.bookerName = builder.bookerName;
            this.businessCategory = builder.businessCategory;
            this.capitalDirection = builder.capitalDirection;
            this.carLevel = builder.carLevel;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.coupon = builder.coupon;
            this.couponPrice = builder.couponPrice;
            this.depCityCode = builder.depCityCode;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.deptCity = builder.deptCity;
            this.deptDate = builder.deptDate;
            this.deptLocation = builder.deptLocation;
            this.deptTime = builder.deptTime;
            this.estimateDriveDistance = builder.estimateDriveDistance;
            this.estimatePrice = builder.estimatePrice;
            this.feeType = builder.feeType;
            this.index = builder.index;
            this.invoiceTitle = builder.invoiceTitle;
            this.memo = builder.memo;
            this.orderId = builder.orderId;
            this.orderPrice = builder.orderPrice;
            this.overApplyId = builder.overApplyId;
            this.personSettleFee = builder.personSettleFee;
            this.primaryId = builder.primaryId;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.providerName = builder.providerName;
            this.realDriveDistance = builder.realDriveDistance;
            this.realFromAddr = builder.realFromAddr;
            this.realToAddr = builder.realToAddr;
            this.remark = builder.remark;
            this.serviceFee = builder.serviceFee;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.specialOrder = builder.specialOrder;
            this.specialReason = builder.specialReason;
            this.status = builder.status;
            this.subOrderId = builder.subOrderId;
            this.taxRate = builder.taxRate;
            this.thirdItineraryId = builder.thirdItineraryId;
            this.timeType = builder.timeType;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerName = builder.travelerName;
            this.userConfirmDesc = builder.userConfirmDesc;
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
         * @return arrLocation
         */
        public String getArrLocation() {
            return this.arrLocation;
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
         * @return couponPrice
         */
        public Double getCouponPrice() {
            return this.couponPrice;
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
         * @return deptLocation
         */
        public String getDeptLocation() {
            return this.deptLocation;
        }

        /**
         * @return deptTime
         */
        public String getDeptTime() {
            return this.deptTime;
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
         * @return overApplyId
         */
        public String getOverApplyId() {
            return this.overApplyId;
        }

        /**
         * @return personSettleFee
         */
        public Double getPersonSettleFee() {
            return this.personSettleFee;
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
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
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
         * @return remark
         */
        public String getRemark() {
            return this.remark;
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
         * @return thirdItineraryId
         */
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
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
         * @return userConfirmDesc
         */
        public String getUserConfirmDesc() {
            return this.userConfirmDesc;
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
            private String arrCity; 
            private String arrCityCode; 
            private String arrDate; 
            private String arrLocation; 
            private String arrTime; 
            private String billRecordTime; 
            private String bookModel; 
            private String bookTime; 
            private String bookerId; 
            private String bookerJobNo; 
            private String bookerName; 
            private String businessCategory; 
            private String capitalDirection; 
            private String carLevel; 
            private String cascadeDepartment; 
            private String costCenter; 
            private String costCenterNumber; 
            private Double coupon; 
            private Double couponPrice; 
            private String depCityCode; 
            private String department; 
            private String departmentId; 
            private String deptCity; 
            private String deptDate; 
            private String deptLocation; 
            private String deptTime; 
            private String estimateDriveDistance; 
            private Double estimatePrice; 
            private String feeType; 
            private String index; 
            private String invoiceTitle; 
            private String memo; 
            private String orderId; 
            private Double orderPrice; 
            private String overApplyId; 
            private Double personSettleFee; 
            private Long primaryId; 
            private String projectCode; 
            private String projectName; 
            private String providerName; 
            private String realDriveDistance; 
            private String realFromAddr; 
            private String realToAddr; 
            private String remark; 
            private Double serviceFee; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private String specialOrder; 
            private String specialReason; 
            private Integer status; 
            private String subOrderId; 
            private String taxRate; 
            private String thirdItineraryId; 
            private String timeType; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerName; 
            private String userConfirmDesc; 
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
             * arr_location.
             */
            public Builder arrLocation(String arrLocation) {
                this.arrLocation = arrLocation;
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
             * coupon_price.
             */
            public Builder couponPrice(Double couponPrice) {
                this.couponPrice = couponPrice;
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
             * dept_location.
             */
            public Builder deptLocation(String deptLocation) {
                this.deptLocation = deptLocation;
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
             * over_apply_id.
             */
            public Builder overApplyId(String overApplyId) {
                this.overApplyId = overApplyId;
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
             * provider_name.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
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
             * remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
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
             * sub_order_id.
             */
            public Builder subOrderId(String subOrderId) {
                this.subOrderId = subOrderId;
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
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
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
             * traveler_name.
             */
            public Builder travelerName(String travelerName) {
                this.travelerName = travelerName;
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
             * voucher_type.
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
