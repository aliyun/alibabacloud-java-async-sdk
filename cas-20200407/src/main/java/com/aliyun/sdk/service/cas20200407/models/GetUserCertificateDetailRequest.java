// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserCertificateDetailRequest} extends {@link RequestModel}
 *
 * <p>GetUserCertificateDetailRequest</p>
 */
public class GetUserCertificateDetailRequest extends Request {
    @Query
    @NameInMap("CertFilter")
    private Boolean certFilter;

    @Query
    @NameInMap("CertId")
    @Validation(required = true)
    private Long certId;

    private GetUserCertificateDetailRequest(Builder builder) {
        super(builder);
        this.certFilter = builder.certFilter;
        this.certId = builder.certId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserCertificateDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certFilter
     */
    public Boolean getCertFilter() {
        return this.certFilter;
    }

    /**
     * @return certId
     */
    public Long getCertId() {
        return this.certId;
    }

    public static final class Builder extends Request.Builder<GetUserCertificateDetailRequest, Builder> {
        private Boolean certFilter; 
        private Long certId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserCertificateDetailRequest request) {
            super(request);
            this.certFilter = request.certFilter;
            this.certId = request.certId;
        } 

        /**
         * If true，the Cert、Key、EncryptCert、EncryptPrivateKey、SignCert、SignPrivateKey will return null，default is false。
         */
        public Builder certFilter(Boolean certFilter) {
            this.putQueryParameter("CertFilter", certFilter);
            this.certFilter = certFilter;
            return this;
        }

        /**
         * The ID of the certificate.
         */
        public Builder certId(Long certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        @Override
        public GetUserCertificateDetailRequest build() {
            return new GetUserCertificateDetailRequest(this);
        } 

    } 

}
