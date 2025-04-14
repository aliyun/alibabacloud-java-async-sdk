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
 * {@link GetFundAccountAvailableAmountRequest} extends {@link RequestModel}
 *
 * <p>GetFundAccountAvailableAmountRequest</p>
 */
public class GetFundAccountAvailableAmountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FundAccountId")
    private String fundAccountId;

    private GetFundAccountAvailableAmountRequest(Builder builder) {
        super(builder);
        this.fundAccountId = builder.fundAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFundAccountAvailableAmountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fundAccountId
     */
    public String getFundAccountId() {
        return this.fundAccountId;
    }

    public static final class Builder extends Request.Builder<GetFundAccountAvailableAmountRequest, Builder> {
        private String fundAccountId; 

        private Builder() {
            super();
        } 

        private Builder(GetFundAccountAvailableAmountRequest request) {
            super(request);
            this.fundAccountId = request.fundAccountId;
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
        public GetFundAccountAvailableAmountRequest build() {
            return new GetFundAccountAvailableAmountRequest(this);
        } 

    } 

}
