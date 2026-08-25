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
 * {@link GetCredentialRequest} extends {@link RequestModel}
 *
 * <p>GetCredentialRequest</p>
 */
public class GetCredentialRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("credentialId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialId;

    private GetCredentialRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.credentialId = builder.credentialId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialRequest create() {
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

    public static final class Builder extends Request.Builder<GetCredentialRequest, Builder> {
        private String workspaceId; 
        private String credentialId; 

        private Builder() {
            super();
        } 

        private Builder(GetCredentialRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.credentialId = request.credentialId;
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

        @Override
        public GetCredentialRequest build() {
            return new GetCredentialRequest(this);
        } 

    } 

}
