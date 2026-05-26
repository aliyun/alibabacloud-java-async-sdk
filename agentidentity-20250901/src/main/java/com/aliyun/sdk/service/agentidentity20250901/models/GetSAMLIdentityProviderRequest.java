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
 * {@link GetSAMLIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>GetSAMLIdentityProviderRequest</p>
 */
public class GetSAMLIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private GetSAMLIdentityProviderRequest(Builder builder) {
        super(builder);
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSAMLIdentityProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<GetSAMLIdentityProviderRequest, Builder> {
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(GetSAMLIdentityProviderRequest request) {
            super(request);
            this.userPoolName = request.userPoolName;
        } 

        /**
         * UserPoolName.
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public GetSAMLIdentityProviderRequest build() {
            return new GetSAMLIdentityProviderRequest(this);
        } 

    } 

}
