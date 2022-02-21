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

        private Builder(UpdateGtmAccessStrategyRequest response) {
            super(response);
            this.accessLines = response.accessLines;
            this.defaultAddrPoolId = response.defaultAddrPoolId;
            this.failoverAddrPoolId = response.failoverAddrPoolId;
            this.lang = response.lang;
            this.strategyId = response.strategyId;
            this.strategyName = response.strategyName;
        } 

        /**
         * AccessLines.
         */
        public Builder accessLines(String accessLines) {
            this.putQueryParameter("AccessLines", accessLines);
            this.accessLines = accessLines;
            return this;
        }

        /**
         * DefaultAddrPoolId.
         */
        public Builder defaultAddrPoolId(String defaultAddrPoolId) {
            this.putQueryParameter("DefaultAddrPoolId", defaultAddrPoolId);
            this.defaultAddrPoolId = defaultAddrPoolId;
            return this;
        }

        /**
         * FailoverAddrPoolId.
         */
        public Builder failoverAddrPoolId(String failoverAddrPoolId) {
            this.putQueryParameter("FailoverAddrPoolId", failoverAddrPoolId);
            this.failoverAddrPoolId = failoverAddrPoolId;
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

        /**
         * StrategyName.
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
