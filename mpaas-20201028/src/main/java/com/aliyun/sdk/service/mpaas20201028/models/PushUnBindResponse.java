// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushUnBindResponse} extends {@link TeaModel}
 *
 * <p>PushUnBindResponse</p>
 */
public class PushUnBindResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushUnBindResponseBody body;

    private PushUnBindResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushUnBindResponse create() {
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
    public PushUnBindResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushUnBindResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushUnBindResponseBody body);

        @Override
        PushUnBindResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushUnBindResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushUnBindResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushUnBindResponse response) {
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
        public Builder body(PushUnBindResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushUnBindResponse build() {
            return new PushUnBindResponse(this);
        } 

    } 

}
