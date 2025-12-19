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
 * {@link DeleteOAuth2CredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>DeleteOAuth2CredentialProviderRequest</p>
 */
public class DeleteOAuth2CredentialProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OAuth2CredentialProviderName")
    private String oAuth2CredentialProviderName;

    private DeleteOAuth2CredentialProviderRequest(Builder builder) {
        super(builder);
        this.oAuth2CredentialProviderName = builder.oAuth2CredentialProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOAuth2CredentialProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return oAuth2CredentialProviderName
     */
    public String getOAuth2CredentialProviderName() {
        return this.oAuth2CredentialProviderName;
    }

    public static final class Builder extends Request.Builder<DeleteOAuth2CredentialProviderRequest, Builder> {
        private String oAuth2CredentialProviderName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOAuth2CredentialProviderRequest request) {
            super(request);
            this.oAuth2CredentialProviderName = request.oAuth2CredentialProviderName;
        } 

        /**
         * OAuth2CredentialProviderName.
         */
        public Builder oAuth2CredentialProviderName(String oAuth2CredentialProviderName) {
            this.putBodyParameter("OAuth2CredentialProviderName", oAuth2CredentialProviderName);
            this.oAuth2CredentialProviderName = oAuth2CredentialProviderName;
            return this;
        }

        @Override
        public DeleteOAuth2CredentialProviderRequest build() {
            return new DeleteOAuth2CredentialProviderRequest(this);
        } 

    } 

}
