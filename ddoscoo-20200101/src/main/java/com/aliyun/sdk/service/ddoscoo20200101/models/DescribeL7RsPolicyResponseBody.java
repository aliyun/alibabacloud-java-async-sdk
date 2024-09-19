// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeL7RsPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeL7RsPolicyResponseBody</p>
 */
public class DescribeL7RsPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.List < Attributes> attributes;

    @com.aliyun.core.annotation.NameInMap("ProxyMode")
    private String proxyMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RsAttrRwTimeoutMax")
    private Long rsAttrRwTimeoutMax;

    @com.aliyun.core.annotation.NameInMap("UpstreamRetry")
    private Integer upstreamRetry;

    private DescribeL7RsPolicyResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.proxyMode = builder.proxyMode;
        this.requestId = builder.requestId;
        this.rsAttrRwTimeoutMax = builder.rsAttrRwTimeoutMax;
        this.upstreamRetry = builder.upstreamRetry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeL7RsPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.List < Attributes> getAttributes() {
        return this.attributes;
    }

    /**
     * @return proxyMode
     */
    public String getProxyMode() {
        return this.proxyMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rsAttrRwTimeoutMax
     */
    public Long getRsAttrRwTimeoutMax() {
        return this.rsAttrRwTimeoutMax;
    }

    /**
     * @return upstreamRetry
     */
    public Integer getUpstreamRetry() {
        return this.upstreamRetry;
    }

    public static final class Builder {
        private java.util.List < Attributes> attributes; 
        private String proxyMode; 
        private String requestId; 
        private Long rsAttrRwTimeoutMax; 
        private Integer upstreamRetry; 

        /**
         * The details about the parameters for back-to-origin processing.
         */
        public Builder attributes(java.util.List < Attributes> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * The scheduling algorithm for back-to-origin traffic. Valid values:
         * <p>
         * 
         * *   **ip_hash**: the IP hash algorithm. This algorithm is used to redirect the requests from the same IP address to the same origin server.
         * *   **rr**: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn.
         * *   **least_time**: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from Anti-DDoS Pro or Anti-DDoS Premium instances to origin servers based on the intelligent DNS resolution feature.
         */
        public Builder proxyMode(String proxyMode) {
            this.proxyMode = proxyMode;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RsAttrRwTimeoutMax.
         */
        public Builder rsAttrRwTimeoutMax(Long rsAttrRwTimeoutMax) {
            this.rsAttrRwTimeoutMax = rsAttrRwTimeoutMax;
            return this;
        }

        /**
         * The back-to-origin retry switch. Valid values:
         * <p>
         * 
         * *   **1**: on
         * *   **0**: off
         */
        public Builder upstreamRetry(Integer upstreamRetry) {
            this.upstreamRetry = upstreamRetry;
            return this;
        }

        public DescribeL7RsPolicyResponseBody build() {
            return new DescribeL7RsPolicyResponseBody(this);
        } 

    } 

    public static class Attribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectTimeout")
        private Integer connectTimeout;

        @com.aliyun.core.annotation.NameInMap("FailTimeout")
        private Integer failTimeout;

        @com.aliyun.core.annotation.NameInMap("MaxFails")
        private Integer maxFails;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("ReadTimeout")
        private Integer readTimeout;

        @com.aliyun.core.annotation.NameInMap("SendTimeout")
        private Integer sendTimeout;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Attribute(Builder builder) {
            this.connectTimeout = builder.connectTimeout;
            this.failTimeout = builder.failTimeout;
            this.maxFails = builder.maxFails;
            this.mode = builder.mode;
            this.readTimeout = builder.readTimeout;
            this.sendTimeout = builder.sendTimeout;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attribute create() {
            return builder().build();
        }

        /**
         * @return connectTimeout
         */
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        /**
         * @return failTimeout
         */
        public Integer getFailTimeout() {
            return this.failTimeout;
        }

        /**
         * @return maxFails
         */
        public Integer getMaxFails() {
            return this.maxFails;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return readTimeout
         */
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        /**
         * @return sendTimeout
         */
        public Integer getSendTimeout() {
            return this.sendTimeout;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer connectTimeout; 
            private Integer failTimeout; 
            private Integer maxFails; 
            private String mode; 
            private Integer readTimeout; 
            private Integer sendTimeout; 
            private Integer weight; 

            /**
             * The timeout period for a new connection. Valid values: **1** to **10**. Unit: seconds. Default value: **5**.
             */
            public Builder connectTimeout(Integer connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * The expiration time of a connection, in seconds. If the number of failures at the origin server exceeds the **MaxFails** value, the address of the origin server is set to down and the expiration time is **FailTimeout**. The final value is the maximum value of **ConnectTimeout** and **FailTimeout**. Valid values: **1** to **3600**. Unit: seconds. Default value: **10**.
             */
            public Builder failTimeout(Integer failTimeout) {
                this.failTimeout = failTimeout;
                return this;
            }

            /**
             * The maximum number of failures. This parameter is related to health check. Valid values: **1** to **10**. Unit: seconds. Default value: **3**.
             */
            public Builder maxFails(Integer maxFails) {
                this.maxFails = maxFails;
                return this;
            }

            /**
             * The primary/secondary flag. Valid values:
             * <p>
             * 
             * *   **active**: primary
             * *   **backup**: secondary
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The timeout period for a read connection. Valid values: **10** to **300**. Unit: seconds. Default value: **120**.
             */
            public Builder readTimeout(Integer readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * The timeout period for a write connection. Valid values: **10** to **300**. Unit: seconds. Default value: **120**.
             */
            public Builder sendTimeout(Integer sendTimeout) {
                this.sendTimeout = sendTimeout;
                return this;
            }

            /**
             * The weight of the origin server. This parameter takes effect only when **ProxyMode** is set to **rr**.
             * <p>
             * 
             * Valid values: **1** to **100**. Default value: **100**. A server with a higher weight receives more requests.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Attribute build() {
                return new Attribute(this);
            } 

        } 

    }
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private Attribute attribute;

        @com.aliyun.core.annotation.NameInMap("RealServer")
        private String realServer;

        @com.aliyun.core.annotation.NameInMap("RsType")
        private Integer rsType;

        private Attributes(Builder builder) {
            this.attribute = builder.attribute;
            this.realServer = builder.realServer;
            this.rsType = builder.rsType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public Attribute getAttribute() {
            return this.attribute;
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
            private Attribute attribute; 
            private String realServer; 
            private Integer rsType; 

            /**
             * The parameter for back-to-origin processing.
             */
            public Builder attribute(Attribute attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * The address of the origin server.
             */
            public Builder realServer(String realServer) {
                this.realServer = realServer;
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

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
}
