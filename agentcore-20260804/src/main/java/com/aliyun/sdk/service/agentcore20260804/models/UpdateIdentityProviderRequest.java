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
 * {@link UpdateIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateIdentityProviderRequest</p>
 */
public class UpdateIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("identityProviderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityProviderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateIdentityProviderRequestBody body;

    private UpdateIdentityProviderRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.identityProviderType = builder.identityProviderType;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIdentityProviderRequest create() {
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
     * @return identityProviderType
     */
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * @return body
     */
    public UpdateIdentityProviderRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateIdentityProviderRequest, Builder> {
        private String workspaceId; 
        private String identityProviderType; 
        private UpdateIdentityProviderRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIdentityProviderRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.identityProviderType = request.identityProviderType;
            this.body = request.body;
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
         * <p>DingTalk</p>
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putPathParameter("identityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateIdentityProviderRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateIdentityProviderRequest build() {
            return new UpdateIdentityProviderRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("appKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("appSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("corpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("encryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("verificationToken")
        private String verificationToken;

        private Metadata(Builder builder) {
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.appSecret = builder.appSecret;
            this.corpId = builder.corpId;
            this.encryptKey = builder.encryptKey;
            this.verificationToken = builder.verificationToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return encryptKey
         */
        public String getEncryptKey() {
            return this.encryptKey;
        }

        /**
         * @return verificationToken
         */
        public String getVerificationToken() {
            return this.verificationToken;
        }

        public static final class Builder {
            private String appId; 
            private String appKey; 
            private String appSecret; 
            private String corpId; 
            private String encryptKey; 
            private String verificationToken; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.appId = model.appId;
                this.appKey = model.appKey;
                this.appSecret = model.appSecret;
                this.corpId = model.corpId;
                this.encryptKey = model.encryptKey;
                this.verificationToken = model.verificationToken;
            } 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * appKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * appSecret.
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * corpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * encryptKey.
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * verificationToken.
             */
            public Builder verificationToken(String verificationToken) {
                this.verificationToken = verificationToken;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class UpdateIdentityProviderRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("loginEnabled")
        private Boolean loginEnabled;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("syncEnabled")
        private Boolean syncEnabled;

        private UpdateIdentityProviderRequestBody(Builder builder) {
            this.loginEnabled = builder.loginEnabled;
            this.metadata = builder.metadata;
            this.syncEnabled = builder.syncEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateIdentityProviderRequestBody create() {
            return builder().build();
        }

        /**
         * @return loginEnabled
         */
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        /**
         * @return metadata
         */
        public Metadata getMetadata() {
            return this.metadata;
        }

        /**
         * @return syncEnabled
         */
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public static final class Builder {
            private Boolean loginEnabled; 
            private Metadata metadata; 
            private Boolean syncEnabled; 

            private Builder() {
            } 

            private Builder(UpdateIdentityProviderRequestBody model) {
                this.loginEnabled = model.loginEnabled;
                this.metadata = model.metadata;
                this.syncEnabled = model.syncEnabled;
            } 

            /**
             * loginEnabled.
             */
            public Builder loginEnabled(Boolean loginEnabled) {
                this.loginEnabled = loginEnabled;
                return this;
            }

            /**
             * metadata.
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * syncEnabled.
             */
            public Builder syncEnabled(Boolean syncEnabled) {
                this.syncEnabled = syncEnabled;
                return this;
            }

            public UpdateIdentityProviderRequestBody build() {
                return new UpdateIdentityProviderRequestBody(this);
            } 

        } 

    }
}
