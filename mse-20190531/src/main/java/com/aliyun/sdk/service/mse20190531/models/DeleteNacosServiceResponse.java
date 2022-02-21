// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNacosServiceResponse} extends {@link TeaModel}
 *
 * <p>DeleteNacosServiceResponse</p>
 */
public class DeleteNacosServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNacosServiceResponseBody body;

    private DeleteNacosServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNacosServiceResponse create() {
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
    public DeleteNacosServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNacosServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNacosServiceResponseBody body);

        @Override
        DeleteNacosServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNacosServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNacosServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNacosServiceResponse response) {
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
        public Builder body(DeleteNacosServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNacosServiceResponse build() {
            return new DeleteNacosServiceResponse(this);
        } 

    } 

}
