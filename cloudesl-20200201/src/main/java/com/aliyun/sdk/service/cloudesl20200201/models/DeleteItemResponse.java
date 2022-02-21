// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteItemResponse} extends {@link TeaModel}
 *
 * <p>DeleteItemResponse</p>
 */
public class DeleteItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteItemResponseBody body;

    private DeleteItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteItemResponse create() {
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
    public DeleteItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteItemResponseBody body);

        @Override
        DeleteItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteItemResponse response) {
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
        public Builder body(DeleteItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteItemResponse build() {
            return new DeleteItemResponse(this);
        } 

    } 

}
