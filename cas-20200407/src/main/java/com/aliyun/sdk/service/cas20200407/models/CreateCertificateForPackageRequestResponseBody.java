// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCertificateForPackageRequestResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCertificateForPackageRequestResponseBody</p>
 */
public class CreateCertificateForPackageRequestResponseBody extends TeaModel {
    @NameInMap("OrderId")
    private Long orderId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCertificateForPackageRequestResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCertificateForPackageRequestResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long orderId; 
        private String requestId; 

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCertificateForPackageRequestResponseBody build() {
            return new CreateCertificateForPackageRequestResponseBody(this);
        } 

    } 

}
