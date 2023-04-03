// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAccessStrategyAvailableConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeDnsGtmAccessStrategyAvailableConfigRequest</p>
 */
public class DescribeDnsGtmAccessStrategyAvailableConfigRequest extends Request {
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

    private DescribeDnsGtmAccessStrategyAvailableConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.strategyMode = builder.strategyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAccessStrategyAvailableConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDnsGtmAccessStrategyAvailableConfigRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private String strategyMode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDnsGtmAccessStrategyAvailableConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.strategyMode = request.strategyMode;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The type of the access policy. Valid values:
         * <p>
         * 
         * *   GEO: geographical location-based
         * *   LATENCY: latency-based
         */
        public Builder strategyMode(String strategyMode) {
            this.putQueryParameter("StrategyMode", strategyMode);
            this.strategyMode = strategyMode;
            return this;
        }

        @Override
        public DescribeDnsGtmAccessStrategyAvailableConfigRequest build() {
            return new DescribeDnsGtmAccessStrategyAvailableConfigRequest(this);
        } 

    } 

}
