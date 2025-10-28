// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetWebContainerConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetWebContainerConfigResponseBody</p>
 */
public class GetWebContainerConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebContainerConfig")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetWebContainerConfigResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.webContainerConfig = model.webContainerConfig;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4823-bhjf-23u4-eiufh</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Tomcat configurations of the application.</p>
         */
        public Builder webContainerConfig(WebContainerConfig webContainerConfig) {
            this.webContainerConfig = webContainerConfig;
            return this;
        }

        public GetWebContainerConfigResponseBody build() {
            return new GetWebContainerConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWebContainerConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetWebContainerConfigResponseBody</p>
     */
    public static class WebContainerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContextInputType")
        private String contextInputType;

        @com.aliyun.core.annotation.NameInMap("ContextPath")
        private String contextPath;

        @com.aliyun.core.annotation.NameInMap("HttpPort")
        private Integer httpPort;

        @com.aliyun.core.annotation.NameInMap("MaxThreads")
        private Integer maxThreads;

        @com.aliyun.core.annotation.NameInMap("ServerXml")
        private String serverXml;

        @com.aliyun.core.annotation.NameInMap("UriEncoding")
        private String uriEncoding;

        @com.aliyun.core.annotation.NameInMap("UseAdvancedServerXml")
        private Boolean useAdvancedServerXml;

        @com.aliyun.core.annotation.NameInMap("UseBodyEncoding")
        private Boolean useBodyEncoding;

        @com.aliyun.core.annotation.NameInMap("UseDefaultConfig")
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

            private Builder() {
            } 

            private Builder(WebContainerConfig model) {
                this.contextInputType = model.contextInputType;
                this.contextPath = model.contextPath;
                this.httpPort = model.httpPort;
                this.maxThreads = model.maxThreads;
                this.serverXml = model.serverXml;
                this.uriEncoding = model.uriEncoding;
                this.useAdvancedServerXml = model.useAdvancedServerXml;
                this.useBodyEncoding = model.useBodyEncoding;
                this.useDefaultConfig = model.useDefaultConfig;
            } 

            /**
             * <p>The type of the context path.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder contextInputType(String contextInputType) {
                this.contextInputType = contextInputType;
                return this;
            }

            /**
             * <p>The context path.</p>
             * 
             * <strong>example:</strong>
             * <p>ROOT</p>
             */
            public Builder contextPath(String contextPath) {
                this.contextPath = contextPath;
                return this;
            }

            /**
             * <p>The HTTP service port.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder httpPort(Integer httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * <p>The maximum number of threads.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder maxThreads(Integer maxThreads) {
                this.maxThreads = maxThreads;
                return this;
            }

            /**
             * <p>The content of the server.xml file customized by using advanced configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>&lt;Server port=*****</p>
             */
            public Builder serverXml(String serverXml) {
                this.serverXml = serverXml;
                return this;
            }

            /**
             * <p>The URI encoding scheme.</p>
             * 
             * <strong>example:</strong>
             * <p>ISO-8859-1</p>
             */
            public Builder uriEncoding(String uriEncoding) {
                this.uriEncoding = uriEncoding;
                return this;
            }

            /**
             * <p>Indicates whether advanced configurations are used to customize the server.xml file.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useAdvancedServerXml(Boolean useAdvancedServerXml) {
                this.useAdvancedServerXml = useAdvancedServerXml;
                return this;
            }

            /**
             * <p>Indicates whether the encoding scheme specified in the request body is used for uniform resource identifier (URI) query parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useBodyEncoding(Boolean useBodyEncoding) {
                this.useBodyEncoding = useBodyEncoding;
                return this;
            }

            /**
             * <p>Indicates whether the default configurations are used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
