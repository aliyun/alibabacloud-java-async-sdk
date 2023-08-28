// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIndexResponse} extends {@link TeaModel}
 *
 * <p>DeleteIndexResponse</p>
 */
public class DeleteIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIndexResponseBody body;

    private DeleteIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIndexResponse create() {
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
    public DeleteIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIndexResponseBody body);

        @Override
        DeleteIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIndexResponse response) {
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
        public Builder body(DeleteIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIndexResponse build() {
            return new DeleteIndexResponse(this);
        } 

    } 

}
