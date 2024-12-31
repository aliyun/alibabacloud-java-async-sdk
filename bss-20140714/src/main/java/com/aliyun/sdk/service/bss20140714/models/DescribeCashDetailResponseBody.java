// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bss20140714.models;

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
 * {@link DescribeCashDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCashDetailResponseBody</p>
 */
public class DescribeCashDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AmountOwed")
    private String amountOwed;

    @com.aliyun.core.annotation.NameInMap("AvailableCredit")
    private String availableCredit;

    @com.aliyun.core.annotation.NameInMap("BalanceAmount")
    private String balanceAmount;

    @com.aliyun.core.annotation.NameInMap("CreditCardAmount")
    private String creditCardAmount;

    @com.aliyun.core.annotation.NameInMap("CreditLimit")
    private String creditLimit;

    @com.aliyun.core.annotation.NameInMap("EnableThresholdAlert")
    private String enableThresholdAlert;

    @com.aliyun.core.annotation.NameInMap("FrozenAmount")
    private String frozenAmount;

    @com.aliyun.core.annotation.NameInMap("MiniAlertThreshold")
    private Long miniAlertThreshold;

    @com.aliyun.core.annotation.NameInMap("RemmitanceAmount")
    private String remmitanceAmount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCashDetailResponseBody(Builder builder) {
        this.amountOwed = builder.amountOwed;
        this.availableCredit = builder.availableCredit;
        this.balanceAmount = builder.balanceAmount;
        this.creditCardAmount = builder.creditCardAmount;
        this.creditLimit = builder.creditLimit;
        this.enableThresholdAlert = builder.enableThresholdAlert;
        this.frozenAmount = builder.frozenAmount;
        this.miniAlertThreshold = builder.miniAlertThreshold;
        this.remmitanceAmount = builder.remmitanceAmount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCashDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return amountOwed
     */
    public String getAmountOwed() {
        return this.amountOwed;
    }

    /**
     * @return availableCredit
     */
    public String getAvailableCredit() {
        return this.availableCredit;
    }

    /**
     * @return balanceAmount
     */
    public String getBalanceAmount() {
        return this.balanceAmount;
    }

    /**
     * @return creditCardAmount
     */
    public String getCreditCardAmount() {
        return this.creditCardAmount;
    }

    /**
     * @return creditLimit
     */
    public String getCreditLimit() {
        return this.creditLimit;
    }

    /**
     * @return enableThresholdAlert
     */
    public String getEnableThresholdAlert() {
        return this.enableThresholdAlert;
    }

    /**
     * @return frozenAmount
     */
    public String getFrozenAmount() {
        return this.frozenAmount;
    }

    /**
     * @return miniAlertThreshold
     */
    public Long getMiniAlertThreshold() {
        return this.miniAlertThreshold;
    }

    /**
     * @return remmitanceAmount
     */
    public String getRemmitanceAmount() {
        return this.remmitanceAmount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String amountOwed; 
        private String availableCredit; 
        private String balanceAmount; 
        private String creditCardAmount; 
        private String creditLimit; 
        private String enableThresholdAlert; 
        private String frozenAmount; 
        private Long miniAlertThreshold; 
        private String remmitanceAmount; 
        private String requestId; 

        /**
         * AmountOwed.
         */
        public Builder amountOwed(String amountOwed) {
            this.amountOwed = amountOwed;
            return this;
        }

        /**
         * AvailableCredit.
         */
        public Builder availableCredit(String availableCredit) {
            this.availableCredit = availableCredit;
            return this;
        }

        /**
         * BalanceAmount.
         */
        public Builder balanceAmount(String balanceAmount) {
            this.balanceAmount = balanceAmount;
            return this;
        }

        /**
         * CreditCardAmount.
         */
        public Builder creditCardAmount(String creditCardAmount) {
            this.creditCardAmount = creditCardAmount;
            return this;
        }

        /**
         * CreditLimit.
         */
        public Builder creditLimit(String creditLimit) {
            this.creditLimit = creditLimit;
            return this;
        }

        /**
         * EnableThresholdAlert.
         */
        public Builder enableThresholdAlert(String enableThresholdAlert) {
            this.enableThresholdAlert = enableThresholdAlert;
            return this;
        }

        /**
         * FrozenAmount.
         */
        public Builder frozenAmount(String frozenAmount) {
            this.frozenAmount = frozenAmount;
            return this;
        }

        /**
         * MiniAlertThreshold.
         */
        public Builder miniAlertThreshold(Long miniAlertThreshold) {
            this.miniAlertThreshold = miniAlertThreshold;
            return this;
        }

        /**
         * RemmitanceAmount.
         */
        public Builder remmitanceAmount(String remmitanceAmount) {
            this.remmitanceAmount = remmitanceAmount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCashDetailResponseBody build() {
            return new DescribeCashDetailResponseBody(this);
        } 

    } 

}
