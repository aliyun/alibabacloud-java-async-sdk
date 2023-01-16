// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightRefundApplyResponse} extends {@link TeaModel}
 *
 * <p>FlightRefundApplyResponse</p>
 */
public class FlightRefundApplyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightRefundApplyResponseBody body;

    private FlightRefundApplyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightRefundApplyResponse create() {
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
    public FlightRefundApplyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightRefundApplyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightRefundApplyResponseBody body);

        @Override
        FlightRefundApplyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightRefundApplyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightRefundApplyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightRefundApplyResponse response) {
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
        public Builder body(FlightRefundApplyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightRefundApplyResponse build() {
            return new FlightRefundApplyResponse(this);
        } 

    } 

}
