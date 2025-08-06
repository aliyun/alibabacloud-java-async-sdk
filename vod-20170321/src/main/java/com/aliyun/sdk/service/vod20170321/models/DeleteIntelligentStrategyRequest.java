// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DeleteIntelligentStrategyRequest} extends {@link RequestModel}
 *
 * <p>DeleteIntelligentStrategyRequest</p>
 */
public class DeleteIntelligentStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyId;

    private DeleteIntelligentStrategyRequest(Builder builder) {
        super(builder);
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIntelligentStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<DeleteIntelligentStrategyRequest, Builder> {
        private String strategyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIntelligentStrategyRequest request) {
            super(request);
            this.strategyId = request.strategyId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder strategyId(String strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public DeleteIntelligentStrategyRequest build() {
            return new DeleteIntelligentStrategyRequest(this);
        } 

    } 

}
