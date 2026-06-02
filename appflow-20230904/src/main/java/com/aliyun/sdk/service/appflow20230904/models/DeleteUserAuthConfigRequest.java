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
 * {@link DeleteUserAuthConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserAuthConfigRequest</p>
 */
public class DeleteUserAuthConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authConfigId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorVersion")
    private String connectorVersion;

    private DeleteUserAuthConfigRequest(Builder builder) {
        super(builder);
        this.authConfigId = builder.authConfigId;
        this.connectorId = builder.connectorId;
        this.connectorVersion = builder.connectorVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserAuthConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConfigId
     */
    public String getAuthConfigId() {
        return this.authConfigId;
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

    public static final class Builder extends Request.Builder<DeleteUserAuthConfigRequest, Builder> {
        private String authConfigId; 
        private String connectorId; 
        private String connectorVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserAuthConfigRequest request) {
            super(request);
            this.authConfigId = request.authConfigId;
            this.connectorId = request.connectorId;
            this.connectorVersion = request.connectorVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uac-8f4bfe29041441d8bdd9</p>
         */
        public Builder authConfigId(String authConfigId) {
            this.putQueryParameter("AuthConfigId", authConfigId);
            this.authConfigId = authConfigId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-5e43ef26b53e4a158529</p>
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
        public DeleteUserAuthConfigRequest build() {
            return new DeleteUserAuthConfigRequest(this);
        } 

    } 

}
