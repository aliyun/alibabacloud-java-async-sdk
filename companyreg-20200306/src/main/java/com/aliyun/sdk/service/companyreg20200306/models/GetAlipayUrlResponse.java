// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlipayUrlResponse} extends {@link TeaModel}
 *
 * <p>GetAlipayUrlResponse</p>
 */
public class GetAlipayUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAlipayUrlResponseBody body;

    private GetAlipayUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAlipayUrlResponse create() {
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
    public GetAlipayUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAlipayUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAlipayUrlResponseBody body);

        @Override
        GetAlipayUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAlipayUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAlipayUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAlipayUrlResponse response) {
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
        public Builder body(GetAlipayUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAlipayUrlResponse build() {
            return new GetAlipayUrlResponse(this);
        } 

    } 

}
