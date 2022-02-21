// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ControlGeoFenceResponse} extends {@link TeaModel}
 *
 * <p>ControlGeoFenceResponse</p>
 */
public class ControlGeoFenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ControlGeoFenceResponseBody body;

    private ControlGeoFenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ControlGeoFenceResponse create() {
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
    public ControlGeoFenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ControlGeoFenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ControlGeoFenceResponseBody body);

        @Override
        ControlGeoFenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ControlGeoFenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ControlGeoFenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ControlGeoFenceResponse response) {
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
        public Builder body(ControlGeoFenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ControlGeoFenceResponse build() {
            return new ControlGeoFenceResponse(this);
        } 

    } 

}
