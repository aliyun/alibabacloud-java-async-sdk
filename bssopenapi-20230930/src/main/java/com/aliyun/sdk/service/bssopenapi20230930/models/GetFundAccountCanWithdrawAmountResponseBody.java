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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetFundAccountCanWithdrawAmountResponseBody model) {
            this.canOriginalWithdrawAmount = model.canOriginalWithdrawAmount;
            this.canWithdrawAmount = model.canWithdrawAmount;
            this.cannotOriginalWithdrawAmount = model.cannotOriginalWithdrawAmount;
            this.cashAmount = model.cashAmount;
            this.creditMemoAmount = model.creditMemoAmount;
            this.currentMonthUnclearedAmount = model.currentMonthUnclearedAmount;
            this.historyMonthUnclearedAmount = model.historyMonthUnclearedAmount;
            this.metadata = model.metadata;
            this.payAsYouGoReversedAmount = model.payAsYouGoReversedAmount;
            this.requestId = model.requestId;
            this.transferAmount = model.transferAmount;
        } 

        /**
         * <p>Amount withdrawable via original payment method</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder canOriginalWithdrawAmount(String canOriginalWithdrawAmount) {
            this.canOriginalWithdrawAmount = canOriginalWithdrawAmount;
            return this;
        }

        /**
         * <p>Withdrawable amount = Cash balance - Transfer ledger amount - (Outstanding invoice amount + Historical months unsettled amount + Current month unsettled amount - Transfer ledger amount) - Pay-as-you-go reserved amount</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder canWithdrawAmount(String canWithdrawAmount) {
            this.canWithdrawAmount = canWithdrawAmount;
            return this;
        }

        /**
         * <p>Amount not withdrawable via original payment method</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder cannotOriginalWithdrawAmount(String cannotOriginalWithdrawAmount) {
            this.cannotOriginalWithdrawAmount = cannotOriginalWithdrawAmount;
            return this;
        }

        /**
         * <p>Cash balance</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder cashAmount(String cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }

        /**
         * <p>Outstanding invoice amount</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder creditMemoAmount(String creditMemoAmount) {
            this.creditMemoAmount = creditMemoAmount;
            return this;
        }

        /**
         * <p>Current month unsettled amount</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder currentMonthUnclearedAmount(String currentMonthUnclearedAmount) {
            this.currentMonthUnclearedAmount = currentMonthUnclearedAmount;
            return this;
        }

        /**
         * <p>Historical months unsettled amount</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder historyMonthUnclearedAmount(String historyMonthUnclearedAmount) {
            this.historyMonthUnclearedAmount = historyMonthUnclearedAmount;
            return this;
        }

        /**
         * <p>Response structure metadata</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>Pay-as-you-go reserved amount</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder payAsYouGoReversedAmount(String payAsYouGoReversedAmount) {
            this.payAsYouGoReversedAmount = payAsYouGoReversedAmount;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>DF58589C-A06C-4224-8615-7797E6474FA3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Transfer amount</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
