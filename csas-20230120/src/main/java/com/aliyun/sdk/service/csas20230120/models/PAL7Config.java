// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link PAL7Config} extends {@link TeaModel}
 *
 * <p>PAL7Config</p>
 */
public class PAL7Config extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BypassConfig")
    private BypassConfig bypassConfig;

    @com.aliyun.core.annotation.NameInMap("CertId")
    private String certId;

    @com.aliyun.core.annotation.NameInMap("ClientIpConfig")
    private ClientIpConfig clientIpConfig;

    @com.aliyun.core.annotation.NameInMap("ClientIpRestrictConfig")
    private ClientIpRestrictConfig clientIpRestrictConfig;

    @com.aliyun.core.annotation.NameInMap("ClientTypeRestrictConfig")
    private ClientTypeRestrictConfig clientTypeRestrictConfig;

    @com.aliyun.core.annotation.NameInMap("DnsConfig")
    private DnsConfig dnsConfig;

    @com.aliyun.core.annotation.NameInMap("IsNtlm")
    private Boolean isNtlm;

    @com.aliyun.core.annotation.NameInMap("JsHookConfig")
    private JsHookConfig jsHookConfig;

    @com.aliyun.core.annotation.NameInMap("ProxyDomainTypes")
    private byte[] proxyDomainTypes;

    @com.aliyun.core.annotation.NameInMap("RequestHeaderRewriteConfig")
    private RequestHeaderRewriteConfig requestHeaderRewriteConfig;

    @com.aliyun.core.annotation.NameInMap("RequestQueryRewriteConfig")
    private RequestQueryRewriteConfig requestQueryRewriteConfig;

    @com.aliyun.core.annotation.NameInMap("ResponseHeaderRewriteConfig")
    private ResponseHeaderRewriteConfig responseHeaderRewriteConfig;

    @com.aliyun.core.annotation.NameInMap("ResponseRewriteConfig")
    private ResponseRewriteConfig responseRewriteConfig;

    private PAL7Config(Builder builder) {
        this.bypassConfig = builder.bypassConfig;
        this.certId = builder.certId;
        this.clientIpConfig = builder.clientIpConfig;
        this.clientIpRestrictConfig = builder.clientIpRestrictConfig;
        this.clientTypeRestrictConfig = builder.clientTypeRestrictConfig;
        this.dnsConfig = builder.dnsConfig;
        this.isNtlm = builder.isNtlm;
        this.jsHookConfig = builder.jsHookConfig;
        this.proxyDomainTypes = builder.proxyDomainTypes;
        this.requestHeaderRewriteConfig = builder.requestHeaderRewriteConfig;
        this.requestQueryRewriteConfig = builder.requestQueryRewriteConfig;
        this.responseHeaderRewriteConfig = builder.responseHeaderRewriteConfig;
        this.responseRewriteConfig = builder.responseRewriteConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PAL7Config create() {
        return builder().build();
    }

    /**
     * @return bypassConfig
     */
    public BypassConfig getBypassConfig() {
        return this.bypassConfig;
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return clientIpConfig
     */
    public ClientIpConfig getClientIpConfig() {
        return this.clientIpConfig;
    }

    /**
     * @return clientIpRestrictConfig
     */
    public ClientIpRestrictConfig getClientIpRestrictConfig() {
        return this.clientIpRestrictConfig;
    }

    /**
     * @return clientTypeRestrictConfig
     */
    public ClientTypeRestrictConfig getClientTypeRestrictConfig() {
        return this.clientTypeRestrictConfig;
    }

    /**
     * @return dnsConfig
     */
    public DnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    /**
     * @return isNtlm
     */
    public Boolean getIsNtlm() {
        return this.isNtlm;
    }

    /**
     * @return jsHookConfig
     */
    public JsHookConfig getJsHookConfig() {
        return this.jsHookConfig;
    }

    /**
     * @return proxyDomainTypes
     */
    public byte[] getProxyDomainTypes() {
        return this.proxyDomainTypes;
    }

    /**
     * @return requestHeaderRewriteConfig
     */
    public RequestHeaderRewriteConfig getRequestHeaderRewriteConfig() {
        return this.requestHeaderRewriteConfig;
    }

    /**
     * @return requestQueryRewriteConfig
     */
    public RequestQueryRewriteConfig getRequestQueryRewriteConfig() {
        return this.requestQueryRewriteConfig;
    }

    /**
     * @return responseHeaderRewriteConfig
     */
    public ResponseHeaderRewriteConfig getResponseHeaderRewriteConfig() {
        return this.responseHeaderRewriteConfig;
    }

    /**
     * @return responseRewriteConfig
     */
    public ResponseRewriteConfig getResponseRewriteConfig() {
        return this.responseRewriteConfig;
    }

    public static final class Builder {
        private BypassConfig bypassConfig; 
        private String certId; 
        private ClientIpConfig clientIpConfig; 
        private ClientIpRestrictConfig clientIpRestrictConfig; 
        private ClientTypeRestrictConfig clientTypeRestrictConfig; 
        private DnsConfig dnsConfig; 
        private Boolean isNtlm; 
        private JsHookConfig jsHookConfig; 
        private byte[] proxyDomainTypes; 
        private RequestHeaderRewriteConfig requestHeaderRewriteConfig; 
        private RequestQueryRewriteConfig requestQueryRewriteConfig; 
        private ResponseHeaderRewriteConfig responseHeaderRewriteConfig; 
        private ResponseRewriteConfig responseRewriteConfig; 

        /**
         * BypassConfig.
         */
        public Builder bypassConfig(BypassConfig bypassConfig) {
            this.bypassConfig = bypassConfig;
            return this;
        }

        /**
         * CertId.
         */
        public Builder certId(String certId) {
            this.certId = certId;
            return this;
        }

        /**
         * ClientIpConfig.
         */
        public Builder clientIpConfig(ClientIpConfig clientIpConfig) {
            this.clientIpConfig = clientIpConfig;
            return this;
        }

        /**
         * ClientIpRestrictConfig.
         */
        public Builder clientIpRestrictConfig(ClientIpRestrictConfig clientIpRestrictConfig) {
            this.clientIpRestrictConfig = clientIpRestrictConfig;
            return this;
        }

        /**
         * ClientTypeRestrictConfig.
         */
        public Builder clientTypeRestrictConfig(ClientTypeRestrictConfig clientTypeRestrictConfig) {
            this.clientTypeRestrictConfig = clientTypeRestrictConfig;
            return this;
        }

        /**
         * DnsConfig.
         */
        public Builder dnsConfig(DnsConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        /**
         * IsNtlm.
         */
        public Builder isNtlm(Boolean isNtlm) {
            this.isNtlm = isNtlm;
            return this;
        }

        /**
         * JsHookConfig.
         */
        public Builder jsHookConfig(JsHookConfig jsHookConfig) {
            this.jsHookConfig = jsHookConfig;
            return this;
        }

        /**
         * ProxyDomainTypes.
         */
        public Builder proxyDomainTypes(byte[] proxyDomainTypes) {
            this.proxyDomainTypes = proxyDomainTypes;
            return this;
        }

        /**
         * RequestHeaderRewriteConfig.
         */
        public Builder requestHeaderRewriteConfig(RequestHeaderRewriteConfig requestHeaderRewriteConfig) {
            this.requestHeaderRewriteConfig = requestHeaderRewriteConfig;
            return this;
        }

        /**
         * RequestQueryRewriteConfig.
         */
        public Builder requestQueryRewriteConfig(RequestQueryRewriteConfig requestQueryRewriteConfig) {
            this.requestQueryRewriteConfig = requestQueryRewriteConfig;
            return this;
        }

        /**
         * ResponseHeaderRewriteConfig.
         */
        public Builder responseHeaderRewriteConfig(ResponseHeaderRewriteConfig responseHeaderRewriteConfig) {
            this.responseHeaderRewriteConfig = responseHeaderRewriteConfig;
            return this;
        }

        /**
         * ResponseRewriteConfig.
         */
        public Builder responseRewriteConfig(ResponseRewriteConfig responseRewriteConfig) {
            this.responseRewriteConfig = responseRewriteConfig;
            return this;
        }

        public PAL7Config build() {
            return new PAL7Config(this);
        } 

    } 

    /**
     * 
     * {@link PAL7Config} extends {@link TeaModel}
     *
     * <p>PAL7Config</p>
     */
    public static class UrlBypassRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Froms")
        private java.util.List<String> froms;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<String> paths;

        private UrlBypassRules(Builder builder) {
            this.froms = builder.froms;
            this.paths = builder.paths;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrlBypassRules create() {
            return builder().build();
        }

        /**
         * @return froms
         */
        public java.util.List<String> getFroms() {
            return this.froms;
        }

        /**
         * @return paths
         */
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public static final class Builder {
            private java.util.List<String> froms; 
            private java.util.List<String> paths; 

            /**
             * Froms.
             */
            public Builder froms(java.util.List<String> froms) {
                this.froms = froms;
                return this;
            }

            /**
             * Paths.
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            public UrlBypassRules build() {
                return new UrlBypassRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAL7Config} extends {@link TeaModel}
     *
     * <p>PAL7Config</p>
     */
    public static class BypassConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppBypassFroms")
        private java.util.List<String> appBypassFroms;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("UrlBypassRules")
        private java.util.List<UrlBypassRules> urlBypassRules;

        private BypassConfig(Builder builder) {
            this.appBypassFroms = builder.appBypassFroms;
            this.mode = builder.mode;
            this.urlBypassRules = builder.urlBypassRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BypassConfig create() {
            return builder().build();
        }

        /**
         * @return appBypassFroms
         */
        public java.util.List<String> getAppBypassFroms() {
            return this.appBypassFroms;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return urlBypassRules
         */
        public java.util.List<UrlBypassRules> getUrlBypassRules() {
            return this.urlBypassRules;
        }

        public static final class Builder {
            private java.util.List<String> appBypassFroms; 
            private String mode; 
            private java.util.List<UrlBypassRules> urlBypassRules; 

            /**
             * AppBypassFroms.
             */
            public Builder appBypassFroms(java.util.List<String> appBypassFroms) {
                this.appBypassFroms = appBypassFroms;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * UrlBypassRules.
             */
            public Builder urlBypassRules(java.util.List<UrlBypassRules> urlBypassRules) {
                this.urlBypassRules = urlBypassRules;
                return this;
            }

            public BypassConfig build() {
                return new BypassConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAL7Config} extends {@link TeaModel}
     *
     * <p>PAL7Config</p>
     */
    public static class ClientIpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIpHeaders")
        private java.util.List<String> clientIpHeaders;

        @com.aliyun.core.annotation.NameInMap("TrustedProxies")
        private java.util.List<String> trustedProxies;

        private ClientIpConfig(Builder builder) {
            this.clientIpHeaders = builder.clientIpHeaders;
            this.trustedProxies = builder.trustedProxies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientIpConfig create() {
            return builder().build();
        }

        /**
         * @return clientIpHeaders
         */
        public java.util.List<String> getClientIpHeaders() {
            return this.clientIpHeaders;
        }

        /**
         * @return trustedProxies
         */
        public java.util.List<String> getTrustedProxies() {
            return this.trustedProxies;
        }

        public static final class Builder {
            private java.util.List<String> clientIpHeaders; 
            private java.util.List<String> trustedProxies; 

            /**
             * ClientIpHeaders.
             */
            public Builder clientIpHeaders(java.util.List<String> clientIpHeaders) {
                this.clientIpHeaders = clientIpHeaders;
                return this;
            }

            /**
             * TrustedProxies.
             */
            public Builder trustedProxies(java.util.List<String> trustedProxies) {
                this.trustedProxies = trustedProxies;
                return this;
            }

            public ClientIpConfig build() {
                return new ClientIpConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAL7Config} extends {@link TeaModel}
     *
     * <p>PAL7Config</p>
     */
    public static class ClientIpRestrictConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlacklistFroms")
        private java.util.List<String> blacklistFroms;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("WhitelistFroms")
        private java.util.List<String> whitelistFroms;

        private ClientIpRestrictConfig(Builder builder) {
            this.blacklistFroms = builder.blacklistFroms;
            this.mode = builder.mode;
            this.whitelistFroms = builder.whitelistFroms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientIpRestrictConfig create() {
            return builder().build();
        }

        /**
         * @return blacklistFroms
         */
        public java.util.List<String> getBlacklistFroms() {
            return this.blacklistFroms;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return whitelistFroms
         */
        public java.util.List<String> getWhitelistFroms() {
            return this.whitelistFroms;
        }

        public static final class Builder {
            private java.util.List<String> blacklistFroms; 
            private String mode; 
            private java.util.List<String> whitelistFroms; 

            /**
             * BlacklistFroms.
             */
            public Builder blacklistFroms(java.util.List<String> blacklistFroms) {
                this.blacklistFroms = blacklistFroms;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * WhitelistFroms.
             */
            public Builder whitelistFroms(java.util.List<String> whitelistFroms) {
                this.whitelistFroms = whitelistFroms;
                return this;
            }

            public ClientIpRestrictConfig build() {
                return new ClientIpRestrictConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAL7Config} extends {@link TeaModel}
     *
     * <p>PAL7Config</p>
     */
    public static class ClientTypeRestrictConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlacklistClients")
        private java.util.List<String> blacklistClients;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("WhitelistClients")
        private java.util.List<String> whitelistClients;

        private ClientTypeRestrictConfig(Builder builder) {
            this.blacklistClients = builder.blacklistClients;
            this.mode = builder.mode;
            this.whitelistClients = builder.whitelistClients;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientTypeRestrictConfig create() {
            return builder().build();
        }

        /**
         * @return blacklistClients
         */
        public java.util.List<String> getBlacklistClients() {
            return this.blacklistClients;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return whitelistClients
         */
        public java.util.List<String> getWhitelistClients() {
            return this.whitelistClients;
        }

        public static final class Builder {
            private java.util.List<String> blacklistClients; 
            private String mode; 
            private java.util.List<String> whitelistClients; 

            /**
             * BlacklistClients.
             */
            public Builder blacklistClients(java.util.List<String> blacklistClients) {
                this.blacklistClients = blacklistClients;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * WhitelistClients.
             */
            public Builder whitelistClients(java.util.List<String> whitelistClients) {
                this.whitelistClients = whitelistClients;
                return this;
            }

            public ClientTypeRestrictConfig build() {
                return new ClientTypeRestrictConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAL7Config} extends {@link TeaModel}
     *
     * <p>PAL7Config</p>
     */
    public static class DnsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServers")
        private java.util.List<String> dnsServers;

        private DnsConfig(Builder builder) {
            this.dnsServers = builder.dnsServers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsConfig create() {
            return builder().build();
        }

        /**
         * @return dnsServers
         */
        public java.util.List<String> getDnsServers() {
            return this.dnsServers;
        }

        public static final class Builder {
            private java.util.List<String> dnsServers; 

            /**
             * DnsServers.
             */
            public Builder dnsServers(java.util.List<String> dnsServers) {
                this.dnsServers = dnsServers;
                return this;
            }

            public DnsConfig build() {
                return new DnsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAL7Config} extends {@link TeaModel}
     *
     * <p>PAL7Config</p>
     */
    public static class JsHookConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("ReplaceRules")
        private java.util.List<PAL7ConfigReplaceRule> replaceRules;

        private JsHookConfig(Builder builder) {
            this.mode = builder.mode;
            this.replaceRules = builder.replaceRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JsHookConfig create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return replaceRules
         */
        public java.util.List<PAL7ConfigReplaceRule> getReplaceRules() {
            return this.replaceRules;
        }

        public static final class Builder {
            private String mode; 
            private java.util.List<PAL7ConfigReplaceRule> replaceRules; 

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * ReplaceRules.
             */
            public Builder replaceRules(java.util.List<PAL7ConfigReplaceRule> replaceRules) {
                this.replaceRules = replaceRules;
                return this;
            }

            public JsHookConfig build() {
                return new JsHookConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAL7Config} extends {@link TeaModel}
     *
     * <p>PAL7Config</p>
     */
    public static class RequestHeaderRewriteConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ops")
        private java.util.List<PAL7ConfigRewriteOp> ops;

        private RequestHeaderRewriteConfig(Builder builder) {
            this.ops = builder.ops;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestHeaderRewriteConfig create() {
            return builder().build();
        }

        /**
         * @return ops
         */
        public java.util.List<PAL7ConfigRewriteOp> getOps() {
            return this.ops;
        }

        public static final class Builder {
            private java.util.List<PAL7ConfigRewriteOp> ops; 

            /**
             * Ops.
             */
            public Builder ops(java.util.List<PAL7ConfigRewriteOp> ops) {
                this.ops = ops;
                return this;
            }

            public RequestHeaderRewriteConfig build() {
                return new RequestHeaderRewriteConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAL7Config} extends {@link TeaModel}
     *
     * <p>PAL7Config</p>
     */
    public static class RequestQueryRewriteConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ops")
        private java.util.List<PAL7ConfigRewriteOp> ops;

        private RequestQueryRewriteConfig(Builder builder) {
            this.ops = builder.ops;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestQueryRewriteConfig create() {
            return builder().build();
        }

        /**
         * @return ops
         */
        public java.util.List<PAL7ConfigRewriteOp> getOps() {
            return this.ops;
        }

        public static final class Builder {
            private java.util.List<PAL7ConfigRewriteOp> ops; 

            /**
             * Ops.
             */
            public Builder ops(java.util.List<PAL7ConfigRewriteOp> ops) {
                this.ops = ops;
                return this;
            }

            public RequestQueryRewriteConfig build() {
                return new RequestQueryRewriteConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAL7Config} extends {@link TeaModel}
     *
     * <p>PAL7Config</p>
     */
    public static class ResponseHeaderRewriteConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ops")
        private java.util.List<PAL7ConfigRewriteOp> ops;

        private ResponseHeaderRewriteConfig(Builder builder) {
            this.ops = builder.ops;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseHeaderRewriteConfig create() {
            return builder().build();
        }

        /**
         * @return ops
         */
        public java.util.List<PAL7ConfigRewriteOp> getOps() {
            return this.ops;
        }

        public static final class Builder {
            private java.util.List<PAL7ConfigRewriteOp> ops; 

            /**
             * Ops.
             */
            public Builder ops(java.util.List<PAL7ConfigRewriteOp> ops) {
                this.ops = ops;
                return this;
            }

            public ResponseHeaderRewriteConfig build() {
                return new ResponseHeaderRewriteConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAL7Config} extends {@link TeaModel}
     *
     * <p>PAL7Config</p>
     */
    public static class ResponseRewriteConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("ReplaceRules")
        private java.util.List<PAL7ConfigReplaceRule> replaceRules;

        private ResponseRewriteConfig(Builder builder) {
            this.mode = builder.mode;
            this.replaceRules = builder.replaceRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseRewriteConfig create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return replaceRules
         */
        public java.util.List<PAL7ConfigReplaceRule> getReplaceRules() {
            return this.replaceRules;
        }

        public static final class Builder {
            private String mode; 
            private java.util.List<PAL7ConfigReplaceRule> replaceRules; 

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * ReplaceRules.
             */
            public Builder replaceRules(java.util.List<PAL7ConfigReplaceRule> replaceRules) {
                this.replaceRules = replaceRules;
                return this;
            }

            public ResponseRewriteConfig build() {
                return new ResponseRewriteConfig(this);
            } 

        } 

    }
}
