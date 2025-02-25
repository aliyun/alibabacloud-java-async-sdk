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
 * {@link RenewCertificateOrderForPackageRequestResponseBody} extends {@link TeaModel}
 *
 * <p>RenewCertificateOrderForPackageRequestResponseBody</p>
 */
public class RenewCertificateOrderForPackageRequestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RenewCertificateOrderForPackageRequestResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewCertificateOrderForPackageRequestResponseBody create() {
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
         * <p>The ID of the certificate application order that is renewed.</p>
         * <blockquote>
         * <p> You can use the ID to query the status of the certificate application order. For more information, see <a href="https://help.aliyun.com/document_detail/164111.html">DescribeCertificateState</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>323451222</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>082FAB35-6AB9-4FD5-8750-D36673548E76</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RenewCertificateOrderForPackageRequestResponseBody build() {
            return new RenewCertificateOrderForPackageRequestResponseBody(this);
        } 

    } 

}
