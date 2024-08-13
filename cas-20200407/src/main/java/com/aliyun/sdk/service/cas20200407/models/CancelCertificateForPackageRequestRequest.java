// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelCertificateForPackageRequestRequest} extends {@link RequestModel}
 *
 * <p>CancelCertificateForPackageRequestRequest</p>
 */
public class CancelCertificateForPackageRequestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderId;

    private CancelCertificateForPackageRequestRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelCertificateForPackageRequestRequest create() {
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

    public static final class Builder extends Request.Builder<CancelCertificateForPackageRequestRequest, Builder> {
        private Long orderId; 

        private Builder() {
            super();
        } 

        private Builder(CancelCertificateForPackageRequestRequest request) {
            super(request);
            this.orderId = request.orderId;
        } 

        /**
         * The order ID.
         * <p>
         * 
         * >  You can call the [ListUserCertificateOrder](~~455804~~) operation to obtain the ID.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public CancelCertificateForPackageRequestRequest build() {
            return new CancelCertificateForPackageRequestRequest(this);
        } 

    } 

}
