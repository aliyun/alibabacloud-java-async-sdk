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
 * {@link CreateMcpResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcpResponseBody</p>
 */
public class CreateMcpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateMcpResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcpResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateMcpResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Request processed successfully</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateMcpResponseBody build() {
            return new CreateMcpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expectedDigest")
        private String expectedDigest;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Tools(Builder builder) {
            this.expectedDigest = builder.expectedDigest;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return expectedDigest
         */
        public String getExpectedDigest() {
            return this.expectedDigest;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String expectedDigest; 
            private String name; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.expectedDigest = model.expectedDigest;
                this.name = model.name;
            } 

            /**
             * <p>Required for virtual MCP. The definition digest obtained from the ListMcpTools operation or validation result of the source MCP. The client passes this value back as-is without calculating it. This value is used only as a baseline for manual update validation and does not freeze the runtime schema.</p>
             * 
             * <strong>example:</strong>
             * <p>e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855</p>
             */
            public Builder expectedDigest(String expectedDigest) {
                this.expectedDigest = expectedDigest;
                return this;
            }

            /**
             * <p>Required for virtual MCP. The name of the source tool.</p>
             * 
             * <strong>example:</strong>
             * <p>get-current-time</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        private Sources(Builder builder) {
            this.mcpServerId = builder.mcpServerId;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private String mcpServerId; 
            private java.util.List<Tools> tools; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.mcpServerId = model.mcpServerId;
                this.tools = model.tools;
            } 

            /**
             * <p>Required for virtual MCP. The ID of the source MCP in the current workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-server-source-1</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * <p>Required for virtual MCP. The manually selected tools. Specify at least one tool for each source, and up to 100 tools in total across all sources.</p>
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class AppliedVirtualConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sources")
        private java.util.List<Sources> sources;

        private AppliedVirtualConfig(Builder builder) {
            this.sources = builder.sources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppliedVirtualConfig create() {
            return builder().build();
        }

        /**
         * @return sources
         */
        public java.util.List<Sources> getSources() {
            return this.sources;
        }

        public static final class Builder {
            private java.util.List<Sources> sources; 

            private Builder() {
            } 

            private Builder(AppliedVirtualConfig model) {
                this.sources = model.sources;
            } 

            /**
             * <p>Required for virtual MCP. Specify 1 to 10 different source MCPs.</p>
             */
            public Builder sources(java.util.List<Sources> sources) {
                this.sources = sources;
                return this;
            }

            public AppliedVirtualConfig build() {
                return new AppliedVirtualConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The API key used to validate the MCP caller.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The value of the authentication parameter.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The ID of the authentication scheme.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The caller API key authentication configuration for the code package MCP.</p>
             */
            public Builder codePackage(CodePackage codePackage) {
                this.codePackage = codePackage;
                return this;
            }

            /**
             * <p>The authentication configuration for the direct proxy.</p>
             */
            public Builder directProxy(DirectProxy directProxy) {
                this.directProxy = directProxy;
                return this;
            }

            /**
             * <p>Specifies whether to enable the configuration.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The list of authentication configurations for HTTP_TO_MCP.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The AgentCore Credential referenced when the mode is CREDENTIAL.</p>
             * 
             * <strong>example:</strong>
             * <p>credential-id</p>
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * <p>Specifies whether to enable entry access control.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>ANONYMOUS indicates anonymous access. CREDENTIAL indicates the use of AgentCore access credentials.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class CodeConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("codePackageToken")
        private String codePackageToken;

        @com.aliyun.core.annotation.NameInMap("command")
        private java.util.List<String> command;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        private CodeConfiguration(Builder builder) {
            this.codePackageToken = builder.codePackageToken;
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
            private java.util.List<String> command; 
            private String language; 

            private Builder() {
            } 

            private Builder(CodeConfiguration model) {
                this.codePackageToken = model.codePackageToken;
                this.command = model.command;
                this.language = model.language;
            } 

            /**
             * <p>The temporary code package token returned by GetMcpCodePackageUploadUrl. It is used to create or update a code deployment after the presigned upload is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>upload-token</p>
             */
            public Builder codePackageToken(String codePackageToken) {
                this.codePackageToken = codePackageToken;
                return this;
            }

            /**
             * <p>The complete startup command, passed sequentially by parameter boundaries. For example, when using supergateway to start a stdio MCP, pass supergateway, --stdio, the complete subcommand, and the remaining parameters.</p>
             */
            public Builder command(java.util.List<String> command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The runtime of the code package. Valid values: python3.13, nodejs22, and java17.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class AuthConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private AuthConfig(Builder builder) {
            this.password = builder.password;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthConfig create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String password; 
            private String userName; 

            private Builder() {
            } 

            private Builder(AuthConfig model) {
                this.password = model.password;
                this.userName = model.userName;
            } 

            /**
             * <p>The password for the image registry. The password is encrypted and stored on the server, and is not returned in query responses. If you omit this parameter during an update, the existing password is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>example-password</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The username for the image registry.</p>
             * 
             * <strong>example:</strong>
             * <p>puller</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public AuthConfig build() {
                return new AuthConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class CertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("insecure")
        private Boolean insecure;

        @com.aliyun.core.annotation.NameInMap("rootCaCertBase64")
        private String rootCaCertBase64;

        private CertConfig(Builder builder) {
            this.insecure = builder.insecure;
            this.rootCaCertBase64 = builder.rootCaCertBase64;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertConfig create() {
            return builder().build();
        }

        /**
         * @return insecure
         */
        public Boolean getInsecure() {
            return this.insecure;
        }

        /**
         * @return rootCaCertBase64
         */
        public String getRootCaCertBase64() {
            return this.rootCaCertBase64;
        }

        public static final class Builder {
            private Boolean insecure; 
            private String rootCaCertBase64; 

            private Builder() {
            } 

            private Builder(CertConfig model) {
                this.insecure = model.insecure;
                this.rootCaCertBase64 = model.rootCaCertBase64;
            } 

            /**
             * <p>Specifies whether to skip the verification of the TLS certificate of the image registry. A value of true indicates that the verification is skipped. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder insecure(Boolean insecure) {
                this.insecure = insecure;
                return this;
            }

            /**
             * <p>The Base64-encoded root CA certificate of the image registry, which is used to verify self-signed certificates.</p>
             * 
             * <strong>example:</strong>
             * <p>LS0tLS1CRUdJTi...</p>
             */
            public Builder rootCaCertBase64(String rootCaCertBase64) {
                this.rootCaCertBase64 = rootCaCertBase64;
                return this;
            }

            public CertConfig build() {
                return new CertConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class NetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private NetworkConfig(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(NetworkConfig model) {
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the security group used to pull images.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-example</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch used to pull images.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-example</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC where the image registry resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-example</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class RegistryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authConfig")
        private AuthConfig authConfig;

        @com.aliyun.core.annotation.NameInMap("certConfig")
        private CertConfig certConfig;

        @com.aliyun.core.annotation.NameInMap("networkConfig")
        private NetworkConfig networkConfig;

        private RegistryConfig(Builder builder) {
            this.authConfig = builder.authConfig;
            this.certConfig = builder.certConfig;
            this.networkConfig = builder.networkConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegistryConfig create() {
            return builder().build();
        }

        /**
         * @return authConfig
         */
        public AuthConfig getAuthConfig() {
            return this.authConfig;
        }

        /**
         * @return certConfig
         */
        public CertConfig getCertConfig() {
            return this.certConfig;
        }

        /**
         * @return networkConfig
         */
        public NetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public static final class Builder {
            private AuthConfig authConfig; 
            private CertConfig certConfig; 
            private NetworkConfig networkConfig; 

            private Builder() {
            } 

            private Builder(RegistryConfig model) {
                this.authConfig = model.authConfig;
                this.certConfig = model.certConfig;
                this.networkConfig = model.networkConfig;
            } 

            /**
             * <p>The authentication configuration of the image registry. Specify this parameter when the image registry requires username and password authentication.</p>
             */
            public Builder authConfig(AuthConfig authConfig) {
                this.authConfig = authConfig;
                return this;
            }

            /**
             * <p>The TLS certificate verification configuration of the image registry.</p>
             */
            public Builder certConfig(CertConfig certConfig) {
                this.certConfig = certConfig;
                return this;
            }

            /**
             * <p>The network configuration for image pulling. Specify this parameter when the image registry is accessible only within a VPC. Function Compute pulls images through this network.</p>
             */
            public Builder networkConfig(NetworkConfig networkConfig) {
                this.networkConfig = networkConfig;
                return this;
            }

            public RegistryConfig build() {
                return new RegistryConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("registryConfig")
        private RegistryConfig registryConfig;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        private ContainerConfiguration(Builder builder) {
            this.acrInstanceId = builder.acrInstanceId;
            this.command = builder.command;
            this.entrypoint = builder.entrypoint;
            this.image = builder.image;
            this.imageRegistryType = builder.imageRegistryType;
            this.mcpRuntimeMode = builder.mcpRuntimeMode;
            this.registryConfig = builder.registryConfig;
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
         * @return registryConfig
         */
        public RegistryConfig getRegistryConfig() {
            return this.registryConfig;
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
            private RegistryConfig registryConfig; 
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
                this.registryConfig = model.registryConfig;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The ID of the ACR instance.</p>
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
             * <p>The entrypoint parameters of the container.</p>
             */
            public Builder entrypoint(java.util.List<String> entrypoint) {
                this.entrypoint = entrypoint;
                return this;
            }

            /**
             * <p>The URL of the container image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-hangzhou.aliyuncs.com/example/mcp:1.0.0</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The type of the image registry.</p>
             * 
             * <strong>example:</strong>
             * <p>ACR</p>
             */
            public Builder imageRegistryType(String imageRegistryType) {
                this.imageRegistryType = imageRegistryType;
                return this;
            }

            /**
             * <p>The MCP runtime mode. Custom containers must expose the standard MCP by themselves. Set the value to SELF_HOSTED.</p>
             * 
             * <strong>example:</strong>
             * <p>SELF_HOSTED</p>
             */
            public Builder mcpRuntimeMode(String mcpRuntimeMode) {
                this.mcpRuntimeMode = mcpRuntimeMode;
                return this;
            }

            /**
             * <p>The custom image registry configuration. This parameter takes effect only when ImageRegistryType is set to CUSTOM. It is used to configure image pull authentication, TLS certificate verification, and the private network for image pulling.</p>
             */
            public Builder registryConfig(RegistryConfig registryConfig) {
                this.registryConfig = registryConfig;
                return this;
            }

            /**
             * <p>The source type of the container. This parameter is fixed to CONTAINER_IMAGE.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The API version of the hook.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * <p>The description of the hook.</p>
             * 
             * <strong>example:</strong>
             * <p>Records MCP tool invocation</p>
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
             * <p>The request headers of the hook.</p>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The timeout period in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The callback URL of the hook.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The list of hooks executed in array order, including PRE_LIST_TOOLS, PRE_CALL_TOOL, POST_LIST_TOOLS, and POST_CALL_TOOL hooks.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The start rule for Function Compute log segmentation.</p>
             * 
             * <strong>example:</strong>
             * <p>DefaultRegex</p>
             */
            public Builder logBeginRule(String logBeginRule) {
                this.logBeginRule = logBeginRule;
                return this;
            }

            /**
             * <p>The name of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-logs</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("sessionMode")
        private String sessionMode;

        private McpConfiguration(Builder builder) {
            this.endpointPath = builder.endpointPath;
            this.sessionConcurrencyPerInstance = builder.sessionConcurrencyPerInstance;
            this.sessionIdleTimeoutSeconds = builder.sessionIdleTimeoutSeconds;
            this.sessionMaxLifetimeSeconds = builder.sessionMaxLifetimeSeconds;
            this.sessionMode = builder.sessionMode;
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

        /**
         * @return sessionMode
         */
        public String getSessionMode() {
            return this.sessionMode;
        }

        public static final class Builder {
            private String endpointPath; 
            private Integer sessionConcurrencyPerInstance; 
            private Integer sessionIdleTimeoutSeconds; 
            private Integer sessionMaxLifetimeSeconds; 
            private String sessionMode; 

            private Builder() {
            } 

            private Builder(McpConfiguration model) {
                this.endpointPath = model.endpointPath;
                this.sessionConcurrencyPerInstance = model.sessionConcurrencyPerInstance;
                this.sessionIdleTimeoutSeconds = model.sessionIdleTimeoutSeconds;
                this.sessionMaxLifetimeSeconds = model.sessionMaxLifetimeSeconds;
                this.sessionMode = model.sessionMode;
            } 

            /**
             * <p>Example: /mcp or /sse.</p>
             * 
             * <strong>example:</strong>
             * <p>/mcp</p>
             */
            public Builder endpointPath(String endpointPath) {
                this.endpointPath = endpointPath;
                return this;
            }

            /**
             * <p>Currently fixed at 1.</p>
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

            /**
             * <p>Applicable only to StreamableHTTP. The default value is STATEFUL when created. If omitted during an update, the original value is retained. STATELESS disables Function Compute session affinity, and the stdio gateway does not enable stateful mode. Native HTTP services must support stateless MCP themselves.</p>
             * 
             * <strong>example:</strong>
             * <p>STATEFUL</p>
             */
            public Builder sessionMode(String sessionMode) {
                this.sessionMode = sessionMode;
                return this;
            }

            public McpConfiguration build() {
                return new McpConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The service address of the NAS file system.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The list of NAS mount targets.</p>
             */
            public Builder mountPoints(java.util.List<MountPoints> mountPoints) {
                this.mountPoints = mountPoints;
                return this;
            }

            /**
             * <p>The user ID.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The ID of the security group.</p>
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
             * <p>The ID of the virtual private cloud (VPC).</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The path in the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>/data</p>
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * <p>The endpoint of the OSS service.</p>
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
             * <p>Specifies whether the mount target is read-only.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The list of OSS mount targets.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>Specifies whether to enable parameter transformation and result augmentation.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The reference to the reserved parameter transformation and result augmentation rule set.</p>
             * 
             * <strong>example:</strong>
             * <p>rules-1</p>
             */
            public Builder ruleSetId(String ruleSetId) {
                this.ruleSetId = ruleSetId;
                return this;
            }

            /**
             * <p>The version of the transformation rule.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The CPU specification. Unit: cores. Default value: 0.25.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cpu(Double cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The size of the ephemeral disk. Unit: MB. Valid values: 512 and 10240.</p>
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
             * <p>The maximum number of concurrent requests per instance. Default value: 200.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder instanceConcurrency(Integer instanceConcurrency) {
                this.instanceConcurrency = instanceConcurrency;
                return this;
            }

            /**
             * <p>The memory specification. Unit: MB. Default value: 512.</p>
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
             * <p>The timeout period of the function. Unit: seconds. Default value: 300.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
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
             * <p>The MCP entry access control configuration.</p>
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
             * <p>The artifact type. A value of Code indicates a ZIP code package, and a value of Container indicates a custom container.</p>
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
             * <p>The configuration for parameter transformation and result augmentation.</p>
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
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class MarketSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("marketItemId")
        private String marketItemId;

        private MarketSource(Builder builder) {
            this.marketItemId = builder.marketItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarketSource create() {
            return builder().build();
        }

        /**
         * @return marketItemId
         */
        public String getMarketItemId() {
            return this.marketItemId;
        }

        public static final class Builder {
            private String marketItemId; 

            private Builder() {
            } 

            private Builder(MarketSource model) {
                this.marketItemId = model.marketItemId;
            } 

            /**
             * <p>The MCP marketplace template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>market-1</p>
             */
            public Builder marketItemId(String marketItemId) {
                this.marketItemId = marketItemId;
                return this;
            }

            public MarketSource build() {
                return new MarketSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("retryable")
        private Boolean retryable;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("stage")
        private String stage;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.retryable = builder.retryable;
            this.source = builder.source;
            this.stage = builder.stage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return retryable
         */
        public Boolean getRetryable() {
            return this.retryable;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private Boolean retryable; 
            private String source; 
            private String stage; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
                this.retryable = model.retryable;
                this.source = model.source;
                this.stage = model.stage;
            } 

            /**
             * <p>The bounded diagnostic code. Only bounded diagnostic codes are returned, and the original error body from the origin is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>PROBE_TIMEOUT</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The necessary diagnostics that are trimmed and desensitized. This message does not contain credentials or original responses.</p>
             * 
             * <strong>example:</strong>
             * <p>The probe deadline was exceeded.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the operation is suitable for retry based on a restricted policy. This field does not trigger automatic retries.</p>
             */
            public Builder retryable(Boolean retryable) {
                this.retryable = retryable;
                return this;
            }

            /**
             * <p>The source of the error. Valid values: MAGIC, ROUTER, NETWORK, ORIGIN, and UNKNOWN. The value is determined only based on actual evidence.</p>
             * 
             * <strong>example:</strong>
             * <p>UNKNOWN</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The detection or deployment stage where the error occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>INITIALIZE</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class Operation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("operationId")
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Operation(Builder builder) {
            this.error = builder.error;
            this.operationId = builder.operationId;
            this.stage = builder.stage;
            this.status = builder.status;
            this.type = builder.type;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operation create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Error error; 
            private String operationId; 
            private String stage; 
            private String status; 
            private String type; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Operation model) {
                this.error = model.error;
                this.operationId = model.operationId;
                this.stage = model.stage;
                this.status = model.status;
                this.type = model.type;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The sanitized error for the current deployment operation. This field indicates failures in the gateway or production pipeline after the origin server validation passes.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The identifier of the current or most recent deployment operation.</p>
             * 
             * <strong>example:</strong>
             * <p>3541f1af-87cc-45d1-a28e-94ec5633b931</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>The deployment stage. Valid values: compute deployment, origin verification, summary saving, gateway deployment, ingress credential synchronization, formal link verification, and deployment submission. Old tasks retain their original stage semantics.</p>
             * 
             * <strong>example:</strong>
             * <p>VALIDATE_ORIGIN</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>The status of the operation. Valid values: PENDING, RUNNING, SUCCEEDED, and FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the operation. The current valid value is PUBLISH.</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLISH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-19T08:30:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Operation build() {
                return new Operation(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class ActualConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backendMcpProtocol")
        private String backendMcpProtocol;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("protocolVersion")
        private String protocolVersion;

        @com.aliyun.core.annotation.NameInMap("sessionMode")
        private String sessionMode;

        private ActualConfiguration(Builder builder) {
            this.backendMcpProtocol = builder.backendMcpProtocol;
            this.protocol = builder.protocol;
            this.protocolVersion = builder.protocolVersion;
            this.sessionMode = builder.sessionMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActualConfiguration create() {
            return builder().build();
        }

        /**
         * @return backendMcpProtocol
         */
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return protocolVersion
         */
        public String getProtocolVersion() {
            return this.protocolVersion;
        }

        /**
         * @return sessionMode
         */
        public String getSessionMode() {
            return this.sessionMode;
        }

        public static final class Builder {
            private String backendMcpProtocol; 
            private String protocol; 
            private String protocolVersion; 
            private String sessionMode; 

            private Builder() {
            } 

            private Builder(ActualConfiguration model) {
                this.backendMcpProtocol = model.backendMcpProtocol;
                this.protocol = model.protocol;
                this.protocolVersion = model.protocolVersion;
                this.sessionMode = model.sessionMode;
            } 

            /**
             * <p>The verified legacy or modern backend MCP protocol policy. This field is empty if the policy is not confirmed.</p>
             * 
             * <strong>example:</strong>
             * <p>modern</p>
             */
            public Builder backendMcpProtocol(String backendMcpProtocol) {
                this.backendMcpProtocol = backendMcpProtocol;
                return this;
            }

            /**
             * <p>The verified SSE or StreamableHTTP transport. This field is empty if the transport is not confirmed.</p>
             * 
             * <strong>example:</strong>
             * <p>StreamableHTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The actual date version negotiated or selected and verified. This field is empty if the version is not confirmed.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-26</p>
             */
            public Builder protocolVersion(String protocolVersion) {
                this.protocolVersion = protocolVersion;
                return this;
            }

            /**
             * <p>The actual session mode. Valid values: STATEFUL, STATELESS, and NOT_APPLICABLE. This field is empty if the mode is not confirmed.</p>
             * 
             * <strong>example:</strong>
             * <p>STATELESS</p>
             */
            public Builder sessionMode(String sessionMode) {
                this.sessionMode = sessionMode;
                return this;
            }

            public ActualConfiguration build() {
                return new ActualConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class LastResultError extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("retryable")
        private Boolean retryable;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("stage")
        private String stage;

        private LastResultError(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.retryable = builder.retryable;
            this.source = builder.source;
            this.stage = builder.stage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastResultError create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return retryable
         */
        public Boolean getRetryable() {
            return this.retryable;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private Boolean retryable; 
            private String source; 
            private String stage; 

            private Builder() {
            } 

            private Builder(LastResultError model) {
                this.code = model.code;
                this.message = model.message;
                this.retryable = model.retryable;
                this.source = model.source;
                this.stage = model.stage;
            } 

            /**
             * <p>The bounded diagnostic code. Only bounded diagnostic codes are returned, and the original error body from the origin is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>PROBE_TIMEOUT</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The necessary diagnostics that are trimmed and desensitized. This message does not contain credentials or original responses.</p>
             * 
             * <strong>example:</strong>
             * <p>The probe deadline was exceeded.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the operation is suitable for retry based on a restricted policy. This field does not trigger automatic retries.</p>
             */
            public Builder retryable(Boolean retryable) {
                this.retryable = retryable;
                return this;
            }

            /**
             * <p>The source of the error. Valid values: MAGIC, ROUTER, NETWORK, ORIGIN, and UNKNOWN. The value is determined only based on actual evidence.</p>
             * 
             * <strong>example:</strong>
             * <p>UNKNOWN</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The detection or deployment stage where the error occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>INITIALIZE</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            public LastResultError build() {
                return new LastResultError(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class LastResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actualConfiguration")
        private ActualConfiguration actualConfiguration;

        @com.aliyun.core.annotation.NameInMap("error")
        private LastResultError error;

        @com.aliyun.core.annotation.NameInMap("probedAt")
        private String probedAt;

        @com.aliyun.core.annotation.NameInMap("stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private LastResult(Builder builder) {
            this.actualConfiguration = builder.actualConfiguration;
            this.error = builder.error;
            this.probedAt = builder.probedAt;
            this.stage = builder.stage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastResult create() {
            return builder().build();
        }

        /**
         * @return actualConfiguration
         */
        public ActualConfiguration getActualConfiguration() {
            return this.actualConfiguration;
        }

        /**
         * @return error
         */
        public LastResultError getError() {
            return this.error;
        }

        /**
         * @return probedAt
         */
        public String getProbedAt() {
            return this.probedAt;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private ActualConfiguration actualConfiguration; 
            private LastResultError error; 
            private String probedAt; 
            private String stage; 
            private String status; 

            private Builder() {
            } 

            private Builder(LastResult model) {
                this.actualConfiguration = model.actualConfiguration;
                this.error = model.error;
                this.probedAt = model.probedAt;
                this.stage = model.stage;
                this.status = model.status;
            } 

            /**
             * <p>The actual configuration confirmed by evidence in the current verification. This field is empty if no confirmed information is available and is not inferred from the expected configuration.</p>
             */
            public Builder actualConfiguration(ActualConfiguration actualConfiguration) {
                this.actualConfiguration = actualConfiguration;
                return this;
            }

            /**
             * <p>The verification error. This field is empty if the verification is successful. It saves only the desensitized diagnostics required for the current verification.</p>
             */
            public Builder error(LastResultError error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The time of the current origin verification, in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-19T08:30:00Z</p>
             */
            public Builder probedAt(String probedAt) {
                this.probedAt = probedAt;
                return this;
            }

            /**
             * <p>The verification stage. Valid values: CONNECT, DISCOVER, INITIALIZE, SESSION_CHECK, CLEANUP, and COMPLETE.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>The verification result. Valid values: SUCCESS and FAILED. A value of SUCCESS indicates that the protocol and applicable session checks have passed. Not declaring any capabilities does not affect the passing status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public LastResult build() {
                return new LastResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class OriginProbe extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("lastResult")
        private LastResult lastResult;

        private OriginProbe(Builder builder) {
            this.lastResult = builder.lastResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginProbe create() {
            return builder().build();
        }

        /**
         * @return lastResult
         */
        public LastResult getLastResult() {
            return this.lastResult;
        }

        public static final class Builder {
            private LastResult lastResult; 

            private Builder() {
            } 

            private Builder(OriginProbe model) {
                this.lastResult = model.lastResult;
            } 

            /**
             * <p>The result returned only for CODE_PACKAGE resources. This field is cleared when a new task starts and is empty if no verification has been performed or if an old task did not perform verification. If a subsequent deployment fails, this summary is retained, but it does not indicate real-time health or the active version status.</p>
             */
            public Builder lastResult(LastResult lastResult) {
                this.lastResult = lastResult;
                return this;
            }

            public OriginProbe build() {
                return new OriginProbe(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appliedTemplateVersion")
        private String appliedTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("latestTemplateVersion")
        private String latestTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("schemaVersion")
        private String schemaVersion;

        @com.aliyun.core.annotation.NameInMap("templateInputSchema")
        private String templateInputSchema;

        @com.aliyun.core.annotation.NameInMap("updateAvailable")
        private Boolean updateAvailable;

        private Template(Builder builder) {
            this.appliedTemplateVersion = builder.appliedTemplateVersion;
            this.latestTemplateVersion = builder.latestTemplateVersion;
            this.schemaVersion = builder.schemaVersion;
            this.templateInputSchema = builder.templateInputSchema;
            this.updateAvailable = builder.updateAvailable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return appliedTemplateVersion
         */
        public String getAppliedTemplateVersion() {
            return this.appliedTemplateVersion;
        }

        /**
         * @return latestTemplateVersion
         */
        public String getLatestTemplateVersion() {
            return this.latestTemplateVersion;
        }

        /**
         * @return schemaVersion
         */
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        /**
         * @return templateInputSchema
         */
        public String getTemplateInputSchema() {
            return this.templateInputSchema;
        }

        /**
         * @return updateAvailable
         */
        public Boolean getUpdateAvailable() {
            return this.updateAvailable;
        }

        public static final class Builder {
            private String appliedTemplateVersion; 
            private String latestTemplateVersion; 
            private String schemaVersion; 
            private String templateInputSchema; 
            private Boolean updateAvailable; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.appliedTemplateVersion = model.appliedTemplateVersion;
                this.latestTemplateVersion = model.latestTemplateVersion;
                this.schemaVersion = model.schemaVersion;
                this.templateInputSchema = model.templateInputSchema;
                this.updateAvailable = model.updateAvailable;
            } 

            /**
             * <p>The template version currently applied to the MCP.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder appliedTemplateVersion(String appliedTemplateVersion) {
                this.appliedTemplateVersion = appliedTemplateVersion;
                return this;
            }

            /**
             * <p>The latest template version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.0</p>
             */
            public Builder latestTemplateVersion(String latestTemplateVersion) {
                this.latestTemplateVersion = latestTemplateVersion;
                return this;
            }

            /**
             * <p>The template schema version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder schemaVersion(String schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            /**
             * <p>The template input schema, represented as a JSON Schema string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;addresses&quot;:{&quot;type&quot;:&quot;array&quot;,&quot;items&quot;:{&quot;type&quot;:&quot;string&quot;}}}}</p>
             */
            public Builder templateInputSchema(String templateInputSchema) {
                this.templateInputSchema = templateInputSchema;
                return this;
            }

            /**
             * <p>Indicates whether an updated template version is available.</p>
             */
            public Builder updateAvailable(Boolean updateAvailable) {
                this.updateAvailable = updateAvailable;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class SourcesTools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expectedDigest")
        private String expectedDigest;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private SourcesTools(Builder builder) {
            this.expectedDigest = builder.expectedDigest;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourcesTools create() {
            return builder().build();
        }

        /**
         * @return expectedDigest
         */
        public String getExpectedDigest() {
            return this.expectedDigest;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String expectedDigest; 
            private String name; 

            private Builder() {
            } 

            private Builder(SourcesTools model) {
                this.expectedDigest = model.expectedDigest;
                this.name = model.name;
            } 

            /**
             * <p>Required for virtual MCP. The definition digest obtained from the ListMcpTools operation or validation result of the source MCP. The client passes this value back as-is without calculating it. This value is used only as a baseline for manual update validation and does not freeze the runtime schema.</p>
             * 
             * <strong>example:</strong>
             * <p>e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855</p>
             */
            public Builder expectedDigest(String expectedDigest) {
                this.expectedDigest = expectedDigest;
                return this;
            }

            /**
             * <p>Required for virtual MCP. The name of the source tool.</p>
             * 
             * <strong>example:</strong>
             * <p>get-current-time</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SourcesTools build() {
                return new SourcesTools(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class VirtualConfigSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<SourcesTools> tools;

        private VirtualConfigSources(Builder builder) {
            this.mcpServerId = builder.mcpServerId;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualConfigSources create() {
            return builder().build();
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        /**
         * @return tools
         */
        public java.util.List<SourcesTools> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private String mcpServerId; 
            private java.util.List<SourcesTools> tools; 

            private Builder() {
            } 

            private Builder(VirtualConfigSources model) {
                this.mcpServerId = model.mcpServerId;
                this.tools = model.tools;
            } 

            /**
             * <p>Required for virtual MCP. The ID of the source MCP in the current workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-server-source-1</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * <p>Required for virtual MCP. The manually selected tools. Specify at least one tool for each source, and up to 100 tools in total across all sources.</p>
             */
            public Builder tools(java.util.List<SourcesTools> tools) {
                this.tools = tools;
                return this;
            }

            public VirtualConfigSources build() {
                return new VirtualConfigSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class VirtualConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sources")
        private java.util.List<VirtualConfigSources> sources;

        private VirtualConfig(Builder builder) {
            this.sources = builder.sources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualConfig create() {
            return builder().build();
        }

        /**
         * @return sources
         */
        public java.util.List<VirtualConfigSources> getSources() {
            return this.sources;
        }

        public static final class Builder {
            private java.util.List<VirtualConfigSources> sources; 

            private Builder() {
            } 

            private Builder(VirtualConfig model) {
                this.sources = model.sources;
            } 

            /**
             * <p>Required for virtual MCP. Specify 1 to 10 different source MCPs.</p>
             */
            public Builder sources(java.util.List<VirtualConfigSources> sources) {
                this.sources = sources;
                return this;
            }

            public VirtualConfig build() {
                return new VirtualConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcpResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addresses")
        private java.util.List<String> addresses;

        @com.aliyun.core.annotation.NameInMap("appliedRevision")
        private Long appliedRevision;

        @com.aliyun.core.annotation.NameInMap("appliedVirtualConfig")
        private AppliedVirtualConfig appliedVirtualConfig;

        @com.aliyun.core.annotation.NameInMap("auth")
        private Auth auth;

        @com.aliyun.core.annotation.NameInMap("backendMcpProtocol")
        private String backendMcpProtocol;

        @com.aliyun.core.annotation.NameInMap("customTags")
        private java.util.List<String> customTags;

        @com.aliyun.core.annotation.NameInMap("deploymentConfig")
        private DeploymentConfig deploymentConfig;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("functionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("marketSource")
        private MarketSource marketSource;

        @com.aliyun.core.annotation.NameInMap("mcpServerConfig")
        private String mcpServerConfig;

        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("officialTag")
        private String officialTag;

        @com.aliyun.core.annotation.NameInMap("operation")
        private Operation operation;

        @com.aliyun.core.annotation.NameInMap("operationTaskId")
        private String operationTaskId;

        @com.aliyun.core.annotation.NameInMap("originProbe")
        private OriginProbe originProbe;

        @com.aliyun.core.annotation.NameInMap("originProtocolVersion")
        private String originProtocolVersion;

        @com.aliyun.core.annotation.NameInMap("permissionMode")
        private String permissionMode;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("resolvedImageUri")
        private String resolvedImageUri;

        @com.aliyun.core.annotation.NameInMap("revision")
        private Long revision;

        @com.aliyun.core.annotation.NameInMap("sourceCount")
        private Integer sourceCount;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("statusReasonCode")
        private String statusReasonCode;

        @com.aliyun.core.annotation.NameInMap("swaggerConfig")
        private String swaggerConfig;

        @com.aliyun.core.annotation.NameInMap("template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("toolCount")
        private Integer toolCount;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("usageActive")
        private Boolean usageActive;

        @com.aliyun.core.annotation.NameInMap("virtualConfig")
        private VirtualConfig virtualConfig;

        private Data(Builder builder) {
            this.addresses = builder.addresses;
            this.appliedRevision = builder.appliedRevision;
            this.appliedVirtualConfig = builder.appliedVirtualConfig;
            this.auth = builder.auth;
            this.backendMcpProtocol = builder.backendMcpProtocol;
            this.customTags = builder.customTags;
            this.deploymentConfig = builder.deploymentConfig;
            this.description = builder.description;
            this.endpoint = builder.endpoint;
            this.functionName = builder.functionName;
            this.marketSource = builder.marketSource;
            this.mcpServerConfig = builder.mcpServerConfig;
            this.mcpServerId = builder.mcpServerId;
            this.name = builder.name;
            this.officialTag = builder.officialTag;
            this.operation = builder.operation;
            this.operationTaskId = builder.operationTaskId;
            this.originProbe = builder.originProbe;
            this.originProtocolVersion = builder.originProtocolVersion;
            this.permissionMode = builder.permissionMode;
            this.protocol = builder.protocol;
            this.resolvedImageUri = builder.resolvedImageUri;
            this.revision = builder.revision;
            this.sourceCount = builder.sourceCount;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.statusReasonCode = builder.statusReasonCode;
            this.swaggerConfig = builder.swaggerConfig;
            this.template = builder.template;
            this.toolCount = builder.toolCount;
            this.type = builder.type;
            this.usageActive = builder.usageActive;
            this.virtualConfig = builder.virtualConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return addresses
         */
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        /**
         * @return appliedRevision
         */
        public Long getAppliedRevision() {
            return this.appliedRevision;
        }

        /**
         * @return appliedVirtualConfig
         */
        public AppliedVirtualConfig getAppliedVirtualConfig() {
            return this.appliedVirtualConfig;
        }

        /**
         * @return auth
         */
        public Auth getAuth() {
            return this.auth;
        }

        /**
         * @return backendMcpProtocol
         */
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
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
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return marketSource
         */
        public MarketSource getMarketSource() {
            return this.marketSource;
        }

        /**
         * @return mcpServerConfig
         */
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return officialTag
         */
        public String getOfficialTag() {
            return this.officialTag;
        }

        /**
         * @return operation
         */
        public Operation getOperation() {
            return this.operation;
        }

        /**
         * @return operationTaskId
         */
        public String getOperationTaskId() {
            return this.operationTaskId;
        }

        /**
         * @return originProbe
         */
        public OriginProbe getOriginProbe() {
            return this.originProbe;
        }

        /**
         * @return originProtocolVersion
         */
        public String getOriginProtocolVersion() {
            return this.originProtocolVersion;
        }

        /**
         * @return permissionMode
         */
        public String getPermissionMode() {
            return this.permissionMode;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return resolvedImageUri
         */
        public String getResolvedImageUri() {
            return this.resolvedImageUri;
        }

        /**
         * @return revision
         */
        public Long getRevision() {
            return this.revision;
        }

        /**
         * @return sourceCount
         */
        public Integer getSourceCount() {
            return this.sourceCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return statusReasonCode
         */
        public String getStatusReasonCode() {
            return this.statusReasonCode;
        }

        /**
         * @return swaggerConfig
         */
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        /**
         * @return template
         */
        public Template getTemplate() {
            return this.template;
        }

        /**
         * @return toolCount
         */
        public Integer getToolCount() {
            return this.toolCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return usageActive
         */
        public Boolean getUsageActive() {
            return this.usageActive;
        }

        /**
         * @return virtualConfig
         */
        public VirtualConfig getVirtualConfig() {
            return this.virtualConfig;
        }

        public static final class Builder {
            private java.util.List<String> addresses; 
            private Long appliedRevision; 
            private AppliedVirtualConfig appliedVirtualConfig; 
            private Auth auth; 
            private String backendMcpProtocol; 
            private java.util.List<String> customTags; 
            private DeploymentConfig deploymentConfig; 
            private String description; 
            private String endpoint; 
            private String functionName; 
            private MarketSource marketSource; 
            private String mcpServerConfig; 
            private String mcpServerId; 
            private String name; 
            private String officialTag; 
            private Operation operation; 
            private String operationTaskId; 
            private OriginProbe originProbe; 
            private String originProtocolVersion; 
            private String permissionMode; 
            private String protocol; 
            private String resolvedImageUri; 
            private Long revision; 
            private Integer sourceCount; 
            private String status; 
            private String statusReason; 
            private String statusReasonCode; 
            private String swaggerConfig; 
            private Template template; 
            private Integer toolCount; 
            private String type; 
            private Boolean usageActive; 
            private VirtualConfig virtualConfig; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.addresses = model.addresses;
                this.appliedRevision = model.appliedRevision;
                this.appliedVirtualConfig = model.appliedVirtualConfig;
                this.auth = model.auth;
                this.backendMcpProtocol = model.backendMcpProtocol;
                this.customTags = model.customTags;
                this.deploymentConfig = model.deploymentConfig;
                this.description = model.description;
                this.endpoint = model.endpoint;
                this.functionName = model.functionName;
                this.marketSource = model.marketSource;
                this.mcpServerConfig = model.mcpServerConfig;
                this.mcpServerId = model.mcpServerId;
                this.name = model.name;
                this.officialTag = model.officialTag;
                this.operation = model.operation;
                this.operationTaskId = model.operationTaskId;
                this.originProbe = model.originProbe;
                this.originProtocolVersion = model.originProtocolVersion;
                this.permissionMode = model.permissionMode;
                this.protocol = model.protocol;
                this.resolvedImageUri = model.resolvedImageUri;
                this.revision = model.revision;
                this.sourceCount = model.sourceCount;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.statusReasonCode = model.statusReasonCode;
                this.swaggerConfig = model.swaggerConfig;
                this.template = model.template;
                this.toolCount = model.toolCount;
                this.type = model.type;
                this.usageActive = model.usageActive;
                this.virtualConfig = model.virtualConfig;
            } 

            /**
             * <p>The list of MCP service addresses.</p>
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The applied revision.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder appliedRevision(Long appliedRevision) {
                this.appliedRevision = appliedRevision;
                return this;
            }

            /**
             * <p>The applied source and tool selection.</p>
             */
            public Builder appliedVirtualConfig(AppliedVirtualConfig appliedVirtualConfig) {
                this.appliedVirtualConfig = appliedVirtualConfig;
                return this;
            }

            /**
             * <p>The backend authentication configuration. The enabled field indicates whether it is enabled. The directProxy field specifies custom authentication headers for the direct proxy. The httpToMcp field specifies the list of OpenAPI credentials for HTTP_TO_MCP.</p>
             */
            public Builder auth(Auth auth) {
                this.auth = auth;
                return this;
            }

            /**
             * <p>The saved legacy or modern backend policy. This policy is separate from the transport indicated by the protocol field and does not indicate verification. This field is not saved for newly created CODE_PACKAGE resources. For historical CODE_PACKAGE resources, the saved value does not control Function Compute session affinity or the gateway protocol. For the actual protocol, refer to OriginProbe.LastResult.ActualConfiguration.BackendMcpProtocol. This field returns null for historically unspecified values and HTTP_TO_MCP scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>modern</p>
             */
            public Builder backendMcpProtocol(String backendMcpProtocol) {
                this.backendMcpProtocol = backendMcpProtocol;
                return this;
            }

            /**
             * <p>The custom tags. Multiple tags are supported.</p>
             */
            public Builder customTags(java.util.List<String> customTags) {
                this.customTags = customTags;
                return this;
            }

            /**
             * <p>The deployment configuration for the code deployment MCP.</p>
             */
            public Builder deploymentConfig(DeploymentConfig deploymentConfig) {
                this.deploymentConfig = deploymentConfig;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>A sample description to illustrate the purpose of the resource</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The MCP endpoint that can be invoked by users or agents. This field is empty before deployment is complete.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/mcp">https://example.com/mcp</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The name of the Function Compute function corresponding to the CODE_PACKAGE MCP. This field is empty before deployment is complete or for other types.</p>
             * 
             * <strong>example:</strong>
             * <p>agentcore-mcp-example</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>The MCP source marketplace template.</p>
             */
            public Builder marketSource(MarketSource marketSource) {
                this.marketSource = marketSource;
                return this;
            }

            /**
             * <p>The MCP server configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;}</p>
             */
            public Builder mcpServerConfig(String mcpServerConfig) {
                this.mcpServerConfig = mcpServerConfig;
                return this;
            }

            /**
             * <p>The MCP service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-1234567890abcdef</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
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
             * <p>The official purpose tag managed by the server.</p>
             * 
             * <strong>example:</strong>
             * <p>KNOWLEDGE_BASE</p>
             */
            public Builder officialTag(String officialTag) {
                this.officialTag = officialTag;
                return this;
            }

            /**
             * <p>The read-only progress that reuses an existing deployment task. This field does not change the primary status of the resource and is empty if no historical operation information is available.</p>
             */
            public Builder operation(Operation operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The ID of the most recent virtual MCP publish task, which can be used to query and locate asynchronous publish results.</p>
             * 
             * <strong>example:</strong>
             * <p>task-1234567890</p>
             */
            public Builder operationTaskId(String operationTaskId) {
                this.operationTaskId = operationTaskId;
                return this;
            }

            /**
             * <p>The minimal origin verification summary of the most recent task, returned only for code deployments. This field is empty for direct connections and HTTP-to-MCP scenarios. Querying this field does not trigger probing.</p>
             */
            public Builder originProbe(OriginProbe originProbe) {
                this.originProbe = originProbe;
                return this;
            }

            /**
             * <p>The optional saved display metadata for the origin MCP protocol date, in YYYY-MM-DD format. You can specify this field during creation and modify it during updates. If omitted during an update, the current value is retained. This field is used only for saving and displaying information. It is not a software version, does not restrict the external gateway protocol, does not control backend requests, and does not indicate that real-time verification has passed. This field returns null if it is omitted during creation and never updated, missing historically, or used in HTTP_TO_MCP scenarios. No default value is provided.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-26</p>
             */
            public Builder originProtocolVersion(String originProtocolVersion) {
                this.originProtocolVersion = originProtocolVersion;
                return this;
            }

            /**
             * <p>The access permission mode. PUBLIC indicates public access, and CONTROLLED indicates that access is controlled based on permission rules.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTROLLED</p>
             */
            public Builder permissionMode(String permissionMode) {
                this.permissionMode = permissionMode;
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
             * <p>Read-only. Records the image URI and digest read from Function Compute for the current active deployment. The deployment still uses the tag in deploymentConfig.containerConfiguration.image. This field is not used as a deployment input parameter. It is empty when the deployment is not yet active or the image digest is not obtained.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.example.com/mcp@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
             */
            public Builder resolvedImageUri(String resolvedImageUri) {
                this.resolvedImageUri = resolvedImageUri;
                return this;
            }

            /**
             * <p>The target revision.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder revision(Long revision) {
                this.revision = revision;
                return this;
            }

            /**
             * <p>The number of selected sources.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder sourceCount(Integer sourceCount) {
                this.sourceCount = sourceCount;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Resource processing completed</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The security reason code for the virtual MCP publish failure.</p>
             * 
             * <strong>example:</strong>
             * <p>PublishFailed</p>
             */
            public Builder statusReasonCode(String statusReasonCode) {
                this.statusReasonCode = statusReasonCode;
                return this;
            }

            /**
             * <p>The Swagger configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;}</p>
             */
            public Builder swaggerConfig(String swaggerConfig) {
                this.swaggerConfig = swaggerConfig;
                return this;
            }

            /**
             * <p>The template version and input schema bound to the MCP.</p>
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The number of selected tools.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder toolCount(Integer toolCount) {
                this.toolCount = toolCount;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Indicates whether the MCP is still subject to the usage constraints of the official template.</p>
             */
            public Builder usageActive(Boolean usageActive) {
                this.usageActive = usageActive;
                return this;
            }

            /**
             * <p>The target source and tool selection.</p>
             */
            public Builder virtualConfig(VirtualConfig virtualConfig) {
                this.virtualConfig = virtualConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
