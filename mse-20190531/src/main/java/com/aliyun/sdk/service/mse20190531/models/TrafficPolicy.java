// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrafficPolicy} extends {@link TeaModel}
 *
 * <p>TrafficPolicy</p>
 */
public class TrafficPolicy extends TeaModel {
    @NameInMap("LoadBalancerSettings")
    private LoadBalancerSettings loadBalancerSettings;

    @NameInMap("TlsSetting")
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
         * 负载均衡相关配置
         */
        public Builder loadBalancerSettings(LoadBalancerSettings loadBalancerSettings) {
            this.loadBalancerSettings = loadBalancerSettings;
            return this;
        }

        /**
         * tls相关配置
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
        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("TTL")
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
             * cookie名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * cookie path
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * cookie生命周期
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
        @NameInMap("ConsistentHashLBType")
        private String consistentHashLBType;

        @NameInMap("HttpCookie")
        private HttpCookie httpCookie;

        @NameInMap("ParameterName")
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
             * HEADER, COOKIE, SOURCE_IP, QUERY_PARAMETER
             */
            public Builder consistentHashLBType(String consistentHashLBType) {
                this.consistentHashLBType = consistentHashLBType;
                return this;
            }

            /**
             * 使用cookie时配置
             */
            public Builder httpCookie(HttpCookie httpCookie) {
                this.httpCookie = httpCookie;
                return this;
            }

            /**
             * 使用根据header和参数路由时生效
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
        @NameInMap("ConsistentHashLBConfig")
        private ConsistentHashLBConfig consistentHashLBConfig;

        @NameInMap("LoadbalancerType")
        private String loadbalancerType;

        @NameInMap("WarmupDuration")
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
             * 一致性hash相关配置
             */
            public Builder consistentHashLBConfig(ConsistentHashLBConfig consistentHashLBConfig) {
                this.consistentHashLBConfig = consistentHashLBConfig;
                return this;
            }

            /**
             * 负载均衡类型，枚举类可为ROUND_ROBIN, LEAST_CONN,RANDOM, CONSISTENT_HASH
             */
            public Builder loadbalancerType(String loadbalancerType) {
                this.loadbalancerType = loadbalancerType;
                return this;
            }

            /**
             * 预热时间(单位/s)
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
        @NameInMap("CaCertContent")
        private String caCertContent;

        @NameInMap("CertId")
        private String certId;

        @NameInMap("Sni")
        private String sni;

        @NameInMap("TlsMode")
        @Validation(required = true)
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
             * ca证书内容
             */
            public Builder caCertContent(String caCertContent) {
                this.caCertContent = caCertContent;
                return this;
            }

            /**
             * 使用的证书id，仅当为mutual时需要填写
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * 到后端服务些带
             */
            public Builder sni(String sni) {
                this.sni = sni;
                return this;
            }

            /**
             * tls模式。为枚举类，可为NONE, SIMPLE, MUITUAL
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
