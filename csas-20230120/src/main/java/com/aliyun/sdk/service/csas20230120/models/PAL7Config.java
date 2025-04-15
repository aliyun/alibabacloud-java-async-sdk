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

    @com.aliyun.core.annotation.NameInMap("DnsConfig")
    private DnsConfig dnsConfig;

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
        this.dnsConfig = builder.dnsConfig;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return dnsConfig
     */
    public DnsConfig getDnsConfig() {
        return this.dnsConfig;
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
        private DnsConfig dnsConfig; 
        private JsHookConfig jsHookConfig; 
        private byte[] proxyDomainTypes; 
        private RequestHeaderRewriteConfig requestHeaderRewriteConfig; 
        private RequestQueryRewriteConfig requestQueryRewriteConfig; 
        private ResponseHeaderRewriteConfig responseHeaderRewriteConfig; 
        private ResponseRewriteConfig responseRewriteConfig; 

        private Builder() {
        } 

        private Builder(PAL7Config model) {
            this.bypassConfig = model.bypassConfig;
            this.certId = model.certId;
            this.dnsConfig = model.dnsConfig;
            this.jsHookConfig = model.jsHookConfig;
            this.proxyDomainTypes = model.proxyDomainTypes;
            this.requestHeaderRewriteConfig = model.requestHeaderRewriteConfig;
            this.requestQueryRewriteConfig = model.requestQueryRewriteConfig;
            this.responseHeaderRewriteConfig = model.responseHeaderRewriteConfig;
            this.responseRewriteConfig = model.responseRewriteConfig;
        } 

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
         * DnsConfig.
         */
        public Builder dnsConfig(DnsConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
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

            private Builder() {
            } 

            private Builder(UrlBypassRules model) {
                this.froms = model.froms;
                this.paths = model.paths;
            } 

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

            private Builder() {
            } 

            private Builder(BypassConfig model) {
                this.appBypassFroms = model.appBypassFroms;
                this.mode = model.mode;
                this.urlBypassRules = model.urlBypassRules;
            } 

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

            private Builder() {
            } 

            private Builder(DnsConfig model) {
                this.dnsServers = model.dnsServers;
            } 

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

            private Builder() {
            } 

            private Builder(JsHookConfig model) {
                this.mode = model.mode;
                this.replaceRules = model.replaceRules;
            } 

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

            private Builder() {
            } 

            private Builder(RequestHeaderRewriteConfig model) {
                this.ops = model.ops;
            } 

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

            private Builder() {
            } 

            private Builder(RequestQueryRewriteConfig model) {
                this.ops = model.ops;
            } 

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

            private Builder() {
            } 

            private Builder(ResponseHeaderRewriteConfig model) {
                this.ops = model.ops;
            } 

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

            private Builder() {
            } 

            private Builder(ResponseRewriteConfig model) {
                this.mode = model.mode;
                this.replaceRules = model.replaceRules;
            } 

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
