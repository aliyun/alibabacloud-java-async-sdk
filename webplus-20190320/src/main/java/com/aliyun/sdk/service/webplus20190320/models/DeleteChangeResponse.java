// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteChangeResponse} extends {@link TeaModel}
 *
 * <p>DeleteChangeResponse</p>
 */
public class DeleteChangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteChangeResponseBody body;

    private DeleteChangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteChangeResponse create() {
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
    public DeleteChangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteChangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteChangeResponseBody body);

        @Override
        DeleteChangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteChangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteChangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteChangeResponse response) {
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
        public Builder body(DeleteChangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteChangeResponse build() {
            return new DeleteChangeResponse(this);
        } 

    } 

}
