// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link SwitchDnsGtmInstanceStrategyModeRequest} extends {@link RequestModel}
 *
 * <p>SwitchDnsGtmInstanceStrategyModeRequest</p>
 */
public class SwitchDnsGtmInstanceStrategyModeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyMode")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(SwitchDnsGtmInstanceStrategyModeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.strategyMode = request.strategyMode;
        } 

        /**
         * <p>The ID of the GTM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The access policy type. Valid values:</p>
         * <ul>
         * <li>GEO: geographical location-based</li>
         * <li>LATENCY: latency-based</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GEO</p>
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
