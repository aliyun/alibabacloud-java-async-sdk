// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DeleteVirusScanScheduledStrategiesRequest} extends {@link RequestModel}
 *
 * <p>DeleteVirusScanScheduledStrategiesRequest</p>
 */
public class DeleteVirusScanScheduledStrategiesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> strategyIds;

    private DeleteVirusScanScheduledStrategiesRequest(Builder builder) {
        super(builder);
        this.strategyIds = builder.strategyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVirusScanScheduledStrategiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return strategyIds
     */
    public java.util.List<String> getStrategyIds() {
        return this.strategyIds;
    }

    public static final class Builder extends Request.Builder<DeleteVirusScanScheduledStrategiesRequest, Builder> {
        private java.util.List<String> strategyIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVirusScanScheduledStrategiesRequest request) {
            super(request);
            this.strategyIds = request.strategyIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder strategyIds(java.util.List<String> strategyIds) {
            this.putBodyParameter("StrategyIds", strategyIds);
            this.strategyIds = strategyIds;
            return this;
        }

        @Override
        public DeleteVirusScanScheduledStrategiesRequest build() {
            return new DeleteVirusScanScheduledStrategiesRequest(this);
        } 

    } 

}
