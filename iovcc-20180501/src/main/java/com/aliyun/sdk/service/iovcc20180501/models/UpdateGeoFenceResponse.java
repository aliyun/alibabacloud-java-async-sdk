// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGeoFenceResponse} extends {@link TeaModel}
 *
 * <p>UpdateGeoFenceResponse</p>
 */
public class UpdateGeoFenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGeoFenceResponseBody body;

    private UpdateGeoFenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGeoFenceResponse create() {
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
    public UpdateGeoFenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGeoFenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGeoFenceResponseBody body);

        @Override
        UpdateGeoFenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGeoFenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGeoFenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGeoFenceResponse response) {
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
        public Builder body(UpdateGeoFenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGeoFenceResponse build() {
            return new UpdateGeoFenceResponse(this);
        } 

    } 

}
