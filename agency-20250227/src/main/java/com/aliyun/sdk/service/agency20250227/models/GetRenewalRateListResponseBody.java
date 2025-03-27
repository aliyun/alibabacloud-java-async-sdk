// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link GetRenewalRateListResponseBody} extends {@link TeaModel}
 *
 * <p>GetRenewalRateListResponseBody</p>
 */
public class GetRenewalRateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRenewalRateListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRenewalRateListResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRenewalRateListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRenewalRateListResponseBody build() {
            return new GetRenewalRateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRenewalRateListResponseBody} extends {@link TeaModel}
     *
     * <p>GetRenewalRateListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerAdjustedRenewalAmountDue")
        private Double customerAdjustedRenewalAmountDue;

        @com.aliyun.core.annotation.NameInMap("CustomerOtherBillAmount")
        private Double customerOtherBillAmount;

        @com.aliyun.core.annotation.NameInMap("FinalCustomerRenewalAmountDue")
        private Double finalCustomerRenewalAmountDue;

        @com.aliyun.core.annotation.NameInMap("FinalCustomerRenewalRate")
        private Double finalCustomerRenewalRate;

        @com.aliyun.core.annotation.NameInMap("FinalCustomerRenewedAmount")
        private Double finalCustomerRenewedAmount;

        @com.aliyun.core.annotation.NameInMap("FinalOtherBillAmount")
        private Double finalOtherBillAmount;

        @com.aliyun.core.annotation.NameInMap("FinalRenewalAmountDue")
        private Double finalRenewalAmountDue;

        @com.aliyun.core.annotation.NameInMap("FinalRenewalRate")
        private Double finalRenewalRate;

        @com.aliyun.core.annotation.NameInMap("FinalRenewedAmount")
        private Double finalRenewedAmount;

        @com.aliyun.core.annotation.NameInMap("FinalSubPartnerRenewalAmountDue")
        private Double finalSubPartnerRenewalAmountDue;

        @com.aliyun.core.annotation.NameInMap("FinalSubPartnerRenewalRate")
        private Double finalSubPartnerRenewalRate;

        @com.aliyun.core.annotation.NameInMap("FinalSubPartnerRenewedAmount")
        private Double finalSubPartnerRenewedAmount;

        @com.aliyun.core.annotation.NameInMap("FiscalYearAndQuarter")
        private String fiscalYearAndQuarter;

        @com.aliyun.core.annotation.NameInMap("MasterPid")
        private String masterPid;

        @com.aliyun.core.annotation.NameInMap("MasterPidName")
        private String masterPidName;

        @com.aliyun.core.annotation.NameInMap("SpecialCustomerRenewRatio")
        private Double specialCustomerRenewRatio;

        @com.aliyun.core.annotation.NameInMap("SpecialCustomerRenewalAmountDue")
        private Double specialCustomerRenewalAmountDue;

        @com.aliyun.core.annotation.NameInMap("SpecialCustomerRenewedAmount")
        private Double specialCustomerRenewedAmount;

        @com.aliyun.core.annotation.NameInMap("SpecialFinalRenewRatio")
        private Double specialFinalRenewRatio;

        @com.aliyun.core.annotation.NameInMap("SpecialFinalRenewalAmountDue")
        private Double specialFinalRenewalAmountDue;

        @com.aliyun.core.annotation.NameInMap("SpecialFinalRenewedAmount")
        private Double specialFinalRenewedAmount;

        @com.aliyun.core.annotation.NameInMap("SpecialSubPartnerRenewRatio")
        private Double specialSubPartnerRenewRatio;

        @com.aliyun.core.annotation.NameInMap("SpecialSubPartnerRenewalAmountDue")
        private Double specialSubPartnerRenewalAmountDue;

        @com.aliyun.core.annotation.NameInMap("SpecialSubPartnerRenewedAmount")
        private Double specialSubPartnerRenewedAmount;

        @com.aliyun.core.annotation.NameInMap("SubPartnerAdjustedRenewalAmountDue")
        private Double subPartnerAdjustedRenewalAmountDue;

        @com.aliyun.core.annotation.NameInMap("SubPartnerOtherBillAmount")
        private Double subPartnerOtherBillAmount;

        private Data(Builder builder) {
            this.customerAdjustedRenewalAmountDue = builder.customerAdjustedRenewalAmountDue;
            this.customerOtherBillAmount = builder.customerOtherBillAmount;
            this.finalCustomerRenewalAmountDue = builder.finalCustomerRenewalAmountDue;
            this.finalCustomerRenewalRate = builder.finalCustomerRenewalRate;
            this.finalCustomerRenewedAmount = builder.finalCustomerRenewedAmount;
            this.finalOtherBillAmount = builder.finalOtherBillAmount;
            this.finalRenewalAmountDue = builder.finalRenewalAmountDue;
            this.finalRenewalRate = builder.finalRenewalRate;
            this.finalRenewedAmount = builder.finalRenewedAmount;
            this.finalSubPartnerRenewalAmountDue = builder.finalSubPartnerRenewalAmountDue;
            this.finalSubPartnerRenewalRate = builder.finalSubPartnerRenewalRate;
            this.finalSubPartnerRenewedAmount = builder.finalSubPartnerRenewedAmount;
            this.fiscalYearAndQuarter = builder.fiscalYearAndQuarter;
            this.masterPid = builder.masterPid;
            this.masterPidName = builder.masterPidName;
            this.specialCustomerRenewRatio = builder.specialCustomerRenewRatio;
            this.specialCustomerRenewalAmountDue = builder.specialCustomerRenewalAmountDue;
            this.specialCustomerRenewedAmount = builder.specialCustomerRenewedAmount;
            this.specialFinalRenewRatio = builder.specialFinalRenewRatio;
            this.specialFinalRenewalAmountDue = builder.specialFinalRenewalAmountDue;
            this.specialFinalRenewedAmount = builder.specialFinalRenewedAmount;
            this.specialSubPartnerRenewRatio = builder.specialSubPartnerRenewRatio;
            this.specialSubPartnerRenewalAmountDue = builder.specialSubPartnerRenewalAmountDue;
            this.specialSubPartnerRenewedAmount = builder.specialSubPartnerRenewedAmount;
            this.subPartnerAdjustedRenewalAmountDue = builder.subPartnerAdjustedRenewalAmountDue;
            this.subPartnerOtherBillAmount = builder.subPartnerOtherBillAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customerAdjustedRenewalAmountDue
         */
        public Double getCustomerAdjustedRenewalAmountDue() {
            return this.customerAdjustedRenewalAmountDue;
        }

        /**
         * @return customerOtherBillAmount
         */
        public Double getCustomerOtherBillAmount() {
            return this.customerOtherBillAmount;
        }

        /**
         * @return finalCustomerRenewalAmountDue
         */
        public Double getFinalCustomerRenewalAmountDue() {
            return this.finalCustomerRenewalAmountDue;
        }

        /**
         * @return finalCustomerRenewalRate
         */
        public Double getFinalCustomerRenewalRate() {
            return this.finalCustomerRenewalRate;
        }

        /**
         * @return finalCustomerRenewedAmount
         */
        public Double getFinalCustomerRenewedAmount() {
            return this.finalCustomerRenewedAmount;
        }

        /**
         * @return finalOtherBillAmount
         */
        public Double getFinalOtherBillAmount() {
            return this.finalOtherBillAmount;
        }

        /**
         * @return finalRenewalAmountDue
         */
        public Double getFinalRenewalAmountDue() {
            return this.finalRenewalAmountDue;
        }

        /**
         * @return finalRenewalRate
         */
        public Double getFinalRenewalRate() {
            return this.finalRenewalRate;
        }

        /**
         * @return finalRenewedAmount
         */
        public Double getFinalRenewedAmount() {
            return this.finalRenewedAmount;
        }

        /**
         * @return finalSubPartnerRenewalAmountDue
         */
        public Double getFinalSubPartnerRenewalAmountDue() {
            return this.finalSubPartnerRenewalAmountDue;
        }

        /**
         * @return finalSubPartnerRenewalRate
         */
        public Double getFinalSubPartnerRenewalRate() {
            return this.finalSubPartnerRenewalRate;
        }

        /**
         * @return finalSubPartnerRenewedAmount
         */
        public Double getFinalSubPartnerRenewedAmount() {
            return this.finalSubPartnerRenewedAmount;
        }

        /**
         * @return fiscalYearAndQuarter
         */
        public String getFiscalYearAndQuarter() {
            return this.fiscalYearAndQuarter;
        }

        /**
         * @return masterPid
         */
        public String getMasterPid() {
            return this.masterPid;
        }

        /**
         * @return masterPidName
         */
        public String getMasterPidName() {
            return this.masterPidName;
        }

        /**
         * @return specialCustomerRenewRatio
         */
        public Double getSpecialCustomerRenewRatio() {
            return this.specialCustomerRenewRatio;
        }

        /**
         * @return specialCustomerRenewalAmountDue
         */
        public Double getSpecialCustomerRenewalAmountDue() {
            return this.specialCustomerRenewalAmountDue;
        }

        /**
         * @return specialCustomerRenewedAmount
         */
        public Double getSpecialCustomerRenewedAmount() {
            return this.specialCustomerRenewedAmount;
        }

        /**
         * @return specialFinalRenewRatio
         */
        public Double getSpecialFinalRenewRatio() {
            return this.specialFinalRenewRatio;
        }

        /**
         * @return specialFinalRenewalAmountDue
         */
        public Double getSpecialFinalRenewalAmountDue() {
            return this.specialFinalRenewalAmountDue;
        }

        /**
         * @return specialFinalRenewedAmount
         */
        public Double getSpecialFinalRenewedAmount() {
            return this.specialFinalRenewedAmount;
        }

        /**
         * @return specialSubPartnerRenewRatio
         */
        public Double getSpecialSubPartnerRenewRatio() {
            return this.specialSubPartnerRenewRatio;
        }

        /**
         * @return specialSubPartnerRenewalAmountDue
         */
        public Double getSpecialSubPartnerRenewalAmountDue() {
            return this.specialSubPartnerRenewalAmountDue;
        }

        /**
         * @return specialSubPartnerRenewedAmount
         */
        public Double getSpecialSubPartnerRenewedAmount() {
            return this.specialSubPartnerRenewedAmount;
        }

        /**
         * @return subPartnerAdjustedRenewalAmountDue
         */
        public Double getSubPartnerAdjustedRenewalAmountDue() {
            return this.subPartnerAdjustedRenewalAmountDue;
        }

        /**
         * @return subPartnerOtherBillAmount
         */
        public Double getSubPartnerOtherBillAmount() {
            return this.subPartnerOtherBillAmount;
        }

        public static final class Builder {
            private Double customerAdjustedRenewalAmountDue; 
            private Double customerOtherBillAmount; 
            private Double finalCustomerRenewalAmountDue; 
            private Double finalCustomerRenewalRate; 
            private Double finalCustomerRenewedAmount; 
            private Double finalOtherBillAmount; 
            private Double finalRenewalAmountDue; 
            private Double finalRenewalRate; 
            private Double finalRenewedAmount; 
            private Double finalSubPartnerRenewalAmountDue; 
            private Double finalSubPartnerRenewalRate; 
            private Double finalSubPartnerRenewedAmount; 
            private String fiscalYearAndQuarter; 
            private String masterPid; 
            private String masterPidName; 
            private Double specialCustomerRenewRatio; 
            private Double specialCustomerRenewalAmountDue; 
            private Double specialCustomerRenewedAmount; 
            private Double specialFinalRenewRatio; 
            private Double specialFinalRenewalAmountDue; 
            private Double specialFinalRenewedAmount; 
            private Double specialSubPartnerRenewRatio; 
            private Double specialSubPartnerRenewalAmountDue; 
            private Double specialSubPartnerRenewedAmount; 
            private Double subPartnerAdjustedRenewalAmountDue; 
            private Double subPartnerOtherBillAmount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.customerAdjustedRenewalAmountDue = model.customerAdjustedRenewalAmountDue;
                this.customerOtherBillAmount = model.customerOtherBillAmount;
                this.finalCustomerRenewalAmountDue = model.finalCustomerRenewalAmountDue;
                this.finalCustomerRenewalRate = model.finalCustomerRenewalRate;
                this.finalCustomerRenewedAmount = model.finalCustomerRenewedAmount;
                this.finalOtherBillAmount = model.finalOtherBillAmount;
                this.finalRenewalAmountDue = model.finalRenewalAmountDue;
                this.finalRenewalRate = model.finalRenewalRate;
                this.finalRenewedAmount = model.finalRenewedAmount;
                this.finalSubPartnerRenewalAmountDue = model.finalSubPartnerRenewalAmountDue;
                this.finalSubPartnerRenewalRate = model.finalSubPartnerRenewalRate;
                this.finalSubPartnerRenewedAmount = model.finalSubPartnerRenewedAmount;
                this.fiscalYearAndQuarter = model.fiscalYearAndQuarter;
                this.masterPid = model.masterPid;
                this.masterPidName = model.masterPidName;
                this.specialCustomerRenewRatio = model.specialCustomerRenewRatio;
                this.specialCustomerRenewalAmountDue = model.specialCustomerRenewalAmountDue;
                this.specialCustomerRenewedAmount = model.specialCustomerRenewedAmount;
                this.specialFinalRenewRatio = model.specialFinalRenewRatio;
                this.specialFinalRenewalAmountDue = model.specialFinalRenewalAmountDue;
                this.specialFinalRenewedAmount = model.specialFinalRenewedAmount;
                this.specialSubPartnerRenewRatio = model.specialSubPartnerRenewRatio;
                this.specialSubPartnerRenewalAmountDue = model.specialSubPartnerRenewalAmountDue;
                this.specialSubPartnerRenewedAmount = model.specialSubPartnerRenewedAmount;
                this.subPartnerAdjustedRenewalAmountDue = model.subPartnerAdjustedRenewalAmountDue;
                this.subPartnerOtherBillAmount = model.subPartnerOtherBillAmount;
            } 

            /**
             * CustomerAdjustedRenewalAmountDue.
             */
            public Builder customerAdjustedRenewalAmountDue(Double customerAdjustedRenewalAmountDue) {
                this.customerAdjustedRenewalAmountDue = customerAdjustedRenewalAmountDue;
                return this;
            }

            /**
             * CustomerOtherBillAmount.
             */
            public Builder customerOtherBillAmount(Double customerOtherBillAmount) {
                this.customerOtherBillAmount = customerOtherBillAmount;
                return this;
            }

            /**
             * FinalCustomerRenewalAmountDue.
             */
            public Builder finalCustomerRenewalAmountDue(Double finalCustomerRenewalAmountDue) {
                this.finalCustomerRenewalAmountDue = finalCustomerRenewalAmountDue;
                return this;
            }

            /**
             * FinalCustomerRenewalRate.
             */
            public Builder finalCustomerRenewalRate(Double finalCustomerRenewalRate) {
                this.finalCustomerRenewalRate = finalCustomerRenewalRate;
                return this;
            }

            /**
             * FinalCustomerRenewedAmount.
             */
            public Builder finalCustomerRenewedAmount(Double finalCustomerRenewedAmount) {
                this.finalCustomerRenewedAmount = finalCustomerRenewedAmount;
                return this;
            }

            /**
             * FinalOtherBillAmount.
             */
            public Builder finalOtherBillAmount(Double finalOtherBillAmount) {
                this.finalOtherBillAmount = finalOtherBillAmount;
                return this;
            }

            /**
             * FinalRenewalAmountDue.
             */
            public Builder finalRenewalAmountDue(Double finalRenewalAmountDue) {
                this.finalRenewalAmountDue = finalRenewalAmountDue;
                return this;
            }

            /**
             * FinalRenewalRate.
             */
            public Builder finalRenewalRate(Double finalRenewalRate) {
                this.finalRenewalRate = finalRenewalRate;
                return this;
            }

            /**
             * FinalRenewedAmount.
             */
            public Builder finalRenewedAmount(Double finalRenewedAmount) {
                this.finalRenewedAmount = finalRenewedAmount;
                return this;
            }

            /**
             * FinalSubPartnerRenewalAmountDue.
             */
            public Builder finalSubPartnerRenewalAmountDue(Double finalSubPartnerRenewalAmountDue) {
                this.finalSubPartnerRenewalAmountDue = finalSubPartnerRenewalAmountDue;
                return this;
            }

            /**
             * FinalSubPartnerRenewalRate.
             */
            public Builder finalSubPartnerRenewalRate(Double finalSubPartnerRenewalRate) {
                this.finalSubPartnerRenewalRate = finalSubPartnerRenewalRate;
                return this;
            }

            /**
             * FinalSubPartnerRenewedAmount.
             */
            public Builder finalSubPartnerRenewedAmount(Double finalSubPartnerRenewedAmount) {
                this.finalSubPartnerRenewedAmount = finalSubPartnerRenewedAmount;
                return this;
            }

            /**
             * FiscalYearAndQuarter.
             */
            public Builder fiscalYearAndQuarter(String fiscalYearAndQuarter) {
                this.fiscalYearAndQuarter = fiscalYearAndQuarter;
                return this;
            }

            /**
             * MasterPid.
             */
            public Builder masterPid(String masterPid) {
                this.masterPid = masterPid;
                return this;
            }

            /**
             * MasterPidName.
             */
            public Builder masterPidName(String masterPidName) {
                this.masterPidName = masterPidName;
                return this;
            }

            /**
             * SpecialCustomerRenewRatio.
             */
            public Builder specialCustomerRenewRatio(Double specialCustomerRenewRatio) {
                this.specialCustomerRenewRatio = specialCustomerRenewRatio;
                return this;
            }

            /**
             * SpecialCustomerRenewalAmountDue.
             */
            public Builder specialCustomerRenewalAmountDue(Double specialCustomerRenewalAmountDue) {
                this.specialCustomerRenewalAmountDue = specialCustomerRenewalAmountDue;
                return this;
            }

            /**
             * SpecialCustomerRenewedAmount.
             */
            public Builder specialCustomerRenewedAmount(Double specialCustomerRenewedAmount) {
                this.specialCustomerRenewedAmount = specialCustomerRenewedAmount;
                return this;
            }

            /**
             * SpecialFinalRenewRatio.
             */
            public Builder specialFinalRenewRatio(Double specialFinalRenewRatio) {
                this.specialFinalRenewRatio = specialFinalRenewRatio;
                return this;
            }

            /**
             * SpecialFinalRenewalAmountDue.
             */
            public Builder specialFinalRenewalAmountDue(Double specialFinalRenewalAmountDue) {
                this.specialFinalRenewalAmountDue = specialFinalRenewalAmountDue;
                return this;
            }

            /**
             * SpecialFinalRenewedAmount.
             */
            public Builder specialFinalRenewedAmount(Double specialFinalRenewedAmount) {
                this.specialFinalRenewedAmount = specialFinalRenewedAmount;
                return this;
            }

            /**
             * SpecialSubPartnerRenewRatio.
             */
            public Builder specialSubPartnerRenewRatio(Double specialSubPartnerRenewRatio) {
                this.specialSubPartnerRenewRatio = specialSubPartnerRenewRatio;
                return this;
            }

            /**
             * SpecialSubPartnerRenewalAmountDue.
             */
            public Builder specialSubPartnerRenewalAmountDue(Double specialSubPartnerRenewalAmountDue) {
                this.specialSubPartnerRenewalAmountDue = specialSubPartnerRenewalAmountDue;
                return this;
            }

            /**
             * SpecialSubPartnerRenewedAmount.
             */
            public Builder specialSubPartnerRenewedAmount(Double specialSubPartnerRenewedAmount) {
                this.specialSubPartnerRenewedAmount = specialSubPartnerRenewedAmount;
                return this;
            }

            /**
             * SubPartnerAdjustedRenewalAmountDue.
             */
            public Builder subPartnerAdjustedRenewalAmountDue(Double subPartnerAdjustedRenewalAmountDue) {
                this.subPartnerAdjustedRenewalAmountDue = subPartnerAdjustedRenewalAmountDue;
                return this;
            }

            /**
             * SubPartnerOtherBillAmount.
             */
            public Builder subPartnerOtherBillAmount(Double subPartnerOtherBillAmount) {
                this.subPartnerOtherBillAmount = subPartnerOtherBillAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
