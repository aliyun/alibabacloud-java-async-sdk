// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateASMGatewayResponse} extends {@link TeaModel}
 *
 * <p>CreateASMGatewayResponse</p>
 */
public class CreateASMGatewayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateASMGatewayResponseBody body;

    private CreateASMGatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateASMGatewayResponse create() {
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
    public CreateASMGatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateASMGatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateASMGatewayResponseBody body);

        @Override
        CreateASMGatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateASMGatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateASMGatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateASMGatewayResponse response) {
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
        public Builder body(CreateASMGatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateASMGatewayResponse build() {
            return new CreateASMGatewayResponse(this);
        } 

    } 

}
