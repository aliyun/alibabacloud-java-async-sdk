// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApplicationResponse} extends {@link TeaModel}
 *
 * <p>DeleteApplicationResponse</p>
 */
public class DeleteApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteApplicationResponseBody body;

    private DeleteApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteApplicationResponse create() {
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
    public DeleteApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteApplicationResponseBody body);

        @Override
        DeleteApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteApplicationResponse response) {
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
        public Builder body(DeleteApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteApplicationResponse build() {
            return new DeleteApplicationResponse(this);
        } 

    } 

}
