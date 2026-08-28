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
 * {@link ShareCertificateRequest} extends {@link RequestModel}
 *
 * <p>ShareCertificateRequest</p>
 */
public class ShareCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long certificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long targetUserId;

    private ShareCertificateRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShareCertificateRequest create() {
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

    /**
     * @return targetUserId
     */
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder<ShareCertificateRequest, Builder> {
        private Long certificateId; 
        private Long targetUserId; 

        private Builder() {
            super();
        } 

        private Builder(ShareCertificateRequest request) {
            super(request);
            this.certificateId = request.certificateId;
            this.targetUserId = request.targetUserId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23279004</p>
         */
        public Builder certificateId(Long certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1622883344556677</p>
         */
        public Builder targetUserId(Long targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        @Override
        public ShareCertificateRequest build() {
            return new ShareCertificateRequest(this);
        } 

    } 

}
