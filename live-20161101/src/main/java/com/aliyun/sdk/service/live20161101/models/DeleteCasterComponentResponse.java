// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCasterComponentResponse} extends {@link TeaModel}
 *
 * <p>DeleteCasterComponentResponse</p>
 */
public class DeleteCasterComponentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCasterComponentResponseBody body;

    private DeleteCasterComponentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCasterComponentResponse create() {
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
    public DeleteCasterComponentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCasterComponentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCasterComponentResponseBody body);

        @Override
        DeleteCasterComponentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCasterComponentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCasterComponentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCasterComponentResponse response) {
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
        public Builder body(DeleteCasterComponentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCasterComponentResponse build() {
            return new DeleteCasterComponentResponse(this);
        } 

    } 

}
