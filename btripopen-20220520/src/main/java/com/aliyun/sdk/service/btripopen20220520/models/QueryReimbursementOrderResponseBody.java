// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReimbursementOrderResponseBody} extends {@link TeaModel}
 *
 * <p>QueryReimbursementOrderResponseBody</p>
 */
public class QueryReimbursementOrderResponseBody extends TeaModel {
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

    private QueryReimbursementOrderResponseBody(Builder builder) {
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

    public static QueryReimbursementOrderResponseBody create() {
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

        public QueryReimbursementOrderResponseBody build() {
            return new QueryReimbursementOrderResponseBody(this);
        } 

    } 

    public static class ExpenseCompositions extends TeaModel {
        @NameInMap("bill_settlement_id")
        private Long billSettlementId;

        @NameInMap("capital_direction")
        private String capitalDirection;

        @NameInMap("fee_type")
        private String feeType;

        @NameInMap("remark")
        private String remark;

        @NameInMap("remind_tag_list")
        private java.util.List < String > remindTagList;

        @NameInMap("settlement_amount")
        private String settlementAmount;

        @NameInMap("settlement_time")
        private String settlementTime;

        @NameInMap("voucher_type")
        private Integer voucherType;

        private ExpenseCompositions(Builder builder) {
            this.billSettlementId = builder.billSettlementId;
            this.capitalDirection = builder.capitalDirection;
            this.feeType = builder.feeType;
            this.remark = builder.remark;
            this.remindTagList = builder.remindTagList;
            this.settlementAmount = builder.settlementAmount;
            this.settlementTime = builder.settlementTime;
            this.voucherType = builder.voucherType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpenseCompositions create() {
            return builder().build();
        }

        /**
         * @return billSettlementId
         */
        public Long getBillSettlementId() {
            return this.billSettlementId;
        }

        /**
         * @return capitalDirection
         */
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        /**
         * @return feeType
         */
        public String getFeeType() {
            return this.feeType;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return remindTagList
         */
        public java.util.List < String > getRemindTagList() {
            return this.remindTagList;
        }

        /**
         * @return settlementAmount
         */
        public String getSettlementAmount() {
            return this.settlementAmount;
        }

        /**
         * @return settlementTime
         */
        public String getSettlementTime() {
            return this.settlementTime;
        }

        /**
         * @return voucherType
         */
        public Integer getVoucherType() {
            return this.voucherType;
        }

        public static final class Builder {
            private Long billSettlementId; 
            private String capitalDirection; 
            private String feeType; 
            private String remark; 
            private java.util.List < String > remindTagList; 
            private String settlementAmount; 
            private String settlementTime; 
            private Integer voucherType; 

            /**
             * bill_settlement_id.
             */
            public Builder billSettlementId(Long billSettlementId) {
                this.billSettlementId = billSettlementId;
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
             * fee_type.
             */
            public Builder feeType(String feeType) {
                this.feeType = feeType;
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
             * remind_tag_list.
             */
            public Builder remindTagList(java.util.List < String > remindTagList) {
                this.remindTagList = remindTagList;
                return this;
            }

            /**
             * settlement_amount.
             */
            public Builder settlementAmount(String settlementAmount) {
                this.settlementAmount = settlementAmount;
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
             * voucher_type.
             */
            public Builder voucherType(Integer voucherType) {
                this.voucherType = voucherType;
                return this;
            }

            public ExpenseCompositions build() {
                return new ExpenseCompositions(this);
            } 

        } 

    }
    public static class Expenses extends TeaModel {
        @NameInMap("amount")
        private String amount;

        @NameInMap("currency")
        private String currency;

        @NameInMap("expense_city")
        private String expenseCity;

        @NameInMap("expense_compositions")
        private java.util.List < ExpenseCompositions> expenseCompositions;

        @NameInMap("expense_time")
        private String expenseTime;

        @NameInMap("expense_type")
        private String expenseType;

        @NameInMap("expense_type_code")
        private String expenseTypeCode;

        @NameInMap("reimb_expense_id")
        private Long reimbExpenseId;

        @NameInMap("remark")
        private String remark;

        @NameInMap("settlement_type")
        private String settlementType;

        private Expenses(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.expenseCity = builder.expenseCity;
            this.expenseCompositions = builder.expenseCompositions;
            this.expenseTime = builder.expenseTime;
            this.expenseType = builder.expenseType;
            this.expenseTypeCode = builder.expenseTypeCode;
            this.reimbExpenseId = builder.reimbExpenseId;
            this.remark = builder.remark;
            this.settlementType = builder.settlementType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expenses create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return expenseCity
         */
        public String getExpenseCity() {
            return this.expenseCity;
        }

        /**
         * @return expenseCompositions
         */
        public java.util.List < ExpenseCompositions> getExpenseCompositions() {
            return this.expenseCompositions;
        }

        /**
         * @return expenseTime
         */
        public String getExpenseTime() {
            return this.expenseTime;
        }

        /**
         * @return expenseType
         */
        public String getExpenseType() {
            return this.expenseType;
        }

        /**
         * @return expenseTypeCode
         */
        public String getExpenseTypeCode() {
            return this.expenseTypeCode;
        }

        /**
         * @return reimbExpenseId
         */
        public Long getReimbExpenseId() {
            return this.reimbExpenseId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return settlementType
         */
        public String getSettlementType() {
            return this.settlementType;
        }

        public static final class Builder {
            private String amount; 
            private String currency; 
            private String expenseCity; 
            private java.util.List < ExpenseCompositions> expenseCompositions; 
            private String expenseTime; 
            private String expenseType; 
            private String expenseTypeCode; 
            private Long reimbExpenseId; 
            private String remark; 
            private String settlementType; 

            /**
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * expense_city.
             */
            public Builder expenseCity(String expenseCity) {
                this.expenseCity = expenseCity;
                return this;
            }

            /**
             * expense_compositions.
             */
            public Builder expenseCompositions(java.util.List < ExpenseCompositions> expenseCompositions) {
                this.expenseCompositions = expenseCompositions;
                return this;
            }

            /**
             * expense_time.
             */
            public Builder expenseTime(String expenseTime) {
                this.expenseTime = expenseTime;
                return this;
            }

            /**
             * expense_type.
             */
            public Builder expenseType(String expenseType) {
                this.expenseType = expenseType;
                return this;
            }

            /**
             * expense_type_code.
             */
            public Builder expenseTypeCode(String expenseTypeCode) {
                this.expenseTypeCode = expenseTypeCode;
                return this;
            }

            /**
             * reimb_expense_id.
             */
            public Builder reimbExpenseId(Long reimbExpenseId) {
                this.reimbExpenseId = reimbExpenseId;
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
             * settlement_type.
             */
            public Builder settlementType(String settlementType) {
                this.settlementType = settlementType;
                return this;
            }

            public Expenses build() {
                return new Expenses(this);
            } 

        } 

    }
    public static class Itineraries extends TeaModel {
        @NameInMap("arr_city")
        private String arrCity;

        @NameInMap("arr_date")
        private String arrDate;

        @NameInMap("dep_city")
        private String depCity;

        @NameInMap("dep_date")
        private String depDate;

        @NameInMap("traffic_way")
        private String trafficWay;

        @NameInMap("trip_way")
        private String tripWay;

        private Itineraries(Builder builder) {
            this.arrCity = builder.arrCity;
            this.arrDate = builder.arrDate;
            this.depCity = builder.depCity;
            this.depDate = builder.depDate;
            this.trafficWay = builder.trafficWay;
            this.tripWay = builder.tripWay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Itineraries create() {
            return builder().build();
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
         * @return depCity
         */
        public String getDepCity() {
            return this.depCity;
        }

        /**
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
        }

        /**
         * @return trafficWay
         */
        public String getTrafficWay() {
            return this.trafficWay;
        }

        /**
         * @return tripWay
         */
        public String getTripWay() {
            return this.tripWay;
        }

        public static final class Builder {
            private String arrCity; 
            private String arrDate; 
            private String depCity; 
            private String depDate; 
            private String trafficWay; 
            private String tripWay; 

            /**
             * arr_city.
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
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
             * dep_city.
             */
            public Builder depCity(String depCity) {
                this.depCity = depCity;
                return this;
            }

            /**
             * dep_date.
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
                return this;
            }

            /**
             * traffic_way.
             */
            public Builder trafficWay(String trafficWay) {
                this.trafficWay = trafficWay;
                return this;
            }

            /**
             * trip_way.
             */
            public Builder tripWay(String tripWay) {
                this.tripWay = tripWay;
                return this;
            }

            public Itineraries build() {
                return new Itineraries(this);
            } 

        } 

    }
    public static class PaymentInfos extends TeaModel {
        @NameInMap("amount")
        private String amount;

        @NameInMap("payee_user_id")
        private String payeeUserId;

        private PaymentInfos(Builder builder) {
            this.amount = builder.amount;
            this.payeeUserId = builder.payeeUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PaymentInfos create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return payeeUserId
         */
        public String getPayeeUserId() {
            return this.payeeUserId;
        }

        public static final class Builder {
            private String amount; 
            private String payeeUserId; 

            /**
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * payee_user_id.
             */
            public Builder payeeUserId(String payeeUserId) {
                this.payeeUserId = payeeUserId;
                return this;
            }

            public PaymentInfos build() {
                return new PaymentInfos(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("company_amount")
        private String companyAmount;

        @NameInMap("company_pay_amount")
        private String companyPayAmount;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("expenses")
        private java.util.List < Expenses> expenses;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modified")
        private String gmtModified;

        @NameInMap("is_deleted")
        private String isDeleted;

        @NameInMap("itineraries")
        private java.util.List < Itineraries> itineraries;

        @NameInMap("payment_infos")
        private java.util.List < PaymentInfos> paymentInfos;

        @NameInMap("personal_amount")
        private String personalAmount;

        @NameInMap("reason")
        private String reason;

        @NameInMap("reimbursement_no")
        private String reimbursementNo;

        @NameInMap("remark")
        private String remark;

        @NameInMap("status")
        private String status;

        @NameInMap("travel_third_apply_id")
        private String travelThirdApplyId;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        private Module(Builder builder) {
            this.companyAmount = builder.companyAmount;
            this.companyPayAmount = builder.companyPayAmount;
            this.corpId = builder.corpId;
            this.expenses = builder.expenses;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.isDeleted = builder.isDeleted;
            this.itineraries = builder.itineraries;
            this.paymentInfos = builder.paymentInfos;
            this.personalAmount = builder.personalAmount;
            this.reason = builder.reason;
            this.reimbursementNo = builder.reimbursementNo;
            this.remark = builder.remark;
            this.status = builder.status;
            this.travelThirdApplyId = builder.travelThirdApplyId;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return companyAmount
         */
        public String getCompanyAmount() {
            return this.companyAmount;
        }

        /**
         * @return companyPayAmount
         */
        public String getCompanyPayAmount() {
            return this.companyPayAmount;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return expenses
         */
        public java.util.List < Expenses> getExpenses() {
            return this.expenses;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isDeleted
         */
        public String getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return itineraries
         */
        public java.util.List < Itineraries> getItineraries() {
            return this.itineraries;
        }

        /**
         * @return paymentInfos
         */
        public java.util.List < PaymentInfos> getPaymentInfos() {
            return this.paymentInfos;
        }

        /**
         * @return personalAmount
         */
        public String getPersonalAmount() {
            return this.personalAmount;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reimbursementNo
         */
        public String getReimbursementNo() {
            return this.reimbursementNo;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return travelThirdApplyId
         */
        public String getTravelThirdApplyId() {
            return this.travelThirdApplyId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String companyAmount; 
            private String companyPayAmount; 
            private String corpId; 
            private java.util.List < Expenses> expenses; 
            private String gmtCreate; 
            private String gmtModified; 
            private String isDeleted; 
            private java.util.List < Itineraries> itineraries; 
            private java.util.List < PaymentInfos> paymentInfos; 
            private String personalAmount; 
            private String reason; 
            private String reimbursementNo; 
            private String remark; 
            private String status; 
            private String travelThirdApplyId; 
            private String userId; 
            private String userName; 

            /**
             * company_amount.
             */
            public Builder companyAmount(String companyAmount) {
                this.companyAmount = companyAmount;
                return this;
            }

            /**
             * company_pay_amount.
             */
            public Builder companyPayAmount(String companyPayAmount) {
                this.companyPayAmount = companyPayAmount;
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
             * expenses.
             */
            public Builder expenses(java.util.List < Expenses> expenses) {
                this.expenses = expenses;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * is_deleted.
             */
            public Builder isDeleted(String isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * itineraries.
             */
            public Builder itineraries(java.util.List < Itineraries> itineraries) {
                this.itineraries = itineraries;
                return this;
            }

            /**
             * payment_infos.
             */
            public Builder paymentInfos(java.util.List < PaymentInfos> paymentInfos) {
                this.paymentInfos = paymentInfos;
                return this;
            }

            /**
             * personal_amount.
             */
            public Builder personalAmount(String personalAmount) {
                this.personalAmount = personalAmount;
                return this;
            }

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * reimbursement_no.
             */
            public Builder reimbursementNo(String reimbursementNo) {
                this.reimbursementNo = reimbursementNo;
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * travel_third_apply_id.
             */
            public Builder travelThirdApplyId(String travelThirdApplyId) {
                this.travelThirdApplyId = travelThirdApplyId;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
