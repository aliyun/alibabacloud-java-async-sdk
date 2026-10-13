// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link UpdateContextDatabaseSyncConnectionCredentialRequest} extends {@link RequestModel}
 *
 * <p>UpdateContextDatabaseSyncConnectionCredentialRequest</p>
 */
public class UpdateContextDatabaseSyncConnectionCredentialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Credentials")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> credentials;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateContextDatabaseSyncConnectionCredentialRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.connectionId = builder.connectionId;
        this.credentials = builder.credentials;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContextDatabaseSyncConnectionCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return credentials
     */
    public java.util.Map<String, ?> getCredentials() {
        return this.credentials;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateContextDatabaseSyncConnectionCredentialRequest, Builder> {
        private String clientToken; 
        private String connectionId; 
        private java.util.Map<String, ?> credentials; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContextDatabaseSyncConnectionCredentialRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.connectionId = request.connectionId;
            this.credentials = request.credentials;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder connectionId(String connectionId) {
            this.putQueryParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appKey&quot;:&quot;dingas1llqmkol****&quot;,&quot;appSecret&quot;:&quot;******&quot;}</p>
         */
        public Builder credentials(java.util.Map<String, ?> credentials) {
            String credentialsShrink = shrink(credentials, "Credentials", "json");
            this.putQueryParameter("Credentials", credentialsShrink);
            this.credentials = credentials;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-as1llqmkol****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateContextDatabaseSyncConnectionCredentialRequest build() {
            return new UpdateContextDatabaseSyncConnectionCredentialRequest(this);
        } 

    } 

}
