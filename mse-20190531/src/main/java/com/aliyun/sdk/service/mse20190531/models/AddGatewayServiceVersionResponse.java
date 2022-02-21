// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGatewayServiceVersionResponse} extends {@link TeaModel}
 *
 * <p>AddGatewayServiceVersionResponse</p>
 */
public class AddGatewayServiceVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddGatewayServiceVersionResponseBody body;

    private AddGatewayServiceVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddGatewayServiceVersionResponse create() {
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
    public AddGatewayServiceVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddGatewayServiceVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddGatewayServiceVersionResponseBody body);

        @Override
        AddGatewayServiceVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddGatewayServiceVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddGatewayServiceVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddGatewayServiceVersionResponse response) {
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
        public Builder body(AddGatewayServiceVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddGatewayServiceVersionResponse build() {
            return new AddGatewayServiceVersionResponse(this);
        } 

    } 

}
