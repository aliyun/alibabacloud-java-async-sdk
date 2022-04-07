// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageQueueRouteResponse} extends {@link TeaModel}
 *
 * <p>UpdateMessageQueueRouteResponse</p>
 */
public class UpdateMessageQueueRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMessageQueueRouteResponseBody body;

    private UpdateMessageQueueRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMessageQueueRouteResponse create() {
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
    public UpdateMessageQueueRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMessageQueueRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMessageQueueRouteResponseBody body);

        @Override
        UpdateMessageQueueRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMessageQueueRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMessageQueueRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMessageQueueRouteResponse response) {
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
        public Builder body(UpdateMessageQueueRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMessageQueueRouteResponse build() {
            return new UpdateMessageQueueRouteResponse(this);
        } 

    } 

}
