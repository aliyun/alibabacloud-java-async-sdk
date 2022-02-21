// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDRMCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>AddDRMCertificateResponseBody</p>
 */
public class AddDRMCertificateResponseBody extends TeaModel {
    @NameInMap("CertId")
    private String certId;

    @NameInMap("RequestId")
    private String requestId;

    private AddDRMCertificateResponseBody(Builder builder) {
        this.certId = builder.certId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDRMCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certId; 
        private String requestId; 

        /**
         * CertId.
         */
        public Builder certId(String certId) {
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

        public AddDRMCertificateResponseBody build() {
            return new AddDRMCertificateResponseBody(this);
        } 

    } 

}
