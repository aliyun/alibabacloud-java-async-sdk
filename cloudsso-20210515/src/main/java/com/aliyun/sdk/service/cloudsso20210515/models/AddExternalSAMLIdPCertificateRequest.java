// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddExternalSAMLIdPCertificateRequest} extends {@link RequestModel}
 *
 * <p>AddExternalSAMLIdPCertificateRequest</p>
 */
public class AddExternalSAMLIdPCertificateRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("X509Certificate")
    private String x509Certificate;

    private AddExternalSAMLIdPCertificateRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.x509Certificate = builder.x509Certificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddExternalSAMLIdPCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return x509Certificate
     */
    public String getX509Certificate() {
        return this.x509Certificate;
    }

    public static final class Builder extends Request.Builder<AddExternalSAMLIdPCertificateRequest, Builder> {
        private String directoryId; 
        private String x509Certificate; 

        private Builder() {
            super();
        } 

        private Builder(AddExternalSAMLIdPCertificateRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.x509Certificate = request.x509Certificate;
        } 

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The X.509 certificate in the PEM format.
         * <p>
         * 
         * The certificate is provided by the SAML IdP.
         */
        public Builder x509Certificate(String x509Certificate) {
            this.putQueryParameter("X509Certificate", x509Certificate);
            this.x509Certificate = x509Certificate;
            return this;
        }

        @Override
        public AddExternalSAMLIdPCertificateRequest build() {
            return new AddExternalSAMLIdPCertificateRequest(this);
        } 

    } 

}
