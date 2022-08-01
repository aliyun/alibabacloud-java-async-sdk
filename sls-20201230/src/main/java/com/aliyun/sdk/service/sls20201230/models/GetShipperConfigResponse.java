// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetShipperConfigResponse} extends {@link TeaModel}
 *
 * <p>GetShipperConfigResponse</p>
 */
public class GetShipperConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetShipperConfigResponseBody body;

    private GetShipperConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetShipperConfigResponse create() {
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
    public GetShipperConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetShipperConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetShipperConfigResponseBody body);

        @Override
        GetShipperConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetShipperConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetShipperConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetShipperConfigResponse response) {
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
        public Builder body(GetShipperConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetShipperConfigResponse build() {
            return new GetShipperConfigResponse(this);
        } 

    } 

}
