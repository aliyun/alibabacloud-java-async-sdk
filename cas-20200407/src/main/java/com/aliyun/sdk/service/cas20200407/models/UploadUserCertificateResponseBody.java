// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadUserCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>UploadUserCertificateResponseBody</p>
 */
public class UploadUserCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertId")
    private Long certId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UploadUserCertificateResponseBody(Builder builder) {
        this.certId = builder.certId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadUserCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return certId
     */
    public Long getCertId() {
        return this.certId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long certId; 
        private String requestId; 

        /**
         * The ID of the certificate.
         */
        public Builder certId(Long certId) {
            this.certId = certId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UploadUserCertificateResponseBody build() {
            return new UploadUserCertificateResponseBody(this);
        } 

    } 

}
