// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightRefundDetailV2Response} extends {@link TeaModel}
 *
 * <p>FlightRefundDetailV2Response</p>
 */
public class FlightRefundDetailV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightRefundDetailV2ResponseBody body;

    private FlightRefundDetailV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightRefundDetailV2Response create() {
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
    public FlightRefundDetailV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightRefundDetailV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightRefundDetailV2ResponseBody body);

        @Override
        FlightRefundDetailV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightRefundDetailV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightRefundDetailV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightRefundDetailV2Response response) {
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
        public Builder body(FlightRefundDetailV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightRefundDetailV2Response build() {
            return new FlightRefundDetailV2Response(this);
        } 

    } 

}
