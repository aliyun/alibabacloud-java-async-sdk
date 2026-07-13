// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityProviderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdpMetadata")
    private String idpMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginEnabled")
    private Boolean loginEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncEnabled")
    private Boolean syncEnabled;

    private UpdateIdentityProviderRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.identityProviderType = builder.identityProviderType;
        this.idpMetadata = builder.idpMetadata;
        this.instanceId = builder.instanceId;
        this.loginEnabled = builder.loginEnabled;
        this.syncEnabled = builder.syncEnabled;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return identityProviderType
     */
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * @return idpMetadata
     */
    public String getIdpMetadata() {
        return this.idpMetadata;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return loginEnabled
     */
    public Boolean getLoginEnabled() {
        return this.loginEnabled;
    }

    /**
     * @return syncEnabled
     */
    public Boolean getSyncEnabled() {
        return this.syncEnabled;
    }

    public static final class Builder extends Request.Builder<UpdateIdentityProviderRequest, Builder> {
        private String clientToken; 
        private String identityProviderType; 
        private String idpMetadata; 
        private String instanceId; 
        private Boolean loginEnabled; 
        private Boolean syncEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIdentityProviderRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.identityProviderType = request.identityProviderType;
            this.idpMetadata = request.idpMetadata;
            this.instanceId = request.instanceId;
            this.loginEnabled = request.loginEnabled;
            this.syncEnabled = request.syncEnabled;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putQueryParameter("IdentityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * IdpMetadata.
         */
        public Builder idpMetadata(String idpMetadata) {
            this.putQueryParameter("IdpMetadata", idpMetadata);
            this.idpMetadata = idpMetadata;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agentteams-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LoginEnabled.
         */
        public Builder loginEnabled(Boolean loginEnabled) {
            this.putQueryParameter("LoginEnabled", loginEnabled);
            this.loginEnabled = loginEnabled;
            return this;
        }

        /**
         * SyncEnabled.
         */
        public Builder syncEnabled(Boolean syncEnabled) {
            this.putQueryParameter("SyncEnabled", syncEnabled);
            this.syncEnabled = syncEnabled;
            return this;
        }

        @Override
        public UpdateIdentityProviderRequest build() {
            return new UpdateIdentityProviderRequest(this);
        } 

    } 

}
