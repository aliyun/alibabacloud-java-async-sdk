// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightRefundPreCalResponse} extends {@link TeaModel}
 *
 * <p>FlightRefundPreCalResponse</p>
 */
public class FlightRefundPreCalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightRefundPreCalResponseBody body;

    private FlightRefundPreCalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightRefundPreCalResponse create() {
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
    public FlightRefundPreCalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightRefundPreCalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightRefundPreCalResponseBody body);

        @Override
        FlightRefundPreCalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightRefundPreCalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightRefundPreCalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightRefundPreCalResponse response) {
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
        public Builder body(FlightRefundPreCalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightRefundPreCalResponse build() {
            return new FlightRefundPreCalResponse(this);
        } 

    } 

}
