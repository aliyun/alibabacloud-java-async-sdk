// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainsResponseBody</p>
 */
public class DescribeDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domains")
    private java.util.List<Domains> domains;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domains
     */
    public java.util.List<Domains> getDomains() {
        return this.domains;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Domains> domains; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(DescribeDomainsResponseBody model) {
            this.domains = model.domains;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * Domains.
         */
        public Builder domains(java.util.List<Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeDomainsResponseBody build() {
            return new DescribeDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsResponseBody</p>
     */
    public static class ProxyTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProxyPorts")
        private java.util.List<String> proxyPorts;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
        private String proxyType;

        private ProxyTypeList(Builder builder) {
            this.proxyPorts = builder.proxyPorts;
            this.proxyType = builder.proxyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyTypeList create() {
            return builder().build();
        }

        /**
         * @return proxyPorts
         */
        public java.util.List<String> getProxyPorts() {
            return this.proxyPorts;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        public static final class Builder {
            private java.util.List<String> proxyPorts; 
            private String proxyType; 

            private Builder() {
            } 

            private Builder(ProxyTypeList model) {
                this.proxyPorts = model.proxyPorts;
                this.proxyType = model.proxyType;
            } 

            /**
             * ProxyPorts.
             */
            public Builder proxyPorts(java.util.List<String> proxyPorts) {
                this.proxyPorts = proxyPorts;
                return this;
            }

            /**
             * ProxyType.
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            public ProxyTypeList build() {
                return new ProxyTypeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsResponseBody</p>
     */
    public static class RealServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RealServer")
        private String realServer;

        @com.aliyun.core.annotation.NameInMap("RsType")
        private Integer rsType;

        private RealServers(Builder builder) {
            this.realServer = builder.realServer;
            this.rsType = builder.rsType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealServers create() {
            return builder().build();
        }

        /**
         * @return realServer
         */
        public String getRealServer() {
            return this.realServer;
        }

        /**
         * @return rsType
         */
        public Integer getRsType() {
            return this.rsType;
        }

        public static final class Builder {
            private String realServer; 
            private Integer rsType; 

            private Builder() {
            } 

            private Builder(RealServers model) {
                this.realServer = model.realServer;
                this.rsType = model.rsType;
            } 

            /**
             * RealServer.
             */
            public Builder realServer(String realServer) {
                this.realServer = realServer;
                return this;
            }

            /**
             * RsType.
             */
            public Builder rsType(Integer rsType) {
                this.rsType = rsType;
                return this;
            }

            public RealServers build() {
                return new RealServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsResponseBody</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackList")
        private java.util.List<String> blackList;

        @com.aliyun.core.annotation.NameInMap("CcEnabled")
        private Boolean ccEnabled;

        @com.aliyun.core.annotation.NameInMap("CcRuleEnabled")
        private Boolean ccRuleEnabled;

        @com.aliyun.core.annotation.NameInMap("CcTemplate")
        private String ccTemplate;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CertRegion")
        private String certRegion;

        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Http2Enable")
        private Boolean http2Enable;

        @com.aliyun.core.annotation.NameInMap("ProxyTypeList")
        private java.util.List<ProxyTypeList> proxyTypeList;

        @com.aliyun.core.annotation.NameInMap("RealServers")
        private java.util.List<RealServers> realServers;

        @com.aliyun.core.annotation.NameInMap("SslCiphers")
        private String sslCiphers;

        @com.aliyun.core.annotation.NameInMap("SslProtocols")
        private String sslProtocols;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
        private java.util.List<String> whiteList;

        private Domains(Builder builder) {
            this.blackList = builder.blackList;
            this.ccEnabled = builder.ccEnabled;
            this.ccRuleEnabled = builder.ccRuleEnabled;
            this.ccTemplate = builder.ccTemplate;
            this.certName = builder.certName;
            this.certRegion = builder.certRegion;
            this.cname = builder.cname;
            this.domain = builder.domain;
            this.http2Enable = builder.http2Enable;
            this.proxyTypeList = builder.proxyTypeList;
            this.realServers = builder.realServers;
            this.sslCiphers = builder.sslCiphers;
            this.sslProtocols = builder.sslProtocols;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return blackList
         */
        public java.util.List<String> getBlackList() {
            return this.blackList;
        }

        /**
         * @return ccEnabled
         */
        public Boolean getCcEnabled() {
            return this.ccEnabled;
        }

        /**
         * @return ccRuleEnabled
         */
        public Boolean getCcRuleEnabled() {
            return this.ccRuleEnabled;
        }

        /**
         * @return ccTemplate
         */
        public String getCcTemplate() {
            return this.ccTemplate;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certRegion
         */
        public String getCertRegion() {
            return this.certRegion;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return http2Enable
         */
        public Boolean getHttp2Enable() {
            return this.http2Enable;
        }

        /**
         * @return proxyTypeList
         */
        public java.util.List<ProxyTypeList> getProxyTypeList() {
            return this.proxyTypeList;
        }

        /**
         * @return realServers
         */
        public java.util.List<RealServers> getRealServers() {
            return this.realServers;
        }

        /**
         * @return sslCiphers
         */
        public String getSslCiphers() {
            return this.sslCiphers;
        }

        /**
         * @return sslProtocols
         */
        public String getSslProtocols() {
            return this.sslProtocols;
        }

        /**
         * @return whiteList
         */
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private java.util.List<String> blackList; 
            private Boolean ccEnabled; 
            private Boolean ccRuleEnabled; 
            private String ccTemplate; 
            private String certName; 
            private String certRegion; 
            private String cname; 
            private String domain; 
            private Boolean http2Enable; 
            private java.util.List<ProxyTypeList> proxyTypeList; 
            private java.util.List<RealServers> realServers; 
            private String sslCiphers; 
            private String sslProtocols; 
            private java.util.List<String> whiteList; 

            private Builder() {
            } 

            private Builder(Domains model) {
                this.blackList = model.blackList;
                this.ccEnabled = model.ccEnabled;
                this.ccRuleEnabled = model.ccRuleEnabled;
                this.ccTemplate = model.ccTemplate;
                this.certName = model.certName;
                this.certRegion = model.certRegion;
                this.cname = model.cname;
                this.domain = model.domain;
                this.http2Enable = model.http2Enable;
                this.proxyTypeList = model.proxyTypeList;
                this.realServers = model.realServers;
                this.sslCiphers = model.sslCiphers;
                this.sslProtocols = model.sslProtocols;
                this.whiteList = model.whiteList;
            } 

            /**
             * BlackList.
             */
            public Builder blackList(java.util.List<String> blackList) {
                this.blackList = blackList;
                return this;
            }

            /**
             * CcEnabled.
             */
            public Builder ccEnabled(Boolean ccEnabled) {
                this.ccEnabled = ccEnabled;
                return this;
            }

            /**
             * CcRuleEnabled.
             */
            public Builder ccRuleEnabled(Boolean ccRuleEnabled) {
                this.ccRuleEnabled = ccRuleEnabled;
                return this;
            }

            /**
             * CcTemplate.
             */
            public Builder ccTemplate(String ccTemplate) {
                this.ccTemplate = ccTemplate;
                return this;
            }

            /**
             * CertName.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * CertRegion.
             */
            public Builder certRegion(String certRegion) {
                this.certRegion = certRegion;
                return this;
            }

            /**
             * Cname.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Http2Enable.
             */
            public Builder http2Enable(Boolean http2Enable) {
                this.http2Enable = http2Enable;
                return this;
            }

            /**
             * ProxyTypeList.
             */
            public Builder proxyTypeList(java.util.List<ProxyTypeList> proxyTypeList) {
                this.proxyTypeList = proxyTypeList;
                return this;
            }

            /**
             * RealServers.
             */
            public Builder realServers(java.util.List<RealServers> realServers) {
                this.realServers = realServers;
                return this;
            }

            /**
             * SslCiphers.
             */
            public Builder sslCiphers(String sslCiphers) {
                this.sslCiphers = sslCiphers;
                return this;
            }

            /**
             * SslProtocols.
             */
            public Builder sslProtocols(String sslProtocols) {
                this.sslProtocols = sslProtocols;
                return this;
            }

            /**
             * WhiteList.
             */
            public Builder whiteList(java.util.List<String> whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
