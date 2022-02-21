// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateInfoByIDRequest} extends {@link RequestModel}
 *
 * <p>DescribeCertificateInfoByIDRequest</p>
 */
public class DescribeCertificateInfoByIDRequest extends Request {
    @Query
    @NameInMap("CertId")
    @Validation(required = true)
    private String certId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeCertificateInfoByIDRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertificateInfoByIDRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeCertificateInfoByIDRequest, Builder> {
        private String certId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCertificateInfoByIDRequest response) {
            super(response);
            this.certId = response.certId;
            this.ownerId = response.ownerId;
        } 

        /**
         * CertId.
         */
        public Builder certId(String certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
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
        public DescribeCertificateInfoByIDRequest build() {
            return new DescribeCertificateInfoByIDRequest(this);
        } 

    } 

}
