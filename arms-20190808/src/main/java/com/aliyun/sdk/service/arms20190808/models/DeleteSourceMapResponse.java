// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSourceMapResponse} extends {@link TeaModel}
 *
 * <p>DeleteSourceMapResponse</p>
 */
public class DeleteSourceMapResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSourceMapResponseBody body;

    private DeleteSourceMapResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSourceMapResponse create() {
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
    public DeleteSourceMapResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSourceMapResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSourceMapResponseBody body);

        @Override
        DeleteSourceMapResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSourceMapResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSourceMapResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSourceMapResponse response) {
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
        public Builder body(DeleteSourceMapResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSourceMapResponse build() {
            return new DeleteSourceMapResponse(this);
        } 

    } 

}
