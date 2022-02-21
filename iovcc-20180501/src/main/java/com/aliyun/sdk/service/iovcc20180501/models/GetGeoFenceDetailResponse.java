// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGeoFenceDetailResponse} extends {@link TeaModel}
 *
 * <p>GetGeoFenceDetailResponse</p>
 */
public class GetGeoFenceDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetGeoFenceDetailResponseBody body;

    private GetGeoFenceDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetGeoFenceDetailResponse create() {
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
    public GetGeoFenceDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetGeoFenceDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetGeoFenceDetailResponseBody body);

        @Override
        GetGeoFenceDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetGeoFenceDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetGeoFenceDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetGeoFenceDetailResponse response) {
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
        public Builder body(GetGeoFenceDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetGeoFenceDetailResponse build() {
            return new GetGeoFenceDetailResponse(this);
        } 

    } 

}
