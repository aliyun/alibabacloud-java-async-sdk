// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddExternalSAMLIdPCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>AddExternalSAMLIdPCertificateResponseBody</p>
 */
public class AddExternalSAMLIdPCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddExternalSAMLIdPCertificateResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddExternalSAMLIdPCertificateResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String certificateId; 
        private String requestId; 

        /**
         * The ID of the SAML signing certificate.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddExternalSAMLIdPCertificateResponseBody build() {
            return new AddExternalSAMLIdPCertificateResponseBody(this);
        } 

    } 

}
