// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link UpdateWebCustomDomainInput} extends {@link TeaModel}
 *
 * <p>UpdateWebCustomDomainInput</p>
 */
public class UpdateWebCustomDomainInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultForwardingAppName")
    private String defaultForwardingAppName;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("RouteConfig")
    private RouteConfig routeConfig;

    @com.aliyun.core.annotation.NameInMap("WebCertConfig")
    private WebCertConfig webCertConfig;

    @com.aliyun.core.annotation.NameInMap("WebTLSConfig")
    private WebTLSConfig webTLSConfig;

    @com.aliyun.core.annotation.NameInMap("WebWAFConfig")
    private WebWAFConfig webWAFConfig;

    private UpdateWebCustomDomainInput(Builder builder) {
        this.defaultForwardingAppName = builder.defaultForwardingAppName;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
        this.webCertConfig = builder.webCertConfig;
        this.webTLSConfig = builder.webTLSConfig;
        this.webWAFConfig = builder.webWAFConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebCustomDomainInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultForwardingAppName
     */
    public String getDefaultForwardingAppName() {
        return this.defaultForwardingAppName;
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
     * @return webCertConfig
     */
    public WebCertConfig getWebCertConfig() {
        return this.webCertConfig;
    }

    /**
     * @return webTLSConfig
     */
    public WebTLSConfig getWebTLSConfig() {
        return this.webTLSConfig;
    }

    /**
     * @return webWAFConfig
     */
    public WebWAFConfig getWebWAFConfig() {
        return this.webWAFConfig;
    }

    public static final class Builder {
        private String defaultForwardingAppName; 
        private String protocol; 
        private RouteConfig routeConfig; 
        private WebCertConfig webCertConfig; 
        private WebTLSConfig webTLSConfig; 
        private WebWAFConfig webWAFConfig; 

        private Builder() {
        } 

        private Builder(UpdateWebCustomDomainInput model) {
            this.defaultForwardingAppName = model.defaultForwardingAppName;
            this.protocol = model.protocol;
            this.routeConfig = model.routeConfig;
            this.webCertConfig = model.webCertConfig;
            this.webTLSConfig = model.webTLSConfig;
            this.webWAFConfig = model.webWAFConfig;
        } 

        /**
         * <p>The name of the application to which data is forwarded by the domain name by default.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        public Builder defaultForwardingAppName(String defaultForwardingAppName) {
            this.defaultForwardingAppName = defaultForwardingAppName;
            return this;
        }

        /**
         * <p>The protocol type that is supported by the custom domain name. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong>: Only HTTP is supported.</li>
         * <li><strong>HTTPS</strong>: Only HTTPS is supported.</li>
         * <li><strong>HTTP,HTTPS</strong>: Both HTTP and HTTPS are supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The route configuration.</p>
         */
        public Builder routeConfig(RouteConfig routeConfig) {
            this.routeConfig = routeConfig;
            return this;
        }

        /**
         * <p>The information about the HTTPS certificate.</p>
         */
        public Builder webCertConfig(WebCertConfig webCertConfig) {
            this.webCertConfig = webCertConfig;
            return this;
        }

        /**
         * <p>The Transport Layer Security (TLS) configurations.</p>
         */
        public Builder webTLSConfig(WebTLSConfig webTLSConfig) {
            this.webTLSConfig = webTLSConfig;
            return this;
        }

        /**
         * <p>The Web Application Firewall (WAF) configurations.</p>
         */
        public Builder webWAFConfig(WebWAFConfig webWAFConfig) {
            this.webWAFConfig = webWAFConfig;
            return this;
        }

        public UpdateWebCustomDomainInput build() {
            return new UpdateWebCustomDomainInput(this);
        } 

    } 

}
