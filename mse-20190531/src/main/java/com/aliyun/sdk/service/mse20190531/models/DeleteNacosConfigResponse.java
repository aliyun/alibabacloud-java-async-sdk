// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNacosConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteNacosConfigResponse</p>
 */
public class DeleteNacosConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNacosConfigResponseBody body;

    private DeleteNacosConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNacosConfigResponse create() {
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
    public DeleteNacosConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNacosConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNacosConfigResponseBody body);

        @Override
        DeleteNacosConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNacosConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNacosConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNacosConfigResponse response) {
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
        public Builder body(DeleteNacosConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNacosConfigResponse build() {
            return new DeleteNacosConfigResponse(this);
        } 

    } 

}
