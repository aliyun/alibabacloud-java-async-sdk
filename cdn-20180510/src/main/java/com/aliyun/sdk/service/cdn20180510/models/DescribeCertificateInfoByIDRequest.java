// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateInfoByIDRequest} extends {@link RequestModel}
 *
 * <p>DescribeCertificateInfoByIDRequest</p>
 */
public class DescribeCertificateInfoByIDRequest extends Request {
    @Query
    @NameInMap("CertId")
    @Validation(required = true)
    private String certId;

    private DescribeCertificateInfoByIDRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertificateInfoByIDRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    public static final class Builder extends Request.Builder<DescribeCertificateInfoByIDRequest, Builder> {
        private String certId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCertificateInfoByIDRequest request) {
            super(request);
            this.certId = request.certId;
        } 

        /**
         * The ID of the certificate. You can query only one certificate in each call.
         */
        public Builder certId(String certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        @Override
        public DescribeCertificateInfoByIDRequest build() {
            return new DescribeCertificateInfoByIDRequest(this);
        } 

    } 

}
