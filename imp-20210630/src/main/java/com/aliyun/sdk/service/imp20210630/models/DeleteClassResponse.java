// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClassResponse} extends {@link TeaModel}
 *
 * <p>DeleteClassResponse</p>
 */
public class DeleteClassResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteClassResponseBody body;

    private DeleteClassResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteClassResponse create() {
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
    public DeleteClassResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteClassResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteClassResponseBody body);

        @Override
        DeleteClassResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteClassResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteClassResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteClassResponse response) {
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
        public Builder body(DeleteClassResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteClassResponse build() {
            return new DeleteClassResponse(this);
        } 

    } 

}
