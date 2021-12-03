// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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


    private CreateCustomDomainResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.apiVersion = builder.apiVersion;
        this.certConfig = builder.certConfig;
        this.createdTime = builder.createdTime;
        this.domainName = builder.domainName;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
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

    public static final class Builder {
        private String accountId; 
        private String apiVersion; 
        private CertConfig certConfig; 
        private String createdTime; 
        private String domainName; 
        private String lastModifiedTime; 
        private String protocol; 
        private RouteConfig routeConfig; 

        /**
         * <p>accountId.</p>
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>apiVersion.</p>
         */
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * <p>certConfig.</p>
         */
        public Builder certConfig(CertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * <p>createdTime.</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>lastModifiedTime.</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>protocol.</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>routeConfig.</p>
         */
        public Builder routeConfig(RouteConfig routeConfig) {
            this.routeConfig = routeConfig;
            return this;
        }

        public CreateCustomDomainResponseBody build() {
            return new CreateCustomDomainResponseBody(this);
        } 

    } 

}
