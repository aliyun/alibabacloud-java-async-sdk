// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNacosServiceResponse} extends {@link TeaModel}
 *
 * <p>CreateNacosServiceResponse</p>
 */
public class CreateNacosServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNacosServiceResponseBody body;

    private CreateNacosServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNacosServiceResponse create() {
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
    public CreateNacosServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNacosServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNacosServiceResponseBody body);

        @Override
        CreateNacosServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNacosServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNacosServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNacosServiceResponse response) {
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
        public Builder body(CreateNacosServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNacosServiceResponse build() {
            return new CreateNacosServiceResponse(this);
        } 

    } 

}
