// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCertificateForPackageRequestResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCertificateForPackageRequestResponseBody</p>
 */
public class CreateCertificateForPackageRequestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The ID of the certificate application order.
         * <p>
         * 
         * > You can use the ID to query the status of the certificate application order. For more information, see [DescribeCertificateState](~~455800~~).
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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
