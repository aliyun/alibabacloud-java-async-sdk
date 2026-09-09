// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private CredentialContent credentialContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialExternalId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String credentialExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialIdentifier")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String credentialIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String credentialName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialScenarioLabel")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String credentialScenarioLabel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialSharingScope")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String credentialSharingScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialSubjectId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String credentialSubjectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialSubjectType")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String credentialSubjectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String credentialType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExclusiveUserId")
    private String exclusiveUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private CreateCredentialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.credentialContent = builder.credentialContent;
        this.credentialExternalId = builder.credentialExternalId;
        this.credentialIdentifier = builder.credentialIdentifier;
        this.credentialName = builder.credentialName;
        this.credentialScenarioLabel = builder.credentialScenarioLabel;
        this.credentialSharingScope = builder.credentialSharingScope;
        this.credentialSubjectId = builder.credentialSubjectId;
        this.credentialSubjectType = builder.credentialSubjectType;
        this.credentialType = builder.credentialType;
        this.description = builder.description;
        this.exclusiveUserId = builder.exclusiveUserId;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return credentialContent
     */
    public CredentialContent getCredentialContent() {
        return this.credentialContent;
    }

    /**
     * @return credentialExternalId
     */
    public String getCredentialExternalId() {
        return this.credentialExternalId;
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
     * @return credentialSharingScope
     */
    public String getCredentialSharingScope() {
        return this.credentialSharingScope;
    }

    /**
     * @return credentialSubjectId
     */
    public String getCredentialSubjectId() {
        return this.credentialSubjectId;
    }

    /**
     * @return credentialSubjectType
     */
    public String getCredentialSubjectType() {
        return this.credentialSubjectType;
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
     * @return exclusiveUserId
     */
    public String getExclusiveUserId() {
        return this.exclusiveUserId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateCredentialRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private CredentialContent credentialContent; 
        private String credentialExternalId; 
        private String credentialIdentifier; 
        private String credentialName; 
        private String credentialScenarioLabel; 
        private String credentialSharingScope; 
        private String credentialSubjectId; 
        private String credentialSubjectType; 
        private String credentialType; 
        private String description; 
        private String exclusiveUserId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCredentialRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.credentialContent = request.credentialContent;
            this.credentialExternalId = request.credentialExternalId;
            this.credentialIdentifier = request.credentialIdentifier;
            this.credentialName = request.credentialName;
            this.credentialScenarioLabel = request.credentialScenarioLabel;
            this.credentialSharingScope = request.credentialSharingScope;
            this.credentialSubjectId = request.credentialSubjectId;
            this.credentialSubjectType = request.credentialSubjectType;
            this.credentialType = request.credentialType;
            this.description = request.description;
            this.exclusiveUserId = request.exclusiveUserId;
            this.instanceId = request.instanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The ClientToken parameter supports only ASCII characters and cannot exceed 64 characters in length. For more information, see References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The credential content.</p>
         * <p>This parameter is required.</p>
         */
        public Builder credentialContent(CredentialContent credentialContent) {
            this.putQueryParameter("CredentialContent", credentialContent);
            this.credentialContent = credentialContent;
            return this;
        }

        /**
         * CredentialExternalId.
         */
        public Builder credentialExternalId(String credentialExternalId) {
            this.putQueryParameter("CredentialExternalId", credentialExternalId);
            this.credentialExternalId = credentialExternalId;
            return this;
        }

        /**
         * <p>The credential identifier.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>credential_identifier_test</p>
         */
        public Builder credentialIdentifier(String credentialIdentifier) {
            this.putQueryParameter("CredentialIdentifier", credentialIdentifier);
            this.credentialIdentifier = credentialIdentifier;
            return this;
        }

        /**
         * <p>The credential name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>credential_name</p>
         */
        public Builder credentialName(String credentialName) {
            this.putQueryParameter("CredentialName", credentialName);
            this.credentialName = credentialName;
            return this;
        }

        /**
         * <p>The Scenarios label of the credential. Valid values:</p>
         * <ul>
         * <li>llm: large language model.</li>
         * <li>saas: third-party SaaS service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>llm</p>
         */
        public Builder credentialScenarioLabel(String credentialScenarioLabel) {
            this.putQueryParameter("CredentialScenarioLabel", credentialScenarioLabel);
            this.credentialScenarioLabel = credentialScenarioLabel;
            return this;
        }

        /**
         * CredentialSharingScope.
         */
        public Builder credentialSharingScope(String credentialSharingScope) {
            this.putQueryParameter("CredentialSharingScope", credentialSharingScope);
            this.credentialSharingScope = credentialSharingScope;
            return this;
        }

        /**
         * <p>The subject ID of the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>apt_werthgfdsasffxxxxx</p>
         */
        public Builder credentialSubjectId(String credentialSubjectId) {
            this.putQueryParameter("CredentialSubjectId", credentialSubjectId);
            this.credentialSubjectId = credentialSubjectId;
            return this;
        }

        /**
         * <p>The subject type of the credential. Valid values:</p>
         * <ul>
         * <li>authentication_token_provider: authentication token provider.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>authentication_token_provider</p>
         */
        public Builder credentialSubjectType(String credentialSubjectType) {
            this.putQueryParameter("CredentialSubjectType", credentialSubjectType);
            this.credentialSubjectType = credentialSubjectType;
            return this;
        }

        /**
         * <p>The credential type. Valid values:</p>
         * <ul>
         * <li>api_key: API key authentication credential.</li>
         * <li>oauth_client: OAuth client authentication credential.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api_key</p>
         */
        public Builder credentialType(String credentialType) {
            this.putQueryParameter("CredentialType", credentialType);
            this.credentialType = credentialType;
            return this;
        }

        /**
         * <p>The credential description.</p>
         * 
         * <strong>example:</strong>
         * <p>credential_description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExclusiveUserId.
         */
        public Builder exclusiveUserId(String exclusiveUserId) {
            this.putQueryParameter("ExclusiveUserId", exclusiveUserId);
            this.exclusiveUserId = exclusiveUserId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
    public static class ApiKeyContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
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
             * <p>The API key content.</p>
             * 
             * <strong>example:</strong>
             * <p>nsklnertyt5ddwizncxxxx</p>
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
     * {@link CreateCredentialRequest} extends {@link TeaModel}
     *
     * <p>CreateCredentialRequest</p>
     */
    public static class OAuthClientContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        private OAuthClientContent(Builder builder) {
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OAuthClientContent create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
        }

        public static final class Builder {
            private String clientId; 
            private String clientSecret; 

            private Builder() {
            } 

            private Builder(OAuthClientContent model) {
                this.clientId = model.clientId;
                this.clientSecret = model.clientSecret;
            } 

            /**
             * <p>The client_id of the OAuth protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>dmvncmxersdxxxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The client_secret of the OAuth protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>nsklncmwizncxxxx</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            public OAuthClientContent build() {
                return new OAuthClientContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCredentialRequest} extends {@link TeaModel}
     *
     * <p>CreateCredentialRequest</p>
     */
    public static class CredentialContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKeyContent")
        private ApiKeyContent apiKeyContent;

        @com.aliyun.core.annotation.NameInMap("OAuthClientContent")
        private OAuthClientContent oAuthClientContent;

        private CredentialContent(Builder builder) {
            this.apiKeyContent = builder.apiKeyContent;
            this.oAuthClientContent = builder.oAuthClientContent;
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

        /**
         * @return oAuthClientContent
         */
        public OAuthClientContent getOAuthClientContent() {
            return this.oAuthClientContent;
        }

        public static final class Builder {
            private ApiKeyContent apiKeyContent; 
            private OAuthClientContent oAuthClientContent; 

            private Builder() {
            } 

            private Builder(CredentialContent model) {
                this.apiKeyContent = model.apiKeyContent;
                this.oAuthClientContent = model.oAuthClientContent;
            } 

            /**
             * <p>The credential content of the API key credential type.</p>
             */
            public Builder apiKeyContent(ApiKeyContent apiKeyContent) {
                this.apiKeyContent = apiKeyContent;
                return this;
            }

            /**
             * <p>The credential content of the OAuth client authentication credential type.</p>
             */
            public Builder oAuthClientContent(OAuthClientContent oAuthClientContent) {
                this.oAuthClientContent = oAuthClientContent;
                return this;
            }

            public CredentialContent build() {
                return new CredentialContent(this);
            } 

        } 

    }
}
