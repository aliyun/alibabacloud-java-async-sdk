// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserCertificateDetailRequest} extends {@link RequestModel}
 *
 * <p>GetUserCertificateDetailRequest</p>
 */
public class GetUserCertificateDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertFilter")
    private Boolean certFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * Specifies whether to filter return results. Valid values: true and false. Default value: false. **true** specifies that the Cert, Key, EncryptCert, EncryptPrivateKey, SignCert, and SignPrivateKey parameters are not returned. **false** specifies that the parameters are returned.
         */
        public Builder certFilter(Boolean certFilter) {
            this.putQueryParameter("CertFilter", certFilter);
            this.certFilter = certFilter;
            return this;
        }

        /**
         * The ID of the certificate.
         * <p>
         * 
         * >  You can call the [ListUserCertificateOrder](~~455804~~) operation to query the ID.
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
