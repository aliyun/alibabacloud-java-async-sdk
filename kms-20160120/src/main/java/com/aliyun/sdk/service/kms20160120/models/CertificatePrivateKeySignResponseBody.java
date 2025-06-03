// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CertificatePrivateKeySignResponseBody} extends {@link TeaModel}
 *
 * <p>CertificatePrivateKeySignResponseBody</p>
 */
public class CertificatePrivateKeySignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignatureValue")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CertificatePrivateKeySignResponseBody model) {
            this.certificateId = model.certificateId;
            this.requestId = model.requestId;
            this.signatureValue = model.signatureValue;
        } 

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-12345678****</p>
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>5979d897-d69f-4fc9-87dd-f3bb73c40b80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The signature value.</p>
         * <p>The value is encoded in Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</p>
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
