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
 * {@link AddSAMLIdentityProviderCertificateRequest} extends {@link RequestModel}
 *
 * <p>AddSAMLIdentityProviderCertificateRequest</p>
 */
public class AddSAMLIdentityProviderCertificateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("X509Certificate")
    private String x509Certificate;

    private AddSAMLIdentityProviderCertificateRequest(Builder builder) {
        super(builder);
        this.userPoolName = builder.userPoolName;
        this.x509Certificate = builder.x509Certificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSAMLIdentityProviderCertificateRequest create() {
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

    /**
     * @return x509Certificate
     */
    public String getX509Certificate() {
        return this.x509Certificate;
    }

    public static final class Builder extends Request.Builder<AddSAMLIdentityProviderCertificateRequest, Builder> {
        private String userPoolName; 
        private String x509Certificate; 

        private Builder() {
            super();
        } 

        private Builder(AddSAMLIdentityProviderCertificateRequest request) {
            super(request);
            this.userPoolName = request.userPoolName;
            this.x509Certificate = request.x509Certificate;
        } 

        /**
         * UserPoolName.
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        /**
         * X509Certificate.
         */
        public Builder x509Certificate(String x509Certificate) {
            this.putBodyParameter("X509Certificate", x509Certificate);
            this.x509Certificate = x509Certificate;
            return this;
        }

        @Override
        public AddSAMLIdentityProviderCertificateRequest build() {
            return new AddSAMLIdentityProviderCertificateRequest(this);
        } 

    } 

}
