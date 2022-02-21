// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFunctionInstanceResponse} extends {@link TeaModel}
 *
 * <p>DeleteFunctionInstanceResponse</p>
 */
public class DeleteFunctionInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFunctionInstanceResponseBody body;

    private DeleteFunctionInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFunctionInstanceResponse create() {
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
    public DeleteFunctionInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFunctionInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFunctionInstanceResponseBody body);

        @Override
        DeleteFunctionInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFunctionInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFunctionInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFunctionInstanceResponse response) {
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
        public Builder body(DeleteFunctionInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFunctionInstanceResponse build() {
            return new DeleteFunctionInstanceResponse(this);
        } 

    } 

}
