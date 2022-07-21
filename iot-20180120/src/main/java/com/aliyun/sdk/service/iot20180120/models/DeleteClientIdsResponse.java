// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClientIdsResponse} extends {@link TeaModel}
 *
 * <p>DeleteClientIdsResponse</p>
 */
public class DeleteClientIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteClientIdsResponseBody body;

    private DeleteClientIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteClientIdsResponse create() {
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
    public DeleteClientIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteClientIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteClientIdsResponseBody body);

        @Override
        DeleteClientIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteClientIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteClientIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteClientIdsResponse response) {
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
        public Builder body(DeleteClientIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteClientIdsResponse build() {
            return new DeleteClientIdsResponse(this);
        } 

    } 

}
