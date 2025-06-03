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
 * {@link CreateCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCertificateResponseBody</p>
 */
public class CreateCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateCertificateResponseBody model) {
            this.arn = model.arn;
            this.certificateId = model.certificateId;
            this.csr = model.csr;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:cn-hangzhou:154035569884****:certificate/98e85c94-52d0-40c9-b3b2-afda52f4****</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>The ID of the certificate. It is the globally unique identifier (GUID) of the certificate in Certificates Manager.</p>
         * 
         * <strong>example:</strong>
         * <p>9a28de48-8d8b-484d-a766-dec4****</p>
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The CSR in the PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE REQUEST-----\nMIIDADCCAegCAQAwgboxCzAJBgNVBAYTAkNOMREwDwYDVQQIEwhaaGVqaWFuZzER\n****\nmkj4rg==\n-----END CERTIFICATE REQUEST-----\n</p>
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>15a735a1-8fe6-45cc-a64c-3c4ff839334e</p>
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
