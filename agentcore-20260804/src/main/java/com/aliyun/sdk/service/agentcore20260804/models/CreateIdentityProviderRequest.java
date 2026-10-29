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
 * {@link CreateIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateIdentityProviderRequest</p>
 */
public class CreateIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateIdentityProviderRequestBody body;

    private CreateIdentityProviderRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIdentityProviderRequest create() {
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
    public CreateIdentityProviderRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateIdentityProviderRequest, Builder> {
        private String workspaceId; 
        private CreateIdentityProviderRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateIdentityProviderRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
        } 

        /**
         * <p>The workspace ID.</p>
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
         * <p>The request content for binding an external identity provider.</p>
         */
        public Builder body(CreateIdentityProviderRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public CreateIdentityProviderRequest build() {
            return new CreateIdentityProviderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
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
             * <p>The app ID of the Lark application. This parameter is required when the binding type is Feishu.</p>
             * 
             * <strong>example:</strong>
             * <p>cli_exampleappid01</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The AppKey of the DingTalk application. This parameter is required when the binding type is DingTalk.</p>
             * 
             * <strong>example:</strong>
             * <p>dingexampleappkey01</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>Required. The secret of the external identity provider application. This parameter is used only for writing and is not returned by query API operations.</p>
             * 
             * <strong>example:</strong>
             * <p>example-app-secret</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>The CorpId of the DingTalk enterprise. This parameter is required when the binding type is DingTalk.</p>
             * 
             * <strong>example:</strong>
             * <p>dingexamplecorpid01</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>The data encryption key for event subscription. The value must be the same as the one configured in the external identity provider application. This parameter is used only for writing and is not returned by query API operations.</p>
             * 
             * <strong>example:</strong>
             * <p>example-encrypt-key</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>The verification token for event subscription. The value must be the same as the one configured in the external identity provider application. This parameter is used only for writing and is not returned by query API operations.</p>
             * 
             * <strong>example:</strong>
             * <p>example-verification-token</p>
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
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class SyncScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("departmentIds")
        private java.util.List<String> departmentIds;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        private SyncScope(Builder builder) {
            this.departmentIds = builder.departmentIds;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncScope create() {
            return builder().build();
        }

        /**
         * @return departmentIds
         */
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private java.util.List<String> departmentIds; 
            private String mode; 

            private Builder() {
            } 

            private Builder(SyncScope model) {
                this.departmentIds = model.departmentIds;
                this.mode = model.mode;
            } 

            /**
             * <p>When the mode is SelectedDepartments, the list must contain at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When the mode is AllAuthorized, pass an empty array or omit this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;10001&quot;]</p>
             */
            public Builder departmentIds(java.util.List<String> departmentIds) {
                this.departmentIds = departmentIds;
                return this;
            }

            /**
             * <p>AllAuthorized: the full authorization scope, which is limited by the application address book authorization. SelectedDepartments: the selected departments and all their sub-departments. When explicitly submitting syncScope, you must provide a valid mode, which is verified by the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>SelectedDepartments</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public SyncScope build() {
                return new SyncScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateIdentityProviderRequest</p>
     */
    public static class CreateIdentityProviderRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("identityProviderType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String identityProviderType;

        @com.aliyun.core.annotation.NameInMap("loginEnabled")
        private Boolean loginEnabled;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("syncEnabled")
        private Boolean syncEnabled;

        @com.aliyun.core.annotation.NameInMap("syncOnBind")
        private Boolean syncOnBind;

        @com.aliyun.core.annotation.NameInMap("syncScope")
        private SyncScope syncScope;

        private CreateIdentityProviderRequestBody(Builder builder) {
            this.identityProviderType = builder.identityProviderType;
            this.loginEnabled = builder.loginEnabled;
            this.metadata = builder.metadata;
            this.syncEnabled = builder.syncEnabled;
            this.syncOnBind = builder.syncOnBind;
            this.syncScope = builder.syncScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateIdentityProviderRequestBody create() {
            return builder().build();
        }

        /**
         * @return identityProviderType
         */
        public String getIdentityProviderType() {
            return this.identityProviderType;
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

        /**
         * @return syncOnBind
         */
        public Boolean getSyncOnBind() {
            return this.syncOnBind;
        }

        /**
         * @return syncScope
         */
        public SyncScope getSyncScope() {
            return this.syncScope;
        }

        public static final class Builder {
            private String identityProviderType; 
            private Boolean loginEnabled; 
            private Metadata metadata; 
            private Boolean syncEnabled; 
            private Boolean syncOnBind; 
            private SyncScope syncScope; 

            private Builder() {
            } 

            private Builder(CreateIdentityProviderRequestBody model) {
                this.identityProviderType = model.identityProviderType;
                this.loginEnabled = model.loginEnabled;
                this.metadata = model.metadata;
                this.syncEnabled = model.syncEnabled;
                this.syncOnBind = model.syncOnBind;
                this.syncScope = model.syncScope;
            } 

            /**
             * <p>The type of the external identity provider. Valid values: DingTalk and Feishu.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DingTalk</p>
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * <p>Specifies whether to allow workspace users to log on through the external identity provider.</p>
             */
            public Builder loginEnabled(Boolean loginEnabled) {
                this.loginEnabled = loginEnabled;
                return this;
            }

            /**
             * <p>The application configuration of the external identity provider. When you bind DingTalk, you must provide appKey, appSecret, and corpId. When you bind Lark, you must provide appId and appSecret.</p>
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>Specifies whether to enable organization member synchronization. If enabled, the external identity provider synchronizes organization members as workspace users.</p>
             */
            public Builder syncEnabled(Boolean syncEnabled) {
                this.syncEnabled = syncEnabled;
                return this;
            }

            /**
             * <p>Controls the first synchronization when DingTalk or Lark is bound. If omitted or set to null, the default value is true. If set to false, only the configuration is saved, and synchronization is explicitly triggered later. CustomSSO does not use the vendor pull link.</p>
             */
            public Builder syncOnBind(Boolean syncOnBind) {
                this.syncOnBind = syncOnBind;
                return this;
            }

            /**
             * <p>Retains the department-based synchronization scope definition. If omitted during creation, the default value is AllAuthorized. The first vendor synchronization is determined by syncOnBind. If omitted or set to null during an update, the original value is retained. Updating and saving the scope does not automatically perform full synchronization.</p>
             */
            public Builder syncScope(SyncScope syncScope) {
                this.syncScope = syncScope;
                return this;
            }

            public CreateIdentityProviderRequestBody build() {
                return new CreateIdentityProviderRequestBody(this);
            } 

        } 

    }
}
