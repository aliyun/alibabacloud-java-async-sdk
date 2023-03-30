// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayAuthConsumerResourceStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateGatewayAuthConsumerResourceStatusResponse</p>
 */
public class UpdateGatewayAuthConsumerResourceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGatewayAuthConsumerResourceStatusResponseBody body;

    private UpdateGatewayAuthConsumerResourceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGatewayAuthConsumerResourceStatusResponse create() {
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
    public UpdateGatewayAuthConsumerResourceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGatewayAuthConsumerResourceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGatewayAuthConsumerResourceStatusResponseBody body);

        @Override
        UpdateGatewayAuthConsumerResourceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGatewayAuthConsumerResourceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGatewayAuthConsumerResourceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGatewayAuthConsumerResourceStatusResponse response) {
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
        public Builder body(UpdateGatewayAuthConsumerResourceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGatewayAuthConsumerResourceStatusResponse build() {
            return new UpdateGatewayAuthConsumerResourceStatusResponse(this);
        } 

    } 

}
