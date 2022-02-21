// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePrivateKeySignResponseBody} extends {@link TeaModel}
 *
 * <p>CertificatePrivateKeySignResponseBody</p>
 */
public class CertificatePrivateKeySignResponseBody extends TeaModel {
    @NameInMap("CertificateId")
    private String certificateId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SignatureValue")
    private String signatureValue;

    private CertificatePrivateKeySignResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.requestId = builder.requestId;
        this.signatureValue = builder.signatureValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePrivateKeySignResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signatureValue
     */
    public String getSignatureValue() {
        return this.signatureValue;
    }

    public static final class Builder {
        private String certificateId; 
        private String requestId; 
        private String signatureValue; 

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SignatureValue.
         */
        public Builder signatureValue(String signatureValue) {
            this.signatureValue = signatureValue;
            return this;
        }

        public CertificatePrivateKeySignResponseBody build() {
            return new CertificatePrivateKeySignResponseBody(this);
        } 

    } 

}
