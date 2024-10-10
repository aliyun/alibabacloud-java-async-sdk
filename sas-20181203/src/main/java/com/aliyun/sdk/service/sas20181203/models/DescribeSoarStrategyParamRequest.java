// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSoarStrategyParamRequest} extends {@link RequestModel}
 *
 * <p>DescribeSoarStrategyParamRequest</p>
 */
public class DescribeSoarStrategyParamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long strategyId;

    private DescribeSoarStrategyParamRequest(Builder builder) {
        super(builder);
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarStrategyParamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<DescribeSoarStrategyParamRequest, Builder> {
        private Long strategyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSoarStrategyParamRequest request) {
            super(request);
            this.strategyId = request.strategyId;
        } 

        /**
         * <p>The ID of the policy.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSoarStrategies~~">DescribeSoarStrategies</a> operation to obtain the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15553</p>
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public DescribeSoarStrategyParamRequest build() {
            return new DescribeSoarStrategyParamRequest(this);
        } 

    } 

}
