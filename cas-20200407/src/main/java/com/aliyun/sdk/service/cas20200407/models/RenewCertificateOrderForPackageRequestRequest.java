// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewCertificateOrderForPackageRequestRequest} extends {@link RequestModel}
 *
 * <p>RenewCertificateOrderForPackageRequestRequest</p>
 */
public class RenewCertificateOrderForPackageRequestRequest extends Request {
    @Query
    @NameInMap("Csr")
    private String csr;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private Long orderId;

    private RenewCertificateOrderForPackageRequestRequest(Builder builder) {
        super(builder);
        this.csr = builder.csr;
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewCertificateOrderForPackageRequestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    public static final class Builder extends Request.Builder<RenewCertificateOrderForPackageRequestRequest, Builder> {
        private String csr; 
        private Long orderId; 

        private Builder() {
            super();
        } 

        private Builder(RenewCertificateOrderForPackageRequestRequest response) {
            super(response);
            this.csr = response.csr;
            this.orderId = response.orderId;
        } 

        /**
         * Csr.
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public RenewCertificateOrderForPackageRequestRequest build() {
            return new RenewCertificateOrderForPackageRequestRequest(this);
        } 

    } 

}
