// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveCertificateDetailResponseBody</p>
 */
public class DescribeLiveCertificateDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cert")
    private String cert;

    @com.aliyun.core.annotation.NameInMap("CertId")
    private Long certId;

    @com.aliyun.core.annotation.NameInMap("CertName")
    private String certName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveCertificateDetailResponseBody(Builder builder) {
        this.cert = builder.cert;
        this.certId = builder.certId;
        this.certName = builder.certName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveCertificateDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cert
     */
    public String getCert() {
        return this.cert;
    }

    /**
     * @return certId
     */
    public Long getCertId() {
        return this.certId;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cert; 
        private Long certId; 
        private String certName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveCertificateDetailResponseBody model) {
            this.cert = model.cert;
            this.certId = model.certId;
            this.certName = model.certName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The content of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----****-----END CERTIFICATE-----</p>
         */
        public Builder cert(String cert) {
            this.cert = cert;
            return this;
        }

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>23451111</p>
         */
        public Builder certId(Long certId) {
            this.certId = certId;
            return this;
        }

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Cert-****</p>
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C7C69682-7F88-40DD-A198-10D0309E439B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveCertificateDetailResponseBody build() {
            return new DescribeLiveCertificateDetailResponseBody(this);
        } 

    } 

}
