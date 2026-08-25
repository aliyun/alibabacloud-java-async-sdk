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
 * {@link UpdateCredentialRequest} extends {@link RequestModel}
 *
 * <p>UpdateCredentialRequest</p>
 */
public class UpdateCredentialRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("credentialId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateCredentialRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateCredentialRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.credentialId = builder.credentialId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCredentialRequest create() {
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
     * @return body
     */
    public UpdateCredentialRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateCredentialRequest, Builder> {
        private String workspaceId; 
        private String credentialId; 
        private UpdateCredentialRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCredentialRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.credentialId = request.credentialId;
            this.body = request.body;
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
         * body.
         */
        public Builder body(UpdateCredentialRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
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
        public UpdateCredentialRequest build() {
            return new UpdateCredentialRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateCredentialRequest</p>
     */
    public static class UpdateCredentialRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credentialMetadata")
        private String credentialMetadata;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        private UpdateCredentialRequestBody(Builder builder) {
            this.credentialMetadata = builder.credentialMetadata;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCredentialRequestBody create() {
            return builder().build();
        }

        /**
         * @return credentialMetadata
         */
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String credentialMetadata; 
            private String description; 

            private Builder() {
            } 

            private Builder(UpdateCredentialRequestBody model) {
                this.credentialMetadata = model.credentialMetadata;
                this.description = model.description;
            } 

            /**
             * credentialMetadata.
             */
            public Builder credentialMetadata(String credentialMetadata) {
                this.credentialMetadata = credentialMetadata;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public UpdateCredentialRequestBody build() {
                return new UpdateCredentialRequestBody(this);
            } 

        } 

    }
}
