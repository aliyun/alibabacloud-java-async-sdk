// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVehicleControlResultResponse} extends {@link TeaModel}
 *
 * <p>GetVehicleControlResultResponse</p>
 */
public class GetVehicleControlResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVehicleControlResultResponseBody body;

    private GetVehicleControlResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVehicleControlResultResponse create() {
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
    public GetVehicleControlResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVehicleControlResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVehicleControlResultResponseBody body);

        @Override
        GetVehicleControlResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVehicleControlResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVehicleControlResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVehicleControlResultResponse response) {
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
        public Builder body(GetVehicleControlResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVehicleControlResultResponse build() {
            return new GetVehicleControlResultResponse(this);
        } 

    } 

}
