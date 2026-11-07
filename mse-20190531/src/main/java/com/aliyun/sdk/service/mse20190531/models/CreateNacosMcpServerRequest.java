// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link CreateNacosMcpServerRequest} extends {@link RequestModel}
 *
 * <p>CreateNacosMcpServerRequest</p>
 */
public class CreateNacosMcpServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptToolSpec")
    private Boolean encryptToolSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndpointSpecification")
    private String endpointSpecification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerName")
    private String serverName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerSpecification")
    private String serverSpecification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToolSpecification")
    private String toolSpecification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("YamlConfig")
    private String yamlConfig;

    private CreateNacosMcpServerRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.encryptToolSpec = builder.encryptToolSpec;
        this.endpointSpecification = builder.endpointSpecification;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.serverName = builder.serverName;
        this.serverSpecification = builder.serverSpecification;
        this.toolSpecification = builder.toolSpecification;
        this.yamlConfig = builder.yamlConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNacosMcpServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return encryptToolSpec
     */
    public Boolean getEncryptToolSpec() {
        return this.encryptToolSpec;
    }

    /**
     * @return endpointSpecification
     */
    public String getEndpointSpecification() {
        return this.endpointSpecification;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return serverName
     */
    public String getServerName() {
        return this.serverName;
    }

    /**
     * @return serverSpecification
     */
    public String getServerSpecification() {
        return this.serverSpecification;
    }

    /**
     * @return toolSpecification
     */
    public String getToolSpecification() {
        return this.toolSpecification;
    }

    /**
     * @return yamlConfig
     */
    public String getYamlConfig() {
        return this.yamlConfig;
    }

    public static final class Builder extends Request.Builder<CreateNacosMcpServerRequest, Builder> {
        private String acceptLanguage; 
        private Boolean encryptToolSpec; 
        private String endpointSpecification; 
        private String instanceId; 
        private String namespaceId; 
        private String serverName; 
        private String serverSpecification; 
        private String toolSpecification; 
        private String yamlConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateNacosMcpServerRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.encryptToolSpec = request.encryptToolSpec;
            this.endpointSpecification = request.endpointSpecification;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.serverName = request.serverName;
            this.serverSpecification = request.serverSpecification;
            this.toolSpecification = request.toolSpecification;
            this.yamlConfig = request.yamlConfig;
        } 

        /**
         * <p>The language of the response. Valid values: zh (Chinese, default) and en (English).</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to encrypt the MCP tool specification. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Encrypts the specification.</li>
         * <li><code>false</code>: Does not encrypt the specification. This is the default value.</li>
         * </ul>
         */
        public Builder encryptToolSpec(Boolean encryptToolSpec) {
            this.putQueryParameter("EncryptToolSpec", encryptToolSpec);
            this.encryptToolSpec = encryptToolSpec;
            return this;
        }

        /**
         * <p>The JSON string of the endpoint specification.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;REF&quot;,&quot;data&quot;:{&quot;namespaceId&quot;:&quot;public&quot;,&quot;groupName&quot;:&quot;mcp-endpoints&quot;,&quot;serviceName&quot;:&quot;mcp-demo&quot;}}</p>
         */
        public Builder endpointSpecification(String endpointSpecification) {
            this.putBodyParameter("EndpointSpecification", endpointSpecification);
            this.endpointSpecification = endpointSpecification;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-st21ri2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-demo</p>
         */
        public Builder serverName(String serverName) {
            this.putQueryParameter("ServerName", serverName);
            this.serverName = serverName;
            return this;
        }

        /**
         * <p>The JSON string of the server specification.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;description&quot;:&quot;a mcp demo service&quot;,&quot;capabilities&quot;:[],&quot;allVersions&quot;:[{&quot;version&quot;:&quot;1.0.0&quot;,&quot;release_date&quot;:&quot;2025-08-13T01:58:42Z&quot;,&quot;is_latest&quot;:true}],&quot;remoteServerConfig&quot;:{&quot;exportPath&quot;:&quot;/sse&quot;},&quot;enabled&quot;:true,&quot;versionDetail&quot;:{&quot;version&quot;:&quot;1.0.1&quot;},&quot;backendEndpoints&quot;:[{&quot;path&quot;:&quot;/sse&quot;,&quot;address&quot;:&quot;127.0.0.1&quot;,&quot;port&quot;:8080}],&quot;protocol&quot;:&quot;mcp-sse&quot;,&quot;name&quot;:&quot;mcp-demo&quot;,&quot;frontProtocol&quot;:&quot;mcp-sse&quot;}</p>
         */
        public Builder serverSpecification(String serverSpecification) {
            this.putBodyParameter("ServerSpecification", serverSpecification);
            this.serverSpecification = serverSpecification;
            return this;
        }

        /**
         * <p>The JSON string of the tool specification.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tools&quot;:[{&quot;name&quot;:&quot;demo-tool&quot;,&quot;description&quot;:&quot;a demo tool&quot;,&quot;inputSchema&quot;:{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;name&quot;:{&quot;type&quot;:&quot;string&quot;,&quot;description&quot;:&quot;name&quot;}}}}],&quot;toolsMeta&quot;:{&quot;demo-tool&quot;:{&quot;enabled&quot;:true}}}</p>
         */
        public Builder toolSpecification(String toolSpecification) {
            this.putBodyParameter("ToolSpecification", toolSpecification);
            this.toolSpecification = toolSpecification;
            return this;
        }

        /**
         * <p>The YAML configuration of the AI gateway. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>allowTools:</p>
         * <ul>
         * <li>demo-tool
         * securityScheme: {}
         * server:
         * name: mcp-demo
         * tools:</li>
         * <li>args:<ul>
         * <li>name: name
         * description: name
         * type: string
         * description: a demo tool
         * name: demo-tool</li>
         * </ul>
         * </li>
         * </ul>
         */
        public Builder yamlConfig(String yamlConfig) {
            this.putBodyParameter("YamlConfig", yamlConfig);
            this.yamlConfig = yamlConfig;
            return this;
        }

        @Override
        public CreateNacosMcpServerRequest build() {
            return new CreateNacosMcpServerRequest(this);
        } 

    } 

}
