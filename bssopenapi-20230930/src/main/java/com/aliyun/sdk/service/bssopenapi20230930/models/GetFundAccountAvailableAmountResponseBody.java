// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link GetFundAccountAvailableAmountResponseBody} extends {@link TeaModel}
 *
 * <p>GetFundAccountAvailableAmountResponseBody</p>
 */
public class GetFundAccountAvailableAmountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableAmount")
    private String availableAmount;

    @com.aliyun.core.annotation.NameInMap("AvailableCreditAmount")
    private String availableCreditAmount;

    @com.aliyun.core.annotation.NameInMap("BankAcceptanceAmount")
    private String bankAcceptanceAmount;

    @com.aliyun.core.annotation.NameInMap("CashAmount")
    private String cashAmount;

    @com.aliyun.core.annotation.NameInMap("CreditAmount")
    private String creditAmount;

    @com.aliyun.core.annotation.NameInMap("CreditRefundAmount")
    private String creditRefundAmount;

    @com.aliyun.core.annotation.NameInMap("CreditUser")
    private Boolean creditUser;

    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("CurrentMonthUnclearedAmount")
    private String currentMonthUnclearedAmount;

    @com.aliyun.core.annotation.NameInMap("ExtendLedgerList")
    private java.util.List<ExtendLedgerList> extendLedgerList;

    @com.aliyun.core.annotation.NameInMap("FundAccountId")
    private String fundAccountId;

    @com.aliyun.core.annotation.NameInMap("FundAccountOwnerAccountId")
    private String fundAccountOwnerAccountId;

    @com.aliyun.core.annotation.NameInMap("FundAccountStatus")
    private String fundAccountStatus;

    @com.aliyun.core.annotation.NameInMap("FundAccountType")
    private String fundAccountType;

    @com.aliyun.core.annotation.NameInMap("HistoryMonthUnclearedAmount")
    private String historyMonthUnclearedAmount;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("NegativeBillAmount")
    private String negativeBillAmount;

    @com.aliyun.core.annotation.NameInMap("OriginalCashAmountList")
    private java.util.List<OriginalCashAmountList> originalCashAmountList;

    @com.aliyun.core.annotation.NameInMap("QuotaAmount")
    private String quotaAmount;

    @com.aliyun.core.annotation.NameInMap("QuotaConsumedAmount")
    private String quotaConsumedAmount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnclearedAmount")
    private String unclearedAmount;

    private GetFundAccountAvailableAmountResponseBody(Builder builder) {
        this.availableAmount = builder.availableAmount;
        this.availableCreditAmount = builder.availableCreditAmount;
        this.bankAcceptanceAmount = builder.bankAcceptanceAmount;
        this.cashAmount = builder.cashAmount;
        this.creditAmount = builder.creditAmount;
        this.creditRefundAmount = builder.creditRefundAmount;
        this.creditUser = builder.creditUser;
        this.currency = builder.currency;
        this.currentMonthUnclearedAmount = builder.currentMonthUnclearedAmount;
        this.extendLedgerList = builder.extendLedgerList;
        this.fundAccountId = builder.fundAccountId;
        this.fundAccountOwnerAccountId = builder.fundAccountOwnerAccountId;
        this.fundAccountStatus = builder.fundAccountStatus;
        this.fundAccountType = builder.fundAccountType;
        this.historyMonthUnclearedAmount = builder.historyMonthUnclearedAmount;
        this.metadata = builder.metadata;
        this.negativeBillAmount = builder.negativeBillAmount;
        this.originalCashAmountList = builder.originalCashAmountList;
        this.quotaAmount = builder.quotaAmount;
        this.quotaConsumedAmount = builder.quotaConsumedAmount;
        this.requestId = builder.requestId;
        this.unclearedAmount = builder.unclearedAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFundAccountAvailableAmountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableAmount
     */
    public String getAvailableAmount() {
        return this.availableAmount;
    }

    /**
     * @return availableCreditAmount
     */
    public String getAvailableCreditAmount() {
        return this.availableCreditAmount;
    }

    /**
     * @return bankAcceptanceAmount
     */
    public String getBankAcceptanceAmount() {
        return this.bankAcceptanceAmount;
    }

    /**
     * @return cashAmount
     */
    public String getCashAmount() {
        return this.cashAmount;
    }

    /**
     * @return creditAmount
     */
    public String getCreditAmount() {
        return this.creditAmount;
    }

    /**
     * @return creditRefundAmount
     */
    public String getCreditRefundAmount() {
        return this.creditRefundAmount;
    }

    /**
     * @return creditUser
     */
    public Boolean getCreditUser() {
        return this.creditUser;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return currentMonthUnclearedAmount
     */
    public String getCurrentMonthUnclearedAmount() {
        return this.currentMonthUnclearedAmount;
    }

    /**
     * @return extendLedgerList
     */
    public java.util.List<ExtendLedgerList> getExtendLedgerList() {
        return this.extendLedgerList;
    }

    /**
     * @return fundAccountId
     */
    public String getFundAccountId() {
        return this.fundAccountId;
    }

    /**
     * @return fundAccountOwnerAccountId
     */
    public String getFundAccountOwnerAccountId() {
        return this.fundAccountOwnerAccountId;
    }

    /**
     * @return fundAccountStatus
     */
    public String getFundAccountStatus() {
        return this.fundAccountStatus;
    }

    /**
     * @return fundAccountType
     */
    public String getFundAccountType() {
        return this.fundAccountType;
    }

    /**
     * @return historyMonthUnclearedAmount
     */
    public String getHistoryMonthUnclearedAmount() {
        return this.historyMonthUnclearedAmount;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return negativeBillAmount
     */
    public String getNegativeBillAmount() {
        return this.negativeBillAmount;
    }

    /**
     * @return originalCashAmountList
     */
    public java.util.List<OriginalCashAmountList> getOriginalCashAmountList() {
        return this.originalCashAmountList;
    }

    /**
     * @return quotaAmount
     */
    public String getQuotaAmount() {
        return this.quotaAmount;
    }

    /**
     * @return quotaConsumedAmount
     */
    public String getQuotaConsumedAmount() {
        return this.quotaConsumedAmount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unclearedAmount
     */
    public String getUnclearedAmount() {
        return this.unclearedAmount;
    }

    public static final class Builder {
        private String availableAmount; 
        private String availableCreditAmount; 
        private String bankAcceptanceAmount; 
        private String cashAmount; 
        private String creditAmount; 
        private String creditRefundAmount; 
        private Boolean creditUser; 
        private String currency; 
        private String currentMonthUnclearedAmount; 
        private java.util.List<ExtendLedgerList> extendLedgerList; 
        private String fundAccountId; 
        private String fundAccountOwnerAccountId; 
        private String fundAccountStatus; 
        private String fundAccountType; 
        private String historyMonthUnclearedAmount; 
        private Object metadata; 
        private String negativeBillAmount; 
        private java.util.List<OriginalCashAmountList> originalCashAmountList; 
        private String quotaAmount; 
        private String quotaConsumedAmount; 
        private String requestId; 
        private String unclearedAmount; 

        private Builder() {
        } 

        private Builder(GetFundAccountAvailableAmountResponseBody model) {
            this.availableAmount = model.availableAmount;
            this.availableCreditAmount = model.availableCreditAmount;
            this.bankAcceptanceAmount = model.bankAcceptanceAmount;
            this.cashAmount = model.cashAmount;
            this.creditAmount = model.creditAmount;
            this.creditRefundAmount = model.creditRefundAmount;
            this.creditUser = model.creditUser;
            this.currency = model.currency;
            this.currentMonthUnclearedAmount = model.currentMonthUnclearedAmount;
            this.extendLedgerList = model.extendLedgerList;
            this.fundAccountId = model.fundAccountId;
            this.fundAccountOwnerAccountId = model.fundAccountOwnerAccountId;
            this.fundAccountStatus = model.fundAccountStatus;
            this.fundAccountType = model.fundAccountType;
            this.historyMonthUnclearedAmount = model.historyMonthUnclearedAmount;
            this.metadata = model.metadata;
            this.negativeBillAmount = model.negativeBillAmount;
            this.originalCashAmountList = model.originalCashAmountList;
            this.quotaAmount = model.quotaAmount;
            this.quotaConsumedAmount = model.quotaConsumedAmount;
            this.requestId = model.requestId;
            this.unclearedAmount = model.unclearedAmount;
        } 

        /**
         * AvailableAmount.
         */
        public Builder availableAmount(String availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }

        /**
         * AvailableCreditAmount.
         */
        public Builder availableCreditAmount(String availableCreditAmount) {
            this.availableCreditAmount = availableCreditAmount;
            return this;
        }

        /**
         * BankAcceptanceAmount.
         */
        public Builder bankAcceptanceAmount(String bankAcceptanceAmount) {
            this.bankAcceptanceAmount = bankAcceptanceAmount;
            return this;
        }

        /**
         * CashAmount.
         */
        public Builder cashAmount(String cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }

        /**
         * CreditAmount.
         */
        public Builder creditAmount(String creditAmount) {
            this.creditAmount = creditAmount;
            return this;
        }

        /**
         * CreditRefundAmount.
         */
        public Builder creditRefundAmount(String creditRefundAmount) {
            this.creditRefundAmount = creditRefundAmount;
            return this;
        }

        /**
         * CreditUser.
         */
        public Builder creditUser(Boolean creditUser) {
            this.creditUser = creditUser;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * CurrentMonthUnclearedAmount.
         */
        public Builder currentMonthUnclearedAmount(String currentMonthUnclearedAmount) {
            this.currentMonthUnclearedAmount = currentMonthUnclearedAmount;
            return this;
        }

        /**
         * ExtendLedgerList.
         */
        public Builder extendLedgerList(java.util.List<ExtendLedgerList> extendLedgerList) {
            this.extendLedgerList = extendLedgerList;
            return this;
        }

        /**
         * FundAccountId.
         */
        public Builder fundAccountId(String fundAccountId) {
            this.fundAccountId = fundAccountId;
            return this;
        }

        /**
         * FundAccountOwnerAccountId.
         */
        public Builder fundAccountOwnerAccountId(String fundAccountOwnerAccountId) {
            this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
            return this;
        }

        /**
         * FundAccountStatus.
         */
        public Builder fundAccountStatus(String fundAccountStatus) {
            this.fundAccountStatus = fundAccountStatus;
            return this;
        }

        /**
         * FundAccountType.
         */
        public Builder fundAccountType(String fundAccountType) {
            this.fundAccountType = fundAccountType;
            return this;
        }

        /**
         * HistoryMonthUnclearedAmount.
         */
        public Builder historyMonthUnclearedAmount(String historyMonthUnclearedAmount) {
            this.historyMonthUnclearedAmount = historyMonthUnclearedAmount;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * NegativeBillAmount.
         */
        public Builder negativeBillAmount(String negativeBillAmount) {
            this.negativeBillAmount = negativeBillAmount;
            return this;
        }

        /**
         * OriginalCashAmountList.
         */
        public Builder originalCashAmountList(java.util.List<OriginalCashAmountList> originalCashAmountList) {
            this.originalCashAmountList = originalCashAmountList;
            return this;
        }

        /**
         * QuotaAmount.
         */
        public Builder quotaAmount(String quotaAmount) {
            this.quotaAmount = quotaAmount;
            return this;
        }

        /**
         * QuotaConsumedAmount.
         */
        public Builder quotaConsumedAmount(String quotaConsumedAmount) {
            this.quotaConsumedAmount = quotaConsumedAmount;
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
         * UnclearedAmount.
         */
        public Builder unclearedAmount(String unclearedAmount) {
            this.unclearedAmount = unclearedAmount;
            return this;
        }

        public GetFundAccountAvailableAmountResponseBody build() {
            return new GetFundAccountAvailableAmountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFundAccountAvailableAmountResponseBody} extends {@link TeaModel}
     *
     * <p>GetFundAccountAvailableAmountResponseBody</p>
     */
    public static class ExtendLedgerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("LedgerName")
        private String ledgerName;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private String originalAmount;

        private ExtendLedgerList(Builder builder) {
            this.currency = builder.currency;
            this.ledgerName = builder.ledgerName;
            this.originalAmount = builder.originalAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendLedgerList create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return ledgerName
         */
        public String getLedgerName() {
            return this.ledgerName;
        }

        /**
         * @return originalAmount
         */
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        public static final class Builder {
            private String currency; 
            private String ledgerName; 
            private String originalAmount; 

            private Builder() {
            } 

            private Builder(ExtendLedgerList model) {
                this.currency = model.currency;
                this.ledgerName = model.ledgerName;
                this.originalAmount = model.originalAmount;
            } 

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * LedgerName.
             */
            public Builder ledgerName(String ledgerName) {
                this.ledgerName = ledgerName;
                return this;
            }

            /**
             * OriginalAmount.
             */
            public Builder originalAmount(String originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            public ExtendLedgerList build() {
                return new ExtendLedgerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFundAccountAvailableAmountResponseBody} extends {@link TeaModel}
     *
     * <p>GetFundAccountAvailableAmountResponseBody</p>
     */
    public static class OriginalCashAmountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        private OriginalCashAmountList(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginalCashAmountList create() {
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

        public static final class Builder {
            private String amount; 
            private String currency; 

            private Builder() {
            } 

            private Builder(OriginalCashAmountList model) {
                this.amount = model.amount;
                this.currency = model.currency;
            } 

            /**
             * Amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            public OriginalCashAmountList build() {
                return new OriginalCashAmountList(this);
            } 

        } 

    }
}
