// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteOpaStrategyNewRequest} extends {@link RequestModel}
 *
 * <p>DeleteOpaStrategyNewRequest</p>
 */
public class DeleteOpaStrategyNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyIds")
    private java.util.List < Long > strategyIds;

    private DeleteOpaStrategyNewRequest(Builder builder) {
        super(builder);
        this.strategyIds = builder.strategyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOpaStrategyNewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return strategyIds
     */
    public java.util.List < Long > getStrategyIds() {
        return this.strategyIds;
    }

    public static final class Builder extends Request.Builder<DeleteOpaStrategyNewRequest, Builder> {
        private java.util.List < Long > strategyIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOpaStrategyNewRequest request) {
            super(request);
            this.strategyIds = request.strategyIds;
        } 

        /**
         * <p>The IDs of rules.</p>
         */
        public Builder strategyIds(java.util.List < Long > strategyIds) {
            this.putQueryParameter("StrategyIds", strategyIds);
            this.strategyIds = strategyIds;
            return this;
        }

        @Override
        public DeleteOpaStrategyNewRequest build() {
            return new DeleteOpaStrategyNewRequest(this);
        } 

    } 

}
