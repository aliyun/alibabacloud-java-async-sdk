// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListGatewayServiceResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayServiceResponseBody</p>
 */
public class ListGatewayServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListGatewayServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>You are not authorized to perform this operation.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F46CDBA4-B1EE-5C94-8A48-51C10177****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGatewayServiceResponseBody build() {
            return new ListGatewayServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayServiceResponseBody</p>
     */
    public static class HttpCookie extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private String ttl;

        private HttpCookie(Builder builder) {
            this.name = builder.name;
            this.path = builder.path;
            this.ttl = builder.ttl;
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
         * @return ttl
         */
        public String getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private String name; 
            private String path; 
            private String ttl; 

            /**
             * <p>The name of the cookie.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The path of the cookie.</p>
             * 
             * <strong>example:</strong>
             * <p>/path</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The lifecycle of the cookie.</p>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder ttl(String ttl) {
                this.ttl = ttl;
                return this;
            }

            public HttpCookie build() {
                return new HttpCookie(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayServiceResponseBody</p>
     */
    public static class ConsistentHashLBConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsistentHashLBType")
        private String consistentHashLBType;

        @com.aliyun.core.annotation.NameInMap("HttpCookie")
        private HttpCookie httpCookie;

        @com.aliyun.core.annotation.NameInMap("MinimumRingSize")
        private Long minimumRingSize;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        private ConsistentHashLBConfig(Builder builder) {
            this.consistentHashLBType = builder.consistentHashLBType;
            this.httpCookie = builder.httpCookie;
            this.minimumRingSize = builder.minimumRingSize;
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
         * @return minimumRingSize
         */
        public Long getMinimumRingSize() {
            return this.minimumRingSize;
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
            private Long minimumRingSize; 
            private String parameterName; 

            /**
             * <p>The type based on which consistent hashing load balancing is performed.</p>
             * <ul>
             * <li>HEADER</li>
             * <li>COOKIE</li>
             * <li>SOURCE_IP</li>
             * <li>QUERY_PARAMETER</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HEADER</p>
             */
            public Builder consistentHashLBType(String consistentHashLBType) {
                this.consistentHashLBType = consistentHashLBType;
                return this;
            }

            /**
             * <p>The cookie-based load balancing parameters.</p>
             */
            public Builder httpCookie(HttpCookie httpCookie) {
                this.httpCookie = httpCookie;
                return this;
            }

            /**
             * <p>The minimum value of the hash ring.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder minimumRingSize(Long minimumRingSize) {
                this.minimumRingSize = minimumRingSize;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>param</p>
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
    /**
     * 
     * {@link ListGatewayServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayServiceResponseBody</p>
     */
    public static class LoadBalancerSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsistentHashLBConfig")
        private ConsistentHashLBConfig consistentHashLBConfig;

        @com.aliyun.core.annotation.NameInMap("LoadbalancerType")
        private String loadbalancerType;

        @com.aliyun.core.annotation.NameInMap("WarmupDuration")
        private Integer warmupDuration;

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
        public Integer getWarmupDuration() {
            return this.warmupDuration;
        }

        public static final class Builder {
            private ConsistentHashLBConfig consistentHashLBConfig; 
            private String loadbalancerType; 
            private Integer warmupDuration; 

            /**
             * <p>The consistent hashing settings.</p>
             */
            public Builder consistentHashLBConfig(ConsistentHashLBConfig consistentHashLBConfig) {
                this.consistentHashLBConfig = consistentHashLBConfig;
                return this;
            }

            /**
             * <p>The load balancing type.</p>
             * <ul>
             * <li>ROUND_ROBIN</li>
             * <li>LEAST_CONN</li>
             * <li>RANDOM</li>
             * <li>CONSISTENT_HASH</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RANDOM</p>
             */
            public Builder loadbalancerType(String loadbalancerType) {
                this.loadbalancerType = loadbalancerType;
                return this;
            }

            /**
             * <p>The prefetch time of the least connection load balancing.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder warmupDuration(Integer warmupDuration) {
                this.warmupDuration = warmupDuration;
                return this;
            }

            public LoadBalancerSettings build() {
                return new LoadBalancerSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayServiceResponseBody</p>
     */
    public static class Tls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaCertContent")
        private String caCertContent;

        @com.aliyun.core.annotation.NameInMap("CaCertId")
        private String caCertId;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Sni")
        private String sni;

        @com.aliyun.core.annotation.NameInMap("SubjectAltNames")
        private java.util.List < String > subjectAltNames;

        private Tls(Builder builder) {
            this.caCertContent = builder.caCertContent;
            this.caCertId = builder.caCertId;
            this.certId = builder.certId;
            this.mode = builder.mode;
            this.sni = builder.sni;
            this.subjectAltNames = builder.subjectAltNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tls create() {
            return builder().build();
        }

        /**
         * @return caCertContent
         */
        public String getCaCertContent() {
            return this.caCertContent;
        }

        /**
         * @return caCertId
         */
        public String getCaCertId() {
            return this.caCertId;
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return sni
         */
        public String getSni() {
            return this.sni;
        }

        /**
         * @return subjectAltNames
         */
        public java.util.List < String > getSubjectAltNames() {
            return this.subjectAltNames;
        }

        public static final class Builder {
            private String caCertContent; 
            private String caCertId; 
            private String certId; 
            private String mode; 
            private String sni; 
            private java.util.List < String > subjectAltNames; 

            /**
             * <p>The public key of the CA certificate .</p>
             * 
             * <strong>example:</strong>
             * <p>content</p>
             */
            public Builder caCertContent(String caCertContent) {
                this.caCertContent = caCertContent;
                return this;
            }

            /**
             * <p>The ID of the certification authority (CA) certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>5******-cn-hangzhou</p>
             */
            public Builder caCertId(String caCertId) {
                this.caCertId = caCertId;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>5******-cn-hangzhou</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The TLS mode.</p>
             * <ul>
             * <li>DISABLE</li>
             * <li>SIMPLE</li>
             * <li>MUTUAL</li>
             * <li>ISTIO_MUTUAL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The Server Name Indication (SNI) value.</p>
             * 
             * <strong>example:</strong>
             * <p>name-sni</p>
             */
            public Builder sni(String sni) {
                this.sni = sni;
                return this;
            }

            /**
             * <p>The array of subject aliases.</p>
             */
            public Builder subjectAltNames(java.util.List < String > subjectAltNames) {
                this.subjectAltNames = subjectAltNames;
                return this;
            }

            public Tls build() {
                return new Tls(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayServiceResponseBody</p>
     */
    public static class GatewayTrafficPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerSettings")
        private LoadBalancerSettings loadBalancerSettings;

        @com.aliyun.core.annotation.NameInMap("Tls")
        private Tls tls;

        private GatewayTrafficPolicy(Builder builder) {
            this.loadBalancerSettings = builder.loadBalancerSettings;
            this.tls = builder.tls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayTrafficPolicy create() {
            return builder().build();
        }

        /**
         * @return loadBalancerSettings
         */
        public LoadBalancerSettings getLoadBalancerSettings() {
            return this.loadBalancerSettings;
        }

        /**
         * @return tls
         */
        public Tls getTls() {
            return this.tls;
        }

        public static final class Builder {
            private LoadBalancerSettings loadBalancerSettings; 
            private Tls tls; 

            /**
             * <p>The load balancing settings.</p>
             */
            public Builder loadBalancerSettings(LoadBalancerSettings loadBalancerSettings) {
                this.loadBalancerSettings = loadBalancerSettings;
                return this;
            }

            /**
             * <p>The Transport Layer Security (TLS).</p>
             */
            public Builder tls(Tls tls) {
                this.tls = tls;
                return this;
            }

            public GatewayTrafficPolicy build() {
                return new GatewayTrafficPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayServiceResponseBody</p>
     */
    public static class HealthCheckInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Check")
        private Boolean check;

        @com.aliyun.core.annotation.NameInMap("ExpectedStatuses")
        private java.util.List < Integer > expectedStatuses;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("HttpHost")
        private String httpHost;

        @com.aliyun.core.annotation.NameInMap("HttpPath")
        private String httpPath;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheckInfo(Builder builder) {
            this.check = builder.check;
            this.expectedStatuses = builder.expectedStatuses;
            this.healthyThreshold = builder.healthyThreshold;
            this.httpHost = builder.httpHost;
            this.httpPath = builder.httpPath;
            this.interval = builder.interval;
            this.protocol = builder.protocol;
            this.timeout = builder.timeout;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheckInfo create() {
            return builder().build();
        }

        /**
         * @return check
         */
        public Boolean getCheck() {
            return this.check;
        }

        /**
         * @return expectedStatuses
         */
        public java.util.List < Integer > getExpectedStatuses() {
            return this.expectedStatuses;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return httpHost
         */
        public String getHttpHost() {
            return this.httpHost;
        }

        /**
         * @return httpPath
         */
        public String getHttpPath() {
            return this.httpPath;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public static final class Builder {
            private Boolean check; 
            private java.util.List < Integer > expectedStatuses; 
            private Integer healthyThreshold; 
            private String httpHost; 
            private String httpPath; 
            private Integer interval; 
            private String protocol; 
            private Integer timeout; 
            private Integer unhealthyThreshold; 

            /**
             * <p>Indicates whether checks are performed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder check(Boolean check) {
                this.check = check;
                return this;
            }

            /**
             * <p>The expected status of the health check.</p>
             */
            public Builder expectedStatuses(java.util.List < Integer > expectedStatuses) {
                this.expectedStatuses = expectedStatuses;
                return this;
            }

            /**
             * <p>The threshold for healthy instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The endpoint of the HTTP request for the health check.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://172.168.0.1">http://172.168.0.1</a></p>
             */
            public Builder httpHost(String httpHost) {
                this.httpHost = httpHost;
                return this;
            }

            /**
             * <p>The path to which the HTTP request for the health check is sent.</p>
             * 
             * <strong>example:</strong>
             * <p>/health</p>
             */
            public Builder httpPath(String httpPath) {
                this.httpPath = httpPath;
                return this;
            }

            /**
             * <p>The health check interval.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The network protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The timeout period.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The threshold for unhealthy instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public HealthCheckInfo build() {
                return new HealthCheckInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayServiceResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Versions(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayServiceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayTrafficPolicy")
        private GatewayTrafficPolicy gatewayTrafficPolicy;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HealehStatus")
        private String healehStatus;

        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private Boolean healthCheck;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInfo")
        private HealthCheckInfo healthCheckInfo;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private java.util.List < String > ips;

        @com.aliyun.core.annotation.NameInMap("MetaInfo")
        private String metaInfo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List < Integer > ports;

        @com.aliyun.core.annotation.NameInMap("ServiceFQDN")
        private String serviceFQDN;

        @com.aliyun.core.annotation.NameInMap("ServiceNameInRegistry")
        private String serviceNameInRegistry;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Long servicePort;

        @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
        private String serviceProtocol;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("UnhealthyEndpoints")
        private java.util.List < String > unhealthyEndpoints;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private java.util.List < Versions> versions;

        private Result(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.gatewayTrafficPolicy = builder.gatewayTrafficPolicy;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupName = builder.groupName;
            this.healehStatus = builder.healehStatus;
            this.healthCheck = builder.healthCheck;
            this.healthCheckInfo = builder.healthCheckInfo;
            this.healthStatus = builder.healthStatus;
            this.id = builder.id;
            this.ips = builder.ips;
            this.metaInfo = builder.metaInfo;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.ports = builder.ports;
            this.serviceFQDN = builder.serviceFQDN;
            this.serviceNameInRegistry = builder.serviceNameInRegistry;
            this.servicePort = builder.servicePort;
            this.serviceProtocol = builder.serviceProtocol;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
            this.unhealthyEndpoints = builder.unhealthyEndpoints;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayTrafficPolicy
         */
        public GatewayTrafficPolicy getGatewayTrafficPolicy() {
            return this.gatewayTrafficPolicy;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return healehStatus
         */
        public String getHealehStatus() {
            return this.healehStatus;
        }

        /**
         * @return healthCheck
         */
        public Boolean getHealthCheck() {
            return this.healthCheck;
        }

        /**
         * @return healthCheckInfo
         */
        public HealthCheckInfo getHealthCheckInfo() {
            return this.healthCheckInfo;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ips
         */
        public java.util.List < String > getIps() {
            return this.ips;
        }

        /**
         * @return metaInfo
         */
        public String getMetaInfo() {
            return this.metaInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return ports
         */
        public java.util.List < Integer > getPorts() {
            return this.ports;
        }

        /**
         * @return serviceFQDN
         */
        public String getServiceFQDN() {
            return this.serviceFQDN;
        }

        /**
         * @return serviceNameInRegistry
         */
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        /**
         * @return servicePort
         */
        public Long getServicePort() {
            return this.servicePort;
        }

        /**
         * @return serviceProtocol
         */
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return unhealthyEndpoints
         */
        public java.util.List < String > getUnhealthyEndpoints() {
            return this.unhealthyEndpoints;
        }

        /**
         * @return versions
         */
        public java.util.List < Versions> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private Long gatewayId; 
            private GatewayTrafficPolicy gatewayTrafficPolicy; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String groupName; 
            private String healehStatus; 
            private Boolean healthCheck; 
            private HealthCheckInfo healthCheckInfo; 
            private String healthStatus; 
            private Long id; 
            private java.util.List < String > ips; 
            private String metaInfo; 
            private String name; 
            private String namespace; 
            private java.util.List < Integer > ports; 
            private String serviceFQDN; 
            private String serviceNameInRegistry; 
            private Long servicePort; 
            private String serviceProtocol; 
            private Long sourceId; 
            private String sourceType; 
            private java.util.List < String > unhealthyEndpoints; 
            private java.util.List < Versions> versions; 

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The traffic management policy.</p>
             */
            public Builder gatewayTrafficPolicy(GatewayTrafficPolicy gatewayTrafficPolicy) {
                this.gatewayTrafficPolicy = gatewayTrafficPolicy;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-5017305290e14centbrveca****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07 18:07:57</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07 18:07:57</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The health status.</p>
             * <ul>
             * <li>Health</li>
             * <li>Unhealthy</li>
             * <li>Unknown</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unhealthy</p>
             */
            public Builder healehStatus(String healehStatus) {
                this.healehStatus = healehStatus;
                return this;
            }

            /**
             * <p>Indicates whether health checks are performed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder healthCheck(Boolean healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The information about health checks.</p>
             */
            public Builder healthCheckInfo(HealthCheckInfo healthCheckInfo) {
                this.healthCheckInfo = healthCheckInfo;
                return this;
            }

            /**
             * <p>The health status.</p>
             * <ul>
             * <li>Health</li>
             * <li>Unhealthy</li>
             * <li>Unknown</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unhealthy</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The list of IP addresses.</p>
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The metadata or IP addresses of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metaInfo(String metaInfo) {
                this.metaInfo = metaInfo;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The port array.</p>
             */
            public Builder ports(java.util.List < Integer > ports) {
                this.ports = ports;
                return this;
            }

            /**
             * ServiceFQDN.
             */
            public Builder serviceFQDN(String serviceFQDN) {
                this.serviceFQDN = serviceFQDN;
                return this;
            }

            /**
             * <p>The name of the service that is registered with the service registry.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder serviceNameInRegistry(String serviceNameInRegistry) {
                this.serviceNameInRegistry = serviceNameInRegistry;
                return this;
            }

            /**
             * <p>The service port number.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder servicePort(Long servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The protocol of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * <p>The ID of the service source.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The source type.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The array of endpoints of unhealthy instances.</p>
             */
            public Builder unhealthyEndpoints(java.util.List < String > unhealthyEndpoints) {
                this.unhealthyEndpoints = unhealthyEndpoints;
                return this;
            }

            /**
             * <p>The service version.</p>
             */
            public Builder versions(java.util.List < Versions> versions) {
                this.versions = versions;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Result> result; 
            private Long totalSize; 

            /**
             * <p>The number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The data returned.</p>
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
