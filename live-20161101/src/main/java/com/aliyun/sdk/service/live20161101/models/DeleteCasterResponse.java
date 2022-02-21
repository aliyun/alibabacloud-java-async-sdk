// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCasterResponse} extends {@link TeaModel}
 *
 * <p>DeleteCasterResponse</p>
 */
public class DeleteCasterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCasterResponseBody body;

    private DeleteCasterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCasterResponse create() {
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
    public DeleteCasterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCasterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCasterResponseBody body);

        @Override
        DeleteCasterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCasterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCasterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCasterResponse response) {
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
        public Builder body(DeleteCasterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCasterResponse build() {
            return new DeleteCasterResponse(this);
        } 

    } 

}
