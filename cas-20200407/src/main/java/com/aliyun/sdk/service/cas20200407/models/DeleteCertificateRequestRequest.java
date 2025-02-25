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
 * {@link DeleteCertificateRequestRequest} extends {@link RequestModel}
 *
 * <p>DeleteCertificateRequestRequest</p>
 */
public class DeleteCertificateRequestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderId;

    private DeleteCertificateRequestRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCertificateRequestRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteCertificateRequestRequest, Builder> {
        private Long orderId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCertificateRequestRequest request) {
            super(request);
            this.orderId = request.orderId;
        } 

        /**
         * <p>The ID of the certificate application order that you want to delete.</p>
         * <blockquote>
         * <p> After you call the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a>, <a href="https://help.aliyun.com/document_detail/455292.html">CreateCertificateRequest</a>, or <a href="https://help.aliyun.com/document_detail/455801.html">CreateCertificateWithCsrRequest</a> operation to submit a certificate application, you can obtain the ID of the certificate application order from the <strong>OrderId</strong> response parameter. You can also call the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation to obtain the order ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123451222</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public DeleteCertificateRequestRequest build() {
            return new DeleteCertificateRequestRequest(this);
        } 

    } 

}
