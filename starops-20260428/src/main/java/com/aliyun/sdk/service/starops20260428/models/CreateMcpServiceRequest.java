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
 * {@link CreateMcpServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateMcpServiceRequest</p>
 */
public class CreateMcpServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("connection")
    @com.aliyun.core.annotation.Validation(required = true)
    private Connection connection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mcpServiceName")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String mcpServiceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("network")
    @com.aliyun.core.annotation.Validation(required = true)
    private Network network;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tools")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Tools> tools;

    private CreateMcpServiceRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.regionId = builder.regionId;
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

    public static CreateMcpServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateMcpServiceRequest, Builder> {
        private String name; 
        private String regionId; 
        private Connection connection; 
        private String description; 
        private String displayName; 
        private Boolean enable; 
        private String mcpServiceName; 
        private Network network; 
        private java.util.List<Tools> tools; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcpServiceRequest request) {
            super(request);
            this.name = request.name;
            this.regionId = request.regionId;
            this.connection = request.connection;
            this.description = request.description;
            this.displayName = request.displayName;
            this.enable = request.enable;
            this.mcpServiceName = request.mcpServiceName;
            this.network = request.network;
            this.tools = request.tools;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder connection(Connection connection) {
            this.putBodyParameter("connection", connection);
            this.connection = connection;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder mcpServiceName(String mcpServiceName) {
            this.putBodyParameter("mcpServiceName", mcpServiceName);
            this.mcpServiceName = mcpServiceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder network(Network network) {
            this.putBodyParameter("network", network);
            this.network = network;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tools(java.util.List<Tools> tools) {
            this.putBodyParameter("tools", tools);
            this.tools = tools;
            return this;
        }

        @Override
        public CreateMcpServiceRequest build() {
            return new CreateMcpServiceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMcpServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpServiceRequest</p>
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
             * <p>key</p>
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
     * {@link CreateMcpServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpServiceRequest</p>
     */
    public static class Connection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auth")
        private Auth auth;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("platform")
        @com.aliyun.core.annotation.Validation(required = true)
        private String platform;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("transport")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://10.0.1.23:8080/mcp">http://10.0.1.23:8080/mcp</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
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
             * <p>This parameter is required.</p>
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
     * {@link CreateMcpServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpServiceRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>public</p>
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
     * {@link CreateMcpServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpServiceRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.Map<String, ?> inputSchema;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>This parameter is required.</p>
             */
            public Builder inputSchema(java.util.Map<String, ?> inputSchema) {
                this.inputSchema = inputSchema;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>agentloop-1654218979e79fb55dbddac2</p>
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
}
