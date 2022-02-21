// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PubResponse} extends {@link TeaModel}
 *
 * <p>PubResponse</p>
 */
public class PubResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PubResponseBody body;

    private PubResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PubResponse create() {
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
    public PubResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PubResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PubResponseBody body);

        @Override
        PubResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PubResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PubResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PubResponse response) {
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
        public Builder body(PubResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PubResponse build() {
            return new PubResponse(this);
        } 

    } 

}
