// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCertificateResponseBody</p>
 */
public class CreateCertificateResponseBody extends TeaModel {
    @NameInMap("CertificateId")
    private Long certificateId;

    @NameInMap("RequestId")
    private String requestId;


    private CreateCertificateResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCertificateResponseBody create() {
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
         * <p>CertificateId.</p>
         */
        public Builder certificateId(Long certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>RequestId.</p>
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
