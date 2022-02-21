// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBResponse} extends {@link TeaModel}
 *
 * <p>DeleteDBResponse</p>
 */
public class DeleteDBResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDBResponseBody body;

    private DeleteDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDBResponse create() {
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
    public DeleteDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDBResponseBody body);

        @Override
        DeleteDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDBResponse response) {
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
        public Builder body(DeleteDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDBResponse build() {
            return new DeleteDBResponse(this);
        } 

    } 

}
