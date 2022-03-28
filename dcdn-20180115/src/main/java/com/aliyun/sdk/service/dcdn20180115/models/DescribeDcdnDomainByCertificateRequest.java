// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainByCertificateRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainByCertificateRequest</p>
 */
public class DescribeDcdnDomainByCertificateRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SSLPub")
    @Validation(required = true)
    private String SSLPub;

    private DescribeDcdnDomainByCertificateRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.SSLPub = builder.SSLPub;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainByCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return SSLPub
     */
    public String getSSLPub() {
        return this.SSLPub;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnDomainByCertificateRequest, Builder> {
        private Long ownerId; 
        private String SSLPub; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainByCertificateRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.SSLPub = request.SSLPub;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SSLPub.
         */
        public Builder SSLPub(String SSLPub) {
            this.putQueryParameter("SSLPub", SSLPub);
            this.SSLPub = SSLPub;
            return this;
        }

        @Override
        public DescribeDcdnDomainByCertificateRequest build() {
            return new DescribeDcdnDomainByCertificateRequest(this);
        } 

    } 

}
