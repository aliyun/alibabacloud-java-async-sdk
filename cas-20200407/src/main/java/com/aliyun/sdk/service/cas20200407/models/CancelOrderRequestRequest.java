// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOrderRequestRequest} extends {@link RequestModel}
 *
 * <p>CancelOrderRequestRequest</p>
 */
public class CancelOrderRequestRequest extends Request {
    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private Long orderId;

    private CancelOrderRequestRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOrderRequestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    public static final class Builder extends Request.Builder<CancelOrderRequestRequest, Builder> {
        private Long orderId; 

        private Builder() {
            super();
        } 

        private Builder(CancelOrderRequestRequest request) {
            super(request);
            this.orderId = request.orderId;
        } 

        /**
         * The ID of the certificate application order that you want to cancel.
         * <p>
         * 
         * >  After you call the [CreateCertificateForPackageRequest](~~CreateCertificateForPackageRequest~~), [CreateCertificateRequest](~~CreateCertificateRequest~~), or [CreateCertificateWithCsrRequest](~~CreateCertificateWithCsrRequest~~) operation to submit a certificate application, you can obtain the ID of the certificate application order from the **OrderId** response parameter.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public CancelOrderRequestRequest build() {
            return new CancelOrderRequestRequest(this);
        } 

    } 

}
