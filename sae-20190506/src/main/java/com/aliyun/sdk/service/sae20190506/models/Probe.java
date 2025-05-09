// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link Probe} extends {@link TeaModel}
 *
 * <p>Probe</p>
 */
public class Probe extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("failureThreshold")
    private Integer failureThreshold;

    @com.aliyun.core.annotation.NameInMap("initialDelaySeconds")
    private Integer initialDelaySeconds;

    @com.aliyun.core.annotation.NameInMap("periodSeconds")
    private Integer periodSeconds;

    @com.aliyun.core.annotation.NameInMap("probeHandler")
    private ProbeHandler probeHandler;

    @com.aliyun.core.annotation.NameInMap("timeoutSeconds")
    private Integer timeoutSeconds;

    private Probe(Builder builder) {
        this.failureThreshold = builder.failureThreshold;
        this.initialDelaySeconds = builder.initialDelaySeconds;
        this.periodSeconds = builder.periodSeconds;
        this.probeHandler = builder.probeHandler;
        this.timeoutSeconds = builder.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Probe create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failureThreshold
     */
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * @return initialDelaySeconds
     */
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    /**
     * @return periodSeconds
     */
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    /**
     * @return probeHandler
     */
    public ProbeHandler getProbeHandler() {
        return this.probeHandler;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static final class Builder {
        private Integer failureThreshold; 
        private Integer initialDelaySeconds; 
        private Integer periodSeconds; 
        private ProbeHandler probeHandler; 
        private Integer timeoutSeconds; 

        private Builder() {
        } 

        private Builder(Probe model) {
            this.failureThreshold = model.failureThreshold;
            this.initialDelaySeconds = model.initialDelaySeconds;
            this.periodSeconds = model.periodSeconds;
            this.probeHandler = model.probeHandler;
            this.timeoutSeconds = model.timeoutSeconds;
        } 

        /**
         * failureThreshold.
         */
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * initialDelaySeconds.
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * periodSeconds.
         */
        public Builder periodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * probeHandler.
         */
        public Builder probeHandler(ProbeHandler probeHandler) {
            this.probeHandler = probeHandler;
            return this;
        }

        /**
         * timeoutSeconds.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Probe build() {
            return new Probe(this);
        } 

    } 

    /**
     * 
     * {@link Probe} extends {@link TeaModel}
     *
     * <p>Probe</p>
     */
    public static class HttpHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private HttpHeaders(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpHeaders create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(HttpHeaders model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HttpHeaders build() {
                return new HttpHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link Probe} extends {@link TeaModel}
     *
     * <p>Probe</p>
     */
    public static class HttpGet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("httpHeaders")
        private java.util.List<HttpHeaders> httpHeaders;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        private HttpGet(Builder builder) {
            this.httpHeaders = builder.httpHeaders;
            this.path = builder.path;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpGet create() {
            return builder().build();
        }

        /**
         * @return httpHeaders
         */
        public java.util.List<HttpHeaders> getHttpHeaders() {
            return this.httpHeaders;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private java.util.List<HttpHeaders> httpHeaders; 
            private String path; 
            private Integer port; 

            private Builder() {
            } 

            private Builder(HttpGet model) {
                this.httpHeaders = model.httpHeaders;
                this.path = model.path;
                this.port = model.port;
            } 

            /**
             * httpHeaders.
             */
            public Builder httpHeaders(java.util.List<HttpHeaders> httpHeaders) {
                this.httpHeaders = httpHeaders;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public HttpGet build() {
                return new HttpGet(this);
            } 

        } 

    }
    /**
     * 
     * {@link Probe} extends {@link TeaModel}
     *
     * <p>Probe</p>
     */
    public static class TcpSocket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        private TcpSocket(Builder builder) {
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TcpSocket create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private Integer port; 

            private Builder() {
            } 

            private Builder(TcpSocket model) {
                this.port = model.port;
            } 

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public TcpSocket build() {
                return new TcpSocket(this);
            } 

        } 

    }
    /**
     * 
     * {@link Probe} extends {@link TeaModel}
     *
     * <p>Probe</p>
     */
    public static class ProbeHandler extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("httpGet")
        private HttpGet httpGet;

        @com.aliyun.core.annotation.NameInMap("tcpSocket")
        private TcpSocket tcpSocket;

        private ProbeHandler(Builder builder) {
            this.httpGet = builder.httpGet;
            this.tcpSocket = builder.tcpSocket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProbeHandler create() {
            return builder().build();
        }

        /**
         * @return httpGet
         */
        public HttpGet getHttpGet() {
            return this.httpGet;
        }

        /**
         * @return tcpSocket
         */
        public TcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public static final class Builder {
            private HttpGet httpGet; 
            private TcpSocket tcpSocket; 

            private Builder() {
            } 

            private Builder(ProbeHandler model) {
                this.httpGet = model.httpGet;
                this.tcpSocket = model.tcpSocket;
            } 

            /**
             * httpGet.
             */
            public Builder httpGet(HttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * tcpSocket.
             */
            public Builder tcpSocket(TcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            public ProbeHandler build() {
                return new ProbeHandler(this);
            } 

        } 

    }
}
