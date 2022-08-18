// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApplicationClientSecretResponse} extends {@link TeaModel}
 *
 * <p>DeleteApplicationClientSecretResponse</p>
 */
public class DeleteApplicationClientSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteApplicationClientSecretResponseBody body;

    private DeleteApplicationClientSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteApplicationClientSecretResponse create() {
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
    public DeleteApplicationClientSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteApplicationClientSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteApplicationClientSecretResponseBody body);

        @Override
        DeleteApplicationClientSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteApplicationClientSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteApplicationClientSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteApplicationClientSecretResponse response) {
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
        public Builder body(DeleteApplicationClientSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteApplicationClientSecretResponse build() {
            return new DeleteApplicationClientSecretResponse(this);
        } 

    } 

}
