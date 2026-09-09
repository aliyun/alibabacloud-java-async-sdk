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
 * {@link FetchRemoteMcpToolsRequest} extends {@link RequestModel}
 *
 * <p>FetchRemoteMcpToolsRequest</p>
 */
public class FetchRemoteMcpToolsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("connection")
    @com.aliyun.core.annotation.Validation(required = true)
    private Connection connection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("network")
    private Network network;

    private FetchRemoteMcpToolsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.connection = builder.connection;
        this.network = builder.network;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchRemoteMcpToolsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return network
     */
    public Network getNetwork() {
        return this.network;
    }

    public static final class Builder extends Request.Builder<FetchRemoteMcpToolsRequest, Builder> {
        private String regionId; 
        private Connection connection; 
        private Network network; 

        private Builder() {
            super();
        } 

        private Builder(FetchRemoteMcpToolsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.connection = request.connection;
            this.network = request.network;
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
         * <p>The request body parameters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder connection(Connection connection) {
            this.putBodyParameter("connection", connection);
            this.connection = connection;
            return this;
        }

        /**
         * <p>The request body parameters.</p>
         */
        public Builder network(Network network) {
            this.putBodyParameter("network", network);
            this.network = network;
            return this;
        }

        @Override
        public FetchRemoteMcpToolsRequest build() {
            return new FetchRemoteMcpToolsRequest(this);
        } 

    } 

    /**
     * 
     * {@link FetchRemoteMcpToolsRequest} extends {@link TeaModel}
     *
     * <p>FetchRemoteMcpToolsRequest</p>
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
             * <p>The request body parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;token&quot;:&quot;example-token&quot;}</p>
             */
            public Builder keyInfo(java.util.Map<String, String> keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            /**
             * <p>The authentication type. Currently, only bearer is supported.</p>
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
     * {@link FetchRemoteMcpToolsRequest} extends {@link TeaModel}
     *
     * <p>FetchRemoteMcpToolsRequest</p>
     */
    public static class Connection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auth")
        private Auth auth;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("transport")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The request body parameters.</p>
             */
            public Builder auth(Auth auth) {
                this.auth = auth;
                return this;
            }

            /**
             * <p>The access endpoint of the MCP service.</p>
             * <p>This parameter is required.</p>
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
             * <p>The transport protocol of the MCP service. Valid values: http and sse.</p>
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
     * {@link FetchRemoteMcpToolsRequest} extends {@link TeaModel}
     *
     * <p>FetchRemoteMcpToolsRequest</p>
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
             * <p>The VPC ID.</p>
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
}
