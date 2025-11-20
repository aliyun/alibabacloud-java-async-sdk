// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetCredentialRequest} extends {@link RequestModel}
 *
 * <p>GetCredentialRequest</p>
 */
public class GetCredentialRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    private GetCredentialRequest(Builder builder) {
        super(builder);
        this.credentialName = builder.credentialName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    public static final class Builder extends Request.Builder<GetCredentialRequest, Builder> {
        private String credentialName; 

        private Builder() {
            super();
        } 

        private Builder(GetCredentialRequest request) {
            super(request);
            this.credentialName = request.credentialName;
        } 

        /**
         * <p>credentialName</p>
         * 
         * <strong>example:</strong>
         * <p>credentialName</p>
         */
        public Builder credentialName(String credentialName) {
            this.putPathParameter("credentialName", credentialName);
            this.credentialName = credentialName;
            return this;
        }

        @Override
        public GetCredentialRequest build() {
            return new GetCredentialRequest(this);
        } 

    } 

}
