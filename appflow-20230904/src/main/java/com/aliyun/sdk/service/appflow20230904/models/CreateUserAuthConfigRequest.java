// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904.models;

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
 * {@link CreateUserAuthConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateUserAuthConfigRequest</p>
 */
public class CreateUserAuthConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthConfigName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authConfigName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorVersion")
    private String connectorVersion;

    private CreateUserAuthConfigRequest(Builder builder) {
        super(builder);
        this.authConfig = builder.authConfig;
        this.authConfigName = builder.authConfigName;
        this.authType = builder.authType;
        this.connectorId = builder.connectorId;
        this.connectorVersion = builder.connectorVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserAuthConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConfig
     */
    public String getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return authConfigName
     */
    public String getAuthConfigName() {
        return this.authConfigName;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * @return connectorVersion
     */
    public String getConnectorVersion() {
        return this.connectorVersion;
    }

    public static final class Builder extends Request.Builder<CreateUserAuthConfigRequest, Builder> {
        private String authConfig; 
        private String authConfigName; 
        private String authType; 
        private String connectorId; 
        private String connectorVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserAuthConfigRequest request) {
            super(request);
            this.authConfig = request.authConfig;
            this.authConfigName = request.authConfigName;
            this.authType = request.authType;
            this.connectorId = request.connectorId;
            this.connectorVersion = request.connectorVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder authConfig(String authConfig) {
            this.putQueryParameter("AuthConfig", authConfig);
            this.authConfig = authConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian-01ce5586-420f-4cbf-9392-7001a1c33bc1</p>
         */
        public Builder authConfigName(String authConfigName) {
            this.putQueryParameter("AuthConfigName", authConfigName);
            this.authConfigName = authConfigName;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-3c60c6e123e146fbb6f8</p>
         */
        public Builder connectorId(String connectorId) {
            this.putQueryParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        /**
         * ConnectorVersion.
         */
        public Builder connectorVersion(String connectorVersion) {
            this.putQueryParameter("ConnectorVersion", connectorVersion);
            this.connectorVersion = connectorVersion;
            return this;
        }

        @Override
        public CreateUserAuthConfigRequest build() {
            return new CreateUserAuthConfigRequest(this);
        } 

    } 

}
