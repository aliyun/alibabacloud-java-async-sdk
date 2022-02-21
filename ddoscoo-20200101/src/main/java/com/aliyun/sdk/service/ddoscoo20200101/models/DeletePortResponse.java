// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePortResponse} extends {@link TeaModel}
 *
 * <p>DeletePortResponse</p>
 */
public class DeletePortResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePortResponseBody body;

    private DeletePortResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePortResponse create() {
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
    public DeletePortResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePortResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePortResponseBody body);

        @Override
        DeletePortResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePortResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePortResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePortResponse response) {
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
        public Builder body(DeletePortResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePortResponse build() {
            return new DeletePortResponse(this);
        } 

    } 

}
