// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGatewaySlbResponse} extends {@link TeaModel}
 *
 * <p>AddGatewaySlbResponse</p>
 */
public class AddGatewaySlbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddGatewaySlbResponseBody body;

    private AddGatewaySlbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddGatewaySlbResponse create() {
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
    public AddGatewaySlbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddGatewaySlbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddGatewaySlbResponseBody body);

        @Override
        AddGatewaySlbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddGatewaySlbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddGatewaySlbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddGatewaySlbResponse response) {
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
        public Builder body(AddGatewaySlbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddGatewaySlbResponse build() {
            return new AddGatewaySlbResponse(this);
        } 

    } 

}
