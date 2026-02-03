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
         * Configs.
         */
        public Builder configs(java.util.Map<String, String> configs) {
            this.putBodyParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * ConnectionId.
         */
        public Builder connectionId(String connectionId) {
            this.putBodyParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * ConnectionType.
         */
        public Builder connectionType(String connectionType) {
            this.putBodyParameter("ConnectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * Secrets.
         */
        public Builder secrets(java.util.Map<String, String> secrets) {
            this.putBodyParameter("Secrets", secrets);
            this.secrets = secrets;
            return this;
        }

        /**
         * ValidateType.
         */
        public Builder validateType(String validateType) {
            this.putBodyParameter("ValidateType", validateType);
            this.validateType = validateType;
            return this;
        }

        /**
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
