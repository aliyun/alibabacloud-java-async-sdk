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
 * {@link ObtainCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>ObtainCredentialResponseBody</p>
 */
public class ObtainCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("credentialContent")
    private CredentialContent credentialContent;

    @com.aliyun.core.annotation.NameInMap("credentialCreationType")
    private String credentialCreationType;

    @com.aliyun.core.annotation.NameInMap("credentialId")
    private String credentialId;

    @com.aliyun.core.annotation.NameInMap("credentialIdentifier")
    private String credentialIdentifier;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("credentialScenarioLabel")
    private String credentialScenarioLabel;

    @com.aliyun.core.annotation.NameInMap("credentialSubjectId")
    private String credentialSubjectId;

    @com.aliyun.core.annotation.NameInMap("credentialSubjectType")
    private String credentialSubjectType;

    @com.aliyun.core.annotation.NameInMap("credentialType")
    private String credentialType;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private Long updateTime;

    private ObtainCredentialResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.credentialContent = builder.credentialContent;
        this.credentialCreationType = builder.credentialCreationType;
        this.credentialId = builder.credentialId;
        this.credentialIdentifier = builder.credentialIdentifier;
        this.credentialName = builder.credentialName;
        this.credentialScenarioLabel = builder.credentialScenarioLabel;
        this.credentialSubjectId = builder.credentialSubjectId;
        this.credentialSubjectType = builder.credentialSubjectType;
        this.credentialType = builder.credentialType;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObtainCredentialResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return credentialContent
     */
    public CredentialContent getCredentialContent() {
        return this.credentialContent;
    }

    /**
     * @return credentialCreationType
     */
    public String getCredentialCreationType() {
        return this.credentialCreationType;
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private Long createTime; 
        private CredentialContent credentialContent; 
        private String credentialCreationType; 
        private String credentialId; 
        private String credentialIdentifier; 
        private String credentialName; 
        private String credentialScenarioLabel; 
        private String credentialSubjectId; 
        private String credentialSubjectType; 
        private String credentialType; 
        private String description; 
        private String instanceId; 
        private String status; 
        private Long updateTime; 

        private Builder() {
        } 

        private Builder(ObtainCredentialResponseBody model) {
            this.createTime = model.createTime;
            this.credentialContent = model.credentialContent;
            this.credentialCreationType = model.credentialCreationType;
            this.credentialId = model.credentialId;
            this.credentialIdentifier = model.credentialIdentifier;
            this.credentialName = model.credentialName;
            this.credentialScenarioLabel = model.credentialScenarioLabel;
            this.credentialSubjectId = model.credentialSubjectId;
            this.credentialSubjectType = model.credentialSubjectType;
            this.credentialType = model.credentialType;
            this.description = model.description;
            this.instanceId = model.instanceId;
            this.status = model.status;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>云角色创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>凭据的内容。</p>
         */
        public Builder credentialContent(CredentialContent credentialContent) {
            this.credentialContent = credentialContent;
            return this;
        }

        /**
         * <p>凭据的创建类型。</p>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        public Builder credentialCreationType(String credentialCreationType) {
            this.credentialCreationType = credentialCreationType;
            return this;
        }

        /**
         * <p>凭据ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cred_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder credentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }

        /**
         * <p>凭据标识</p>
         * 
         * <strong>example:</strong>
         * <p>credential_identifier_test</p>
         */
        public Builder credentialIdentifier(String credentialIdentifier) {
            this.credentialIdentifier = credentialIdentifier;
            return this;
        }

        /**
         * <p>凭据名称</p>
         * 
         * <strong>example:</strong>
         * <p>credential_name</p>
         */
        public Builder credentialName(String credentialName) {
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
            this.credentialSubjectType = credentialSubjectType;
            return this;
        }

        /**
         * <p>凭据类型。</p>
         * 
         * <strong>example:</strong>
         * <p>api_key</p>
         */
        public Builder credentialType(String credentialType) {
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
            this.description = description;
            return this;
        }

        /**
         * <p>EIAM实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>凭据状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>云角色更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>1649830227000</p>
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ObtainCredentialResponseBody build() {
            return new ObtainCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ObtainCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>ObtainCredentialResponseBody</p>
     */
    public static class ApiKeyContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
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
             * apiKey.
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
     * {@link ObtainCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>ObtainCredentialResponseBody</p>
     */
    public static class OauthClientContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("clientSecret")
        private String clientSecret;

        private OauthClientContent(Builder builder) {
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OauthClientContent create() {
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

            private Builder(OauthClientContent model) {
                this.clientId = model.clientId;
                this.clientSecret = model.clientSecret;
            } 

            /**
             * <p>OAuth协议的client_id</p>
             * 
             * <strong>example:</strong>
             * <p>dmvncmxersdxxxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * clientSecret.
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            public OauthClientContent build() {
                return new OauthClientContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link ObtainCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>ObtainCredentialResponseBody</p>
     */
    public static class CredentialContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyContent")
        private ApiKeyContent apiKeyContent;

        @com.aliyun.core.annotation.NameInMap("oauthClientContent")
        private OauthClientContent oauthClientContent;

        private CredentialContent(Builder builder) {
            this.apiKeyContent = builder.apiKeyContent;
            this.oauthClientContent = builder.oauthClientContent;
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
         * @return oauthClientContent
         */
        public OauthClientContent getOauthClientContent() {
            return this.oauthClientContent;
        }

        public static final class Builder {
            private ApiKeyContent apiKeyContent; 
            private OauthClientContent oauthClientContent; 

            private Builder() {
            } 

            private Builder(CredentialContent model) {
                this.apiKeyContent = model.apiKeyContent;
                this.oauthClientContent = model.oauthClientContent;
            } 

            /**
             * apiKeyContent.
             */
            public Builder apiKeyContent(ApiKeyContent apiKeyContent) {
                this.apiKeyContent = apiKeyContent;
                return this;
            }

            /**
             * <p>OAuth客户端认证凭证类型的凭据内容。</p>
             */
            public Builder oauthClientContent(OauthClientContent oauthClientContent) {
                this.oauthClientContent = oauthClientContent;
                return this;
            }

            public CredentialContent build() {
                return new CredentialContent(this);
            } 

        } 

    }
}
