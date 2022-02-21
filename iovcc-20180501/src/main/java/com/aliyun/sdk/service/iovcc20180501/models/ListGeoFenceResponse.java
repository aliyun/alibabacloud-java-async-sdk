// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGeoFenceResponse} extends {@link TeaModel}
 *
 * <p>ListGeoFenceResponse</p>
 */
public class ListGeoFenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGeoFenceResponseBody body;

    private ListGeoFenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGeoFenceResponse create() {
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
    public ListGeoFenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGeoFenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGeoFenceResponseBody body);

        @Override
        ListGeoFenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGeoFenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGeoFenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGeoFenceResponse response) {
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
        public Builder body(ListGeoFenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGeoFenceResponse build() {
            return new ListGeoFenceResponse(this);
        } 

    } 

}
