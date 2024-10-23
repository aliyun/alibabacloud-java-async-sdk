// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CustomDomain} extends {@link TeaModel}
 *
 * <p>CustomDomain</p>
 */
public class CustomDomain extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("apiVersion")
    private String apiVersion;

    @com.aliyun.core.annotation.NameInMap("authConfig")
    private AuthConfig authConfig;

    @com.aliyun.core.annotation.NameInMap("certConfig")
    private CertConfig certConfig;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("domainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("routeConfig")
    private RouteConfig routeConfig;

    @com.aliyun.core.annotation.NameInMap("subdomainCount")
    private String subdomainCount;

    @com.aliyun.core.annotation.NameInMap("tlsConfig")
    private TLSConfig tlsConfig;

    @com.aliyun.core.annotation.NameInMap("wafConfig")
    private WAFConfig wafConfig;

    private CustomDomain(Builder builder) {
        this.accountId = builder.accountId;
        this.apiVersion = builder.apiVersion;
        this.authConfig = builder.authConfig;
        this.certConfig = builder.certConfig;
        this.createdTime = builder.createdTime;
        this.domainName = builder.domainName;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
        this.subdomainCount = builder.subdomainCount;
        this.tlsConfig = builder.tlsConfig;
        this.wafConfig = builder.wafConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomDomain create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
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
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
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
     * @return subdomainCount
     */
    public String getSubdomainCount() {
        return this.subdomainCount;
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
        private String accountId; 
        private String apiVersion; 
        private AuthConfig authConfig; 
        private CertConfig certConfig; 
        private String createdTime; 
        private String domainName; 
        private String lastModifiedTime; 
        private String protocol; 
        private RouteConfig routeConfig; 
        private String subdomainCount; 
        private TLSConfig tlsConfig; 
        private WAFConfig wafConfig; 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * apiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

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
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
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
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
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
         * subdomainCount.
         */
        public Builder subdomainCount(String subdomainCount) {
            this.subdomainCount = subdomainCount;
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

        public CustomDomain build() {
            return new CustomDomain(this);
        } 

    } 

}
