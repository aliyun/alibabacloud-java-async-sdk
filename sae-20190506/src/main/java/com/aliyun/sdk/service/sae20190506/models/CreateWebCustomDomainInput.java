// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
        private WebCertConfig webCertConfig; 
        private WebTLSConfig webTLSConfig; 
        private WebWAFConfig webWAFConfig; 

        /**
         * DefaultForwardingAppName.
         */
        public Builder defaultForwardingAppName(String defaultForwardingAppName) {
            this.defaultForwardingAppName = defaultForwardingAppName;
            return this;
        }

        /**
         * DomainName.
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
