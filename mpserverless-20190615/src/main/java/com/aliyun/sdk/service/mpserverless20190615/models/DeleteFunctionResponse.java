// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFunctionResponse} extends {@link TeaModel}
 *
 * <p>DeleteFunctionResponse</p>
 */
public class DeleteFunctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFunctionResponseBody body;

    private DeleteFunctionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFunctionResponse create() {
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
    public DeleteFunctionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFunctionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFunctionResponseBody body);

        @Override
        DeleteFunctionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFunctionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFunctionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFunctionResponse response) {
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
        public Builder body(DeleteFunctionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFunctionResponse build() {
            return new DeleteFunctionResponse(this);
        } 

    } 

}
