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
 * {@link GetFundAccountCanRecycleAmountRequest} extends {@link RequestModel}
 *
 * <p>GetFundAccountCanRecycleAmountRequest</p>
 */
public class GetFundAccountCanRecycleAmountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Currency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecycleFromFundAccountId")
    private String recycleFromFundAccountId;

    private GetFundAccountCanRecycleAmountRequest(Builder builder) {
        super(builder);
        this.currency = builder.currency;
        this.recycleFromFundAccountId = builder.recycleFromFundAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFundAccountCanRecycleAmountRequest create() {
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
     * @return recycleFromFundAccountId
     */
    public String getRecycleFromFundAccountId() {
        return this.recycleFromFundAccountId;
    }

    public static final class Builder extends Request.Builder<GetFundAccountCanRecycleAmountRequest, Builder> {
        private String currency; 
        private String recycleFromFundAccountId; 

        private Builder() {
            super();
        } 

        private Builder(GetFundAccountCanRecycleAmountRequest request) {
            super(request);
            this.currency = request.currency;
            this.recycleFromFundAccountId = request.recycleFromFundAccountId;
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
         * RecycleFromFundAccountId.
         */
        public Builder recycleFromFundAccountId(String recycleFromFundAccountId) {
            this.putBodyParameter("RecycleFromFundAccountId", recycleFromFundAccountId);
            this.recycleFromFundAccountId = recycleFromFundAccountId;
            return this;
        }

        @Override
        public GetFundAccountCanRecycleAmountRequest build() {
            return new GetFundAccountCanRecycleAmountRequest(this);
        } 

    } 

}
