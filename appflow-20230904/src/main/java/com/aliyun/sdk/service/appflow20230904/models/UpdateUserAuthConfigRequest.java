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
 * {@link UpdateUserAuthConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserAuthConfigRequest</p>
 */
public class UpdateUserAuthConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthConfig")
    private String authConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authConfigId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthConfigName")
    private String authConfigName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorVersion")
    private String connectorVersion;

    private UpdateUserAuthConfigRequest(Builder builder) {
        super(builder);
        this.authConfig = builder.authConfig;
        this.authConfigId = builder.authConfigId;
        this.authConfigName = builder.authConfigName;
        this.connectorId = builder.connectorId;
        this.connectorVersion = builder.connectorVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserAuthConfigRequest create() {
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
     * @return authConfigId
     */
    public String getAuthConfigId() {
        return this.authConfigId;
    }

    /**
     * @return authConfigName
     */
    public String getAuthConfigName() {
        return this.authConfigName;
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

    public static final class Builder extends Request.Builder<UpdateUserAuthConfigRequest, Builder> {
        private String authConfig; 
        private String authConfigId; 
        private String authConfigName; 
        private String connectorId; 
        private String connectorVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserAuthConfigRequest request) {
            super(request);
            this.authConfig = request.authConfig;
            this.authConfigId = request.authConfigId;
            this.authConfigName = request.authConfigName;
            this.connectorId = request.connectorId;
            this.connectorVersion = request.connectorVersion;
        } 

        /**
         * AuthConfig.
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
         * <p>uac-42b60d53bcce466d9d08</p>
         */
        public Builder authConfigId(String authConfigId) {
            this.putQueryParameter("AuthConfigId", authConfigId);
            this.authConfigId = authConfigId;
            return this;
        }

        /**
         * AuthConfigName.
         */
        public Builder authConfigName(String authConfigName) {
            this.putQueryParameter("AuthConfigName", authConfigName);
            this.authConfigName = authConfigName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-6b8df2297dca4a5f8f15</p>
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
        public UpdateUserAuthConfigRequest build() {
            return new UpdateUserAuthConfigRequest(this);
        } 

    } 

}
