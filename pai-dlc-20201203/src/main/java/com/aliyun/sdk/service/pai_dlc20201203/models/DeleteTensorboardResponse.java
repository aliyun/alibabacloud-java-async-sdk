// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTensorboardResponse} extends {@link TeaModel}
 *
 * <p>DeleteTensorboardResponse</p>
 */
public class DeleteTensorboardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTensorboardResponseBody body;

    private DeleteTensorboardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTensorboardResponse create() {
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
    public DeleteTensorboardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTensorboardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTensorboardResponseBody body);

        @Override
        DeleteTensorboardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTensorboardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTensorboardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTensorboardResponse response) {
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
        public Builder body(DeleteTensorboardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTensorboardResponse build() {
            return new DeleteTensorboardResponse(this);
        } 

    } 

}
