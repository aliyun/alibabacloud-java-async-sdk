// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketMcpConfig} extends {@link TeaModel}
 *
 * <p>HiMarketMcpConfig</p>
 */
public class HiMarketMcpConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mcpServerConfig")
    private McpServerConfig mcpServerConfig;

    @com.aliyun.core.annotation.NameInMap("mcpServerName")
    private String mcpServerName;

    @com.aliyun.core.annotation.NameInMap("meta")
    private Meta meta;

    @com.aliyun.core.annotation.NameInMap("tools")
    private String tools;

    private HiMarketMcpConfig(Builder builder) {
        this.mcpServerConfig = builder.mcpServerConfig;
        this.mcpServerName = builder.mcpServerName;
        this.meta = builder.meta;
        this.tools = builder.tools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketMcpConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mcpServerConfig
     */
    public McpServerConfig getMcpServerConfig() {
        return this.mcpServerConfig;
    }

    /**
     * @return mcpServerName
     */
    public String getMcpServerName() {
        return this.mcpServerName;
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @return tools
     */
    public String getTools() {
        return this.tools;
    }

    public static final class Builder {
        private McpServerConfig mcpServerConfig; 
        private String mcpServerName; 
        private Meta meta; 
        private String tools; 

        private Builder() {
        } 

        private Builder(HiMarketMcpConfig model) {
            this.mcpServerConfig = model.mcpServerConfig;
            this.mcpServerName = model.mcpServerName;
            this.meta = model.meta;
            this.tools = model.tools;
        } 

        /**
         * <p>The MCP Server configuration.</p>
         */
        public Builder mcpServerConfig(McpServerConfig mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }

        /**
         * <p>The MCP Server name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-server</p>
         */
        public Builder mcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }

        /**
         * <p>The metadata.</p>
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * <p>The MCP tool definitions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;search\&quot;,\&quot;description\&quot;:\&quot;搜索工具\&quot;}]</p>
         */
        public Builder tools(String tools) {
            this.tools = tools;
            return this;
        }

        public HiMarketMcpConfig build() {
            return new HiMarketMcpConfig(this);
        } 

    } 

    /**
     * 
     * {@link HiMarketMcpConfig} extends {@link TeaModel}
     *
     * <p>HiMarketMcpConfig</p>
     */
    public static class McpServerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domains")
        private java.util.List<HiMarketDomain> domains;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private McpServerConfig(Builder builder) {
            this.domains = builder.domains;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServerConfig create() {
            return builder().build();
        }

        /**
         * @return domains
         */
        public java.util.List<HiMarketDomain> getDomains() {
            return this.domains;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.List<HiMarketDomain> domains; 
            private String path; 

            private Builder() {
            } 

            private Builder(McpServerConfig model) {
                this.domains = model.domains;
                this.path = model.path;
            } 

            /**
             * <p>The list of associated domain names.</p>
             */
            public Builder domains(java.util.List<HiMarketDomain> domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>The path exposed by the MCP server.</p>
             * 
             * <strong>example:</strong>
             * <p>/mcp</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public McpServerConfig build() {
                return new McpServerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link HiMarketMcpConfig} extends {@link TeaModel}
     *
     * <p>HiMarketMcpConfig</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private Meta(Builder builder) {
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String protocol; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.protocol = model.protocol;
            } 

            /**
             * <p>The MCP protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>StreamableHTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
