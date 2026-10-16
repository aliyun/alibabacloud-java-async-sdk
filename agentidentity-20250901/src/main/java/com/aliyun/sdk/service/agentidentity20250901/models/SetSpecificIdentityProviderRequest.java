// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link SetSpecificIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>SetSpecificIdentityProviderRequest</p>
 */
public class SetSpecificIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IDPMetadata")
    private String IDPMetadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
    private String identityProviderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SSOStatus")
    private String SSOStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private SetSpecificIdentityProviderRequest(Builder builder) {
        super(builder);
        this.IDPMetadata = builder.IDPMetadata;
        this.identityProviderType = builder.identityProviderType;
        this.SSOStatus = builder.SSOStatus;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSpecificIdentityProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return IDPMetadata
     */
    public String getIDPMetadata() {
        return this.IDPMetadata;
    }

    /**
     * @return identityProviderType
     */
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * @return SSOStatus
     */
    public String getSSOStatus() {
        return this.SSOStatus;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<SetSpecificIdentityProviderRequest, Builder> {
        private String IDPMetadata; 
        private String identityProviderType; 
        private String SSOStatus; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(SetSpecificIdentityProviderRequest request) {
            super(request);
            this.IDPMetadata = request.IDPMetadata;
            this.identityProviderType = request.identityProviderType;
            this.SSOStatus = request.SSOStatus;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * <p>The IdP metadata. For the DingTalk type, the metadata is in JSON format and includes fields such as corpId, appKey, appSecret, encryptKey, verificationToken, and syncCallbackStatus.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;corpId&quot;:&quot;dingxxxxxxxxxx&quot;,&quot;appKey&quot;:&quot;dingxxxxxxxxxx&quot;,&quot;appSecret&quot;:&quot;your_app_secret&quot;,&quot;encryptKey&quot;:&quot;your_encrypt_key&quot;,&quot;verificationToken&quot;:&quot;your_verification_token&quot;,&quot;syncCallbackStatus&quot;:&quot;Enabled&quot;}</p>
         */
        public Builder IDPMetadata(String IDPMetadata) {
            this.putBodyParameter("IDPMetadata", IDPMetadata);
            this.IDPMetadata = IDPMetadata;
            return this;
        }

        /**
         * <p>The type of the identity provider. Currently, only DingTalk is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putBodyParameter("IdentityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * <p>The SSO enabling status. Valid values:</p>
         * <ul>
         * <li>Enabled: Enabled.</li>
         * <li>Disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder SSOStatus(String SSOStatus) {
            this.putBodyParameter("SSOStatus", SSOStatus);
            this.SSOStatus = SSOStatus;
            return this;
        }

        /**
         * <p>The name of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public SetSpecificIdentityProviderRequest build() {
            return new SetSpecificIdentityProviderRequest(this);
        } 

    } 

}
