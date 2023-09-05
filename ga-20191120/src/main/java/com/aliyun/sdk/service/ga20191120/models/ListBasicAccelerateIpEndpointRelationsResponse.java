// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBasicAccelerateIpEndpointRelationsResponse} extends {@link TeaModel}
 *
 * <p>ListBasicAccelerateIpEndpointRelationsResponse</p>
 */
public class ListBasicAccelerateIpEndpointRelationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBasicAccelerateIpEndpointRelationsResponseBody body;

    private ListBasicAccelerateIpEndpointRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBasicAccelerateIpEndpointRelationsResponse create() {
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
    public ListBasicAccelerateIpEndpointRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBasicAccelerateIpEndpointRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBasicAccelerateIpEndpointRelationsResponseBody body);

        @Override
        ListBasicAccelerateIpEndpointRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBasicAccelerateIpEndpointRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBasicAccelerateIpEndpointRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBasicAccelerateIpEndpointRelationsResponse response) {
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
        public Builder body(ListBasicAccelerateIpEndpointRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBasicAccelerateIpEndpointRelationsResponse build() {
            return new ListBasicAccelerateIpEndpointRelationsResponse(this);
        } 

    } 

}
