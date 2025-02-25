// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCertificateStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateCertificateStatusRequest</p>
 */
public class UpdateCertificateStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private UpdateCertificateStatusRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCertificateStatusRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateCertificateStatusRequest, Builder> {
        private String certificateId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCertificateStatusRequest request) {
            super(request);
            this.certificateId = request.certificateId;
            this.status = request.status;
        } 

        /**
         * The ID of the certificate. The ID must be globally unique in Certificates Manager.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * The status of the certificate. Valid values:
         * <p>
         * 
         * *   INACTIVE: The certificate is disabled.
         * 
         * *   ACTIVE: The certificate is enabled.
         * 
         * *   REVOKED: The certificate is revoked.
         * 
         * > If the certificate is in the REVOKED state, you can use the certificate only to verify a signature, but not to generate a signature.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateCertificateStatusRequest build() {
            return new UpdateCertificateStatusRequest(this);
        } 

    } 

}
