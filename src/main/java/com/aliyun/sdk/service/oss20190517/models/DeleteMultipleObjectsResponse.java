// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DeleteMultipleObjectsResponse} extends {@link TeaModel}
 *
 * <p>DeleteMultipleObjectsResponse</p>
 */
public class DeleteMultipleObjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMultipleObjectsResponseBody body;

    private DeleteMultipleObjectsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMultipleObjectsResponse create() {
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
    public DeleteMultipleObjectsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMultipleObjectsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMultipleObjectsResponseBody body);

        @Override
        DeleteMultipleObjectsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMultipleObjectsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMultipleObjectsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMultipleObjectsResponse response) {
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
        public Builder body(DeleteMultipleObjectsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMultipleObjectsResponse build() {
            return new DeleteMultipleObjectsResponse(this);
        } 

    } 

}
