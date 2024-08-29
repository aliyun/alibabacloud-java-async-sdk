// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceDetailsResponseBody</p>
 */
public class DescribeInstanceDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceDetails")
    private java.util.List < InstanceDetails> instanceDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceDetailsResponseBody(Builder builder) {
        this.instanceDetails = builder.instanceDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceDetails
     */
    public java.util.List < InstanceDetails> getInstanceDetails() {
        return this.instanceDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceDetails> instanceDetails; 
        private String requestId; 

        /**
         * The IP address and ISP line information about the Anti-DDoS Proxy instance.
         */
        public Builder instanceDetails(java.util.List < InstanceDetails> instanceDetails) {
            this.instanceDetails = instanceDetails;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceDetailsResponseBody build() {
            return new DescribeInstanceDetailsResponseBody(this);
        } 

    } 

    public static class EipInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertConfigured")
        private Boolean certConfigured;

        @com.aliyun.core.annotation.NameInMap("Eip")
        private String eip;

        @com.aliyun.core.annotation.NameInMap("FunctionVersion")
        private String functionVersion;

        @com.aliyun.core.annotation.NameInMap("IpMode")
        private String ipMode;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("Ssl13Enabled")
        private Boolean ssl13Enabled;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TlsVersion")
        private String tlsVersion;

        private EipInfos(Builder builder) {
            this.certConfigured = builder.certConfigured;
            this.eip = builder.eip;
            this.functionVersion = builder.functionVersion;
            this.ipMode = builder.ipMode;
            this.ipVersion = builder.ipVersion;
            this.ssl13Enabled = builder.ssl13Enabled;
            this.status = builder.status;
            this.tlsVersion = builder.tlsVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipInfos create() {
            return builder().build();
        }

        /**
         * @return certConfigured
         */
        public Boolean getCertConfigured() {
            return this.certConfigured;
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
        }

        /**
         * @return functionVersion
         */
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        /**
         * @return ipMode
         */
        public String getIpMode() {
            return this.ipMode;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return ssl13Enabled
         */
        public Boolean getSsl13Enabled() {
            return this.ssl13Enabled;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tlsVersion
         */
        public String getTlsVersion() {
            return this.tlsVersion;
        }

        public static final class Builder {
            private Boolean certConfigured; 
            private String eip; 
            private String functionVersion; 
            private String ipMode; 
            private String ipVersion; 
            private Boolean ssl13Enabled; 
            private String status; 
            private String tlsVersion; 

            /**
             * Indicates whether a custom certificate is configured.
             */
            public Builder certConfigured(Boolean certConfigured) {
                this.certConfigured = certConfigured;
                return this;
            }

            /**
             * The IP address of the instance.
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * The type of the instance.
             */
            public Builder functionVersion(String functionVersion) {
                this.functionVersion = functionVersion;
                return this;
            }

            /**
             * The IP address-based forwarding mode of the instance. Valid values:
             * <p>
             * 
             * *   **fnat**: Requests from IPv4 addresses are forwarded to origin servers that use IPv4 addresses and requests from IPv6 addresses are forwarded to origin servers that use IPv6 addresses.
             * *   **v6tov4**: All requests are forwarded to origin servers that use IPv4 addresses.
             */
            public Builder ipMode(String ipMode) {
                this.ipMode = ipMode;
                return this;
            }

            /**
             * The IP version of the protocol. Valid values:
             * <p>
             * 
             * *   **Ipv4**: IPv4
             * *   **Ipv6**: IPv6
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * Indicates whether the TLS 1.3 version is supported.
             */
            public Builder ssl13Enabled(Boolean ssl13Enabled) {
                this.ssl13Enabled = ssl13Enabled;
                return this;
            }

            /**
             * The status of the instance. Valid values:
             * <p>
             * 
             * *   **normal**: indicates that the instance is normal.
             * *   **expired**: indicates that the instance expired.
             * *   **defense**: indicates that traffic scrubbing is performed on the asset that is protected by the instance.
             * *   **blackhole**: indicates that blackhole filtering is triggered for the asset that is protected by the instance.
             * *   **punished**: indicates that the instance is in penalty.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The Transport Layer Security (TLS) version that is configured.
             */
            public Builder tlsVersion(String tlsVersion) {
                this.tlsVersion = tlsVersion;
                return this;
            }

            public EipInfos build() {
                return new EipInfos(this);
            } 

        } 

    }
    public static class InstanceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipInfos")
        private java.util.List < EipInfos> eipInfos;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        private InstanceDetails(Builder builder) {
            this.eipInfos = builder.eipInfos;
            this.instanceId = builder.instanceId;
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDetails create() {
            return builder().build();
        }

        /**
         * @return eipInfos
         */
        public java.util.List < EipInfos> getEipInfos() {
            return this.eipInfos;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        public static final class Builder {
            private java.util.List < EipInfos> eipInfos; 
            private String instanceId; 
            private String line; 

            /**
             * The IP address information about the Anti-DDoS Proxy instance.
             */
            public Builder eipInfos(java.util.List < EipInfos> eipInfos) {
                this.eipInfos = eipInfos;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The protection line of the instance.
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            public InstanceDetails build() {
                return new InstanceDetails(this);
            } 

        } 

    }
}
