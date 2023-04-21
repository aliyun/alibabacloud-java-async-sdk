// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCdsFileResponse} extends {@link TeaModel}
 *
 * <p>DeleteCdsFileResponse</p>
 */
public class DeleteCdsFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCdsFileResponseBody body;

    private DeleteCdsFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCdsFileResponse create() {
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
    public DeleteCdsFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCdsFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCdsFileResponseBody body);

        @Override
        DeleteCdsFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCdsFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCdsFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCdsFileResponse response) {
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
        public Builder body(DeleteCdsFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCdsFileResponse build() {
            return new DeleteCdsFileResponse(this);
        } 

    } 

}
