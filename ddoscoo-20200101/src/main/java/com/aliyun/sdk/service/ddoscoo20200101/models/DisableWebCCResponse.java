// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableWebCCResponse} extends {@link TeaModel}
 *
 * <p>DisableWebCCResponse</p>
 */
public class DisableWebCCResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableWebCCResponseBody body;

    private DisableWebCCResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableWebCCResponse create() {
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
    public DisableWebCCResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableWebCCResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableWebCCResponseBody body);

        @Override
        DisableWebCCResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableWebCCResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableWebCCResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableWebCCResponse response) {
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
        public Builder body(DisableWebCCResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableWebCCResponse build() {
            return new DisableWebCCResponse(this);
        } 

    } 

}
