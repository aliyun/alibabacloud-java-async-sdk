// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRpcServiceResponse} extends {@link TeaModel}
 *
 * <p>CreateRpcServiceResponse</p>
 */
public class CreateRpcServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRpcServiceResponseBody body;

    private CreateRpcServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRpcServiceResponse create() {
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
    public CreateRpcServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRpcServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRpcServiceResponseBody body);

        @Override
        CreateRpcServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRpcServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRpcServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRpcServiceResponse response) {
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
        public Builder body(CreateRpcServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRpcServiceResponse build() {
            return new CreateRpcServiceResponse(this);
        } 

    } 

}
