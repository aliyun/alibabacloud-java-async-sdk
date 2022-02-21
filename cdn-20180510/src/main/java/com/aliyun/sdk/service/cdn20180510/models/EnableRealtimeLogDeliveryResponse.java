// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableRealtimeLogDeliveryResponse} extends {@link TeaModel}
 *
 * <p>EnableRealtimeLogDeliveryResponse</p>
 */
public class EnableRealtimeLogDeliveryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableRealtimeLogDeliveryResponseBody body;

    private EnableRealtimeLogDeliveryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableRealtimeLogDeliveryResponse create() {
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
    public EnableRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableRealtimeLogDeliveryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableRealtimeLogDeliveryResponseBody body);

        @Override
        EnableRealtimeLogDeliveryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableRealtimeLogDeliveryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableRealtimeLogDeliveryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableRealtimeLogDeliveryResponse response) {
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
        public Builder body(EnableRealtimeLogDeliveryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableRealtimeLogDeliveryResponse build() {
            return new EnableRealtimeLogDeliveryResponse(this);
        } 

    } 

}
