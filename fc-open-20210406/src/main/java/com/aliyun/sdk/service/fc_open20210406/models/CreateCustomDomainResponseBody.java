// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomDomainResponseBody</p>
 */
public class CreateCustomDomainResponseBody extends TeaModel {
    @NameInMap("accountId")
    private String accountId;

    @NameInMap("apiVersion")
    private String apiVersion;

    @NameInMap("certConfig")
    private CertConfig certConfig;

    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("domainName")
    private String domainName;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("protocol")
    private String protocol;

    @NameInMap("routeConfig")
    private RouteConfig routeConfig;

    @NameInMap("tlsConfig")
    private TLSConfig tlsConfig;

    private CreateCustomDomainResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.apiVersion = builder.apiVersion;
        this.certConfig = builder.certConfig;
        this.createdTime = builder.createdTime;
        this.domainName = builder.domainName;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
        this.tlsConfig = builder.tlsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomDomainResponseBody create() {
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
     * @return tlsConfig
     */
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public static final class Builder {
        private String accountId; 
        private String apiVersion; 
        private CertConfig certConfig; 
        private String createdTime; 
        private String domainName; 
        private String lastModifiedTime; 
        private String protocol; 
        private RouteConfig routeConfig; 
        private TLSConfig tlsConfig; 

        /**
         * The ID of the account.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * The version of the API.
         */
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * The configurations of the HTTPS certificate.
         */
        public Builder certConfig(CertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * The time when the domain name was added.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The time when the domain name was last modified.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * The protocol types supported by the domain name. Valid values:
         * <p>
         * 
         * - **HTTP**: Only HTTP is supported. 
         * - **HTTPS**: Only HTTPS is supported. 
         * - **HTTP,HTTPS**: Both HTTP and HTTPS are supported.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * The route table that maps the paths to functions when the functions are invoked by using the custom domain name.
         */
        public Builder routeConfig(RouteConfig routeConfig) {
            this.routeConfig = routeConfig;
            return this;
        }

        /**
         * The configurations of the TLS.
         */
        public Builder tlsConfig(TLSConfig tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }

        public CreateCustomDomainResponseBody build() {
            return new CreateCustomDomainResponseBody(this);
        } 

    } 

}
