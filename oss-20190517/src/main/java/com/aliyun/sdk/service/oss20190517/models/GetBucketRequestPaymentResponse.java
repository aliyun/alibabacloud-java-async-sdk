// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketRequestPaymentResponse} extends {@link TeaModel}
 *
 * <p>GetBucketRequestPaymentResponse</p>
 */
public class GetBucketRequestPaymentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketRequestPaymentResponseBody body;

    private GetBucketRequestPaymentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketRequestPaymentResponse create() {
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
    public GetBucketRequestPaymentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketRequestPaymentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketRequestPaymentResponseBody body);

        @Override
        GetBucketRequestPaymentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketRequestPaymentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketRequestPaymentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketRequestPaymentResponse response) {
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
        public Builder body(GetBucketRequestPaymentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketRequestPaymentResponse build() {
            return new GetBucketRequestPaymentResponse(this);
        } 

    } 

}
