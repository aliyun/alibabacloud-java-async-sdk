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
         * CaCertId.
         */
        public Builder caCertId(String caCertId) {
            this.caCertId = caCertId;
            return this;
        }

        /**
         * DownloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * RequestId.
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
