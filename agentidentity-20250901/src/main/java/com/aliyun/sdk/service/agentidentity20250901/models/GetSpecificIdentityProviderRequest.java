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
 * {@link GetSpecificIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>GetSpecificIdentityProviderRequest</p>
 */
public class GetSpecificIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
    private String identityProviderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private GetSpecificIdentityProviderRequest(Builder builder) {
        super(builder);
        this.identityProviderType = builder.identityProviderType;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpecificIdentityProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProviderType
     */
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<GetSpecificIdentityProviderRequest, Builder> {
        private String identityProviderType; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(GetSpecificIdentityProviderRequest request) {
            super(request);
            this.identityProviderType = request.identityProviderType;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * IdentityProviderType.
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putBodyParameter("IdentityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
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
        public GetSpecificIdentityProviderRequest build() {
            return new GetSpecificIdentityProviderRequest(this);
        } 

    } 

}
