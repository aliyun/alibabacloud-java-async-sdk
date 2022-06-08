// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateRequest} extends {@link RequestModel}
 *
 * <p>DescribeCertificateRequest</p>
 */
public class DescribeCertificateRequest extends Request {
    @Query
    @NameInMap("CertificateId")
    @Validation(required = true)
    private String certificateId;

    private DescribeCertificateRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCertificateRequest, Builder> {
        private String certificateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCertificateRequest request) {
            super(request);
            this.certificateId = request.certificateId;
        } 

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        @Override
        public DescribeCertificateRequest build() {
            return new DescribeCertificateRequest(this);
        } 

    } 

}
