// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link GetMcpServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetMcpServiceResponseBody</p>
 */
public class GetMcpServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mcpService")
    private McpService mcpService;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMcpServiceResponseBody(Builder builder) {
        this.mcpService = builder.mcpService;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMcpServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mcpService
     */
    public McpService getMcpService() {
        return this.mcpService;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private McpService mcpService; 
        private String regionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMcpServiceResponseBody model) {
            this.mcpService = model.mcpService;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The MCP service details.</p>
         */
        public Builder mcpService(McpService mcpService) {
            this.mcpService = mcpService;
            return this;
        }

        /**
         * <p>The region of the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMcpServiceResponseBody build() {
            return new GetMcpServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMcpServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpServiceResponseBody</p>
     */
    public static class Auth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keyInfo")
        private java.util.Map<String, String> keyInfo;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Auth(Builder builder) {
            this.keyInfo = builder.keyInfo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Auth create() {
            return builder().build();
        }

        /**
         * @return keyInfo
         */
        public java.util.Map<String, String> getKeyInfo() {
            return this.keyInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.Map<String, String> keyInfo; 
            private String type; 

            private Builder() {
            } 

            private Builder(Auth model) {
                this.keyInfo = model.keyInfo;
                this.type = model.type;
            } 

            /**
             * <p>The key-value information required for authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;token&quot;:&quot;example-token&quot;}</p>
             */
            public Builder keyInfo(java.util.Map<String, String> keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            /**
             * <p>The authentication type. Currently, bearer is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>bearer</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Auth build() {
                return new Auth(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMcpServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpServiceResponseBody</p>
     */
    public static class Connection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auth")
        private Auth auth;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("transport")
        private String transport;

        private Connection(Builder builder) {
            this.auth = builder.auth;
            this.endpoint = builder.endpoint;
            this.headers = builder.headers;
            this.platform = builder.platform;
            this.timeout = builder.timeout;
            this.transport = builder.transport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connection create() {
            return builder().build();
        }

        /**
         * @return auth
         */
        public Auth getAuth() {
            return this.auth;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        /**
         * @return transport
         */
        public String getTransport() {
            return this.transport;
        }

        public static final class Builder {
            private Auth auth; 
            private String endpoint; 
            private java.util.Map<String, String> headers; 
            private String platform; 
            private Long timeout; 
            private String transport; 

            private Builder() {
            } 

            private Builder(Connection model) {
                this.auth = model.auth;
                this.endpoint = model.endpoint;
                this.headers = model.headers;
                this.platform = model.platform;
                this.timeout = model.timeout;
                this.transport = model.transport;
            } 

            /**
             * <p>The authentication configuration of the MCP service.</p>
             */
            public Builder auth(Auth auth) {
                this.auth = auth;
                return this;
            }

            /**
             * <p>The access endpoint of the MCP service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/mcp">https://example.com/mcp</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * headers.
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The MCP service platform type. Valid values: AIGateway and Custom.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The timeout period for requests to the MCP service. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The MCP service transport protocol. Valid values: http and sse.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder transport(String transport) {
                this.transport = transport;
                return this;
            }

            public Connection build() {
                return new Connection(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMcpServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpServiceResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessIp")
        private String accessIp;

        @com.aliyun.core.annotation.NameInMap("accessPort")
        private Long accessPort;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vswId")
        private String vswId;

        private Network(Builder builder) {
            this.accessIp = builder.accessIp;
            this.accessPort = builder.accessPort;
            this.gatewayId = builder.gatewayId;
            this.mcpServerId = builder.mcpServerId;
            this.mode = builder.mode;
            this.region = builder.region;
            this.securityGroupId = builder.securityGroupId;
            this.vpcId = builder.vpcId;
            this.vswId = builder.vswId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return accessIp
         */
        public String getAccessIp() {
            return this.accessIp;
        }

        /**
         * @return accessPort
         */
        public Long getAccessPort() {
            return this.accessPort;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        public static final class Builder {
            private String accessIp; 
            private Long accessPort; 
            private String gatewayId; 
            private String mcpServerId; 
            private String mode; 
            private String region; 
            private String securityGroupId; 
            private String vpcId; 
            private String vswId; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.accessIp = model.accessIp;
                this.accessPort = model.accessPort;
                this.gatewayId = model.gatewayId;
                this.mcpServerId = model.mcpServerId;
                this.mode = model.mode;
                this.region = model.region;
                this.securityGroupId = model.securityGroupId;
                this.vpcId = model.vpcId;
                this.vswId = model.vswId;
            } 

            /**
             * <p>The IP address used to access the MCP service over the VPC network.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.12</p>
             */
            public Builder accessIp(String accessIp) {
                this.accessIp = accessIp;
                return this;
            }

            /**
             * <p>The port used to access the MCP service over the VPC network. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder accessPort(Long accessPort) {
                this.accessPort = accessPort;
                return this;
            }

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-xxx</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The MCP Server instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-xxx</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * <p>The network access mode of the MCP service. Valid values: public and vpc.</p>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The region where the VPC network resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxx</p>
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMcpServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpServiceResponseBody</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("annotations")
        private java.util.Map<String, ?> annotations;

        @com.aliyun.core.annotation.NameInMap("confirm")
        private Boolean confirm;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("execution")
        private java.util.Map<String, ?> execution;

        @com.aliyun.core.annotation.NameInMap("icons")
        private java.util.List<java.util.Map<String, ?>> icons;

        @com.aliyun.core.annotation.NameInMap("inputSchema")
        private java.util.Map<String, ?> inputSchema;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outputSchema")
        private java.util.Map<String, ?> outputSchema;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Tools(Builder builder) {
            this.annotations = builder.annotations;
            this.confirm = builder.confirm;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.enable = builder.enable;
            this.execution = builder.execution;
            this.icons = builder.icons;
            this.inputSchema = builder.inputSchema;
            this.name = builder.name;
            this.outputSchema = builder.outputSchema;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public java.util.Map<String, ?> getAnnotations() {
            return this.annotations;
        }

        /**
         * @return confirm
         */
        public Boolean getConfirm() {
            return this.confirm;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return execution
         */
        public java.util.Map<String, ?> getExecution() {
            return this.execution;
        }

        /**
         * @return icons
         */
        public java.util.List<java.util.Map<String, ?>> getIcons() {
            return this.icons;
        }

        /**
         * @return inputSchema
         */
        public java.util.Map<String, ?> getInputSchema() {
            return this.inputSchema;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputSchema
         */
        public java.util.Map<String, ?> getOutputSchema() {
            return this.outputSchema;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.Map<String, ?> annotations; 
            private Boolean confirm; 
            private String description; 
            private String displayName; 
            private Boolean enable; 
            private java.util.Map<String, ?> execution; 
            private java.util.List<java.util.Map<String, ?>> icons; 
            private java.util.Map<String, ?> inputSchema; 
            private String name; 
            private java.util.Map<String, ?> outputSchema; 
            private String title; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.annotations = model.annotations;
                this.confirm = model.confirm;
                this.description = model.description;
                this.displayName = model.displayName;
                this.enable = model.enable;
                this.execution = model.execution;
                this.icons = model.icons;
                this.inputSchema = model.inputSchema;
                this.name = model.name;
                this.outputSchema = model.outputSchema;
                this.title = model.title;
            } 

            /**
             * <p>The annotation information of the MCP tool.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder annotations(java.util.Map<String, ?> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>Indicates whether user confirmation is required before the MCP tool is called.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder confirm(Boolean confirm) {
                this.confirm = confirm;
                return this;
            }

            /**
             * <p>The description of the MCP tool.</p>
             * 
             * <strong>example:</strong>
             * <p>查询指定日志库中的日志。</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the MCP tool.</p>
             * 
             * <strong>example:</strong>
             * <p>日志查询工具</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Indicates whether the MCP tool is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The execution configuration of the MCP tool.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder execution(java.util.Map<String, ?> execution) {
                this.execution = execution;
                return this;
            }

            /**
             * <p>The list of MCP tool icons.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder icons(java.util.List<java.util.Map<String, ?>> icons) {
                this.icons = icons;
                return this;
            }

            /**
             * <p>The JSON Schema of the MCP tool input parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;query&quot;:{&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;query&quot;]}</p>
             */
            public Builder inputSchema(java.util.Map<String, ?> inputSchema) {
                this.inputSchema = inputSchema;
                return this;
            }

            /**
             * <p>The name of the MCP tool.</p>
             * 
             * <strong>example:</strong>
             * <p>query_logs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The JSON Schema of the MCP tool output.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;}</p>
             */
            public Builder outputSchema(java.util.Map<String, ?> outputSchema) {
                this.outputSchema = outputSchema;
                return this;
            }

            /**
             * <p>The title of the MCP tool.</p>
             * 
             * <strong>example:</strong>
             * <p>查询日志</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMcpServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpServiceResponseBody</p>
     */
    public static class McpService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("connection")
        private Connection connection;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("mcpServiceName")
        private String mcpServiceName;

        @com.aliyun.core.annotation.NameInMap("network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        private McpService(Builder builder) {
            this.connection = builder.connection;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.enable = builder.enable;
            this.mcpServiceName = builder.mcpServiceName;
            this.network = builder.network;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpService create() {
            return builder().build();
        }

        /**
         * @return connection
         */
        public Connection getConnection() {
            return this.connection;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return mcpServiceName
         */
        public String getMcpServiceName() {
            return this.mcpServiceName;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private Connection connection; 
            private String description; 
            private String displayName; 
            private Boolean enable; 
            private String mcpServiceName; 
            private Network network; 
            private java.util.List<Tools> tools; 

            private Builder() {
            } 

            private Builder(McpService model) {
                this.connection = model.connection;
                this.description = model.description;
                this.displayName = model.displayName;
                this.enable = model.enable;
                this.mcpServiceName = model.mcpServiceName;
                this.network = model.network;
                this.tools = model.tools;
            } 

            /**
             * <p>The MCP service connection configuration.</p>
             */
            public Builder connection(Connection connection) {
                this.connection = connection;
                return this;
            }

            /**
             * <p>The description of the MCP service.</p>
             * 
             * <strong>example:</strong>
             * <p>通过 MCP 调用日志查询工具。</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the MCP service.</p>
             * 
             * <strong>example:</strong>
             * <p>日志查询</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Indicates whether the MCP service is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The service name of the MCP service.</p>
             * 
             * <strong>example:</strong>
             * <p>log-query</p>
             */
            public Builder mcpServiceName(String mcpServiceName) {
                this.mcpServiceName = mcpServiceName;
                return this;
            }

            /**
             * <p>The network connectivity information.</p>
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The list of MCP tools.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;query_logs&quot;}]</p>
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            public McpService build() {
                return new McpService(this);
            } 

        } 

    }
}
