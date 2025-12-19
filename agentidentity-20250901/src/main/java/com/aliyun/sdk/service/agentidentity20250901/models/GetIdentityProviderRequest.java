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
 * {@link GetIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>GetIdentityProviderRequest</p>
 */
public class GetIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
    private String identityProviderName;

    private GetIdentityProviderRequest(Builder builder) {
        super(builder);
        this.identityProviderName = builder.identityProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProviderName
     */
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public static final class Builder extends Request.Builder<GetIdentityProviderRequest, Builder> {
        private String identityProviderName; 

        private Builder() {
            super();
        } 

        private Builder(GetIdentityProviderRequest request) {
            super(request);
            this.identityProviderName = request.identityProviderName;
        } 

        /**
         * IdentityProviderName.
         */
        public Builder identityProviderName(String identityProviderName) {
            this.putBodyParameter("IdentityProviderName", identityProviderName);
            this.identityProviderName = identityProviderName;
            return this;
        }

        @Override
        public GetIdentityProviderRequest build() {
            return new GetIdentityProviderRequest(this);
        } 

    } 

}
