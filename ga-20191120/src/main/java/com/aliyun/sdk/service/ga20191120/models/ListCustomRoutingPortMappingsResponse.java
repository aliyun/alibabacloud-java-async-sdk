// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingPortMappingsResponse} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingPortMappingsResponse</p>
 */
public class ListCustomRoutingPortMappingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCustomRoutingPortMappingsResponseBody body;

    private ListCustomRoutingPortMappingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCustomRoutingPortMappingsResponse create() {
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
    public ListCustomRoutingPortMappingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCustomRoutingPortMappingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCustomRoutingPortMappingsResponseBody body);

        @Override
        ListCustomRoutingPortMappingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCustomRoutingPortMappingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCustomRoutingPortMappingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCustomRoutingPortMappingsResponse response) {
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
        public Builder body(ListCustomRoutingPortMappingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCustomRoutingPortMappingsResponse build() {
            return new ListCustomRoutingPortMappingsResponse(this);
        } 

    } 

}
