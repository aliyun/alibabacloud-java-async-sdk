// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCredentialPoolStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCredentialPoolStatisticsResponseBody</p>
 */
public class GetCredentialPoolStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetCredentialPoolStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialPoolStatisticsResponseBody create() {
        return builder().build();
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
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

        public GetCredentialPoolStatisticsResponseBody build() {
            return new GetCredentialPoolStatisticsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CardActiveNum")
        private Long cardActiveNum;

        @NameInMap("CardTotalNum")
        private Long cardTotalNum;

        @NameInMap("CredentialInstanceId")
        private String credentialInstanceId;

        @NameInMap("CredentialNO")
        private String credentialNO;

        @NameInMap("CredentialType")
        private String credentialType;

        @NameInMap("EffectiveAvailableFlow")
        private String effectiveAvailableFlow;

        @NameInMap("EffectiveTotalFlow")
        private String effectiveTotalFlow;

        @NameInMap("MonthExceedFee")
        private Long monthExceedFee;

        @NameInMap("MonthFeatureFee")
        private Long monthFeatureFee;

        @NameInMap("MonthUsedAmount")
        private Long monthUsedAmount;

        @NameInMap("PoolAvaiable")
        private String poolAvaiable;

        @NameInMap("PoolGrandTotal")
        private String poolGrandTotal;

        @NameInMap("PoolGrandTotalUsed")
        private String poolGrandTotalUsed;

        @NameInMap("PoolOutUsed")
        private String poolOutUsed;

        @NameInMap("PoolUsed")
        private String poolUsed;

        @NameInMap("SmsUsed")
        private Long smsUsed;

        private Data(Builder builder) {
            this.cardActiveNum = builder.cardActiveNum;
            this.cardTotalNum = builder.cardTotalNum;
            this.credentialInstanceId = builder.credentialInstanceId;
            this.credentialNO = builder.credentialNO;
            this.credentialType = builder.credentialType;
            this.effectiveAvailableFlow = builder.effectiveAvailableFlow;
            this.effectiveTotalFlow = builder.effectiveTotalFlow;
            this.monthExceedFee = builder.monthExceedFee;
            this.monthFeatureFee = builder.monthFeatureFee;
            this.monthUsedAmount = builder.monthUsedAmount;
            this.poolAvaiable = builder.poolAvaiable;
            this.poolGrandTotal = builder.poolGrandTotal;
            this.poolGrandTotalUsed = builder.poolGrandTotalUsed;
            this.poolOutUsed = builder.poolOutUsed;
            this.poolUsed = builder.poolUsed;
            this.smsUsed = builder.smsUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cardActiveNum
         */
        public Long getCardActiveNum() {
            return this.cardActiveNum;
        }

        /**
         * @return cardTotalNum
         */
        public Long getCardTotalNum() {
            return this.cardTotalNum;
        }

        /**
         * @return credentialInstanceId
         */
        public String getCredentialInstanceId() {
            return this.credentialInstanceId;
        }

        /**
         * @return credentialNO
         */
        public String getCredentialNO() {
            return this.credentialNO;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return effectiveAvailableFlow
         */
        public String getEffectiveAvailableFlow() {
            return this.effectiveAvailableFlow;
        }

        /**
         * @return effectiveTotalFlow
         */
        public String getEffectiveTotalFlow() {
            return this.effectiveTotalFlow;
        }

        /**
         * @return monthExceedFee
         */
        public Long getMonthExceedFee() {
            return this.monthExceedFee;
        }

        /**
         * @return monthFeatureFee
         */
        public Long getMonthFeatureFee() {
            return this.monthFeatureFee;
        }

        /**
         * @return monthUsedAmount
         */
        public Long getMonthUsedAmount() {
            return this.monthUsedAmount;
        }

        /**
         * @return poolAvaiable
         */
        public String getPoolAvaiable() {
            return this.poolAvaiable;
        }

        /**
         * @return poolGrandTotal
         */
        public String getPoolGrandTotal() {
            return this.poolGrandTotal;
        }

        /**
         * @return poolGrandTotalUsed
         */
        public String getPoolGrandTotalUsed() {
            return this.poolGrandTotalUsed;
        }

        /**
         * @return poolOutUsed
         */
        public String getPoolOutUsed() {
            return this.poolOutUsed;
        }

        /**
         * @return poolUsed
         */
        public String getPoolUsed() {
            return this.poolUsed;
        }

        /**
         * @return smsUsed
         */
        public Long getSmsUsed() {
            return this.smsUsed;
        }

        public static final class Builder {
            private Long cardActiveNum; 
            private Long cardTotalNum; 
            private String credentialInstanceId; 
            private String credentialNO; 
            private String credentialType; 
            private String effectiveAvailableFlow; 
            private String effectiveTotalFlow; 
            private Long monthExceedFee; 
            private Long monthFeatureFee; 
            private Long monthUsedAmount; 
            private String poolAvaiable; 
            private String poolGrandTotal; 
            private String poolGrandTotalUsed; 
            private String poolOutUsed; 
            private String poolUsed; 
            private Long smsUsed; 

            /**
             * CardActiveNum.
             */
            public Builder cardActiveNum(Long cardActiveNum) {
                this.cardActiveNum = cardActiveNum;
                return this;
            }

            /**
             * CardTotalNum.
             */
            public Builder cardTotalNum(Long cardTotalNum) {
                this.cardTotalNum = cardTotalNum;
                return this;
            }

            /**
             * CredentialInstanceId.
             */
            public Builder credentialInstanceId(String credentialInstanceId) {
                this.credentialInstanceId = credentialInstanceId;
                return this;
            }

            /**
             * CredentialNO.
             */
            public Builder credentialNO(String credentialNO) {
                this.credentialNO = credentialNO;
                return this;
            }

            /**
             * CredentialType.
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * EffectiveAvailableFlow.
             */
            public Builder effectiveAvailableFlow(String effectiveAvailableFlow) {
                this.effectiveAvailableFlow = effectiveAvailableFlow;
                return this;
            }

            /**
             * EffectiveTotalFlow.
             */
            public Builder effectiveTotalFlow(String effectiveTotalFlow) {
                this.effectiveTotalFlow = effectiveTotalFlow;
                return this;
            }

            /**
             * MonthExceedFee.
             */
            public Builder monthExceedFee(Long monthExceedFee) {
                this.monthExceedFee = monthExceedFee;
                return this;
            }

            /**
             * MonthFeatureFee.
             */
            public Builder monthFeatureFee(Long monthFeatureFee) {
                this.monthFeatureFee = monthFeatureFee;
                return this;
            }

            /**
             * MonthUsedAmount.
             */
            public Builder monthUsedAmount(Long monthUsedAmount) {
                this.monthUsedAmount = monthUsedAmount;
                return this;
            }

            /**
             * PoolAvaiable.
             */
            public Builder poolAvaiable(String poolAvaiable) {
                this.poolAvaiable = poolAvaiable;
                return this;
            }

            /**
             * PoolGrandTotal.
             */
            public Builder poolGrandTotal(String poolGrandTotal) {
                this.poolGrandTotal = poolGrandTotal;
                return this;
            }

            /**
             * PoolGrandTotalUsed.
             */
            public Builder poolGrandTotalUsed(String poolGrandTotalUsed) {
                this.poolGrandTotalUsed = poolGrandTotalUsed;
                return this;
            }

            /**
             * PoolOutUsed.
             */
            public Builder poolOutUsed(String poolOutUsed) {
                this.poolOutUsed = poolOutUsed;
                return this;
            }

            /**
             * PoolUsed.
             */
            public Builder poolUsed(String poolUsed) {
                this.poolUsed = poolUsed;
                return this;
            }

            /**
             * SmsUsed.
             */
            public Builder smsUsed(Long smsUsed) {
                this.smsUsed = smsUsed;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
