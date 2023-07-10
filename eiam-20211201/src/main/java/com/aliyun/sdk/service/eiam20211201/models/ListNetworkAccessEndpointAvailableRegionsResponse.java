// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNetworkAccessEndpointAvailableRegionsResponse} extends {@link TeaModel}
 *
 * <p>ListNetworkAccessEndpointAvailableRegionsResponse</p>
 */
public class ListNetworkAccessEndpointAvailableRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNetworkAccessEndpointAvailableRegionsResponseBody body;

    private ListNetworkAccessEndpointAvailableRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNetworkAccessEndpointAvailableRegionsResponse create() {
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
    public ListNetworkAccessEndpointAvailableRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNetworkAccessEndpointAvailableRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNetworkAccessEndpointAvailableRegionsResponseBody body);

        @Override
        ListNetworkAccessEndpointAvailableRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNetworkAccessEndpointAvailableRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNetworkAccessEndpointAvailableRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNetworkAccessEndpointAvailableRegionsResponse response) {
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
        public Builder body(ListNetworkAccessEndpointAvailableRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNetworkAccessEndpointAvailableRegionsResponse build() {
            return new ListNetworkAccessEndpointAvailableRegionsResponse(this);
        } 

    } 

}
