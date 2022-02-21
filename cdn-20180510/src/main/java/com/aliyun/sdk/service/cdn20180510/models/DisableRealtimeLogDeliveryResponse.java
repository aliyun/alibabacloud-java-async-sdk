// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableRealtimeLogDeliveryResponse} extends {@link TeaModel}
 *
 * <p>DisableRealtimeLogDeliveryResponse</p>
 */
public class DisableRealtimeLogDeliveryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableRealtimeLogDeliveryResponseBody body;

    private DisableRealtimeLogDeliveryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableRealtimeLogDeliveryResponse create() {
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
    public DisableRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableRealtimeLogDeliveryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableRealtimeLogDeliveryResponseBody body);

        @Override
        DisableRealtimeLogDeliveryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableRealtimeLogDeliveryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableRealtimeLogDeliveryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableRealtimeLogDeliveryResponse response) {
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
        public Builder body(DisableRealtimeLogDeliveryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableRealtimeLogDeliveryResponse build() {
            return new DisableRealtimeLogDeliveryResponse(this);
        } 

    } 

}
