// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNacosInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateNacosInstanceResponse</p>
 */
public class CreateNacosInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNacosInstanceResponseBody body;

    private CreateNacosInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNacosInstanceResponse create() {
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
    public CreateNacosInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNacosInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNacosInstanceResponseBody body);

        @Override
        CreateNacosInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNacosInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNacosInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNacosInstanceResponse response) {
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
        public Builder body(CreateNacosInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNacosInstanceResponse build() {
            return new CreateNacosInstanceResponse(this);
        } 

    } 

}
