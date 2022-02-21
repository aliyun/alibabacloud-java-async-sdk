// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushVersionMessageResponse} extends {@link TeaModel}
 *
 * <p>PushVersionMessageResponse</p>
 */
public class PushVersionMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushVersionMessageResponseBody body;

    private PushVersionMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushVersionMessageResponse create() {
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
    public PushVersionMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushVersionMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushVersionMessageResponseBody body);

        @Override
        PushVersionMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushVersionMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushVersionMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushVersionMessageResponse response) {
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
        public Builder body(PushVersionMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushVersionMessageResponse build() {
            return new PushVersionMessageResponse(this);
        } 

    } 

}
