// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNetworkAccessEndpointsResponse} extends {@link TeaModel}
 *
 * <p>ListNetworkAccessEndpointsResponse</p>
 */
public class ListNetworkAccessEndpointsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNetworkAccessEndpointsResponseBody body;

    private ListNetworkAccessEndpointsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNetworkAccessEndpointsResponse create() {
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
    public ListNetworkAccessEndpointsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNetworkAccessEndpointsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNetworkAccessEndpointsResponseBody body);

        @Override
        ListNetworkAccessEndpointsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNetworkAccessEndpointsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNetworkAccessEndpointsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNetworkAccessEndpointsResponse response) {
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
        public Builder body(ListNetworkAccessEndpointsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNetworkAccessEndpointsResponse build() {
            return new ListNetworkAccessEndpointsResponse(this);
        } 

    } 

}
