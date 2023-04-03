// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGtmAccessModeRequest} extends {@link RequestModel}
 *
 * <p>SetGtmAccessModeRequest</p>
 */
public class SetGtmAccessModeRequest extends Request {
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

    private SetGtmAccessModeRequest(Builder builder) {
        super(builder);
        this.accessMode = builder.accessMode;
        this.lang = builder.lang;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGtmAccessModeRequest create() {
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

    public static final class Builder extends Request.Builder<SetGtmAccessModeRequest, Builder> {
        private String accessMode; 
        private String lang; 
        private String strategyId; 

        private Builder() {
            super();
        } 

        private Builder(SetGtmAccessModeRequest request) {
            super(request);
            this.accessMode = request.accessMode;
            this.lang = request.lang;
            this.strategyId = request.strategyId;
        } 

        /**
         * The target access policy of the GTM instance. Valid values:
         * <p>
         * 
         * *   **AUTO**: Automatic switch
         * *   **DEFAULT**: Default address pool
         * *   **FAILOVER**: Failover address pool
         */
        public Builder accessMode(String accessMode) {
            this.putQueryParameter("AccessMode", accessMode);
            this.accessMode = accessMode;
            return this;
        }

        /**
         * The language used by the user.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the access policy.
         */
        public Builder strategyId(String strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public SetGtmAccessModeRequest build() {
            return new SetGtmAccessModeRequest(this);
        } 

    } 

}
