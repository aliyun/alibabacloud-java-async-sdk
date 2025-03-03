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
 * {@link GetFundAccountCanTransferAmountRequest} extends {@link RequestModel}
 *
 * <p>GetFundAccountCanTransferAmountRequest</p>
 */
public class GetFundAccountCanTransferAmountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Currency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FundAccountId")
    private String fundAccountId;

    private GetFundAccountCanTransferAmountRequest(Builder builder) {
        super(builder);
        this.currency = builder.currency;
        this.fundAccountId = builder.fundAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFundAccountCanTransferAmountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getFundAccountId() {
        return this.fundAccountId;
    }

    public static final class Builder extends Request.Builder<GetFundAccountCanTransferAmountRequest, Builder> {
        private String currency; 
        private String fundAccountId; 

        private Builder() {
            super();
        } 

        private Builder(GetFundAccountCanTransferAmountRequest request) {
            super(request);
            this.currency = request.currency;
            this.fundAccountId = request.fundAccountId;
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
        public Builder fundAccountId(String fundAccountId) {
            this.putBodyParameter("FundAccountId", fundAccountId);
            this.fundAccountId = fundAccountId;
            return this;
        }

        @Override
        public GetFundAccountCanTransferAmountRequest build() {
            return new GetFundAccountCanTransferAmountRequest(this);
        } 

    } 

}
