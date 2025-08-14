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
            this.endpointSpecification = request.endpointSpecification;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.serverName = request.serverName;
            this.serverSpecification = request.serverSpecification;
            this.toolSpecification = request.toolSpecification;
            this.yamlConfig = request.yamlConfig;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * EndpointSpecification.
         */
        public Builder endpointSpecification(String endpointSpecification) {
            this.putBodyParameter("EndpointSpecification", endpointSpecification);
            this.endpointSpecification = endpointSpecification;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * ServerName.
         */
        public Builder serverName(String serverName) {
            this.putQueryParameter("ServerName", serverName);
            this.serverName = serverName;
            return this;
        }

        /**
         * ServerSpecification.
         */
        public Builder serverSpecification(String serverSpecification) {
            this.putBodyParameter("ServerSpecification", serverSpecification);
            this.serverSpecification = serverSpecification;
            return this;
        }

        /**
         * ToolSpecification.
         */
        public Builder toolSpecification(String toolSpecification) {
            this.putBodyParameter("ToolSpecification", toolSpecification);
            this.toolSpecification = toolSpecification;
            return this;
        }

        /**
         * YamlConfig.
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
