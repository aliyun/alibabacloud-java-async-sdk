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
 * {@link ProbeMcpOriginRequest} extends {@link RequestModel}
 *
 * <p>ProbeMcpOriginRequest</p>
 */
public class ProbeMcpOriginRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private ProbeMcpOriginRequestBody body;

    private ProbeMcpOriginRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProbeMcpOriginRequest create() {
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
    public ProbeMcpOriginRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ProbeMcpOriginRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private ProbeMcpOriginRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(ProbeMcpOriginRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.body = request.body;
        } 

        /**
         * <p>The workspace to which the probe permissions, region, and network context belong.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-id</p>
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
         * <p>The scope of the origin server configuration must not exceed that of the creation interface. The control fields for this validation only restrict the validation scope and do not extend the origin server access configuration.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(ProbeMcpOriginRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public ProbeMcpOriginRequest build() {
            return new ProbeMcpOriginRequest(this);
        } 

    } 

    /**
     * 
     * {@link ProbeMcpOriginRequest} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginRequest</p>
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
             * <p>The name of the backend authentication header.</p>
             * 
             * <strong>example:</strong>
             * <p>Authorization</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the backend authentication header.</p>
             * 
             * <strong>example:</strong>
             * <p>example-api-key</p>
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
     * {@link ProbeMcpOriginRequest} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginRequest</p>
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
             * <p>The credential for the backend authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>example-api-key</p>
             */
            public Builder credential(String credential) {
                this.credential = credential;
                return this;
            }

            /**
             * <p>The ID of the backend authentication configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>api-key-auth</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the API key parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>X-API-Key</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The location where the API key is passed.</p>
             * 
             * <strong>example:</strong>
             * <p>header</p>
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * <p>The type of the backend authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>apiKey</p>
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
     * {@link ProbeMcpOriginRequest} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginRequest</p>
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
             * <p>The backend authentication configuration for the direct proxy.</p>
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
             * <p>The list of backend authentication configurations for HTTP-to-MCP.</p>
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
     * {@link ProbeMcpOriginRequest} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginRequest</p>
     */
    public static class ProbeMcpOriginRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        @com.aliyun.core.annotation.Validation(required = true)
        private String address;

        @com.aliyun.core.annotation.NameInMap("auth")
        private Auth auth;

        @com.aliyun.core.annotation.NameInMap("swaggerConfig")
        private String swaggerConfig;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private ProbeMcpOriginRequestBody(Builder builder) {
            this.address = builder.address;
            this.auth = builder.auth;
            this.swaggerConfig = builder.swaggerConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProbeMcpOriginRequestBody create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return auth
         */
        public Auth getAuth() {
            return this.auth;
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
            private String address; 
            private Auth auth; 
            private String swaggerConfig; 
            private String type; 

            private Builder() {
            } 

            private Builder(ProbeMcpOriginRequestBody model) {
                this.address = model.address;
                this.auth = model.auth;
                this.swaggerConfig = model.swaggerConfig;
                this.type = model.type;
            } 

            /**
             * <p>A single HTTP(S) URL that reuses the addresses of the origin server used during creation. Embedded credentials, batch addresses, or protected targets are not accepted.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://mcp.example.com/mcp">https://mcp.example.com/mcp</a></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Reuses the enabled, directProxy, and httpToMcp origin server authentication fields and validations from the creation interface. When enabled is set to true, you must provide a configuration that matches the access type. codePackage or additional headers are not accepted.</p>
             */
            public Builder auth(Auth auth) {
                this.auth = auth;
                return this;
            }

            /**
             * <p>Applicable only to HTTP. Reuses the JSON or YAML string semantics from the creation interface. This field is required when validating the definition. Remote documents or references are not automatically fetched.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;openapi&quot;:&quot;3.0.3&quot;,&quot;info&quot;:{&quot;title&quot;:&quot;Inventory API&quot;,&quot;version&quot;:&quot;1.0.0&quot;},&quot;paths&quot;:{&quot;/inventory&quot;:{&quot;get&quot;:{&quot;operationId&quot;:&quot;listInventory&quot;,&quot;responses&quot;:{&quot;200&quot;:{&quot;description&quot;:&quot;OK&quot;}}}}}}</p>
             */
            public Builder swaggerConfig(String swaggerConfig) {
                this.swaggerConfig = swaggerConfig;
                return this;
            }

            /**
             * <p>Valid values: DIRECT_PROXY or HTTP_TO_MCP. CODE_PACKAGE is not accepted.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DIRECT_PROXY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ProbeMcpOriginRequestBody build() {
                return new ProbeMcpOriginRequestBody(this);
            } 

        } 

    }
}
