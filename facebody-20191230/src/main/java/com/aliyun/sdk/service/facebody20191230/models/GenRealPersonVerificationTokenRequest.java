// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenRealPersonVerificationTokenRequest} extends {@link RequestModel}
 *
 * <p>GenRealPersonVerificationTokenRequest</p>
 */
public class GenRealPersonVerificationTokenRequest extends Request {
    @Body
    @NameInMap("CertificateName")
    @Validation(required = true)
    private String certificateName;

    @Body
    @NameInMap("CertificateNumber")
    @Validation(required = true)
    private String certificateNumber;

    @Body
    @NameInMap("MetaInfo")
    @Validation(required = true)
    private String metaInfo;

    private GenRealPersonVerificationTokenRequest(Builder builder) {
        super(builder);
        this.certificateName = builder.certificateName;
        this.certificateNumber = builder.certificateNumber;
        this.metaInfo = builder.metaInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenRealPersonVerificationTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateName
     */
    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * @return certificateNumber
     */
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    /**
     * @return metaInfo
     */
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public static final class Builder extends Request.Builder<GenRealPersonVerificationTokenRequest, Builder> {
        private String certificateName; 
        private String certificateNumber; 
        private String metaInfo; 

        private Builder() {
            super();
        } 

        private Builder(GenRealPersonVerificationTokenRequest request) {
            super(request);
            this.certificateName = request.certificateName;
            this.certificateNumber = request.certificateNumber;
            this.metaInfo = request.metaInfo;
        } 

        /**
         * CertificateName.
         */
        public Builder certificateName(String certificateName) {
            this.putBodyParameter("CertificateName", certificateName);
            this.certificateName = certificateName;
            return this;
        }

        /**
         * CertificateNumber.
         */
        public Builder certificateNumber(String certificateNumber) {
            this.putBodyParameter("CertificateNumber", certificateNumber);
            this.certificateNumber = certificateNumber;
            return this;
        }

        /**
         * MetaInfo.
         */
        public Builder metaInfo(String metaInfo) {
            this.putBodyParameter("MetaInfo", metaInfo);
            this.metaInfo = metaInfo;
            return this;
        }

        @Override
        public GenRealPersonVerificationTokenRequest build() {
            return new GenRealPersonVerificationTokenRequest(this);
        } 

    } 

}
