// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFunctionFileResponse} extends {@link TeaModel}
 *
 * <p>DeleteFunctionFileResponse</p>
 */
public class DeleteFunctionFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFunctionFileResponseBody body;

    private DeleteFunctionFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFunctionFileResponse create() {
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
    public DeleteFunctionFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFunctionFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFunctionFileResponseBody body);

        @Override
        DeleteFunctionFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFunctionFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFunctionFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFunctionFileResponse response) {
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
        public Builder body(DeleteFunctionFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFunctionFileResponse build() {
            return new DeleteFunctionFileResponse(this);
        } 

    } 

}
