// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateContainerConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateContainerConfigurationResponseBody</p>
 */
public class UpdateContainerConfigurationResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ContainerConfiguration")
    private ContainerConfiguration containerConfiguration;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateContainerConfigurationResponseBody(Builder builder) {
        this.code = builder.code;
        this.containerConfiguration = builder.containerConfiguration;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContainerConfigurationResponseBody create() {
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
         * The configuration of the Tomcat container.
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }

        /**
         * The additional information that is returned.
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

        public UpdateContainerConfigurationResponseBody build() {
            return new UpdateContainerConfigurationResponseBody(this);
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
             * The application port number for the Tomcat container.
             */
            public Builder httpPort(Integer httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * The maximum number of threads.
             */
            public Builder maxThreads(Integer maxThreads) {
                this.maxThreads = maxThreads;
                return this;
            }

            /**
             * The URI encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8.
             */
            public Builder URIEncoding(String URIEncoding) {
                this.URIEncoding = URIEncoding;
                return this;
            }

            /**
             * Indicates whether useBodyEncodingForURI is enabled.
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
