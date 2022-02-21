// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewaySlbResponse} extends {@link TeaModel}
 *
 * <p>ListGatewaySlbResponse</p>
 */
public class ListGatewaySlbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGatewaySlbResponseBody body;

    private ListGatewaySlbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGatewaySlbResponse create() {
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
    public ListGatewaySlbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGatewaySlbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGatewaySlbResponseBody body);

        @Override
        ListGatewaySlbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGatewaySlbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGatewaySlbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGatewaySlbResponse response) {
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
        public Builder body(ListGatewaySlbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGatewaySlbResponse build() {
            return new ListGatewaySlbResponse(this);
        } 

    } 

}
