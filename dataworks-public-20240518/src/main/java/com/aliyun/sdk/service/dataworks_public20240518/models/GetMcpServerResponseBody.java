// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetMcpServerResponseBody} extends {@link TeaModel}
 *
 * <p>GetMcpServerResponseBody</p>
 */
public class GetMcpServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("McpServer")
    private McpServer mcpServer;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMcpServerResponseBody(Builder builder) {
        this.mcpServer = builder.mcpServer;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMcpServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mcpServer
     */
    public McpServer getMcpServer() {
        return this.mcpServer;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private McpServer mcpServer; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMcpServerResponseBody model) {
            this.mcpServer = model.mcpServer;
            this.requestId = model.requestId;
        } 

        /**
         * McpServer.
         */
        public Builder mcpServer(McpServer mcpServer) {
            this.mcpServer = mcpServer;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMcpServerResponseBody build() {
            return new GetMcpServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpServerResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomHeaders")
        private java.util.Map<String, ?> customHeaders;

        @com.aliyun.core.annotation.NameInMap("Transport")
        private String transport;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Config(Builder builder) {
            this.customHeaders = builder.customHeaders;
            this.transport = builder.transport;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return customHeaders
         */
        public java.util.Map<String, ?> getCustomHeaders() {
            return this.customHeaders;
        }

        /**
         * @return transport
         */
        public String getTransport() {
            return this.transport;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.Map<String, ?> customHeaders; 
            private String transport; 
            private String url; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.customHeaders = model.customHeaders;
                this.transport = model.transport;
                this.url = model.url;
            } 

            /**
             * CustomHeaders.
             */
            public Builder customHeaders(java.util.Map<String, ?> customHeaders) {
                this.customHeaders = customHeaders;
                return this;
            }

            /**
             * Transport.
             */
            public Builder transport(String transport) {
                this.transport = transport;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpServerResponseBody</p>
     */
    public static class McpServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ModifierId")
        private String modifierId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Visibility")
        private String visibility;

        private McpServer(Builder builder) {
            this.config = builder.config;
            this.creatorId = builder.creatorId;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.modifierId = builder.modifierId;
            this.name = builder.name;
            this.visibility = builder.visibility;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServer create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        public static final class Builder {
            private Config config; 
            private String creatorId; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String modifierId; 
            private String name; 
            private String visibility; 

            private Builder() {
            } 

            private Builder(McpServer model) {
                this.config = model.config;
                this.creatorId = model.creatorId;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.modifierId = model.modifierId;
                this.name = model.name;
                this.visibility = model.visibility;
            } 

            /**
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * ModifierId.
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Visibility.
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            public McpServer build() {
                return new McpServer(this);
            } 

        } 

    }
}
