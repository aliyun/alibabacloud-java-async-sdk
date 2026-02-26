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
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private CreateCredentialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.credentialContent = builder.credentialContent;
        this.credentialIdentifier = builder.credentialIdentifier;
        this.credentialName = builder.credentialName;
        this.credentialScenarioLabel = builder.credentialScenarioLabel;
        this.credentialSubjectId = builder.credentialSubjectId;
        this.credentialSubjectType = builder.credentialSubjectType;
        this.credentialType = builder.credentialType;
        this.description = builder.description;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateCredentialRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private CredentialContent credentialContent; 
        private String credentialIdentifier; 
        private String credentialName; 
        private String credentialScenarioLabel; 
        private String credentialSubjectId; 
        private String credentialSubjectType; 
        private String credentialType; 
        private String description; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCredentialRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.credentialContent = request.credentialContent;
            this.credentialIdentifier = request.credentialIdentifier;
            this.credentialName = request.credentialName;
            this.credentialScenarioLabel = request.credentialScenarioLabel;
            this.credentialSubjectId = request.credentialSubjectId;
            this.credentialSubjectType = request.credentialSubjectType;
            this.credentialType = request.credentialType;
            this.description = request.description;
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
         * <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
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
         * <p>凭据的内容。</p>
         * <p>This parameter is required.</p>
         */
        public Builder credentialContent(CredentialContent credentialContent) {
            this.putQueryParameter("CredentialContent", credentialContent);
            this.credentialContent = credentialContent;
            return this;
        }

        /**
         * <p>凭据标识。</p>
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
         * <p>凭据名称。</p>
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
         * <p>凭据的使用场景标签。</p>
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
         * <p>凭据所属的主体ID。</p>
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
         * <p>凭据所属的主体类型。</p>
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
         * <p>凭据类型。</p>
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
         * <p>描述</p>
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
         * <p>IDaaS EIAM实例的ID。</p>
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
             * <p>API Key 凭证类型的凭据内容。</p>
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
             * <p>OAuth协议的client_id。</p>
             * 
             * <strong>example:</strong>
             * <p>dmvncmxersdxxxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>OAuth协议的client_secret。</p>
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
             * <p>Api Key的内容。</p>
             */
            public Builder apiKeyContent(ApiKeyContent apiKeyContent) {
                this.apiKeyContent = apiKeyContent;
                return this;
            }

            /**
             * <p>OAuth客户端认证凭证类型的凭据内容。</p>
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
