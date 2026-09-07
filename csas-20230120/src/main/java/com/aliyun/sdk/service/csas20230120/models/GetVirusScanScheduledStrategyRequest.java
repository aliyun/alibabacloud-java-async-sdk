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
 * {@link GetVirusScanScheduledStrategyRequest} extends {@link RequestModel}
 *
 * <p>GetVirusScanScheduledStrategyRequest</p>
 */
public class GetVirusScanScheduledStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private String strategyId;

    private GetVirusScanScheduledStrategyRequest(Builder builder) {
        super(builder);
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVirusScanScheduledStrategyRequest create() {
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

    public static final class Builder extends Request.Builder<GetVirusScanScheduledStrategyRequest, Builder> {
        private String strategyId; 

        private Builder() {
            super();
        } 

        private Builder(GetVirusScanScheduledStrategyRequest request) {
            super(request);
            this.strategyId = request.strategyId;
        } 

        /**
         * <p>The ID of the scheduled virus scan policy. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListVirusScanScheduledStrategies~~">ListVirusScanScheduledStrategies</a>: Lists scheduled virus scan policies.</li>
         * <li><a href="~~CreateVirusScanScheduledStrategy~~">CreateVirusScanScheduledStrategy</a>: Creates a scheduled virus scan policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vc-strategy-8a3f6c2e91b7****</p>
         */
        public Builder strategyId(String strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public GetVirusScanScheduledStrategyRequest build() {
            return new GetVirusScanScheduledStrategyRequest(this);
        } 

    } 

}
