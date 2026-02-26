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
 * {@link UpdateCredentialRequest} extends {@link RequestModel}
 *
 * <p>UpdateCredentialRequest</p>
 */
public class UpdateCredentialRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialContent")
    private CredentialContent credentialContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String credentialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String credentialName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private UpdateCredentialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.credentialContent = builder.credentialContent;
        this.credentialId = builder.credentialId;
        this.credentialName = builder.credentialName;
        this.instanceId = builder.instanceId;
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
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateCredentialRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private CredentialContent credentialContent; 
        private String credentialId; 
        private String credentialName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCredentialRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.credentialContent = request.credentialContent;
            this.credentialId = request.credentialId;
            this.credentialName = request.credentialName;
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
         */
        public Builder credentialContent(CredentialContent credentialContent) {
            this.putQueryParameter("CredentialContent", credentialContent);
            this.credentialContent = credentialContent;
            return this;
        }

        /**
         * <p>凭据ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cred_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder credentialId(String credentialId) {
            this.putQueryParameter("CredentialId", credentialId);
            this.credentialId = credentialId;
            return this;
        }

        /**
         * <p>凭据名称。</p>
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
     * {@link UpdateCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateCredentialRequest</p>
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
     * {@link UpdateCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateCredentialRequest</p>
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
