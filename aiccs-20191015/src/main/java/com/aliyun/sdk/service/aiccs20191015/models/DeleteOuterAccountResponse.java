// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOuterAccountResponse} extends {@link TeaModel}
 *
 * <p>DeleteOuterAccountResponse</p>
 */
public class DeleteOuterAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteOuterAccountResponseBody body;

    private DeleteOuterAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteOuterAccountResponse create() {
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
    public DeleteOuterAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteOuterAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteOuterAccountResponseBody body);

        @Override
        DeleteOuterAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteOuterAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteOuterAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteOuterAccountResponse response) {
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
        public Builder body(DeleteOuterAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteOuterAccountResponse build() {
            return new DeleteOuterAccountResponse(this);
        } 

    } 

}
