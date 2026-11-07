// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TrafficPolicy model) {
            this.loadBalancerSettings = model.loadBalancerSettings;
            this.tlsSetting = model.tlsSetting;
        } 

        /**
         * <p>The load balancing settings.</p>
         */
        public Builder loadBalancerSettings(LoadBalancerSettings loadBalancerSettings) {
            this.loadBalancerSettings = loadBalancerSettings;
            return this;
        }

        /**
         * <p>The data structure.</p>
         */
        public Builder tlsSetting(TlsSetting tlsSetting) {
            this.tlsSetting = tlsSetting;
            return this;
        }

        public TrafficPolicy build() {
            return new TrafficPolicy(this);
        } 

    } 

    /**
     * 
     * {@link TrafficPolicy} extends {@link TeaModel}
     *
     * <p>TrafficPolicy</p>
     */
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

            private Builder() {
            } 

            private Builder(HttpCookie model) {
                this.name = model.name;
                this.path = model.path;
                this.TTL = model.TTL;
            } 

            /**
             * <p>The name of the cookie.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
             * <p>10s</p>
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
    /**
     * 
     * {@link TrafficPolicy} extends {@link TeaModel}
     *
     * <p>TrafficPolicy</p>
     */
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

            private Builder() {
            } 

            private Builder(ConsistentHashLBConfig model) {
                this.consistentHashLBType = model.consistentHashLBType;
                this.httpCookie = model.httpCookie;
                this.parameterName = model.parameterName;
            } 

            /**
             * <p>The type of the object based on which consistent hashing is performed. Valid values:</p>
             * <ul>
             * <li>QUERY_PARAMETER: request parameter</li>
             * <li>COOKIE: cookie</li>
             * <li>SOURCE_IP: the source IP address</li>
             * <li>HEADER: request header</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>QUERY_PARAMETER</p>
             */
            public Builder consistentHashLBType(String consistentHashLBType) {
                this.consistentHashLBType = consistentHashLBType;
                return this;
            }

            /**
             * <p>You must specify this parameter only if ConsistentHashLBType is set to COOKIE.</p>
             */
            public Builder httpCookie(HttpCookie httpCookie) {
                this.httpCookie = httpCookie;
                return this;
            }

            /**
             * <p>The name of the object based on which consistent hashing is performed. If consistent hashing is performed based on a parameter, set the value to the parameter name. If consistent hashing is performed based on a header, set the value to the header name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
     * {@link TrafficPolicy} extends {@link TeaModel}
     *
     * <p>TrafficPolicy</p>
     */
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

            private Builder() {
            } 

            private Builder(LoadBalancerSettings model) {
                this.consistentHashLBConfig = model.consistentHashLBConfig;
                this.loadbalancerType = model.loadbalancerType;
                this.warmupDuration = model.warmupDuration;
            } 

            /**
             * <p>The data structure.</p>
             */
            public Builder consistentHashLBConfig(ConsistentHashLBConfig consistentHashLBConfig) {
                this.consistentHashLBConfig = consistentHashLBConfig;
                return this;
            }

            /**
             * <p>The load balancing type. Valid values:</p>
             * <ul>
             * <li><pre><code>  ROUND_ROBIN: round robin 
             * </code></pre>
             * </li>
             * <li><pre><code>  LEAST_CONN: least connection load balancing 
             * </code></pre>
             * </li>
             * <li><pre><code>  RANDOM: random load balancing 
             * </code></pre>
             * </li>
             * <li><pre><code>  CONSISTENT_HASH: consistent hashing load balancing
             * </code></pre>
             * </li>
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
             * <p>The prefetch duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
    /**
     * 
     * {@link TrafficPolicy} extends {@link TeaModel}
     *
     * <p>TrafficPolicy</p>
     */
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

            private Builder() {
            } 

            private Builder(TlsSetting model) {
                this.caCertContent = model.caCertContent;
                this.certId = model.certId;
                this.sni = model.sni;
                this.tlsMode = model.tlsMode;
            } 

            /**
             * <p>The trusted CA certificate chain. In mTLS, if the backend service certificate is issued by a private certificate authority (CA), you must add its CA certificate to the trusted CA certificate chain.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE----- MIIH0zCCBbugAwIBAgIIXsO3pkN/pOAwDQYJKoZIhvcNAQEFBQAwQjESMBAGA1UE AwwJQUNDVlJBSVoxMRAwDgYDVQQLDAdQS0lBQ0NWMQ0wCwYDVQQKDARBQ0NWMQsw CQYDVQQGEwJFUzAeFw0xMTA1MDUwOTM3MzdaFw0zMDEyMzEwOTM3MzdaMEIxEjAQ BgNVBAMMCUFDQ1ZSQUlaMTEQMA4GA1UECwwHUEtJQUNDVjENMAsGA1UECgwEQUND VjELMAkGA1UEBhMCRVMwggIiMA0GCSqGSIb3DQEBAQUAA4ICDwAwggIKAoICAQCb qau/YUqXry+XZpp0X9DZlv3P4uRm7x8fRzPCRKPfmt4ftVTdFXxpNRFvu8gMjmoY HtiP2Ra8EEg2XPBjs5BaXCQ316PWywlxufEBcoSwfdtNgM3802/J+Nq2DoLSRYWo G2ioPej0RGy9ocLLA76MPhMAhN9KSMDjIgro6TenGEyxCQ0jVn8ETdkXhBilyNpA lHPrzg5XPAOBOp0KoVdDaaxXbXmQeOW1tDvYvEyNKKGno6e6Ak4l0Squ7a4DIrhr IA8wKFSVf+DuzgpmndFALW4ir50awQUZ0m/A8p/4e7MCQvtQqR0tkw8jq8bBD5L/ 0KIV9VMJcRz/RROE5iZe+OCIHAr8Fraocwa48GOEAqDGWuzndN9wrqODJerWx5eH k6fGioozl2A3ED6XPm4pFdahD9GILBKfb6qkxkLrQaLjlUPTAYVtjrs78yM2x/47 4KElB0iryYl0/wiPgL/AlmXz7uxLaL2diMMxs0Dx6M/2OLuc5NF/1OVYm3z61PMO m3WR5LpSLhl+0fXNWhn8ugb2+1KoS5kE3fj5tItQo05iifCHJPqDQsGH+tUtKSpa cXpkatcnYGMN285J9Y0fkIkyF/hzQ7jSWpOGYdbhdQrqeWZ2iE9x6wQl1gpaepPl uUsXQA+xtrn13k/c4LOsOxFwYIRKQ26ZIMApcQrAZQIDAQABo4ICyzCCAscwfQYI KwYBBQUHAQEEcTBvMEwGCCsGAQUFBzAChkBodHRwOi8vd3d3LmFjY3YuZXMvZmls ZWFkbWluL0FyY2hpdm9zL2NlcnRpZmljYWRvcy9yYWl6YWNjdjEuY3J0MB8GCCsG AQUFBzABhhNodHRwOi8vb2NzcC5hY2N2LmVzMB0GA1UdDgQWBBTSh7Tj3zcnk1X2 VuqB5TbMjB4/vTAPBgNVHRMBAf8EBTADAQH/MB8GA1UdIwQYMBaAFNKHtOPfNyeT VfZW6oHlNsyMHj+9MIIBcwYDVR0gBIIBajCCAWYwggFiBgRVHSAAMIIBWDCCASIG CCsGAQUFBwICMIIBFB6CARAAQQB1AHQAbwByAGkAZABhAGQAIABkAGUAIABDAGUA cgB0AGkAZgBpAGMAYQBjAGkA8wBuACAAUgBhAO0AegAgAGQAZQAgAGwAYQAgAEEA QwBDAFYAIAAoAEEAZwBlAG4AYwBpAGEAIABkAGUAIABUAGUAYwBuAG8AbABvAGcA 7QBhACAAeQAgAEMAZQByAHQAaQBmAGkAYwBhAGMAaQDzAG4AIABFAGwAZQBjAHQA cgDzAG4AaQBjAGEALAAgAEMASQBGACAAUQA0ADYAMAAxADEANQA2AEUAKQAuACAA QwBQAFMAIABlAG4AIABoAHQAdABwADoALwAvAHcAdwB3AC4AYQBjAGMAdgAuAGUA czAwBggrBgEFBQcCARYkaHR0cDovL3d3dy5hY2N2LmVzL2xlZ2lzbGFjaW9uX2Mu aHRtMFUGA1UdHwROMEwwSqBIoEaGRGh0dHA6Ly93d3cuYWNjdi5lcy9maWxlYWRt aW4vQXJjaGl2b3MvY2VydGlmaWNhZG9zL3JhaXphY2N2MV9kZXIuY3JsMA4GA1Ud DwEB/wQEAwIBBjAXBgNVHREEEDAOgQxhY2N2QGFjY3YuZXMwDQYJKoZIhvcNAQEF BQADggIBAJcxAp/n/UNnSEQU5CmH7UwoZtCPNdpNYbdKl02125DgBS4OxnnQ8pdp D70ER9m+27Up2pvZrqmZ1dM8MJP1jaGo/AaNRPTKFpV8M9xii6g3+CfYCS0b78gU JyCpZET/LtZ1qmxNYEAZSUNUY9rizLpm5U9EelvZaoErQNV/+QEnWCzI7UiRfD+m AM/EKXMRNt6GGT6d7hmKG9Ww7Y49nCrADdg9ZuM8Db3VlFzi4qc1GwQA9j9ajepD vV+JHanBsMyZ4k0ACtrJJ1vnE5Bc5PUzolVt3OAJTS+xJlsndQAJxGJ3KQhfnlms tn6tn1QwIgPBHnFk/vk4CpYY3QIUrCPLBhwepH2NDd4nQeit2hW3sCPdK6jT2iWH 7ehVRE2I9DZ+hJp4rPcOVkkO1jMl1oRQQmwgEh0q1b688nCBpHBgvgW1m54ERL5h I6zppSSMEYCUWqKiuUnSwdzRp+0xESyeGabu4VXhwOrPDYTkF7eifKXeVSUG7szA h1xA2syVP1XgNce4hL60Xc16gwFy7ofmXx2utYXGJt/mwZrpHgJHnyqobalbz+xF d3+YJ5oyXSrjhO7FmGYvliAd3djDJ9ew+f7Zfc3Qn48LFFhRny+Lwzgt3uiP1o2H pPVWQxaZLPSkVrQ0uGE3ycJYgBugl6H8WY3pEfbRD0tVNEYqi4Y7 -----END CERTIFICATE-----</p>
             */
            public Builder caCertContent(String caCertContent) {
                this.caCertContent = caCertContent;
                return this;
            }

            /**
             * <p>The ID of the certificate that is managed in Alibaba Cloud Security.</p>
             * 
             * <strong>example:</strong>
             * <p>6456988-cn-hangzhou</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The server name indication (SNI) that is used to establish TLS links.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder sni(String sni) {
                this.sni = sni;
                return this;
            }

            /**
             * <p>The Transport Layer Security (TLS) mode that is used to distribute traffic to backend services. Valid values:</p>
             * <ul>
             * <li>DISABLE: TLS is disabled. Plaintext is used.</li>
             * <li>SIMPLE: TLS is enabled.</li>
             * <li>MUTUAL: Mutual Transport Layer Security (mTLS) is enabled.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
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
