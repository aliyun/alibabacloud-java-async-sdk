// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link CreateUserExclusiveCredentialRequest} extends {@link RequestModel}
 *
 * <p>CreateUserExclusiveCredentialRequest</p>
 */
public class CreateUserExclusiveCredentialRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Authorization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("credentialContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private CredentialContent credentialContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("credentialIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("credentialName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("credentialScenarioLabel")
    private String credentialScenarioLabel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("credentialType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    private CreateUserExclusiveCredentialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.authorization = builder.authorization;
        this.credentialContent = builder.credentialContent;
        this.credentialIdentifier = builder.credentialIdentifier;
        this.credentialName = builder.credentialName;
        this.credentialScenarioLabel = builder.credentialScenarioLabel;
        this.credentialType = builder.credentialType;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserExclusiveCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return credentialContent
     */
    public CredentialContent getCredentialContent() {
        return this.credentialContent;
    }

    /**
     * @return credentialIdentifier
     */
    public String getCredentialIdentifier() {
        return this.credentialIdentifier;
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return credentialScenarioLabel
     */
    public String getCredentialScenarioLabel() {
        return this.credentialScenarioLabel;
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

    public static final class Builder extends Request.Builder<CreateUserExclusiveCredentialRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String authorization; 
        private CredentialContent credentialContent; 
        private String credentialIdentifier; 
        private String credentialName; 
        private String credentialScenarioLabel; 
        private String credentialType; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserExclusiveCredentialRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.authorization = request.authorization;
            this.credentialContent = request.credentialContent;
            this.credentialIdentifier = request.credentialIdentifier;
            this.credentialName = request.credentialName;
            this.credentialScenarioLabel = request.credentialScenarioLabel;
            this.credentialType = request.credentialType;
            this.description = request.description;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer xxxxxx</p>
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder credentialContent(CredentialContent credentialContent) {
            this.putBodyParameter("credentialContent", credentialContent);
            this.credentialContent = credentialContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>credential_identifier_test</p>
         */
        public Builder credentialIdentifier(String credentialIdentifier) {
            this.putBodyParameter("credentialIdentifier", credentialIdentifier);
            this.credentialIdentifier = credentialIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>credential_name</p>
         */
        public Builder credentialName(String credentialName) {
            this.putBodyParameter("credentialName", credentialName);
            this.credentialName = credentialName;
            return this;
        }

        /**
         * credentialScenarioLabel.
         */
        public Builder credentialScenarioLabel(String credentialScenarioLabel) {
            this.putBodyParameter("credentialScenarioLabel", credentialScenarioLabel);
            this.credentialScenarioLabel = credentialScenarioLabel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api_key</p>
         */
        public Builder credentialType(String credentialType) {
            this.putBodyParameter("credentialType", credentialType);
            this.credentialType = credentialType;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public CreateUserExclusiveCredentialRequest build() {
            return new CreateUserExclusiveCredentialRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateUserExclusiveCredentialRequest} extends {@link TeaModel}
     *
     * <p>CreateUserExclusiveCredentialRequest</p>
     */
    public static class ApiKeyContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String apiKey;

        private ApiKeyContent(Builder builder) {
            this.apiKey = builder.apiKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKeyContent create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        public static final class Builder {
            private String apiKey; 

            private Builder() {
            } 

            private Builder(ApiKeyContent model) {
                this.apiKey = model.apiKey;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-nsklncmwizncxxxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            public ApiKeyContent build() {
                return new ApiKeyContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateUserExclusiveCredentialRequest} extends {@link TeaModel}
     *
     * <p>CreateUserExclusiveCredentialRequest</p>
     */
    public static class CredentialContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyContent")
        private ApiKeyContent apiKeyContent;

        private CredentialContent(Builder builder) {
            this.apiKeyContent = builder.apiKeyContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialContent create() {
            return builder().build();
        }

        /**
         * @return apiKeyContent
         */
        public ApiKeyContent getApiKeyContent() {
            return this.apiKeyContent;
        }

        public static final class Builder {
            private ApiKeyContent apiKeyContent; 

            private Builder() {
            } 

            private Builder(CredentialContent model) {
                this.apiKeyContent = model.apiKeyContent;
            } 

            /**
             * apiKeyContent.
             */
            public Builder apiKeyContent(ApiKeyContent apiKeyContent) {
                this.apiKeyContent = apiKeyContent;
                return this;
            }

            public CredentialContent build() {
                return new CredentialContent(this);
            } 

        } 

    }
}
