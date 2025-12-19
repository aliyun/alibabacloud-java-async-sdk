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
 * {@link DeleteAPIKeyCredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>DeleteAPIKeyCredentialProviderRequest</p>
 */
public class DeleteAPIKeyCredentialProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("APIKeyCredentialProviderName")
    private String APIKeyCredentialProviderName;

    private DeleteAPIKeyCredentialProviderRequest(Builder builder) {
        super(builder);
        this.APIKeyCredentialProviderName = builder.APIKeyCredentialProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAPIKeyCredentialProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return APIKeyCredentialProviderName
     */
    public String getAPIKeyCredentialProviderName() {
        return this.APIKeyCredentialProviderName;
    }

    public static final class Builder extends Request.Builder<DeleteAPIKeyCredentialProviderRequest, Builder> {
        private String APIKeyCredentialProviderName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAPIKeyCredentialProviderRequest request) {
            super(request);
            this.APIKeyCredentialProviderName = request.APIKeyCredentialProviderName;
        } 

        /**
         * APIKeyCredentialProviderName.
         */
        public Builder APIKeyCredentialProviderName(String APIKeyCredentialProviderName) {
            this.putBodyParameter("APIKeyCredentialProviderName", APIKeyCredentialProviderName);
            this.APIKeyCredentialProviderName = APIKeyCredentialProviderName;
            return this;
        }

        @Override
        public DeleteAPIKeyCredentialProviderRequest build() {
            return new DeleteAPIKeyCredentialProviderRequest(this);
        } 

    } 

}
