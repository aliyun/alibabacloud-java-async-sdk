// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>Specifies whether to filter return results. Valid values: true and false. Default value: false. <strong>true</strong> specifies that the Cert, Key, EncryptCert, EncryptPrivateKey, SignCert, and SignPrivateKey parameters are not returned. <strong>false</strong> specifies that the parameters are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder certFilter(Boolean certFilter) {
            this.putQueryParameter("CertFilter", certFilter);
            this.certFilter = certFilter;
            return this;
        }

        /**
         * <p>The ID of the certificate.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6055048</p>
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
