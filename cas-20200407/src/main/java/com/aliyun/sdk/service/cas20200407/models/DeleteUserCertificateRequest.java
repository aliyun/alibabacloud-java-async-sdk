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
 * {@link DeleteUserCertificateRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserCertificateRequest</p>
 */
public class DeleteUserCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long certId;

    private DeleteUserCertificateRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public Long getCertId() {
        return this.certId;
    }

    public static final class Builder extends Request.Builder<DeleteUserCertificateRequest, Builder> {
        private Long certId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserCertificateRequest request) {
            super(request);
            this.certId = request.certId;
        } 

        /**
         * <p>The ID of the certificate.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation to obtain the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7562353</p>
         */
        public Builder certId(Long certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        @Override
        public DeleteUserCertificateRequest build() {
            return new DeleteUserCertificateRequest(this);
        } 

    } 

}
