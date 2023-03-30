// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayAuthConsumerResponse} extends {@link TeaModel}
 *
 * <p>ListGatewayAuthConsumerResponse</p>
 */
public class ListGatewayAuthConsumerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGatewayAuthConsumerResponseBody body;

    private ListGatewayAuthConsumerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGatewayAuthConsumerResponse create() {
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
    public ListGatewayAuthConsumerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGatewayAuthConsumerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGatewayAuthConsumerResponseBody body);

        @Override
        ListGatewayAuthConsumerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGatewayAuthConsumerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGatewayAuthConsumerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGatewayAuthConsumerResponse response) {
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
        public Builder body(ListGatewayAuthConsumerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGatewayAuthConsumerResponse build() {
            return new ListGatewayAuthConsumerResponse(this);
        } 

    } 

}
