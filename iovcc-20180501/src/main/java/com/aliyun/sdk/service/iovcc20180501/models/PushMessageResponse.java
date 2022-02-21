// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMessageResponse} extends {@link TeaModel}
 *
 * <p>PushMessageResponse</p>
 */
public class PushMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushMessageResponseBody body;

    private PushMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushMessageResponse create() {
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
    public PushMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushMessageResponseBody body);

        @Override
        PushMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushMessageResponse response) {
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
        public Builder body(PushMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushMessageResponse build() {
            return new PushMessageResponse(this);
        } 

    } 

}
