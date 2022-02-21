// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomDomainsResponseBody</p>
 */
public class ListCustomDomainsResponseBody extends TeaModel {
    @NameInMap("customDomains")
    private java.util.List < CustomDomains> customDomains;

    @NameInMap("nextToken")
    private String nextToken;

    private ListCustomDomainsResponseBody(Builder builder) {
        this.customDomains = builder.customDomains;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return customDomains
     */
    public java.util.List < CustomDomains> getCustomDomains() {
        return this.customDomains;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < CustomDomains> customDomains; 
        private String nextToken; 

        /**
         * customDomains.
         */
        public Builder customDomains(java.util.List < CustomDomains> customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListCustomDomainsResponseBody build() {
            return new ListCustomDomainsResponseBody(this);
        } 

    } 

    public static class CustomDomains extends TeaModel {
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

        private CustomDomains(Builder builder) {
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

        public static CustomDomains create() {
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

            public CustomDomains build() {
                return new CustomDomains(this);
            } 

        } 

    }
}
