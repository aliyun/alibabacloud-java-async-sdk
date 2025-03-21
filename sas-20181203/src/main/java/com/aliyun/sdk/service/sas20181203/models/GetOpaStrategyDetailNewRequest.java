// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetOpaStrategyDetailNewRequest} extends {@link RequestModel}
 *
 * <p>GetOpaStrategyDetailNewRequest</p>
 */
public class GetOpaStrategyDetailNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private Long strategyId;

    private GetOpaStrategyDetailNewRequest(Builder builder) {
        super(builder);
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpaStrategyDetailNewRequest create() {
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

    public static final class Builder extends Request.Builder<GetOpaStrategyDetailNewRequest, Builder> {
        private Long strategyId; 

        private Builder() {
            super();
        } 

        private Builder(GetOpaStrategyDetailNewRequest request) {
            super(request);
            this.strategyId = request.strategyId;
        } 

        /**
         * <p>The rule ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2623574.html">ListOpaClusterStrategyNew</a> operation to query the rule ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1349</p>
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public GetOpaStrategyDetailNewRequest build() {
            return new GetOpaStrategyDetailNewRequest(this);
        } 

    } 

}
