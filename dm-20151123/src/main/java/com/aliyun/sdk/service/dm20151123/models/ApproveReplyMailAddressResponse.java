// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveReplyMailAddressResponse} extends {@link TeaModel}
 *
 * <p>ApproveReplyMailAddressResponse</p>
 */
public class ApproveReplyMailAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApproveReplyMailAddressResponseBody body;

    private ApproveReplyMailAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApproveReplyMailAddressResponse create() {
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
     * @return body
     */
    public ApproveReplyMailAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApproveReplyMailAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApproveReplyMailAddressResponseBody body);

        @Override
        ApproveReplyMailAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApproveReplyMailAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApproveReplyMailAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApproveReplyMailAddressResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(ApproveReplyMailAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApproveReplyMailAddressResponse build() {
            return new ApproveReplyMailAddressResponse(this);
        } 

    } 

}
