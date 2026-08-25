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
 * {@link DeleteCredentialRequest} extends {@link RequestModel}
 *
 * <p>DeleteCredentialRequest</p>
 */
public class DeleteCredentialRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("credentialId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private DeleteCredentialRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.credentialId = builder.credentialId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCredentialRequest create() {
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
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DeleteCredentialRequest, Builder> {
        private String workspaceId; 
        private String credentialId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCredentialRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.credentialId = request.credentialId;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-123456</p>
         */
        public Builder credentialId(String credentialId) {
            this.putPathParameter("credentialId", credentialId);
            this.credentialId = credentialId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public DeleteCredentialRequest build() {
            return new DeleteCredentialRequest(this);
        } 

    } 

}
