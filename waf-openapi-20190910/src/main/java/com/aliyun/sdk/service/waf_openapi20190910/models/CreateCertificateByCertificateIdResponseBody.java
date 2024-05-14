// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCertificateByCertificateIdResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCertificateByCertificateIdResponseBody</p>
 */
public class CreateCertificateByCertificateIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private Long certificateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCertificateByCertificateIdResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCertificateByCertificateIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateId
     */
    public Long getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long certificateId; 
        private String requestId; 

        /**
         * CertificateId.
         */
        public Builder certificateId(Long certificateId) {
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

        public CreateCertificateByCertificateIdResponseBody build() {
            return new CreateCertificateByCertificateIdResponseBody(this);
        } 

    } 

}
