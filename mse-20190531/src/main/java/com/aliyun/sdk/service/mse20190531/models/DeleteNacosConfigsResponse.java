// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNacosConfigsResponse} extends {@link TeaModel}
 *
 * <p>DeleteNacosConfigsResponse</p>
 */
public class DeleteNacosConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNacosConfigsResponseBody body;

    private DeleteNacosConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNacosConfigsResponse create() {
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
    public DeleteNacosConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNacosConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNacosConfigsResponseBody body);

        @Override
        DeleteNacosConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNacosConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNacosConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNacosConfigsResponse response) {
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
        public Builder body(DeleteNacosConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNacosConfigsResponse build() {
            return new DeleteNacosConfigsResponse(this);
        } 

    } 

}
