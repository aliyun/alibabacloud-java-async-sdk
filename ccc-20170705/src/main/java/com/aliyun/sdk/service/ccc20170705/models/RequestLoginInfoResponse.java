// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestLoginInfoResponse} extends {@link TeaModel}
 *
 * <p>RequestLoginInfoResponse</p>
 */
public class RequestLoginInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RequestLoginInfoResponseBody body;

    private RequestLoginInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RequestLoginInfoResponse create() {
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
    public RequestLoginInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RequestLoginInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RequestLoginInfoResponseBody body);

        @Override
        RequestLoginInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RequestLoginInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RequestLoginInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RequestLoginInfoResponse response) {
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
        public Builder body(RequestLoginInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RequestLoginInfoResponse build() {
            return new RequestLoginInfoResponse(this);
        } 

    } 

}
