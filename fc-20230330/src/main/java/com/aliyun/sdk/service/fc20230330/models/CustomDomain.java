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

    @com.aliyun.core.annotation.NameInMap("corsConfig")
    private CORSConfig corsConfig;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("domainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("isE2B")
    private Boolean isE2B;

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
        this.corsConfig = builder.corsConfig;
        this.createdTime = builder.createdTime;
        this.domainName = builder.domainName;
        this.isE2B = builder.isE2B;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return corsConfig
     */
    public CORSConfig getCorsConfig() {
        return this.corsConfig;
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
     * @return isE2B
     */
    public Boolean getIsE2B() {
        return this.isE2B;
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
        private CORSConfig corsConfig; 
        private String createdTime; 
        private String domainName; 
        private Boolean isE2B; 
        private String lastModifiedTime; 
        private String protocol; 
        private RouteConfig routeConfig; 
        private String subdomainCount; 
        private TLSConfig tlsConfig; 
        private WAFConfig wafConfig; 

        private Builder() {
        } 

        private Builder(CustomDomain model) {
            this.accountId = model.accountId;
            this.apiVersion = model.apiVersion;
            this.authConfig = model.authConfig;
            this.certConfig = model.certConfig;
            this.corsConfig = model.corsConfig;
            this.createdTime = model.createdTime;
            this.domainName = model.domainName;
            this.isE2B = model.isE2B;
            this.lastModifiedTime = model.lastModifiedTime;
            this.protocol = model.protocol;
            this.routeConfig = model.routeConfig;
            this.subdomainCount = model.subdomainCount;
            this.tlsConfig = model.tlsConfig;
            this.wafConfig = model.wafConfig;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account (primary account).</p>
         * 
         * <strong>example:</strong>
         * <p>186851234023****</p>
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The API version of Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30</p>
         */
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * <p>The authentication configuration.</p>
         */
        public Builder authConfig(AuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * <p>The HTTPS certificate configuration.</p>
         */
        public Builder certConfig(CertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * <p>The cross-origin resource sharing (CORS) configuration.</p>
         */
        public Builder corsConfig(CORSConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }

        /**
         * <p>The time when the custom domain was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T08:02:19Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * isE2B.
         */
        public Builder isE2B(Boolean isE2B) {
            this.isE2B = isE2B;
            return this;
        }

        /**
         * <p>The time when the custom domain was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T08:02:19Z</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>The protocols that are supported by the domain name. Valid values: HTTP (HTTP only), HTTPS (HTTPS only), and HTTP,HTTPS (both HTTP and HTTPS).</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The route table that maps paths to functions.</p>
         */
        public Builder routeConfig(RouteConfig routeConfig) {
            this.routeConfig = routeConfig;
            return this;
        }

        /**
         * <p>The number of subdomains.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder subdomainCount(String subdomainCount) {
            this.subdomainCount = subdomainCount;
            return this;
        }

        /**
         * <p>The TLS configuration.</p>
         */
        public Builder tlsConfig(TLSConfig tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }

        /**
         * <p>The Web Application Firewall (WAF) aconfiguration.</p>
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
