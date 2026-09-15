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
        public Builder body(CreateMcpRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The client token that ensures idempotency of the request.</p>
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
    public static class CodePackage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("headerName")
        private String headerName;

        private CodePackage(Builder builder) {
            this.apiKey = builder.apiKey;
            this.headerName = builder.headerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodePackage create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        public static final class Builder {
            private String apiKey; 
            private String headerName; 

            private Builder() {
            } 

            private Builder(CodePackage model) {
                this.apiKey = model.apiKey;
                this.headerName = model.headerName;
            } 

            /**
             * <p>The API key for authenticating MCP callers.</p>
             * 
             * <strong>example:</strong>
             * <p>example-api-key</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The name of the request header that carries the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>X-API-Key</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            public CodePackage build() {
                return new CodePackage(this);
            } 

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
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class Auth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("codePackage")
        private CodePackage codePackage;

        @com.aliyun.core.annotation.NameInMap("directProxy")
        private DirectProxy directProxy;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("httpToMcp")
        private java.util.List<HttpToMcp> httpToMcp;

        private Auth(Builder builder) {
            this.codePackage = builder.codePackage;
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
         * @return codePackage
         */
        public CodePackage getCodePackage() {
            return this.codePackage;
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
            private CodePackage codePackage; 
            private DirectProxy directProxy; 
            private Boolean enabled; 
            private java.util.List<HttpToMcp> httpToMcp; 

            private Builder() {
            } 

            private Builder(Auth model) {
                this.codePackage = model.codePackage;
                this.directProxy = model.directProxy;
                this.enabled = model.enabled;
                this.httpToMcp = model.httpToMcp;
            } 

            /**
             * <p>The API key authentication configuration for callers of code-deployed MCP.</p>
             */
            public Builder codePackage(CodePackage codePackage) {
                this.codePackage = codePackage;
                return this;
            }

            /**
             * <p>The authentication configuration for direct proxy.</p>
             */
            public Builder directProxy(DirectProxy directProxy) {
                this.directProxy = directProxy;
                return this;
            }

            /**
             * <p>Specifies whether to enable this configuration.</p>
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
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class AccessControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credentialId")
        private String credentialId;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        private AccessControl(Builder builder) {
            this.credentialId = builder.credentialId;
            this.enabled = builder.enabled;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessControl create() {
            return builder().build();
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private String credentialId; 
            private Boolean enabled; 
            private String mode; 

            private Builder() {
            } 

            private Builder(AccessControl model) {
                this.credentialId = model.credentialId;
                this.enabled = model.enabled;
                this.mode = model.mode;
            } 

            /**
             * <p>The AgentCore Credential referenced when mode is set to CREDENTIAL.</p>
             * 
             * <strong>example:</strong>
             * <p>credential-id</p>
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * <p>Specifies whether to enable ingress access control.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The access control mode. Valid values:</p>
             * <ul>
             * <li>ANONYMOUS: anonymous access.</li>
             * <li>CREDENTIAL: access using an AgentCore credential.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREDENTIAL</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public AccessControl build() {
                return new AccessControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class AgentIdentityConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorizationEnabled")
        private Boolean authorizationEnabled;

        @com.aliyun.core.annotation.NameInMap("credentialProviderArn")
        private String credentialProviderArn;

        @com.aliyun.core.annotation.NameInMap("credentialProviderType")
        private String credentialProviderType;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private AgentIdentityConfiguration(Builder builder) {
            this.authorizationEnabled = builder.authorizationEnabled;
            this.credentialProviderArn = builder.credentialProviderArn;
            this.credentialProviderType = builder.credentialProviderType;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentIdentityConfiguration create() {
            return builder().build();
        }

        /**
         * @return authorizationEnabled
         */
        public Boolean getAuthorizationEnabled() {
            return this.authorizationEnabled;
        }

        /**
         * @return credentialProviderArn
         */
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        /**
         * @return credentialProviderType
         */
        public String getCredentialProviderType() {
            return this.credentialProviderType;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean authorizationEnabled; 
            private String credentialProviderArn; 
            private String credentialProviderType; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(AgentIdentityConfiguration model) {
                this.authorizationEnabled = model.authorizationEnabled;
                this.credentialProviderArn = model.credentialProviderArn;
                this.credentialProviderType = model.credentialProviderType;
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to enable authorization.</p>
             */
            public Builder authorizationEnabled(Boolean authorizationEnabled) {
                this.authorizationEnabled = authorizationEnabled;
                return this;
            }

            /**
             * <p>The ARN of the credential provider.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:agentidentity:cn-hangzhou:1234567890123456:provider/example</p>
             */
            public Builder credentialProviderArn(String credentialProviderArn) {
                this.credentialProviderArn = credentialProviderArn;
                return this;
            }

            /**
             * <p>The type of the credential provider.</p>
             * 
             * <strong>example:</strong>
             * <p>oauth2</p>
             */
            public Builder credentialProviderType(String credentialProviderType) {
                this.credentialProviderType = credentialProviderType;
                return this;
            }

            /**
             * <p>Specifies whether to enable Agent Identity.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public AgentIdentityConfiguration build() {
                return new AgentIdentityConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class CodeConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("codePackageToken")
        private String codePackageToken;

        @com.aliyun.core.annotation.NameInMap("codePackageUrl")
        private String codePackageUrl;

        @com.aliyun.core.annotation.NameInMap("command")
        private java.util.List<String> command;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        private CodeConfiguration(Builder builder) {
            this.codePackageToken = builder.codePackageToken;
            this.codePackageUrl = builder.codePackageUrl;
            this.command = builder.command;
            this.language = builder.language;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeConfiguration create() {
            return builder().build();
        }

        /**
         * @return codePackageToken
         */
        public String getCodePackageToken() {
            return this.codePackageToken;
        }

        /**
         * @return codePackageUrl
         */
        public String getCodePackageUrl() {
            return this.codePackageUrl;
        }

        /**
         * @return command
         */
        public java.util.List<String> getCommand() {
            return this.command;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        public static final class Builder {
            private String codePackageToken; 
            private String codePackageUrl; 
            private java.util.List<String> command; 
            private String language; 

            private Builder() {
            } 

            private Builder(CodeConfiguration model) {
                this.codePackageToken = model.codePackageToken;
                this.codePackageUrl = model.codePackageUrl;
                this.command = model.command;
                this.language = model.language;
            } 

            /**
             * <p>The temporary code package token returned by GetMcpCodePackageUploadUrl. Use this token to create a code deployment after completing the pre-signed upload. Specify either this parameter or CodePackageUrl.</p>
             * 
             * <strong>example:</strong>
             * <p>upload-token</p>
             */
            public Builder codePackageToken(String codePackageToken) {
                this.codePackageToken = codePackageToken;
                return this;
            }

            /**
             * <p>The public Alibaba Cloud OSS HTTP(S) address that you can directly pass in when creating a code deployment. Specify either this parameter or CodePackageToken. Only CreateMcp supports this parameter. Update and query operations do not support this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/server.zip">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/server.zip</a></p>
             */
            public Builder codePackageUrl(String codePackageUrl) {
                this.codePackageUrl = codePackageUrl;
                return this;
            }

            /**
             * <p>The full startup command, with arguments passed in order by parameter boundary. For example, when using supergateway to start a stdio MCP, pass in supergateway, --stdio, the full subcommand, and remaining arguments.</p>
             */
            public Builder command(java.util.List<String> command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The code package runtime. Valid values: python3.13, nodejs22, and java17.</p>
             * 
             * <strong>example:</strong>
             * <p>python3.13</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            public CodeConfiguration build() {
                return new CodeConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class ContainerConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acrInstanceId")
        private String acrInstanceId;

        @com.aliyun.core.annotation.NameInMap("command")
        private java.util.List<String> command;

        @com.aliyun.core.annotation.NameInMap("entrypoint")
        private java.util.List<String> entrypoint;

        @com.aliyun.core.annotation.NameInMap("image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("imageRegistryType")
        private String imageRegistryType;

        @com.aliyun.core.annotation.NameInMap("mcpRuntimeMode")
        private String mcpRuntimeMode;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        private ContainerConfiguration(Builder builder) {
            this.acrInstanceId = builder.acrInstanceId;
            this.command = builder.command;
            this.entrypoint = builder.entrypoint;
            this.image = builder.image;
            this.imageRegistryType = builder.imageRegistryType;
            this.mcpRuntimeMode = builder.mcpRuntimeMode;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerConfiguration create() {
            return builder().build();
        }

        /**
         * @return acrInstanceId
         */
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        /**
         * @return command
         */
        public java.util.List<String> getCommand() {
            return this.command;
        }

        /**
         * @return entrypoint
         */
        public java.util.List<String> getEntrypoint() {
            return this.entrypoint;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imageRegistryType
         */
        public String getImageRegistryType() {
            return this.imageRegistryType;
        }

        /**
         * @return mcpRuntimeMode
         */
        public String getMcpRuntimeMode() {
            return this.mcpRuntimeMode;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String acrInstanceId; 
            private java.util.List<String> command; 
            private java.util.List<String> entrypoint; 
            private String image; 
            private String imageRegistryType; 
            private String mcpRuntimeMode; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(ContainerConfiguration model) {
                this.acrInstanceId = model.acrInstanceId;
                this.command = model.command;
                this.entrypoint = model.entrypoint;
                this.image = model.image;
                this.imageRegistryType = model.imageRegistryType;
                this.mcpRuntimeMode = model.mcpRuntimeMode;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The ACR instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-example</p>
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * <p>The startup command.</p>
             */
            public Builder command(java.util.List<String> command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The container entrypoint arguments.</p>
             */
            public Builder entrypoint(java.util.List<String> entrypoint) {
                this.entrypoint = entrypoint;
                return this;
            }

            /**
             * <p>The container image address.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-hangzhou.aliyuncs.com/example/mcp:1.0.0</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The image registry type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACR</p>
             */
            public Builder imageRegistryType(String imageRegistryType) {
                this.imageRegistryType = imageRegistryType;
                return this;
            }

            /**
             * <p>The MCP Runtime mode. Custom containers must expose a standard MCP on their own. Set this parameter to SELF_HOSTED.</p>
             * 
             * <strong>example:</strong>
             * <p>SELF_HOSTED</p>
             */
            public Builder mcpRuntimeMode(String mcpRuntimeMode) {
                this.mcpRuntimeMode = mcpRuntimeMode;
                return this;
            }

            /**
             * <p>The container source type. Currently fixed to CONTAINER_IMAGE.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTAINER_IMAGE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public ContainerConfiguration build() {
                return new ContainerConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class Hooks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Hooks(Builder builder) {
            this.apiVersion = builder.apiVersion;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.event = builder.event;
            this.headers = builder.headers;
            this.timeout = builder.timeout;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hooks create() {
            return builder().build();
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String apiVersion; 
            private String description; 
            private Boolean enabled; 
            private String event; 
            private java.util.Map<String, String> headers; 
            private Integer timeout; 
            private String url; 

            private Builder() {
            } 

            private Builder(Hooks model) {
                this.apiVersion = model.apiVersion;
                this.description = model.description;
                this.enabled = model.enabled;
                this.event = model.event;
                this.headers = model.headers;
                this.timeout = model.timeout;
                this.url = model.url;
            } 

            /**
             * <p>The hook API version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * <p>The hook description.</p>
             * 
             * <strong>example:</strong>
             * <p>Log MCP tool invocations</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether to enable the hook.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The hook event.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE_CALL_TOOL</p>
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * <p>The hook request headers.</p>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The hook timeout period. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The hook callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/mcp-hook">https://example.com/mcp-hook</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Hooks build() {
                return new Hooks(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class HookConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hooks")
        private java.util.List<Hooks> hooks;

        private HookConfiguration(Builder builder) {
            this.hooks = builder.hooks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HookConfiguration create() {
            return builder().build();
        }

        /**
         * @return hooks
         */
        public java.util.List<Hooks> getHooks() {
            return this.hooks;
        }

        public static final class Builder {
            private java.util.List<Hooks> hooks; 

            private Builder() {
            } 

            private Builder(HookConfiguration model) {
                this.hooks = model.hooks;
            } 

            /**
             * <p>The hooks executed in array order: PRE_LIST_TOOLS, PRE_CALL_TOOL, POST_LIST_TOOLS, and POST_CALL_TOOL.</p>
             */
            public Builder hooks(java.util.List<Hooks> hooks) {
                this.hooks = hooks;
                return this;
            }

            public HookConfiguration build() {
                return new HookConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class LogConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableInstanceMetrics")
        private Boolean enableInstanceMetrics;

        @com.aliyun.core.annotation.NameInMap("enableRequestMetrics")
        private Boolean enableRequestMetrics;

        @com.aliyun.core.annotation.NameInMap("logBeginRule")
        private String logBeginRule;

        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        private LogConfiguration(Builder builder) {
            this.enableInstanceMetrics = builder.enableInstanceMetrics;
            this.enableRequestMetrics = builder.enableRequestMetrics;
            this.logBeginRule = builder.logBeginRule;
            this.logstore = builder.logstore;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfiguration create() {
            return builder().build();
        }

        /**
         * @return enableInstanceMetrics
         */
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        /**
         * @return enableRequestMetrics
         */
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        /**
         * @return logBeginRule
         */
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private Boolean enableInstanceMetrics; 
            private Boolean enableRequestMetrics; 
            private String logBeginRule; 
            private String logstore; 
            private String project; 

            private Builder() {
            } 

            private Builder(LogConfiguration model) {
                this.enableInstanceMetrics = model.enableInstanceMetrics;
                this.enableRequestMetrics = model.enableRequestMetrics;
                this.logBeginRule = model.logBeginRule;
                this.logstore = model.logstore;
                this.project = model.project;
            } 

            /**
             * <p>Specifies whether to collect instance metrics.</p>
             */
            public Builder enableInstanceMetrics(Boolean enableInstanceMetrics) {
                this.enableInstanceMetrics = enableInstanceMetrics;
                return this;
            }

            /**
             * <p>Specifies whether to collect request metrics.</p>
             */
            public Builder enableRequestMetrics(Boolean enableRequestMetrics) {
                this.enableRequestMetrics = enableRequestMetrics;
                return this;
            }

            /**
             * <p>The log splitting begin rule for Function Compute (FC).</p>
             * 
             * <strong>example:</strong>
             * <p>DefaultRegex</p>
             */
            public Builder logBeginRule(String logBeginRule) {
                this.logBeginRule = logBeginRule;
                return this;
            }

            /**
             * <p>The Logstore name.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-logs</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The Log Service project name.</p>
             * 
             * <strong>example:</strong>
             * <p>agentcore-mcp-logs</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public LogConfiguration build() {
                return new LogConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class McpConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpointPath")
        private String endpointPath;

        @com.aliyun.core.annotation.NameInMap("sessionConcurrencyPerInstance")
        private Integer sessionConcurrencyPerInstance;

        @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutSeconds")
        private Integer sessionIdleTimeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("sessionMaxLifetimeSeconds")
        private Integer sessionMaxLifetimeSeconds;

        private McpConfiguration(Builder builder) {
            this.endpointPath = builder.endpointPath;
            this.sessionConcurrencyPerInstance = builder.sessionConcurrencyPerInstance;
            this.sessionIdleTimeoutSeconds = builder.sessionIdleTimeoutSeconds;
            this.sessionMaxLifetimeSeconds = builder.sessionMaxLifetimeSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpConfiguration create() {
            return builder().build();
        }

        /**
         * @return endpointPath
         */
        public String getEndpointPath() {
            return this.endpointPath;
        }

        /**
         * @return sessionConcurrencyPerInstance
         */
        public Integer getSessionConcurrencyPerInstance() {
            return this.sessionConcurrencyPerInstance;
        }

        /**
         * @return sessionIdleTimeoutSeconds
         */
        public Integer getSessionIdleTimeoutSeconds() {
            return this.sessionIdleTimeoutSeconds;
        }

        /**
         * @return sessionMaxLifetimeSeconds
         */
        public Integer getSessionMaxLifetimeSeconds() {
            return this.sessionMaxLifetimeSeconds;
        }

        public static final class Builder {
            private String endpointPath; 
            private Integer sessionConcurrencyPerInstance; 
            private Integer sessionIdleTimeoutSeconds; 
            private Integer sessionMaxLifetimeSeconds; 

            private Builder() {
            } 

            private Builder(McpConfiguration model) {
                this.endpointPath = model.endpointPath;
                this.sessionConcurrencyPerInstance = model.sessionConcurrencyPerInstance;
                this.sessionIdleTimeoutSeconds = model.sessionIdleTimeoutSeconds;
                this.sessionMaxLifetimeSeconds = model.sessionMaxLifetimeSeconds;
            } 

            /**
             * <p>For example, /mcp or /sse.</p>
             * 
             * <strong>example:</strong>
             * <p>/mcp</p>
             */
            public Builder endpointPath(String endpointPath) {
                this.endpointPath = endpointPath;
                return this;
            }

            /**
             * <p>Currently fixed to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sessionConcurrencyPerInstance(Integer sessionConcurrencyPerInstance) {
                this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
                return this;
            }

            /**
             * <p>Unit: seconds. Default value: 1800.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder sessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
                this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
                return this;
            }

            /**
             * <p>Unit: seconds. Default value: 21600.</p>
             * 
             * <strong>example:</strong>
             * <p>21600</p>
             */
            public Builder sessionMaxLifetimeSeconds(Integer sessionMaxLifetimeSeconds) {
                this.sessionMaxLifetimeSeconds = sessionMaxLifetimeSeconds;
                return this;
            }

            public McpConfiguration build() {
                return new McpConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class MountPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableTls")
        private Boolean enableTls;

        @com.aliyun.core.annotation.NameInMap("mountDir")
        private String mountDir;

        @com.aliyun.core.annotation.NameInMap("serverAddr")
        private String serverAddr;

        private MountPoints(Builder builder) {
            this.enableTls = builder.enableTls;
            this.mountDir = builder.mountDir;
            this.serverAddr = builder.serverAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountPoints create() {
            return builder().build();
        }

        /**
         * @return enableTls
         */
        public Boolean getEnableTls() {
            return this.enableTls;
        }

        /**
         * @return mountDir
         */
        public String getMountDir() {
            return this.mountDir;
        }

        /**
         * @return serverAddr
         */
        public String getServerAddr() {
            return this.serverAddr;
        }

        public static final class Builder {
            private Boolean enableTls; 
            private String mountDir; 
            private String serverAddr; 

            private Builder() {
            } 

            private Builder(MountPoints model) {
                this.enableTls = model.enableTls;
                this.mountDir = model.mountDir;
                this.serverAddr = model.serverAddr;
            } 

            /**
             * <p>Specifies whether to enable TLS.</p>
             */
            public Builder enableTls(Boolean enableTls) {
                this.enableTls = enableTls;
                return this;
            }

            /**
             * <p>The local mount directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/data</p>
             */
            public Builder mountDir(String mountDir) {
                this.mountDir = mountDir;
                return this;
            }

            /**
             * <p>The NAS server address.</p>
             * 
             * <strong>example:</strong>
             * <p>example.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder serverAddr(String serverAddr) {
                this.serverAddr = serverAddr;
                return this;
            }

            public MountPoints build() {
                return new MountPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class NasConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupId")
        private Integer groupId;

        @com.aliyun.core.annotation.NameInMap("mountPoints")
        private java.util.List<MountPoints> mountPoints;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Integer userId;

        private NasConfiguration(Builder builder) {
            this.groupId = builder.groupId;
            this.mountPoints = builder.mountPoints;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NasConfiguration create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return mountPoints
         */
        public java.util.List<MountPoints> getMountPoints() {
            return this.mountPoints;
        }

        /**
         * @return userId
         */
        public Integer getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer groupId; 
            private java.util.List<MountPoints> mountPoints; 
            private Integer userId; 

            private Builder() {
            } 

            private Builder(NasConfiguration model) {
                this.groupId = model.groupId;
                this.mountPoints = model.mountPoints;
                this.userId = model.userId;
            } 

            /**
             * <p>The runtime user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The list of NAS mount points.</p>
             */
            public Builder mountPoints(java.util.List<MountPoints> mountPoints) {
                this.mountPoints = mountPoints;
                return this;
            }

            /**
             * <p>The runtime user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder userId(Integer userId) {
                this.userId = userId;
                return this;
            }

            public NasConfiguration build() {
                return new NasConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class NetworkConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("networkMode")
        private String networkMode;

        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("vSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private NetworkConfiguration(Builder builder) {
            this.networkMode = builder.networkMode;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfiguration create() {
            return builder().build();
        }

        /**
         * @return networkMode
         */
        public String getNetworkMode() {
            return this.networkMode;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String networkMode; 
            private String securityGroupId; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(NetworkConfiguration model) {
                this.networkMode = model.networkMode;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The network mode.</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder networkMode(String networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-example</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-example</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetworkConfiguration build() {
                return new NetworkConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class OssMountConfigurationMountPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("bucketPath")
        private String bucketPath;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("mountDir")
        private String mountDir;

        @com.aliyun.core.annotation.NameInMap("readOnly")
        private Boolean readOnly;

        private OssMountConfigurationMountPoints(Builder builder) {
            this.bucketName = builder.bucketName;
            this.bucketPath = builder.bucketPath;
            this.endpoint = builder.endpoint;
            this.mountDir = builder.mountDir;
            this.readOnly = builder.readOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssMountConfigurationMountPoints create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return bucketPath
         */
        public String getBucketPath() {
            return this.bucketPath;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return mountDir
         */
        public String getMountDir() {
            return this.mountDir;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public static final class Builder {
            private String bucketName; 
            private String bucketPath; 
            private String endpoint; 
            private String mountDir; 
            private Boolean readOnly; 

            private Builder() {
            } 

            private Builder(OssMountConfigurationMountPoints model) {
                this.bucketName = model.bucketName;
                this.bucketPath = model.bucketPath;
                this.endpoint = model.endpoint;
                this.mountDir = model.mountDir;
                this.readOnly = model.readOnly;
            } 

            /**
             * <p>The OSS bucket name.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The OSS bucket path.</p>
             * 
             * <strong>example:</strong>
             * <p>/data</p>
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * <p>The OSS service endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oss-cn-hangzhou.aliyuncs.com">https://oss-cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The local mount directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/data</p>
             */
            public Builder mountDir(String mountDir) {
                this.mountDir = mountDir;
                return this;
            }

            /**
             * <p>Specifies whether the mount point is read-only.</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            public OssMountConfigurationMountPoints build() {
                return new OssMountConfigurationMountPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class OssMountConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mountPoints")
        private java.util.List<OssMountConfigurationMountPoints> mountPoints;

        private OssMountConfiguration(Builder builder) {
            this.mountPoints = builder.mountPoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssMountConfiguration create() {
            return builder().build();
        }

        /**
         * @return mountPoints
         */
        public java.util.List<OssMountConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public static final class Builder {
            private java.util.List<OssMountConfigurationMountPoints> mountPoints; 

            private Builder() {
            } 

            private Builder(OssMountConfiguration model) {
                this.mountPoints = model.mountPoints;
            } 

            /**
             * <p>The list of OSS mount points.</p>
             */
            public Builder mountPoints(java.util.List<OssMountConfigurationMountPoints> mountPoints) {
                this.mountPoints = mountPoints;
                return this;
            }

            public OssMountConfiguration build() {
                return new OssMountConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class ParameterTransformConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ruleSetId")
        private String ruleSetId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private ParameterTransformConfiguration(Builder builder) {
            this.enabled = builder.enabled;
            this.ruleSetId = builder.ruleSetId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterTransformConfiguration create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return ruleSetId
         */
        public String getRuleSetId() {
            return this.ruleSetId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String ruleSetId; 
            private String version; 

            private Builder() {
            } 

            private Builder(ParameterTransformConfiguration model) {
                this.enabled = model.enabled;
                this.ruleSetId = model.ruleSetId;
                this.version = model.version;
            } 

            /**
             * <p>Specifies whether to enable parameter transformation and result enhancement.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The reserved reference to the parameter transformation and result enhancement rule set.</p>
             * 
             * <strong>example:</strong>
             * <p>rules-1</p>
             */
            public Builder ruleSetId(String ruleSetId) {
                this.ruleSetId = ruleSetId;
                return this;
            }

            /**
             * <p>The transformation rule version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ParameterTransformConfiguration build() {
                return new ParameterTransformConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class ProxyConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private ProxyConfiguration(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyConfiguration create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(ProxyConfiguration model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to enable the MCP proxy.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public ProxyConfiguration build() {
                return new ProxyConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class RuntimeConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private Double cpu;

        @com.aliyun.core.annotation.NameInMap("diskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("environmentVariables")
        private java.util.Map<String, String> environmentVariables;

        @com.aliyun.core.annotation.NameInMap("executionRoleArn")
        private String executionRoleArn;

        @com.aliyun.core.annotation.NameInMap("instanceConcurrency")
        private Integer instanceConcurrency;

        @com.aliyun.core.annotation.NameInMap("memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        private RuntimeConfiguration(Builder builder) {
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
            this.environmentVariables = builder.environmentVariables;
            this.executionRoleArn = builder.executionRoleArn;
            this.instanceConcurrency = builder.instanceConcurrency;
            this.memory = builder.memory;
            this.port = builder.port;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeConfiguration create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Double getCpu() {
            return this.cpu;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return environmentVariables
         */
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        /**
         * @return executionRoleArn
         */
        public String getExecutionRoleArn() {
            return this.executionRoleArn;
        }

        /**
         * @return instanceConcurrency
         */
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Double cpu; 
            private Integer diskSize; 
            private java.util.Map<String, String> environmentVariables; 
            private String executionRoleArn; 
            private Integer instanceConcurrency; 
            private Integer memory; 
            private Integer port; 
            private Integer timeout; 

            private Builder() {
            } 

            private Builder(RuntimeConfiguration model) {
                this.cpu = model.cpu;
                this.diskSize = model.diskSize;
                this.environmentVariables = model.environmentVariables;
                this.executionRoleArn = model.executionRoleArn;
                this.instanceConcurrency = model.instanceConcurrency;
                this.memory = model.memory;
                this.port = model.port;
                this.timeout = model.timeout;
            } 

            /**
             * <p>Unit: cores. Default value: 0.25.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cpu(Double cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>Unit: MB. Valid values: 512 and 10240.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The environment variables.</p>
             */
            public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
                this.environmentVariables = environmentVariables;
                return this;
            }

            /**
             * <p>The ARN of the RAM role used when user code accesses downstream Alibaba Cloud resources.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1234567890123456:role/agentcore-mcp-execution</p>
             */
            public Builder executionRoleArn(String executionRoleArn) {
                this.executionRoleArn = executionRoleArn;
                return this;
            }

            /**
             * <p>Default value: 200.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder instanceConcurrency(Integer instanceConcurrency) {
                this.instanceConcurrency = instanceConcurrency;
                return this;
            }

            /**
             * <p>Unit: MB. Default value: 512.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Default value: 9000.</p>
             * 
             * <strong>example:</strong>
             * <p>9000</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Unit: seconds. Default value: 300.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            public RuntimeConfiguration build() {
                return new RuntimeConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpRequest</p>
     */
    public static class DeploymentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessControl")
        private AccessControl accessControl;

        @com.aliyun.core.annotation.NameInMap("agentIdentityConfiguration")
        private AgentIdentityConfiguration agentIdentityConfiguration;

        @com.aliyun.core.annotation.NameInMap("artifactType")
        private String artifactType;

        @com.aliyun.core.annotation.NameInMap("codeConfiguration")
        private CodeConfiguration codeConfiguration;

        @com.aliyun.core.annotation.NameInMap("containerConfiguration")
        private ContainerConfiguration containerConfiguration;

        @com.aliyun.core.annotation.NameInMap("hookConfiguration")
        private HookConfiguration hookConfiguration;

        @com.aliyun.core.annotation.NameInMap("logConfiguration")
        private LogConfiguration logConfiguration;

        @com.aliyun.core.annotation.NameInMap("mcpConfiguration")
        private McpConfiguration mcpConfiguration;

        @com.aliyun.core.annotation.NameInMap("nasConfiguration")
        private NasConfiguration nasConfiguration;

        @com.aliyun.core.annotation.NameInMap("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        @com.aliyun.core.annotation.NameInMap("ossMountConfiguration")
        private OssMountConfiguration ossMountConfiguration;

        @com.aliyun.core.annotation.NameInMap("parameterTransformConfiguration")
        private ParameterTransformConfiguration parameterTransformConfiguration;

        @com.aliyun.core.annotation.NameInMap("proxyConfiguration")
        private ProxyConfiguration proxyConfiguration;

        @com.aliyun.core.annotation.NameInMap("runtimeConfiguration")
        private RuntimeConfiguration runtimeConfiguration;

        private DeploymentConfig(Builder builder) {
            this.accessControl = builder.accessControl;
            this.agentIdentityConfiguration = builder.agentIdentityConfiguration;
            this.artifactType = builder.artifactType;
            this.codeConfiguration = builder.codeConfiguration;
            this.containerConfiguration = builder.containerConfiguration;
            this.hookConfiguration = builder.hookConfiguration;
            this.logConfiguration = builder.logConfiguration;
            this.mcpConfiguration = builder.mcpConfiguration;
            this.nasConfiguration = builder.nasConfiguration;
            this.networkConfiguration = builder.networkConfiguration;
            this.ossMountConfiguration = builder.ossMountConfiguration;
            this.parameterTransformConfiguration = builder.parameterTransformConfiguration;
            this.proxyConfiguration = builder.proxyConfiguration;
            this.runtimeConfiguration = builder.runtimeConfiguration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentConfig create() {
            return builder().build();
        }

        /**
         * @return accessControl
         */
        public AccessControl getAccessControl() {
            return this.accessControl;
        }

        /**
         * @return agentIdentityConfiguration
         */
        public AgentIdentityConfiguration getAgentIdentityConfiguration() {
            return this.agentIdentityConfiguration;
        }

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        /**
         * @return codeConfiguration
         */
        public CodeConfiguration getCodeConfiguration() {
            return this.codeConfiguration;
        }

        /**
         * @return containerConfiguration
         */
        public ContainerConfiguration getContainerConfiguration() {
            return this.containerConfiguration;
        }

        /**
         * @return hookConfiguration
         */
        public HookConfiguration getHookConfiguration() {
            return this.hookConfiguration;
        }

        /**
         * @return logConfiguration
         */
        public LogConfiguration getLogConfiguration() {
            return this.logConfiguration;
        }

        /**
         * @return mcpConfiguration
         */
        public McpConfiguration getMcpConfiguration() {
            return this.mcpConfiguration;
        }

        /**
         * @return nasConfiguration
         */
        public NasConfiguration getNasConfiguration() {
            return this.nasConfiguration;
        }

        /**
         * @return networkConfiguration
         */
        public NetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        /**
         * @return ossMountConfiguration
         */
        public OssMountConfiguration getOssMountConfiguration() {
            return this.ossMountConfiguration;
        }

        /**
         * @return parameterTransformConfiguration
         */
        public ParameterTransformConfiguration getParameterTransformConfiguration() {
            return this.parameterTransformConfiguration;
        }

        /**
         * @return proxyConfiguration
         */
        public ProxyConfiguration getProxyConfiguration() {
            return this.proxyConfiguration;
        }

        /**
         * @return runtimeConfiguration
         */
        public RuntimeConfiguration getRuntimeConfiguration() {
            return this.runtimeConfiguration;
        }

        public static final class Builder {
            private AccessControl accessControl; 
            private AgentIdentityConfiguration agentIdentityConfiguration; 
            private String artifactType; 
            private CodeConfiguration codeConfiguration; 
            private ContainerConfiguration containerConfiguration; 
            private HookConfiguration hookConfiguration; 
            private LogConfiguration logConfiguration; 
            private McpConfiguration mcpConfiguration; 
            private NasConfiguration nasConfiguration; 
            private NetworkConfiguration networkConfiguration; 
            private OssMountConfiguration ossMountConfiguration; 
            private ParameterTransformConfiguration parameterTransformConfiguration; 
            private ProxyConfiguration proxyConfiguration; 
            private RuntimeConfiguration runtimeConfiguration; 

            private Builder() {
            } 

            private Builder(DeploymentConfig model) {
                this.accessControl = model.accessControl;
                this.agentIdentityConfiguration = model.agentIdentityConfiguration;
                this.artifactType = model.artifactType;
                this.codeConfiguration = model.codeConfiguration;
                this.containerConfiguration = model.containerConfiguration;
                this.hookConfiguration = model.hookConfiguration;
                this.logConfiguration = model.logConfiguration;
                this.mcpConfiguration = model.mcpConfiguration;
                this.nasConfiguration = model.nasConfiguration;
                this.networkConfiguration = model.networkConfiguration;
                this.ossMountConfiguration = model.ossMountConfiguration;
                this.parameterTransformConfiguration = model.parameterTransformConfiguration;
                this.proxyConfiguration = model.proxyConfiguration;
                this.runtimeConfiguration = model.runtimeConfiguration;
            } 

            /**
             * <p>The MCP ingress access control configuration.</p>
             */
            public Builder accessControl(AccessControl accessControl) {
                this.accessControl = accessControl;
                return this;
            }

            /**
             * <p>The Agent Identity configuration.</p>
             */
            public Builder agentIdentityConfiguration(AgentIdentityConfiguration agentIdentityConfiguration) {
                this.agentIdentityConfiguration = agentIdentityConfiguration;
                return this;
            }

            /**
             * <p>The artifact type. Valid values:</p>
             * <ul>
             * <li>Code: a ZIP code package.</li>
             * <li>Container: a custom container.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Code</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * <p>The code package configuration.</p>
             */
            public Builder codeConfiguration(CodeConfiguration codeConfiguration) {
                this.codeConfiguration = codeConfiguration;
                return this;
            }

            /**
             * <p>The custom container configuration.</p>
             */
            public Builder containerConfiguration(ContainerConfiguration containerConfiguration) {
                this.containerConfiguration = containerConfiguration;
                return this;
            }

            /**
             * <p>The hook configuration.</p>
             */
            public Builder hookConfiguration(HookConfiguration hookConfiguration) {
                this.hookConfiguration = hookConfiguration;
                return this;
            }

            /**
             * <p>The log configuration.</p>
             */
            public Builder logConfiguration(LogConfiguration logConfiguration) {
                this.logConfiguration = logConfiguration;
                return this;
            }

            /**
             * <p>The MCP session configuration.</p>
             */
            public Builder mcpConfiguration(McpConfiguration mcpConfiguration) {
                this.mcpConfiguration = mcpConfiguration;
                return this;
            }

            /**
             * <p>The NAS storage configuration.</p>
             */
            public Builder nasConfiguration(NasConfiguration nasConfiguration) {
                this.nasConfiguration = nasConfiguration;
                return this;
            }

            /**
             * <p>The network configuration.</p>
             */
            public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
                this.networkConfiguration = networkConfiguration;
                return this;
            }

            /**
             * <p>The OSS mount configuration.</p>
             */
            public Builder ossMountConfiguration(OssMountConfiguration ossMountConfiguration) {
                this.ossMountConfiguration = ossMountConfiguration;
                return this;
            }

            /**
             * <p>The parameter transformation and result enhancement configuration.</p>
             */
            public Builder parameterTransformConfiguration(ParameterTransformConfiguration parameterTransformConfiguration) {
                this.parameterTransformConfiguration = parameterTransformConfiguration;
                return this;
            }

            /**
             * <p>The MCP proxy configuration.</p>
             */
            public Builder proxyConfiguration(ProxyConfiguration proxyConfiguration) {
                this.proxyConfiguration = proxyConfiguration;
                return this;
            }

            /**
             * <p>The runtime and resource configuration.</p>
             */
            public Builder runtimeConfiguration(RuntimeConfiguration runtimeConfiguration) {
                this.runtimeConfiguration = runtimeConfiguration;
                return this;
            }

            public DeploymentConfig build() {
                return new DeploymentConfig(this);
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
        private java.util.List<String> addresses;

        @com.aliyun.core.annotation.NameInMap("auth")
        private Auth auth;

        @com.aliyun.core.annotation.NameInMap("customTags")
        private java.util.List<String> customTags;

        @com.aliyun.core.annotation.NameInMap("deploymentConfig")
        private DeploymentConfig deploymentConfig;

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
            this.customTags = builder.customTags;
            this.deploymentConfig = builder.deploymentConfig;
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
         * @return customTags
         */
        public java.util.List<String> getCustomTags() {
            return this.customTags;
        }

        /**
         * @return deploymentConfig
         */
        public DeploymentConfig getDeploymentConfig() {
            return this.deploymentConfig;
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
            private java.util.List<String> customTags; 
            private DeploymentConfig deploymentConfig; 
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
                this.customTags = model.customTags;
                this.deploymentConfig = model.deploymentConfig;
                this.description = model.description;
                this.name = model.name;
                this.protocol = model.protocol;
                this.swaggerConfig = model.swaggerConfig;
                this.type = model.type;
            } 

            /**
             * <p>The list of MCP service addresses.</p>
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The backend authentication configuration. When enabled is set to true: for DIRECT_PROXY, specify directProxy (name/value). For HTTP_TO_MCP, specify the httpToMcp array (each item contains id/type/credential. For apiKey, position/name are also required). Multiple authentication objects are supported, and the first one is used as the default upstream credential. HTTP_TO_MCP credentials are merged into the securitySchemes of the Swagger specification.</p>
             */
            public Builder auth(Auth auth) {
                this.auth = auth;
                return this;
            }

            /**
             * <p>Custom tags. Multiple tags are supported.</p>
             */
            public Builder customTags(java.util.List<String> customTags) {
                this.customTags = customTags;
                return this;
            }

            /**
             * <p>The code deployment configuration. Required when Type is set to CODE_PACKAGE. When creating a Code artifact, you must specify either CodeConfiguration.CodePackageToken or CodePackageUrl, but not both. CodePackageUrl supports only public Alibaba Cloud OSS HTTP(S) addresses.</p>
             */
            public Builder deploymentConfig(DeploymentConfig deploymentConfig) {
                this.deploymentConfig = deploymentConfig;
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
             * <p>The MCP name.</p>
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
             * <p>The MCP protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>SSE</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Required if Type is set to HTTP_TO_MCP.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;}</p>
             */
            public Builder swaggerConfig(String swaggerConfig) {
                this.swaggerConfig = swaggerConfig;
                return this;
            }

            /**
             * <p>The type.</p>
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
