// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingPortMappingsByDestinationResponse} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingPortMappingsByDestinationResponse</p>
 */
public class ListCustomRoutingPortMappingsByDestinationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCustomRoutingPortMappingsByDestinationResponseBody body;

    private ListCustomRoutingPortMappingsByDestinationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCustomRoutingPortMappingsByDestinationResponse create() {
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
    public ListCustomRoutingPortMappingsByDestinationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCustomRoutingPortMappingsByDestinationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCustomRoutingPortMappingsByDestinationResponseBody body);

        @Override
        ListCustomRoutingPortMappingsByDestinationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCustomRoutingPortMappingsByDestinationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCustomRoutingPortMappingsByDestinationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCustomRoutingPortMappingsByDestinationResponse response) {
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
        public Builder body(ListCustomRoutingPortMappingsByDestinationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCustomRoutingPortMappingsByDestinationResponse build() {
            return new ListCustomRoutingPortMappingsByDestinationResponse(this);
        } 

    } 

}
