// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebContainerConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetWebContainerConfigResponseBody</p>
 */
public class GetWebContainerConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WebContainerConfig")
    private WebContainerConfig webContainerConfig;

    private GetWebContainerConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.webContainerConfig = builder.webContainerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebContainerConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return webContainerConfig
     */
    public WebContainerConfig getWebContainerConfig() {
        return this.webContainerConfig;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private WebContainerConfig webContainerConfig; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
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

        /**
         * The Tomcat configurations of the application.
         */
        public Builder webContainerConfig(WebContainerConfig webContainerConfig) {
            this.webContainerConfig = webContainerConfig;
            return this;
        }

        public GetWebContainerConfigResponseBody build() {
            return new GetWebContainerConfigResponseBody(this);
        } 

    } 

    public static class WebContainerConfig extends TeaModel {
        @NameInMap("ContextInputType")
        private String contextInputType;

        @NameInMap("ContextPath")
        private String contextPath;

        @NameInMap("HttpPort")
        private Integer httpPort;

        @NameInMap("MaxThreads")
        private Integer maxThreads;

        @NameInMap("ServerXml")
        private String serverXml;

        @NameInMap("UriEncoding")
        private String uriEncoding;

        @NameInMap("UseAdvancedServerXml")
        private Boolean useAdvancedServerXml;

        @NameInMap("UseBodyEncoding")
        private Boolean useBodyEncoding;

        @NameInMap("UseDefaultConfig")
        private Boolean useDefaultConfig;

        private WebContainerConfig(Builder builder) {
            this.contextInputType = builder.contextInputType;
            this.contextPath = builder.contextPath;
            this.httpPort = builder.httpPort;
            this.maxThreads = builder.maxThreads;
            this.serverXml = builder.serverXml;
            this.uriEncoding = builder.uriEncoding;
            this.useAdvancedServerXml = builder.useAdvancedServerXml;
            this.useBodyEncoding = builder.useBodyEncoding;
            this.useDefaultConfig = builder.useDefaultConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebContainerConfig create() {
            return builder().build();
        }

        /**
         * @return contextInputType
         */
        public String getContextInputType() {
            return this.contextInputType;
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
         * @return serverXml
         */
        public String getServerXml() {
            return this.serverXml;
        }

        /**
         * @return uriEncoding
         */
        public String getUriEncoding() {
            return this.uriEncoding;
        }

        /**
         * @return useAdvancedServerXml
         */
        public Boolean getUseAdvancedServerXml() {
            return this.useAdvancedServerXml;
        }

        /**
         * @return useBodyEncoding
         */
        public Boolean getUseBodyEncoding() {
            return this.useBodyEncoding;
        }

        /**
         * @return useDefaultConfig
         */
        public Boolean getUseDefaultConfig() {
            return this.useDefaultConfig;
        }

        public static final class Builder {
            private String contextInputType; 
            private String contextPath; 
            private Integer httpPort; 
            private Integer maxThreads; 
            private String serverXml; 
            private String uriEncoding; 
            private Boolean useAdvancedServerXml; 
            private Boolean useBodyEncoding; 
            private Boolean useDefaultConfig; 

            /**
             * The type of the context path.
             */
            public Builder contextInputType(String contextInputType) {
                this.contextInputType = contextInputType;
                return this;
            }

            /**
             * The context path.
             */
            public Builder contextPath(String contextPath) {
                this.contextPath = contextPath;
                return this;
            }

            /**
             * The HTTP service port.
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
             * The content of the server.xml file customized by using advanced configurations.
             */
            public Builder serverXml(String serverXml) {
                this.serverXml = serverXml;
                return this;
            }

            /**
             * The URI encoding scheme.
             */
            public Builder uriEncoding(String uriEncoding) {
                this.uriEncoding = uriEncoding;
                return this;
            }

            /**
             * Indicates whether advanced configurations are used to customize the server.xml file.
             */
            public Builder useAdvancedServerXml(Boolean useAdvancedServerXml) {
                this.useAdvancedServerXml = useAdvancedServerXml;
                return this;
            }

            /**
             * Indicates whether the encoding scheme specified in the request body is used for uniform resource identifier (URI) query parameters.
             */
            public Builder useBodyEncoding(Boolean useBodyEncoding) {
                this.useBodyEncoding = useBodyEncoding;
                return this;
            }

            /**
             * Indicates whether the default configurations are used.
             */
            public Builder useDefaultConfig(Boolean useDefaultConfig) {
                this.useDefaultConfig = useDefaultConfig;
                return this;
            }

            public WebContainerConfig build() {
                return new WebContainerConfig(this);
            } 

        } 

    }
}
