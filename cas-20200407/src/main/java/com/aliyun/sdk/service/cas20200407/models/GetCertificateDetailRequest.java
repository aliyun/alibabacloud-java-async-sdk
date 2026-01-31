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
 * {@link GetCertificateDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCertificateDetailRequest</p>
 */
public class GetCertificateDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long certificateId;

    private GetCertificateDetailRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertificateDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateId
     */
    public Long getCertificateId() {
        return this.certificateId;
    }

    public static final class Builder extends Request.Builder<GetCertificateDetailRequest, Builder> {
        private Long certificateId; 

        private Builder() {
            super();
        } 

        private Builder(GetCertificateDetailRequest request) {
            super(request);
            this.certificateId = request.certificateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18594156</p>
         */
        public Builder certificateId(Long certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        @Override
        public GetCertificateDetailRequest build() {
            return new GetCertificateDetailRequest(this);
        } 

    } 

}
