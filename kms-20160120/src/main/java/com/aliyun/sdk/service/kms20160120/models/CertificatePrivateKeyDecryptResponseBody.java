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
 * {@link CertificatePrivateKeyDecryptResponseBody} extends {@link TeaModel}
 *
 * <p>CertificatePrivateKeyDecryptResponseBody</p>
 */
public class CertificatePrivateKeyDecryptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("Plaintext")
    private String plaintext;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CertificatePrivateKeyDecryptResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.plaintext = builder.plaintext;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePrivateKeyDecryptResponseBody create() {
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
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certificateId; 
        private String plaintext; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CertificatePrivateKeyDecryptResponseBody model) {
            this.certificateId = model.certificateId;
            this.plaintext = model.plaintext;
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
         * <p>The plaintext after data is decrypted.</p>
         * <p>The value is encoded in Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4</p>
         */
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
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

        public CertificatePrivateKeyDecryptResponseBody build() {
            return new CertificatePrivateKeyDecryptResponseBody(this);
        } 

    } 

}
