// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomDomainResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomDomainResponseBody</p>
 */
public class GetCustomDomainResponseBody extends TeaModel {
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

    private GetCustomDomainResponseBody(Builder builder) {
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

    public static GetCustomDomainResponseBody create() {
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
         * Id of the request
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
         * tlsConfig.
         */
        public Builder tlsConfig(TLSConfig tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }

        public GetCustomDomainResponseBody build() {
            return new GetCustomDomainResponseBody(this);
        } 

    } 

}
