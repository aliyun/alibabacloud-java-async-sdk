// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCertificateRequest} extends {@link RequestModel}
 *
 * <p>DeleteCertificateRequest</p>
 */
public class DeleteCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certificateId;

    private DeleteCertificateRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteCertificateRequest, Builder> {
        private String certificateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCertificateRequest request) {
            super(request);
            this.certificateId = request.certificateId;
        } 

        /**
         * The ID of the certificate. It is the globally unique identifier (GUID) of the certificate in Alibaba Cloud Certificate Manager.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        @Override
        public DeleteCertificateRequest build() {
            return new DeleteCertificateRequest(this);
        } 

    } 

}
