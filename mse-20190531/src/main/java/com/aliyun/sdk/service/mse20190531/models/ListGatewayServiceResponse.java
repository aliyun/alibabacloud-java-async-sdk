// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayServiceResponse} extends {@link TeaModel}
 *
 * <p>ListGatewayServiceResponse</p>
 */
public class ListGatewayServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGatewayServiceResponseBody body;

    private ListGatewayServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGatewayServiceResponse create() {
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
    public ListGatewayServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGatewayServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGatewayServiceResponseBody body);

        @Override
        ListGatewayServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGatewayServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGatewayServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGatewayServiceResponse response) {
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
        public Builder body(ListGatewayServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGatewayServiceResponse build() {
            return new ListGatewayServiceResponse(this);
        } 

    } 

}
