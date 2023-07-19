// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainResourceResponseBody</p>
 */
public class DescribeDomainResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("WebRules")
    private java.util.List < WebRules> webRules;

    private DescribeDomainResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.webRules = builder.webRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return webRules
     */
    public java.util.List < WebRules> getWebRules() {
        return this.webRules;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List < WebRules> webRules; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of forwarding rules.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The configurations of the forwarding rule.
         */
        public Builder webRules(java.util.List < WebRules> webRules) {
            this.webRules = webRules;
            return this;
        }

        public DescribeDomainResourceResponseBody build() {
            return new DescribeDomainResourceResponseBody(this);
        } 

    } 

    public static class ProxyTypes extends TeaModel {
        @NameInMap("ProxyPorts")
        private java.util.List < String > proxyPorts;

        @NameInMap("ProxyType")
        private String proxyType;

        private ProxyTypes(Builder builder) {
            this.proxyPorts = builder.proxyPorts;
            this.proxyType = builder.proxyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyTypes create() {
            return builder().build();
        }

        /**
         * @return proxyPorts
         */
        public java.util.List < String > getProxyPorts() {
            return this.proxyPorts;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        public static final class Builder {
            private java.util.List < String > proxyPorts; 
            private String proxyType; 

            /**
             * The port numbers.
             */
            public Builder proxyPorts(java.util.List < String > proxyPorts) {
                this.proxyPorts = proxyPorts;
                return this;
            }

            /**
             * The type of the protocol. Valid values:
             * <p>
             * 
             * *   **http**
             * *   **https**
             * *   **websocket**
             * *   **websockets**
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            public ProxyTypes build() {
                return new ProxyTypes(this);
            } 

        } 

    }
    public static class WebRules extends TeaModel {
        @NameInMap("BlackList")
        private java.util.List < String > blackList;

        @NameInMap("CcEnabled")
        private Boolean ccEnabled;

        @NameInMap("CcRuleEnabled")
        private Boolean ccRuleEnabled;

        @NameInMap("CcTemplate")
        private String ccTemplate;

        @NameInMap("CertName")
        private String certName;

        @NameInMap("Cname")
        private String cname;

        @NameInMap("CustomCiphers")
        private java.util.List < String > customCiphers;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Http2Enable")
        private Boolean http2Enable;

        @NameInMap("Http2HttpsEnable")
        private Boolean http2HttpsEnable;

        @NameInMap("Https2HttpEnable")
        private Boolean https2HttpEnable;

        @NameInMap("HttpsExt")
        private String httpsExt;

        @NameInMap("InstanceIds")
        private java.util.List < String > instanceIds;

        @NameInMap("OcspEnabled")
        private Boolean ocspEnabled;

        @NameInMap("PolicyMode")
        private String policyMode;

        @NameInMap("ProxyEnabled")
        private Boolean proxyEnabled;

        @NameInMap("ProxyTypes")
        private java.util.List < ProxyTypes> proxyTypes;

        @NameInMap("PunishReason")
        private Integer punishReason;

        @NameInMap("PunishStatus")
        private Boolean punishStatus;

        @NameInMap("RealServers")
        private java.util.List < String > realServers;

        @NameInMap("RsType")
        private Integer rsType;

        @NameInMap("Ssl13Enabled")
        private Boolean ssl13Enabled;

        @NameInMap("SslCiphers")
        private String sslCiphers;

        @NameInMap("SslProtocols")
        private String sslProtocols;

        @NameInMap("WhiteList")
        private java.util.List < String > whiteList;

        private WebRules(Builder builder) {
            this.blackList = builder.blackList;
            this.ccEnabled = builder.ccEnabled;
            this.ccRuleEnabled = builder.ccRuleEnabled;
            this.ccTemplate = builder.ccTemplate;
            this.certName = builder.certName;
            this.cname = builder.cname;
            this.customCiphers = builder.customCiphers;
            this.domain = builder.domain;
            this.http2Enable = builder.http2Enable;
            this.http2HttpsEnable = builder.http2HttpsEnable;
            this.https2HttpEnable = builder.https2HttpEnable;
            this.httpsExt = builder.httpsExt;
            this.instanceIds = builder.instanceIds;
            this.ocspEnabled = builder.ocspEnabled;
            this.policyMode = builder.policyMode;
            this.proxyEnabled = builder.proxyEnabled;
            this.proxyTypes = builder.proxyTypes;
            this.punishReason = builder.punishReason;
            this.punishStatus = builder.punishStatus;
            this.realServers = builder.realServers;
            this.rsType = builder.rsType;
            this.ssl13Enabled = builder.ssl13Enabled;
            this.sslCiphers = builder.sslCiphers;
            this.sslProtocols = builder.sslProtocols;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebRules create() {
            return builder().build();
        }

        /**
         * @return blackList
         */
        public java.util.List < String > getBlackList() {
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
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return customCiphers
         */
        public java.util.List < String > getCustomCiphers() {
            return this.customCiphers;
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
         * @return http2HttpsEnable
         */
        public Boolean getHttp2HttpsEnable() {
            return this.http2HttpsEnable;
        }

        /**
         * @return https2HttpEnable
         */
        public Boolean getHttps2HttpEnable() {
            return this.https2HttpEnable;
        }

        /**
         * @return httpsExt
         */
        public String getHttpsExt() {
            return this.httpsExt;
        }

        /**
         * @return instanceIds
         */
        public java.util.List < String > getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return ocspEnabled
         */
        public Boolean getOcspEnabled() {
            return this.ocspEnabled;
        }

        /**
         * @return policyMode
         */
        public String getPolicyMode() {
            return this.policyMode;
        }

        /**
         * @return proxyEnabled
         */
        public Boolean getProxyEnabled() {
            return this.proxyEnabled;
        }

        /**
         * @return proxyTypes
         */
        public java.util.List < ProxyTypes> getProxyTypes() {
            return this.proxyTypes;
        }

        /**
         * @return punishReason
         */
        public Integer getPunishReason() {
            return this.punishReason;
        }

        /**
         * @return punishStatus
         */
        public Boolean getPunishStatus() {
            return this.punishStatus;
        }

        /**
         * @return realServers
         */
        public java.util.List < String > getRealServers() {
            return this.realServers;
        }

        /**
         * @return rsType
         */
        public Integer getRsType() {
            return this.rsType;
        }

        /**
         * @return ssl13Enabled
         */
        public Boolean getSsl13Enabled() {
            return this.ssl13Enabled;
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
        public java.util.List < String > getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private java.util.List < String > blackList; 
            private Boolean ccEnabled; 
            private Boolean ccRuleEnabled; 
            private String ccTemplate; 
            private String certName; 
            private String cname; 
            private java.util.List < String > customCiphers; 
            private String domain; 
            private Boolean http2Enable; 
            private Boolean http2HttpsEnable; 
            private Boolean https2HttpEnable; 
            private String httpsExt; 
            private java.util.List < String > instanceIds; 
            private Boolean ocspEnabled; 
            private String policyMode; 
            private Boolean proxyEnabled; 
            private java.util.List < ProxyTypes> proxyTypes; 
            private Integer punishReason; 
            private Boolean punishStatus; 
            private java.util.List < String > realServers; 
            private Integer rsType; 
            private Boolean ssl13Enabled; 
            private String sslCiphers; 
            private String sslProtocols; 
            private java.util.List < String > whiteList; 

            /**
             * The IP addresses that are included in the blacklist of the domain name.
             */
            public Builder blackList(java.util.List < String > blackList) {
                this.blackList = blackList;
                return this;
            }

            /**
             * Indicates whether the Frequency Control policy is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder ccEnabled(Boolean ccEnabled) {
                this.ccEnabled = ccEnabled;
                return this;
            }

            /**
             * Indicates whether the Custom Rule switch of the Frequency Control policy is turned on. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder ccRuleEnabled(Boolean ccRuleEnabled) {
                this.ccRuleEnabled = ccRuleEnabled;
                return this;
            }

            /**
             * The mode of the Frequency Control policy. Valid values:
             * <p>
             * 
             * *   **default**: the Normal mode
             * *   **gf_under_attack**: the Emergency mode
             * *   **gf_sos_verify**: the Strict mode
             * *   **gf_sos_verify**: the Super Strict mode
             */
            public Builder ccTemplate(String ccTemplate) {
                this.ccTemplate = ccTemplate;
                return this;
            }

            /**
             * The name of the SSL certificate used by the domain name.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * The CNAME provided by the instance to which the domain name is added.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The custom cipher suites.
             */
            public Builder customCiphers(java.util.List < String > customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * The domain name of the website.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Indicates whether Enable HTTP/2 is turned on. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder http2Enable(Boolean http2Enable) {
                this.http2Enable = http2Enable;
                return this;
            }

            /**
             * Indicates whether Enforce HTTPS Routing is turned on. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder http2HttpsEnable(Boolean http2HttpsEnable) {
                this.http2HttpsEnable = http2HttpsEnable;
                return this;
            }

            /**
             * Indicates whether Enable HTTP is turned on. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder https2HttpEnable(Boolean https2HttpEnable) {
                this.https2HttpEnable = https2HttpEnable;
                return this;
            }

            /**
             * The advanced HTTPS settings. This parameter takes effect only when the value of the **ProxyType** parameter includes **https**. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:
             * <p>
             * 
             * *   **Http2https**: indicates whether the feature of redirecting HTTP requests to HTTPS requests is enabled. Data type: integer. Valid values: **0** and **1**. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.
             * *   **Https2http**: indicates whether the feature of redirecting HTTPS requests to HTTP requests is enabled. Data type: integer. Valid values: **0** and **1**. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.
             * *   **Http2**: indicates whether HTTP/2 is supported. Data type: integer. Valid values: **0** and **1**. The value 0 indicates that HTTP/2 is not supported. The value 1 indicates that HTTP/2 is supported.
             */
            public Builder httpsExt(String httpsExt) {
                this.httpsExt = httpsExt;
                return this;
            }

            /**
             * The IDs of the instances to which the domain name is added.
             */
            public Builder instanceIds(java.util.List < String > instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * Indicates whether the Online Certificate Status Protocol (OCSP) feature is enabled. Valid values:
             * <p>
             * - **true**: yes
             * - **false**: no
             */
            public Builder ocspEnabled(Boolean ocspEnabled) {
                this.ocspEnabled = ocspEnabled;
                return this;
            }

            /**
             * The load balancing algorithm for back-to-origin traffic. Valid values:
             * <p>
             * 
             * *   **ip_hash**: the IP hash algorithm. This algorithm is used to redirect the requests from the same IP address to the same origin server.
             * *   **rr**: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn.
             * *   **least_time**: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from Anti-DDoS Pro or Anti-DDoS Premium instances to origin servers based on the intelligent DNS resolution feature.
             */
            public Builder policyMode(String policyMode) {
                this.policyMode = policyMode;
                return this;
            }

            /**
             * Indicates whether the instance forwards the traffic that is destined for the website. Valid values:
             * <p>
             * 
             * *   **true**: Anti-DDoS Pro or Anti-DDoS Premium forwards the traffic that is destined for the website.
             * *   **false**: no
             */
            public Builder proxyEnabled(Boolean proxyEnabled) {
                this.proxyEnabled = proxyEnabled;
                return this;
            }

            /**
             * The details about the protocol type and port number.
             */
            public Builder proxyTypes(java.util.List < ProxyTypes> proxyTypes) {
                this.proxyTypes = proxyTypes;
                return this;
            }

            /**
             * The reason why the domain name is invalid. Valid values:
             * <p>
             * 
             * *   **1**: No Content Provider (ICP) filing is completed for the domain name.
             * *   **2**: The business for which you registered the domain name does not meet regulatory requirements.
             * 
             * If the two reasons are both involved, the value **2** is returned.
             */
            public Builder punishReason(Integer punishReason) {
                this.punishReason = punishReason;
                return this;
            }

            /**
             * Indicates whether the domain name is invalid. Valid values:
             * <p>
             * 
             * *   **true**: The domain name is invalid. You can view the specific reasons from the **PunishReason** parameter.
             * *   **false**: The domain name is valid.
             */
            public Builder punishStatus(Boolean punishStatus) {
                this.punishStatus = punishStatus;
                return this;
            }

            /**
             * The addresses of origin servers.
             */
            public Builder realServers(java.util.List < String > realServers) {
                this.realServers = realServers;
                return this;
            }

            /**
             * The address type of the origin server. Valid values:
             * <p>
             * 
             * *   **0**: IP address
             * *   **1**: domain name
             */
            public Builder rsType(Integer rsType) {
                this.rsType = rsType;
                return this;
            }

            /**
             * Indicates whether TLS 1.3 is supported. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder ssl13Enabled(Boolean ssl13Enabled) {
                this.ssl13Enabled = ssl13Enabled;
                return this;
            }

            /**
             * The type of the cipher suite. Valid values:
             * <p>
             * 
             * *   **default**: custom cipher suite
             * *   **all**: all cipher suites
             * *   **strong**: strong cipher suites
             */
            public Builder sslCiphers(String sslCiphers) {
                this.sslCiphers = sslCiphers;
                return this;
            }

            /**
             * The version of the TLS protocol. Valid values:
             * <p>
             * 
             * *   **tls1.0**: TLS 1.0 or later
             * *   **tls1.1**: TLS 1.1 or later
             * *   **tls1.2**: TLS 1.2 or later
             */
            public Builder sslProtocols(String sslProtocols) {
                this.sslProtocols = sslProtocols;
                return this;
            }

            /**
             * The IP addresses that are included in the whitelist of the domain name.
             */
            public Builder whiteList(java.util.List < String > whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public WebRules build() {
                return new WebRules(this);
            } 

        } 

    }
}
