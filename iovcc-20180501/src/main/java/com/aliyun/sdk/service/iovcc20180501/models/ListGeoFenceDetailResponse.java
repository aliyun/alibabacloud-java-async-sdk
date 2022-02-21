// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGeoFenceDetailResponse} extends {@link TeaModel}
 *
 * <p>ListGeoFenceDetailResponse</p>
 */
public class ListGeoFenceDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGeoFenceDetailResponseBody body;

    private ListGeoFenceDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGeoFenceDetailResponse create() {
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
    public ListGeoFenceDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGeoFenceDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGeoFenceDetailResponseBody body);

        @Override
        ListGeoFenceDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGeoFenceDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGeoFenceDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGeoFenceDetailResponse response) {
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
        public Builder body(ListGeoFenceDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGeoFenceDetailResponse build() {
            return new ListGeoFenceDetailResponse(this);
        } 

    } 

}
