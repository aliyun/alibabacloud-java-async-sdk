// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStrategyTemplateDetailRequest} extends {@link RequestModel}
 *
 * <p>GetStrategyTemplateDetailRequest</p>
 */
public class GetStrategyTemplateDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private Long strategyId;

    private GetStrategyTemplateDetailRequest(Builder builder) {
        super(builder);
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStrategyTemplateDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetStrategyTemplateDetailRequest, Builder> {
        private Long strategyId; 

        private Builder() {
            super();
        } 

        private Builder(GetStrategyTemplateDetailRequest request) {
            super(request);
            this.strategyId = request.strategyId;
        } 

        /**
         * The ID of the template.
         * <p>
         * 
         * >  You can call the [GetOpaStrategyTemplateSummary](~~GetOpaStrategyTemplateSummary~~) operation to query the IDs of templates.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public GetStrategyTemplateDetailRequest build() {
            return new GetStrategyTemplateDetailRequest(this);
        } 

    } 

}
