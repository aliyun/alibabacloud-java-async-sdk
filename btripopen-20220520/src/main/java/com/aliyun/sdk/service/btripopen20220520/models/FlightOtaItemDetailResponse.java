// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightOtaItemDetailResponse} extends {@link TeaModel}
 *
 * <p>FlightOtaItemDetailResponse</p>
 */
public class FlightOtaItemDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightOtaItemDetailResponseBody body;

    private FlightOtaItemDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightOtaItemDetailResponse create() {
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
    public FlightOtaItemDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightOtaItemDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightOtaItemDetailResponseBody body);

        @Override
        FlightOtaItemDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightOtaItemDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightOtaItemDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightOtaItemDetailResponse response) {
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
        public Builder body(FlightOtaItemDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightOtaItemDetailResponse build() {
            return new FlightOtaItemDetailResponse(this);
        } 

    } 

}
