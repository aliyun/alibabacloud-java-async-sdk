// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReleaseCapacityReservationResponse} extends {@link TeaModel}
 *
 * <p>ReleaseCapacityReservationResponse</p>
 */
public class ReleaseCapacityReservationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ReleaseCapacityReservationResponseBody body;

    private ReleaseCapacityReservationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ReleaseCapacityReservationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseCapacityReservationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReleaseCapacityReservationResponseBody body);

        @Override
        ReleaseCapacityReservationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseCapacityReservationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ReleaseCapacityReservationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseCapacityReservationResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
