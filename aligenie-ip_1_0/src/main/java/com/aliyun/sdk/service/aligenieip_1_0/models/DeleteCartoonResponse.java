// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCartoonResponse} extends {@link TeaModel}
 *
 * <p>DeleteCartoonResponse</p>
 */
public class DeleteCartoonResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCartoonResponseBody body;

    private DeleteCartoonResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCartoonResponse create() {
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
    public DeleteCartoonResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCartoonResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCartoonResponseBody body);

        @Override
        DeleteCartoonResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCartoonResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCartoonResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCartoonResponse response) {
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
        public Builder body(DeleteCartoonResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCartoonResponse build() {
            return new DeleteCartoonResponse(this);
        } 

    } 

}
