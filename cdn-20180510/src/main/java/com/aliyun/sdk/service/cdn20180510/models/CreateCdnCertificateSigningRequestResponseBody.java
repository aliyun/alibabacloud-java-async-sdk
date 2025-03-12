// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link CreateCdnCertificateSigningRequestResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCdnCertificateSigningRequestResponseBody</p>
 */
public class CreateCdnCertificateSigningRequestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.NameInMap("PubMd5")
    private String pubMd5;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCdnCertificateSigningRequestResponseBody(Builder builder) {
        this.commonName = builder.commonName;
        this.csr = builder.csr;
        this.pubMd5 = builder.pubMd5;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdnCertificateSigningRequestResponseBody create() {
        return builder().build();
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return pubMd5
     */
    public String getPubMd5() {
        return this.pubMd5;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String commonName; 
        private String csr; 
        private String pubMd5; 
        private String requestId; 

        /**
         * <p>The Common Name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>CommonName</p>
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The content of the CSR file.</p>
         * 
         * <strong>example:</strong>
         * <p>CSRName</p>
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * <p>The MD5 hash value of the certificate public key.</p>
         * 
         * <strong>example:</strong>
         * <p>629bf4fd8104eda171135bcb0f77****</p>
         */
        public Builder pubMd5(String pubMd5) {
            this.pubMd5 = pubMd5;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCdnCertificateSigningRequestResponseBody build() {
            return new CreateCdnCertificateSigningRequestResponseBody(this);
        } 

    } 

}
