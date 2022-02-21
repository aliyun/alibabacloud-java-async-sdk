// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCertificateResponseBody</p>
 */
public class CreateCertificateResponseBody extends TeaModel {
    @NameInMap("Arn")
    private String arn;

    @NameInMap("CertificateId")
    private String certificateId;

    @NameInMap("Csr")
    private String csr;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCertificateResponseBody(Builder builder) {
        this.arn = builder.arn;
        this.certificateId = builder.certificateId;
        this.csr = builder.csr;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String arn; 
        private String certificateId; 
        private String csr; 
        private String requestId; 

        /**
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * Csr.
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCertificateResponseBody build() {
            return new CreateCertificateResponseBody(this);
        } 

    } 

}
