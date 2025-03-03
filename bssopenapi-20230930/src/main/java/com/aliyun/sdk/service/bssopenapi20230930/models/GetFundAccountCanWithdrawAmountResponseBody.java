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
 * {@link GetFundAccountCanWithdrawAmountResponseBody} extends {@link TeaModel}
 *
 * <p>GetFundAccountCanWithdrawAmountResponseBody</p>
 */
public class GetFundAccountCanWithdrawAmountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanOriginalWithdrawAmount")
    private String canOriginalWithdrawAmount;

    @com.aliyun.core.annotation.NameInMap("CanWithdrawAmount")
    private String canWithdrawAmount;

    @com.aliyun.core.annotation.NameInMap("CannotOriginalWithdrawAmount")
    private String cannotOriginalWithdrawAmount;

    @com.aliyun.core.annotation.NameInMap("CashAmount")
    private String cashAmount;

    @com.aliyun.core.annotation.NameInMap("CreditMemoAmount")
    private String creditMemoAmount;

    @com.aliyun.core.annotation.NameInMap("CurrentMonthUnclearedAmount")
    private String currentMonthUnclearedAmount;

    @com.aliyun.core.annotation.NameInMap("HistoryMonthUnclearedAmount")
    private String historyMonthUnclearedAmount;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("PayAsYouGoReversedAmount")
    private String payAsYouGoReversedAmount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransferAmount")
    private String transferAmount;

    private GetFundAccountCanWithdrawAmountResponseBody(Builder builder) {
        this.canOriginalWithdrawAmount = builder.canOriginalWithdrawAmount;
        this.canWithdrawAmount = builder.canWithdrawAmount;
        this.cannotOriginalWithdrawAmount = builder.cannotOriginalWithdrawAmount;
        this.cashAmount = builder.cashAmount;
        this.creditMemoAmount = builder.creditMemoAmount;
        this.currentMonthUnclearedAmount = builder.currentMonthUnclearedAmount;
        this.historyMonthUnclearedAmount = builder.historyMonthUnclearedAmount;
        this.metadata = builder.metadata;
        this.payAsYouGoReversedAmount = builder.payAsYouGoReversedAmount;
        this.requestId = builder.requestId;
        this.transferAmount = builder.transferAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFundAccountCanWithdrawAmountResponseBody create() {
        return builder().build();
    }

    /**
     * @return canOriginalWithdrawAmount
     */
    public String getCanOriginalWithdrawAmount() {
        return this.canOriginalWithdrawAmount;
    }

    /**
     * @return canWithdrawAmount
     */
    public String getCanWithdrawAmount() {
        return this.canWithdrawAmount;
    }

    /**
     * @return cannotOriginalWithdrawAmount
     */
    public String getCannotOriginalWithdrawAmount() {
        return this.cannotOriginalWithdrawAmount;
    }

    /**
     * @return cashAmount
     */
    public String getCashAmount() {
        return this.cashAmount;
    }

    /**
     * @return creditMemoAmount
     */
    public String getCreditMemoAmount() {
        return this.creditMemoAmount;
    }

    /**
     * @return currentMonthUnclearedAmount
     */
    public String getCurrentMonthUnclearedAmount() {
        return this.currentMonthUnclearedAmount;
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
     * @return payAsYouGoReversedAmount
     */
    public String getPayAsYouGoReversedAmount() {
        return this.payAsYouGoReversedAmount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transferAmount
     */
    public String getTransferAmount() {
        return this.transferAmount;
    }

    public static final class Builder {
        private String canOriginalWithdrawAmount; 
        private String canWithdrawAmount; 
        private String cannotOriginalWithdrawAmount; 
        private String cashAmount; 
        private String creditMemoAmount; 
        private String currentMonthUnclearedAmount; 
        private String historyMonthUnclearedAmount; 
        private Object metadata; 
        private String payAsYouGoReversedAmount; 
        private String requestId; 
        private String transferAmount; 

        /**
         * CanOriginalWithdrawAmount.
         */
        public Builder canOriginalWithdrawAmount(String canOriginalWithdrawAmount) {
            this.canOriginalWithdrawAmount = canOriginalWithdrawAmount;
            return this;
        }

        /**
         * CanWithdrawAmount.
         */
        public Builder canWithdrawAmount(String canWithdrawAmount) {
            this.canWithdrawAmount = canWithdrawAmount;
            return this;
        }

        /**
         * CannotOriginalWithdrawAmount.
         */
        public Builder cannotOriginalWithdrawAmount(String cannotOriginalWithdrawAmount) {
            this.cannotOriginalWithdrawAmount = cannotOriginalWithdrawAmount;
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
         * CreditMemoAmount.
         */
        public Builder creditMemoAmount(String creditMemoAmount) {
            this.creditMemoAmount = creditMemoAmount;
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
         * PayAsYouGoReversedAmount.
         */
        public Builder payAsYouGoReversedAmount(String payAsYouGoReversedAmount) {
            this.payAsYouGoReversedAmount = payAsYouGoReversedAmount;
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
         * TransferAmount.
         */
        public Builder transferAmount(String transferAmount) {
            this.transferAmount = transferAmount;
            return this;
        }

        public GetFundAccountCanWithdrawAmountResponseBody build() {
            return new GetFundAccountCanWithdrawAmountResponseBody(this);
        } 

    } 

}
