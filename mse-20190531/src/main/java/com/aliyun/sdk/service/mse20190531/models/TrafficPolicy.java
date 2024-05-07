// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrafficPolicy} extends {@link TeaModel}
 *
 * <p>TrafficPolicy</p>
 */
public class TrafficPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoadBalancerSettings")
    private LoadBalancerSettings loadBalancerSettings;

    @com.aliyun.core.annotation.NameInMap("TlsSetting")
    private TlsSetting tlsSetting;

    private TrafficPolicy(Builder builder) {
        this.loadBalancerSettings = builder.loadBalancerSettings;
        this.tlsSetting = builder.tlsSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrafficPolicy create() {
        return builder().build();
    }

    /**
     * @return loadBalancerSettings
     */
    public LoadBalancerSettings getLoadBalancerSettings() {
        return this.loadBalancerSettings;
    }

    /**
     * @return tlsSetting
     */
    public TlsSetting getTlsSetting() {
        return this.tlsSetting;
    }

    public static final class Builder {
        private LoadBalancerSettings loadBalancerSettings; 
        private TlsSetting tlsSetting; 

        /**
         * LoadBalancerSettings.
         */
        public Builder loadBalancerSettings(LoadBalancerSettings loadBalancerSettings) {
            this.loadBalancerSettings = loadBalancerSettings;
            return this;
        }

        /**
         * TlsSetting.
         */
        public Builder tlsSetting(TlsSetting tlsSetting) {
            this.tlsSetting = tlsSetting;
            return this;
        }

        public TrafficPolicy build() {
            return new TrafficPolicy(this);
        } 

    } 

    public static class HttpCookie extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("TTL")
        private String TTL;

        private HttpCookie(Builder builder) {
            this.name = builder.name;
            this.path = builder.path;
            this.TTL = builder.TTL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpCookie create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return TTL
         */
        public String getTTL() {
            return this.TTL;
        }

        public static final class Builder {
            private String name; 
            private String path; 
            private String TTL; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * TTL.
             */
            public Builder TTL(String TTL) {
                this.TTL = TTL;
                return this;
            }

            public HttpCookie build() {
                return new HttpCookie(this);
            } 

        } 

    }
    public static class ConsistentHashLBConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsistentHashLBType")
        private String consistentHashLBType;

        @com.aliyun.core.annotation.NameInMap("HttpCookie")
        private HttpCookie httpCookie;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        private ConsistentHashLBConfig(Builder builder) {
            this.consistentHashLBType = builder.consistentHashLBType;
            this.httpCookie = builder.httpCookie;
            this.parameterName = builder.parameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsistentHashLBConfig create() {
            return builder().build();
        }

        /**
         * @return consistentHashLBType
         */
        public String getConsistentHashLBType() {
            return this.consistentHashLBType;
        }

        /**
         * @return httpCookie
         */
        public HttpCookie getHttpCookie() {
            return this.httpCookie;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        public static final class Builder {
            private String consistentHashLBType; 
            private HttpCookie httpCookie; 
            private String parameterName; 

            /**
             * ConsistentHashLBType.
             */
            public Builder consistentHashLBType(String consistentHashLBType) {
                this.consistentHashLBType = consistentHashLBType;
                return this;
            }

            /**
             * HttpCookie.
             */
            public Builder httpCookie(HttpCookie httpCookie) {
                this.httpCookie = httpCookie;
                return this;
            }

            /**
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            public ConsistentHashLBConfig build() {
                return new ConsistentHashLBConfig(this);
            } 

        } 

    }
    public static class LoadBalancerSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsistentHashLBConfig")
        private ConsistentHashLBConfig consistentHashLBConfig;

        @com.aliyun.core.annotation.NameInMap("LoadbalancerType")
        private String loadbalancerType;

        @com.aliyun.core.annotation.NameInMap("WarmupDuration")
        private Long warmupDuration;

        private LoadBalancerSettings(Builder builder) {
            this.consistentHashLBConfig = builder.consistentHashLBConfig;
            this.loadbalancerType = builder.loadbalancerType;
            this.warmupDuration = builder.warmupDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerSettings create() {
            return builder().build();
        }

        /**
         * @return consistentHashLBConfig
         */
        public ConsistentHashLBConfig getConsistentHashLBConfig() {
            return this.consistentHashLBConfig;
        }

        /**
         * @return loadbalancerType
         */
        public String getLoadbalancerType() {
            return this.loadbalancerType;
        }

        /**
         * @return warmupDuration
         */
        public Long getWarmupDuration() {
            return this.warmupDuration;
        }

        public static final class Builder {
            private ConsistentHashLBConfig consistentHashLBConfig; 
            private String loadbalancerType; 
            private Long warmupDuration; 

            /**
             * ConsistentHashLBConfig.
             */
            public Builder consistentHashLBConfig(ConsistentHashLBConfig consistentHashLBConfig) {
                this.consistentHashLBConfig = consistentHashLBConfig;
                return this;
            }

            /**
             * LoadbalancerType.
             */
            public Builder loadbalancerType(String loadbalancerType) {
                this.loadbalancerType = loadbalancerType;
                return this;
            }

            /**
             * WarmupDuration.
             */
            public Builder warmupDuration(Long warmupDuration) {
                this.warmupDuration = warmupDuration;
                return this;
            }

            public LoadBalancerSettings build() {
                return new LoadBalancerSettings(this);
            } 

        } 

    }
    public static class TlsSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaCertContent")
        private String caCertContent;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("Sni")
        private String sni;

        @com.aliyun.core.annotation.NameInMap("TlsMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tlsMode;

        private TlsSetting(Builder builder) {
            this.caCertContent = builder.caCertContent;
            this.certId = builder.certId;
            this.sni = builder.sni;
            this.tlsMode = builder.tlsMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TlsSetting create() {
            return builder().build();
        }

        /**
         * @return caCertContent
         */
        public String getCaCertContent() {
            return this.caCertContent;
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return sni
         */
        public String getSni() {
            return this.sni;
        }

        /**
         * @return tlsMode
         */
        public String getTlsMode() {
            return this.tlsMode;
        }

        public static final class Builder {
            private String caCertContent; 
            private String certId; 
            private String sni; 
            private String tlsMode; 

            /**
             * CaCertContent.
             */
            public Builder caCertContent(String caCertContent) {
                this.caCertContent = caCertContent;
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
             * Sni.
             */
            public Builder sni(String sni) {
                this.sni = sni;
                return this;
            }

            /**
             * TlsMode.
             */
            public Builder tlsMode(String tlsMode) {
                this.tlsMode = tlsMode;
                return this;
            }

            public TlsSetting build() {
                return new TlsSetting(this);
            } 

        } 

    }
}
