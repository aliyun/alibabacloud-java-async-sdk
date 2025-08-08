// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ToolsetStatus} extends {@link TeaModel}
 *
 * <p>ToolsetStatus</p>
 */
public class ToolsetStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("observedGeneration")
    private Long observedGeneration;

    @com.aliyun.core.annotation.NameInMap("observedTime")
    private String observedTime;

    @com.aliyun.core.annotation.NameInMap("outputs")
    private Outputs outputs;

    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    private ToolsetStatus(Builder builder) {
        this.observedGeneration = builder.observedGeneration;
        this.observedTime = builder.observedTime;
        this.outputs = builder.outputs;
        this.phase = builder.phase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ToolsetStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return observedGeneration
     */
    public Long getObservedGeneration() {
        return this.observedGeneration;
    }

    /**
     * @return observedTime
     */
    public String getObservedTime() {
        return this.observedTime;
    }

    /**
     * @return outputs
     */
    public Outputs getOutputs() {
        return this.outputs;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    public static final class Builder {
        private Long observedGeneration; 
        private String observedTime; 
        private Outputs outputs; 
        private String phase; 

        private Builder() {
        } 

        private Builder(ToolsetStatus model) {
            this.observedGeneration = model.observedGeneration;
            this.observedTime = model.observedTime;
            this.outputs = model.outputs;
            this.phase = model.phase;
        } 

        /**
         * observedGeneration.
         */
        public Builder observedGeneration(Long observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * observedTime.
         */
        public Builder observedTime(String observedTime) {
            this.observedTime = observedTime;
            return this;
        }

        /**
         * outputs.
         */
        public Builder outputs(Outputs outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        public ToolsetStatus build() {
            return new ToolsetStatus(this);
        } 

    } 

    /**
     * 
     * {@link ToolsetStatus} extends {@link TeaModel}
     *
     * <p>ToolsetStatus</p>
     */
    public static class McpServerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("transportType")
        private String transportType;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private McpServerConfig(Builder builder) {
            this.headers = builder.headers;
            this.transportType = builder.transportType;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServerConfig create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return transportType
         */
        public String getTransportType() {
            return this.transportType;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.Map<String, String> headers; 
            private String transportType; 
            private String url; 

            private Builder() {
            } 

            private Builder(McpServerConfig model) {
                this.headers = model.headers;
                this.transportType = model.transportType;
                this.url = model.url;
            } 

            /**
             * headers.
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * transportType.
             */
            public Builder transportType(String transportType) {
                this.transportType = transportType;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public McpServerConfig build() {
                return new McpServerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ToolsetStatus} extends {@link TeaModel}
     *
     * <p>ToolsetStatus</p>
     */
    public static class Urls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("internetUrl")
        private String internetUrl;

        @com.aliyun.core.annotation.NameInMap("intranetUrl")
        private String intranetUrl;

        private Urls(Builder builder) {
            this.internetUrl = builder.internetUrl;
            this.intranetUrl = builder.intranetUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Urls create() {
            return builder().build();
        }

        /**
         * @return internetUrl
         */
        public String getInternetUrl() {
            return this.internetUrl;
        }

        /**
         * @return intranetUrl
         */
        public String getIntranetUrl() {
            return this.intranetUrl;
        }

        public static final class Builder {
            private String internetUrl; 
            private String intranetUrl; 

            private Builder() {
            } 

            private Builder(Urls model) {
                this.internetUrl = model.internetUrl;
                this.intranetUrl = model.intranetUrl;
            } 

            /**
             * internetUrl.
             */
            public Builder internetUrl(String internetUrl) {
                this.internetUrl = internetUrl;
                return this;
            }

            /**
             * intranetUrl.
             */
            public Builder intranetUrl(String intranetUrl) {
                this.intranetUrl = intranetUrl;
                return this;
            }

            public Urls build() {
                return new Urls(this);
            } 

        } 

    }
    /**
     * 
     * {@link ToolsetStatus} extends {@link TeaModel}
     *
     * <p>ToolsetStatus</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("functionArn")
        private String functionArn;

        @com.aliyun.core.annotation.NameInMap("mcpServerConfig")
        private McpServerConfig mcpServerConfig;

        @com.aliyun.core.annotation.NameInMap("openApiTools")
        private java.util.List<OpenAPIToolMeta> openApiTools;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<MCPToolMeta> tools;

        @com.aliyun.core.annotation.NameInMap("urls")
        private Urls urls;

        private Outputs(Builder builder) {
            this.functionArn = builder.functionArn;
            this.mcpServerConfig = builder.mcpServerConfig;
            this.openApiTools = builder.openApiTools;
            this.tools = builder.tools;
            this.urls = builder.urls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outputs create() {
            return builder().build();
        }

        /**
         * @return functionArn
         */
        public String getFunctionArn() {
            return this.functionArn;
        }

        /**
         * @return mcpServerConfig
         */
        public McpServerConfig getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        /**
         * @return openApiTools
         */
        public java.util.List<OpenAPIToolMeta> getOpenApiTools() {
            return this.openApiTools;
        }

        /**
         * @return tools
         */
        public java.util.List<MCPToolMeta> getTools() {
            return this.tools;
        }

        /**
         * @return urls
         */
        public Urls getUrls() {
            return this.urls;
        }

        public static final class Builder {
            private String functionArn; 
            private McpServerConfig mcpServerConfig; 
            private java.util.List<OpenAPIToolMeta> openApiTools; 
            private java.util.List<MCPToolMeta> tools; 
            private Urls urls; 

            private Builder() {
            } 

            private Builder(Outputs model) {
                this.functionArn = model.functionArn;
                this.mcpServerConfig = model.mcpServerConfig;
                this.openApiTools = model.openApiTools;
                this.tools = model.tools;
                this.urls = model.urls;
            } 

            /**
             * functionArn.
             */
            public Builder functionArn(String functionArn) {
                this.functionArn = functionArn;
                return this;
            }

            /**
             * mcpServerConfig.
             */
            public Builder mcpServerConfig(McpServerConfig mcpServerConfig) {
                this.mcpServerConfig = mcpServerConfig;
                return this;
            }

            /**
             * openApiTools.
             */
            public Builder openApiTools(java.util.List<OpenAPIToolMeta> openApiTools) {
                this.openApiTools = openApiTools;
                return this;
            }

            /**
             * tools.
             */
            public Builder tools(java.util.List<MCPToolMeta> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * urls.
             */
            public Builder urls(Urls urls) {
                this.urls = urls;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
}
