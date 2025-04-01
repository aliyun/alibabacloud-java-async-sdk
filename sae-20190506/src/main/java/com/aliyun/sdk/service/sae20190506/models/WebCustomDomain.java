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
 * {@link WebCustomDomain} extends {@link TeaModel}
 *
 * <p>WebCustomDomain</p>
 */
public class WebCustomDomain extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("DefaultForwardingAppName")
    private String defaultForwardingAppName;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

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

    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    private WebCustomDomain(Builder builder) {
        this.createdTime = builder.createdTime;
        this.defaultForwardingAppName = builder.defaultForwardingAppName;
        this.domainName = builder.domainName;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.namespaceId = builder.namespaceId;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
        this.webCertConfig = builder.webCertConfig;
        this.webTLSConfig = builder.webTLSConfig;
        this.webWAFConfig = builder.webWAFConfig;
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebCustomDomain create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
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
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
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

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    public static final class Builder {
        private String createdTime; 
        private String defaultForwardingAppName; 
        private String domainName; 
        private String lastModifiedTime; 
        private String namespaceId; 
        private String protocol; 
        private RouteConfig routeConfig; 
        private WebCertConfig webCertConfig; 
        private WebTLSConfig webTLSConfig; 
        private WebWAFConfig webWAFConfig; 
        private String accountId; 

        private Builder() {
        } 

        private Builder(WebCustomDomain model) {
            this.createdTime = model.createdTime;
            this.defaultForwardingAppName = model.defaultForwardingAppName;
            this.domainName = model.domainName;
            this.lastModifiedTime = model.lastModifiedTime;
            this.namespaceId = model.namespaceId;
            this.protocol = model.protocol;
            this.routeConfig = model.routeConfig;
            this.webCertConfig = model.webCertConfig;
            this.webTLSConfig = model.webTLSConfig;
            this.webWAFConfig = model.webWAFConfig;
            this.accountId = model.accountId;
        } 

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

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
         * LastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
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

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public WebCustomDomain build() {
            return new WebCustomDomain(this);
        } 

    } 

}
