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
 * {@link CreateWebCustomDomainInput} extends {@link TeaModel}
 *
 * <p>CreateWebCustomDomainInput</p>
 */
public class CreateWebCustomDomainInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultForwardingAppName")
    private String defaultForwardingAppName;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 1)
    private String domainName;

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

    private CreateWebCustomDomainInput(Builder builder) {
        this.defaultForwardingAppName = builder.defaultForwardingAppName;
        this.domainName = builder.domainName;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
        this.webCertConfig = builder.webCertConfig;
        this.webTLSConfig = builder.webTLSConfig;
        this.webWAFConfig = builder.webWAFConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebCustomDomainInput create() {
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
        private String domainName; 
        private String protocol; 
        private RouteConfig routeConfig; 
        private WebCertConfig webCertConfig; 
        private WebTLSConfig webTLSConfig; 
        private WebWAFConfig webWAFConfig; 

        private Builder() {
        } 

        private Builder(CreateWebCustomDomainInput model) {
            this.defaultForwardingAppName = model.defaultForwardingAppName;
            this.domainName = model.domainName;
            this.protocol = model.protocol;
            this.routeConfig = model.routeConfig;
            this.webCertConfig = model.webCertConfig;
            this.webTLSConfig = model.webTLSConfig;
            this.webWAFConfig = model.webWAFConfig;
        } 

        /**
         * DefaultForwardingAppName.
         */
        public Builder defaultForwardingAppName(String defaultForwardingAppName) {
            this.defaultForwardingAppName = defaultForwardingAppName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * RouteConfig.
         */
        public Builder routeConfig(RouteConfig routeConfig) {
            this.routeConfig = routeConfig;
            return this;
        }

        /**
         * WebCertConfig.
         */
        public Builder webCertConfig(WebCertConfig webCertConfig) {
            this.webCertConfig = webCertConfig;
            return this;
        }

        /**
         * WebTLSConfig.
         */
        public Builder webTLSConfig(WebTLSConfig webTLSConfig) {
            this.webTLSConfig = webTLSConfig;
            return this;
        }

        /**
         * WebWAFConfig.
         */
        public Builder webWAFConfig(WebWAFConfig webWAFConfig) {
            this.webWAFConfig = webWAFConfig;
            return this;
        }

        public CreateWebCustomDomainInput build() {
            return new CreateWebCustomDomainInput(this);
        } 

    } 

}
