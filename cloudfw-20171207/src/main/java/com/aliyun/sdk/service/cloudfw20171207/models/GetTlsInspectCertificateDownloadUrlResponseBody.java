// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link GetTlsInspectCertificateDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetTlsInspectCertificateDownloadUrlResponseBody</p>
 */
public class GetTlsInspectCertificateDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CaCertId")
    private String caCertId;

    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTlsInspectCertificateDownloadUrlResponseBody(Builder builder) {
        this.caCertId = builder.caCertId;
        this.downloadUrl = builder.downloadUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTlsInspectCertificateDownloadUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCertId
     */
    public String getCaCertId() {
        return this.caCertId;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String caCertId; 
        private String downloadUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTlsInspectCertificateDownloadUrlResponseBody model) {
            this.caCertId = model.caCertId;
            this.downloadUrl = model.downloadUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1f07c104-99ed-6b9a-b0bb-2938c9b8****</p>
         */
        public Builder caCertId(String caCertId) {
            this.caCertId = caCertId;
            return this;
        }

        /**
         * <p>The download path of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cfw-tls-inspect-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/tls_cert%2F2025-08-13%2F1850">https://cfw-tls-inspect-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/tls_cert%2F2025-08-13%2F1850</a>****</p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>850A84D6-0DE4-4797-A1E8-******h4j6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTlsInspectCertificateDownloadUrlResponseBody build() {
            return new GetTlsInspectCertificateDownloadUrlResponseBody(this);
        } 

    } 

}
