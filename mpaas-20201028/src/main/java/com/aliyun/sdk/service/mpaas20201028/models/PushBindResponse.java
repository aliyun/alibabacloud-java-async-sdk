// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushBindResponse} extends {@link TeaModel}
 *
 * <p>PushBindResponse</p>
 */
public class PushBindResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushBindResponseBody body;

    private PushBindResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushBindResponse create() {
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
    public PushBindResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushBindResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushBindResponseBody body);

        @Override
        PushBindResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushBindResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushBindResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushBindResponse response) {
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
        public Builder body(PushBindResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushBindResponse build() {
            return new PushBindResponse(this);
        } 

    } 

}
