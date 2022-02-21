// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecretParameterResponse} extends {@link TeaModel}
 *
 * <p>DeleteSecretParameterResponse</p>
 */
public class DeleteSecretParameterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSecretParameterResponseBody body;

    private DeleteSecretParameterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSecretParameterResponse create() {
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
    public DeleteSecretParameterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSecretParameterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSecretParameterResponseBody body);

        @Override
        DeleteSecretParameterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSecretParameterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSecretParameterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSecretParameterResponse response) {
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
        public Builder body(DeleteSecretParameterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSecretParameterResponse build() {
            return new DeleteSecretParameterResponse(this);
        } 

    } 

}
