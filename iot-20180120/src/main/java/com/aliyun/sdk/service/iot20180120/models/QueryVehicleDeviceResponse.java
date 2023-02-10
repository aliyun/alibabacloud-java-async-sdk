// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVehicleDeviceResponse} extends {@link TeaModel}
 *
 * <p>QueryVehicleDeviceResponse</p>
 */
public class QueryVehicleDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryVehicleDeviceResponseBody body;

    private QueryVehicleDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryVehicleDeviceResponse create() {
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
    public QueryVehicleDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryVehicleDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryVehicleDeviceResponseBody body);

        @Override
        QueryVehicleDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryVehicleDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryVehicleDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryVehicleDeviceResponse response) {
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
        public Builder body(QueryVehicleDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryVehicleDeviceResponse build() {
            return new QueryVehicleDeviceResponse(this);
        } 

    } 

}
