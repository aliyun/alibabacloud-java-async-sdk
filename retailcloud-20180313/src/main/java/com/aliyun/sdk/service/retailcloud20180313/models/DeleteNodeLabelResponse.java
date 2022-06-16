// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNodeLabelResponse} extends {@link TeaModel}
 *
 * <p>DeleteNodeLabelResponse</p>
 */
public class DeleteNodeLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNodeLabelResponseBody body;

    private DeleteNodeLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNodeLabelResponse create() {
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
    public DeleteNodeLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNodeLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNodeLabelResponseBody body);

        @Override
        DeleteNodeLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNodeLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNodeLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNodeLabelResponse response) {
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
        public Builder body(DeleteNodeLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNodeLabelResponse build() {
            return new DeleteNodeLabelResponse(this);
        } 

    } 

}
