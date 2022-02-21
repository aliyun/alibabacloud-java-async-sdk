// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushConfigInfoResponse} extends {@link TeaModel}
 *
 * <p>PushConfigInfoResponse</p>
 */
public class PushConfigInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushConfigInfoResponseBody body;

    private PushConfigInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushConfigInfoResponse create() {
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
    public PushConfigInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushConfigInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushConfigInfoResponseBody body);

        @Override
        PushConfigInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushConfigInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushConfigInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushConfigInfoResponse response) {
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
        public Builder body(PushConfigInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushConfigInfoResponse build() {
            return new PushConfigInfoResponse(this);
        } 

    } 

}
