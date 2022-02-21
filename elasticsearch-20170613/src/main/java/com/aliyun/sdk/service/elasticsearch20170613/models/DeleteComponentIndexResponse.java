// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteComponentIndexResponse} extends {@link TeaModel}
 *
 * <p>DeleteComponentIndexResponse</p>
 */
public class DeleteComponentIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteComponentIndexResponseBody body;

    private DeleteComponentIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteComponentIndexResponse create() {
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
    public DeleteComponentIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteComponentIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteComponentIndexResponseBody body);

        @Override
        DeleteComponentIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteComponentIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteComponentIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteComponentIndexResponse response) {
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
        public Builder body(DeleteComponentIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteComponentIndexResponse build() {
            return new DeleteComponentIndexResponse(this);
        } 

    } 

}
