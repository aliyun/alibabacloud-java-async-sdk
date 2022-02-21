// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGatewayResponse} extends {@link TeaModel}
 *
 * <p>AddGatewayResponse</p>
 */
public class AddGatewayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddGatewayResponseBody body;

    private AddGatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddGatewayResponse create() {
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
    public AddGatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddGatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddGatewayResponseBody body);

        @Override
        AddGatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddGatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddGatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddGatewayResponse response) {
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
        public Builder body(AddGatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddGatewayResponse build() {
            return new AddGatewayResponse(this);
        } 

    } 

}
