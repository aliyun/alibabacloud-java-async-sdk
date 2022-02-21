// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVersionTestResponse} extends {@link TeaModel}
 *
 * <p>DeleteVersionTestResponse</p>
 */
public class DeleteVersionTestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVersionTestResponseBody body;

    private DeleteVersionTestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVersionTestResponse create() {
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
    public DeleteVersionTestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVersionTestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVersionTestResponseBody body);

        @Override
        DeleteVersionTestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVersionTestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVersionTestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVersionTestResponse response) {
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
        public Builder body(DeleteVersionTestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVersionTestResponse build() {
            return new DeleteVersionTestResponse(this);
        } 

    } 

}
