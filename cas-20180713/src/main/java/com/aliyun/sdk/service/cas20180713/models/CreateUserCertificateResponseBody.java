// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserCertificateResponseBody</p>
 */
public class CreateUserCertificateResponseBody extends TeaModel {
    @NameInMap("CertId")
    private Long certId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateUserCertificateResponseBody(Builder builder) {
        this.certId = builder.certId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserCertificateResponseBody create() {
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
         * CertId.
         */
        public Builder certId(Long certId) {
            this.certId = certId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateUserCertificateResponseBody build() {
            return new CreateUserCertificateResponseBody(this);
        } 

    } 

}
