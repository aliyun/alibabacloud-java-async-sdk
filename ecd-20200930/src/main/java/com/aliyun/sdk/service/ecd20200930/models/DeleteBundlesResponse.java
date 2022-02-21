// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBundlesResponse} extends {@link TeaModel}
 *
 * <p>DeleteBundlesResponse</p>
 */
public class DeleteBundlesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBundlesResponseBody body;

    private DeleteBundlesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBundlesResponse create() {
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
    public DeleteBundlesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBundlesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBundlesResponseBody body);

        @Override
        DeleteBundlesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBundlesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBundlesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBundlesResponse response) {
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
        public Builder body(DeleteBundlesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBundlesResponse build() {
            return new DeleteBundlesResponse(this);
        } 

    } 

}
