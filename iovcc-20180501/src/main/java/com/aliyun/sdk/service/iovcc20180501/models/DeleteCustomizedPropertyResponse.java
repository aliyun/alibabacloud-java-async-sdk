// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomizedPropertyResponse} extends {@link TeaModel}
 *
 * <p>DeleteCustomizedPropertyResponse</p>
 */
public class DeleteCustomizedPropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCustomizedPropertyResponseBody body;

    private DeleteCustomizedPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCustomizedPropertyResponse create() {
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
    public DeleteCustomizedPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCustomizedPropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCustomizedPropertyResponseBody body);

        @Override
        DeleteCustomizedPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCustomizedPropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCustomizedPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCustomizedPropertyResponse response) {
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
        public Builder body(DeleteCustomizedPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCustomizedPropertyResponse build() {
            return new DeleteCustomizedPropertyResponse(this);
        } 

    } 

}
