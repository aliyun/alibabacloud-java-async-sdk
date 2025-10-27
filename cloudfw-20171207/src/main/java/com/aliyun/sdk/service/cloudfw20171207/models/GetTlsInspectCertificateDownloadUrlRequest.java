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
 * {@link GetTlsInspectCertificateDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetTlsInspectCertificateDownloadUrlRequest</p>
 */
public class GetTlsInspectCertificateDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaCertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caCertId;

    private GetTlsInspectCertificateDownloadUrlRequest(Builder builder) {
        super(builder);
        this.caCertId = builder.caCertId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTlsInspectCertificateDownloadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCertId
     */
    public String getCaCertId() {
        return this.caCertId;
    }

    public static final class Builder extends Request.Builder<GetTlsInspectCertificateDownloadUrlRequest, Builder> {
        private String caCertId; 

        private Builder() {
            super();
        } 

        private Builder(GetTlsInspectCertificateDownloadUrlRequest request) {
            super(request);
            this.caCertId = request.caCertId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C3E91391-16CD-1BFC-A133-******D429</p>
         */
        public Builder caCertId(String caCertId) {
            this.putQueryParameter("CaCertId", caCertId);
            this.caCertId = caCertId;
            return this;
        }

        @Override
        public GetTlsInspectCertificateDownloadUrlRequest build() {
            return new GetTlsInspectCertificateDownloadUrlRequest(this);
        } 

    } 

}
