// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteDataTaskResponse</p>
 */
public class DeleteDataTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDataTaskResponseBody body;

    private DeleteDataTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDataTaskResponse create() {
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
    public DeleteDataTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDataTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDataTaskResponseBody body);

        @Override
        DeleteDataTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDataTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDataTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDataTaskResponse response) {
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
        public Builder body(DeleteDataTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDataTaskResponse build() {
            return new DeleteDataTaskResponse(this);
        } 

    } 

}
