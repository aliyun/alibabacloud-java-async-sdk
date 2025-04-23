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
 * {@link UpdateGtmAccessStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateGtmAccessStrategyRequest</p>
 */
public class UpdateGtmAccessStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLines")
    private String accessLines;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultAddrPoolId")
    private String defaultAddrPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailoverAddrPoolId")
    private String failoverAddrPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
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
         * <p>The line codes of access regions.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;default&quot;, &quot;mobile&quot;]</p>
         */
        public Builder accessLines(String accessLines) {
            this.putQueryParameter("AccessLines", accessLines);
            this.accessLines = accessLines;
            return this;
        }

        /**
         * <p>The ID of the default address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>hrsix</p>
         */
        public Builder defaultAddrPoolId(String defaultAddrPoolId) {
            this.putQueryParameter("DefaultAddrPoolId", defaultAddrPoolId);
            this.defaultAddrPoolId = defaultAddrPoolId;
            return this;
        }

        /**
         * <p>The ID of the failover address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>hrsyw</p>
         */
        public Builder failoverAddrPoolId(String failoverAddrPoolId) {
            this.putQueryParameter("FailoverAddrPoolId", failoverAddrPoolId);
            this.failoverAddrPoolId = failoverAddrPoolId;
            return this;
        }

        /**
         * <p>The language used by the user.</p>
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
         * <p>The ID of the access policy that you want to query for the GTM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hrmxc</p>
         */
        public Builder strategyId(String strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>The name of the access policy.</p>
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
