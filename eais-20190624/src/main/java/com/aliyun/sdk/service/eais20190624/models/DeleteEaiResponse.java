// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEaiResponse} extends {@link TeaModel}
 *
 * <p>DeleteEaiResponse</p>
 */
public class DeleteEaiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEaiResponseBody body;

    private DeleteEaiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEaiResponse create() {
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
    public DeleteEaiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEaiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEaiResponseBody body);

        @Override
        DeleteEaiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEaiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEaiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEaiResponse response) {
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
        public Builder body(DeleteEaiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEaiResponse build() {
            return new DeleteEaiResponse(this);
        } 

    } 

}
