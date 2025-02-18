// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link UploadUserCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>UploadUserCertificateResponseBody</p>
 */
public class UploadUserCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertId")
    private Long certId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private UploadUserCertificateResponseBody(Builder builder) {
        this.certId = builder.certId;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
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

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder {
        private Long certId; 
        private String requestId; 
        private String resourceId; 

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder certId(Long certId) {
            this.certId = certId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BDB81BA2-E1F5-4D08-A2DD-4BE2BF44C90E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-upload-j2ofdb</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public UploadUserCertificateResponseBody build() {
            return new UploadUserCertificateResponseBody(this);
        } 

    } 

}
