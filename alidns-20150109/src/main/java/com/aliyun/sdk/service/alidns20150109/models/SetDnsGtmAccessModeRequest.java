// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDnsGtmAccessModeRequest} extends {@link RequestModel}
 *
 * <p>SetDnsGtmAccessModeRequest</p>
 */
public class SetDnsGtmAccessModeRequest extends Request {
    @Query
    @NameInMap("AccessMode")
    @Validation(required = true)
    private String accessMode;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("StrategyId")
    @Validation(required = true)
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

        private Builder(SetDnsGtmAccessModeRequest response) {
            super(response);
            this.accessMode = response.accessMode;
            this.lang = response.lang;
            this.strategyId = response.strategyId;
        } 

        /**
         * AccessMode.
         */
        public Builder accessMode(String accessMode) {
            this.putQueryParameter("AccessMode", accessMode);
            this.accessMode = accessMode;
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
         * StrategyId.
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
