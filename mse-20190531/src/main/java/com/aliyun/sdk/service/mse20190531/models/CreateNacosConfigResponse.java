// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNacosConfigResponse} extends {@link TeaModel}
 *
 * <p>CreateNacosConfigResponse</p>
 */
public class CreateNacosConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNacosConfigResponseBody body;

    private CreateNacosConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNacosConfigResponse create() {
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
    public CreateNacosConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNacosConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNacosConfigResponseBody body);

        @Override
        CreateNacosConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNacosConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNacosConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNacosConfigResponse response) {
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
        public Builder body(CreateNacosConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNacosConfigResponse build() {
            return new CreateNacosConfigResponse(this);
        } 

    } 

}
