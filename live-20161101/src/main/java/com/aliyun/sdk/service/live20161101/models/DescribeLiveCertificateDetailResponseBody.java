// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveCertificateDetailResponseBody</p>
 */
public class DescribeLiveCertificateDetailResponseBody extends TeaModel {
    @NameInMap("Cert")
    private String cert;

    @NameInMap("CertId")
    private Long certId;

    @NameInMap("CertName")
    private String certName;

    @NameInMap("RequestId")
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

        /**
         * Cert.
         */
        public Builder cert(String cert) {
            this.cert = cert;
            return this;
        }

        /**
         * CertId.
         */
        public Builder certId(Long certId) {
            this.certId = certId;
            return this;
        }

        /**
         * CertName.
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * RequestId.
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
