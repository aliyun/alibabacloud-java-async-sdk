// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebRulesTfResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebRulesTfResponseBody</p>
 */
public class DescribeWebRulesTfResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("WebRules")
    private java.util.List < WebRules> webRules;

    private DescribeWebRulesTfResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.webRules = builder.webRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebRulesTfResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * WebRules.
         */
        public Builder webRules(java.util.List < WebRules> webRules) {
            this.webRules = webRules;
            return this;
        }

        public DescribeWebRulesTfResponseBody build() {
            return new DescribeWebRulesTfResponseBody(this);
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
             * ProxyPorts.
             */
            public Builder proxyPorts(java.util.List < String > proxyPorts) {
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

            public ProxyTypes build() {
                return new ProxyTypes(this);
            } 

        } 

    }
    public static class RealServers extends TeaModel {
        @NameInMap("RealServer")
        private String realServer;

        @NameInMap("RsType")
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
        private java.util.List < RealServers> realServers;

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
            this.policyMode = builder.policyMode;
            this.proxyEnabled = builder.proxyEnabled;
            this.proxyTypes = builder.proxyTypes;
            this.punishReason = builder.punishReason;
            this.punishStatus = builder.punishStatus;
            this.realServers = builder.realServers;
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
        public java.util.List < RealServers> getRealServers() {
            return this.realServers;
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
            private String policyMode; 
            private Boolean proxyEnabled; 
            private java.util.List < ProxyTypes> proxyTypes; 
            private Integer punishReason; 
            private Boolean punishStatus; 
            private java.util.List < RealServers> realServers; 
            private Boolean ssl13Enabled; 
            private String sslCiphers; 
            private String sslProtocols; 
            private java.util.List < String > whiteList; 

            /**
             * BlackList.
             */
            public Builder blackList(java.util.List < String > blackList) {
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
             * Cname.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * CustomCiphers.
             */
            public Builder customCiphers(java.util.List < String > customCiphers) {
                this.customCiphers = customCiphers;
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
             * Http2HttpsEnable.
             */
            public Builder http2HttpsEnable(Boolean http2HttpsEnable) {
                this.http2HttpsEnable = http2HttpsEnable;
                return this;
            }

            /**
             * Https2HttpEnable.
             */
            public Builder https2HttpEnable(Boolean https2HttpEnable) {
                this.https2HttpEnable = https2HttpEnable;
                return this;
            }

            /**
             * PolicyMode.
             */
            public Builder policyMode(String policyMode) {
                this.policyMode = policyMode;
                return this;
            }

            /**
             * ProxyEnabled.
             */
            public Builder proxyEnabled(Boolean proxyEnabled) {
                this.proxyEnabled = proxyEnabled;
                return this;
            }

            /**
             * ProxyTypes.
             */
            public Builder proxyTypes(java.util.List < ProxyTypes> proxyTypes) {
                this.proxyTypes = proxyTypes;
                return this;
            }

            /**
             * PunishReason.
             */
            public Builder punishReason(Integer punishReason) {
                this.punishReason = punishReason;
                return this;
            }

            /**
             * PunishStatus.
             */
            public Builder punishStatus(Boolean punishStatus) {
                this.punishStatus = punishStatus;
                return this;
            }

            /**
             * RealServers.
             */
            public Builder realServers(java.util.List < RealServers> realServers) {
                this.realServers = realServers;
                return this;
            }

            /**
             * Ssl13Enabled.
             */
            public Builder ssl13Enabled(Boolean ssl13Enabled) {
                this.ssl13Enabled = ssl13Enabled;
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
