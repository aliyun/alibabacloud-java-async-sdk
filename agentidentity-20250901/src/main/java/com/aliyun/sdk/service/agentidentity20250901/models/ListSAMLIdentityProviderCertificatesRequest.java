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
 * {@link ListSAMLIdentityProviderCertificatesRequest} extends {@link RequestModel}
 *
 * <p>ListSAMLIdentityProviderCertificatesRequest</p>
 */
public class ListSAMLIdentityProviderCertificatesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private ListSAMLIdentityProviderCertificatesRequest(Builder builder) {
        super(builder);
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSAMLIdentityProviderCertificatesRequest create() {
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

    public static final class Builder extends Request.Builder<ListSAMLIdentityProviderCertificatesRequest, Builder> {
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(ListSAMLIdentityProviderCertificatesRequest request) {
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
        public ListSAMLIdentityProviderCertificatesRequest build() {
            return new ListSAMLIdentityProviderCertificatesRequest(this);
        } 

    } 

}
