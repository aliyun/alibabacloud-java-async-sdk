// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomDomainInput} extends {@link TeaModel}
 *
 * <p>CreateCustomDomainInput</p>
 */
public class CreateCustomDomainInput extends TeaModel {
    @NameInMap("certConfig")
    private CertConfig certConfig;

    @NameInMap("domainName")
    @Validation(maxLength = 256, minLength = 1)
    private String domainName;

    @NameInMap("protocol")
    private String protocol;

    @NameInMap("routeConfig")
    private RouteConfig routeConfig;

    @NameInMap("tlsConfig")
    private TLSConfig tlsConfig;

    @NameInMap("wafConfig")
    private WAFConfig wafConfig;

    private CreateCustomDomainInput(Builder builder) {
        this.certConfig = builder.certConfig;
        this.domainName = builder.domainName;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
        this.tlsConfig = builder.tlsConfig;
        this.wafConfig = builder.wafConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomDomainInput create() {
        return builder().build();
    }

    /**
     * @return certConfig
     */
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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
        private CertConfig certConfig; 
        private String domainName; 
        private String protocol; 
        private RouteConfig routeConfig; 
        private TLSConfig tlsConfig; 
        private WAFConfig wafConfig; 

        /**
         * certConfig.
         */
        public Builder certConfig(CertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * domainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
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

        public CreateCustomDomainInput build() {
            return new CreateCustomDomainInput(this);
        } 

    } 

}
