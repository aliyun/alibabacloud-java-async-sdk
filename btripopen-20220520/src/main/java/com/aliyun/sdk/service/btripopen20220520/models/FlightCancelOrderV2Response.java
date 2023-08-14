// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightCancelOrderV2Response} extends {@link TeaModel}
 *
 * <p>FlightCancelOrderV2Response</p>
 */
public class FlightCancelOrderV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightCancelOrderV2ResponseBody body;

    private FlightCancelOrderV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightCancelOrderV2Response create() {
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
    public FlightCancelOrderV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightCancelOrderV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightCancelOrderV2ResponseBody body);

        @Override
        FlightCancelOrderV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightCancelOrderV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightCancelOrderV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightCancelOrderV2Response response) {
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
        public Builder body(FlightCancelOrderV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightCancelOrderV2Response build() {
            return new FlightCancelOrderV2Response(this);
        } 

    } 

}
