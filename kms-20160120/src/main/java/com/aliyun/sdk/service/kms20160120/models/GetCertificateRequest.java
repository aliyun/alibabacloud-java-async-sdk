// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCertificateRequest} extends {@link RequestModel}
 *
 * <p>GetCertificateRequest</p>
 */
public class GetCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certificateId;

    private GetCertificateRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<GetCertificateRequest, Builder> {
        private String certificateId; 

        private Builder() {
            super();
        } 

        private Builder(GetCertificateRequest request) {
            super(request);
            this.certificateId = request.certificateId;
        } 

        /**
         * The ID of the certificate. It is the globally unique identifier (GUID) of the certificate in Certificates Manager.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        @Override
        public GetCertificateRequest build() {
            return new GetCertificateRequest(this);
        } 

    } 

}
