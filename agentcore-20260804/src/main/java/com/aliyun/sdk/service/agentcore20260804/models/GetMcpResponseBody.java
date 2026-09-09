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
 * {@link GetMcpResponseBody} extends {@link TeaModel}
 *
 * <p>GetMcpResponseBody</p>
 */
public class GetMcpResponseBody extends TeaModel {
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

    private GetMcpResponseBody(Builder builder) {
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

    public static GetMcpResponseBody create() {
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

        private Builder(GetMcpResponseBody model) {
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
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMcpResponseBody build() {
            return new GetMcpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMcpResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpResponseBody</p>
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
     * {@link GetMcpResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpResponseBody</p>
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
     * {@link GetMcpResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpResponseBody</p>
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
             * <p>Indicates whether authentication is enabled.</p>
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
     * {@link GetMcpResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addresses")
        private java.util.List<String> addresses;

        @com.aliyun.core.annotation.NameInMap("auth")
        private Auth auth;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("mcpServerConfig")
        private String mcpServerConfig;

        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("swaggerConfig")
        private String swaggerConfig;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Data(Builder builder) {
            this.addresses = builder.addresses;
            this.auth = builder.auth;
            this.description = builder.description;
            this.mcpServerConfig = builder.mcpServerConfig;
            this.mcpServerId = builder.mcpServerId;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.swaggerConfig = builder.swaggerConfig;
            this.type = builder.type;
            this.url = builder.url;
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
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
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

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.List<String> addresses; 
            private Auth auth; 
            private String description; 
            private String mcpServerConfig; 
            private String mcpServerId; 
            private String name; 
            private String protocol; 
            private String status; 
            private String statusReason; 
            private String swaggerConfig; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.addresses = model.addresses;
                this.auth = model.auth;
                this.description = model.description;
                this.mcpServerConfig = model.mcpServerConfig;
                this.mcpServerId = model.mcpServerId;
                this.name = model.name;
                this.protocol = model.protocol;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.swaggerConfig = model.swaggerConfig;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * <p>The list of MCP service addresses.</p>
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The backend authentication configuration. enabled indicates whether authentication is enabled. directProxy specifies the custom authentication header for direct proxy. httpToMcp specifies the list of OpenAPI credentials for HTTP_TO_MCP.</p>
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
             * <p>The MCP service access URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/artifacts/example.zip">https://example.com/artifacts/example.zip</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
