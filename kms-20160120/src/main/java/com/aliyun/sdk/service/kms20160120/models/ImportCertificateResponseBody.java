// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>ImportCertificateResponseBody</p>
 */
public class ImportCertificateResponseBody extends TeaModel {
    @NameInMap("Arn")
    private String arn;

    @NameInMap("CertificateId")
    private String certificateId;

    @NameInMap("RequestId")
    private String requestId;

    private ImportCertificateResponseBody(Builder builder) {
        this.arn = builder.arn;
        this.certificateId = builder.certificateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportCertificateResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String arn; 
        private String certificateId; 
        private String requestId; 

        /**
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
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

        public ImportCertificateResponseBody build() {
            return new ImportCertificateResponseBody(this);
        } 

    } 

}
