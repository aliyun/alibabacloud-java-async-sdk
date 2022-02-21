// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppInfoResponse} extends {@link TeaModel}
 *
 * <p>DeleteAppInfoResponse</p>
 */
public class DeleteAppInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAppInfoResponseBody body;

    private DeleteAppInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAppInfoResponse create() {
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
    public DeleteAppInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAppInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAppInfoResponseBody body);

        @Override
        DeleteAppInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAppInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAppInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAppInfoResponse response) {
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
        public Builder body(DeleteAppInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAppInfoResponse build() {
            return new DeleteAppInfoResponse(this);
        } 

    } 

}
