// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseProductResponse} extends {@link TeaModel}
 *
 * <p>ReleaseProductResponse</p>
 */
public class ReleaseProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseProductResponseBody body;

    private ReleaseProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseProductResponse create() {
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
    public ReleaseProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseProductResponseBody body);

        @Override
        ReleaseProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseProductResponse response) {
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
        public Builder body(ReleaseProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseProductResponse build() {
            return new ReleaseProductResponse(this);
        } 

    } 

}
