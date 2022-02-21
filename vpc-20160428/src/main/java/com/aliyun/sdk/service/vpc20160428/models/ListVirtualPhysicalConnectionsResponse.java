// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVirtualPhysicalConnectionsResponse} extends {@link TeaModel}
 *
 * <p>ListVirtualPhysicalConnectionsResponse</p>
 */
public class ListVirtualPhysicalConnectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVirtualPhysicalConnectionsResponseBody body;

    private ListVirtualPhysicalConnectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVirtualPhysicalConnectionsResponse create() {
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
    public ListVirtualPhysicalConnectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVirtualPhysicalConnectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVirtualPhysicalConnectionsResponseBody body);

        @Override
        ListVirtualPhysicalConnectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVirtualPhysicalConnectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVirtualPhysicalConnectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVirtualPhysicalConnectionsResponse response) {
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
        public Builder body(ListVirtualPhysicalConnectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVirtualPhysicalConnectionsResponse build() {
            return new ListVirtualPhysicalConnectionsResponse(this);
        } 

    } 

}
