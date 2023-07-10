// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNetworkAccessEndpointAvailableZonesResponse} extends {@link TeaModel}
 *
 * <p>ListNetworkAccessEndpointAvailableZonesResponse</p>
 */
public class ListNetworkAccessEndpointAvailableZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNetworkAccessEndpointAvailableZonesResponseBody body;

    private ListNetworkAccessEndpointAvailableZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNetworkAccessEndpointAvailableZonesResponse create() {
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
    public ListNetworkAccessEndpointAvailableZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNetworkAccessEndpointAvailableZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNetworkAccessEndpointAvailableZonesResponseBody body);

        @Override
        ListNetworkAccessEndpointAvailableZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNetworkAccessEndpointAvailableZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNetworkAccessEndpointAvailableZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNetworkAccessEndpointAvailableZonesResponse response) {
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
        public Builder body(ListNetworkAccessEndpointAvailableZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNetworkAccessEndpointAvailableZonesResponse build() {
            return new ListNetworkAccessEndpointAvailableZonesResponse(this);
        } 

    } 

}
