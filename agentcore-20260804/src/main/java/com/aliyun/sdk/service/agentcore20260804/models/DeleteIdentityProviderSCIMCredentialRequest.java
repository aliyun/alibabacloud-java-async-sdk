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
 * {@link DeleteIdentityProviderSCIMCredentialRequest} extends {@link RequestModel}
 *
 * <p>DeleteIdentityProviderSCIMCredentialRequest</p>
 */
public class DeleteIdentityProviderSCIMCredentialRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("credentialId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialId;

    private DeleteIdentityProviderSCIMCredentialRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.credentialId = builder.credentialId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIdentityProviderSCIMCredentialRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteIdentityProviderSCIMCredentialRequest, Builder> {
        private String workspaceId; 
        private String credentialId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIdentityProviderSCIMCredentialRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.credentialId = request.credentialId;
        } 

        /**
         * <p>Required. The ID of the target workspace. The request region must be the same as the region of the target workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-example</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>Required. The ID of the credential to delete. Use the ID returned in the credential list instead of the plaintext token.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>credential-example</p>
         */
        public Builder credentialId(String credentialId) {
            this.putPathParameter("credentialId", credentialId);
            this.credentialId = credentialId;
            return this;
        }

        @Override
        public DeleteIdentityProviderSCIMCredentialRequest build() {
            return new DeleteIdentityProviderSCIMCredentialRequest(this);
        } 

    } 

}
