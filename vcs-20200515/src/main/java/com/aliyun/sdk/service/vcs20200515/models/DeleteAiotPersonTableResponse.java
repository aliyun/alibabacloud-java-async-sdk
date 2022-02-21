// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAiotPersonTableResponse} extends {@link TeaModel}
 *
 * <p>DeleteAiotPersonTableResponse</p>
 */
public class DeleteAiotPersonTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAiotPersonTableResponseBody body;

    private DeleteAiotPersonTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAiotPersonTableResponse create() {
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
    public DeleteAiotPersonTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAiotPersonTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAiotPersonTableResponseBody body);

        @Override
        DeleteAiotPersonTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAiotPersonTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAiotPersonTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAiotPersonTableResponse response) {
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
        public Builder body(DeleteAiotPersonTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAiotPersonTableResponse build() {
            return new DeleteAiotPersonTableResponse(this);
        } 

    } 

}
