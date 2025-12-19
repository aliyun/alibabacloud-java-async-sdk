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
 * {@link GetOAuth2CredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>GetOAuth2CredentialProviderRequest</p>
 */
public class GetOAuth2CredentialProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OAuth2CredentialProviderName")
    private String oAuth2CredentialProviderName;

    private GetOAuth2CredentialProviderRequest(Builder builder) {
        super(builder);
        this.oAuth2CredentialProviderName = builder.oAuth2CredentialProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOAuth2CredentialProviderRequest create() {
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

    public static final class Builder extends Request.Builder<GetOAuth2CredentialProviderRequest, Builder> {
        private String oAuth2CredentialProviderName; 

        private Builder() {
            super();
        } 

        private Builder(GetOAuth2CredentialProviderRequest request) {
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
        public GetOAuth2CredentialProviderRequest build() {
            return new GetOAuth2CredentialProviderRequest(this);
        } 

    } 

}
