// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCapacityReservationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCapacityReservationsResponse</p>
 */
public class DescribeCapacityReservationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCapacityReservationsResponseBody body;

    private DescribeCapacityReservationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCapacityReservationsResponse create() {
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
    public DescribeCapacityReservationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCapacityReservationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCapacityReservationsResponseBody body);

        @Override
        DescribeCapacityReservationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCapacityReservationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCapacityReservationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCapacityReservationsResponse response) {
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
        public Builder body(DescribeCapacityReservationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCapacityReservationsResponse build() {
            return new DescribeCapacityReservationsResponse(this);
        } 

    } 

}
