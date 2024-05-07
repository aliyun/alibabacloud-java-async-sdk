// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelRefundOrderResponse} extends {@link TeaModel}
 *
 * <p>CancelRefundOrderResponse</p>
 */
public class CancelRefundOrderResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RefundOrderResult body;

    private CancelRefundOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CancelRefundOrderResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public RefundOrderResult getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelRefundOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RefundOrderResult body);

        @Override
        CancelRefundOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelRefundOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RefundOrderResult body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelRefundOrderResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(RefundOrderResult body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelRefundOrderResponse build() {
            return new CancelRefundOrderResponse(this);
        } 

    } 

}
