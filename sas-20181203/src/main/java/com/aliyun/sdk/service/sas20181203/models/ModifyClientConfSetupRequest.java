// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClientConfSetupRequest} extends {@link RequestModel}
 *
 * <p>ModifyClientConfSetupRequest</p>
 */
public class ModifyClientConfSetupRequest extends Request {
    @Query
    @NameInMap("StrategyConfig")
    private String strategyConfig;

    @Query
    @NameInMap("StrategyTag")
    @Validation(required = true)
    private String strategyTag;

    @Query
    @NameInMap("StrategyTagValue")
    @Validation(required = true)
    private String strategyTagValue;

    private ModifyClientConfSetupRequest(Builder builder) {
        super(builder);
        this.strategyConfig = builder.strategyConfig;
        this.strategyTag = builder.strategyTag;
        this.strategyTagValue = builder.strategyTagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClientConfSetupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return strategyConfig
     */
    public String getStrategyConfig() {
        return this.strategyConfig;
    }

    /**
     * @return strategyTag
     */
    public String getStrategyTag() {
        return this.strategyTag;
    }

    /**
     * @return strategyTagValue
     */
    public String getStrategyTagValue() {
        return this.strategyTagValue;
    }

    public static final class Builder extends Request.Builder<ModifyClientConfSetupRequest, Builder> {
        private String strategyConfig; 
        private String strategyTag; 
        private String strategyTagValue; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClientConfSetupRequest request) {
            super(request);
            this.strategyConfig = request.strategyConfig;
            this.strategyTag = request.strategyTag;
            this.strategyTagValue = request.strategyTagValue;
        } 

        /**
         * The configurations of the Security Center agent.
         * <p>
         * 
         * *   cpu: the maximum CPU utilization that can be occupied by the Security Center agent on the server
         * *   mem: the maximum memory usage that can be occupied by the Security Center agent on the server
         */
        public Builder strategyConfig(String strategyConfig) {
            this.putQueryParameter("StrategyConfig", strategyConfig);
            this.strategyConfig = strategyConfig;
            return this;
        }

        /**
         * The type of the tag.
         */
        public Builder strategyTag(String strategyTag) {
            this.putQueryParameter("StrategyTag", strategyTag);
            this.strategyTag = strategyTag;
            return this;
        }

        /**
         * The value of the tag. Valid values:
         * <p>
         * 
         * *   major
         * *   advanced
         * *   basic
         */
        public Builder strategyTagValue(String strategyTagValue) {
            this.putQueryParameter("StrategyTagValue", strategyTagValue);
            this.strategyTagValue = strategyTagValue;
            return this;
        }

        @Override
        public ModifyClientConfSetupRequest build() {
            return new ModifyClientConfSetupRequest(this);
        } 

    } 

}
