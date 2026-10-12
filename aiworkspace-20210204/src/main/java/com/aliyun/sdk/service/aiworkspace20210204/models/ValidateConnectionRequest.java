// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ValidateConnectionRequest} extends {@link RequestModel}
 *
 * <p>ValidateConnectionRequest</p>
 */
public class ValidateConnectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.Map<String, String> configs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    private String connectionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionType")
    private String connectionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Secrets")
    private java.util.Map<String, String> secrets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidateType")
    private String validateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ValidateConnectionRequest(Builder builder) {
        super(builder);
        this.configs = builder.configs;
        this.connectionId = builder.connectionId;
        this.connectionType = builder.connectionType;
        this.secrets = builder.secrets;
        this.validateType = builder.validateType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.Map<String, String> getConfigs() {
        return this.configs;
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return connectionType
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * @return secrets
     */
    public java.util.Map<String, String> getSecrets() {
        return this.secrets;
    }

    /**
     * @return validateType
     */
    public String getValidateType() {
        return this.validateType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ValidateConnectionRequest, Builder> {
        private java.util.Map<String, String> configs; 
        private String connectionId; 
        private String connectionType; 
        private java.util.Map<String, String> secrets; 
        private String validateType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ValidateConnectionRequest request) {
            super(request);
            this.configs = request.configs;
            this.connectionId = request.connectionId;
            this.connectionType = request.connectionType;
            this.secrets = request.secrets;
            this.validateType = request.validateType;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The configuration of the connection, specified as key-value pairs. The configuration keys vary by connection type. For more information, see the supplementary information about the request parameters of the CreateConnection operation.</p>
         */
        public Builder configs(java.util.Map<String, String> configs) {
            this.putBodyParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * <p>The connection ID. For more information about how to obtain the connection ID, see <a href="url">ListConnections</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>conn-x2wz5zvvbyf2420fi9</p>
         */
        public Builder connectionId(String connectionId) {
            this.putBodyParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * <p>The connection type. Only connection types that support public network access are available. Valid values:</p>
         * <ul>
         * <li><p>DashScopeConnection: a service connection for Alibaba Cloud Model Studio.</p>
         * </li>
         * <li><p>DeepSeekConnection: a service connection for DeepSeek.</p>
         * </li>
         * <li><p>FunctionAIMCPConnection: a connection for Function AI MCP.</p>
         * </li>
         * <li><p>CustomMCPConnection: a custom MCP connection.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DashScopeConnection</p>
         */
        public Builder connectionType(String connectionType) {
            this.putBodyParameter("ConnectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * <p>The key-value pairs to encrypt, such as a database logon password or a model connection key.</p>
         */
        public Builder secrets(java.util.Map<String, String> secrets) {
            this.putBodyParameter("Secrets", secrets);
            this.secrets = secrets;
            return this;
        }

        /**
         * <p>The validation type. Set the value to:</p>
         * <ul>
         * <li>Connectivity: a connectivity test</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connectivity</p>
         */
        public Builder validateType(String validateType) {
            this.putBodyParameter("ValidateType", validateType);
            this.validateType = validateType;
            return this;
        }

        /**
         * <p>The workspace ID. For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ValidateConnectionRequest build() {
            return new ValidateConnectionRequest(this);
        } 

    } 

}
