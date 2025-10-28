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
 * {@link UpdateContainerConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateContainerConfigurationResponseBody</p>
 */
public class UpdateContainerConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("ContainerConfiguration")
    private ContainerConfiguration containerConfiguration;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder() {
        } 

        private Builder(UpdateContainerConfigurationResponseBody model) {
            this.code = model.code;
            this.containerConfiguration = model.containerConfiguration;
            this.message = model.message;
            this.requestId = model.requestId;
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
         * <p>The configuration of the Tomcat container.</p>
         */
        public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
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
         * <p>D16979DC-4D42-***************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateContainerConfigurationResponseBody build() {
            return new UpdateContainerConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateContainerConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateContainerConfigurationResponseBody</p>
     */
    public static class ContainerConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContextPath")
        private String contextPath;

        @com.aliyun.core.annotation.NameInMap("HttpPort")
        private Integer httpPort;

        @com.aliyun.core.annotation.NameInMap("MaxThreads")
        private Integer maxThreads;

        @com.aliyun.core.annotation.NameInMap("URIEncoding")
        private String URIEncoding;

        @com.aliyun.core.annotation.NameInMap("UseBodyEncoding")
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

            private Builder() {
            } 

            private Builder(ContainerConfiguration model) {
                this.contextPath = model.contextPath;
                this.httpPort = model.httpPort;
                this.maxThreads = model.maxThreads;
                this.URIEncoding = model.URIEncoding;
                this.useBodyEncoding = model.useBodyEncoding;
            } 

            /**
             * <p>The context path of the Tomcat container.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder contextPath(String contextPath) {
                this.contextPath = contextPath;
                return this;
            }

            /**
             * <p>The application port number for the Tomcat container.</p>
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
             * <p>20</p>
             */
            public Builder maxThreads(Integer maxThreads) {
                this.maxThreads = maxThreads;
                return this;
            }

            /**
             * <p>The URI encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8.</p>
             * 
             * <strong>example:</strong>
             * <p>ISO-8859-1</p>
             */
            public Builder URIEncoding(String URIEncoding) {
                this.URIEncoding = URIEncoding;
                return this;
            }

            /**
             * <p>Indicates whether useBodyEncodingForURI is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
