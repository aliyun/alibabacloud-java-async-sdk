// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link ConfigLayer4RuleRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer4RuleRequest</p>
 */
public class ConfigLayer4RuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Listeners")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listeners;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyEnable")
    private Long proxyEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsTimeout")
    private UsTimeout usTimeout;

    private ConfigLayer4RuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listeners = builder.listeners;
        this.proxyEnable = builder.proxyEnable;
        this.usTimeout = builder.usTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigLayer4RuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    /**
     * @return proxyEnable
     */
    public Long getProxyEnable() {
        return this.proxyEnable;
    }

    /**
     * @return usTimeout
     */
    public UsTimeout getUsTimeout() {
        return this.usTimeout;
    }

    public static final class Builder extends Request.Builder<ConfigLayer4RuleRequest, Builder> {
        private String regionId; 
        private String listeners; 
        private Long proxyEnable; 
        private UsTimeout usTimeout; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer4RuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listeners = request.listeners;
            this.proxyEnable = request.proxyEnable;
            this.usTimeout = request.usTimeout;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;InstanceId&quot;:&quot;xxxxxx-xxxxxx-xxxxxx-xxxxxxx&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:80,&quot;BackendPort&quot;:5,&quot;RealServers&quot;:&quot;1.1.1.1&quot;,&quot;2.2.2.2&quot;}]</p>
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        /**
         * ProxyEnable.
         */
        public Builder proxyEnable(Long proxyEnable) {
            this.putQueryParameter("ProxyEnable", proxyEnable);
            this.proxyEnable = proxyEnable;
            return this;
        }

        /**
         * UsTimeout.
         */
        public Builder usTimeout(UsTimeout usTimeout) {
            String usTimeoutShrink = shrink(usTimeout, "UsTimeout", "json");
            this.putQueryParameter("UsTimeout", usTimeoutShrink);
            this.usTimeout = usTimeout;
            return this;
        }

        @Override
        public ConfigLayer4RuleRequest build() {
            return new ConfigLayer4RuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link ConfigLayer4RuleRequest} extends {@link TeaModel}
     *
     * <p>ConfigLayer4RuleRequest</p>
     */
    public static class UsTimeout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectTimeout")
        private Long connectTimeout;

        @com.aliyun.core.annotation.NameInMap("RsTimeout")
        private Long rsTimeout;

        private UsTimeout(Builder builder) {
            this.connectTimeout = builder.connectTimeout;
            this.rsTimeout = builder.rsTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsTimeout create() {
            return builder().build();
        }

        /**
         * @return connectTimeout
         */
        public Long getConnectTimeout() {
            return this.connectTimeout;
        }

        /**
         * @return rsTimeout
         */
        public Long getRsTimeout() {
            return this.rsTimeout;
        }

        public static final class Builder {
            private Long connectTimeout; 
            private Long rsTimeout; 

            private Builder() {
            } 

            private Builder(UsTimeout model) {
                this.connectTimeout = model.connectTimeout;
                this.rsTimeout = model.rsTimeout;
            } 

            /**
             * ConnectTimeout.
             */
            public Builder connectTimeout(Long connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * RsTimeout.
             */
            public Builder rsTimeout(Long rsTimeout) {
                this.rsTimeout = rsTimeout;
                return this;
            }

            public UsTimeout build() {
                return new UsTimeout(this);
            } 

        } 

    }
}
