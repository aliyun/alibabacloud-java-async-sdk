// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGtmAccessStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateGtmAccessStrategyRequest</p>
 */
public class UpdateGtmAccessStrategyRequest extends Request {
    @Query
    @NameInMap("AccessLines")
    private String accessLines;

    @Query
    @NameInMap("DefaultAddrPoolId")
    private String defaultAddrPoolId;

    @Query
    @NameInMap("FailoverAddrPoolId")
    private String failoverAddrPoolId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("StrategyId")
    @Validation(required = true)
    private String strategyId;

    @Query
    @NameInMap("StrategyName")
    private String strategyName;

    private UpdateGtmAccessStrategyRequest(Builder builder) {
        super(builder);
        this.accessLines = builder.accessLines;
        this.defaultAddrPoolId = builder.defaultAddrPoolId;
        this.failoverAddrPoolId = builder.failoverAddrPoolId;
        this.lang = builder.lang;
        this.strategyId = builder.strategyId;
        this.strategyName = builder.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGtmAccessStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessLines
     */
    public String getAccessLines() {
        return this.accessLines;
    }

    /**
     * @return defaultAddrPoolId
     */
    public String getDefaultAddrPoolId() {
        return this.defaultAddrPoolId;
    }

    /**
     * @return failoverAddrPoolId
     */
    public String getFailoverAddrPoolId() {
        return this.failoverAddrPoolId;
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

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    public static final class Builder extends Request.Builder<UpdateGtmAccessStrategyRequest, Builder> {
        private String accessLines; 
        private String defaultAddrPoolId; 
        private String failoverAddrPoolId; 
        private String lang; 
        private String strategyId; 
        private String strategyName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGtmAccessStrategyRequest request) {
            super(request);
            this.accessLines = request.accessLines;
            this.defaultAddrPoolId = request.defaultAddrPoolId;
            this.failoverAddrPoolId = request.failoverAddrPoolId;
            this.lang = request.lang;
            this.strategyId = request.strategyId;
            this.strategyName = request.strategyName;
        } 

        /**
         * The line codes of access regions.
         */
        public Builder accessLines(String accessLines) {
            this.putQueryParameter("AccessLines", accessLines);
            this.accessLines = accessLines;
            return this;
        }

        /**
         * The ID of the default address pool.
         */
        public Builder defaultAddrPoolId(String defaultAddrPoolId) {
            this.putQueryParameter("DefaultAddrPoolId", defaultAddrPoolId);
            this.defaultAddrPoolId = defaultAddrPoolId;
            return this;
        }

        /**
         * The ID of the failover address pool.
         */
        public Builder failoverAddrPoolId(String failoverAddrPoolId) {
            this.putQueryParameter("FailoverAddrPoolId", failoverAddrPoolId);
            this.failoverAddrPoolId = failoverAddrPoolId;
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
         * The ID of the access policy that you want to query for the GTM instance.
         */
        public Builder strategyId(String strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * The name of the access policy.
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        @Override
        public UpdateGtmAccessStrategyRequest build() {
            return new UpdateGtmAccessStrategyRequest(this);
        } 

    } 

}
