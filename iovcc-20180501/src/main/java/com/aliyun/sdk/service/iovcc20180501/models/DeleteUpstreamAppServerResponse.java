// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUpstreamAppServerResponse} extends {@link TeaModel}
 *
 * <p>DeleteUpstreamAppServerResponse</p>
 */
public class DeleteUpstreamAppServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUpstreamAppServerResponseBody body;

    private DeleteUpstreamAppServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUpstreamAppServerResponse create() {
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
    public DeleteUpstreamAppServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUpstreamAppServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUpstreamAppServerResponseBody body);

        @Override
        DeleteUpstreamAppServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUpstreamAppServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUpstreamAppServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUpstreamAppServerResponse response) {
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
        public Builder body(DeleteUpstreamAppServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUpstreamAppServerResponse build() {
            return new DeleteUpstreamAppServerResponse(this);
        } 

    } 

}
