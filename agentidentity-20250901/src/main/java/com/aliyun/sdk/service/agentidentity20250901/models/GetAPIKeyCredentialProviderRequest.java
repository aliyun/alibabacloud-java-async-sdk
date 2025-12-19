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
 * {@link GetAPIKeyCredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>GetAPIKeyCredentialProviderRequest</p>
 */
public class GetAPIKeyCredentialProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("APIKeyCredentialProviderName")
    private String APIKeyCredentialProviderName;

    private GetAPIKeyCredentialProviderRequest(Builder builder) {
        super(builder);
        this.APIKeyCredentialProviderName = builder.APIKeyCredentialProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAPIKeyCredentialProviderRequest create() {
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

    public static final class Builder extends Request.Builder<GetAPIKeyCredentialProviderRequest, Builder> {
        private String APIKeyCredentialProviderName; 

        private Builder() {
            super();
        } 

        private Builder(GetAPIKeyCredentialProviderRequest request) {
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
        public GetAPIKeyCredentialProviderRequest build() {
            return new GetAPIKeyCredentialProviderRequest(this);
        } 

    } 

}
