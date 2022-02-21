// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelReleaseProductResponse} extends {@link TeaModel}
 *
 * <p>CancelReleaseProductResponse</p>
 */
public class CancelReleaseProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelReleaseProductResponseBody body;

    private CancelReleaseProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelReleaseProductResponse create() {
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
    public CancelReleaseProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelReleaseProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelReleaseProductResponseBody body);

        @Override
        CancelReleaseProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelReleaseProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelReleaseProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelReleaseProductResponse response) {
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
        public Builder body(CancelReleaseProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelReleaseProductResponse build() {
            return new CancelReleaseProductResponse(this);
        } 

    } 

}
