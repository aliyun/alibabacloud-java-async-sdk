// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDnsGtmAccessModeRequest} extends {@link RequestModel}
 *
 * <p>SetDnsGtmAccessModeRequest</p>
 */
public class SetDnsGtmAccessModeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyId;

    private SetDnsGtmAccessModeRequest(Builder builder) {
        super(builder);
        this.accessMode = builder.accessMode;
        this.lang = builder.lang;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDnsGtmAccessModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessMode
     */
    public String getAccessMode() {
        return this.accessMode;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<SetDnsGtmAccessModeRequest, Builder> {
        private String accessMode; 
        private String lang; 
        private String strategyId; 

        private Builder() {
            super();
        } 

        private Builder(SetDnsGtmAccessModeRequest request) {
            super(request);
            this.accessMode = request.accessMode;
            this.lang = request.lang;
            this.strategyId = request.strategyId;
        } 

        /**
         * <p>The switchover policy for primary and secondary address pool sets. Valid values:</p>
         * <ul>
         * <li>AUTO: performs automatic switchover between the primary and secondary address pool sets upon failures.</li>
         * <li>DEFAULT: the primary address pool set</li>
         * <li>FAILOVER: the secondary address pool set</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder accessMode(String accessMode) {
            this.putQueryParameter("AccessMode", accessMode);
            this.accessMode = accessMode;
            return this;
        }

        /**
         * <p>The language of the values for specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
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
         * <p>The policy ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>strategyId</p>
         */
        public Builder strategyId(String strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public SetDnsGtmAccessModeRequest build() {
            return new SetDnsGtmAccessModeRequest(this);
        } 

    } 

}
