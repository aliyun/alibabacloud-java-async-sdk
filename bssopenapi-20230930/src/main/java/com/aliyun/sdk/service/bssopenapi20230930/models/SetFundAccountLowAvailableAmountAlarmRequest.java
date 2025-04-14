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
 * {@link SetFundAccountLowAvailableAmountAlarmRequest} extends {@link RequestModel}
 *
 * <p>SetFundAccountLowAvailableAmountAlarmRequest</p>
 */
public class SetFundAccountLowAvailableAmountAlarmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FundAccountId")
    private Long fundAccountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThresholdAmount")
    private String thresholdAmount;

    private SetFundAccountLowAvailableAmountAlarmRequest(Builder builder) {
        super(builder);
        this.fundAccountId = builder.fundAccountId;
        this.thresholdAmount = builder.thresholdAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetFundAccountLowAvailableAmountAlarmRequest create() {
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

    /**
     * @return thresholdAmount
     */
    public String getThresholdAmount() {
        return this.thresholdAmount;
    }

    public static final class Builder extends Request.Builder<SetFundAccountLowAvailableAmountAlarmRequest, Builder> {
        private Long fundAccountId; 
        private String thresholdAmount; 

        private Builder() {
            super();
        } 

        private Builder(SetFundAccountLowAvailableAmountAlarmRequest request) {
            super(request);
            this.fundAccountId = request.fundAccountId;
            this.thresholdAmount = request.thresholdAmount;
        } 

        /**
         * FundAccountId.
         */
        public Builder fundAccountId(Long fundAccountId) {
            this.putBodyParameter("FundAccountId", fundAccountId);
            this.fundAccountId = fundAccountId;
            return this;
        }

        /**
         * ThresholdAmount.
         */
        public Builder thresholdAmount(String thresholdAmount) {
            this.putBodyParameter("ThresholdAmount", thresholdAmount);
            this.thresholdAmount = thresholdAmount;
            return this;
        }

        @Override
        public SetFundAccountLowAvailableAmountAlarmRequest build() {
            return new SetFundAccountLowAvailableAmountAlarmRequest(this);
        } 

    } 

}
