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
 * {@link CreateCredentialRequest} extends {@link RequestModel}
 *
 * <p>CreateCredentialRequest</p>
 */
public class CreateCredentialRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateCredentialRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateCredentialRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCredentialRequest create() {
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
     * @return body
     */
    public CreateCredentialRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateCredentialRequest, Builder> {
        private String workspaceId; 
        private CreateCredentialRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateCredentialRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
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
         * body.
         */
        public Builder body(CreateCredentialRequestBody body) {
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
        public CreateCredentialRequest build() {
            return new CreateCredentialRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCredentialRequest} extends {@link TeaModel}
     *
     * <p>CreateCredentialRequest</p>
     */
    public static class CreateCredentialRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credentialMetadata")
        @com.aliyun.core.annotation.Validation(required = true)
        private String credentialMetadata;

        @com.aliyun.core.annotation.NameInMap("credentialType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String credentialType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private CreateCredentialRequestBody(Builder builder) {
            this.credentialMetadata = builder.credentialMetadata;
            this.credentialType = builder.credentialType;
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCredentialRequestBody create() {
            return builder().build();
        }

        /**
         * @return credentialMetadata
         */
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String credentialMetadata; 
            private String credentialType; 
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(CreateCredentialRequestBody model) {
                this.credentialMetadata = model.credentialMetadata;
                this.credentialType = model.credentialType;
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;apiKey&quot;:&quot;sk-example-value&quot;}</p>
             */
            public Builder credentialMetadata(String credentialMetadata) {
                this.credentialMetadata = credentialMetadata;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>apiKey</p>
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>model-api-key</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CreateCredentialRequestBody build() {
                return new CreateCredentialRequestBody(this);
            } 

        } 

    }
}
