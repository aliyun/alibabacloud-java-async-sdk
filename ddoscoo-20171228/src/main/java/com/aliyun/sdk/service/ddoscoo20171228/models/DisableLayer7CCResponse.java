// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableLayer7CCResponse} extends {@link TeaModel}
 *
 * <p>DisableLayer7CCResponse</p>
 */
public class DisableLayer7CCResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableLayer7CCResponseBody body;

    private DisableLayer7CCResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableLayer7CCResponse create() {
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
    public DisableLayer7CCResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableLayer7CCResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableLayer7CCResponseBody body);

        @Override
        DisableLayer7CCResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableLayer7CCResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableLayer7CCResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableLayer7CCResponse response) {
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
        public Builder body(DisableLayer7CCResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableLayer7CCResponse build() {
            return new DisableLayer7CCResponse(this);
        } 

    } 

}
