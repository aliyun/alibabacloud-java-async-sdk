// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayAuthConsumerStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateGatewayAuthConsumerStatusResponse</p>
 */
public class UpdateGatewayAuthConsumerStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGatewayAuthConsumerStatusResponseBody body;

    private UpdateGatewayAuthConsumerStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGatewayAuthConsumerStatusResponse create() {
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
    public UpdateGatewayAuthConsumerStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGatewayAuthConsumerStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGatewayAuthConsumerStatusResponseBody body);

        @Override
        UpdateGatewayAuthConsumerStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGatewayAuthConsumerStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGatewayAuthConsumerStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGatewayAuthConsumerStatusResponse response) {
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
        public Builder body(UpdateGatewayAuthConsumerStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGatewayAuthConsumerStatusResponse build() {
            return new UpdateGatewayAuthConsumerStatusResponse(this);
        } 

    } 

}
