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
 * {@link CreateMcpRequest} extends {@link RequestModel}
 *
 * <p>CreateMcpRequest</p>
 */
public class CreateMcpRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateMcpRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateMcpRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcpRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return body
     */
    public CreateMcpRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateMcpRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private CreateMcpRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcpRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
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
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(CreateMcpRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateMcpRequest build() {
            return new CreateMcpRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * value.
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
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
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
             * credential.
             */
            public Builder credential(String credential) {
                this.credential = credential;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * type.
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
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
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
             * directProxy.
             */
            public Builder directProxy(DirectProxy directProxy) {
                this.directProxy = directProxy;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * httpToMcp.
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
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class CreateMcpRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addresses")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> addresses;

        @com.aliyun.core.annotation.NameInMap("auth")
        private Auth auth;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("swaggerConfig")
        private String swaggerConfig;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private CreateMcpRequestBody(Builder builder) {
            this.addresses = builder.addresses;
            this.auth = builder.auth;
            this.description = builder.description;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.swaggerConfig = builder.swaggerConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateMcpRequestBody create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return swaggerConfig
         */
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> addresses; 
            private Auth auth; 
            private String description; 
            private String name; 
            private String protocol; 
            private String swaggerConfig; 
            private String type; 

            private Builder() {
            } 

            private Builder(CreateMcpRequestBody model) {
                this.addresses = model.addresses;
                this.auth = model.auth;
                this.description = model.description;
                this.name = model.name;
                this.protocol = model.protocol;
                this.swaggerConfig = model.swaggerConfig;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * auth.
             */
            public Builder auth(Auth auth) {
                this.auth = auth;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-mcp-server</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * swaggerConfig.
             */
            public Builder swaggerConfig(String swaggerConfig) {
                this.swaggerConfig = swaggerConfig;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DIRECT_PROXY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CreateMcpRequestBody build() {
                return new CreateMcpRequestBody(this);
            } 

        } 

    }
}
