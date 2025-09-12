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
 * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightRefundDetailResponseBody</p>
 */
public class IntlFlightRefundDetailResponseBody extends TeaModel {
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

    private IntlFlightRefundDetailResponseBody(Builder builder) {
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

    public static IntlFlightRefundDetailResponseBody create() {
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

        private Builder(IntlFlightRefundDetailResponseBody model) {
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
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public IntlFlightRefundDetailResponseBody build() {
            return new IntlFlightRefundDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class RefundReShopFeeDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("non_refundable_re_shop_handling_fee")
        private Long nonRefundableReShopHandlingFee;

        @com.aliyun.core.annotation.NameInMap("non_refundable_re_shop_upgrade_fee")
        private Long nonRefundableReShopUpgradeFee;

        @com.aliyun.core.annotation.NameInMap("non_refundable_tax_diff_fee")
        private Long nonRefundableTaxDiffFee;

        @com.aliyun.core.annotation.NameInMap("re_shop_apply_id")
        private String reShopApplyId;

        @com.aliyun.core.annotation.NameInMap("re_shop_refund_amount")
        private Long reShopRefundAmount;

        @com.aliyun.core.annotation.NameInMap("re_shop_service_refund_amount")
        private Long reShopServiceRefundAmount;

        @com.aliyun.core.annotation.NameInMap("re_shop_upgrade_refund_amount")
        private Long reShopUpgradeRefundAmount;

        @com.aliyun.core.annotation.NameInMap("refund_tax_diff_amount")
        private Long refundTaxDiffAmount;

        private RefundReShopFeeDetailList(Builder builder) {
            this.nonRefundableReShopHandlingFee = builder.nonRefundableReShopHandlingFee;
            this.nonRefundableReShopUpgradeFee = builder.nonRefundableReShopUpgradeFee;
            this.nonRefundableTaxDiffFee = builder.nonRefundableTaxDiffFee;
            this.reShopApplyId = builder.reShopApplyId;
            this.reShopRefundAmount = builder.reShopRefundAmount;
            this.reShopServiceRefundAmount = builder.reShopServiceRefundAmount;
            this.reShopUpgradeRefundAmount = builder.reShopUpgradeRefundAmount;
            this.refundTaxDiffAmount = builder.refundTaxDiffAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundReShopFeeDetailList create() {
            return builder().build();
        }

        /**
         * @return nonRefundableReShopHandlingFee
         */
        public Long getNonRefundableReShopHandlingFee() {
            return this.nonRefundableReShopHandlingFee;
        }

        /**
         * @return nonRefundableReShopUpgradeFee
         */
        public Long getNonRefundableReShopUpgradeFee() {
            return this.nonRefundableReShopUpgradeFee;
        }

        /**
         * @return nonRefundableTaxDiffFee
         */
        public Long getNonRefundableTaxDiffFee() {
            return this.nonRefundableTaxDiffFee;
        }

        /**
         * @return reShopApplyId
         */
        public String getReShopApplyId() {
            return this.reShopApplyId;
        }

        /**
         * @return reShopRefundAmount
         */
        public Long getReShopRefundAmount() {
            return this.reShopRefundAmount;
        }

        /**
         * @return reShopServiceRefundAmount
         */
        public Long getReShopServiceRefundAmount() {
            return this.reShopServiceRefundAmount;
        }

        /**
         * @return reShopUpgradeRefundAmount
         */
        public Long getReShopUpgradeRefundAmount() {
            return this.reShopUpgradeRefundAmount;
        }

        /**
         * @return refundTaxDiffAmount
         */
        public Long getRefundTaxDiffAmount() {
            return this.refundTaxDiffAmount;
        }

        public static final class Builder {
            private Long nonRefundableReShopHandlingFee; 
            private Long nonRefundableReShopUpgradeFee; 
            private Long nonRefundableTaxDiffFee; 
            private String reShopApplyId; 
            private Long reShopRefundAmount; 
            private Long reShopServiceRefundAmount; 
            private Long reShopUpgradeRefundAmount; 
            private Long refundTaxDiffAmount; 

            private Builder() {
            } 

            private Builder(RefundReShopFeeDetailList model) {
                this.nonRefundableReShopHandlingFee = model.nonRefundableReShopHandlingFee;
                this.nonRefundableReShopUpgradeFee = model.nonRefundableReShopUpgradeFee;
                this.nonRefundableTaxDiffFee = model.nonRefundableTaxDiffFee;
                this.reShopApplyId = model.reShopApplyId;
                this.reShopRefundAmount = model.reShopRefundAmount;
                this.reShopServiceRefundAmount = model.reShopServiceRefundAmount;
                this.reShopUpgradeRefundAmount = model.reShopUpgradeRefundAmount;
                this.refundTaxDiffAmount = model.refundTaxDiffAmount;
            } 

            /**
             * non_refundable_re_shop_handling_fee.
             */
            public Builder nonRefundableReShopHandlingFee(Long nonRefundableReShopHandlingFee) {
                this.nonRefundableReShopHandlingFee = nonRefundableReShopHandlingFee;
                return this;
            }

            /**
             * non_refundable_re_shop_upgrade_fee.
             */
            public Builder nonRefundableReShopUpgradeFee(Long nonRefundableReShopUpgradeFee) {
                this.nonRefundableReShopUpgradeFee = nonRefundableReShopUpgradeFee;
                return this;
            }

            /**
             * non_refundable_tax_diff_fee.
             */
            public Builder nonRefundableTaxDiffFee(Long nonRefundableTaxDiffFee) {
                this.nonRefundableTaxDiffFee = nonRefundableTaxDiffFee;
                return this;
            }

            /**
             * re_shop_apply_id.
             */
            public Builder reShopApplyId(String reShopApplyId) {
                this.reShopApplyId = reShopApplyId;
                return this;
            }

            /**
             * re_shop_refund_amount.
             */
            public Builder reShopRefundAmount(Long reShopRefundAmount) {
                this.reShopRefundAmount = reShopRefundAmount;
                return this;
            }

            /**
             * re_shop_service_refund_amount.
             */
            public Builder reShopServiceRefundAmount(Long reShopServiceRefundAmount) {
                this.reShopServiceRefundAmount = reShopServiceRefundAmount;
                return this;
            }

            /**
             * re_shop_upgrade_refund_amount.
             */
            public Builder reShopUpgradeRefundAmount(Long reShopUpgradeRefundAmount) {
                this.reShopUpgradeRefundAmount = reShopUpgradeRefundAmount;
                return this;
            }

            /**
             * refund_tax_diff_amount.
             */
            public Builder refundTaxDiffAmount(Long refundTaxDiffAmount) {
                this.refundTaxDiffAmount = refundTaxDiffAmount;
                return this;
            }

            public RefundReShopFeeDetailList build() {
                return new RefundReShopFeeDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class RefundFeeDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("already_used_total_amount")
        private Long alreadyUsedTotalAmount;

        @com.aliyun.core.annotation.NameInMap("non_refundable_re_shop_handling_fee")
        private Long nonRefundableReShopHandlingFee;

        @com.aliyun.core.annotation.NameInMap("non_refundable_re_shop_upgrade_fee")
        private Long nonRefundableReShopUpgradeFee;

        @com.aliyun.core.annotation.NameInMap("non_refundable_tax_diff_fee")
        private Long nonRefundableTaxDiffFee;

        @com.aliyun.core.annotation.NameInMap("re_shop_refund_amount")
        private Long reShopRefundAmount;

        @com.aliyun.core.annotation.NameInMap("re_shop_service_refund_amount")
        private Long reShopServiceRefundAmount;

        @com.aliyun.core.annotation.NameInMap("re_shop_upgrade_refund_amount")
        private Long reShopUpgradeRefundAmount;

        @com.aliyun.core.annotation.NameInMap("refund_re_shop_fee_detail_list")
        private java.util.List<RefundReShopFeeDetailList> refundReShopFeeDetailList;

        @com.aliyun.core.annotation.NameInMap("refund_tax_diff_amount")
        private Long refundTaxDiffAmount;

        @com.aliyun.core.annotation.NameInMap("refund_tax_fee")
        private Long refundTaxFee;

        @com.aliyun.core.annotation.NameInMap("refund_ticket_fee")
        private Long refundTicketFee;

        @com.aliyun.core.annotation.NameInMap("tax_refund_amount")
        private Long taxRefundAmount;

        @com.aliyun.core.annotation.NameInMap("ticket_refund_amount")
        private Long ticketRefundAmount;

        @com.aliyun.core.annotation.NameInMap("total_refund_amount")
        private Long totalRefundAmount;

        private RefundFeeDetail(Builder builder) {
            this.alreadyUsedTotalAmount = builder.alreadyUsedTotalAmount;
            this.nonRefundableReShopHandlingFee = builder.nonRefundableReShopHandlingFee;
            this.nonRefundableReShopUpgradeFee = builder.nonRefundableReShopUpgradeFee;
            this.nonRefundableTaxDiffFee = builder.nonRefundableTaxDiffFee;
            this.reShopRefundAmount = builder.reShopRefundAmount;
            this.reShopServiceRefundAmount = builder.reShopServiceRefundAmount;
            this.reShopUpgradeRefundAmount = builder.reShopUpgradeRefundAmount;
            this.refundReShopFeeDetailList = builder.refundReShopFeeDetailList;
            this.refundTaxDiffAmount = builder.refundTaxDiffAmount;
            this.refundTaxFee = builder.refundTaxFee;
            this.refundTicketFee = builder.refundTicketFee;
            this.taxRefundAmount = builder.taxRefundAmount;
            this.ticketRefundAmount = builder.ticketRefundAmount;
            this.totalRefundAmount = builder.totalRefundAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundFeeDetail create() {
            return builder().build();
        }

        /**
         * @return alreadyUsedTotalAmount
         */
        public Long getAlreadyUsedTotalAmount() {
            return this.alreadyUsedTotalAmount;
        }

        /**
         * @return nonRefundableReShopHandlingFee
         */
        public Long getNonRefundableReShopHandlingFee() {
            return this.nonRefundableReShopHandlingFee;
        }

        /**
         * @return nonRefundableReShopUpgradeFee
         */
        public Long getNonRefundableReShopUpgradeFee() {
            return this.nonRefundableReShopUpgradeFee;
        }

        /**
         * @return nonRefundableTaxDiffFee
         */
        public Long getNonRefundableTaxDiffFee() {
            return this.nonRefundableTaxDiffFee;
        }

        /**
         * @return reShopRefundAmount
         */
        public Long getReShopRefundAmount() {
            return this.reShopRefundAmount;
        }

        /**
         * @return reShopServiceRefundAmount
         */
        public Long getReShopServiceRefundAmount() {
            return this.reShopServiceRefundAmount;
        }

        /**
         * @return reShopUpgradeRefundAmount
         */
        public Long getReShopUpgradeRefundAmount() {
            return this.reShopUpgradeRefundAmount;
        }

        /**
         * @return refundReShopFeeDetailList
         */
        public java.util.List<RefundReShopFeeDetailList> getRefundReShopFeeDetailList() {
            return this.refundReShopFeeDetailList;
        }

        /**
         * @return refundTaxDiffAmount
         */
        public Long getRefundTaxDiffAmount() {
            return this.refundTaxDiffAmount;
        }

        /**
         * @return refundTaxFee
         */
        public Long getRefundTaxFee() {
            return this.refundTaxFee;
        }

        /**
         * @return refundTicketFee
         */
        public Long getRefundTicketFee() {
            return this.refundTicketFee;
        }

        /**
         * @return taxRefundAmount
         */
        public Long getTaxRefundAmount() {
            return this.taxRefundAmount;
        }

        /**
         * @return ticketRefundAmount
         */
        public Long getTicketRefundAmount() {
            return this.ticketRefundAmount;
        }

        /**
         * @return totalRefundAmount
         */
        public Long getTotalRefundAmount() {
            return this.totalRefundAmount;
        }

        public static final class Builder {
            private Long alreadyUsedTotalAmount; 
            private Long nonRefundableReShopHandlingFee; 
            private Long nonRefundableReShopUpgradeFee; 
            private Long nonRefundableTaxDiffFee; 
            private Long reShopRefundAmount; 
            private Long reShopServiceRefundAmount; 
            private Long reShopUpgradeRefundAmount; 
            private java.util.List<RefundReShopFeeDetailList> refundReShopFeeDetailList; 
            private Long refundTaxDiffAmount; 
            private Long refundTaxFee; 
            private Long refundTicketFee; 
            private Long taxRefundAmount; 
            private Long ticketRefundAmount; 
            private Long totalRefundAmount; 

            private Builder() {
            } 

            private Builder(RefundFeeDetail model) {
                this.alreadyUsedTotalAmount = model.alreadyUsedTotalAmount;
                this.nonRefundableReShopHandlingFee = model.nonRefundableReShopHandlingFee;
                this.nonRefundableReShopUpgradeFee = model.nonRefundableReShopUpgradeFee;
                this.nonRefundableTaxDiffFee = model.nonRefundableTaxDiffFee;
                this.reShopRefundAmount = model.reShopRefundAmount;
                this.reShopServiceRefundAmount = model.reShopServiceRefundAmount;
                this.reShopUpgradeRefundAmount = model.reShopUpgradeRefundAmount;
                this.refundReShopFeeDetailList = model.refundReShopFeeDetailList;
                this.refundTaxDiffAmount = model.refundTaxDiffAmount;
                this.refundTaxFee = model.refundTaxFee;
                this.refundTicketFee = model.refundTicketFee;
                this.taxRefundAmount = model.taxRefundAmount;
                this.ticketRefundAmount = model.ticketRefundAmount;
                this.totalRefundAmount = model.totalRefundAmount;
            } 

            /**
             * already_used_total_amount.
             */
            public Builder alreadyUsedTotalAmount(Long alreadyUsedTotalAmount) {
                this.alreadyUsedTotalAmount = alreadyUsedTotalAmount;
                return this;
            }

            /**
             * non_refundable_re_shop_handling_fee.
             */
            public Builder nonRefundableReShopHandlingFee(Long nonRefundableReShopHandlingFee) {
                this.nonRefundableReShopHandlingFee = nonRefundableReShopHandlingFee;
                return this;
            }

            /**
             * non_refundable_re_shop_upgrade_fee.
             */
            public Builder nonRefundableReShopUpgradeFee(Long nonRefundableReShopUpgradeFee) {
                this.nonRefundableReShopUpgradeFee = nonRefundableReShopUpgradeFee;
                return this;
            }

            /**
             * non_refundable_tax_diff_fee.
             */
            public Builder nonRefundableTaxDiffFee(Long nonRefundableTaxDiffFee) {
                this.nonRefundableTaxDiffFee = nonRefundableTaxDiffFee;
                return this;
            }

            /**
             * re_shop_refund_amount.
             */
            public Builder reShopRefundAmount(Long reShopRefundAmount) {
                this.reShopRefundAmount = reShopRefundAmount;
                return this;
            }

            /**
             * re_shop_service_refund_amount.
             */
            public Builder reShopServiceRefundAmount(Long reShopServiceRefundAmount) {
                this.reShopServiceRefundAmount = reShopServiceRefundAmount;
                return this;
            }

            /**
             * re_shop_upgrade_refund_amount.
             */
            public Builder reShopUpgradeRefundAmount(Long reShopUpgradeRefundAmount) {
                this.reShopUpgradeRefundAmount = reShopUpgradeRefundAmount;
                return this;
            }

            /**
             * refund_re_shop_fee_detail_list.
             */
            public Builder refundReShopFeeDetailList(java.util.List<RefundReShopFeeDetailList> refundReShopFeeDetailList) {
                this.refundReShopFeeDetailList = refundReShopFeeDetailList;
                return this;
            }

            /**
             * refund_tax_diff_amount.
             */
            public Builder refundTaxDiffAmount(Long refundTaxDiffAmount) {
                this.refundTaxDiffAmount = refundTaxDiffAmount;
                return this;
            }

            /**
             * refund_tax_fee.
             */
            public Builder refundTaxFee(Long refundTaxFee) {
                this.refundTaxFee = refundTaxFee;
                return this;
            }

            /**
             * refund_ticket_fee.
             */
            public Builder refundTicketFee(Long refundTicketFee) {
                this.refundTicketFee = refundTicketFee;
                return this;
            }

            /**
             * tax_refund_amount.
             */
            public Builder taxRefundAmount(Long taxRefundAmount) {
                this.taxRefundAmount = taxRefundAmount;
                return this;
            }

            /**
             * ticket_refund_amount.
             */
            public Builder ticketRefundAmount(Long ticketRefundAmount) {
                this.ticketRefundAmount = ticketRefundAmount;
                return this;
            }

            /**
             * total_refund_amount.
             */
            public Builder totalRefundAmount(Long totalRefundAmount) {
                this.totalRefundAmount = totalRefundAmount;
                return this;
            }

            public RefundFeeDetail build() {
                return new RefundFeeDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class TicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_key_list")
        private java.util.List<String> segmentKeyList;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        private TicketList(Builder builder) {
            this.segmentKeyList = builder.segmentKeyList;
            this.ticketNo = builder.ticketNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TicketList create() {
            return builder().build();
        }

        /**
         * @return segmentKeyList
         */
        public java.util.List<String> getSegmentKeyList() {
            return this.segmentKeyList;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        public static final class Builder {
            private java.util.List<String> segmentKeyList; 
            private String ticketNo; 

            private Builder() {
            } 

            private Builder(TicketList model) {
                this.segmentKeyList = model.segmentKeyList;
                this.ticketNo = model.ticketNo;
            } 

            /**
             * segment_key_list.
             */
            public Builder segmentKeyList(java.util.List<String> segmentKeyList) {
                this.segmentKeyList = segmentKeyList;
                return this;
            }

            /**
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            public TicketList build() {
                return new TicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class PassengeRefundFeeDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private Long passengerId;

        @com.aliyun.core.annotation.NameInMap("refund_fee_detail")
        private RefundFeeDetail refundFeeDetail;

        @com.aliyun.core.annotation.NameInMap("ticket_list")
        private java.util.List<TicketList> ticketList;

        private PassengeRefundFeeDetailList(Builder builder) {
            this.passengerId = builder.passengerId;
            this.refundFeeDetail = builder.refundFeeDetail;
            this.ticketList = builder.ticketList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengeRefundFeeDetailList create() {
            return builder().build();
        }

        /**
         * @return passengerId
         */
        public Long getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return refundFeeDetail
         */
        public RefundFeeDetail getRefundFeeDetail() {
            return this.refundFeeDetail;
        }

        /**
         * @return ticketList
         */
        public java.util.List<TicketList> getTicketList() {
            return this.ticketList;
        }

        public static final class Builder {
            private Long passengerId; 
            private RefundFeeDetail refundFeeDetail; 
            private java.util.List<TicketList> ticketList; 

            private Builder() {
            } 

            private Builder(PassengeRefundFeeDetailList model) {
                this.passengerId = model.passengerId;
                this.refundFeeDetail = model.refundFeeDetail;
                this.ticketList = model.ticketList;
            } 

            /**
             * passenger_id.
             */
            public Builder passengerId(Long passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * refund_fee_detail.
             */
            public Builder refundFeeDetail(RefundFeeDetail refundFeeDetail) {
                this.refundFeeDetail = refundFeeDetail;
                return this;
            }

            /**
             * ticket_list.
             */
            public Builder ticketList(java.util.List<TicketList> ticketList) {
                this.ticketList = ticketList;
                return this;
            }

            public PassengeRefundFeeDetailList build() {
                return new PassengeRefundFeeDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class PassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("full_name")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("job_no")
        private String jobNo;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("nationality_code")
        private String nationalityCode;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private Long passengerId;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_type")
        private Integer userType;

        private PassengerList(Builder builder) {
            this.birthday = builder.birthday;
            this.fullName = builder.fullName;
            this.gender = builder.gender;
            this.jobNo = builder.jobNo;
            this.nationality = builder.nationality;
            this.nationalityCode = builder.nationalityCode;
            this.passengerId = builder.passengerId;
            this.type = builder.type;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerList create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
        }

        /**
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        /**
         * @return nationalityCode
         */
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        /**
         * @return passengerId
         */
        public Long getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String birthday; 
            private String fullName; 
            private Integer gender; 
            private String jobNo; 
            private String nationality; 
            private String nationalityCode; 
            private Long passengerId; 
            private Integer type; 
            private String userId; 
            private Integer userType; 

            private Builder() {
            } 

            private Builder(PassengerList model) {
                this.birthday = model.birthday;
                this.fullName = model.fullName;
                this.gender = model.gender;
                this.jobNo = model.jobNo;
                this.nationality = model.nationality;
                this.nationalityCode = model.nationalityCode;
                this.passengerId = model.passengerId;
                this.type = model.type;
                this.userId = model.userId;
                this.userType = model.userType;
            } 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * full_name.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
                return this;
            }

            /**
             * nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * nationality_code.
             */
            public Builder nationalityCode(String nationalityCode) {
                this.nationalityCode = nationalityCode;
                return this;
            }

            /**
             * passenger_id.
             */
            public Builder passengerId(Long passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
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
             * user_type.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            public PassengerList build() {
                return new PassengerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class RefundOrderInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_time")
        private String applyTime;

        @com.aliyun.core.annotation.NameInMap("close_reason")
        private String closeReason;

        @com.aliyun.core.annotation.NameInMap("handing_amount")
        private Long handingAmount;

        @com.aliyun.core.annotation.NameInMap("out_refund_apply_id")
        private String outRefundApplyId;

        @com.aliyun.core.annotation.NameInMap("reason_code")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("reason_desc")
        private String reasonDesc;

        @com.aliyun.core.annotation.NameInMap("refund_amount")
        private Long refundAmount;

        @com.aliyun.core.annotation.NameInMap("refund_apply_id")
        private String refundApplyId;

        @com.aliyun.core.annotation.NameInMap("relation_refund_apply_id")
        private Long relationRefundApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("success_time")
        private String successTime;

        @com.aliyun.core.annotation.NameInMap("voluntary")
        private Boolean voluntary;

        private RefundOrderInfo(Builder builder) {
            this.applyTime = builder.applyTime;
            this.closeReason = builder.closeReason;
            this.handingAmount = builder.handingAmount;
            this.outRefundApplyId = builder.outRefundApplyId;
            this.reasonCode = builder.reasonCode;
            this.reasonDesc = builder.reasonDesc;
            this.refundAmount = builder.refundAmount;
            this.refundApplyId = builder.refundApplyId;
            this.relationRefundApplyId = builder.relationRefundApplyId;
            this.status = builder.status;
            this.successTime = builder.successTime;
            this.voluntary = builder.voluntary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundOrderInfo create() {
            return builder().build();
        }

        /**
         * @return applyTime
         */
        public String getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return closeReason
         */
        public String getCloseReason() {
            return this.closeReason;
        }

        /**
         * @return handingAmount
         */
        public Long getHandingAmount() {
            return this.handingAmount;
        }

        /**
         * @return outRefundApplyId
         */
        public String getOutRefundApplyId() {
            return this.outRefundApplyId;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonDesc
         */
        public String getReasonDesc() {
            return this.reasonDesc;
        }

        /**
         * @return refundAmount
         */
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        /**
         * @return refundApplyId
         */
        public String getRefundApplyId() {
            return this.refundApplyId;
        }

        /**
         * @return relationRefundApplyId
         */
        public Long getRelationRefundApplyId() {
            return this.relationRefundApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return successTime
         */
        public String getSuccessTime() {
            return this.successTime;
        }

        /**
         * @return voluntary
         */
        public Boolean getVoluntary() {
            return this.voluntary;
        }

        public static final class Builder {
            private String applyTime; 
            private String closeReason; 
            private Long handingAmount; 
            private String outRefundApplyId; 
            private String reasonCode; 
            private String reasonDesc; 
            private Long refundAmount; 
            private String refundApplyId; 
            private Long relationRefundApplyId; 
            private Integer status; 
            private String successTime; 
            private Boolean voluntary; 

            private Builder() {
            } 

            private Builder(RefundOrderInfo model) {
                this.applyTime = model.applyTime;
                this.closeReason = model.closeReason;
                this.handingAmount = model.handingAmount;
                this.outRefundApplyId = model.outRefundApplyId;
                this.reasonCode = model.reasonCode;
                this.reasonDesc = model.reasonDesc;
                this.refundAmount = model.refundAmount;
                this.refundApplyId = model.refundApplyId;
                this.relationRefundApplyId = model.relationRefundApplyId;
                this.status = model.status;
                this.successTime = model.successTime;
                this.voluntary = model.voluntary;
            } 

            /**
             * apply_time.
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * close_reason.
             */
            public Builder closeReason(String closeReason) {
                this.closeReason = closeReason;
                return this;
            }

            /**
             * handing_amount.
             */
            public Builder handingAmount(Long handingAmount) {
                this.handingAmount = handingAmount;
                return this;
            }

            /**
             * out_refund_apply_id.
             */
            public Builder outRefundApplyId(String outRefundApplyId) {
                this.outRefundApplyId = outRefundApplyId;
                return this;
            }

            /**
             * reason_code.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * reason_desc.
             */
            public Builder reasonDesc(String reasonDesc) {
                this.reasonDesc = reasonDesc;
                return this;
            }

            /**
             * refund_amount.
             */
            public Builder refundAmount(Long refundAmount) {
                this.refundAmount = refundAmount;
                return this;
            }

            /**
             * refund_apply_id.
             */
            public Builder refundApplyId(String refundApplyId) {
                this.refundApplyId = refundApplyId;
                return this;
            }

            /**
             * relation_refund_apply_id.
             */
            public Builder relationRefundApplyId(Long relationRefundApplyId) {
                this.relationRefundApplyId = relationRefundApplyId;
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
             * success_time.
             */
            public Builder successTime(String successTime) {
                this.successTime = successTime;
                return this;
            }

            /**
             * voluntary.
             */
            public Builder voluntary(Boolean voluntary) {
                this.voluntary = voluntary;
                return this;
            }

            public RefundOrderInfo build() {
                return new RefundOrderInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class AirlineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("short_name")
        private String shortName;

        private AirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.shortName = builder.shortName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AirlineInfo create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineName
         */
        public String getAirlineName() {
            return this.airlineName;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String shortName; 

            private Builder() {
            } 

            private Builder(AirlineInfo model) {
                this.airlineCode = model.airlineCode;
                this.airlineName = model.airlineName;
                this.shortName = model.shortName;
            } 

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_name.
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * short_name.
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            public AirlineInfo build() {
                return new AirlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class ArrAirportInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("airport_short_name")
        private String airportShortName;

        @com.aliyun.core.annotation.NameInMap("terminal")
        private String terminal;

        private ArrAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportShortName = builder.airportShortName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArrAirportInfo create() {
            return builder().build();
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return airportShortName
         */
        public String getAirportShortName() {
            return this.airportShortName;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private String airportCode; 
            private String airportName; 
            private String airportShortName; 
            private String terminal; 

            private Builder() {
            } 

            private Builder(ArrAirportInfo model) {
                this.airportCode = model.airportCode;
                this.airportName = model.airportName;
                this.airportShortName = model.airportShortName;
                this.terminal = model.terminal;
            } 

            /**
             * airport_code.
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * airport_name.
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * airport_short_name.
             */
            public Builder airportShortName(String airportShortName) {
                this.airportShortName = airportShortName;
                return this;
            }

            /**
             * terminal.
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            public ArrAirportInfo build() {
                return new ArrAirportInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class DepAirportInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("airport_short_name")
        private String airportShortName;

        @com.aliyun.core.annotation.NameInMap("terminal")
        private String terminal;

        private DepAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportShortName = builder.airportShortName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DepAirportInfo create() {
            return builder().build();
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return airportShortName
         */
        public String getAirportShortName() {
            return this.airportShortName;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private String airportCode; 
            private String airportName; 
            private String airportShortName; 
            private String terminal; 

            private Builder() {
            } 

            private Builder(DepAirportInfo model) {
                this.airportCode = model.airportCode;
                this.airportName = model.airportName;
                this.airportShortName = model.airportShortName;
                this.terminal = model.terminal;
            } 

            /**
             * airport_code.
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * airport_name.
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * airport_short_name.
             */
            public Builder airportShortName(String airportShortName) {
                this.airportShortName = airportShortName;
                return this;
            }

            /**
             * terminal.
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            public DepAirportInfo build() {
                return new DepAirportInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class OperatingAirlineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("short_name")
        private String shortName;

        private OperatingAirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.shortName = builder.shortName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatingAirlineInfo create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineName
         */
        public String getAirlineName() {
            return this.airlineName;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String shortName; 

            private Builder() {
            } 

            private Builder(OperatingAirlineInfo model) {
                this.airlineCode = model.airlineCode;
                this.airlineName = model.airlineName;
                this.shortName = model.shortName;
            } 

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_name.
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * short_name.
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            public OperatingAirlineInfo build() {
                return new OperatingAirlineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class FlightShareInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operating_airline_info")
        private OperatingAirlineInfo operatingAirlineInfo;

        @com.aliyun.core.annotation.NameInMap("operating_flight_no")
        private String operatingFlightNo;

        private FlightShareInfo(Builder builder) {
            this.operatingAirlineInfo = builder.operatingAirlineInfo;
            this.operatingFlightNo = builder.operatingFlightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightShareInfo create() {
            return builder().build();
        }

        /**
         * @return operatingAirlineInfo
         */
        public OperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        /**
         * @return operatingFlightNo
         */
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public static final class Builder {
            private OperatingAirlineInfo operatingAirlineInfo; 
            private String operatingFlightNo; 

            private Builder() {
            } 

            private Builder(FlightShareInfo model) {
                this.operatingAirlineInfo = model.operatingAirlineInfo;
                this.operatingFlightNo = model.operatingFlightNo;
            } 

            /**
             * operating_airline_info.
             */
            public Builder operatingAirlineInfo(OperatingAirlineInfo operatingAirlineInfo) {
                this.operatingAirlineInfo = operatingAirlineInfo;
                return this;
            }

            /**
             * operating_flight_no.
             */
            public Builder operatingFlightNo(String operatingFlightNo) {
                this.operatingFlightNo = operatingFlightNo;
                return this;
            }

            public FlightShareInfo build() {
                return new FlightShareInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class FlightStopInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("stop_airport")
        private String stopAirport;

        @com.aliyun.core.annotation.NameInMap("stop_airport_name")
        private String stopAirportName;

        @com.aliyun.core.annotation.NameInMap("stop_arr_term")
        private String stopArrTerm;

        @com.aliyun.core.annotation.NameInMap("stop_arr_time")
        private String stopArrTime;

        @com.aliyun.core.annotation.NameInMap("stop_city_code")
        private String stopCityCode;

        @com.aliyun.core.annotation.NameInMap("stop_city_name")
        private String stopCityName;

        @com.aliyun.core.annotation.NameInMap("stop_dep_term")
        private String stopDepTerm;

        @com.aliyun.core.annotation.NameInMap("stop_dep_time")
        private String stopDepTime;

        @com.aliyun.core.annotation.NameInMap("stop_time")
        private String stopTime;

        private FlightStopInfoList(Builder builder) {
            this.stopAirport = builder.stopAirport;
            this.stopAirportName = builder.stopAirportName;
            this.stopArrTerm = builder.stopArrTerm;
            this.stopArrTime = builder.stopArrTime;
            this.stopCityCode = builder.stopCityCode;
            this.stopCityName = builder.stopCityName;
            this.stopDepTerm = builder.stopDepTerm;
            this.stopDepTime = builder.stopDepTime;
            this.stopTime = builder.stopTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightStopInfoList create() {
            return builder().build();
        }

        /**
         * @return stopAirport
         */
        public String getStopAirport() {
            return this.stopAirport;
        }

        /**
         * @return stopAirportName
         */
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        /**
         * @return stopArrTerm
         */
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        /**
         * @return stopArrTime
         */
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        /**
         * @return stopCityCode
         */
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        /**
         * @return stopCityName
         */
        public String getStopCityName() {
            return this.stopCityName;
        }

        /**
         * @return stopDepTerm
         */
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        /**
         * @return stopDepTime
         */
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        /**
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        public static final class Builder {
            private String stopAirport; 
            private String stopAirportName; 
            private String stopArrTerm; 
            private String stopArrTime; 
            private String stopCityCode; 
            private String stopCityName; 
            private String stopDepTerm; 
            private String stopDepTime; 
            private String stopTime; 

            private Builder() {
            } 

            private Builder(FlightStopInfoList model) {
                this.stopAirport = model.stopAirport;
                this.stopAirportName = model.stopAirportName;
                this.stopArrTerm = model.stopArrTerm;
                this.stopArrTime = model.stopArrTime;
                this.stopCityCode = model.stopCityCode;
                this.stopCityName = model.stopCityName;
                this.stopDepTerm = model.stopDepTerm;
                this.stopDepTime = model.stopDepTime;
                this.stopTime = model.stopTime;
            } 

            /**
             * stop_airport.
             */
            public Builder stopAirport(String stopAirport) {
                this.stopAirport = stopAirport;
                return this;
            }

            /**
             * stop_airport_name.
             */
            public Builder stopAirportName(String stopAirportName) {
                this.stopAirportName = stopAirportName;
                return this;
            }

            /**
             * stop_arr_term.
             */
            public Builder stopArrTerm(String stopArrTerm) {
                this.stopArrTerm = stopArrTerm;
                return this;
            }

            /**
             * stop_arr_time.
             */
            public Builder stopArrTime(String stopArrTime) {
                this.stopArrTime = stopArrTime;
                return this;
            }

            /**
             * stop_city_code.
             */
            public Builder stopCityCode(String stopCityCode) {
                this.stopCityCode = stopCityCode;
                return this;
            }

            /**
             * stop_city_name.
             */
            public Builder stopCityName(String stopCityName) {
                this.stopCityName = stopCityName;
                return this;
            }

            /**
             * stop_dep_term.
             */
            public Builder stopDepTerm(String stopDepTerm) {
                this.stopDepTerm = stopDepTerm;
                return this;
            }

            /**
             * stop_dep_time.
             */
            public Builder stopDepTime(String stopDepTime) {
                this.stopDepTime = stopDepTime;
                return this;
            }

            /**
             * stop_time.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            public FlightStopInfoList build() {
                return new FlightStopInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class LuggageDirectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dep_city_luggage_direct")
        private Integer depCityLuggageDirect;

        @com.aliyun.core.annotation.NameInMap("stop_city_luggage_direct")
        private Integer stopCityLuggageDirect;

        private LuggageDirectInfo(Builder builder) {
            this.depCityLuggageDirect = builder.depCityLuggageDirect;
            this.stopCityLuggageDirect = builder.stopCityLuggageDirect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LuggageDirectInfo create() {
            return builder().build();
        }

        /**
         * @return depCityLuggageDirect
         */
        public Integer getDepCityLuggageDirect() {
            return this.depCityLuggageDirect;
        }

        /**
         * @return stopCityLuggageDirect
         */
        public Integer getStopCityLuggageDirect() {
            return this.stopCityLuggageDirect;
        }

        public static final class Builder {
            private Integer depCityLuggageDirect; 
            private Integer stopCityLuggageDirect; 

            private Builder() {
            } 

            private Builder(LuggageDirectInfo model) {
                this.depCityLuggageDirect = model.depCityLuggageDirect;
                this.stopCityLuggageDirect = model.stopCityLuggageDirect;
            } 

            /**
             * dep_city_luggage_direct.
             */
            public Builder depCityLuggageDirect(Integer depCityLuggageDirect) {
                this.depCityLuggageDirect = depCityLuggageDirect;
                return this;
            }

            /**
             * stop_city_luggage_direct.
             */
            public Builder stopCityLuggageDirect(Integer stopCityLuggageDirect) {
                this.stopCityLuggageDirect = stopCityLuggageDirect;
                return this;
            }

            public LuggageDirectInfo build() {
                return new LuggageDirectInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class SegmentVisaRemark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dep_city_visa_remark")
        private String depCityVisaRemark;

        @com.aliyun.core.annotation.NameInMap("dep_city_visa_type")
        private Integer depCityVisaType;

        @com.aliyun.core.annotation.NameInMap("stop_city_visa_remarks")
        private java.util.List<String> stopCityVisaRemarks;

        @com.aliyun.core.annotation.NameInMap("stop_city_visa_types")
        private java.util.List<Integer> stopCityVisaTypes;

        private SegmentVisaRemark(Builder builder) {
            this.depCityVisaRemark = builder.depCityVisaRemark;
            this.depCityVisaType = builder.depCityVisaType;
            this.stopCityVisaRemarks = builder.stopCityVisaRemarks;
            this.stopCityVisaTypes = builder.stopCityVisaTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentVisaRemark create() {
            return builder().build();
        }

        /**
         * @return depCityVisaRemark
         */
        public String getDepCityVisaRemark() {
            return this.depCityVisaRemark;
        }

        /**
         * @return depCityVisaType
         */
        public Integer getDepCityVisaType() {
            return this.depCityVisaType;
        }

        /**
         * @return stopCityVisaRemarks
         */
        public java.util.List<String> getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        /**
         * @return stopCityVisaTypes
         */
        public java.util.List<Integer> getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

        public static final class Builder {
            private String depCityVisaRemark; 
            private Integer depCityVisaType; 
            private java.util.List<String> stopCityVisaRemarks; 
            private java.util.List<Integer> stopCityVisaTypes; 

            private Builder() {
            } 

            private Builder(SegmentVisaRemark model) {
                this.depCityVisaRemark = model.depCityVisaRemark;
                this.depCityVisaType = model.depCityVisaType;
                this.stopCityVisaRemarks = model.stopCityVisaRemarks;
                this.stopCityVisaTypes = model.stopCityVisaTypes;
            } 

            /**
             * dep_city_visa_remark.
             */
            public Builder depCityVisaRemark(String depCityVisaRemark) {
                this.depCityVisaRemark = depCityVisaRemark;
                return this;
            }

            /**
             * dep_city_visa_type.
             */
            public Builder depCityVisaType(Integer depCityVisaType) {
                this.depCityVisaType = depCityVisaType;
                return this;
            }

            /**
             * stop_city_visa_remarks.
             */
            public Builder stopCityVisaRemarks(java.util.List<String> stopCityVisaRemarks) {
                this.stopCityVisaRemarks = stopCityVisaRemarks;
                return this;
            }

            /**
             * stop_city_visa_types.
             */
            public Builder stopCityVisaTypes(java.util.List<Integer> stopCityVisaTypes) {
                this.stopCityVisaTypes = stopCityVisaTypes;
                return this;
            }

            public SegmentVisaRemark build() {
                return new SegmentVisaRemark(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class SegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_info")
        private AirlineInfo airlineInfo;

        @com.aliyun.core.annotation.NameInMap("arr_airport_info")
        private ArrAirportInfo arrAirportInfo;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_city_name")
        private String arrCityName;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_airport_info")
        private DepAirportInfo depAirportInfo;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_name")
        private String depCityName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("flight_share_info")
        private FlightShareInfo flightShareInfo;

        @com.aliyun.core.annotation.NameInMap("flight_size")
        private String flightSize;

        @com.aliyun.core.annotation.NameInMap("flight_stop_info_list")
        private java.util.List<FlightStopInfoList> flightStopInfoList;

        @com.aliyun.core.annotation.NameInMap("flight_type")
        private String flightType;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("luggage_direct_info")
        private LuggageDirectInfo luggageDirectInfo;

        @com.aliyun.core.annotation.NameInMap("manufacturer")
        private String manufacturer;

        @com.aliyun.core.annotation.NameInMap("meal_desc")
        private String mealDesc;

        @com.aliyun.core.annotation.NameInMap("one_more")
        private Integer oneMore;

        @com.aliyun.core.annotation.NameInMap("one_more_show")
        private String oneMoreShow;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("segment_key")
        private String segmentKey;

        @com.aliyun.core.annotation.NameInMap("segment_visa_remark")
        private SegmentVisaRemark segmentVisaRemark;

        @com.aliyun.core.annotation.NameInMap("share")
        private Boolean share;

        @com.aliyun.core.annotation.NameInMap("short_flight_size")
        private String shortFlightSize;

        @com.aliyun.core.annotation.NameInMap("stop")
        private Boolean stop;

        @com.aliyun.core.annotation.NameInMap("total_time")
        private String totalTime;

        private SegmentList(Builder builder) {
            this.airlineInfo = builder.airlineInfo;
            this.arrAirportInfo = builder.arrAirportInfo;
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.arrTime = builder.arrTime;
            this.depAirportInfo = builder.depAirportInfo;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.depTime = builder.depTime;
            this.duration = builder.duration;
            this.flightNo = builder.flightNo;
            this.flightShareInfo = builder.flightShareInfo;
            this.flightSize = builder.flightSize;
            this.flightStopInfoList = builder.flightStopInfoList;
            this.flightType = builder.flightType;
            this.journeyIndex = builder.journeyIndex;
            this.luggageDirectInfo = builder.luggageDirectInfo;
            this.manufacturer = builder.manufacturer;
            this.mealDesc = builder.mealDesc;
            this.oneMore = builder.oneMore;
            this.oneMoreShow = builder.oneMoreShow;
            this.segmentIndex = builder.segmentIndex;
            this.segmentKey = builder.segmentKey;
            this.segmentVisaRemark = builder.segmentVisaRemark;
            this.share = builder.share;
            this.shortFlightSize = builder.shortFlightSize;
            this.stop = builder.stop;
            this.totalTime = builder.totalTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentList create() {
            return builder().build();
        }

        /**
         * @return airlineInfo
         */
        public AirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        /**
         * @return arrAirportInfo
         */
        public ArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrCityName
         */
        public String getArrCityName() {
            return this.arrCityName;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depAirportInfo
         */
        public DepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depCityName
         */
        public String getDepCityName() {
            return this.depCityName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return flightShareInfo
         */
        public FlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        /**
         * @return flightSize
         */
        public String getFlightSize() {
            return this.flightSize;
        }

        /**
         * @return flightStopInfoList
         */
        public java.util.List<FlightStopInfoList> getFlightStopInfoList() {
            return this.flightStopInfoList;
        }

        /**
         * @return flightType
         */
        public String getFlightType() {
            return this.flightType;
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return luggageDirectInfo
         */
        public LuggageDirectInfo getLuggageDirectInfo() {
            return this.luggageDirectInfo;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        /**
         * @return mealDesc
         */
        public String getMealDesc() {
            return this.mealDesc;
        }

        /**
         * @return oneMore
         */
        public Integer getOneMore() {
            return this.oneMore;
        }

        /**
         * @return oneMoreShow
         */
        public String getOneMoreShow() {
            return this.oneMoreShow;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return segmentKey
         */
        public String getSegmentKey() {
            return this.segmentKey;
        }

        /**
         * @return segmentVisaRemark
         */
        public SegmentVisaRemark getSegmentVisaRemark() {
            return this.segmentVisaRemark;
        }

        /**
         * @return share
         */
        public Boolean getShare() {
            return this.share;
        }

        /**
         * @return shortFlightSize
         */
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        /**
         * @return stop
         */
        public Boolean getStop() {
            return this.stop;
        }

        /**
         * @return totalTime
         */
        public String getTotalTime() {
            return this.totalTime;
        }

        public static final class Builder {
            private AirlineInfo airlineInfo; 
            private ArrAirportInfo arrAirportInfo; 
            private String arrCityCode; 
            private String arrCityName; 
            private String arrTime; 
            private DepAirportInfo depAirportInfo; 
            private String depCityCode; 
            private String depCityName; 
            private String depTime; 
            private Integer duration; 
            private String flightNo; 
            private FlightShareInfo flightShareInfo; 
            private String flightSize; 
            private java.util.List<FlightStopInfoList> flightStopInfoList; 
            private String flightType; 
            private Integer journeyIndex; 
            private LuggageDirectInfo luggageDirectInfo; 
            private String manufacturer; 
            private String mealDesc; 
            private Integer oneMore; 
            private String oneMoreShow; 
            private Integer segmentIndex; 
            private String segmentKey; 
            private SegmentVisaRemark segmentVisaRemark; 
            private Boolean share; 
            private String shortFlightSize; 
            private Boolean stop; 
            private String totalTime; 

            private Builder() {
            } 

            private Builder(SegmentList model) {
                this.airlineInfo = model.airlineInfo;
                this.arrAirportInfo = model.arrAirportInfo;
                this.arrCityCode = model.arrCityCode;
                this.arrCityName = model.arrCityName;
                this.arrTime = model.arrTime;
                this.depAirportInfo = model.depAirportInfo;
                this.depCityCode = model.depCityCode;
                this.depCityName = model.depCityName;
                this.depTime = model.depTime;
                this.duration = model.duration;
                this.flightNo = model.flightNo;
                this.flightShareInfo = model.flightShareInfo;
                this.flightSize = model.flightSize;
                this.flightStopInfoList = model.flightStopInfoList;
                this.flightType = model.flightType;
                this.journeyIndex = model.journeyIndex;
                this.luggageDirectInfo = model.luggageDirectInfo;
                this.manufacturer = model.manufacturer;
                this.mealDesc = model.mealDesc;
                this.oneMore = model.oneMore;
                this.oneMoreShow = model.oneMoreShow;
                this.segmentIndex = model.segmentIndex;
                this.segmentKey = model.segmentKey;
                this.segmentVisaRemark = model.segmentVisaRemark;
                this.share = model.share;
                this.shortFlightSize = model.shortFlightSize;
                this.stop = model.stop;
                this.totalTime = model.totalTime;
            } 

            /**
             * airline_info.
             */
            public Builder airlineInfo(AirlineInfo airlineInfo) {
                this.airlineInfo = airlineInfo;
                return this;
            }

            /**
             * arr_airport_info.
             */
            public Builder arrAirportInfo(ArrAirportInfo arrAirportInfo) {
                this.arrAirportInfo = arrAirportInfo;
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
             * arr_city_name.
             */
            public Builder arrCityName(String arrCityName) {
                this.arrCityName = arrCityName;
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
             * dep_airport_info.
             */
            public Builder depAirportInfo(DepAirportInfo depAirportInfo) {
                this.depAirportInfo = depAirportInfo;
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
             * dep_city_name.
             */
            public Builder depCityName(String depCityName) {
                this.depCityName = depCityName;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
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
             * flight_share_info.
             */
            public Builder flightShareInfo(FlightShareInfo flightShareInfo) {
                this.flightShareInfo = flightShareInfo;
                return this;
            }

            /**
             * flight_size.
             */
            public Builder flightSize(String flightSize) {
                this.flightSize = flightSize;
                return this;
            }

            /**
             * flight_stop_info_list.
             */
            public Builder flightStopInfoList(java.util.List<FlightStopInfoList> flightStopInfoList) {
                this.flightStopInfoList = flightStopInfoList;
                return this;
            }

            /**
             * flight_type.
             */
            public Builder flightType(String flightType) {
                this.flightType = flightType;
                return this;
            }

            /**
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * luggage_direct_info.
             */
            public Builder luggageDirectInfo(LuggageDirectInfo luggageDirectInfo) {
                this.luggageDirectInfo = luggageDirectInfo;
                return this;
            }

            /**
             * manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            /**
             * meal_desc.
             */
            public Builder mealDesc(String mealDesc) {
                this.mealDesc = mealDesc;
                return this;
            }

            /**
             * one_more.
             */
            public Builder oneMore(Integer oneMore) {
                this.oneMore = oneMore;
                return this;
            }

            /**
             * one_more_show.
             */
            public Builder oneMoreShow(String oneMoreShow) {
                this.oneMoreShow = oneMoreShow;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            /**
             * segment_key.
             */
            public Builder segmentKey(String segmentKey) {
                this.segmentKey = segmentKey;
                return this;
            }

            /**
             * segment_visa_remark.
             */
            public Builder segmentVisaRemark(SegmentVisaRemark segmentVisaRemark) {
                this.segmentVisaRemark = segmentVisaRemark;
                return this;
            }

            /**
             * share.
             */
            public Builder share(Boolean share) {
                this.share = share;
                return this;
            }

            /**
             * short_flight_size.
             */
            public Builder shortFlightSize(String shortFlightSize) {
                this.shortFlightSize = shortFlightSize;
                return this;
            }

            /**
             * stop.
             */
            public Builder stop(Boolean stop) {
                this.stop = stop;
                return this;
            }

            /**
             * total_time.
             */
            public Builder totalTime(String totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            public SegmentList build() {
                return new SegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundDetailResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenge_refund_fee_detail_list")
        private java.util.List<PassengeRefundFeeDetailList> passengeRefundFeeDetailList;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List<PassengerList> passengerList;

        @com.aliyun.core.annotation.NameInMap("refund_order_info")
        private RefundOrderInfo refundOrderInfo;

        @com.aliyun.core.annotation.NameInMap("segment_list")
        private java.util.List<SegmentList> segmentList;

        private Module(Builder builder) {
            this.passengeRefundFeeDetailList = builder.passengeRefundFeeDetailList;
            this.passengerList = builder.passengerList;
            this.refundOrderInfo = builder.refundOrderInfo;
            this.segmentList = builder.segmentList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return passengeRefundFeeDetailList
         */
        public java.util.List<PassengeRefundFeeDetailList> getPassengeRefundFeeDetailList() {
            return this.passengeRefundFeeDetailList;
        }

        /**
         * @return passengerList
         */
        public java.util.List<PassengerList> getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return refundOrderInfo
         */
        public RefundOrderInfo getRefundOrderInfo() {
            return this.refundOrderInfo;
        }

        /**
         * @return segmentList
         */
        public java.util.List<SegmentList> getSegmentList() {
            return this.segmentList;
        }

        public static final class Builder {
            private java.util.List<PassengeRefundFeeDetailList> passengeRefundFeeDetailList; 
            private java.util.List<PassengerList> passengerList; 
            private RefundOrderInfo refundOrderInfo; 
            private java.util.List<SegmentList> segmentList; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.passengeRefundFeeDetailList = model.passengeRefundFeeDetailList;
                this.passengerList = model.passengerList;
                this.refundOrderInfo = model.refundOrderInfo;
                this.segmentList = model.segmentList;
            } 

            /**
             * passenge_refund_fee_detail_list.
             */
            public Builder passengeRefundFeeDetailList(java.util.List<PassengeRefundFeeDetailList> passengeRefundFeeDetailList) {
                this.passengeRefundFeeDetailList = passengeRefundFeeDetailList;
                return this;
            }

            /**
             * passenger_list.
             */
            public Builder passengerList(java.util.List<PassengerList> passengerList) {
                this.passengerList = passengerList;
                return this;
            }

            /**
             * refund_order_info.
             */
            public Builder refundOrderInfo(RefundOrderInfo refundOrderInfo) {
                this.refundOrderInfo = refundOrderInfo;
                return this;
            }

            /**
             * segment_list.
             */
            public Builder segmentList(java.util.List<SegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
