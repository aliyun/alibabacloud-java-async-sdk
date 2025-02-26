// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link UpdateCustomDomainInput} extends {@link TeaModel}
 *
 * <p>UpdateCustomDomainInput</p>
 */
public class UpdateCustomDomainInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private AuthConfig authConfig;

    @com.aliyun.core.annotation.NameInMap("certConfig")
    private CertConfig certConfig;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("routeConfig")
    private RouteConfig routeConfig;

    @com.aliyun.core.annotation.NameInMap("tlsConfig")
    private TLSConfig tlsConfig;

    @com.aliyun.core.annotation.NameInMap("wafConfig")
    private WAFConfig wafConfig;

    private UpdateCustomDomainInput(Builder builder) {
        this.authConfig = builder.authConfig;
        this.certConfig = builder.certConfig;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
        this.tlsConfig = builder.tlsConfig;
        this.wafConfig = builder.wafConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomDomainInput create() {
        return builder().build();
    }

    /**
     * @return authConfig
     */
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return certConfig
     */
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return routeConfig
     */
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    /**
     * @return tlsConfig
     */
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    /**
     * @return wafConfig
     */
    public WAFConfig getWafConfig() {
        return this.wafConfig;
    }

    public static final class Builder {
        private AuthConfig authConfig; 
        private CertConfig certConfig; 
        private String protocol; 
        private RouteConfig routeConfig; 
        private TLSConfig tlsConfig; 
        private WAFConfig wafConfig; 

        /**
         * authConfig.
         */
        public Builder authConfig(AuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * certConfig.
         */
        public Builder certConfig(CertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * routeConfig.
         */
        public Builder routeConfig(RouteConfig routeConfig) {
            this.routeConfig = routeConfig;
            return this;
        }

        /**
         * tlsConfig.
         */
        public Builder tlsConfig(TLSConfig tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }

        /**
         * wafConfig.
         */
        public Builder wafConfig(WAFConfig wafConfig) {
            this.wafConfig = wafConfig;
            return this;
        }

        public UpdateCustomDomainInput build() {
            return new UpdateCustomDomainInput(this);
        } 

    } 

}
