// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetContainerConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetContainerConfigurationResponseBody</p>
 */
public class GetContainerConfigurationResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ContainerConfiguration")
    private ContainerConfiguration containerConfiguration;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetContainerConfigurationResponseBody(Builder builder) {
        this.code = builder.code;
        this.containerConfiguration = builder.containerConfiguration;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContainerConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return containerConfiguration
     */
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
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

    public static final class Builder {
        private Integer code; 
        private ContainerConfiguration containerConfiguration; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The Tomcat configuration.
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * The message returned for the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetContainerConfigurationResponseBody build() {
            return new GetContainerConfigurationResponseBody(this);
        } 

    } 

    public static class ContainerConfiguration extends TeaModel {
        @NameInMap("ContextPath")
        private String contextPath;

        @NameInMap("HttpPort")
        private Integer httpPort;

        @NameInMap("MaxThreads")
        private Integer maxThreads;

        @NameInMap("URIEncoding")
        private String URIEncoding;

        @NameInMap("UseBodyEncoding")
        private Boolean useBodyEncoding;

        private ContainerConfiguration(Builder builder) {
            this.contextPath = builder.contextPath;
            this.httpPort = builder.httpPort;
            this.maxThreads = builder.maxThreads;
            this.URIEncoding = builder.URIEncoding;
            this.useBodyEncoding = builder.useBodyEncoding;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerConfiguration create() {
            return builder().build();
        }

        /**
         * @return contextPath
         */
        public String getContextPath() {
            return this.contextPath;
        }

        /**
         * @return httpPort
         */
        public Integer getHttpPort() {
            return this.httpPort;
        }

        /**
         * @return maxThreads
         */
        public Integer getMaxThreads() {
            return this.maxThreads;
        }

        /**
         * @return URIEncoding
         */
        public String getURIEncoding() {
            return this.URIEncoding;
        }

        /**
         * @return useBodyEncoding
         */
        public Boolean getUseBodyEncoding() {
            return this.useBodyEncoding;
        }

        public static final class Builder {
            private String contextPath; 
            private Integer httpPort; 
            private Integer maxThreads; 
            private String URIEncoding; 
            private Boolean useBodyEncoding; 

            /**
             * The context path of the Tomcat container.
             */
            public Builder contextPath(String contextPath) {
                this.contextPath = contextPath;
                return this;
            }

            /**
             * The application port number for the Tomcat container. The value specified in the application configuration is returned.
             */
            public Builder httpPort(Integer httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * The maximum number of threads in the Tomcat container.
             * <p>
             * 
             * *   If no instance group is specified, the configuration of the application is returned.
             * *   If no application is specified, the default configuration is returned.
             */
            public Builder maxThreads(Integer maxThreads) {
                this.maxThreads = maxThreads;
                return this;
            }

            /**
             * The Uniform Resource Identifier (URI) encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8.
             * <p>
             * 
             * *   If no instance group is specified, the configuration of the application is returned.
             * *   If no application is specified, the default configuration is returned.
             */
            public Builder URIEncoding(String URIEncoding) {
                this.URIEncoding = URIEncoding;
                return this;
            }

            /**
             * Indicates whether useBodyEncodingForURI is enabled in the Tomcat container.
             * <p>
             * 
             * *   If no instance group is specified, the configuration of the application is returned.
             * *   If no application is specified, the default configuration is returned.
             */
            public Builder useBodyEncoding(Boolean useBodyEncoding) {
                this.useBodyEncoding = useBodyEncoding;
                return this;
            }

            public ContainerConfiguration build() {
                return new ContainerConfiguration(this);
            } 

        } 

    }
}
