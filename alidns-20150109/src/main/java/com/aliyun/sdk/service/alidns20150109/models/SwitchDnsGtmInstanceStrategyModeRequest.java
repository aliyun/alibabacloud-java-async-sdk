// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchDnsGtmInstanceStrategyModeRequest} extends {@link RequestModel}
 *
 * <p>SwitchDnsGtmInstanceStrategyModeRequest</p>
 */
public class SwitchDnsGtmInstanceStrategyModeRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("StrategyMode")
    @Validation(required = true)
    private String strategyMode;

    private SwitchDnsGtmInstanceStrategyModeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.strategyMode = builder.strategyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchDnsGtmInstanceStrategyModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return strategyMode
     */
    public String getStrategyMode() {
        return this.strategyMode;
    }

    public static final class Builder extends Request.Builder<SwitchDnsGtmInstanceStrategyModeRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private String strategyMode; 

        private Builder() {
            super();
        } 

        private Builder(SwitchDnsGtmInstanceStrategyModeRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.lang = response.lang;
            this.strategyMode = response.strategyMode;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * StrategyMode.
         */
        public Builder strategyMode(String strategyMode) {
            this.putQueryParameter("StrategyMode", strategyMode);
            this.strategyMode = strategyMode;
            return this;
        }

        @Override
        public SwitchDnsGtmInstanceStrategyModeRequest build() {
            return new SwitchDnsGtmInstanceStrategyModeRequest(this);
        } 

    } 

}
