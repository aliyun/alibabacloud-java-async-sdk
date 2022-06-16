// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppDetailResponse} extends {@link TeaModel}
 *
 * <p>DeleteAppDetailResponse</p>
 */
public class DeleteAppDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAppDetailResponseBody body;

    private DeleteAppDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAppDetailResponse create() {
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
    public DeleteAppDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAppDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAppDetailResponseBody body);

        @Override
        DeleteAppDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAppDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAppDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAppDetailResponse response) {
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
        public Builder body(DeleteAppDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAppDetailResponse build() {
            return new DeleteAppDetailResponse(this);
        } 

    } 

}
