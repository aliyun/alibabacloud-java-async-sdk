// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointServicesResponse} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServicesResponse</p>
 */
public class ListVpcEndpointServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVpcEndpointServicesResponseBody body;

    private ListVpcEndpointServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVpcEndpointServicesResponse create() {
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
    public ListVpcEndpointServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVpcEndpointServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVpcEndpointServicesResponseBody body);

        @Override
        ListVpcEndpointServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVpcEndpointServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVpcEndpointServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVpcEndpointServicesResponse response) {
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
        public Builder body(ListVpcEndpointServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVpcEndpointServicesResponse build() {
            return new ListVpcEndpointServicesResponse(this);
        } 

    } 

}
