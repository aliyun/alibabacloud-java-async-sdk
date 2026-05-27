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
 * {@link ListMcpServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcpServicesResponseBody</p>
 */
public class ListMcpServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("mcpServices")
    private McpServices mcpServices;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListMcpServicesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.mcpServices = builder.mcpServices;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcpServicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return mcpServices
     */
    public McpServices getMcpServices() {
        return this.mcpServices;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer maxResults; 
        private McpServices mcpServices; 
        private String nextToken; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListMcpServicesResponseBody model) {
            this.maxResults = model.maxResults;
            this.mcpServices = model.mcpServices;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * mcpServices.
         */
        public Builder mcpServices(McpServices mcpServices) {
            this.mcpServices = mcpServices;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListMcpServicesResponseBody build() {
            return new ListMcpServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMcpServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServicesResponseBody</p>
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
             * keyInfo.
             */
            public Builder keyInfo(java.util.Map<String, String> keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            /**
             * type.
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
     * {@link ListMcpServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServicesResponseBody</p>
     */
    public static class Connection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auth")
        private Auth auth;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("transport")
        private String transport;

        private Connection(Builder builder) {
            this.auth = builder.auth;
            this.endpoint = builder.endpoint;
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
            private String platform; 
            private Long timeout; 
            private String transport; 

            private Builder() {
            } 

            private Builder(Connection model) {
                this.auth = model.auth;
                this.endpoint = model.endpoint;
                this.platform = model.platform;
                this.timeout = model.timeout;
                this.transport = model.transport;
            } 

            /**
             * auth.
             */
            public Builder auth(Auth auth) {
                this.auth = auth;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * timeout.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * transport.
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
     * {@link ListMcpServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServicesResponseBody</p>
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
             * accessIp.
             */
            public Builder accessIp(String accessIp) {
                this.accessIp = accessIp;
                return this;
            }

            /**
             * accessPort.
             */
            public Builder accessPort(Long accessPort) {
                this.accessPort = accessPort;
                return this;
            }

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * mcpServerId.
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * securityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * vswId.
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
     * {@link ListMcpServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServicesResponseBody</p>
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
             * annotations.
             */
            public Builder annotations(java.util.Map<String, ?> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * confirm.
             */
            public Builder confirm(Boolean confirm) {
                this.confirm = confirm;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * execution.
             */
            public Builder execution(java.util.Map<String, ?> execution) {
                this.execution = execution;
                return this;
            }

            /**
             * icons.
             */
            public Builder icons(java.util.List<java.util.Map<String, ?>> icons) {
                this.icons = icons;
                return this;
            }

            /**
             * inputSchema.
             */
            public Builder inputSchema(java.util.Map<String, ?> inputSchema) {
                this.inputSchema = inputSchema;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * outputSchema.
             */
            public Builder outputSchema(java.util.Map<String, ?> outputSchema) {
                this.outputSchema = outputSchema;
                return this;
            }

            /**
             * title.
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
     * {@link ListMcpServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServicesResponseBody</p>
     */
    public static class McpServiceList extends TeaModel {
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

        private McpServiceList(Builder builder) {
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

        public static McpServiceList create() {
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

            private Builder(McpServiceList model) {
                this.connection = model.connection;
                this.description = model.description;
                this.displayName = model.displayName;
                this.enable = model.enable;
                this.mcpServiceName = model.mcpServiceName;
                this.network = model.network;
                this.tools = model.tools;
            } 

            /**
             * connection.
             */
            public Builder connection(Connection connection) {
                this.connection = connection;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * mcpServiceName.
             */
            public Builder mcpServiceName(String mcpServiceName) {
                this.mcpServiceName = mcpServiceName;
                return this;
            }

            /**
             * network.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * tools.
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            public McpServiceList build() {
                return new McpServiceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMcpServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcpServicesResponseBody</p>
     */
    public static class McpServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mcpServiceList")
        private java.util.List<McpServiceList> mcpServiceList;

        private McpServices(Builder builder) {
            this.mcpServiceList = builder.mcpServiceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServices create() {
            return builder().build();
        }

        /**
         * @return mcpServiceList
         */
        public java.util.List<McpServiceList> getMcpServiceList() {
            return this.mcpServiceList;
        }

        public static final class Builder {
            private java.util.List<McpServiceList> mcpServiceList; 

            private Builder() {
            } 

            private Builder(McpServices model) {
                this.mcpServiceList = model.mcpServiceList;
            } 

            /**
             * mcpServiceList.
             */
            public Builder mcpServiceList(java.util.List<McpServiceList> mcpServiceList) {
                this.mcpServiceList = mcpServiceList;
                return this;
            }

            public McpServices build() {
                return new McpServices(this);
            } 

        } 

    }
}
