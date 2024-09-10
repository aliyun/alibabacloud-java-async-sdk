// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySoarStrategySubscribeRequest} extends {@link RequestModel}
 *
 * <p>ModifySoarStrategySubscribeRequest</p>
 */
public class ModifySoarStrategySubscribeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean subscribeStatus;

    private ModifySoarStrategySubscribeRequest(Builder builder) {
        super(builder);
        this.strategyId = builder.strategyId;
        this.subscribeStatus = builder.subscribeStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySoarStrategySubscribeRequest create() {
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

    /**
     * @return subscribeStatus
     */
    public Boolean getSubscribeStatus() {
        return this.subscribeStatus;
    }

    public static final class Builder extends Request.Builder<ModifySoarStrategySubscribeRequest, Builder> {
        private Long strategyId; 
        private Boolean subscribeStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifySoarStrategySubscribeRequest request) {
            super(request);
            this.strategyId = request.strategyId;
            this.subscribeStatus = request.subscribeStatus;
        } 

        /**
         * The ID of the policy.
         * <p>
         * 
         * >  You can call the [DescribeSoarStrategies](~~DescribeSoarStrategies~~) operation to obtain the ID.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * Specifies whether to create the policy template. Valid values:
         * <p>
         * 
         * *   true: creates the policy template
         * *   false: deletes the policy template
         */
        public Builder subscribeStatus(Boolean subscribeStatus) {
            this.putQueryParameter("SubscribeStatus", subscribeStatus);
            this.subscribeStatus = subscribeStatus;
            return this;
        }

        @Override
        public ModifySoarStrategySubscribeRequest build() {
            return new ModifySoarStrategySubscribeRequest(this);
        } 

    } 

}
