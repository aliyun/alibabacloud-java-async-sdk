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
 * {@link MealBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>MealBillSettlementQueryResponseBody</p>
 */
public class MealBillSettlementQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

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

    private MealBillSettlementQueryResponseBody(Builder builder) {
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

    public static MealBillSettlementQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(MealBillSettlementQueryResponseBody model) {
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
        public Builder code(Integer code) {
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

        public MealBillSettlementQueryResponseBody build() {
            return new MealBillSettlementQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MealBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>MealBillSettlementQueryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adjust_time")
        private String adjustTime;

        @com.aliyun.core.annotation.NameInMap("apply_extend_field")
        private String applyExtendField;

        @com.aliyun.core.annotation.NameInMap("apply_id")
        private String applyId;

        @com.aliyun.core.annotation.NameInMap("bill_record_time")
        private String billRecordTime;

        @com.aliyun.core.annotation.NameInMap("book_time")
        private String bookTime;

        @com.aliyun.core.annotation.NameInMap("booker_id")
        private String bookerId;

        @com.aliyun.core.annotation.NameInMap("booker_job_no")
        private String bookerJobNo;

        @com.aliyun.core.annotation.NameInMap("booker_name")
        private String bookerName;

        @com.aliyun.core.annotation.NameInMap("capital_direction")
        private String capitalDirection;

        @com.aliyun.core.annotation.NameInMap("cascade_department")
        private String cascadeDepartment;

        @com.aliyun.core.annotation.NameInMap("category_desc")
        private String categoryDesc;

        @com.aliyun.core.annotation.NameInMap("consume_report_address")
        private String consumeReportAddress;

        @com.aliyun.core.annotation.NameInMap("consume_report_city")
        private String consumeReportCity;

        @com.aliyun.core.annotation.NameInMap("consume_report_city_code")
        private String consumeReportCityCode;

        @com.aliyun.core.annotation.NameInMap("consumer_scene")
        private String consumerScene;

        @com.aliyun.core.annotation.NameInMap("corp_settle_fee")
        private Double corpSettleFee;

        @com.aliyun.core.annotation.NameInMap("cost_center")
        private String costCenter;

        @com.aliyun.core.annotation.NameInMap("cost_center_number")
        private String costCenterNumber;

        @com.aliyun.core.annotation.NameInMap("cost_department")
        private String costDepartment;

        @com.aliyun.core.annotation.NameInMap("department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("department_id")
        private String departmentId;

        @com.aliyun.core.annotation.NameInMap("fee_type")
        private String feeType;

        @com.aliyun.core.annotation.NameInMap("fee_type_desc")
        private String feeTypeDesc;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("main_apply_id")
        private String mainApplyId;

        @com.aliyun.core.annotation.NameInMap("mapping_company_code")
        private String mappingCompanyCode;

        @com.aliyun.core.annotation.NameInMap("meal_address")
        private String mealAddress;

        @com.aliyun.core.annotation.NameInMap("meal_city")
        private String mealCity;

        @com.aliyun.core.annotation.NameInMap("meal_city_code")
        private String mealCityCode;

        @com.aliyun.core.annotation.NameInMap("meal_reason")
        private String mealReason;

        @com.aliyun.core.annotation.NameInMap("meal_rule")
        private String mealRule;

        @com.aliyun.core.annotation.NameInMap("meal_scene")
        private String mealScene;

        @com.aliyun.core.annotation.NameInMap("merchant_category")
        private String merchantCategory;

        @com.aliyun.core.annotation.NameInMap("merchant_name")
        private String merchantName;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("order_price")
        private Double orderPrice;

        @com.aliyun.core.annotation.NameInMap("order_status_desc")
        private String orderStatusDesc;

        @com.aliyun.core.annotation.NameInMap("person_settle_price")
        private Double personSettlePrice;

        @com.aliyun.core.annotation.NameInMap("primary_id")
        private Long primaryId;

        @com.aliyun.core.annotation.NameInMap("processor_oa_code")
        private String processorOaCode;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_name")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("service_fee")
        private Double serviceFee;

        @com.aliyun.core.annotation.NameInMap("settle_type_desc")
        private String settleTypeDesc;

        @com.aliyun.core.annotation.NameInMap("settlement_fee")
        private Double settlementFee;

        @com.aliyun.core.annotation.NameInMap("settlement_time")
        private String settlementTime;

        @com.aliyun.core.annotation.NameInMap("settlement_type")
        private String settlementType;

        @com.aliyun.core.annotation.NameInMap("share_dinner")
        private String shareDinner;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("status_desc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("store_address")
        private String storeAddress;

        @com.aliyun.core.annotation.NameInMap("tax_rate")
        private String taxRate;

        @com.aliyun.core.annotation.NameInMap("third_invoice_id")
        private String thirdInvoiceId;

        @com.aliyun.core.annotation.NameInMap("third_part_business_id")
        private String thirdPartBusinessId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

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

        @com.aliyun.core.annotation.NameInMap("voucher_type")
        private Integer voucherType;

        @com.aliyun.core.annotation.NameInMap("voucher_type_desc")
        private String voucherTypeDesc;

        private Items(Builder builder) {
            this.adjustTime = builder.adjustTime;
            this.applyExtendField = builder.applyExtendField;
            this.applyId = builder.applyId;
            this.billRecordTime = builder.billRecordTime;
            this.bookTime = builder.bookTime;
            this.bookerId = builder.bookerId;
            this.bookerJobNo = builder.bookerJobNo;
            this.bookerName = builder.bookerName;
            this.capitalDirection = builder.capitalDirection;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.categoryDesc = builder.categoryDesc;
            this.consumeReportAddress = builder.consumeReportAddress;
            this.consumeReportCity = builder.consumeReportCity;
            this.consumeReportCityCode = builder.consumeReportCityCode;
            this.consumerScene = builder.consumerScene;
            this.corpSettleFee = builder.corpSettleFee;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.costDepartment = builder.costDepartment;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.feeType = builder.feeType;
            this.feeTypeDesc = builder.feeTypeDesc;
            this.index = builder.index;
            this.invoiceTitle = builder.invoiceTitle;
            this.mainApplyId = builder.mainApplyId;
            this.mappingCompanyCode = builder.mappingCompanyCode;
            this.mealAddress = builder.mealAddress;
            this.mealCity = builder.mealCity;
            this.mealCityCode = builder.mealCityCode;
            this.mealReason = builder.mealReason;
            this.mealRule = builder.mealRule;
            this.mealScene = builder.mealScene;
            this.merchantCategory = builder.merchantCategory;
            this.merchantName = builder.merchantName;
            this.orderId = builder.orderId;
            this.orderPrice = builder.orderPrice;
            this.orderStatusDesc = builder.orderStatusDesc;
            this.personSettlePrice = builder.personSettlePrice;
            this.primaryId = builder.primaryId;
            this.processorOaCode = builder.processorOaCode;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.remark = builder.remark;
            this.serviceFee = builder.serviceFee;
            this.settleTypeDesc = builder.settleTypeDesc;
            this.settlementFee = builder.settlementFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.shareDinner = builder.shareDinner;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.storeAddress = builder.storeAddress;
            this.taxRate = builder.taxRate;
            this.thirdInvoiceId = builder.thirdInvoiceId;
            this.thirdPartBusinessId = builder.thirdPartBusinessId;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.tradeActionDesc = builder.tradeActionDesc;
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
         * @return categoryDesc
         */
        public String getCategoryDesc() {
            return this.categoryDesc;
        }

        /**
         * @return consumeReportAddress
         */
        public String getConsumeReportAddress() {
            return this.consumeReportAddress;
        }

        /**
         * @return consumeReportCity
         */
        public String getConsumeReportCity() {
            return this.consumeReportCity;
        }

        /**
         * @return consumeReportCityCode
         */
        public String getConsumeReportCityCode() {
            return this.consumeReportCityCode;
        }

        /**
         * @return consumerScene
         */
        public String getConsumerScene() {
            return this.consumerScene;
        }

        /**
         * @return corpSettleFee
         */
        public Double getCorpSettleFee() {
            return this.corpSettleFee;
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
         * @return feeTypeDesc
         */
        public String getFeeTypeDesc() {
            return this.feeTypeDesc;
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
         * @return mealAddress
         */
        public String getMealAddress() {
            return this.mealAddress;
        }

        /**
         * @return mealCity
         */
        public String getMealCity() {
            return this.mealCity;
        }

        /**
         * @return mealCityCode
         */
        public String getMealCityCode() {
            return this.mealCityCode;
        }

        /**
         * @return mealReason
         */
        public String getMealReason() {
            return this.mealReason;
        }

        /**
         * @return mealRule
         */
        public String getMealRule() {
            return this.mealRule;
        }

        /**
         * @return mealScene
         */
        public String getMealScene() {
            return this.mealScene;
        }

        /**
         * @return merchantCategory
         */
        public String getMerchantCategory() {
            return this.merchantCategory;
        }

        /**
         * @return merchantName
         */
        public String getMerchantName() {
            return this.merchantName;
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
         * @return shareDinner
         */
        public String getShareDinner() {
            return this.shareDinner;
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
         * @return storeAddress
         */
        public String getStoreAddress() {
            return this.storeAddress;
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
            private String applyExtendField; 
            private String applyId; 
            private String billRecordTime; 
            private String bookTime; 
            private String bookerId; 
            private String bookerJobNo; 
            private String bookerName; 
            private String capitalDirection; 
            private String cascadeDepartment; 
            private String categoryDesc; 
            private String consumeReportAddress; 
            private String consumeReportCity; 
            private String consumeReportCityCode; 
            private String consumerScene; 
            private Double corpSettleFee; 
            private String costCenter; 
            private String costCenterNumber; 
            private String costDepartment; 
            private String department; 
            private String departmentId; 
            private String feeType; 
            private String feeTypeDesc; 
            private String index; 
            private String invoiceTitle; 
            private String mainApplyId; 
            private String mappingCompanyCode; 
            private String mealAddress; 
            private String mealCity; 
            private String mealCityCode; 
            private String mealReason; 
            private String mealRule; 
            private String mealScene; 
            private String merchantCategory; 
            private String merchantName; 
            private String orderId; 
            private Double orderPrice; 
            private String orderStatusDesc; 
            private Double personSettlePrice; 
            private Long primaryId; 
            private String processorOaCode; 
            private String projectCode; 
            private String projectName; 
            private String remark; 
            private Double serviceFee; 
            private String settleTypeDesc; 
            private Double settlementFee; 
            private String settlementTime; 
            private String settlementType; 
            private String shareDinner; 
            private Integer status; 
            private String statusDesc; 
            private String storeAddress; 
            private String taxRate; 
            private String thirdInvoiceId; 
            private String thirdPartBusinessId; 
            private String thirdpartApplyId; 
            private String tradeActionDesc; 
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
                this.applyExtendField = model.applyExtendField;
                this.applyId = model.applyId;
                this.billRecordTime = model.billRecordTime;
                this.bookTime = model.bookTime;
                this.bookerId = model.bookerId;
                this.bookerJobNo = model.bookerJobNo;
                this.bookerName = model.bookerName;
                this.capitalDirection = model.capitalDirection;
                this.cascadeDepartment = model.cascadeDepartment;
                this.categoryDesc = model.categoryDesc;
                this.consumeReportAddress = model.consumeReportAddress;
                this.consumeReportCity = model.consumeReportCity;
                this.consumeReportCityCode = model.consumeReportCityCode;
                this.consumerScene = model.consumerScene;
                this.corpSettleFee = model.corpSettleFee;
                this.costCenter = model.costCenter;
                this.costCenterNumber = model.costCenterNumber;
                this.costDepartment = model.costDepartment;
                this.department = model.department;
                this.departmentId = model.departmentId;
                this.feeType = model.feeType;
                this.feeTypeDesc = model.feeTypeDesc;
                this.index = model.index;
                this.invoiceTitle = model.invoiceTitle;
                this.mainApplyId = model.mainApplyId;
                this.mappingCompanyCode = model.mappingCompanyCode;
                this.mealAddress = model.mealAddress;
                this.mealCity = model.mealCity;
                this.mealCityCode = model.mealCityCode;
                this.mealReason = model.mealReason;
                this.mealRule = model.mealRule;
                this.mealScene = model.mealScene;
                this.merchantCategory = model.merchantCategory;
                this.merchantName = model.merchantName;
                this.orderId = model.orderId;
                this.orderPrice = model.orderPrice;
                this.orderStatusDesc = model.orderStatusDesc;
                this.personSettlePrice = model.personSettlePrice;
                this.primaryId = model.primaryId;
                this.processorOaCode = model.processorOaCode;
                this.projectCode = model.projectCode;
                this.projectName = model.projectName;
                this.remark = model.remark;
                this.serviceFee = model.serviceFee;
                this.settleTypeDesc = model.settleTypeDesc;
                this.settlementFee = model.settlementFee;
                this.settlementTime = model.settlementTime;
                this.settlementType = model.settlementType;
                this.shareDinner = model.shareDinner;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.storeAddress = model.storeAddress;
                this.taxRate = model.taxRate;
                this.thirdInvoiceId = model.thirdInvoiceId;
                this.thirdPartBusinessId = model.thirdPartBusinessId;
                this.thirdpartApplyId = model.thirdpartApplyId;
                this.tradeActionDesc = model.tradeActionDesc;
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
             * consume_report_address.
             */
            public Builder consumeReportAddress(String consumeReportAddress) {
                this.consumeReportAddress = consumeReportAddress;
                return this;
            }

            /**
             * consume_report_city.
             */
            public Builder consumeReportCity(String consumeReportCity) {
                this.consumeReportCity = consumeReportCity;
                return this;
            }

            /**
             * consume_report_city_code.
             */
            public Builder consumeReportCityCode(String consumeReportCityCode) {
                this.consumeReportCityCode = consumeReportCityCode;
                return this;
            }

            /**
             * consumer_scene.
             */
            public Builder consumerScene(String consumerScene) {
                this.consumerScene = consumerScene;
                return this;
            }

            /**
             * corp_settle_fee.
             */
            public Builder corpSettleFee(Double corpSettleFee) {
                this.corpSettleFee = corpSettleFee;
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
             * meal_address.
             */
            public Builder mealAddress(String mealAddress) {
                this.mealAddress = mealAddress;
                return this;
            }

            /**
             * meal_city.
             */
            public Builder mealCity(String mealCity) {
                this.mealCity = mealCity;
                return this;
            }

            /**
             * meal_city_code.
             */
            public Builder mealCityCode(String mealCityCode) {
                this.mealCityCode = mealCityCode;
                return this;
            }

            /**
             * meal_reason.
             */
            public Builder mealReason(String mealReason) {
                this.mealReason = mealReason;
                return this;
            }

            /**
             * meal_rule.
             */
            public Builder mealRule(String mealRule) {
                this.mealRule = mealRule;
                return this;
            }

            /**
             * meal_scene.
             */
            public Builder mealScene(String mealScene) {
                this.mealScene = mealScene;
                return this;
            }

            /**
             * merchant_category.
             */
            public Builder merchantCategory(String merchantCategory) {
                this.merchantCategory = merchantCategory;
                return this;
            }

            /**
             * merchant_name.
             */
            public Builder merchantName(String merchantName) {
                this.merchantName = merchantName;
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
             * share_dinner.
             */
            public Builder shareDinner(String shareDinner) {
                this.shareDinner = shareDinner;
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
             * store_address.
             */
            public Builder storeAddress(String storeAddress) {
                this.storeAddress = storeAddress;
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
     * {@link MealBillSettlementQueryResponseBody} extends {@link TeaModel}
     *
     * <p>MealBillSettlementQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private Integer category;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("period_end")
        private String periodEnd;

        @com.aliyun.core.annotation.NameInMap("period_start")
        private String periodStart;

        @com.aliyun.core.annotation.NameInMap("scroll_id")
        private String scrollId;

        @com.aliyun.core.annotation.NameInMap("total_num")
        private Long totalNum;

        @com.aliyun.core.annotation.NameInMap("total_size")
        private Long totalSize;

        private Module(Builder builder) {
            this.category = builder.category;
            this.corpId = builder.corpId;
            this.items = builder.items;
            this.orderId = builder.orderId;
            this.periodEnd = builder.periodEnd;
            this.periodStart = builder.periodStart;
            this.scrollId = builder.scrollId;
            this.totalNum = builder.totalNum;
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
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
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
            private String orderId; 
            private String periodEnd; 
            private String periodStart; 
            private String scrollId; 
            private Long totalNum; 
            private Long totalSize; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.category = model.category;
                this.corpId = model.corpId;
                this.items = model.items;
                this.orderId = model.orderId;
                this.periodEnd = model.periodEnd;
                this.periodStart = model.periodStart;
                this.scrollId = model.scrollId;
                this.totalNum = model.totalNum;
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
             * order_id.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
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
