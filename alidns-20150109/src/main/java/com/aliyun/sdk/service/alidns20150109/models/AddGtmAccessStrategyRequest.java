// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddGtmAccessStrategyRequest} extends {@link RequestModel}
 *
 * <p>AddGtmAccessStrategyRequest</p>
 */
public class AddGtmAccessStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLines")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessLines;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultAddrPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defaultAddrPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailoverAddrPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String failoverAddrPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyName;

    private AddGtmAccessStrategyRequest(Builder builder) {
        super(builder);
        this.accessLines = builder.accessLines;
        this.defaultAddrPoolId = builder.defaultAddrPoolId;
        this.failoverAddrPoolId = builder.failoverAddrPoolId;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.strategyName = builder.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGtmAccessStrategyRequest create() {
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
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    public static final class Builder extends Request.Builder<AddGtmAccessStrategyRequest, Builder> {
        private String accessLines; 
        private String defaultAddrPoolId; 
        private String failoverAddrPoolId; 
        private String instanceId; 
        private String lang; 
        private String strategyName; 

        private Builder() {
            super();
        } 

        private Builder(AddGtmAccessStrategyRequest request) {
            super(request);
            this.accessLines = request.accessLines;
            this.defaultAddrPoolId = request.defaultAddrPoolId;
            this.failoverAddrPoolId = request.failoverAddrPoolId;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.strategyName = request.strategyName;
        } 

        /**
         * <p>The line codes of access regions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;default&quot;, &quot;drpeng&quot;]</p>
         */
        public Builder accessLines(String accessLines) {
            this.putQueryParameter("AccessLines", accessLines);
            this.accessLines = accessLines;
            return this;
        }

        /**
         * <p>The ID of the default address pool.</p>
         * <p>This parameter is required.</p>
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
         * <p>If the failover address pool is not set, pass the <strong>Empty</strong> value.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the GTM instance for which you want to create an access policy.</p>
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
         * <p>The name of the access policy.</p>
         * <p>This parameter is required.</p>
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        @Override
        public AddGtmAccessStrategyRequest build() {
            return new AddGtmAccessStrategyRequest(this);
        } 

    } 

}
