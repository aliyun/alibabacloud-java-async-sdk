// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsCertificateDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeVsCertificateDetailRequest</p>
 */
public class DescribeVsCertificateDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private DescribeVsCertificateDetailRequest(Builder builder) {
        super(builder);
        this.certName = builder.certName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsCertificateDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeVsCertificateDetailRequest, Builder> {
        private String certName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVsCertificateDetailRequest request) {
            super(request);
            this.certName = request.certName;
            this.ownerId = request.ownerId;
        } 

        /**
         * CertName.
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeVsCertificateDetailRequest build() {
            return new DescribeVsCertificateDetailRequest(this);
        } 

    } 

}
