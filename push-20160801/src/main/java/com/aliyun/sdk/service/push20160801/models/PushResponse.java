// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushResponse} extends {@link TeaModel}
 *
 * <p>PushResponse</p>
 */
public class PushResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushResponseBody body;

    private PushResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushResponse create() {
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
    public PushResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushResponseBody body);

        @Override
        PushResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushResponse response) {
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
        public Builder body(PushResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushResponse build() {
            return new PushResponse(this);
        } 

    } 

}
