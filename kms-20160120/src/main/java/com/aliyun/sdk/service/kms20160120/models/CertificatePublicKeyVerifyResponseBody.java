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
 * {@link CertificatePublicKeyVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>CertificatePublicKeyVerifyResponseBody</p>
 */
public class CertificatePublicKeyVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignatureValid")
    private Boolean signatureValid;

    private CertificatePublicKeyVerifyResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.requestId = builder.requestId;
        this.signatureValid = builder.signatureValid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePublicKeyVerifyResponseBody create() {
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
     * @return signatureValid
     */
    public Boolean getSignatureValid() {
        return this.signatureValid;
    }

    public static final class Builder {
        private String certificateId; 
        private String requestId; 
        private Boolean signatureValid; 

        private Builder() {
        } 

        private Builder(CertificatePublicKeyVerifyResponseBody model) {
            this.certificateId = model.certificateId;
            this.requestId = model.requestId;
            this.signatureValid = model.signatureValid;
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
         * <p>The verification result. Valid values:</p>
         * <ul>
         * <li>true: The signature is valid.</li>
         * <li>false: The signature is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder signatureValid(Boolean signatureValid) {
            this.signatureValid = signatureValid;
            return this;
        }

        public CertificatePublicKeyVerifyResponseBody build() {
            return new CertificatePublicKeyVerifyResponseBody(this);
        } 

    } 

}
