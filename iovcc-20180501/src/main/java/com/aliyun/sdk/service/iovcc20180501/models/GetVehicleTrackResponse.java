// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVehicleTrackResponse} extends {@link TeaModel}
 *
 * <p>GetVehicleTrackResponse</p>
 */
public class GetVehicleTrackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVehicleTrackResponseBody body;

    private GetVehicleTrackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVehicleTrackResponse create() {
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
    public GetVehicleTrackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVehicleTrackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVehicleTrackResponseBody body);

        @Override
        GetVehicleTrackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVehicleTrackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVehicleTrackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVehicleTrackResponse response) {
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
        public Builder body(GetVehicleTrackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVehicleTrackResponse build() {
            return new GetVehicleTrackResponse(this);
        } 

    } 

}
