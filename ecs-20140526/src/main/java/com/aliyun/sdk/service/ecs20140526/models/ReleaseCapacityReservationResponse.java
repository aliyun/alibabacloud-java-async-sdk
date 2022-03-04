// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseCapacityReservationResponse} extends {@link TeaModel}
 *
 * <p>ReleaseCapacityReservationResponse</p>
 */
public class ReleaseCapacityReservationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseCapacityReservationResponseBody body;

    private ReleaseCapacityReservationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseCapacityReservationResponse create() {
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
    public ReleaseCapacityReservationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseCapacityReservationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseCapacityReservationResponseBody body);

        @Override
        ReleaseCapacityReservationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseCapacityReservationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseCapacityReservationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseCapacityReservationResponse response) {
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
        public Builder body(ReleaseCapacityReservationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseCapacityReservationResponse build() {
            return new ReleaseCapacityReservationResponse(this);
        } 

    } 

}
