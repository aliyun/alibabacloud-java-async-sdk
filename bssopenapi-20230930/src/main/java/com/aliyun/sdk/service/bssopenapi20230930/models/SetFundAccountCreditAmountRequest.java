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
 * {@link SetFundAccountCreditAmountRequest} extends {@link RequestModel}
 *
 * <p>SetFundAccountCreditAmountRequest</p>
 */
public class SetFundAccountCreditAmountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreditAmount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String creditAmount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Currency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FundAccountId")
    private Long fundAccountId;

    private SetFundAccountCreditAmountRequest(Builder builder) {
        super(builder);
        this.creditAmount = builder.creditAmount;
        this.currency = builder.currency;
        this.fundAccountId = builder.fundAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetFundAccountCreditAmountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creditAmount
     */
    public String getCreditAmount() {
        return this.creditAmount;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return fundAccountId
     */
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

    public static final class Builder extends Request.Builder<SetFundAccountCreditAmountRequest, Builder> {
        private String creditAmount; 
        private String currency; 
        private Long fundAccountId; 

        private Builder() {
            super();
        } 

        private Builder(SetFundAccountCreditAmountRequest request) {
            super(request);
            this.creditAmount = request.creditAmount;
            this.currency = request.currency;
            this.fundAccountId = request.fundAccountId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder creditAmount(String creditAmount) {
            this.putBodyParameter("CreditAmount", creditAmount);
            this.creditAmount = creditAmount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        public Builder currency(String currency) {
            this.putBodyParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * FundAccountId.
         */
        public Builder fundAccountId(Long fundAccountId) {
            this.putBodyParameter("FundAccountId", fundAccountId);
            this.fundAccountId = fundAccountId;
            return this;
        }

        @Override
        public SetFundAccountCreditAmountRequest build() {
            return new SetFundAccountCreditAmountRequest(this);
        } 

    } 

}
