// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteActivationResponse} extends {@link TeaModel}
 *
 * <p>DeleteActivationResponse</p>
 */
public class DeleteActivationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteActivationResponseBody body;

    private DeleteActivationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteActivationResponse create() {
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
    public DeleteActivationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteActivationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteActivationResponseBody body);

        @Override
        DeleteActivationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteActivationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteActivationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteActivationResponse response) {
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
        public Builder body(DeleteActivationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteActivationResponse build() {
            return new DeleteActivationResponse(this);
        } 

    } 

}
