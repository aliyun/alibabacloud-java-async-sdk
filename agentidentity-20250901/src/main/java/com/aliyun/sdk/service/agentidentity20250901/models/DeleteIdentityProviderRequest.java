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
 * {@link DeleteIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>DeleteIdentityProviderRequest</p>
 */
public class DeleteIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
    private String identityProviderName;

    private DeleteIdentityProviderRequest(Builder builder) {
        super(builder);
        this.identityProviderName = builder.identityProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIdentityProviderRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteIdentityProviderRequest, Builder> {
        private String identityProviderName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIdentityProviderRequest request) {
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
        public DeleteIdentityProviderRequest build() {
            return new DeleteIdentityProviderRequest(this);
        } 

    } 

}
