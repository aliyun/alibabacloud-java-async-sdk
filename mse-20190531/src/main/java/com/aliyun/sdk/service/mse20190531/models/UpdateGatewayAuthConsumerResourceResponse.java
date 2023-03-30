// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayAuthConsumerResourceResponse} extends {@link TeaModel}
 *
 * <p>UpdateGatewayAuthConsumerResourceResponse</p>
 */
public class UpdateGatewayAuthConsumerResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGatewayAuthConsumerResourceResponseBody body;

    private UpdateGatewayAuthConsumerResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGatewayAuthConsumerResourceResponse create() {
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
    public UpdateGatewayAuthConsumerResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGatewayAuthConsumerResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGatewayAuthConsumerResourceResponseBody body);

        @Override
        UpdateGatewayAuthConsumerResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGatewayAuthConsumerResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGatewayAuthConsumerResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGatewayAuthConsumerResourceResponse response) {
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
        public Builder body(UpdateGatewayAuthConsumerResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGatewayAuthConsumerResourceResponse build() {
            return new UpdateGatewayAuthConsumerResourceResponse(this);
        } 

    } 

}
