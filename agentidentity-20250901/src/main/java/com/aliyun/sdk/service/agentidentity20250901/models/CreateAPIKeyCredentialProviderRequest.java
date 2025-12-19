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
 * {@link CreateAPIKeyCredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateAPIKeyCredentialProviderRequest</p>
 */
public class CreateAPIKeyCredentialProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("APIKey")
    private String APIKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("APIKeyCredentialProviderName")
    private String APIKeyCredentialProviderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    private CreateAPIKeyCredentialProviderRequest(Builder builder) {
        super(builder);
        this.APIKey = builder.APIKey;
        this.APIKeyCredentialProviderName = builder.APIKeyCredentialProviderName;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAPIKeyCredentialProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return APIKey
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * @return APIKeyCredentialProviderName
     */
    public String getAPIKeyCredentialProviderName() {
        return this.APIKeyCredentialProviderName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<CreateAPIKeyCredentialProviderRequest, Builder> {
        private String APIKey; 
        private String APIKeyCredentialProviderName; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(CreateAPIKeyCredentialProviderRequest request) {
            super(request);
            this.APIKey = request.APIKey;
            this.APIKeyCredentialProviderName = request.APIKeyCredentialProviderName;
            this.description = request.description;
        } 

        /**
         * APIKey.
         */
        public Builder APIKey(String APIKey) {
            this.putBodyParameter("APIKey", APIKey);
            this.APIKey = APIKey;
            return this;
        }

        /**
         * APIKeyCredentialProviderName.
         */
        public Builder APIKeyCredentialProviderName(String APIKeyCredentialProviderName) {
            this.putBodyParameter("APIKeyCredentialProviderName", APIKeyCredentialProviderName);
            this.APIKeyCredentialProviderName = APIKeyCredentialProviderName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public CreateAPIKeyCredentialProviderRequest build() {
            return new CreateAPIKeyCredentialProviderRequest(this);
        } 

    } 

}
