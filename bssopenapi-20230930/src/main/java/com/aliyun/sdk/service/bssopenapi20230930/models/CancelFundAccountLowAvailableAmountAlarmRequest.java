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
 * {@link CancelFundAccountLowAvailableAmountAlarmRequest} extends {@link RequestModel}
 *
 * <p>CancelFundAccountLowAvailableAmountAlarmRequest</p>
 */
public class CancelFundAccountLowAvailableAmountAlarmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FundAccountId")
    private Long fundAccountId;

    private CancelFundAccountLowAvailableAmountAlarmRequest(Builder builder) {
        super(builder);
        this.fundAccountId = builder.fundAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelFundAccountLowAvailableAmountAlarmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fundAccountId
     */
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

    public static final class Builder extends Request.Builder<CancelFundAccountLowAvailableAmountAlarmRequest, Builder> {
        private Long fundAccountId; 

        private Builder() {
            super();
        } 

        private Builder(CancelFundAccountLowAvailableAmountAlarmRequest request) {
            super(request);
            this.fundAccountId = request.fundAccountId;
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
        public CancelFundAccountLowAvailableAmountAlarmRequest build() {
            return new CancelFundAccountLowAvailableAmountAlarmRequest(this);
        } 

    } 

}
