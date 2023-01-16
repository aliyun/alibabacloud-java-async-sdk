// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightRefundDetailResponse} extends {@link TeaModel}
 *
 * <p>FlightRefundDetailResponse</p>
 */
public class FlightRefundDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightRefundDetailResponseBody body;

    private FlightRefundDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightRefundDetailResponse create() {
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
    public FlightRefundDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightRefundDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightRefundDetailResponseBody body);

        @Override
        FlightRefundDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightRefundDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightRefundDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightRefundDetailResponse response) {
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
        public Builder body(FlightRefundDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightRefundDetailResponse build() {
            return new FlightRefundDetailResponse(this);
        } 

    } 

}
