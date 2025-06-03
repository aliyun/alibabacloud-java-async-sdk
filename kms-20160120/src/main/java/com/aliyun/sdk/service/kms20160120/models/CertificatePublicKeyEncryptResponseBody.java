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
 * {@link CertificatePublicKeyEncryptResponseBody} extends {@link TeaModel}
 *
 * <p>CertificatePublicKeyEncryptResponseBody</p>
 */
public class CertificatePublicKeyEncryptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    private String ciphertextBlob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CertificatePublicKeyEncryptResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.ciphertextBlob = builder.ciphertextBlob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePublicKeyEncryptResponseBody create() {
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
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certificateId; 
        private String ciphertextBlob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CertificatePublicKeyEncryptResponseBody model) {
            this.certificateId = model.certificateId;
            this.ciphertextBlob = model.ciphertextBlob;
            this.requestId = model.requestId;
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
         * <p>The ciphertext.</p>
         * <p>The value is encoded in Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</p>
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = ciphertextBlob;
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

        public CertificatePublicKeyEncryptResponseBody build() {
            return new CertificatePublicKeyEncryptResponseBody(this);
        } 

    } 

}
