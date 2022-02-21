// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRealtimeLogDeliveryResponse} extends {@link TeaModel}
 *
 * <p>ModifyRealtimeLogDeliveryResponse</p>
 */
public class ModifyRealtimeLogDeliveryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyRealtimeLogDeliveryResponseBody body;

    private ModifyRealtimeLogDeliveryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyRealtimeLogDeliveryResponse create() {
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
    public ModifyRealtimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyRealtimeLogDeliveryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyRealtimeLogDeliveryResponseBody body);

        @Override
        ModifyRealtimeLogDeliveryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyRealtimeLogDeliveryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyRealtimeLogDeliveryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyRealtimeLogDeliveryResponse response) {
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
        public Builder body(ModifyRealtimeLogDeliveryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyRealtimeLogDeliveryResponse build() {
            return new ModifyRealtimeLogDeliveryResponse(this);
        } 

    } 

}
