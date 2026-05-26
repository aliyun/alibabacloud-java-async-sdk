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
 * {@link DeleteSAMLIdentityProviderCertificateRequest} extends {@link RequestModel}
 *
 * <p>DeleteSAMLIdentityProviderCertificateRequest</p>
 */
public class DeleteSAMLIdentityProviderCertificateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private DeleteSAMLIdentityProviderCertificateRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSAMLIdentityProviderCertificateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<DeleteSAMLIdentityProviderCertificateRequest, Builder> {
        private String certificateId; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSAMLIdentityProviderCertificateRequest request) {
            super(request);
            this.certificateId = request.certificateId;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.putBodyParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
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
        public DeleteSAMLIdentityProviderCertificateRequest build() {
            return new DeleteSAMLIdentityProviderCertificateRequest(this);
        } 

    } 

}
