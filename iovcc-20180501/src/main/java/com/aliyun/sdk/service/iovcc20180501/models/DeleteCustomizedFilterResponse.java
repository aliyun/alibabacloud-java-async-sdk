// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomizedFilterResponse} extends {@link TeaModel}
 *
 * <p>DeleteCustomizedFilterResponse</p>
 */
public class DeleteCustomizedFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCustomizedFilterResponseBody body;

    private DeleteCustomizedFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCustomizedFilterResponse create() {
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
    public DeleteCustomizedFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCustomizedFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCustomizedFilterResponseBody body);

        @Override
        DeleteCustomizedFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCustomizedFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCustomizedFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCustomizedFilterResponse response) {
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
        public Builder body(DeleteCustomizedFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCustomizedFilterResponse build() {
            return new DeleteCustomizedFilterResponse(this);
        } 

    } 

}
