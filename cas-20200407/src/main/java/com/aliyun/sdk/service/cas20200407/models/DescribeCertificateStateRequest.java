// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateStateRequest} extends {@link RequestModel}
 *
 * <p>DescribeCertificateStateRequest</p>
 */
public class DescribeCertificateStateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderId;

    private DescribeCertificateStateRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertificateStateRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCertificateStateRequest, Builder> {
        private Long orderId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCertificateStateRequest request) {
            super(request);
            this.orderId = request.orderId;
        } 

        /**
         * The ID of the certificate application order that you want to query.
         * <p>
         * 
         * > After you call the [CreateCertificateForPackageRequest](~~455296~~), [CreateCertificateRequest](~~455292~~), or [CreateCertificateWithCsrRequest](~~455801~~) operation to submit a certificate application, you can obtain the ID of the certificate application order from the **OrderId** response parameter.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public DescribeCertificateStateRequest build() {
            return new DescribeCertificateStateRequest(this);
        } 

    } 

}
