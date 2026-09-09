// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link UpdateMcpRequest} extends {@link RequestModel}
 *
 * <p>UpdateMcpRequest</p>
 */
public class UpdateMcpRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("mcpServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mcpServerId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateMcpRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateMcpRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.mcpServerId = builder.mcpServerId;
        this.regionId = builder.regionId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMcpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return mcpServerId
     */
    public String getMcpServerId() {
        return this.mcpServerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return body
     */
    public UpdateMcpRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateMcpRequest, Builder> {
        private String workspaceId; 
        private String mcpServerId; 
        private String regionId; 
        private UpdateMcpRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMcpRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.mcpServerId = request.mcpServerId;
            this.regionId = request.regionId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The MCP service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-server-id</p>
         */
        public Builder mcpServerId(String mcpServerId) {
            this.putPathParameter("mcpServerId", mcpServerId);
            this.mcpServerId = mcpServerId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request body.</p>
         */
        public Builder body(UpdateMcpRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The client idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426614174000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateMcpRequest build() {
            return new UpdateMcpRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMcpRequest} extends {@link TeaModel}
     *
     * <p>UpdateMcpRequest</p>
     */
    public static class DirectProxy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private DirectProxy(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectProxy create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(DirectProxy model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The authentication parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>example-credential</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DirectProxy build() {
                return new DirectProxy(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMcpRequest} extends {@link TeaModel}
     *
     * <p>UpdateMcpRequest</p>
     */
    public static class HttpToMcp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credential")
        private String credential;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private HttpToMcp(Builder builder) {
            this.credential = builder.credential;
            this.id = builder.id;
            this.name = builder.name;
            this.position = builder.position;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpToMcp create() {
            return builder().build();
        }

        /**
         * @return credential
         */
        public String getCredential() {
            return this.credential;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String credential; 
            private String id; 
            private String name; 
            private String position; 
            private String type; 

            private Builder() {
            } 

            private Builder(HttpToMcp model) {
                this.credential = model.credential;
                this.id = model.id;
                this.name = model.name;
                this.position = model.position;
                this.type = model.type;
            } 

            /**
             * <p>The authentication credential.</p>
             * 
             * <strong>example:</strong>
             * <p>example-credential</p>
             */
            public Builder credential(String credential) {
                this.credential = credential;
                return this;
            }

            /**
             * <p>The authentication scheme ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-1234567890abcdef</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The position of the credential.</p>
             * 
             * <strong>example:</strong>
             * <p>header</p>
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HttpToMcp build() {
                return new HttpToMcp(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMcpRequest} extends {@link TeaModel}
     *
     * <p>UpdateMcpRequest</p>
     */
    public static class Auth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("directProxy")
        private DirectProxy directProxy;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("httpToMcp")
        private java.util.List<HttpToMcp> httpToMcp;

        private Auth(Builder builder) {
            this.directProxy = builder.directProxy;
            this.enabled = builder.enabled;
            this.httpToMcp = builder.httpToMcp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Auth create() {
            return builder().build();
        }

        /**
         * @return directProxy
         */
        public DirectProxy getDirectProxy() {
            return this.directProxy;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return httpToMcp
         */
        public java.util.List<HttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

        public static final class Builder {
            private DirectProxy directProxy; 
            private Boolean enabled; 
            private java.util.List<HttpToMcp> httpToMcp; 

            private Builder() {
            } 

            private Builder(Auth model) {
                this.directProxy = model.directProxy;
                this.enabled = model.enabled;
                this.httpToMcp = model.httpToMcp;
            } 

            /**
             * <p>The direct proxy authentication configuration.</p>
             */
            public Builder directProxy(DirectProxy directProxy) {
                this.directProxy = directProxy;
                return this;
            }

            /**
             * <p>Specifies whether to enable authentication.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The list of HTTP_TO_MCP authentication configurations.</p>
             */
            public Builder httpToMcp(java.util.List<HttpToMcp> httpToMcp) {
                this.httpToMcp = httpToMcp;
                return this;
            }

            public Auth build() {
                return new Auth(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMcpRequest} extends {@link TeaModel}
     *
     * <p>UpdateMcpRequest</p>
     */
    public static class UpdateMcpRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addresses")
        private java.util.List<String> addresses;

        @com.aliyun.core.annotation.NameInMap("auth")
        private Auth auth;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("swaggerConfig")
        private String swaggerConfig;

        private UpdateMcpRequestBody(Builder builder) {
            this.addresses = builder.addresses;
            this.auth = builder.auth;
            this.description = builder.description;
            this.swaggerConfig = builder.swaggerConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateMcpRequestBody create() {
            return builder().build();
        }

        /**
         * @return addresses
         */
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        /**
         * @return auth
         */
        public Auth getAuth() {
            return this.auth;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return swaggerConfig
         */
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public static final class Builder {
            private java.util.List<String> addresses; 
            private Auth auth; 
            private String description; 
            private String swaggerConfig; 

            private Builder() {
            } 

            private Builder(UpdateMcpRequestBody model) {
                this.addresses = model.addresses;
                this.auth = model.auth;
                this.description = model.description;
                this.swaggerConfig = model.swaggerConfig;
            } 

            /**
             * <p>The list of MCP service addresses.</p>
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The backend authentication configuration. When enabled=true: for DIRECT_PROXY, specify directProxy (name/value). For HTTP_TO_MCP, specify the httpToMcp array (each item contains id/type/credential; apiKey also requires position/name). Multiple authentication objects are supported, and the first one is the default upstream credential. HTTP_TO_MCP credentials are merged into the securitySchemes of the Swagger specification.</p>
             */
            public Builder auth(Auth auth) {
                this.auth = auth;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>A sample description that explains the purpose of the resource</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Swagger configuration. Specify this field if Type is set to HTTP_TO_MCP.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;}</p>
             */
            public Builder swaggerConfig(String swaggerConfig) {
                this.swaggerConfig = swaggerConfig;
                return this;
            }

            public UpdateMcpRequestBody build() {
                return new UpdateMcpRequestBody(this);
            } 

        } 

    }
}
