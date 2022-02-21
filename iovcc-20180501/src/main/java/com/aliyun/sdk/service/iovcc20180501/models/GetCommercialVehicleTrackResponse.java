// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommercialVehicleTrackResponse} extends {@link TeaModel}
 *
 * <p>GetCommercialVehicleTrackResponse</p>
 */
public class GetCommercialVehicleTrackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCommercialVehicleTrackResponseBody body;

    private GetCommercialVehicleTrackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCommercialVehicleTrackResponse create() {
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
    public GetCommercialVehicleTrackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCommercialVehicleTrackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCommercialVehicleTrackResponseBody body);

        @Override
        GetCommercialVehicleTrackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCommercialVehicleTrackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCommercialVehicleTrackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCommercialVehicleTrackResponse response) {
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
        public Builder body(GetCommercialVehicleTrackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCommercialVehicleTrackResponse build() {
            return new GetCommercialVehicleTrackResponse(this);
        } 

    } 

}
